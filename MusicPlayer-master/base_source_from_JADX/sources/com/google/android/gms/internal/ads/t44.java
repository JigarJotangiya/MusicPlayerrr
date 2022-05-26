package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t44 implements Comparable<t44> {

    /* renamed from: g */
    public final boolean f23749g;

    /* renamed from: h */
    private final boolean f23750h;

    /* renamed from: i */
    private final boolean f23751i;

    /* renamed from: j */
    private final boolean f23752j;

    /* renamed from: k */
    private final int f23753k;

    /* renamed from: l */
    private final int f23754l;

    /* renamed from: m */
    private final int f23755m;

    /* renamed from: n */
    private final int f23756n;

    /* renamed from: o */
    private final boolean f23757o;

    public t44(C5689w wVar, o44 o44, int i, String str) {
        g43<String> g43;
        int i2;
        boolean z = false;
        this.f23750h = v44.m32159m(i, false);
        int i3 = wVar.f25125d;
        int i4 = o44.f20920z;
        this.f23751i = 1 == (i3 & 1);
        this.f23752j = (i3 & 2) != 0;
        if (o44.f26483r.isEmpty()) {
            g43 = g43.zzp(BuildConfig.FLAVOR);
        } else {
            g43 = o44.f26483r;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= g43.size()) {
                i5 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            boolean z2 = o44.f26485t;
            i2 = v44.m32155g(wVar, g43.get(i5), false);
            if (i2 > 0) {
                break;
            }
            i5++;
        }
        this.f23753k = i5;
        this.f23754l = i2;
        int i6 = wVar.f25126e;
        int i7 = o44.f26484s;
        int bitCount = Integer.bitCount(0);
        this.f23755m = bitCount;
        int i8 = wVar.f25126e;
        this.f23757o = false;
        int g = v44.m32155g(wVar, str, v44.m32158k(str) == null);
        this.f23756n = g;
        if (i2 > 0 || ((o44.f26483r.isEmpty() && bitCount > 0) || this.f23751i || (this.f23752j && g > 0))) {
            z = true;
        }
        this.f23749g = z;
    }

    /* renamed from: c */
    public final int compareTo(t44 t44) {
        u53 u53;
        v33 d = v33.m32138i().mo20765d(this.f23750h, t44.f23750h).mo20764c(Integer.valueOf(this.f23753k), Integer.valueOf(t44.f23753k), u53.zzc().zza()).mo20763b(this.f23754l, t44.f23754l).mo20763b(this.f23755m, t44.f23755m).mo20765d(this.f23751i, t44.f23751i);
        Boolean valueOf = Boolean.valueOf(this.f23752j);
        Boolean valueOf2 = Boolean.valueOf(t44.f23752j);
        if (this.f23754l == 0) {
            u53 = u53.zzc();
        } else {
            u53 = u53.zzc().zza();
        }
        v33 b = d.mo20764c(valueOf, valueOf2, u53).mo20763b(this.f23756n, t44.f23756n);
        if (this.f23755m == 0) {
            boolean z = t44.f23757o;
            b = b.mo20766e(false, false);
        }
        return b.mo20762a();
    }
}
