package p159f.p166c.p176c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

/* renamed from: f.c.c.c */
/* compiled from: MeizuUtils */
public class C4336c {
    /* renamed from: a */
    public static void m18929a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            Uri fromParts = Uri.fromParts("package", activity.getPackageName(), (String) null);
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(fromParts);
            activity.startActivityForResult(intent, 1);
            return;
        }
        try {
            Intent intent2 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent2.putExtra("packageName", activity.getPackageName());
            intent2.setFlags(268435456);
            activity.startActivityForResult(intent2, 1);
        } catch (Exception unused) {
            try {
                Intent intent3 = new Intent(Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION").get((Object) null).toString());
                intent3.setFlags(268435456);
                intent3.setData(Uri.parse("package:" + activity.getPackageName()));
                activity.startActivityForResult(intent3, 1);
            } catch (Exception e) {
                Log.e("MeizuUtils", Log.getStackTraceString(e));
            }
        }
    }

    /* renamed from: b */
    public static boolean m18930b(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return m18931c(context, 24);
        }
        return true;
    }

    @TargetApi(19)
    /* renamed from: c */
    private static boolean m18931c(Context context, int i) {
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
                Log.e("MeizuUtils", Log.getStackTraceString(e));
            }
        } else {
            Log.e("MeizuUtils", "Below API 19 cannot invoke!");
            return false;
        }
    }
}
