package p082e.p099f.p100a.p104m.p105o;

import java.util.ArrayList;
import p082e.p099f.p100a.p104m.C3521a;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;
import p082e.p099f.p100a.p104m.C3533h;
import p082e.p099f.p100a.p104m.p105o.C3542b;

/* renamed from: e.f.a.m.o.h */
/* compiled from: Direct */
public class C3551h {

    /* renamed from: a */
    private static C3542b.C3543a f11537a = new C3542b.C3543a();

    /* renamed from: b */
    private static int f11538b = 0;

    /* renamed from: c */
    private static int f11539c = 0;

    /* renamed from: a */
    private static boolean m15449a(int i, C3527e eVar) {
        C3527e.C3529b bVar;
        C3527e.C3529b bVar2;
        C3527e.C3529b C = eVar.mo12619C();
        C3527e.C3529b S = eVar.mo12651S();
        C3530f fVar = eVar.mo12639M() != null ? (C3530f) eVar.mo12639M() : null;
        if (fVar != null) {
            C3527e.C3529b C2 = fVar.mo12619C();
            C3527e.C3529b bVar3 = C3527e.C3529b.FIXED;
        }
        if (fVar != null) {
            C3527e.C3529b S2 = fVar.mo12651S();
            C3527e.C3529b bVar4 = C3527e.C3529b.FIXED;
        }
        C3527e.C3529b bVar5 = C3527e.C3529b.FIXED;
        boolean z = C == bVar5 || eVar.mo12579m0() || C == C3527e.C3529b.WRAP_CONTENT || (C == (bVar2 = C3527e.C3529b.MATCH_CONSTRAINT) && eVar.f11391s == 0 && eVar.f11358b0 == 0.0f && eVar.mo12665Z(0)) || (C == bVar2 && eVar.f11391s == 1 && eVar.mo12671c0(0, eVar.mo12657V()));
        boolean z2 = S == bVar5 || eVar.mo12581n0() || S == C3527e.C3529b.WRAP_CONTENT || (S == (bVar = C3527e.C3529b.MATCH_CONSTRAINT) && eVar.f11393t == 0 && eVar.f11358b0 == 0.0f && eVar.mo12665Z(1)) || (C == bVar && eVar.f11393t == 1 && eVar.mo12671c0(1, eVar.mo12720z()));
        if (eVar.f11358b0 > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
        r11 = r12.f11343O.f11308f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r8 = r12.f11339M.f11308f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m15450b(int r16, p082e.p099f.p100a.p104m.C3527e r17, p082e.p099f.p100a.p104m.p105o.C3542b.C3544b r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r17.mo12678f0()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = f11538b
            r4 = 1
            int r3 = r3 + r4
            f11538b = r3
            boolean r3 = r0 instanceof p082e.p099f.p100a.p104m.C3530f
            if (r3 != 0) goto L_0x002f
            boolean r3 = r17.mo12693l0()
            if (r3 == 0) goto L_0x002f
            int r3 = r16 + 1
            boolean r5 = m15449a(r3, r0)
            if (r5 == 0) goto L_0x002f
            e.f.a.m.o.b$a r5 = new e.f.a.m.o.b$a
            r5.<init>()
            int r6 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            p082e.p099f.p100a.p104m.C3530f.m15260P1(r3, r0, r1, r5, r6)
        L_0x002f:
            e.f.a.m.d$b r3 = p082e.p099f.p100a.p104m.C3524d.C3526b.LEFT
            e.f.a.m.d r3 = r0.mo12702q(r3)
            e.f.a.m.d$b r5 = p082e.p099f.p100a.p104m.C3524d.C3526b.RIGHT
            e.f.a.m.d r5 = r0.mo12702q(r5)
            int r6 = r3.mo12597e()
            int r7 = r5.mo12597e()
            java.util.HashSet r8 = r3.mo12596d()
            r9 = 0
            r10 = 8
            if (r8 == 0) goto L_0x013e
            boolean r8 = r3.mo12606n()
            if (r8 == 0) goto L_0x013e
            java.util.HashSet r3 = r3.mo12596d()
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x013e
            java.lang.Object r8 = r3.next()
            e.f.a.m.d r8 = (p082e.p099f.p100a.p104m.C3524d) r8
            e.f.a.m.e r12 = r8.f11306d
            int r13 = r16 + 1
            boolean r14 = m15449a(r13, r12)
            boolean r15 = r12.mo12693l0()
            if (r15 == 0) goto L_0x0080
            if (r14 == 0) goto L_0x0080
            e.f.a.m.o.b$a r15 = new e.f.a.m.o.b$a
            r15.<init>()
            int r11 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            p082e.p099f.p100a.p104m.C3530f.m15260P1(r13, r12, r1, r15, r11)
        L_0x0080:
            e.f.a.m.e$b r11 = r12.mo12619C()
            e.f.a.m.e$b r15 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r11 != r15) goto L_0x00e7
            if (r14 == 0) goto L_0x008b
            goto L_0x00e7
        L_0x008b:
            e.f.a.m.e$b r11 = r12.mo12619C()
            if (r11 != r15) goto L_0x005a
            int r11 = r12.f11399w
            if (r11 < 0) goto L_0x005a
            int r11 = r12.f11397v
            if (r11 < 0) goto L_0x005a
            int r11 = r12.mo12655U()
            if (r11 == r10) goto L_0x00ab
            int r11 = r12.f11391s
            if (r11 != 0) goto L_0x005a
            float r11 = r12.mo12716x()
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x005a
        L_0x00ab:
            boolean r11 = r12.mo12682h0()
            if (r11 != 0) goto L_0x005a
            boolean r11 = r12.mo12690k0()
            if (r11 != 0) goto L_0x005a
            e.f.a.m.d r11 = r12.f11339M
            if (r8 != r11) goto L_0x00c7
            e.f.a.m.d r11 = r12.f11343O
            e.f.a.m.d r11 = r11.f11308f
            if (r11 == 0) goto L_0x00c7
            boolean r11 = r11.mo12606n()
            if (r11 != 0) goto L_0x00d7
        L_0x00c7:
            e.f.a.m.d r11 = r12.f11343O
            if (r8 != r11) goto L_0x00d9
            e.f.a.m.d r8 = r12.f11339M
            e.f.a.m.d r8 = r8.f11308f
            if (r8 == 0) goto L_0x00d9
            boolean r8 = r8.mo12606n()
            if (r8 == 0) goto L_0x00d9
        L_0x00d7:
            r8 = 1
            goto L_0x00da
        L_0x00d9:
            r8 = 0
        L_0x00da:
            if (r8 == 0) goto L_0x005a
            boolean r8 = r12.mo12682h0()
            if (r8 != 0) goto L_0x005a
            m15453e(r13, r0, r1, r12, r2)
            goto L_0x005a
        L_0x00e7:
            boolean r11 = r12.mo12693l0()
            if (r11 == 0) goto L_0x00ef
            goto L_0x005a
        L_0x00ef:
            e.f.a.m.d r11 = r12.f11339M
            if (r8 != r11) goto L_0x010b
            e.f.a.m.d r14 = r12.f11343O
            e.f.a.m.d r14 = r14.f11308f
            if (r14 != 0) goto L_0x010b
            int r8 = r11.mo12598f()
            int r8 = r8 + r6
            int r11 = r12.mo12657V()
            int r11 = r11 + r8
            r12.mo12620C0(r8, r11)
            m15450b(r13, r12, r1, r2)
            goto L_0x005a
        L_0x010b:
            e.f.a.m.d r14 = r12.f11343O
            if (r8 != r14) goto L_0x0127
            e.f.a.m.d r15 = r11.f11308f
            if (r15 != 0) goto L_0x0127
            int r8 = r14.mo12598f()
            int r8 = r6 - r8
            int r11 = r12.mo12657V()
            int r11 = r8 - r11
            r12.mo12620C0(r11, r8)
            m15450b(r13, r12, r1, r2)
            goto L_0x005a
        L_0x0127:
            if (r8 != r11) goto L_0x005a
            e.f.a.m.d r8 = r14.f11308f
            if (r8 == 0) goto L_0x005a
            boolean r8 = r8.mo12606n()
            if (r8 == 0) goto L_0x005a
            boolean r8 = r12.mo12682h0()
            if (r8 != 0) goto L_0x005a
            m15452d(r13, r1, r12, r2)
            goto L_0x005a
        L_0x013e:
            boolean r3 = r0 instanceof p082e.p099f.p100a.p104m.C3533h
            if (r3 == 0) goto L_0x0143
            return
        L_0x0143:
            java.util.HashSet r3 = r5.mo12596d()
            if (r3 == 0) goto L_0x0231
            boolean r3 = r5.mo12606n()
            if (r3 == 0) goto L_0x0231
            java.util.HashSet r3 = r5.mo12596d()
            java.util.Iterator r3 = r3.iterator()
        L_0x0157:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0231
            java.lang.Object r5 = r3.next()
            e.f.a.m.d r5 = (p082e.p099f.p100a.p104m.C3524d) r5
            e.f.a.m.e r6 = r5.f11306d
            int r8 = r16 + 1
            boolean r11 = m15449a(r8, r6)
            boolean r12 = r6.mo12693l0()
            if (r12 == 0) goto L_0x017d
            if (r11 == 0) goto L_0x017d
            e.f.a.m.o.b$a r12 = new e.f.a.m.o.b$a
            r12.<init>()
            int r13 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            p082e.p099f.p100a.p104m.C3530f.m15260P1(r8, r6, r1, r12, r13)
        L_0x017d:
            e.f.a.m.d r12 = r6.f11339M
            if (r5 != r12) goto L_0x018d
            e.f.a.m.d r12 = r6.f11343O
            e.f.a.m.d r12 = r12.f11308f
            if (r12 == 0) goto L_0x018d
            boolean r12 = r12.mo12606n()
            if (r12 != 0) goto L_0x019d
        L_0x018d:
            e.f.a.m.d r12 = r6.f11343O
            if (r5 != r12) goto L_0x019f
            e.f.a.m.d r12 = r6.f11339M
            e.f.a.m.d r12 = r12.f11308f
            if (r12 == 0) goto L_0x019f
            boolean r12 = r12.mo12606n()
            if (r12 == 0) goto L_0x019f
        L_0x019d:
            r12 = 1
            goto L_0x01a0
        L_0x019f:
            r12 = 0
        L_0x01a0:
            e.f.a.m.e$b r13 = r6.mo12619C()
            e.f.a.m.e$b r14 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x01e4
            if (r11 == 0) goto L_0x01ab
            goto L_0x01e4
        L_0x01ab:
            e.f.a.m.e$b r5 = r6.mo12619C()
            if (r5 != r14) goto L_0x0157
            int r5 = r6.f11399w
            if (r5 < 0) goto L_0x0157
            int r5 = r6.f11397v
            if (r5 < 0) goto L_0x0157
            int r5 = r6.mo12655U()
            if (r5 == r10) goto L_0x01cb
            int r5 = r6.f11391s
            if (r5 != 0) goto L_0x0157
            float r5 = r6.mo12716x()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0157
        L_0x01cb:
            boolean r5 = r6.mo12682h0()
            if (r5 != 0) goto L_0x0157
            boolean r5 = r6.mo12690k0()
            if (r5 != 0) goto L_0x0157
            if (r12 == 0) goto L_0x0157
            boolean r5 = r6.mo12682h0()
            if (r5 != 0) goto L_0x0157
            m15453e(r8, r0, r1, r6, r2)
            goto L_0x0157
        L_0x01e4:
            boolean r11 = r6.mo12693l0()
            if (r11 == 0) goto L_0x01ec
            goto L_0x0157
        L_0x01ec:
            e.f.a.m.d r11 = r6.f11339M
            if (r5 != r11) goto L_0x0208
            e.f.a.m.d r13 = r6.f11343O
            e.f.a.m.d r13 = r13.f11308f
            if (r13 != 0) goto L_0x0208
            int r5 = r11.mo12598f()
            int r5 = r5 + r7
            int r11 = r6.mo12657V()
            int r11 = r11 + r5
            r6.mo12620C0(r5, r11)
            m15450b(r8, r6, r1, r2)
            goto L_0x0157
        L_0x0208:
            e.f.a.m.d r13 = r6.f11343O
            if (r5 != r13) goto L_0x0224
            e.f.a.m.d r5 = r11.f11308f
            if (r5 != 0) goto L_0x0224
            int r5 = r13.mo12598f()
            int r5 = r7 - r5
            int r11 = r6.mo12657V()
            int r11 = r5 - r11
            r6.mo12620C0(r11, r5)
            m15450b(r8, r6, r1, r2)
            goto L_0x0157
        L_0x0224:
            if (r12 == 0) goto L_0x0157
            boolean r5 = r6.mo12682h0()
            if (r5 != 0) goto L_0x0157
            m15452d(r8, r1, r6, r2)
            goto L_0x0157
        L_0x0231:
            r17.mo12701p0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3551h.m15450b(int, e.f.a.m.e, e.f.a.m.o.b$b, boolean):void");
    }

    /* renamed from: c */
    private static void m15451c(int i, C3521a aVar, C3542b.C3544b bVar, int i2, boolean z) {
        if (!aVar.mo12582q1()) {
            return;
        }
        if (i2 == 0) {
            m15450b(i + 1, aVar, bVar, z);
        } else {
            m15457i(i + 1, aVar, bVar);
        }
    }

    /* renamed from: d */
    private static void m15452d(int i, C3542b.C3544b bVar, C3527e eVar, boolean z) {
        float A = eVar.mo12615A();
        int e = eVar.f11339M.f11308f.mo12597e();
        int e2 = eVar.f11343O.f11308f.mo12597e();
        int f = eVar.f11339M.mo12598f() + e;
        int f2 = e2 - eVar.f11343O.mo12598f();
        if (e == e2) {
            A = 0.5f;
        } else {
            e = f;
            e2 = f2;
        }
        int V = eVar.mo12657V();
        int i2 = (e2 - e) - V;
        if (e > e2) {
            i2 = (e - e2) - V;
        }
        int i3 = ((int) (i2 > 0 ? (A * ((float) i2)) + 0.5f : A * ((float) i2))) + e;
        int i4 = i3 + V;
        if (e > e2) {
            i4 = i3 - V;
        }
        eVar.mo12620C0(i3, i4);
        m15450b(i + 1, eVar, bVar, z);
    }

    /* renamed from: e */
    private static void m15453e(int i, C3527e eVar, C3542b.C3544b bVar, C3527e eVar2, boolean z) {
        int i2;
        float A = eVar2.mo12615A();
        int e = eVar2.f11339M.f11308f.mo12597e() + eVar2.f11339M.mo12598f();
        int e2 = eVar2.f11343O.f11308f.mo12597e() - eVar2.f11343O.mo12598f();
        if (e2 >= e) {
            int V = eVar2.mo12657V();
            if (eVar2.mo12655U() != 8) {
                int i3 = eVar2.f11391s;
                if (i3 == 2) {
                    if (eVar instanceof C3530f) {
                        i2 = eVar.mo12657V();
                    } else {
                        i2 = eVar.mo12639M().mo12657V();
                    }
                    V = (int) (eVar2.mo12615A() * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    V = e2 - e;
                }
                V = Math.max(eVar2.f11397v, V);
                int i4 = eVar2.f11399w;
                if (i4 > 0) {
                    V = Math.min(i4, V);
                }
            }
            int i5 = e + ((int) ((A * ((float) ((e2 - e) - V))) + 0.5f));
            eVar2.mo12620C0(i5, V + i5);
            m15450b(i + 1, eVar2, bVar, z);
        }
    }

    /* renamed from: f */
    private static void m15454f(int i, C3542b.C3544b bVar, C3527e eVar) {
        float Q = eVar.mo12647Q();
        int e = eVar.f11341N.f11308f.mo12597e();
        int e2 = eVar.f11344P.f11308f.mo12597e();
        int f = eVar.f11341N.mo12598f() + e;
        int f2 = e2 - eVar.f11344P.mo12598f();
        if (e == e2) {
            Q = 0.5f;
        } else {
            e = f;
            e2 = f2;
        }
        int z = eVar.mo12720z();
        int i2 = (e2 - e) - z;
        if (e > e2) {
            i2 = (e - e2) - z;
        }
        int i3 = (int) (i2 > 0 ? (Q * ((float) i2)) + 0.5f : Q * ((float) i2));
        int i4 = e + i3;
        int i5 = i4 + z;
        if (e > e2) {
            i4 = e - i3;
            i5 = i4 - z;
        }
        eVar.mo12626F0(i4, i5);
        m15457i(i + 1, eVar, bVar);
    }

    /* renamed from: g */
    private static void m15455g(int i, C3527e eVar, C3542b.C3544b bVar, C3527e eVar2) {
        int i2;
        float Q = eVar2.mo12647Q();
        int e = eVar2.f11341N.f11308f.mo12597e() + eVar2.f11341N.mo12598f();
        int e2 = eVar2.f11344P.f11308f.mo12597e() - eVar2.f11344P.mo12598f();
        if (e2 >= e) {
            int z = eVar2.mo12720z();
            if (eVar2.mo12655U() != 8) {
                int i3 = eVar2.f11393t;
                if (i3 == 2) {
                    if (eVar instanceof C3530f) {
                        i2 = eVar.mo12720z();
                    } else {
                        i2 = eVar.mo12639M().mo12720z();
                    }
                    z = (int) (Q * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    z = e2 - e;
                }
                z = Math.max(eVar2.f11403y, z);
                int i4 = eVar2.f11405z;
                if (i4 > 0) {
                    z = Math.min(i4, z);
                }
            }
            int i5 = e + ((int) ((Q * ((float) ((e2 - e) - z))) + 0.5f));
            eVar2.mo12626F0(i5, z + i5);
            m15457i(i + 1, eVar2, bVar);
        }
    }

    /* renamed from: h */
    public static void m15456h(C3530f fVar, C3542b.C3544b bVar) {
        C3527e.C3529b C = fVar.mo12619C();
        C3527e.C3529b S = fVar.mo12651S();
        f11538b = 0;
        f11539c = 0;
        fVar.mo12713v0();
        ArrayList<C3527e> o1 = fVar.mo12814o1();
        int size = o1.size();
        for (int i = 0; i < size; i++) {
            o1.get(i).mo12713v0();
        }
        boolean M1 = fVar.mo12734M1();
        if (C == C3527e.C3529b.FIXED) {
            fVar.mo12620C0(0, fVar.mo12657V());
        } else {
            fVar.mo12622D0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C3527e eVar = o1.get(i2);
            if (eVar instanceof C3533h) {
                C3533h hVar = (C3533h) eVar;
                if (hVar.mo12778p1() == 1) {
                    if (hVar.mo12779q1() != -1) {
                        hVar.mo12782t1(hVar.mo12779q1());
                    } else if (hVar.mo12780r1() != -1 && fVar.mo12579m0()) {
                        hVar.mo12782t1(fVar.mo12657V() - hVar.mo12780r1());
                    } else if (fVar.mo12579m0()) {
                        hVar.mo12782t1((int) ((hVar.mo12781s1() * ((float) fVar.mo12657V())) + 0.5f));
                    }
                    z = true;
                }
            } else if ((eVar instanceof C3521a) && ((C3521a) eVar).mo12587u1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C3527e eVar2 = o1.get(i3);
                if (eVar2 instanceof C3533h) {
                    C3533h hVar2 = (C3533h) eVar2;
                    if (hVar2.mo12778p1() == 1) {
                        m15450b(0, hVar2, bVar, M1);
                    }
                }
            }
        }
        m15450b(0, fVar, bVar, M1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C3527e eVar3 = o1.get(i4);
                if (eVar3 instanceof C3521a) {
                    C3521a aVar = (C3521a) eVar3;
                    if (aVar.mo12587u1() == 0) {
                        m15451c(0, aVar, bVar, 0, M1);
                    }
                }
            }
        }
        if (S == C3527e.C3529b.FIXED) {
            fVar.mo12626F0(0, fVar.mo12720z());
        } else {
            fVar.mo12624E0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C3527e eVar4 = o1.get(i5);
            if (eVar4 instanceof C3533h) {
                C3533h hVar3 = (C3533h) eVar4;
                if (hVar3.mo12778p1() == 0) {
                    if (hVar3.mo12779q1() != -1) {
                        hVar3.mo12782t1(hVar3.mo12779q1());
                    } else if (hVar3.mo12780r1() != -1 && fVar.mo12581n0()) {
                        hVar3.mo12782t1(fVar.mo12720z() - hVar3.mo12780r1());
                    } else if (fVar.mo12581n0()) {
                        hVar3.mo12782t1((int) ((hVar3.mo12781s1() * ((float) fVar.mo12720z())) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((eVar4 instanceof C3521a) && ((C3521a) eVar4).mo12587u1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C3527e eVar5 = o1.get(i6);
                if (eVar5 instanceof C3533h) {
                    C3533h hVar4 = (C3533h) eVar5;
                    if (hVar4.mo12778p1() == 0) {
                        m15457i(1, hVar4, bVar);
                    }
                }
            }
        }
        m15457i(0, fVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C3527e eVar6 = o1.get(i7);
                if (eVar6 instanceof C3521a) {
                    C3521a aVar2 = (C3521a) eVar6;
                    if (aVar2.mo12587u1() == 1) {
                        m15451c(0, aVar2, bVar, 1, M1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C3527e eVar7 = o1.get(i8);
            if (eVar7.mo12693l0() && m15449a(0, eVar7)) {
                C3530f.m15260P1(0, eVar7, bVar, f11537a, C3542b.C3543a.f11500k);
                if (!(eVar7 instanceof C3533h)) {
                    m15450b(0, eVar7, bVar, M1);
                    m15457i(0, eVar7, bVar);
                } else if (((C3533h) eVar7).mo12778p1() == 0) {
                    m15457i(0, eVar7, bVar);
                } else {
                    m15450b(0, eVar7, bVar, M1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        r13 = r11.f11344P.f11308f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        r7 = r11.f11341N.f11308f;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m15457i(int r16, p082e.p099f.p100a.p104m.C3527e r17, p082e.p099f.p100a.p104m.p105o.C3542b.C3544b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r17.mo12699o0()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = f11539c
            r3 = 1
            int r2 = r2 + r3
            f11539c = r2
            boolean r2 = r0 instanceof p082e.p099f.p100a.p104m.C3530f
            if (r2 != 0) goto L_0x002d
            boolean r2 = r17.mo12693l0()
            if (r2 == 0) goto L_0x002d
            int r2 = r16 + 1
            boolean r4 = m15449a(r2, r0)
            if (r4 == 0) goto L_0x002d
            e.f.a.m.o.b$a r4 = new e.f.a.m.o.b$a
            r4.<init>()
            int r5 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            p082e.p099f.p100a.p104m.C3530f.m15260P1(r2, r0, r1, r4, r5)
        L_0x002d:
            e.f.a.m.d$b r2 = p082e.p099f.p100a.p104m.C3524d.C3526b.TOP
            e.f.a.m.d r2 = r0.mo12702q(r2)
            e.f.a.m.d$b r4 = p082e.p099f.p100a.p104m.C3524d.C3526b.BOTTOM
            e.f.a.m.d r4 = r0.mo12702q(r4)
            int r5 = r2.mo12597e()
            int r6 = r4.mo12597e()
            java.util.HashSet r7 = r2.mo12596d()
            r8 = 0
            r9 = 8
            r10 = 0
            if (r7 == 0) goto L_0x0137
            boolean r7 = r2.mo12606n()
            if (r7 == 0) goto L_0x0137
            java.util.HashSet r2 = r2.mo12596d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0059:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0137
            java.lang.Object r7 = r2.next()
            e.f.a.m.d r7 = (p082e.p099f.p100a.p104m.C3524d) r7
            e.f.a.m.e r11 = r7.f11306d
            int r12 = r16 + 1
            boolean r13 = m15449a(r12, r11)
            boolean r14 = r11.mo12693l0()
            if (r14 == 0) goto L_0x007f
            if (r13 == 0) goto L_0x007f
            e.f.a.m.o.b$a r14 = new e.f.a.m.o.b$a
            r14.<init>()
            int r15 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            p082e.p099f.p100a.p104m.C3530f.m15260P1(r12, r11, r1, r14, r15)
        L_0x007f:
            e.f.a.m.e$b r14 = r11.mo12651S()
            e.f.a.m.e$b r15 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r14 != r15) goto L_0x00e6
            if (r13 == 0) goto L_0x008a
            goto L_0x00e6
        L_0x008a:
            e.f.a.m.e$b r13 = r11.mo12651S()
            if (r13 != r15) goto L_0x0059
            int r13 = r11.f11405z
            if (r13 < 0) goto L_0x0059
            int r13 = r11.f11403y
            if (r13 < 0) goto L_0x0059
            int r13 = r11.mo12655U()
            if (r13 == r9) goto L_0x00aa
            int r13 = r11.f11393t
            if (r13 != 0) goto L_0x0059
            float r13 = r11.mo12716x()
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x0059
        L_0x00aa:
            boolean r13 = r11.mo12687j0()
            if (r13 != 0) goto L_0x0059
            boolean r13 = r11.mo12690k0()
            if (r13 != 0) goto L_0x0059
            e.f.a.m.d r13 = r11.f11341N
            if (r7 != r13) goto L_0x00c6
            e.f.a.m.d r13 = r11.f11344P
            e.f.a.m.d r13 = r13.f11308f
            if (r13 == 0) goto L_0x00c6
            boolean r13 = r13.mo12606n()
            if (r13 != 0) goto L_0x00d6
        L_0x00c6:
            e.f.a.m.d r13 = r11.f11344P
            if (r7 != r13) goto L_0x00d8
            e.f.a.m.d r7 = r11.f11341N
            e.f.a.m.d r7 = r7.f11308f
            if (r7 == 0) goto L_0x00d8
            boolean r7 = r7.mo12606n()
            if (r7 == 0) goto L_0x00d8
        L_0x00d6:
            r7 = 1
            goto L_0x00d9
        L_0x00d8:
            r7 = 0
        L_0x00d9:
            if (r7 == 0) goto L_0x0059
            boolean r7 = r11.mo12687j0()
            if (r7 != 0) goto L_0x0059
            m15455g(r12, r0, r1, r11)
            goto L_0x0059
        L_0x00e6:
            boolean r13 = r11.mo12693l0()
            if (r13 == 0) goto L_0x00ee
            goto L_0x0059
        L_0x00ee:
            e.f.a.m.d r13 = r11.f11341N
            if (r7 != r13) goto L_0x010a
            e.f.a.m.d r14 = r11.f11344P
            e.f.a.m.d r14 = r14.f11308f
            if (r14 != 0) goto L_0x010a
            int r7 = r13.mo12598f()
            int r7 = r7 + r5
            int r13 = r11.mo12720z()
            int r13 = r13 + r7
            r11.mo12626F0(r7, r13)
            m15457i(r12, r11, r1)
            goto L_0x0059
        L_0x010a:
            e.f.a.m.d r14 = r11.f11344P
            if (r7 != r14) goto L_0x0126
            e.f.a.m.d r15 = r14.f11308f
            if (r15 != 0) goto L_0x0126
            int r7 = r14.mo12598f()
            int r7 = r5 - r7
            int r13 = r11.mo12720z()
            int r13 = r7 - r13
            r11.mo12626F0(r13, r7)
            m15457i(r12, r11, r1)
            goto L_0x0059
        L_0x0126:
            if (r7 != r13) goto L_0x0059
            e.f.a.m.d r7 = r14.f11308f
            if (r7 == 0) goto L_0x0059
            boolean r7 = r7.mo12606n()
            if (r7 == 0) goto L_0x0059
            m15454f(r12, r1, r11)
            goto L_0x0059
        L_0x0137:
            boolean r2 = r0 instanceof p082e.p099f.p100a.p104m.C3533h
            if (r2 == 0) goto L_0x013c
            return
        L_0x013c:
            java.util.HashSet r2 = r4.mo12596d()
            if (r2 == 0) goto L_0x022a
            boolean r2 = r4.mo12606n()
            if (r2 == 0) goto L_0x022a
            java.util.HashSet r2 = r4.mo12596d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0150:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x022a
            java.lang.Object r4 = r2.next()
            e.f.a.m.d r4 = (p082e.p099f.p100a.p104m.C3524d) r4
            e.f.a.m.e r5 = r4.f11306d
            int r7 = r16 + 1
            boolean r11 = m15449a(r7, r5)
            boolean r12 = r5.mo12693l0()
            if (r12 == 0) goto L_0x0176
            if (r11 == 0) goto L_0x0176
            e.f.a.m.o.b$a r12 = new e.f.a.m.o.b$a
            r12.<init>()
            int r13 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            p082e.p099f.p100a.p104m.C3530f.m15260P1(r7, r5, r1, r12, r13)
        L_0x0176:
            e.f.a.m.d r12 = r5.f11341N
            if (r4 != r12) goto L_0x0186
            e.f.a.m.d r12 = r5.f11344P
            e.f.a.m.d r12 = r12.f11308f
            if (r12 == 0) goto L_0x0186
            boolean r12 = r12.mo12606n()
            if (r12 != 0) goto L_0x0196
        L_0x0186:
            e.f.a.m.d r12 = r5.f11344P
            if (r4 != r12) goto L_0x0198
            e.f.a.m.d r12 = r5.f11341N
            e.f.a.m.d r12 = r12.f11308f
            if (r12 == 0) goto L_0x0198
            boolean r12 = r12.mo12606n()
            if (r12 == 0) goto L_0x0198
        L_0x0196:
            r12 = 1
            goto L_0x0199
        L_0x0198:
            r12 = 0
        L_0x0199:
            e.f.a.m.e$b r13 = r5.mo12651S()
            e.f.a.m.e$b r14 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x01dd
            if (r11 == 0) goto L_0x01a4
            goto L_0x01dd
        L_0x01a4:
            e.f.a.m.e$b r4 = r5.mo12651S()
            if (r4 != r14) goto L_0x0150
            int r4 = r5.f11405z
            if (r4 < 0) goto L_0x0150
            int r4 = r5.f11403y
            if (r4 < 0) goto L_0x0150
            int r4 = r5.mo12655U()
            if (r4 == r9) goto L_0x01c4
            int r4 = r5.f11393t
            if (r4 != 0) goto L_0x0150
            float r4 = r5.mo12716x()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0150
        L_0x01c4:
            boolean r4 = r5.mo12687j0()
            if (r4 != 0) goto L_0x0150
            boolean r4 = r5.mo12690k0()
            if (r4 != 0) goto L_0x0150
            if (r12 == 0) goto L_0x0150
            boolean r4 = r5.mo12687j0()
            if (r4 != 0) goto L_0x0150
            m15455g(r7, r0, r1, r5)
            goto L_0x0150
        L_0x01dd:
            boolean r11 = r5.mo12693l0()
            if (r11 == 0) goto L_0x01e5
            goto L_0x0150
        L_0x01e5:
            e.f.a.m.d r11 = r5.f11341N
            if (r4 != r11) goto L_0x0201
            e.f.a.m.d r13 = r5.f11344P
            e.f.a.m.d r13 = r13.f11308f
            if (r13 != 0) goto L_0x0201
            int r4 = r11.mo12598f()
            int r4 = r4 + r6
            int r11 = r5.mo12720z()
            int r11 = r11 + r4
            r5.mo12626F0(r4, r11)
            m15457i(r7, r5, r1)
            goto L_0x0150
        L_0x0201:
            e.f.a.m.d r13 = r5.f11344P
            if (r4 != r13) goto L_0x021d
            e.f.a.m.d r4 = r11.f11308f
            if (r4 != 0) goto L_0x021d
            int r4 = r13.mo12598f()
            int r4 = r6 - r4
            int r11 = r5.mo12720z()
            int r11 = r4 - r11
            r5.mo12626F0(r11, r4)
            m15457i(r7, r5, r1)
            goto L_0x0150
        L_0x021d:
            if (r12 == 0) goto L_0x0150
            boolean r4 = r5.mo12687j0()
            if (r4 != 0) goto L_0x0150
            m15454f(r7, r1, r5)
            goto L_0x0150
        L_0x022a:
            e.f.a.m.d$b r2 = p082e.p099f.p100a.p104m.C3524d.C3526b.BASELINE
            e.f.a.m.d r2 = r0.mo12702q(r2)
            java.util.HashSet r4 = r2.mo12596d()
            if (r4 == 0) goto L_0x028f
            boolean r4 = r2.mo12606n()
            if (r4 == 0) goto L_0x028f
            int r4 = r2.mo12597e()
            java.util.HashSet r2 = r2.mo12596d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0248:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x028f
            java.lang.Object r5 = r2.next()
            e.f.a.m.d r5 = (p082e.p099f.p100a.p104m.C3524d) r5
            e.f.a.m.e r6 = r5.f11306d
            int r7 = r16 + 1
            boolean r8 = m15449a(r7, r6)
            boolean r9 = r6.mo12693l0()
            if (r9 == 0) goto L_0x026e
            if (r8 == 0) goto L_0x026e
            e.f.a.m.o.b$a r9 = new e.f.a.m.o.b$a
            r9.<init>()
            int r10 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            p082e.p099f.p100a.p104m.C3530f.m15260P1(r7, r6, r1, r9, r10)
        L_0x026e:
            e.f.a.m.e$b r9 = r6.mo12651S()
            e.f.a.m.e$b r10 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0278
            if (r8 == 0) goto L_0x0248
        L_0x0278:
            boolean r8 = r6.mo12693l0()
            if (r8 == 0) goto L_0x027f
            goto L_0x0248
        L_0x027f:
            e.f.a.m.d r8 = r6.f11345Q
            if (r5 != r8) goto L_0x0248
            int r5 = r5.mo12598f()
            int r5 = r5 + r4
            r6.mo12618B0(r5)
            m15457i(r7, r6, r1)     // Catch:{ all -> 0x0293 }
            goto L_0x0248
        L_0x028f:
            r17.mo12703q0()
            return
        L_0x0293:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3551h.m15457i(int, e.f.a.m.e, e.f.a.m.o.b$b):void");
    }
}
