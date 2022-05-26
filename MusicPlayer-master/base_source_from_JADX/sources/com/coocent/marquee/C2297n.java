package com.coocent.marquee;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.Window;
import com.un4seen.bass.BASS;
import java.lang.reflect.Method;

/* renamed from: com.coocent.marquee.n */
/* compiled from: MarqueeSystemBarUtil */
public class C2297n {
    static {
        Color.parseColor("#424242");
    }

    /* renamed from: a */
    public static void m10664a(Activity activity) {
        Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(1536);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            if (i >= 29) {
                window.setNavigationBarContrastEnforced(false);
                window.setStatusBarContrastEnforced(false);
            }
        } else if (i >= 19) {
            window.addFlags(BASS.BASS_SPEAKER_REAR2);
            window.addFlags(134217728);
        }
    }

    /* renamed from: b */
    public static void m10665b(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (z) {
            window.getDecorView().setSystemUiVisibility(1792);
        } else {
            window.getDecorView().setSystemUiVisibility(9744);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            if (i >= 29) {
                window.setNavigationBarContrastEnforced(false);
                window.setStatusBarContrastEnforced(false);
            }
        } else if (i >= 19) {
            window.addFlags(BASS.BASS_SPEAKER_REAR2);
            window.addFlags(134217728);
        }
        m10666c(activity, z);
    }

    /* renamed from: c */
    private static void m10666c(Activity activity, boolean z) {
        if (Build.BRAND.equals("Xiaomi")) {
            try {
                Class<?> cls = activity.getWindow().getClass();
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", new Class[]{cls3, cls3});
                Window window = activity.getWindow();
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(!z ? i : 0);
                objArr[1] = Integer.valueOf(i);
                method.invoke(window, objArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m10667d(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (z) {
            window.getDecorView().setSystemUiVisibility(1792);
        } else {
            window.getDecorView().setSystemUiVisibility(9744);
        }
        m10666c(activity, z);
    }
}
