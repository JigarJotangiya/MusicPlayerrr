package p082e.p099f.p100a.p104m.p105o;

import java.util.ArrayList;
import java.util.Iterator;
import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;

/* renamed from: e.f.a.m.o.c */
/* compiled from: ChainRun */
public class C3545c extends C3562p {

    /* renamed from: k */
    ArrayList<C3562p> f11513k = new ArrayList<>();

    /* renamed from: l */
    private int f11514l;

    public C3545c(C3527e eVar, int i) {
        super(eVar);
        this.f11560f = i;
        m15420q();
    }

    /* renamed from: q */
    private void m15420q() {
        C3527e eVar;
        C3527e eVar2 = this.f11556b;
        C3527e N = eVar2.mo12641N(this.f11560f);
        while (true) {
            C3527e eVar3 = N;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            N = eVar2.mo12641N(this.f11560f);
        }
        this.f11556b = eVar;
        this.f11513k.add(eVar.mo12645P(this.f11560f));
        C3527e L = eVar.mo12637L(this.f11560f);
        while (L != null) {
            this.f11513k.add(L.mo12645P(this.f11560f));
            L = L.mo12637L(this.f11560f);
        }
        Iterator<C3562p> it = this.f11513k.iterator();
        while (it.hasNext()) {
            C3562p next = it.next();
            int i = this.f11560f;
            if (i == 0) {
                next.f11556b.f11357b = this;
            } else if (i == 1) {
                next.f11556b.f11359c = this;
            }
        }
        if ((this.f11560f == 0 && ((C3530f) this.f11556b.mo12639M()).mo12734M1()) && this.f11513k.size() > 1) {
            ArrayList<C3562p> arrayList = this.f11513k;
            this.f11556b = arrayList.get(arrayList.size() - 1).f11556b;
        }
        this.f11514l = this.f11560f == 0 ? this.f11556b.mo12617B() : this.f11556b.mo12649R();
    }

    /* renamed from: r */
    private C3527e m15421r() {
        for (int i = 0; i < this.f11513k.size(); i++) {
            C3562p pVar = this.f11513k.get(i);
            if (pVar.f11556b.mo12655U() != 8) {
                return pVar.f11556b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C3527e m15422s() {
        for (int size = this.f11513k.size() - 1; size >= 0; size--) {
            C3562p pVar = this.f11513k.get(size);
            if (pVar.f11556b.mo12655U() != 8) {
                return pVar.f11556b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12819a(p082e.p099f.p100a.p104m.p105o.C3546d r27) {
        /*
            r26 = this;
            r0 = r26
            e.f.a.m.o.f r1 = r0.f11562h
            boolean r1 = r1.f11532j
            if (r1 == 0) goto L_0x0429
            e.f.a.m.o.f r1 = r0.f11563i
            boolean r1 = r1.f11532j
            if (r1 != 0) goto L_0x0010
            goto L_0x0429
        L_0x0010:
            e.f.a.m.e r1 = r0.f11556b
            e.f.a.m.e r1 = r1.mo12639M()
            boolean r2 = r1 instanceof p082e.p099f.p100a.p104m.C3530f
            if (r2 == 0) goto L_0x0021
            e.f.a.m.f r1 = (p082e.p099f.p100a.p104m.C3530f) r1
            boolean r1 = r1.mo12734M1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            e.f.a.m.o.f r2 = r0.f11563i
            int r2 = r2.f11529g
            e.f.a.m.o.f r4 = r0.f11562h
            int r4 = r4.f11529g
            int r2 = r2 - r4
            java.util.ArrayList<e.f.a.m.o.p> r4 = r0.f11513k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList<e.f.a.m.o.p> r8 = r0.f11513k
            java.lang.Object r8 = r8.get(r5)
            e.f.a.m.o.p r8 = (p082e.p099f.p100a.p104m.p105o.C3562p) r8
            e.f.a.m.e r8 = r8.f11556b
            int r8 = r8.mo12655U()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = -1
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList<e.f.a.m.o.p> r10 = r0.f11513k
            java.lang.Object r10 = r10.get(r9)
            e.f.a.m.o.p r10 = (p082e.p099f.p100a.p104m.p105o.C3562p) r10
            e.f.a.m.e r10 = r10.f11556b
            int r10 = r10.mo12655U()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList<e.f.a.m.o.p> r3 = r0.f11513k
            java.lang.Object r3 = r3.get(r13)
            e.f.a.m.o.p r3 = (p082e.p099f.p100a.p104m.p105o.C3562p) r3
            e.f.a.m.e r11 = r3.f11556b
            int r11 = r11.mo12655U()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            e.f.a.m.o.f r11 = r3.f11562h
            int r11 = r11.f11528f
            int r14 = r14 + r11
        L_0x008e:
            e.f.a.m.o.g r11 = r3.f11559e
            int r7 = r11.f11529g
            e.f.a.m.e$b r10 = r3.f11558d
            e.f.a.m.e$b r12 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f11560f
            if (r11 != 0) goto L_0x00ac
            e.f.a.m.e r12 = r3.f11556b
            e.f.a.m.o.l r12 = r12.f11361d
            e.f.a.m.o.g r12 = r12.f11559e
            boolean r12 = r12.f11532j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            e.f.a.m.e r11 = r3.f11556b
            e.f.a.m.o.n r11 = r11.f11363e
            e.f.a.m.o.g r11 = r11.f11559e
            boolean r11 = r11.f11532j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f11555a
            if (r7 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            int r7 = r11.f11536m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            boolean r7 = r11.f11532j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
        L_0x00d1:
            r10 = 1
            goto L_0x00d5
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            e.f.a.m.e r7 = r3.f11556b
            float[] r7 = r7.f11330H0
            int r10 = r0.f11560f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            e.f.a.m.o.f r3 = r3.f11563i
            int r3 = r3.f11528f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            e.f.a.m.o.f r7 = r0.f11562h
            int r7 = r7.f11529g
            if (r1 == 0) goto L_0x0118
            e.f.a.m.o.f r7 = r0.f11563i
            int r7 = r7.f11529g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x012f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012f
        L_0x0128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012f:
            if (r15 <= 0) goto L_0x0227
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r4) goto L_0x01d9
            java.util.ArrayList<e.f.a.m.o.p> r9 = r0.f11513k
            java.lang.Object r9 = r9.get(r12)
            e.f.a.m.o.p r9 = (p082e.p099f.p100a.p104m.p105o.C3562p) r9
            r19 = r11
            e.f.a.m.e r11 = r9.f11556b
            int r11 = r11.mo12655U()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0155
            goto L_0x01bf
        L_0x0155:
            e.f.a.m.e$b r11 = r9.f11558d
            e.f.a.m.e$b r14 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01bf
            e.f.a.m.o.g r11 = r9.f11559e
            boolean r14 = r11.f11532j
            if (r14 != 0) goto L_0x01bf
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0179
            e.f.a.m.e r14 = r9.f11556b
            float[] r14 = r14.f11330H0
            r21 = r7
            int r7 = r0.f11560f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017d
        L_0x0179:
            r21 = r7
            r7 = r19
        L_0x017d:
            int r14 = r0.f11560f
            if (r14 != 0) goto L_0x018c
            e.f.a.m.e r14 = r9.f11556b
            r22 = r10
            int r10 = r14.f11399w
            int r14 = r14.f11397v
            r23 = r1
            goto L_0x019b
        L_0x018c:
            r22 = r10
            e.f.a.m.e r10 = r9.f11556b
            int r14 = r10.f11405z
            int r10 = r10.f11403y
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x019b:
            int r1 = r9.f11555a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01a9
            int r1 = r11.f11536m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01aa
        L_0x01a9:
            r1 = r7
        L_0x01aa:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01b4
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01b4:
            if (r1 == r7) goto L_0x01b9
            int r13 = r13 + 1
            r7 = r1
        L_0x01b9:
            e.f.a.m.o.g r1 = r9.f11559e
            r1.mo12837d(r7)
            goto L_0x01c7
        L_0x01bf:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
        L_0x01c7:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x01d9:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0218
            int r15 = r15 - r13
            r1 = 0
            r3 = 0
        L_0x01e6:
            if (r1 >= r4) goto L_0x0216
            java.util.ArrayList<e.f.a.m.o.p> r7 = r0.f11513k
            java.lang.Object r7 = r7.get(r1)
            e.f.a.m.o.p r7 = (p082e.p099f.p100a.p104m.p105o.C3562p) r7
            e.f.a.m.e r9 = r7.f11556b
            int r9 = r9.mo12655U()
            r10 = 8
            if (r9 != r10) goto L_0x01fb
            goto L_0x0213
        L_0x01fb:
            if (r1 <= 0) goto L_0x0204
            if (r1 < r5) goto L_0x0204
            e.f.a.m.o.f r9 = r7.f11562h
            int r9 = r9.f11528f
            int r3 = r3 + r9
        L_0x0204:
            e.f.a.m.o.g r9 = r7.f11559e
            int r9 = r9.f11529g
            int r3 = r3 + r9
            if (r1 >= r8) goto L_0x0213
            if (r1 >= r6) goto L_0x0213
            e.f.a.m.o.f r7 = r7.f11563i
            int r7 = r7.f11528f
            int r7 = -r7
            int r3 = r3 + r7
        L_0x0213:
            int r1 = r1 + 1
            goto L_0x01e6
        L_0x0216:
            r14 = r3
            goto L_0x021a
        L_0x0218:
            r14 = r20
        L_0x021a:
            int r1 = r0.f11514l
            r3 = 2
            if (r1 != r3) goto L_0x0225
            if (r13 != 0) goto L_0x0225
            r1 = 0
            r0.f11514l = r1
            goto L_0x0231
        L_0x0225:
            r1 = 0
            goto L_0x0231
        L_0x0227:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x0231:
            if (r14 <= r2) goto L_0x0235
            r0.f11514l = r3
        L_0x0235:
            if (r24 <= 0) goto L_0x023d
            if (r15 != 0) goto L_0x023d
            if (r5 != r6) goto L_0x023d
            r0.f11514l = r3
        L_0x023d:
            int r3 = r0.f11514l
            r7 = 1
            if (r3 != r7) goto L_0x02e1
            r9 = r24
            if (r9 <= r7) goto L_0x024b
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x0252
        L_0x024b:
            if (r9 != r7) goto L_0x0251
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x0252
        L_0x0251:
            r2 = 0
        L_0x0252:
            if (r15 <= 0) goto L_0x0255
            r2 = 0
        L_0x0255:
            r7 = r21
            r3 = 0
        L_0x0258:
            if (r3 >= r4) goto L_0x0429
            if (r23 == 0) goto L_0x0261
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0262
        L_0x0261:
            r1 = r3
        L_0x0262:
            java.util.ArrayList<e.f.a.m.o.p> r9 = r0.f11513k
            java.lang.Object r1 = r9.get(r1)
            e.f.a.m.o.p r1 = (p082e.p099f.p100a.p104m.p105o.C3562p) r1
            e.f.a.m.e r9 = r1.f11556b
            int r9 = r9.mo12655U()
            r10 = 8
            if (r9 != r10) goto L_0x027f
            e.f.a.m.o.f r9 = r1.f11562h
            r9.mo12837d(r7)
            e.f.a.m.o.f r1 = r1.f11563i
            r1.mo12837d(r7)
            goto L_0x02dd
        L_0x027f:
            if (r3 <= 0) goto L_0x0286
            if (r23 == 0) goto L_0x0285
            int r7 = r7 - r2
            goto L_0x0286
        L_0x0285:
            int r7 = r7 + r2
        L_0x0286:
            if (r3 <= 0) goto L_0x0297
            if (r3 < r5) goto L_0x0297
            if (r23 == 0) goto L_0x0292
            e.f.a.m.o.f r9 = r1.f11562h
            int r9 = r9.f11528f
            int r7 = r7 - r9
            goto L_0x0297
        L_0x0292:
            e.f.a.m.o.f r9 = r1.f11562h
            int r9 = r9.f11528f
            int r7 = r7 + r9
        L_0x0297:
            if (r23 == 0) goto L_0x029f
            e.f.a.m.o.f r9 = r1.f11563i
            r9.mo12837d(r7)
            goto L_0x02a4
        L_0x029f:
            e.f.a.m.o.f r9 = r1.f11562h
            r9.mo12837d(r7)
        L_0x02a4:
            e.f.a.m.o.g r9 = r1.f11559e
            int r10 = r9.f11529g
            e.f.a.m.e$b r11 = r1.f11558d
            e.f.a.m.e$b r12 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02b5
            int r11 = r1.f11555a
            r12 = 1
            if (r11 != r12) goto L_0x02b5
            int r10 = r9.f11536m
        L_0x02b5:
            if (r23 == 0) goto L_0x02b9
            int r7 = r7 - r10
            goto L_0x02ba
        L_0x02b9:
            int r7 = r7 + r10
        L_0x02ba:
            if (r23 == 0) goto L_0x02c2
            e.f.a.m.o.f r9 = r1.f11562h
            r9.mo12837d(r7)
            goto L_0x02c7
        L_0x02c2:
            e.f.a.m.o.f r9 = r1.f11563i
            r9.mo12837d(r7)
        L_0x02c7:
            r9 = 1
            r1.f11561g = r9
            if (r3 >= r8) goto L_0x02dd
            if (r3 >= r6) goto L_0x02dd
            if (r23 == 0) goto L_0x02d7
            e.f.a.m.o.f r1 = r1.f11563i
            int r1 = r1.f11528f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02dd
        L_0x02d7:
            e.f.a.m.o.f r1 = r1.f11563i
            int r1 = r1.f11528f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02dd:
            int r3 = r3 + 1
            goto L_0x0258
        L_0x02e1:
            r9 = r24
            if (r3 != 0) goto L_0x0378
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02ed
            r2 = 0
        L_0x02ed:
            r7 = r21
            r3 = 0
        L_0x02f0:
            if (r3 >= r4) goto L_0x0429
            if (r23 == 0) goto L_0x02f9
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02fa
        L_0x02f9:
            r1 = r3
        L_0x02fa:
            java.util.ArrayList<e.f.a.m.o.p> r9 = r0.f11513k
            java.lang.Object r1 = r9.get(r1)
            e.f.a.m.o.p r1 = (p082e.p099f.p100a.p104m.p105o.C3562p) r1
            e.f.a.m.e r9 = r1.f11556b
            int r9 = r9.mo12655U()
            r10 = 8
            if (r9 != r10) goto L_0x0317
            e.f.a.m.o.f r9 = r1.f11562h
            r9.mo12837d(r7)
            e.f.a.m.o.f r1 = r1.f11563i
            r1.mo12837d(r7)
            goto L_0x0374
        L_0x0317:
            if (r23 == 0) goto L_0x031b
            int r7 = r7 - r2
            goto L_0x031c
        L_0x031b:
            int r7 = r7 + r2
        L_0x031c:
            if (r3 <= 0) goto L_0x032d
            if (r3 < r5) goto L_0x032d
            if (r23 == 0) goto L_0x0328
            e.f.a.m.o.f r9 = r1.f11562h
            int r9 = r9.f11528f
            int r7 = r7 - r9
            goto L_0x032d
        L_0x0328:
            e.f.a.m.o.f r9 = r1.f11562h
            int r9 = r9.f11528f
            int r7 = r7 + r9
        L_0x032d:
            if (r23 == 0) goto L_0x0335
            e.f.a.m.o.f r9 = r1.f11563i
            r9.mo12837d(r7)
            goto L_0x033a
        L_0x0335:
            e.f.a.m.o.f r9 = r1.f11562h
            r9.mo12837d(r7)
        L_0x033a:
            e.f.a.m.o.g r9 = r1.f11559e
            int r10 = r9.f11529g
            e.f.a.m.e$b r11 = r1.f11558d
            e.f.a.m.e$b r12 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x034f
            int r11 = r1.f11555a
            r12 = 1
            if (r11 != r12) goto L_0x034f
            int r9 = r9.f11536m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x034f:
            if (r23 == 0) goto L_0x0353
            int r7 = r7 - r10
            goto L_0x0354
        L_0x0353:
            int r7 = r7 + r10
        L_0x0354:
            if (r23 == 0) goto L_0x035c
            e.f.a.m.o.f r9 = r1.f11562h
            r9.mo12837d(r7)
            goto L_0x0361
        L_0x035c:
            e.f.a.m.o.f r9 = r1.f11563i
            r9.mo12837d(r7)
        L_0x0361:
            if (r3 >= r8) goto L_0x0374
            if (r3 >= r6) goto L_0x0374
            if (r23 == 0) goto L_0x036e
            e.f.a.m.o.f r1 = r1.f11563i
            int r1 = r1.f11528f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0374
        L_0x036e:
            e.f.a.m.o.f r1 = r1.f11563i
            int r1 = r1.f11528f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0374:
            int r3 = r3 + 1
            goto L_0x02f0
        L_0x0378:
            r7 = 2
            if (r3 != r7) goto L_0x0429
            int r3 = r0.f11560f
            if (r3 != 0) goto L_0x0386
            e.f.a.m.e r3 = r0.f11556b
            float r3 = r3.mo12615A()
            goto L_0x038c
        L_0x0386:
            e.f.a.m.e r3 = r0.f11556b
            float r3 = r3.mo12647Q()
        L_0x038c:
            if (r23 == 0) goto L_0x0392
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x0392:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x039e
            if (r15 <= 0) goto L_0x039f
        L_0x039e:
            r2 = 0
        L_0x039f:
            if (r23 == 0) goto L_0x03a4
            int r7 = r21 - r2
            goto L_0x03a6
        L_0x03a4:
            int r7 = r21 + r2
        L_0x03a6:
            r3 = 0
        L_0x03a7:
            if (r3 >= r4) goto L_0x0429
            if (r23 == 0) goto L_0x03b0
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x03b1
        L_0x03b0:
            r1 = r3
        L_0x03b1:
            java.util.ArrayList<e.f.a.m.o.p> r2 = r0.f11513k
            java.lang.Object r1 = r2.get(r1)
            e.f.a.m.o.p r1 = (p082e.p099f.p100a.p104m.p105o.C3562p) r1
            e.f.a.m.e r2 = r1.f11556b
            int r2 = r2.mo12655U()
            r9 = 8
            if (r2 != r9) goto L_0x03cf
            e.f.a.m.o.f r2 = r1.f11562h
            r2.mo12837d(r7)
            e.f.a.m.o.f r1 = r1.f11563i
            r1.mo12837d(r7)
            r12 = 1
            goto L_0x0425
        L_0x03cf:
            if (r3 <= 0) goto L_0x03e0
            if (r3 < r5) goto L_0x03e0
            if (r23 == 0) goto L_0x03db
            e.f.a.m.o.f r2 = r1.f11562h
            int r2 = r2.f11528f
            int r7 = r7 - r2
            goto L_0x03e0
        L_0x03db:
            e.f.a.m.o.f r2 = r1.f11562h
            int r2 = r2.f11528f
            int r7 = r7 + r2
        L_0x03e0:
            if (r23 == 0) goto L_0x03e8
            e.f.a.m.o.f r2 = r1.f11563i
            r2.mo12837d(r7)
            goto L_0x03ed
        L_0x03e8:
            e.f.a.m.o.f r2 = r1.f11562h
            r2.mo12837d(r7)
        L_0x03ed:
            e.f.a.m.o.g r2 = r1.f11559e
            int r10 = r2.f11529g
            e.f.a.m.e$b r11 = r1.f11558d
            e.f.a.m.e$b r12 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03ff
            int r11 = r1.f11555a
            r12 = 1
            if (r11 != r12) goto L_0x0400
            int r10 = r2.f11536m
            goto L_0x0400
        L_0x03ff:
            r12 = 1
        L_0x0400:
            if (r23 == 0) goto L_0x0404
            int r7 = r7 - r10
            goto L_0x0405
        L_0x0404:
            int r7 = r7 + r10
        L_0x0405:
            if (r23 == 0) goto L_0x040d
            e.f.a.m.o.f r2 = r1.f11562h
            r2.mo12837d(r7)
            goto L_0x0412
        L_0x040d:
            e.f.a.m.o.f r2 = r1.f11563i
            r2.mo12837d(r7)
        L_0x0412:
            if (r3 >= r8) goto L_0x0425
            if (r3 >= r6) goto L_0x0425
            if (r23 == 0) goto L_0x041f
            e.f.a.m.o.f r1 = r1.f11563i
            int r1 = r1.f11528f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0425
        L_0x041f:
            e.f.a.m.o.f r1 = r1.f11563i
            int r1 = r1.f11528f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0425:
            int r3 = r3 + 1
            goto L_0x03a7
        L_0x0429:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3545c.mo12819a(e.f.a.m.o.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12820d() {
        Iterator<C3562p> it = this.f11513k.iterator();
        while (it.hasNext()) {
            it.next().mo12820d();
        }
        int size = this.f11513k.size();
        if (size >= 1) {
            C3527e eVar = this.f11513k.get(0).f11556b;
            C3527e eVar2 = this.f11513k.get(size - 1).f11556b;
            if (this.f11560f == 0) {
                C3524d dVar = eVar.f11339M;
                C3524d dVar2 = eVar2.f11343O;
                C3548f i = mo12858i(dVar, 0);
                int f = dVar.mo12598f();
                C3527e r = m15421r();
                if (r != null) {
                    f = r.f11339M.mo12598f();
                }
                if (i != null) {
                    mo12854b(this.f11562h, i, f);
                }
                C3548f i2 = mo12858i(dVar2, 0);
                int f2 = dVar2.mo12598f();
                C3527e s = m15422s();
                if (s != null) {
                    f2 = s.f11343O.mo12598f();
                }
                if (i2 != null) {
                    mo12854b(this.f11563i, i2, -f2);
                }
            } else {
                C3524d dVar3 = eVar.f11341N;
                C3524d dVar4 = eVar2.f11344P;
                C3548f i3 = mo12858i(dVar3, 1);
                int f3 = dVar3.mo12598f();
                C3527e r2 = m15421r();
                if (r2 != null) {
                    f3 = r2.f11341N.mo12598f();
                }
                if (i3 != null) {
                    mo12854b(this.f11562h, i3, f3);
                }
                C3548f i4 = mo12858i(dVar4, 1);
                int f4 = dVar4.mo12598f();
                C3527e s2 = m15422s();
                if (s2 != null) {
                    f4 = s2.f11344P.mo12598f();
                }
                if (i4 != null) {
                    mo12854b(this.f11563i, i4, -f4);
                }
            }
            this.f11562h.f11523a = this;
            this.f11563i.f11523a = this;
        }
    }

    /* renamed from: e */
    public void mo12821e() {
        for (int i = 0; i < this.f11513k.size(); i++) {
            this.f11513k.get(i).mo12821e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo12822f() {
        this.f11557c = null;
        Iterator<C3562p> it = this.f11513k.iterator();
        while (it.hasNext()) {
            it.next().mo12822f();
        }
    }

    /* renamed from: j */
    public long mo12823j() {
        int size = this.f11513k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C3562p pVar = this.f11513k.get(i);
            j = j + ((long) pVar.f11562h.f11528f) + pVar.mo12823j() + ((long) pVar.f11563i.f11528f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo12824m() {
        int size = this.f11513k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f11513k.get(i).mo12824m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f11560f == 0 ? "horizontal : " : "vertical : ");
        Iterator<C3562p> it = this.f11513k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
