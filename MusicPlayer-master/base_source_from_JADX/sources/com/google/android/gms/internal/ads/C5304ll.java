package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.ll */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5304ll {
    /* renamed from: a */
    public static int m26772a(int i, int i2, int i3) {
        if (i >= 0 && i < i3) {
            return 0;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public static String m26773b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static void m26774c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m26775d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: e */
    public static void m26776e(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public static void m26777f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }
}
