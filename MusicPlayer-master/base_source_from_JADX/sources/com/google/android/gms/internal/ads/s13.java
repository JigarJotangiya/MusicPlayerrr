package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class s13 {
    /* renamed from: a */
    public static int m30498a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = d23.m22314b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str2 = d23.m22314b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m30499b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m30505h(i, i2, "index"));
    }

    /* renamed from: c */
    public static <T> T m30500c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException((String) obj);
    }

    /* renamed from: d */
    public static <T> T m30501d(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(d23.m22314b(str, obj));
    }

    /* renamed from: e */
    public static void m30502e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: f */
    public static void m30503f(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m30505h(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m30505h(i2, i3, "end index");
            } else {
                str = d23.m22314b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: g */
    public static void m30504g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: h */
    private static String m30505h(int i, int i2, String str) {
        if (i < 0) {
            return d23.m22314b("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return d23.m22314b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
