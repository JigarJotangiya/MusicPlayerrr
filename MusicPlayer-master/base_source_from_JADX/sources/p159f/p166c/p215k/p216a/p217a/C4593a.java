package p159f.p166c.p215k.p216a.p217a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p190b.C4452f;
import p159f.p166c.p181e.p182a.p190b.p192i.C4462b;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.k.a.a.a */
/* compiled from: HuaweiUtils.kt */
public final class C4593a {

    /* renamed from: a */
    public static final C4594a f13300a = new C4594a((C8589g) null);

    /* renamed from: f.c.k.a.a.a$a */
    /* compiled from: HuaweiUtils.kt */
    public static final class C4594a {
        private C4594a() {
        }

        public /* synthetic */ C4594a(C8589g gVar) {
            this();
        }

        @TargetApi(19)
        /* renamed from: c */
        private final boolean m20023c(Context context, int i) {
            if (Build.VERSION.SDK_INT >= 19) {
                Object systemService = context.getSystemService("appops");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
                AppOpsManager appOpsManager = (AppOpsManager) systemService;
                Class<AppOpsManager> cls = AppOpsManager.class;
                try {
                    Class cls2 = Integer.TYPE;
                    Object invoke = cls.getDeclaredMethod("checkOp", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName()});
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    } else if (((Integer) invoke).intValue() == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } catch (Exception e) {
                    Log.e("HuaweiUtils", Log.getStackTraceString(e));
                }
            } else {
                Log.e("HuaweiUtils", "Below API 19 cannot invoke!");
                return false;
            }
        }

        /* renamed from: a */
        public final void mo15339a(Activity activity) {
            C8594l.m46771e(activity, "activity");
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
                if (C4462b.f13042a.mo15156e() == 3.1d) {
                    activity.startActivityForResult(intent, 1);
                    return;
                }
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.notificationmanager.ui.NotificationManagmentActivity"));
                activity.startActivityForResult(intent, 1);
            } catch (SecurityException e) {
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                activity.startActivityForResult(intent2, 1);
                Log.e("HuaweiUtils", Log.getStackTraceString(e));
            } catch (ActivityNotFoundException e2) {
                Intent intent3 = new Intent();
                intent3.setComponent(new ComponentName("com.Android.settings", "com.android.settings.permission.TabItem"));
                activity.startActivityForResult(intent3, 1);
                e2.printStackTrace();
                Log.e("HuaweiUtils", Log.getStackTraceString(e2));
            } catch (Exception e3) {
                Toast.makeText(activity, C4452f.enter_setting_fail, 1).show();
                Log.e("HuaweiUtils", Log.getStackTraceString(e3));
            }
        }

        /* renamed from: b */
        public final boolean mo15340b(Context context) {
            C8594l.m46771e(context, "context");
            if (Build.VERSION.SDK_INT < 19 || C4462b.f13042a.mo15156e() < 3.0d) {
                return true;
            }
            return m20023c(context, 24);
        }
    }
}
