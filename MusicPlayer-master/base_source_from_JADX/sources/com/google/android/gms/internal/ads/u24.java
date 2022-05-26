package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class u24 implements e24, d24 {

    /* renamed from: g */
    private final e24[] f24158g;

    /* renamed from: h */
    private final IdentityHashMap<u34, Integer> f24159h;

    /* renamed from: i */
    private final ArrayList<e24> f24160i = new ArrayList<>();

    /* renamed from: j */
    private d24 f24161j;

    /* renamed from: k */
    private uj0 f24162k;

    /* renamed from: l */
    private e24[] f24163l;

    /* renamed from: m */
    private w34 f24164m;

    public u24(s14 s14, long[] jArr, e24[] e24Arr, byte... bArr) {
        this.f24158g = e24Arr;
        this.f24164m = new r14(new w34[0]);
        this.f24159h = new IdentityHashMap<>();
        this.f24163l = new e24[0];
        for (int i = 0; i < e24Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f24158g[i] = new s24(e24Arr[i], j);
            }
        }
    }

    /* renamed from: a */
    public final long mo17092a() {
        return this.f24164m.mo17092a();
    }

    /* renamed from: b */
    public final long mo17093b() {
        return this.f24164m.mo17093b();
    }

    /* renamed from: c */
    public final uj0 mo17094c() {
        uj0 uj0 = this.f24162k;
        Objects.requireNonNull(uj0);
        return uj0;
    }

    /* renamed from: d */
    public final boolean mo17095d(long j) {
        if (this.f24160i.isEmpty()) {
            return this.f24164m.mo17095d(j);
        }
        int size = this.f24160i.size();
        for (int i = 0; i < size; i++) {
            this.f24160i.get(i).mo17095d(j);
        }
        return false;
    }

    /* renamed from: e */
    public final void mo17096e(long j) {
        this.f24164m.mo17096e(j);
    }

    /* renamed from: f */
    public final long mo17097f() {
        long j = -9223372036854775807L;
        for (e24 e24 : this.f24163l) {
            long f = e24.mo17097f();
            if (f != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    e24[] e24Arr = this.f24163l;
                    int length = e24Arr.length;
                    int i = 0;
                    while (i < length) {
                        e24 e242 = e24Arr[i];
                        if (e242 == e24) {
                            break;
                        } else if (e242.mo17098g(f) == f) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = f;
                } else if (f != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || e24.mo17098g(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    /* renamed from: g */
    public final long mo17098g(long j) {
        long g = this.f24163l[0].mo17098g(j);
        int i = 1;
        while (true) {
            e24[] e24Arr = this.f24163l;
            if (i >= e24Arr.length) {
                return g;
            }
            if (e24Arr[i].mo17098g(g) == g) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* renamed from: h */
    public final void mo17099h() throws IOException {
        for (e24 h : this.f24158g) {
            h.mo17099h();
        }
    }

    /* renamed from: i */
    public final void mo16828i(e24 e24) {
        this.f24160i.remove(e24);
        if (this.f24160i.isEmpty()) {
            int i = 0;
            for (e24 c : this.f24158g) {
                i += c.mo17094c().f24343a;
            }
            xh0[] xh0Arr = new xh0[i];
            int i2 = 0;
            for (e24 c2 : this.f24158g) {
                uj0 c3 = c2.mo17094c();
                int i3 = c3.f24343a;
                int i4 = 0;
                while (i4 < i3) {
                    xh0Arr[i2] = c3.mo21275b(i4);
                    i4++;
                    i2++;
                }
            }
            this.f24162k = new uj0(xh0Arr);
            d24 d24 = this.f24161j;
            Objects.requireNonNull(d24);
            d24.mo16828i(this);
        }
    }

    /* renamed from: j */
    public final long mo17100j(h44[] h44Arr, boolean[] zArr, u34[] u34Arr, boolean[] zArr2, long j) {
        int length;
        Integer num;
        int i;
        h44[] h44Arr2 = h44Arr;
        u34[] u34Arr2 = u34Arr;
        int length2 = h44Arr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = h44Arr2.length;
            if (i2 >= length) {
                break;
            }
            u34 u34 = u34Arr2[i2];
            if (u34 == null) {
                num = null;
            } else {
                num = this.f24159h.get(u34);
            }
            if (num == null) {
                i = -1;
            } else {
                i = num.intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            h44 h44 = h44Arr2[i2];
            if (h44 != null) {
                xh0 d = h44.mo18079d();
                int i3 = 0;
                while (true) {
                    e24[] e24Arr = this.f24158g;
                    if (i3 >= e24Arr.length) {
                        break;
                    } else if (e24Arr[i3].mo17094c().mo21274a(d) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f24159h.clear();
        u34[] u34Arr3 = new u34[length];
        u34[] u34Arr4 = new u34[length];
        h44[] h44Arr3 = new h44[length];
        ArrayList arrayList = new ArrayList(this.f24158g.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f24158g.length) {
            for (int i5 = 0; i5 < h44Arr2.length; i5++) {
                u34Arr4[i5] = iArr[i5] == i4 ? u34Arr2[i5] : null;
                h44Arr3[i5] = iArr2[i5] == i4 ? h44Arr2[i5] : null;
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            u34[] u34Arr5 = u34Arr4;
            h44[] h44Arr4 = h44Arr3;
            long j3 = this.f24158g[i4].mo17100j(h44Arr3, zArr, u34Arr4, zArr2, j2);
            if (i6 == 0) {
                j2 = j3;
            } else if (j3 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < h44Arr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    u34 u342 = u34Arr5[i7];
                    Objects.requireNonNull(u342);
                    u34Arr3[i7] = u342;
                    this.f24159h.put(u342, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (u34Arr5[i7] != null) {
                        z2 = false;
                    }
                    gs1.m24488f(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f24158g[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            u34Arr4 = u34Arr5;
            h44Arr3 = h44Arr4;
        }
        System.arraycopy(u34Arr3, 0, u34Arr2, 0, length);
        e24[] e24Arr2 = (e24[]) arrayList.toArray(new e24[0]);
        this.f24163l = e24Arr2;
        this.f24164m = new r14(e24Arr2);
        return j2;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo19323k(w34 w34) {
        e24 e24 = (e24) w34;
        d24 d24 = this.f24161j;
        Objects.requireNonNull(d24);
        d24.mo19323k(this);
    }

    /* renamed from: l */
    public final boolean mo17101l() {
        return this.f24164m.mo17101l();
    }

    /* renamed from: m */
    public final long mo17102m(long j, ou3 ou3) {
        e24 e24;
        e24[] e24Arr = this.f24163l;
        if (e24Arr.length > 0) {
            e24 = e24Arr[0];
        } else {
            e24 = this.f24158g[0];
        }
        return e24.mo17102m(j, ou3);
    }

    /* renamed from: n */
    public final e24 mo21215n(int i) {
        e24 e24 = this.f24158g[i];
        return e24 instanceof s24 ? ((s24) e24).f23320g : e24;
    }

    /* renamed from: o */
    public final void mo17103o(long j, boolean z) {
        for (e24 o : this.f24163l) {
            o.mo17103o(j, false);
        }
    }

    /* renamed from: q */
    public final void mo17104q(d24 d24, long j) {
        this.f24161j = d24;
        Collections.addAll(this.f24160i, this.f24158g);
        for (e24 q : this.f24158g) {
            q.mo17104q(this, j);
        }
    }
}
