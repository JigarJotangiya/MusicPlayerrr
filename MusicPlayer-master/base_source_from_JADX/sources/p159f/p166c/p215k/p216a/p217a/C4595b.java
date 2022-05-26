package p159f.p166c.p215k.p216a.p217a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import java.util.Objects;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.k.a.a.b */
/* compiled from: MeizuUtils.kt */
public final class C4595b {

    /* renamed from: a */
    public static final C4596a f13301a = new C4596a((C8589g) null);

    /* renamed from: f.c.k.a.a.b$a */
    /* compiled from: MeizuUtils.kt */
    public static final class C4596a {
        private C4596a() {
        }

        public /* synthetic */ C4596a(C8589g gVar) {
            this();
        }

        @TargetApi(19)
        /* renamed from: c */
        private final boolean m20026c(Context context, int i) {
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
                    Log.e("MeizuUtils", Log.getStackTraceString(e));
                }
            } else {
                Log.e("MeizuUtils", "Below API 19 cannot invoke!");
                return false;
            }
        }

        /* renamed from: a */
        public final void mo15341a(Activity activity) {
            Intent intent;
            C8594l.m46771e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 23) {
                Uri fromParts = Uri.fromParts("package", activity.getPackageName(), (String) null);
                intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                intent.setData(fromParts);
            } else {
                intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent.setClassName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity");
                intent.putExtra("packageName", activity.getPackageName());
            }
            activity.startActivityForResult(intent, 1);
        }

        /* renamed from: b */
        public final boolean mo15342b(Context context) {
            C8594l.m46771e(context, "context");
            if (Build.VERSION.SDK_INT >= 19) {
                return m20026c(context, 24);
            }
            return true;
        }
    }
}
