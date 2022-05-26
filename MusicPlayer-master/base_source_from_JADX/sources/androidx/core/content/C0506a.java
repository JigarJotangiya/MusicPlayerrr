package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import androidx.core.content.p003d.C0524f;
import java.io.File;

/* renamed from: androidx.core.content.a */
/* compiled from: ContextCompat */
public class C0506a {

    /* renamed from: a */
    private static final Object f2692a = new Object();

    /* renamed from: b */
    private static TypedValue f2693b;

    /* renamed from: androidx.core.content.a$a */
    /* compiled from: ContextCompat */
    static class C0507a {
        /* renamed from: a */
        static void m3158a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m3159b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    /* compiled from: ContextCompat */
    static class C0508b {
        /* renamed from: a */
        static File[] m3160a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m3161b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m3162c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    /* compiled from: ContextCompat */
    static class C0509c {
        /* renamed from: a */
        static File m3163a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m3164b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m3165c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    /* compiled from: ContextCompat */
    static class C0510d {
        /* renamed from: a */
        static int m3166a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static ColorStateList m3167b(Context context, int i) {
            return context.getColorStateList(i);
        }

        /* renamed from: c */
        static <T> T m3168c(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: d */
        static String m3169d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    /* compiled from: ContextCompat */
    static class C0511e {
        /* renamed from: a */
        static ComponentName m3170a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: a */
    public static int m3149a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static int m3150b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0510d.m3166a(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: c */
    public static ColorStateList m3151c(Context context, int i) {
        return C0524f.m3224e(context.getResources(), i, context.getTheme());
    }

    /* renamed from: d */
    public static Drawable m3152d(Context context, int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return C0509c.m3164b(context, i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f2692a) {
            if (f2693b == null) {
                f2693b = new TypedValue();
            }
            context.getResources().getValue(i, f2693b, true);
            i2 = f2693b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: e */
    public static File[] m3153e(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0508b.m3160a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: f */
    public static File[] m3154f(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0508b.m3161b(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: g */
    public static boolean m3155g(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0507a.m3158a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: h */
    public static void m3156h(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0507a.m3159b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: i */
    public static void m3157i(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0511e.m3170a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
