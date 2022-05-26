package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t53 {
    /* renamed from: a */
    static Object m31104a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    static Object[] m31105b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m31104a(objArr[i2], i2);
        }
        return objArr;
    }
}
