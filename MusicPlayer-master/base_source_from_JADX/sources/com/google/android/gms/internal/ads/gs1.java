package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gs1 {
    /* renamed from: a */
    public static int m24483a(int i, int i2, int i3) {
        if (i >= 0 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public static <T> T m24484b(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public static String m24485c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static void m24486d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m24487e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m24488f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
