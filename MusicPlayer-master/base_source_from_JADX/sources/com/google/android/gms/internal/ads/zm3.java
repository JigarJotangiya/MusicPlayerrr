package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zm3 {

    /* renamed from: a */
    static final Charset f26835a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f26836b;

    /* renamed from: c */
    public static final ByteBuffer f26837c;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f26836b = bArr;
        f26837c = ByteBuffer.wrap(bArr);
        int i = sl3.f23542e;
        sl3.m30776g(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m34696a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m34697b(byte[] bArr) {
        int length = bArr.length;
        int d = m34699d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m34698c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m34699d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static <T> T m34700e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    static <T> T m34701f(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: g */
    static Object m34702g(Object obj, Object obj2) {
        yn3 h = ((zn3) obj).mo20472h();
        h.mo21301Y((zn3) obj2);
        return h.mo19755Q();
    }

    /* renamed from: h */
    public static String m34703h(byte[] bArr) {
        return new String(bArr, f26835a);
    }

    /* renamed from: i */
    public static boolean m34704i(byte[] bArr) {
        return aq3.m20921i(bArr);
    }
}
