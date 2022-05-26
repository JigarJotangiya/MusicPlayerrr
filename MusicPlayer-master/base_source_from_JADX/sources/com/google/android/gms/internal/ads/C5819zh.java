package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.zh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5819zh implements C5447pg, C5669vg {

    /* renamed from: p */
    private static final int f26765p = C4934bm.m21437g("qt  ");

    /* renamed from: a */
    private final C5600tl f26766a = new C5600tl(C5526rl.f22891a);

    /* renamed from: b */
    private final C5600tl f26767b = new C5600tl(4);

    /* renamed from: c */
    private final C5600tl f26768c = new C5600tl(16);

    /* renamed from: d */
    private final Stack<C5226jh> f26769d = new Stack<>();

    /* renamed from: e */
    private int f26770e;

    /* renamed from: f */
    private int f26771f;

    /* renamed from: g */
    private long f26772g;

    /* renamed from: h */
    private int f26773h;

    /* renamed from: i */
    private C5600tl f26774i;

    /* renamed from: j */
    private int f26775j;

    /* renamed from: k */
    private int f26776k;

    /* renamed from: l */
    private C5484qg f26777l;

    /* renamed from: m */
    private C5782yh[] f26778m;

    /* renamed from: n */
    private long f26779n;

    /* renamed from: o */
    private boolean f26780o;

    /* renamed from: g */
    private final void m34601g() {
        this.f26770e = 0;
        this.f26773h = 0;
    }

    /* renamed from: h */
    private final void m34602h(long j) throws C5445pe {
        zzatr zzatr;
        zzatr zzatr2;
        C5558sg sgVar;
        C4930bi a;
        while (!this.f26769d.isEmpty() && this.f26769d.peek().f18485P0 == j) {
            C5226jh pop = this.f26769d.pop();
            if (pop.f19437a == C5300lh.f19349C) {
                ArrayList arrayList = new ArrayList();
                C5558sg sgVar2 = new C5558sg();
                C5263kh e = pop.mo18627e(C5300lh.f19346A0);
                if (e != null) {
                    zzatr = C5559sh.m30714c(e, this.f26780o);
                    if (zzatr != null) {
                        sgVar2.mo20843b(zzatr);
                    }
                } else {
                    zzatr = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < pop.f18487R0.size()) {
                    C5226jh jhVar = pop.f18487R0.get(i);
                    if (jhVar.f19437a == C5300lh.f19353E && (a = C5559sh.m30712a(jhVar, pop.mo18627e(C5300lh.f19351D), -9223372036854775807L, (zzarf) null, this.f26780o)) != null) {
                        C5079fi b = C5559sh.m30713b(a, jhVar.mo18626d(C5300lh.f19355F).mo18626d(C5300lh.f19357G).mo18626d(C5300lh.f19359H), sgVar2);
                        if (b.f16630a != 0) {
                            C5782yh yhVar = new C5782yh(a, b, this.f26777l.mo17943l(i, a.f14466b));
                            zzapg f = a.f14470f.mo22486f(b.f16633d + 30);
                            if (a.f14466b == 1) {
                                if (sgVar2.mo20842a()) {
                                    f = f.mo22484e(sgVar2.f23439a, sgVar2.f23440b);
                                }
                                if (zzatr != null) {
                                    f = f.mo22487g(zzatr);
                                }
                            }
                            yhVar.f26364c.mo21512a(f);
                            sgVar = sgVar2;
                            zzatr2 = zzatr;
                            long max = Math.max(j2, a.f14469e);
                            arrayList.add(yhVar);
                            long j4 = b.f16631b[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            sgVar2 = sgVar;
                            zzatr = zzatr2;
                        }
                    }
                    sgVar = sgVar2;
                    zzatr2 = zzatr;
                    i++;
                    sgVar2 = sgVar;
                    zzatr = zzatr2;
                }
                this.f26779n = j2;
                this.f26778m = (C5782yh[]) arrayList.toArray(new C5782yh[arrayList.size()]);
                this.f26777l.mo17935a();
                this.f26777l.mo17941j(this);
                this.f26769d.clear();
                this.f26770e = 2;
            } else if (!this.f26769d.isEmpty()) {
                this.f26769d.peek().mo18628f(pop);
            }
        }
        if (this.f26770e != 2) {
            m34601g();
        }
    }

    /* renamed from: a */
    public final long mo19724a(long j) {
        long j2 = Long.MAX_VALUE;
        for (C5782yh yhVar : this.f26778m) {
            C5079fi fiVar = yhVar.f26363b;
            int a = fiVar.mo17534a(j);
            if (a == -1) {
                a = fiVar.mo17535b(j);
            }
            long j3 = fiVar.f16631b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: b */
    public final boolean mo19725b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo17912c(C5410og ogVar) throws IOException, InterruptedException {
        return C4893ai.m20729b(ogVar);
    }

    /* renamed from: d */
    public final void mo17913d(C5484qg qgVar) {
        this.f26777l = qgVar;
    }

    /* renamed from: e */
    public final void mo17914e(long j, long j2) {
        this.f26769d.clear();
        this.f26773h = 0;
        this.f26775j = 0;
        this.f26776k = 0;
        if (j == 0) {
            m34601g();
            return;
        }
        C5782yh[] yhVarArr = this.f26778m;
        if (yhVarArr != null) {
            for (C5782yh yhVar : yhVarArr) {
                C5079fi fiVar = yhVar.f26363b;
                int a = fiVar.mo17534a(j2);
                if (a == -1) {
                    a = fiVar.mo17535b(j2);
                }
                yhVar.f26365d = a;
            }
        }
    }

    /* renamed from: f */
    public final int mo17915f(C5410og ogVar, C5595tg tgVar) throws IOException, InterruptedException {
        C5782yh[] yhVarArr;
        boolean z;
        boolean z2;
        C5410og ogVar2 = ogVar;
        C5595tg tgVar2 = tgVar;
        while (true) {
            int i = this.f26770e;
            if (i == 0) {
                if (this.f26773h == 0) {
                    if (!ogVar2.mo19988h(this.f26768c.f23918a, 0, 8, true)) {
                        return -1;
                    }
                    this.f26773h = 8;
                    this.f26768c.mo21103v(0);
                    this.f26772g = this.f26768c.mo21094m();
                    this.f26771f = this.f26768c.mo21086e();
                }
                if (this.f26772g == 1) {
                    ogVar2.mo19988h(this.f26768c.f23918a, 8, 8, false);
                    this.f26773h += 8;
                    this.f26772g = this.f26768c.mo21095n();
                }
                int i2 = this.f26771f;
                if (i2 == C5300lh.f19349C || i2 == C5300lh.f19353E || i2 == C5300lh.f19355F || i2 == C5300lh.f19357G || i2 == C5300lh.f19359H || i2 == C5300lh.f19376Q) {
                    long d = (ogVar.mo19984d() + this.f26772g) - ((long) this.f26773h);
                    this.f26769d.add(new C5226jh(this.f26771f, d));
                    if (this.f26772g == ((long) this.f26773h)) {
                        m34602h(d);
                    } else {
                        m34601g();
                    }
                } else {
                    if (i2 == C5300lh.f19378S || i2 == C5300lh.f19351D || i2 == C5300lh.f19379T || i2 == C5300lh.f19380U || i2 == C5300lh.f19410m0 || i2 == C5300lh.f19412n0 || i2 == C5300lh.f19414o0 || i2 == C5300lh.f19377R || i2 == C5300lh.f19416p0 || i2 == C5300lh.f19418q0 || i2 == C5300lh.f19420r0 || i2 == C5300lh.f19422s0 || i2 == C5300lh.f19424t0 || i2 == C5300lh.f19375P || i2 == C5300lh.f19387b || i2 == C5300lh.f19346A0) {
                        C5304ll.m26776e(this.f26773h == 8);
                        C5304ll.m26776e(this.f26772g <= 2147483647L);
                        C5600tl tlVar = new C5600tl((int) this.f26772g);
                        this.f26774i = tlVar;
                        System.arraycopy(this.f26768c.f23918a, 0, tlVar.f23918a, 0, 8);
                    } else {
                        this.f26774i = null;
                    }
                    this.f26770e = 1;
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    yhVarArr = this.f26778m;
                    if (i3 >= yhVarArr.length) {
                        break;
                    }
                    C5782yh yhVar = yhVarArr[i3];
                    int i5 = yhVar.f26365d;
                    C5079fi fiVar = yhVar.f26363b;
                    if (i5 != fiVar.f16630a) {
                        long j2 = fiVar.f16631b[i5];
                        if (j2 < j) {
                            i4 = i3;
                            j = j2;
                        }
                    }
                    i3++;
                }
                if (i4 == -1) {
                    return -1;
                }
                C5782yh yhVar2 = yhVarArr[i4];
                C5743xg xgVar = yhVar2.f26364c;
                int i6 = yhVar2.f26365d;
                C5079fi fiVar2 = yhVar2.f26363b;
                long j3 = fiVar2.f16631b[i6];
                int i7 = fiVar2.f16632c[i6];
                if (yhVar2.f26362a.f14471g == 1) {
                    j3 += 8;
                    i7 -= 8;
                }
                long d2 = (j3 - ogVar.mo19984d()) + ((long) this.f26775j);
                if (d2 < 0 || d2 >= 262144) {
                    tgVar2.f23851a = j3;
                    return 1;
                }
                int i8 = (int) d2;
                boolean z3 = false;
                ogVar2.mo19989i(i8, false);
                int i9 = yhVar2.f26362a.f14475k;
                if (i9 == 0) {
                    while (true) {
                        int i10 = this.f26775j;
                        if (i10 >= i7) {
                            break;
                        }
                        int d3 = xgVar.mo21515d(ogVar2, i7 - i10, false);
                        this.f26775j += d3;
                        this.f26776k -= d3;
                    }
                } else {
                    byte[] bArr = this.f26767b.f23918a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i11 = 4 - i9;
                    while (this.f26775j < i7) {
                        int i12 = this.f26776k;
                        if (i12 == 0) {
                            ogVar2.mo19988h(this.f26767b.f23918a, i11, i9, z3);
                            this.f26767b.mo21103v(z3 ? 1 : 0);
                            this.f26776k = this.f26767b.mo21090i();
                            this.f26766a.mo21103v(z3);
                            xgVar.mo21513b(this.f26766a, 4);
                            this.f26775j += 4;
                            i7 += i11;
                        } else {
                            int d4 = xgVar.mo21515d(ogVar2, i12, z3);
                            this.f26775j += d4;
                            this.f26776k -= d4;
                            z3 = false;
                        }
                    }
                }
                int i13 = i7;
                C5079fi fiVar3 = yhVar2.f26363b;
                xgVar.mo21514c(fiVar3.f16634e[i6], fiVar3.f16635f[i6], i13, 0, (C5706wg) null);
                yhVar2.f26365d++;
                this.f26775j = 0;
                this.f26776k = 0;
                return 0;
            } else {
                long j4 = this.f26772g - ((long) this.f26773h);
                long d5 = ogVar.mo19984d() + j4;
                C5600tl tlVar2 = this.f26774i;
                if (tlVar2 != null) {
                    ogVar2.mo19988h(tlVar2.f23918a, this.f26773h, (int) j4, false);
                    if (this.f26771f == C5300lh.f19387b) {
                        C5600tl tlVar3 = this.f26774i;
                        tlVar3.mo21103v(8);
                        if (tlVar3.mo21086e() == f26765p) {
                            z2 = true;
                        } else {
                            tlVar3.mo21104w(4);
                            while (true) {
                                if (tlVar3.mo21082a() > 0) {
                                    if (tlVar3.mo21086e() == f26765p) {
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        this.f26780o = z2;
                    } else if (!this.f26769d.isEmpty()) {
                        this.f26769d.peek().mo18629g(new C5263kh(this.f26771f, this.f26774i));
                    }
                } else if (j4 < 262144) {
                    ogVar2.mo19989i((int) j4, false);
                } else {
                    tgVar2.f23851a = ogVar.mo19984d() + j4;
                    z = true;
                    m34602h(d5);
                    if (z && this.f26770e != 2) {
                        return 1;
                    }
                }
                z = false;
                m34602h(d5);
                return 1;
            }
        }
    }

    public final long zza() {
        return this.f26779n;
    }
}
