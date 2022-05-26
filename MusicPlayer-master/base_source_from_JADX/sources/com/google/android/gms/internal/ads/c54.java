package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c54 {

    /* renamed from: a */
    public final int f14829a;

    /* renamed from: b */
    public final nu3[] f14830b;

    /* renamed from: c */
    public final au0 f14831c;

    /* renamed from: d */
    public final Object f14832d;

    /* renamed from: e */
    public final h44[] f14833e;

    public c54(nu3[] nu3Arr, h44[] h44Arr, au0 au0, Object obj, byte[] bArr) {
        this.f14830b = nu3Arr;
        this.f14833e = (h44[]) h44Arr.clone();
        this.f14831c = au0;
        this.f14832d = obj;
        this.f14829a = nu3Arr.length;
    }

    /* renamed from: a */
    public final boolean mo16502a(c54 c54, int i) {
        if (c54 != null && wy2.m33453p(this.f14830b[i], c54.f14830b[i]) && wy2.m33453p(this.f14833e[i], c54.f14833e[i])) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo16503b(int i) {
        return this.f14830b[i] != null;
    }
}
