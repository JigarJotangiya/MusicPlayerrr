package p159f.p166c.p176c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.util.Log;

/* renamed from: f.c.c.d */
/* compiled from: MiuiUtils */
public class C4337d {
    /* renamed from: a */
    public static void m18932a(Activity activity) {
        int d = m18935d();
        if (d == 5) {
            m18936e(activity);
        } else if (d == 6) {
            m18937f(activity);
        } else if (d == 7) {
            m18938g(activity);
        } else if (d == 8) {
            m18939h(activity);
        } else if (d == 9) {
            m18939h(activity);
        } else {
            Log.e("MiuiUtils", "this is a special MIUI rom version, its version code " + d);
        }
    }

    /* renamed from: b */
    public static boolean m18933b(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return m18934c(context, 24);
        }
        return true;
    }

    @TargetApi(19)
    /* renamed from: c */
    private static boolean m18934c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Class<AppOpsManager> cls = AppOpsManager.class;
            try {
                Class cls2 = Integer.TYPE;
                if (((Integer) cls.getDeclaredMethod("checkOp", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName()})).intValue() == 0) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                Log.e("MiuiUtils", Log.getStackTraceString(e));
            }
        } else {
            Log.e("MiuiUtils", "Below API 19 cannot invoke!");
            return false;
        }
    }

    /* renamed from: d */
    public static int m18935d() {
        String f = C4340g.m18950f("ro.miui.ui.version.name");
        if (f == null) {
            return -1;
        }
        try {
            return Integer.parseInt(f.substring(1));
        } catch (Exception e) {
            Log.e("MiuiUtils", "get miui version code error, version : " + f);
            Log.e("MiuiUtils", Log.getStackTraceString(e));
            return -1;
        }
    }

    /* renamed from: e */
    public static void m18936e(Activity activity) {
        String packageName = activity.getPackageName();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", packageName, (String) null));
        if (m18940i(intent, activity)) {
            activity.startActivityForResult(intent, 1);
        } else {
            Log.e("MiuiUtils", "intent is not available!");
        }
    }

    /* renamed from: f */
    public static void m18937f(Activity activity) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
        intent.putExtra("extra_pkgname", activity.getPackageName());
        if (m18940i(intent, activity)) {
            activity.startActivityForResult(intent, 1);
        } else {
            Log.e("MiuiUtils", "Intent is not available!");
        }
    }

    /* renamed from: g */
    public static void m18938g(Activity activity) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
        intent.putExtra("extra_pkgname", activity.getPackageName());
        if (m18940i(intent, activity)) {
            activity.startActivityForResult(intent, 1);
        } else {
            Log.e("MiuiUtils", "Intent is not available!");
        }
    }

    /* renamed from: h */
    public static void m18939h(Activity activity) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
        intent.putExtra("extra_pkgname", activity.getPackageName());
        if (m18940i(intent, activity)) {
            activity.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent2.setPackage("com.miui.securitycenter");
        intent2.putExtra("extra_pkgname", activity.getPackageName());
        if (m18940i(intent2, activity)) {
            activity.startActivityForResult(intent2, 1);
        } else {
            Log.e("MiuiUtils", "Intent is not available!");
        }
    }

    /* renamed from: i */
    private static boolean m18940i(Intent intent, Context context) {
        return intent != null && context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
