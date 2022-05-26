package p159f.p166c.p215k.p216a.p217a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import java.util.Objects;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.k.a.a.d */
/* compiled from: QikuUtils.kt */
public final class C4599d {

    /* renamed from: a */
    public static final C4600a f13303a = new C4600a((C8589g) null);

    /* renamed from: f.c.k.a.a.d$a */
    /* compiled from: QikuUtils.kt */
    public static final class C4600a {
        private C4600a() {
        }

        public /* synthetic */ C4600a(C8589g gVar) {
            this();
        }

        @TargetApi(19)
        /* renamed from: c */
        private final boolean m20038c(Context context, int i) {
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
                    Log.e("QikuUtils", Log.getStackTraceString(e));
                }
            } else {
                Log.e(BuildConfig.FLAVOR, "Below API 19 cannot invoke!");
                return false;
            }
        }

        /* renamed from: d */
        private final boolean m20039d(Intent intent, Context context) {
            return intent != null && context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
        }

        /* renamed from: a */
        public final void mo15345a(Activity activity) {
            C8594l.m46771e(activity, "activity");
            Intent intent = new Intent();
            intent.setClassName("com.android.settings", "com.android.settings.Settings$OverlaySettingsActivity");
            if (m20039d(intent, activity)) {
                activity.startActivity(intent);
                return;
            }
            intent.setClassName("com.qihoo360.mobilesafe", "com.qihoo360.mobilesafe.ui.index.AppEnterActivity");
            if (m20039d(intent, activity)) {
                activity.startActivityForResult(intent, 1);
            } else {
                Log.e("QikuUtils", "can't open permission page with particular name, please use \"adb shell dumpsys activity\" command and tell me the name of the float window permission page");
            }
        }

        /* renamed from: b */
        public final boolean mo15346b(Context context) {
            C8594l.m46771e(context, "context");
            if (Build.VERSION.SDK_INT >= 19) {
                return m20038c(context, 24);
            }
            return true;
        }
    }
}
