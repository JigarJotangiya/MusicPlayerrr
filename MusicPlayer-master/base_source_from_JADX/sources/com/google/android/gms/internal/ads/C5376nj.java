package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.nj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5376nj implements C5265kj, C5228jj {

    /* renamed from: g */
    public final C5265kj[] f20631g;

    /* renamed from: h */
    private final IdentityHashMap<C5709wj, Integer> f20632h = new IdentityHashMap<>();

    /* renamed from: i */
    private C5228jj f20633i;

    /* renamed from: j */
    private int f20634j;

    /* renamed from: k */
    private C4969ck f20635k;

    /* renamed from: l */
    private C5265kj[] f20636l;

    /* renamed from: m */
    private C5821zj f20637m;

    public C5376nj(C5265kj... kjVarArr) {
        this.f20631g = kjVarArr;
    }

    /* renamed from: a */
    public final void mo18641a(C5265kj kjVar) {
        int i = this.f20634j - 1;
        this.f20634j = i;
        if (i <= 0) {
            int i2 = 0;
            for (C5265kj k : this.f20631g) {
                i2 += k.mo17942k().f14995a;
            }
            C4932bk[] bkVarArr = new C4932bk[i2];
            int i3 = 0;
            for (C5265kj k2 : this.f20631g) {
                C4969ck k3 = k2.mo17942k();
                int i4 = k3.f14995a;
                int i5 = 0;
                while (i5 < i4) {
                    bkVarArr[i3] = k3.mo16650b(i5);
                    i5++;
                    i3++;
                }
            }
            this.f20635k = new C4969ck(bkVarArr);
            this.f20633i.mo18641a(this);
        }
    }

    /* renamed from: b */
    public final boolean mo17936b(long j) {
        return this.f20637m.mo17936b(j);
    }

    /* renamed from: d */
    public final long mo17937d() {
        long j = Long.MAX_VALUE;
        for (C5265kj d : this.f20636l) {
            long d2 = d.mo17937d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: e */
    public final long mo17938e() {
        long e = this.f20631g[0].mo17938e();
        int i = 1;
        while (true) {
            C5265kj[] kjVarArr = this.f20631g;
            if (i >= kjVarArr.length) {
                if (e != -9223372036854775807L) {
                    C5265kj[] kjVarArr2 = this.f20636l;
                    int length = kjVarArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        C5265kj kjVar = kjVarArr2[i2];
                        if (kjVar == this.f20631g[0] || kjVar.mo17944m(e) == e) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return e;
            } else if (kjVarArr[i].mo17938e() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    /* renamed from: f */
    public final long mo17939f(C5118gk[] gkVarArr, boolean[] zArr, C5709wj[] wjVarArr, boolean[] zArr2, long j) {
        int length;
        int i;
        C5118gk[] gkVarArr2 = gkVarArr;
        C5709wj[] wjVarArr2 = wjVarArr;
        int length2 = gkVarArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = gkVarArr2.length;
            if (i2 >= length) {
                break;
            }
            C5709wj wjVar = wjVarArr2[i2];
            if (wjVar == null) {
                i = -1;
            } else {
                i = this.f20632h.get(wjVar).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            C5118gk gkVar = gkVarArr2[i2];
            if (gkVar != null) {
                C4932bk d = gkVar.mo17957d();
                int i3 = 0;
                while (true) {
                    C5265kj[] kjVarArr = this.f20631g;
                    if (i3 >= kjVarArr.length) {
                        break;
                    } else if (kjVarArr[i3].mo17942k().mo16649a(d) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f20632h.clear();
        C5709wj[] wjVarArr3 = new C5709wj[length];
        C5709wj[] wjVarArr4 = new C5709wj[length];
        C5118gk[] gkVarArr3 = new C5118gk[length];
        ArrayList arrayList = new ArrayList(this.f20631g.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f20631g.length) {
            for (int i5 = 0; i5 < gkVarArr2.length; i5++) {
                C5118gk gkVar2 = null;
                wjVarArr4[i5] = iArr[i5] == i4 ? wjVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    gkVar2 = gkVarArr2[i5];
                }
                gkVarArr3[i5] = gkVar2;
            }
            int i6 = i4;
            C5118gk[] gkVarArr4 = gkVarArr3;
            ArrayList arrayList2 = arrayList;
            long f = this.f20631g[i4].mo17939f(gkVarArr3, zArr, wjVarArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = f;
            } else if (f != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < gkVarArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    C5304ll.m26776e(wjVarArr4[i7] != null);
                    C5709wj wjVar2 = wjVarArr4[i7];
                    wjVarArr3[i7] = wjVar2;
                    this.f20632h.put(wjVar2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (wjVarArr4[i7] != null) {
                        z2 = false;
                    }
                    C5304ll.m26776e(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f20631g[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            gkVarArr3 = gkVarArr4;
            wjVarArr2 = wjVarArr;
        }
        C5709wj[] wjVarArr5 = wjVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(wjVarArr3, 0, wjVarArr5, 0, length);
        C5265kj[] kjVarArr2 = new C5265kj[arrayList3.size()];
        this.f20636l = kjVarArr2;
        arrayList3.toArray(kjVarArr2);
        this.f20637m = new C5783yi(this.f20636l);
        return j2;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo19147g(C5821zj zjVar) {
        C5265kj kjVar = (C5265kj) zjVar;
        if (this.f20635k != null) {
            this.f20633i.mo19147g(this);
        }
    }

    /* renamed from: i */
    public final void mo17940i(long j) {
        for (C5265kj i : this.f20636l) {
            i.mo17940i(j);
        }
    }

    /* renamed from: k */
    public final C4969ck mo17942k() {
        return this.f20635k;
    }

    /* renamed from: m */
    public final long mo17944m(long j) {
        long m = this.f20636l[0].mo17944m(j);
        int i = 1;
        while (true) {
            C5265kj[] kjVarArr = this.f20636l;
            if (i >= kjVarArr.length) {
                return m;
            }
            if (kjVarArr[i].mo17944m(m) == m) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    /* renamed from: o */
    public final void mo17946o(C5228jj jjVar, long j) {
        this.f20633i = jjVar;
        this.f20634j = r0;
        for (C5265kj o : this.f20631g) {
            o.mo17946o(this, j);
        }
    }

    public final long zza() {
        return this.f20637m.zza();
    }

    public final void zzs() throws IOException {
        for (C5265kj zzs : this.f20631g) {
            zzs.zzs();
        }
    }
}
