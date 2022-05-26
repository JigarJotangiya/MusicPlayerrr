package p082e.p099f.p100a.p104m.p105o;

import java.util.ArrayList;
import p082e.p099f.p100a.C3484d;
import p082e.p099f.p100a.C3487e;
import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;
import p082e.p099f.p100a.p104m.C3533h;
import p082e.p099f.p100a.p104m.C3535i;
import p082e.p099f.p100a.p104m.C3537k;
import p082e.p099f.p100a.p104m.C3539m;

/* renamed from: e.f.a.m.o.b */
/* compiled from: BasicMeasure */
public class C3542b {

    /* renamed from: a */
    private final ArrayList<C3527e> f11497a = new ArrayList<>();

    /* renamed from: b */
    private C3543a f11498b = new C3543a();

    /* renamed from: c */
    private C3530f f11499c;

    /* renamed from: e.f.a.m.o.b$a */
    /* compiled from: BasicMeasure */
    public static class C3543a {

        /* renamed from: k */
        public static int f11500k = 0;

        /* renamed from: l */
        public static int f11501l = 1;

        /* renamed from: m */
        public static int f11502m = 2;

        /* renamed from: a */
        public C3527e.C3529b f11503a;

        /* renamed from: b */
        public C3527e.C3529b f11504b;

        /* renamed from: c */
        public int f11505c;

        /* renamed from: d */
        public int f11506d;

        /* renamed from: e */
        public int f11507e;

        /* renamed from: f */
        public int f11508f;

        /* renamed from: g */
        public int f11509g;

        /* renamed from: h */
        public boolean f11510h;

        /* renamed from: i */
        public boolean f11511i;

        /* renamed from: j */
        public int f11512j;
    }

    /* renamed from: e.f.a.m.o.b$b */
    /* compiled from: BasicMeasure */
    public interface C3544b {
        /* renamed from: a */
        void mo2893a();

        /* renamed from: b */
        void mo2894b(C3527e eVar, C3543a aVar);
    }

    public C3542b(C3530f fVar) {
        this.f11499c = fVar;
    }

    /* renamed from: a */
    private boolean m15413a(C3544b bVar, C3527e eVar, int i) {
        this.f11498b.f11503a = eVar.mo12619C();
        this.f11498b.f11504b = eVar.mo12651S();
        this.f11498b.f11505c = eVar.mo12657V();
        this.f11498b.f11506d = eVar.mo12720z();
        C3543a aVar = this.f11498b;
        aVar.f11511i = false;
        aVar.f11512j = i;
        C3527e.C3529b bVar2 = aVar.f11503a;
        C3527e.C3529b bVar3 = C3527e.C3529b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f11504b == bVar3;
        boolean z3 = z && eVar.f11358b0 > 0.0f;
        boolean z4 = z2 && eVar.f11358b0 > 0.0f;
        if (z3 && eVar.f11395u[0] == 4) {
            aVar.f11503a = C3527e.C3529b.FIXED;
        }
        if (z4 && eVar.f11395u[1] == 4) {
            aVar.f11504b = C3527e.C3529b.FIXED;
        }
        bVar.mo2894b(eVar, aVar);
        eVar.mo12683h1(this.f11498b.f11507e);
        eVar.mo12632I0(this.f11498b.f11508f);
        eVar.mo12630H0(this.f11498b.f11510h);
        eVar.mo12717x0(this.f11498b.f11509g);
        C3543a aVar2 = this.f11498b;
        aVar2.f11512j = C3543a.f11500k;
        return aVar2.f11511i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        if (r8 != r9) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
        if (r5.f11358b0 <= 0.0f) goto L_0x0098;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15414b(p082e.p099f.p100a.p104m.C3530f r13) {
        /*
            r12 = this;
            java.util.ArrayList<e.f.a.m.e> r0 = r13.f11496P0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.mo12737Q1(r1)
            e.f.a.m.o.b$b r2 = r13.mo12727F1()
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r0) goto L_0x00b0
            java.util.ArrayList<e.f.a.m.e> r5 = r13.f11496P0
            java.lang.Object r5 = r5.get(r4)
            e.f.a.m.e r5 = (p082e.p099f.p100a.p104m.C3527e) r5
            boolean r6 = r5 instanceof p082e.p099f.p100a.p104m.C3533h
            if (r6 == 0) goto L_0x0022
            goto L_0x00ac
        L_0x0022:
            boolean r6 = r5 instanceof p082e.p099f.p100a.p104m.C3521a
            if (r6 == 0) goto L_0x0028
            goto L_0x00ac
        L_0x0028:
            boolean r6 = r5.mo12690k0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00ac
        L_0x0030:
            if (r1 == 0) goto L_0x0048
            e.f.a.m.o.l r6 = r5.f11361d
            if (r6 == 0) goto L_0x0048
            e.f.a.m.o.n r7 = r5.f11363e
            if (r7 == 0) goto L_0x0048
            e.f.a.m.o.g r6 = r6.f11559e
            boolean r6 = r6.f11532j
            if (r6 == 0) goto L_0x0048
            e.f.a.m.o.g r6 = r7.f11559e
            boolean r6 = r6.f11532j
            if (r6 == 0) goto L_0x0048
            goto L_0x00ac
        L_0x0048:
            e.f.a.m.e$b r6 = r5.mo12714w(r3)
            r7 = 1
            e.f.a.m.e$b r8 = r5.mo12714w(r7)
            e.f.a.m.e$b r9 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0061
            int r10 = r5.f11391s
            if (r10 == r7) goto L_0x0061
            if (r8 != r9) goto L_0x0061
            int r10 = r5.f11393t
            if (r10 == r7) goto L_0x0061
            r10 = 1
            goto L_0x0062
        L_0x0061:
            r10 = 0
        L_0x0062:
            if (r10 != 0) goto L_0x0098
            boolean r11 = r13.mo12737Q1(r7)
            if (r11 == 0) goto L_0x0098
            boolean r11 = r5 instanceof p082e.p099f.p100a.p104m.C3539m
            if (r11 != 0) goto L_0x0098
            if (r6 != r9) goto L_0x007d
            int r11 = r5.f11391s
            if (r11 != 0) goto L_0x007d
            if (r8 == r9) goto L_0x007d
            boolean r11 = r5.mo12682h0()
            if (r11 != 0) goto L_0x007d
            r10 = 1
        L_0x007d:
            if (r8 != r9) goto L_0x008c
            int r11 = r5.f11393t
            if (r11 != 0) goto L_0x008c
            if (r6 == r9) goto L_0x008c
            boolean r11 = r5.mo12682h0()
            if (r11 != 0) goto L_0x008c
            r10 = 1
        L_0x008c:
            if (r6 == r9) goto L_0x0090
            if (r8 != r9) goto L_0x0098
        L_0x0090:
            float r6 = r5.f11358b0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r7 = r10
        L_0x0099:
            if (r7 == 0) goto L_0x009c
            goto L_0x00ac
        L_0x009c:
            int r6 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            r12.m15413a(r2, r5, r6)
            e.f.a.e r5 = r13.f11415V0
            if (r5 == 0) goto L_0x00ac
            long r6 = r5.f11096a
            r8 = 1
            long r6 = r6 + r8
            r5.f11096a = r6
        L_0x00ac:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00b0:
            r2.mo2893a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3542b.m15414b(e.f.a.m.f):void");
    }

    /* renamed from: c */
    private void m15415c(C3530f fVar, String str, int i, int i2, int i3) {
        int K = fVar.mo12635K();
        int J = fVar.mo12633J();
        fVar.mo12662X0(0);
        fVar.mo12660W0(0);
        fVar.mo12683h1(i2);
        fVar.mo12632I0(i3);
        fVar.mo12662X0(K);
        fVar.mo12660W0(J);
        this.f11499c.mo12740U1(i);
        this.f11499c.mo12744p1();
    }

    /* renamed from: d */
    public long mo12817d(C3530f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        int i11;
        int i12;
        boolean z2;
        C3544b bVar;
        int i13;
        int i14;
        int i15;
        boolean z3;
        C3487e eVar;
        C3530f fVar2 = fVar;
        int i16 = i;
        int i17 = i4;
        int i18 = i6;
        C3544b F1 = fVar.mo12727F1();
        int size = fVar2.f11496P0.size();
        int V = fVar.mo12657V();
        int z4 = fVar.mo12720z();
        boolean b = C3537k.m15380b(i16, 128);
        boolean z5 = b || C3537k.m15380b(i16, 64);
        if (z5) {
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    break;
                }
                C3527e eVar2 = fVar2.f11496P0.get(i19);
                C3527e.C3529b C = eVar2.mo12619C();
                C3527e.C3529b bVar2 = C3527e.C3529b.MATCH_CONSTRAINT;
                boolean z6 = (C == bVar2) && (eVar2.mo12651S() == bVar2) && eVar2.mo12716x() > 0.0f;
                if ((!eVar2.mo12682h0() || !z6) && ((!eVar2.mo12687j0() || !z6) && !(eVar2 instanceof C3539m) && !eVar2.mo12682h0() && !eVar2.mo12687j0())) {
                    i19++;
                }
            }
            z5 = false;
        }
        if (z5 && (eVar = C3484d.f11075x) != null) {
            eVar.f11098c++;
        }
        boolean z7 = z5 & ((i17 == 1073741824 && i18 == 1073741824) || b);
        if (z7) {
            int min = Math.min(fVar.mo12631I(), i5);
            int min2 = Math.min(fVar.mo12629H(), i7);
            if (i17 == 1073741824 && fVar.mo12657V() != min) {
                fVar2.mo12683h1(min);
                fVar.mo12731J1();
            }
            if (i18 == 1073741824 && fVar.mo12720z() != min2) {
                fVar2.mo12632I0(min2);
                fVar.mo12731J1();
            }
            if (i17 == 1073741824 && i18 == 1073741824) {
                z = fVar2.mo12724C1(b);
                i10 = 2;
            } else {
                boolean D1 = fVar2.mo12725D1(b);
                if (i17 == 1073741824) {
                    D1 &= fVar2.mo12726E1(b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i18 == 1073741824) {
                    z = fVar2.mo12726E1(b, 1) & D1;
                    i10++;
                } else {
                    z = D1;
                }
            }
            if (z) {
                fVar2.mo12696m1(i17 == 1073741824, i18 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0;
        }
        int G1 = fVar.mo12728G1();
        if (size > 0) {
            m15414b(fVar);
        }
        mo12818e(fVar);
        int size2 = this.f11497a.size();
        if (size > 0) {
            m15415c(fVar, "First pass", 0, V, z4);
        }
        if (size2 > 0) {
            C3527e.C3529b C2 = fVar.mo12619C();
            C3527e.C3529b bVar3 = C3527e.C3529b.WRAP_CONTENT;
            boolean z8 = C2 == bVar3;
            boolean z9 = fVar.mo12651S() == bVar3;
            int max = Math.max(fVar.mo12657V(), this.f11499c.mo12635K());
            int max2 = Math.max(fVar.mo12720z(), this.f11499c.mo12633J());
            int i20 = 0;
            boolean z10 = false;
            while (i20 < size2) {
                C3527e eVar3 = this.f11497a.get(i20);
                if (!(eVar3 instanceof C3539m)) {
                    i13 = G1;
                    i14 = V;
                    i15 = z4;
                } else {
                    int V2 = eVar3.mo12657V();
                    i13 = G1;
                    int z11 = eVar3.mo12720z();
                    i15 = z4;
                    boolean a = m15413a(F1, eVar3, C3543a.f11501l) | z10;
                    C3487e eVar4 = fVar2.f11415V0;
                    i14 = V;
                    boolean z12 = a;
                    if (eVar4 != null) {
                        eVar4.f11097b++;
                    }
                    int V3 = eVar3.mo12657V();
                    int z13 = eVar3.mo12720z();
                    if (V3 != V2) {
                        eVar3.mo12683h1(V3);
                        if (z8 && eVar3.mo12643O() > max) {
                            max = Math.max(max, eVar3.mo12643O() + eVar3.mo12702q(C3524d.C3526b.RIGHT).mo12598f());
                        }
                        z3 = true;
                    } else {
                        z3 = z12;
                    }
                    if (z13 != z11) {
                        eVar3.mo12632I0(z13);
                        if (z9 && eVar3.mo12708t() > max2) {
                            max2 = Math.max(max2, eVar3.mo12708t() + eVar3.mo12702q(C3524d.C3526b.BOTTOM).mo12598f());
                        }
                        z3 = true;
                    }
                    z10 = z3 | ((C3539m) eVar3).mo12794C1();
                }
                i20++;
                G1 = i13;
                z4 = i15;
                V = i14;
            }
            int i21 = G1;
            int i22 = V;
            int i23 = z4;
            int i24 = 0;
            int i25 = 2;
            while (i24 < i25) {
                int i26 = 0;
                while (i26 < size2) {
                    C3527e eVar5 = this.f11497a.get(i26);
                    if ((!(eVar5 instanceof C3535i) || (eVar5 instanceof C3539m)) && !(eVar5 instanceof C3533h) && eVar5.mo12655U() != 8 && ((!z7 || !eVar5.f11361d.f11559e.f11532j || !eVar5.f11363e.f11559e.f11532j) && !(eVar5 instanceof C3539m))) {
                        int V4 = eVar5.mo12657V();
                        int z14 = eVar5.mo12720z();
                        int r = eVar5.mo12704r();
                        int i27 = C3543a.f11501l;
                        z2 = z7;
                        if (i24 == 1) {
                            i27 = C3543a.f11502m;
                        }
                        boolean a2 = m15413a(F1, eVar5, i27) | z10;
                        C3487e eVar6 = fVar2.f11415V0;
                        i12 = size2;
                        bVar = F1;
                        if (eVar6 != null) {
                            eVar6.f11097b++;
                        }
                        int V5 = eVar5.mo12657V();
                        int z15 = eVar5.mo12720z();
                        if (V5 != V4) {
                            eVar5.mo12683h1(V5);
                            if (z8 && eVar5.mo12643O() > max) {
                                max = Math.max(max, eVar5.mo12643O() + eVar5.mo12702q(C3524d.C3526b.RIGHT).mo12598f());
                            }
                            a2 = true;
                        }
                        if (z15 != z14) {
                            eVar5.mo12632I0(z15);
                            if (z9 && eVar5.mo12708t() > max2) {
                                max2 = Math.max(max2, eVar5.mo12708t() + eVar5.mo12702q(C3524d.C3526b.BOTTOM).mo12598f());
                            }
                            a2 = true;
                        }
                        z10 = (!eVar5.mo12663Y() || r == eVar5.mo12704r()) ? a2 : true;
                    } else {
                        z2 = z7;
                        i12 = size2;
                        bVar = F1;
                    }
                    i26++;
                    F1 = bVar;
                    z7 = z2;
                    size2 = i12;
                }
                boolean z16 = z7;
                int i28 = size2;
                C3544b bVar4 = F1;
                if (!z10) {
                    break;
                }
                i24++;
                m15415c(fVar, "intermediate pass", i24, i22, i23);
                F1 = bVar4;
                z7 = z16;
                size2 = i28;
                i25 = 2;
                z10 = false;
            }
            i11 = i21;
        } else {
            i11 = G1;
        }
        fVar2.mo12739T1(i11);
        return 0;
    }

    /* renamed from: e */
    public void mo12818e(C3530f fVar) {
        this.f11497a.clear();
        int size = fVar.f11496P0.size();
        for (int i = 0; i < size; i++) {
            C3527e eVar = fVar.f11496P0.get(i);
            C3527e.C3529b C = eVar.mo12619C();
            C3527e.C3529b bVar = C3527e.C3529b.MATCH_CONSTRAINT;
            if (C == bVar || eVar.mo12651S() == bVar) {
                this.f11497a.add(eVar);
            }
        }
        fVar.mo12731J1();
    }
}
