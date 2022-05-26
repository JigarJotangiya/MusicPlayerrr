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
import p159f.p166c.p181e.p182a.p190b.p192i.C4462b;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.k.a.a.c */
/* compiled from: MiuiUtils.kt */
public final class C4597c {

    /* renamed from: a */
    public static final C4598a f13302a = new C4598a((C8589g) null);

    /* renamed from: f.c.k.a.a.c$a */
    /* compiled from: MiuiUtils.kt */
    public static final class C4598a {
        private C4598a() {
        }

        public /* synthetic */ C4598a(C8589g gVar) {
            this();
        }

        @TargetApi(19)
        /* renamed from: c */
        private final boolean m20029c(Context context, int i) {
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
                    Log.e("MiuiUtils", Log.getStackTraceString(e));
                }
            } else {
                Log.e("MiuiUtils", "Below API 19 cannot invoke!");
                return false;
            }
        }

        /* renamed from: d */
        private final int m20030d() {
            String f = C4462b.f13042a.mo15157f("ro.miui.ui.version.name");
            if (f == null) {
                return -1;
            }
            try {
                String substring = f.substring(1);
                C8594l.m46770d(substring, "(this as java.lang.String).substring(startIndex)");
                return Integer.parseInt(substring);
            } catch (Exception e) {
                Log.e("MiuiUtils", C8594l.m46777k("get miui version code error, version : ", f));
                Log.e("MiuiUtils", Log.getStackTraceString(e));
                return -1;
            }
        }

        /* renamed from: e */
        private final void m20031e(Activity activity) {
            String packageName = activity.getPackageName();
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", packageName, (String) null));
            if (m20035i(intent, activity)) {
                activity.startActivityForResult(intent, 1);
            } else {
                Log.e("MiuiUtils", "intent is not available!");
            }
        }

        /* renamed from: f */
        private final void m20032f(Activity activity) {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent.putExtra("extra_pkgname", activity.getPackageName());
            if (m20035i(intent, activity)) {
                activity.startActivityForResult(intent, 1);
            } else {
                Log.e("MiuiUtils", "Intent is not available!");
            }
        }

        /* renamed from: g */
        private final void m20033g(Activity activity) {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent.putExtra("extra_pkgname", activity.getPackageName());
            if (m20035i(intent, activity)) {
                activity.startActivityForResult(intent, 1);
            } else {
                Log.e("MiuiUtils", "Intent is not available!");
            }
        }

        /* renamed from: h */
        private final void m20034h(Activity activity) {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            intent.putExtra("extra_pkgname", activity.getPackageName());
            if (m20035i(intent, activity)) {
                activity.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent2.setPackage("com.miui.securitycenter");
            intent2.putExtra("extra_pkgname", activity.getPackageName());
            if (m20035i(intent2, activity)) {
                activity.startActivityForResult(intent2, 1);
            } else {
                Log.e("MiuiUtils", "Intent is not available!");
            }
        }

        /* renamed from: i */
        private final boolean m20035i(Intent intent, Context context) {
            return intent != null && context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
        }

        /* renamed from: a */
        public final void mo15343a(Activity activity) {
            C8594l.m46771e(activity, "activity");
            int d = m20030d();
            switch (d) {
                case 5:
                    m20031e(activity);
                    return;
                case 6:
                    m20032f(activity);
                    return;
                case 7:
                    m20033g(activity);
                    return;
                case 8:
                    m20034h(activity);
                    return;
                case 9:
                    m20034h(activity);
                    return;
                default:
                    Log.e("MiuiUtils", C8594l.m46777k("this is a special MIUI rom version, its version code ", Integer.valueOf(d)));
                    return;
            }
        }

        /* renamed from: b */
        public final boolean mo15344b(Context context) {
            C8594l.m46771e(context, "context");
            if (Build.VERSION.SDK_INT >= 19) {
                return m20029c(context, 24);
            }
            return true;
        }
    }
}
