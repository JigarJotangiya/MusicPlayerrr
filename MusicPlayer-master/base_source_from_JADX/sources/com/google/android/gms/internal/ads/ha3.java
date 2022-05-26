package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ha3 {

    /* renamed from: a */
    private final rh3 f17592a;

    private ha3(rh3 rh3) {
        this.f17592a = rh3;
    }

    /* renamed from: d */
    public static ha3 m24748d(String str, byte[] bArr, int i) {
        qh3 D = rh3.m30131D();
        D.mo20451r(str);
        D.mo20452s(kl3.zzv(bArr));
        int i2 = i - 1;
        D.mo20453t(i2 != 0 ? i2 != 1 ? 5 : 4 : 3);
        return new ha3((rh3) D.mo19761n());
    }

    /* renamed from: a */
    public final String mo18117a() {
        return this.f17592a.mo20662H();
    }

    /* renamed from: b */
    public final byte[] mo18118b() {
        return this.f17592a.mo20661G().zzE();
    }

    /* renamed from: c */
    public final int mo18119c() {
        int K = this.f17592a.mo20663K() - 2;
        int i = 1;
        if (K != 1) {
            i = 2;
            if (K != 2) {
                i = 3;
                if (K != 3) {
                    if (K == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
