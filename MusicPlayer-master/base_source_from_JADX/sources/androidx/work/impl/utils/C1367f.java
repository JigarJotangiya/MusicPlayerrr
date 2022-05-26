package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.C1228b;
import androidx.work.C1405l;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.work.impl.utils.f */
/* compiled from: ProcessUtils */
public class C1367f {

    /* renamed from: a */
    private static final String f5370a = C1405l.m7462f("ProcessUtils");

    private C1367f() {
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* renamed from: a */
    public static String m7386a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Application.getProcessName();
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, C1367f.class.getClassLoader());
            if (i >= 18) {
                Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                obj = declaredMethod.invoke((Object) null, new Object[0]);
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("getProcessName", new Class[0]);
                declaredMethod3.setAccessible(true);
                obj = declaredMethod3.invoke(declaredMethod2.invoke((Object) null, new Object[0]), new Object[0]);
            }
            if (obj instanceof String) {
                return (String) obj;
            }
        } catch (Throwable th) {
            C1405l.m7460c().mo6816a(f5370a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m7387b(Context context, C1228b bVar) {
        String a = m7386a(context);
        if (!TextUtils.isEmpty(bVar.mo6459c())) {
            return TextUtils.equals(a, bVar.mo6459c());
        }
        return TextUtils.equals(a, context.getApplicationInfo().processName);
    }
}
