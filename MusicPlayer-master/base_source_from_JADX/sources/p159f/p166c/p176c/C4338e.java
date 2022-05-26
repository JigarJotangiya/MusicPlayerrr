package p159f.p166c.p176c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.c.e */
/* compiled from: QikuUtils */
public class C4338e {
    /* renamed from: a */
    public static void m18941a(Activity activity) {
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.Settings$OverlaySettingsActivity");
        if (m18944d(intent, activity)) {
            activity.startActivity(intent);
            return;
        }
        intent.setClassName("com.qihoo360.mobilesafe", "com.qihoo360.mobilesafe.ui.index.AppEnterActivity");
        if (m18944d(intent, activity)) {
            activity.startActivityForResult(intent, 1);
        } else {
            Log.e("QikuUtils", "can't open permission page with particular name, please use \"adb shell dumpsys activity\" command and tell me the name of the float window permission page");
        }
    }

    /* renamed from: b */
    public static boolean m18942b(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return m18943c(context, 24);
        }
        return true;
    }

    @TargetApi(19)
    /* renamed from: c */
    private static boolean m18943c(Context context, int i) {
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
                Log.e("QikuUtils", Log.getStackTraceString(e));
            }
        } else {
            Log.e(BuildConfig.FLAVOR, "Below API 19 cannot invoke!");
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m18944d(Intent intent, Context context) {
        return intent != null && context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
