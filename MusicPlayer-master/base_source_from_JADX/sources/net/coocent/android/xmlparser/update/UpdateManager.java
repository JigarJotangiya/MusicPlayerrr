package net.coocent.android.xmlparser.update;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.appcompat.app.C0133c;
import androidx.lifecycle.C0672f0;
import androidx.lifecycle.LiveData;
import com.google.android.play.core.appupdate.C6286a;
import com.google.android.play.core.appupdate.C6288b;
import com.google.android.play.core.appupdate.C6290c;
import com.google.android.play.core.appupdate.C6292d;
import com.google.android.play.core.install.C6461b;
import com.google.android.play.core.install.InstallState;
import java.lang.ref.WeakReference;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.p461z.C9566f;
import net.coocent.android.xmlparser.widget.dialog.DialogHelper;
import p159f.p243f.p245b.p318c.p319a.p323d.C7632e;
import p391j.p392a.p393a.C8616i;

public class UpdateManager {
    private static final int REQUEST_CODE_FLEXIBLE_UPDATE = 4396;
    private static final int REQUEST_CODE_IMMEDIATE_UPDATE = 4397;
    /* access modifiers changed from: private */
    public static boolean mDownloadCompletedDialogShowed = false;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void mo32720b(C7632e eVar, Activity activity, C6288b bVar, C7632e eVar2) {
        if (eVar2.mo28625g() && eVar.mo28623e() != null && ((C6286a) eVar.mo28623e()).mo25143a() == 11) {
            showDownloadCompletedDialog(activity, bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void mo32724d(boolean z, Activity activity, boolean z2, C6288b bVar, int i, boolean z3, C7632e eVar) {
        if (eVar.mo28625g()) {
            C6286a aVar = (C6286a) eVar.mo28623e();
            if (!z2 && aVar.mo25143a() == 11) {
                showDownloadCompletedDialog(activity, bVar);
            } else if (aVar.mo25146d() == 2 || aVar.mo25146d() == 3) {
                if (z2) {
                    showInAppUpdate(activity, bVar, aVar, 1, i);
                } else if (z3) {
                    showInAppUpdate(activity, bVar, aVar, 0, i);
                } else {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
                    int i2 = defaultSharedPreferences.getInt("update_list_show_count", 0);
                    if (i2 % 4 == 0) {
                        showInAppUpdate(activity, bVar, aVar, 0, i);
                    } else if (i2 < 9) {
                        defaultSharedPreferences.edit().putInt("update_list_show_count", i2 + 1).apply();
                    }
                }
            } else if (aVar.mo25146d() == 1 && z) {
                Toast.makeText(activity, C8616i.up_to_date, 0).show();
            }
        } else if (z) {
            Toast.makeText(activity, C8616i.up_to_date, 0).show();
        }
    }

    /* access modifiers changed from: private */
    public void inAppUpdate(Activity activity, boolean z, boolean z2, boolean z3, int i) {
        if (activity != null) {
            final WeakReference weakReference = new WeakReference(activity);
            final C6288b a = C6290c.m37496a(activity);
            if (!z) {
                a.mo25157c(new C6461b() {
                    public void onStateUpdate(InstallState installState) {
                        if (installState.mo25387c() == 11) {
                            UpdateManager.this.showDownloadCompletedDialog((Activity) weakReference.get(), a);
                            a.mo25160f(this);
                        } else if (installState.mo25387c() == 6 || installState.mo25387c() == 5 || installState.mo25386b() != 0) {
                            a.mo25160f(this);
                        }
                    }
                });
            }
            a.mo25156b().mo28619a(new C9498b(this, z3, activity, z, a, i, z2));
        }
    }

    /* access modifiers changed from: private */
    public void showDownloadCompletedDialog(Activity activity, C6288b bVar) {
        if (activity != null && !activity.isFinishing() && bVar != null && !mDownloadCompletedDialogShowed) {
            C0133c d = DialogHelper.m50003d(activity, bVar);
            d.setCanceledOnTouchOutside(false);
            d.setOnCancelListener(C9499c.f36487g);
            d.setOnDismissListener(C9497a.f36479g);
            d.show();
            mDownloadCompletedDialogShowed = true;
        }
    }

    private void showInAppUpdate(Activity activity, C6288b bVar, C6286a aVar, int i, int i2) {
        if (!aVar.mo25144b(i)) {
            return;
        }
        if (i2 > Integer.MIN_VALUE) {
            try {
                bVar.mo25159e(aVar, i, activity, i2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            bVar.mo25158d(aVar, activity, C6292d.m37500d(i).mo25163a());
        }
    }

    /* access modifiers changed from: private */
    public void showUpdateDialog(Activity activity, UpdateResult updateResult) {
        if (activity != null && !activity.isFinishing()) {
            C0133c c = DialogHelper.m50002c(activity, updateResult);
            c.setCanceledOnTouchOutside(false);
            c.show();
        }
    }

    public void checkForUpdate(final Activity activity) {
        if (activity != null) {
            if (!(activity.getApplication() instanceof AbstractApplication) || TextUtils.isEmpty(((AbstractApplication) activity.getApplication()).mo32496i())) {
                inAppUpdate(activity, false, false, false, REQUEST_CODE_FLEXIBLE_UPDATE);
                return;
            }
            final LiveData<UpdateResult> updateResult = new UpdateSource(activity).getUpdateResult(((AbstractApplication) activity.getApplication()).mo32496i());
            updateResult.mo4150i(new C0672f0<UpdateResult>() {
                public void onChanged(UpdateResult updateResult) {
                    if (updateResult == null) {
                        UpdateManager.this.inAppUpdate(activity, false, false, false, UpdateManager.REQUEST_CODE_FLEXIBLE_UPDATE);
                    } else if (!TextUtils.isEmpty(updateResult.getNewPackageName())) {
                        UpdateManager.this.showUpdateDialog(activity, updateResult);
                    } else {
                        long d = C9566f.m50193d(activity);
                        if (d >= ((long) updateResult.getMinVersionCode()) || d <= 0) {
                            UpdateManager.this.inAppUpdate(activity, false, false, false, UpdateManager.REQUEST_CODE_FLEXIBLE_UPDATE);
                        } else if (updateResult.isForceUpdate()) {
                            UpdateManager.this.inAppUpdate(activity, true, false, false, UpdateManager.REQUEST_CODE_IMMEDIATE_UPDATE);
                        } else {
                            UpdateManager.this.showUpdateDialog(activity, updateResult);
                        }
                    }
                    updateResult.mo4154m(this);
                }
            });
        }
    }

    public void checkInAppUpdate(Activity activity) {
        inAppUpdate(activity, false, true, true, Integer.MIN_VALUE);
    }

    public void checkInAppUpdateState(Activity activity) {
        if (activity != null) {
            final WeakReference weakReference = new WeakReference(activity);
            final C6288b a = C6290c.m37496a(activity);
            a.mo25157c(new C6461b() {
                public void onStateUpdate(InstallState installState) {
                    if (installState.mo25387c() == 11) {
                        UpdateManager.this.showDownloadCompletedDialog((Activity) weakReference.get(), a);
                        a.mo25160f(this);
                    } else if (installState.mo25387c() == 6 || installState.mo25387c() == 5 || installState.mo25386b() != 0) {
                        a.mo25160f(this);
                    }
                }
            });
            C7632e<C6286a> b = a.mo25156b();
            b.mo28619a(new C9500d(this, b, activity, a));
        }
    }

    public void onActivityResult(Activity activity, int i, int i2) {
        if (i2 == 0 && i == REQUEST_CODE_IMMEDIATE_UPDATE) {
            inAppUpdate(activity, true, false, false, REQUEST_CODE_IMMEDIATE_UPDATE);
        } else if (i == REQUEST_CODE_FLEXIBLE_UPDATE) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
            int i3 = defaultSharedPreferences.getInt("update_list_show_count", 0);
            if (i2 == 0) {
                if (i3 < 9) {
                    defaultSharedPreferences.edit().putInt("update_list_show_count", i3 + 1).apply();
                }
            } else if (i2 == -1) {
                defaultSharedPreferences.edit().putInt("update_list_show_count", 0).apply();
            }
        }
    }
}
