package p082e.p109h.p117n;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: e.h.n.b */
/* compiled from: ICUCompat */
public final class C3682b {

    /* renamed from: a */
    private static Method f11687a;

    /* renamed from: b */
    private static Method f11688b;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                if (cls2 != null) {
                    f11687a = cls2.getMethod("getScript", new Class[]{cls});
                    f11688b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
                }
            } catch (Exception e) {
                f11687a = null;
                f11688b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f11688b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m15785a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f11688b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    /* renamed from: b */
    private static String m15786b(String str) {
        try {
            Method method = f11687a;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: c */
    public static String m15787c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f11688b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        } else {
            String a = m15785a(locale);
            if (a != null) {
                return m15786b(a);
            }
            return null;
        }
    }
}
