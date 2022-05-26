package p082e.p109h.p115l;

import android.os.Build;

/* renamed from: e.h.l.a */
/* compiled from: BuildCompat */
public class C3643a {
    /* renamed from: a */
    protected static boolean m15697a(String str, String str2) {
        if (!"REL".equals(str2) && str2.compareTo(str) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m15698b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m15699c() {
        return Build.VERSION.SDK_INT >= 31 || m15697a("S", Build.VERSION.CODENAME);
    }
}
