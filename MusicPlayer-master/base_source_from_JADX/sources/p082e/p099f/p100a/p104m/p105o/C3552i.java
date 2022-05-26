package p082e.p099f.p100a.p104m.p105o;

import java.util.ArrayList;
import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3533h;
import p082e.p099f.p100a.p104m.C3536j;

/* renamed from: e.f.a.m.o.i */
/* compiled from: Grouping */
public class C3552i {
    /* renamed from: a */
    public static C3560o m15458a(C3527e eVar, int i, ArrayList<C3560o> arrayList, C3560o oVar) {
        int i2;
        int p1;
        if (i == 0) {
            i2 = eVar.f11340M0;
        } else {
            i2 = eVar.f11342N0;
        }
        int i3 = 0;
        if (i2 != -1 && (oVar == null || i2 != oVar.f11551b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C3560o oVar2 = arrayList.get(i4);
                if (oVar2.mo12847c() == i2) {
                    if (oVar != null) {
                        oVar.mo12850g(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof C3536j) && (p1 = ((C3536j) eVar).mo12791p1(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    C3560o oVar3 = arrayList.get(i5);
                    if (oVar3.mo12847c() == p1) {
                        oVar = oVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (oVar == null) {
                oVar = new C3560o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.mo12845a(eVar)) {
            if (eVar instanceof C3533h) {
                C3533h hVar = (C3533h) eVar;
                C3524d o1 = hVar.mo12777o1();
                if (hVar.mo12778p1() == 0) {
                    i3 = 1;
                }
                o1.mo12595c(i3, arrayList, oVar);
            }
            if (i == 0) {
                eVar.f11340M0 = oVar.mo12847c();
                eVar.f11339M.mo12595c(i, arrayList, oVar);
                eVar.f11343O.mo12595c(i, arrayList, oVar);
            } else {
                eVar.f11342N0 = oVar.mo12847c();
                eVar.f11341N.mo12595c(i, arrayList, oVar);
                eVar.f11345Q.mo12595c(i, arrayList, oVar);
                eVar.f11344P.mo12595c(i, arrayList, oVar);
            }
            eVar.f11348T.mo12595c(i, arrayList, oVar);
        }
        return oVar;
    }

    /* renamed from: b */
    private static C3560o m15459b(ArrayList<C3560o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3560o oVar = arrayList.get(i2);
            if (i == oVar.f11551b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x039e A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m15460c(p082e.p099f.p100a.p104m.C3530f r16, p082e.p099f.p100a.p104m.p105o.C3542b.C3544b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.mo12814o1()
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            e.f.a.m.e r5 = (p082e.p099f.p100a.p104m.C3527e) r5
            e.f.a.m.e$b r6 = r16.mo12619C()
            e.f.a.m.e$b r7 = r16.mo12651S()
            e.f.a.m.e$b r8 = r5.mo12619C()
            e.f.a.m.e$b r9 = r5.mo12651S()
            boolean r6 = m15461d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof p082e.p099f.p100a.p104m.C3531g
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            e.f.a.e r4 = r0.f11415V0
            if (r4 == 0) goto L_0x003e
            long r5 = r4.f11095A
            r7 = 1
            long r5 = r5 + r7
            r4.f11095A = r5
        L_0x003e:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0045:
            if (r5 >= r2) goto L_0x011f
            java.lang.Object r13 = r1.get(r5)
            e.f.a.m.e r13 = (p082e.p099f.p100a.p104m.C3527e) r13
            e.f.a.m.e$b r14 = r16.mo12619C()
            e.f.a.m.e$b r15 = r16.mo12651S()
            e.f.a.m.e$b r4 = r13.mo12619C()
            e.f.a.m.e$b r12 = r13.mo12651S()
            boolean r4 = m15461d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x006d
            e.f.a.m.o.b$a r4 = r0.f11431l1
            int r12 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            r14 = r17
            p082e.p099f.p100a.p104m.C3530f.m15260P1(r3, r13, r14, r4, r12)
            goto L_0x006f
        L_0x006d:
            r14 = r17
        L_0x006f:
            boolean r4 = r13 instanceof p082e.p099f.p100a.p104m.C3533h
            if (r4 == 0) goto L_0x0097
            r12 = r13
            e.f.a.m.h r12 = (p082e.p099f.p100a.p104m.C3533h) r12
            int r15 = r12.mo12778p1()
            if (r15 != 0) goto L_0x0086
            if (r8 != 0) goto L_0x0083
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0083:
            r8.add(r12)
        L_0x0086:
            int r15 = r12.mo12778p1()
            r3 = 1
            if (r15 != r3) goto L_0x0097
            if (r6 != 0) goto L_0x0094
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0094:
            r6.add(r12)
        L_0x0097:
            boolean r3 = r13 instanceof p082e.p099f.p100a.p104m.C3536j
            if (r3 == 0) goto L_0x00db
            boolean r3 = r13 instanceof p082e.p099f.p100a.p104m.C3521a
            if (r3 == 0) goto L_0x00c4
            r3 = r13
            e.f.a.m.a r3 = (p082e.p099f.p100a.p104m.C3521a) r3
            int r12 = r3.mo12587u1()
            if (r12 != 0) goto L_0x00b2
            if (r7 != 0) goto L_0x00af
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00af:
            r7.add(r3)
        L_0x00b2:
            int r12 = r3.mo12587u1()
            r15 = 1
            if (r12 != r15) goto L_0x00db
            if (r9 != 0) goto L_0x00c0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00c0:
            r9.add(r3)
            goto L_0x00db
        L_0x00c4:
            r3 = r13
            e.f.a.m.j r3 = (p082e.p099f.p100a.p104m.C3536j) r3
            if (r7 != 0) goto L_0x00ce
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00ce:
            r7.add(r3)
            if (r9 != 0) goto L_0x00d8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00d8:
            r9.add(r3)
        L_0x00db:
            e.f.a.m.d r3 = r13.f11339M
            e.f.a.m.d r3 = r3.f11308f
            if (r3 != 0) goto L_0x00f7
            e.f.a.m.d r3 = r13.f11343O
            e.f.a.m.d r3 = r3.f11308f
            if (r3 != 0) goto L_0x00f7
            if (r4 != 0) goto L_0x00f7
            boolean r3 = r13 instanceof p082e.p099f.p100a.p104m.C3521a
            if (r3 != 0) goto L_0x00f7
            if (r10 != 0) goto L_0x00f4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x00f4:
            r10.add(r13)
        L_0x00f7:
            e.f.a.m.d r3 = r13.f11341N
            e.f.a.m.d r3 = r3.f11308f
            if (r3 != 0) goto L_0x011a
            e.f.a.m.d r3 = r13.f11344P
            e.f.a.m.d r3 = r3.f11308f
            if (r3 != 0) goto L_0x011a
            e.f.a.m.d r3 = r13.f11345Q
            e.f.a.m.d r3 = r3.f11308f
            if (r3 != 0) goto L_0x011a
            if (r4 != 0) goto L_0x011a
            boolean r3 = r13 instanceof p082e.p099f.p100a.p104m.C3521a
            if (r3 != 0) goto L_0x011a
            if (r11 != 0) goto L_0x0117
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0117:
            r11.add(r13)
        L_0x011a:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0045
        L_0x011f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x013c
            java.util.Iterator r4 = r6.iterator()
        L_0x012a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013c
            java.lang.Object r5 = r4.next()
            e.f.a.m.h r5 = (p082e.p099f.p100a.p104m.C3533h) r5
            r6 = 0
            r12 = 0
            m15458a(r5, r6, r3, r12)
            goto L_0x012a
        L_0x013c:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x015d
            java.util.Iterator r4 = r7.iterator()
        L_0x0144:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x015d
            java.lang.Object r5 = r4.next()
            e.f.a.m.j r5 = (p082e.p099f.p100a.p104m.C3536j) r5
            e.f.a.m.o.o r7 = m15458a(r5, r6, r3, r12)
            r5.mo12790o1(r3, r6, r7)
            r7.mo12846b(r3)
            r6 = 0
            r12 = 0
            goto L_0x0144
        L_0x015d:
            e.f.a.m.d$b r4 = p082e.p099f.p100a.p104m.C3524d.C3526b.LEFT
            e.f.a.m.d r4 = r0.mo12702q(r4)
            java.util.HashSet r5 = r4.mo12596d()
            if (r5 == 0) goto L_0x0185
            java.util.HashSet r4 = r4.mo12596d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0171:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0185
            java.lang.Object r5 = r4.next()
            e.f.a.m.d r5 = (p082e.p099f.p100a.p104m.C3524d) r5
            e.f.a.m.e r5 = r5.f11306d
            r6 = 0
            r7 = 0
            m15458a(r5, r6, r3, r7)
            goto L_0x0171
        L_0x0185:
            e.f.a.m.d$b r4 = p082e.p099f.p100a.p104m.C3524d.C3526b.RIGHT
            e.f.a.m.d r4 = r0.mo12702q(r4)
            java.util.HashSet r5 = r4.mo12596d()
            if (r5 == 0) goto L_0x01ad
            java.util.HashSet r4 = r4.mo12596d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0199:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ad
            java.lang.Object r5 = r4.next()
            e.f.a.m.d r5 = (p082e.p099f.p100a.p104m.C3524d) r5
            e.f.a.m.e r5 = r5.f11306d
            r6 = 0
            r7 = 0
            m15458a(r5, r6, r3, r7)
            goto L_0x0199
        L_0x01ad:
            e.f.a.m.d$b r4 = p082e.p099f.p100a.p104m.C3524d.C3526b.CENTER
            e.f.a.m.d r4 = r0.mo12702q(r4)
            java.util.HashSet r5 = r4.mo12596d()
            if (r5 == 0) goto L_0x01d5
            java.util.HashSet r4 = r4.mo12596d()
            java.util.Iterator r4 = r4.iterator()
        L_0x01c1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01d5
            java.lang.Object r5 = r4.next()
            e.f.a.m.d r5 = (p082e.p099f.p100a.p104m.C3524d) r5
            e.f.a.m.e r5 = r5.f11306d
            r6 = 0
            r7 = 0
            m15458a(r5, r6, r3, r7)
            goto L_0x01c1
        L_0x01d5:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01ed
            java.util.Iterator r4 = r10.iterator()
        L_0x01dd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ed
            java.lang.Object r5 = r4.next()
            e.f.a.m.e r5 = (p082e.p099f.p100a.p104m.C3527e) r5
            m15458a(r5, r6, r3, r7)
            goto L_0x01dd
        L_0x01ed:
            if (r8 == 0) goto L_0x0204
            java.util.Iterator r4 = r8.iterator()
        L_0x01f3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0204
            java.lang.Object r5 = r4.next()
            e.f.a.m.h r5 = (p082e.p099f.p100a.p104m.C3533h) r5
            r6 = 1
            m15458a(r5, r6, r3, r7)
            goto L_0x01f3
        L_0x0204:
            r6 = 1
            if (r9 == 0) goto L_0x0224
            java.util.Iterator r4 = r9.iterator()
        L_0x020b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0224
            java.lang.Object r5 = r4.next()
            e.f.a.m.j r5 = (p082e.p099f.p100a.p104m.C3536j) r5
            e.f.a.m.o.o r8 = m15458a(r5, r6, r3, r7)
            r5.mo12790o1(r3, r6, r8)
            r8.mo12846b(r3)
            r6 = 1
            r7 = 0
            goto L_0x020b
        L_0x0224:
            e.f.a.m.d$b r4 = p082e.p099f.p100a.p104m.C3524d.C3526b.TOP
            e.f.a.m.d r4 = r0.mo12702q(r4)
            java.util.HashSet r5 = r4.mo12596d()
            if (r5 == 0) goto L_0x024c
            java.util.HashSet r4 = r4.mo12596d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0238:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x024c
            java.lang.Object r5 = r4.next()
            e.f.a.m.d r5 = (p082e.p099f.p100a.p104m.C3524d) r5
            e.f.a.m.e r5 = r5.f11306d
            r6 = 1
            r7 = 0
            m15458a(r5, r6, r3, r7)
            goto L_0x0238
        L_0x024c:
            e.f.a.m.d$b r4 = p082e.p099f.p100a.p104m.C3524d.C3526b.BASELINE
            e.f.a.m.d r4 = r0.mo12702q(r4)
            java.util.HashSet r5 = r4.mo12596d()
            if (r5 == 0) goto L_0x0274
            java.util.HashSet r4 = r4.mo12596d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0260:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0274
            java.lang.Object r5 = r4.next()
            e.f.a.m.d r5 = (p082e.p099f.p100a.p104m.C3524d) r5
            e.f.a.m.e r5 = r5.f11306d
            r6 = 1
            r7 = 0
            m15458a(r5, r6, r3, r7)
            goto L_0x0260
        L_0x0274:
            e.f.a.m.d$b r4 = p082e.p099f.p100a.p104m.C3524d.C3526b.BOTTOM
            e.f.a.m.d r4 = r0.mo12702q(r4)
            java.util.HashSet r5 = r4.mo12596d()
            if (r5 == 0) goto L_0x029c
            java.util.HashSet r4 = r4.mo12596d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0288:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x029c
            java.lang.Object r5 = r4.next()
            e.f.a.m.d r5 = (p082e.p099f.p100a.p104m.C3524d) r5
            e.f.a.m.e r5 = r5.f11306d
            r6 = 1
            r7 = 0
            m15458a(r5, r6, r3, r7)
            goto L_0x0288
        L_0x029c:
            e.f.a.m.d$b r4 = p082e.p099f.p100a.p104m.C3524d.C3526b.CENTER
            e.f.a.m.d r4 = r0.mo12702q(r4)
            java.util.HashSet r5 = r4.mo12596d()
            if (r5 == 0) goto L_0x02c4
            java.util.HashSet r4 = r4.mo12596d()
            java.util.Iterator r4 = r4.iterator()
        L_0x02b0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02c4
            java.lang.Object r5 = r4.next()
            e.f.a.m.d r5 = (p082e.p099f.p100a.p104m.C3524d) r5
            e.f.a.m.e r5 = r5.f11306d
            r6 = 1
            r12 = 0
            m15458a(r5, r6, r3, r12)
            goto L_0x02b0
        L_0x02c4:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02dc
            java.util.Iterator r4 = r11.iterator()
        L_0x02cc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02dc
            java.lang.Object r5 = r4.next()
            e.f.a.m.e r5 = (p082e.p099f.p100a.p104m.C3527e) r5
            m15458a(r5, r6, r3, r12)
            goto L_0x02cc
        L_0x02dc:
            r4 = 0
        L_0x02dd:
            if (r4 >= r2) goto L_0x0309
            java.lang.Object r5 = r1.get(r4)
            e.f.a.m.e r5 = (p082e.p099f.p100a.p104m.C3527e) r5
            boolean r6 = r5.mo12705r0()
            if (r6 == 0) goto L_0x0306
            int r6 = r5.f11340M0
            e.f.a.m.o.o r6 = m15459b(r3, r6)
            int r5 = r5.f11342N0
            e.f.a.m.o.o r5 = m15459b(r3, r5)
            if (r6 == 0) goto L_0x0306
            if (r5 == 0) goto L_0x0306
            r7 = 0
            r6.mo12850g(r7, r5)
            r7 = 2
            r5.mo12852i(r7)
            r3.remove(r6)
        L_0x0306:
            int r4 = r4 + 1
            goto L_0x02dd
        L_0x0309:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0312
            r1 = 0
            return r1
        L_0x0312:
            e.f.a.m.e$b r1 = r16.mo12619C()
            e.f.a.m.e$b r2 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0354
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x0320:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0345
            java.lang.Object r4 = r1.next()
            e.f.a.m.o.o r4 = (p082e.p099f.p100a.p104m.p105o.C3560o) r4
            int r5 = r4.mo12848d()
            r7 = 1
            if (r5 != r7) goto L_0x0334
            goto L_0x0320
        L_0x0334:
            r5 = 0
            r4.mo12851h(r5)
            e.f.a.d r7 = r16.mo12729H1()
            int r7 = r4.mo12849f(r7, r5)
            if (r7 <= r6) goto L_0x0320
            r2 = r4
            r6 = r7
            goto L_0x0320
        L_0x0345:
            if (r2 == 0) goto L_0x0354
            e.f.a.m.e$b r1 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r0.mo12640M0(r1)
            r0.mo12683h1(r6)
            r1 = 1
            r2.mo12851h(r1)
            goto L_0x0355
        L_0x0354:
            r2 = r12
        L_0x0355:
            e.f.a.m.e$b r1 = r16.mo12651S()
            e.f.a.m.e$b r4 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r1 != r4) goto L_0x0399
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0363:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0388
            java.lang.Object r4 = r1.next()
            e.f.a.m.o.o r4 = (p082e.p099f.p100a.p104m.p105o.C3560o) r4
            int r5 = r4.mo12848d()
            if (r5 != 0) goto L_0x0376
            goto L_0x0363
        L_0x0376:
            r5 = 0
            r4.mo12851h(r5)
            e.f.a.d r7 = r16.mo12729H1()
            r8 = 1
            int r7 = r4.mo12849f(r7, r8)
            if (r7 <= r6) goto L_0x0363
            r3 = r4
            r6 = r7
            goto L_0x0363
        L_0x0388:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x039b
            e.f.a.m.e$b r1 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r0.mo12674d1(r1)
            r0.mo12632I0(r6)
            r3.mo12851h(r8)
            r4 = r3
            goto L_0x039c
        L_0x0399:
            r5 = 0
            r8 = 1
        L_0x039b:
            r4 = r12
        L_0x039c:
            if (r2 != 0) goto L_0x03a3
            if (r4 == 0) goto L_0x03a1
            goto L_0x03a3
        L_0x03a1:
            r3 = 0
            goto L_0x03a4
        L_0x03a3:
            r3 = 1
        L_0x03a4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3552i.m15460c(e.f.a.m.f, e.f.a.m.o.b$b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m15461d(p082e.p099f.p100a.p104m.C3527e.C3529b r5, p082e.p099f.p100a.p104m.C3527e.C3529b r6, p082e.p099f.p100a.p104m.C3527e.C3529b r7, p082e.p099f.p100a.p104m.C3527e.C3529b r8) {
        /*
            e.f.a.m.e$b r0 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            e.f.a.m.e$b r3 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            e.f.a.m.e$b r4 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            e.f.a.m.e$b r7 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            e.f.a.m.e$b r0 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = 0
            goto L_0x0024
        L_0x0023:
            r6 = 1
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3552i.m15461d(e.f.a.m.e$b, e.f.a.m.e$b, e.f.a.m.e$b, e.f.a.m.e$b):boolean");
    }
}
