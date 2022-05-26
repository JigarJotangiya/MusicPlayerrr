package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sa3<P> {

    /* renamed from: a */
    private final P f23400a;

    /* renamed from: b */
    private final byte[] f23401b;

    /* renamed from: c */
    private final int f23402c;

    /* renamed from: d */
    private final int f23403d;

    sa3(P p, byte[] bArr, int i, int i2, int i3) {
        this.f23400a = p;
        this.f23401b = Arrays.copyOf(bArr, bArr.length);
        this.f23402c = i;
        this.f23403d = i2;
    }

    /* renamed from: a */
    public final P mo20813a() {
        return this.f23400a;
    }

    /* renamed from: b */
    public final byte[] mo20814b() {
        byte[] bArr = this.f23401b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: c */
    public final int mo20815c() {
        return this.f23402c;
    }

    /* renamed from: d */
    public final int mo20816d() {
        return this.f23403d;
    }
}
