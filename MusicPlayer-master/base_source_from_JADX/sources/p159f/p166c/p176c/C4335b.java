package p159f.p166c.p176c;

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

/* renamed from: f.c.c.b */
/* compiled from: HuaweiUtils */
public class C4335b {
    /* renamed from: a */
    public static void m18926a(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
            if (C4340g.m18949e() == 3.1d) {
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
            Toast.makeText(activity, C4339f.enter_setting_fail, 1).show();
            Log.e("HuaweiUtils", Log.getStackTraceString(e3));
        }
    }

    /* renamed from: b */
    public static boolean m18927b(Context context) {
        if (Build.VERSION.SDK_INT < 19 || C4340g.m18949e() < 3.0d) {
            return true;
        }
        return m18928c(context, 24);
    }

    @TargetApi(19)
    /* renamed from: c */
    private static boolean m18928c(Context context, int i) {
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
                Log.e("HuaweiUtils", Log.getStackTraceString(e));
            }
        } else {
            Log.e("HuaweiUtils", "Below API 19 cannot invoke!");
            return false;
        }
    }
}
