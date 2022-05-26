package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k44 implements Comparable<k44> {

    /* renamed from: g */
    public final boolean f18764g;

    /* renamed from: h */
    private final String f18765h;

    /* renamed from: i */
    private final o44 f18766i;

    /* renamed from: j */
    private final boolean f18767j;

    /* renamed from: k */
    private final int f18768k;

    /* renamed from: l */
    private final int f18769l;

    /* renamed from: m */
    private final int f18770m;

    /* renamed from: n */
    private final int f18771n;

    /* renamed from: o */
    private final int f18772o;

    /* renamed from: p */
    private final boolean f18773p;

    /* renamed from: q */
    private final int f18774q;

    /* renamed from: r */
    private final int f18775r;

    /* renamed from: s */
    private final int f18776s;

    /* renamed from: t */
    private final int f18777t;

    public k44(C5689w wVar, o44 o44, int i) {
        int i2;
        int i3;
        int i4;
        this.f18766i = o44;
        this.f18765h = v44.m32158k(wVar.f25124c);
        int i5 = 0;
        this.f18767j = v44.m32159m(i, false);
        int i6 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i6 >= o44.f26478m.size()) {
                i6 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            }
            i3 = v44.m32155g(wVar, o44.f26478m.get(i6), false);
            if (i3 > 0) {
                break;
            }
            i6++;
        }
        this.f18769l = i6;
        this.f18768k = i3;
        int i7 = wVar.f25126e;
        int i8 = o44.f26479n;
        this.f18770m = Integer.bitCount(0);
        this.f18773p = 1 == (wVar.f25125d & 1);
        int i9 = wVar.f25146y;
        this.f18774q = i9;
        this.f18775r = wVar.f25147z;
        int i10 = wVar.f25129h;
        this.f18776s = i10;
        if (i10 != -1) {
            int i11 = o44.f26481p;
        }
        if (i9 != -1) {
            int i12 = o44.f26480o;
        }
        this.f18764g = true;
        String[] C = wy2.m33408C();
        int i13 = 0;
        while (true) {
            if (i13 >= C.length) {
                i13 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = v44.m32155g(wVar, C[i13], false);
            if (i4 > 0) {
                break;
            }
            i13++;
        }
        this.f18771n = i13;
        this.f18772o = i4;
        while (true) {
            if (i5 < o44.f26482q.size()) {
                String str = wVar.f25133l;
                if (str != null && str.equals(o44.f26482q.get(i5))) {
                    i2 = i5;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        this.f18777t = i2;
    }

    /* renamed from: c */
    public final int compareTo(k44 k44) {
        u53 u53;
        if (this.f18767j) {
            u53 = v44.f24579e;
        } else {
            u53 = v44.f24579e.zza();
        }
        v33 b = v33.m32138i().mo20765d(this.f18767j, k44.f18767j).mo20764c(Integer.valueOf(this.f18769l), Integer.valueOf(k44.f18769l), u53.zzc().zza()).mo20763b(this.f18768k, k44.f18768k).mo20763b(this.f18770m, k44.f18770m);
        boolean z = k44.f18764g;
        v33 c = b.mo20765d(true, true).mo20764c(Integer.valueOf(this.f18777t), Integer.valueOf(k44.f18777t), u53.zzc().zza());
        Integer valueOf = Integer.valueOf(this.f18776s);
        Integer valueOf2 = Integer.valueOf(k44.f18776s);
        boolean z2 = this.f18766i.f26486u;
        v33 c2 = c.mo20764c(valueOf, valueOf2, v44.f24580f).mo20765d(this.f18773p, k44.f18773p).mo20764c(Integer.valueOf(this.f18771n), Integer.valueOf(k44.f18771n), u53.zzc().zza()).mo20763b(this.f18772o, k44.f18772o).mo20764c(Integer.valueOf(this.f18774q), Integer.valueOf(k44.f18774q), u53).mo20764c(Integer.valueOf(this.f18775r), Integer.valueOf(k44.f18775r), u53);
        Integer valueOf3 = Integer.valueOf(this.f18776s);
        Integer valueOf4 = Integer.valueOf(k44.f18776s);
        if (!wy2.m33453p(this.f18765h, k44.f18765h)) {
            u53 = v44.f24580f;
        }
        return c2.mo20764c(valueOf3, valueOf4, u53).mo20762a();
    }
}
