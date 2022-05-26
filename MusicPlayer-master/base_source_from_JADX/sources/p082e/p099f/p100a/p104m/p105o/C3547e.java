package p082e.p099f.p100a.p104m.p105o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;
import p082e.p099f.p100a.p104m.C3533h;
import p082e.p099f.p100a.p104m.C3536j;
import p082e.p099f.p100a.p104m.p105o.C3542b;

/* renamed from: e.f.a.m.o.e */
/* compiled from: DependencyGraph */
public class C3547e {

    /* renamed from: a */
    private C3530f f11515a;

    /* renamed from: b */
    private boolean f11516b = true;

    /* renamed from: c */
    private boolean f11517c = true;

    /* renamed from: d */
    private C3530f f11518d;

    /* renamed from: e */
    private ArrayList<C3562p> f11519e = new ArrayList<>();

    /* renamed from: f */
    private C3542b.C3544b f11520f;

    /* renamed from: g */
    private C3542b.C3543a f11521g;

    /* renamed from: h */
    ArrayList<C3557m> f11522h;

    public C3547e(C3530f fVar) {
        new ArrayList();
        this.f11520f = null;
        this.f11521g = new C3542b.C3543a();
        this.f11522h = new ArrayList<>();
        this.f11515a = fVar;
        this.f11518d = fVar;
    }

    /* renamed from: a */
    private void m15430a(C3548f fVar, int i, int i2, C3548f fVar2, ArrayList<C3557m> arrayList, C3557m mVar) {
        C3562p pVar = fVar.f11526d;
        if (pVar.f11557c == null) {
            C3530f fVar3 = this.f11515a;
            if (pVar != fVar3.f11361d && pVar != fVar3.f11363e) {
                if (mVar == null) {
                    mVar = new C3557m(pVar, i2);
                    arrayList.add(mVar);
                }
                pVar.f11557c = mVar;
                mVar.mo12841a(pVar);
                for (C3546d next : pVar.f11562h.f11533k) {
                    if (next instanceof C3548f) {
                        m15430a((C3548f) next, i, 0, fVar2, arrayList, mVar);
                    }
                }
                for (C3546d next2 : pVar.f11563i.f11533k) {
                    if (next2 instanceof C3548f) {
                        m15430a((C3548f) next2, i, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i == 1 && (pVar instanceof C3558n)) {
                    for (C3546d next3 : ((C3558n) pVar).f11546k.f11533k) {
                        if (next3 instanceof C3548f) {
                            m15430a((C3548f) next3, i, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (C3548f next4 : pVar.f11562h.f11534l) {
                    if (next4 == fVar2) {
                        mVar.f11543a = true;
                    }
                    m15430a(next4, i, 0, fVar2, arrayList, mVar);
                }
                for (C3548f next5 : pVar.f11563i.f11534l) {
                    if (next5 == fVar2) {
                        mVar.f11543a = true;
                    }
                    m15430a(next5, i, 1, fVar2, arrayList, mVar);
                }
                if (i == 1 && (pVar instanceof C3558n)) {
                    for (C3548f a : ((C3558n) pVar).f11546k.f11534l) {
                        m15430a(a, i, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0288, code lost:
        r4 = r0.f11352X;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15431b(p082e.p099f.p100a.p104m.C3530f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<e.f.a.m.e> r1 = r0.f11496P0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0342
            java.lang.Object r2 = r1.next()
            e.f.a.m.e r2 = (p082e.p099f.p100a.p104m.C3527e) r2
            e.f.a.m.e$b[] r4 = r2.f11352X
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.mo12655U()
            r7 = 8
            if (r6 != r7) goto L_0x0027
            r2.f11355a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f11401x
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0036
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f11391s = r7
        L_0x0036:
            float r6 = r2.f11315A
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f11393t = r7
        L_0x0042:
            float r6 = r2.mo12716x()
            r8 = 0
            r9 = 3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0078
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            e.f.a.m.e$b r8 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r4 == r8) goto L_0x0058
            e.f.a.m.e$b r8 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r4 != r8) goto L_0x005b
        L_0x0058:
            r2.f11391s = r9
            goto L_0x0078
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            e.f.a.m.e$b r8 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r5 == r8) goto L_0x0065
            e.f.a.m.e$b r8 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r5 != r8) goto L_0x0068
        L_0x0065:
            r2.f11393t = r9
            goto L_0x0078
        L_0x0068:
            if (r5 != r6) goto L_0x0078
            if (r4 != r6) goto L_0x0078
            int r6 = r2.f11391s
            if (r6 != 0) goto L_0x0072
            r2.f11391s = r9
        L_0x0072:
            int r6 = r2.f11393t
            if (r6 != 0) goto L_0x0078
            r2.f11393t = r9
        L_0x0078:
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008e
            int r8 = r2.f11391s
            if (r8 != r10) goto L_0x008e
            e.f.a.m.d r8 = r2.f11339M
            e.f.a.m.d r8 = r8.f11308f
            if (r8 == 0) goto L_0x008c
            e.f.a.m.d r8 = r2.f11343O
            e.f.a.m.d r8 = r8.f11308f
            if (r8 != 0) goto L_0x008e
        L_0x008c:
            e.f.a.m.e$b r5 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
        L_0x008e:
            r8 = r5
            if (r4 != r6) goto L_0x00a3
            int r5 = r2.f11393t
            if (r5 != r10) goto L_0x00a3
            e.f.a.m.d r5 = r2.f11341N
            e.f.a.m.d r5 = r5.f11308f
            if (r5 == 0) goto L_0x00a1
            e.f.a.m.d r5 = r2.f11344P
            e.f.a.m.d r5 = r5.f11308f
            if (r5 != 0) goto L_0x00a3
        L_0x00a1:
            e.f.a.m.e$b r4 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
        L_0x00a3:
            r12 = r4
            e.f.a.m.o.l r4 = r2.f11361d
            r4.f11558d = r8
            int r5 = r2.f11391s
            r4.f11555a = r5
            e.f.a.m.o.n r4 = r2.f11363e
            r4.f11558d = r12
            int r13 = r2.f11393t
            r4.f11555a = r13
            e.f.a.m.e$b r4 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_PARENT
            if (r8 == r4) goto L_0x00c0
            e.f.a.m.e$b r14 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r8 == r14) goto L_0x00c0
            e.f.a.m.e$b r14 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r8 != r14) goto L_0x00cc
        L_0x00c0:
            if (r12 == r4) goto L_0x02ec
            e.f.a.m.e$b r14 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r12 == r14) goto L_0x02ec
            e.f.a.m.e$b r14 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cc
            goto L_0x02ec
        L_0x00cc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r6) goto L_0x019e
            e.f.a.m.e$b r15 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d8
            e.f.a.m.e$b r11 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r12 != r11) goto L_0x019e
        L_0x00d8:
            if (r5 != r9) goto L_0x0114
            if (r12 != r15) goto L_0x00e6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.m15434l(r5, r6, r7, r8, r9)
        L_0x00e6:
            int r9 = r2.mo12720z()
            float r3 = (float) r9
            float r4 = r2.f11358b0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            e.f.a.m.e$b r8 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12657V()
            r3.mo12837d(r4)
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12720z()
            r3.mo12837d(r4)
            r2.f11355a = r10
            goto L_0x0008
        L_0x0114:
            if (r5 != r10) goto L_0x012c
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r2 = r2.mo12657V()
            r3.f11536m = r2
            goto L_0x0008
        L_0x012c:
            if (r5 != r7) goto L_0x016c
            e.f.a.m.e$b[] r11 = r0.f11352X
            r15 = r11[r3]
            e.f.a.m.e$b r7 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r15 == r7) goto L_0x013a
            r11 = r11[r3]
            if (r11 != r4) goto L_0x019e
        L_0x013a:
            float r3 = r2.f11401x
            int r4 = r17.mo12657V()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            int r9 = r2.mo12720z()
            r4 = r16
            r5 = r2
            r6 = r7
            r7 = r3
            r8 = r12
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12657V()
            r3.mo12837d(r4)
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12720z()
            r3.mo12837d(r4)
            r2.f11355a = r10
            goto L_0x0008
        L_0x016c:
            e.f.a.m.d[] r7 = r2.f11349U
            r11 = r7[r3]
            e.f.a.m.d r11 = r11.f11308f
            if (r11 == 0) goto L_0x017a
            r7 = r7[r10]
            e.f.a.m.d r7 = r7.f11308f
            if (r7 != 0) goto L_0x019e
        L_0x017a:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12657V()
            r3.mo12837d(r4)
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12720z()
            r3.mo12837d(r4)
            r2.f11355a = r10
            goto L_0x0008
        L_0x019e:
            if (r12 != r6) goto L_0x027a
            e.f.a.m.e$b r11 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r8 == r11) goto L_0x01a8
            e.f.a.m.e$b r7 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r8 != r7) goto L_0x027a
        L_0x01a8:
            if (r13 != r9) goto L_0x01ef
            if (r8 != r11) goto L_0x01b6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.m15434l(r5, r6, r7, r8, r9)
        L_0x01b6:
            int r7 = r2.mo12657V()
            float r3 = r2.f11358b0
            int r4 = r2.mo12718y()
            r5 = -1
            if (r4 != r5) goto L_0x01c7
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c7:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            e.f.a.m.e$b r8 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12657V()
            r3.mo12837d(r4)
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12720z()
            r3.mo12837d(r4)
            r2.f11355a = r10
            goto L_0x0008
        L_0x01ef:
            if (r13 != r10) goto L_0x0207
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r2 = r2.mo12720z()
            r3.f11536m = r2
            goto L_0x0008
        L_0x0207:
            r7 = 2
            if (r13 != r7) goto L_0x0247
            e.f.a.m.e$b[] r7 = r0.f11352X
            r9 = r7[r10]
            e.f.a.m.e$b r11 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r9 == r11) goto L_0x0216
            r7 = r7[r10]
            if (r7 != r4) goto L_0x027a
        L_0x0216:
            float r3 = r2.f11315A
            int r7 = r2.mo12657V()
            int r4 = r17.mo12720z()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r9 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12657V()
            r3.mo12837d(r4)
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12720z()
            r3.mo12837d(r4)
            r2.f11355a = r10
            goto L_0x0008
        L_0x0247:
            e.f.a.m.d[] r4 = r2.f11349U
            r7 = 2
            r15 = r4[r7]
            e.f.a.m.d r7 = r15.f11308f
            if (r7 == 0) goto L_0x0256
            r4 = r4[r9]
            e.f.a.m.d r4 = r4.f11308f
            if (r4 != 0) goto L_0x027a
        L_0x0256:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12657V()
            r3.mo12837d(r4)
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12720z()
            r3.mo12837d(r4)
            r2.f11355a = r10
            goto L_0x0008
        L_0x027a:
            if (r8 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x02cb
            if (r13 != r10) goto L_0x0283
            goto L_0x02cb
        L_0x0283:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            e.f.a.m.e$b[] r4 = r0.f11352X
            r3 = r4[r3]
            e.f.a.m.e$b r8 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f11401x
            float r4 = r2.f11315A
            int r5 = r17.mo12657V()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.mo12720z()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12657V()
            r3.mo12837d(r4)
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12720z()
            r3.mo12837d(r4)
            r2.f11355a = r10
            goto L_0x0008
        L_0x02cb:
            e.f.a.m.e$b r8 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12657V()
            r3.f11536m = r4
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r2 = r2.mo12720z()
            r3.f11536m = r2
            goto L_0x0008
        L_0x02ec:
            int r3 = r2.mo12657V()
            if (r8 != r4) goto L_0x0305
            int r3 = r17.mo12657V()
            e.f.a.m.d r5 = r2.f11339M
            int r5 = r5.f11309g
            int r3 = r3 - r5
            e.f.a.m.d r5 = r2.f11343O
            int r5 = r5.f11309g
            int r3 = r3 - r5
            e.f.a.m.e$b r5 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x0307
        L_0x0305:
            r7 = r3
            r6 = r8
        L_0x0307:
            int r3 = r2.mo12720z()
            if (r12 != r4) goto L_0x0320
            int r3 = r17.mo12720z()
            e.f.a.m.d r4 = r2.f11341N
            int r4 = r4.f11309g
            int r3 = r3 - r4
            e.f.a.m.d r4 = r2.f11344P
            int r4 = r4.f11309g
            int r3 = r3 - r4
            e.f.a.m.e$b r4 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0322
        L_0x0320:
            r9 = r3
            r8 = r12
        L_0x0322:
            r4 = r16
            r5 = r2
            r4.m15434l(r5, r6, r7, r8, r9)
            e.f.a.m.o.l r3 = r2.f11361d
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12657V()
            r3.mo12837d(r4)
            e.f.a.m.o.n r3 = r2.f11363e
            e.f.a.m.o.g r3 = r3.f11559e
            int r4 = r2.mo12720z()
            r3.mo12837d(r4)
            r2.f11355a = r10
            goto L_0x0008
        L_0x0342:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3547e.m15431b(e.f.a.m.f):boolean");
    }

    /* renamed from: e */
    private int m15432e(C3530f fVar, int i) {
        int size = this.f11522h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f11522h.get(i2).mo12842b(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m15433i(C3562p pVar, int i, ArrayList<C3557m> arrayList) {
        for (C3546d next : pVar.f11562h.f11533k) {
            if (next instanceof C3548f) {
                m15430a((C3548f) next, i, 0, pVar.f11563i, arrayList, (C3557m) null);
            } else if (next instanceof C3562p) {
                m15430a(((C3562p) next).f11562h, i, 0, pVar.f11563i, arrayList, (C3557m) null);
            }
        }
        for (C3546d next2 : pVar.f11563i.f11533k) {
            if (next2 instanceof C3548f) {
                m15430a((C3548f) next2, i, 1, pVar.f11562h, arrayList, (C3557m) null);
            } else if (next2 instanceof C3562p) {
                m15430a(((C3562p) next2).f11563i, i, 1, pVar.f11562h, arrayList, (C3557m) null);
            }
        }
        if (i == 1) {
            for (C3546d next3 : ((C3558n) pVar).f11546k.f11533k) {
                if (next3 instanceof C3548f) {
                    m15430a((C3548f) next3, i, 2, (C3548f) null, arrayList, (C3557m) null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m15434l(C3527e eVar, C3527e.C3529b bVar, int i, C3527e.C3529b bVar2, int i2) {
        C3542b.C3543a aVar = this.f11521g;
        aVar.f11503a = bVar;
        aVar.f11504b = bVar2;
        aVar.f11505c = i;
        aVar.f11506d = i2;
        this.f11520f.mo2894b(eVar, aVar);
        eVar.mo12683h1(this.f11521g.f11507e);
        eVar.mo12632I0(this.f11521g.f11508f);
        eVar.mo12630H0(this.f11521g.f11510h);
        eVar.mo12717x0(this.f11521g.f11509g);
    }

    /* renamed from: c */
    public void mo12826c() {
        mo12827d(this.f11519e);
        this.f11522h.clear();
        C3557m.f11542d = 0;
        m15433i(this.f11515a.f11361d, 0, this.f11522h);
        m15433i(this.f11515a.f11363e, 1, this.f11522h);
        this.f11516b = false;
    }

    /* renamed from: d */
    public void mo12827d(ArrayList<C3562p> arrayList) {
        arrayList.clear();
        this.f11518d.f11361d.mo12822f();
        this.f11518d.f11363e.mo12822f();
        arrayList.add(this.f11518d.f11361d);
        arrayList.add(this.f11518d.f11363e);
        Iterator<C3527e> it = this.f11518d.f11496P0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C3527e next = it.next();
            if (next instanceof C3533h) {
                arrayList.add(new C3553j(next));
            } else {
                if (next.mo12682h0()) {
                    if (next.f11357b == null) {
                        next.f11357b = new C3545c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f11357b);
                } else {
                    arrayList.add(next.f11361d);
                }
                if (next.mo12687j0()) {
                    if (next.f11359c == null) {
                        next.f11359c = new C3545c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f11359c);
                } else {
                    arrayList.add(next.f11363e);
                }
                if (next instanceof C3536j) {
                    arrayList.add(new C3554k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<C3562p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo12822f();
        }
        Iterator<C3562p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C3562p next2 = it3.next();
            if (next2.f11556b != this.f11518d) {
                next2.mo12820d();
            }
        }
    }

    /* renamed from: f */
    public boolean mo12828f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f11516b || this.f11517c) {
            Iterator<C3527e> it = this.f11515a.f11496P0.iterator();
            while (it.hasNext()) {
                C3527e next = it.next();
                next.mo12700p();
                next.f11355a = false;
                next.f11361d.mo12839r();
                next.f11363e.mo12843q();
            }
            this.f11515a.mo12700p();
            C3530f fVar = this.f11515a;
            fVar.f11355a = false;
            fVar.f11361d.mo12839r();
            this.f11515a.f11363e.mo12843q();
            this.f11517c = false;
        }
        if (m15431b(this.f11518d)) {
            return false;
        }
        this.f11515a.mo12688j1(0);
        this.f11515a.mo12691k1(0);
        C3527e.C3529b w = this.f11515a.mo12714w(0);
        C3527e.C3529b w2 = this.f11515a.mo12714w(1);
        if (this.f11516b) {
            mo12826c();
        }
        int W = this.f11515a.mo12659W();
        int X = this.f11515a.mo12661X();
        this.f11515a.f11361d.f11562h.mo12837d(W);
        this.f11515a.f11363e.f11562h.mo12837d(X);
        mo12833m();
        C3527e.C3529b bVar = C3527e.C3529b.WRAP_CONTENT;
        if (w == bVar || w2 == bVar) {
            if (z4) {
                Iterator<C3562p> it2 = this.f11519e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo12824m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && w == C3527e.C3529b.WRAP_CONTENT) {
                this.f11515a.mo12640M0(C3527e.C3529b.FIXED);
                C3530f fVar2 = this.f11515a;
                fVar2.mo12683h1(m15432e(fVar2, 0));
                C3530f fVar3 = this.f11515a;
                fVar3.f11361d.f11559e.mo12837d(fVar3.mo12657V());
            }
            if (z4 && w2 == C3527e.C3529b.WRAP_CONTENT) {
                this.f11515a.mo12674d1(C3527e.C3529b.FIXED);
                C3530f fVar4 = this.f11515a;
                fVar4.mo12632I0(m15432e(fVar4, 1));
                C3530f fVar5 = this.f11515a;
                fVar5.f11363e.f11559e.mo12837d(fVar5.mo12720z());
            }
        }
        C3530f fVar6 = this.f11515a;
        C3527e.C3529b[] bVarArr = fVar6.f11352X;
        C3527e.C3529b bVar2 = bVarArr[0];
        C3527e.C3529b bVar3 = C3527e.C3529b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == C3527e.C3529b.MATCH_PARENT) {
            int V = fVar6.mo12657V() + W;
            this.f11515a.f11361d.f11563i.mo12837d(V);
            this.f11515a.f11361d.f11559e.mo12837d(V - W);
            mo12833m();
            C3530f fVar7 = this.f11515a;
            C3527e.C3529b[] bVarArr2 = fVar7.f11352X;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == C3527e.C3529b.MATCH_PARENT) {
                int z5 = fVar7.mo12720z() + X;
                this.f11515a.f11363e.f11563i.mo12837d(z5);
                this.f11515a.f11363e.f11559e.mo12837d(z5 - X);
            }
            mo12833m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<C3562p> it3 = this.f11519e.iterator();
        while (it3.hasNext()) {
            C3562p next2 = it3.next();
            if (next2.f11556b != this.f11515a || next2.f11561g) {
                next2.mo12821e();
            }
        }
        Iterator<C3562p> it4 = this.f11519e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C3562p next3 = it4.next();
            if ((z2 || next3.f11556b != this.f11515a) && (!next3.f11562h.f11532j || ((!next3.f11563i.f11532j && !(next3 instanceof C3553j)) || (!next3.f11559e.f11532j && !(next3 instanceof C3545c) && !(next3 instanceof C3553j))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f11515a.mo12640M0(w);
        this.f11515a.mo12674d1(w2);
        return z3;
    }

    /* renamed from: g */
    public boolean mo12829g(boolean z) {
        if (this.f11516b) {
            Iterator<C3527e> it = this.f11515a.f11496P0.iterator();
            while (it.hasNext()) {
                C3527e next = it.next();
                next.mo12700p();
                next.f11355a = false;
                C3555l lVar = next.f11361d;
                lVar.f11559e.f11532j = false;
                lVar.f11561g = false;
                lVar.mo12839r();
                C3558n nVar = next.f11363e;
                nVar.f11559e.f11532j = false;
                nVar.f11561g = false;
                nVar.mo12843q();
            }
            this.f11515a.mo12700p();
            C3530f fVar = this.f11515a;
            fVar.f11355a = false;
            C3555l lVar2 = fVar.f11361d;
            lVar2.f11559e.f11532j = false;
            lVar2.f11561g = false;
            lVar2.mo12839r();
            C3558n nVar2 = this.f11515a.f11363e;
            nVar2.f11559e.f11532j = false;
            nVar2.f11561g = false;
            nVar2.mo12843q();
            mo12826c();
        }
        if (m15431b(this.f11518d)) {
            return false;
        }
        this.f11515a.mo12688j1(0);
        this.f11515a.mo12691k1(0);
        this.f11515a.f11361d.f11562h.mo12837d(0);
        this.f11515a.f11363e.f11562h.mo12837d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143 A[EDGE_INSN: B:77:0x0143->B:62:0x0143 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12830h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            e.f.a.m.f r1 = r9.f11515a
            r2 = 0
            e.f.a.m.e$b r1 = r1.mo12714w(r2)
            e.f.a.m.f r3 = r9.f11515a
            e.f.a.m.e$b r3 = r3.mo12714w(r0)
            e.f.a.m.f r4 = r9.f11515a
            int r4 = r4.mo12659W()
            e.f.a.m.f r5 = r9.f11515a
            int r5 = r5.mo12661X()
            if (r10 == 0) goto L_0x0089
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<e.f.a.m.o.p> r6 = r9.f11519e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            e.f.a.m.o.p r7 = (p082e.p099f.p100a.p104m.p105o.C3562p) r7
            int r8 = r7.f11560f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo12824m()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            e.f.a.m.e$b r10 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            e.f.a.m.f r10 = r9.f11515a
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r10.mo12640M0(r6)
            e.f.a.m.f r10 = r9.f11515a
            int r6 = r9.m15432e(r10, r2)
            r10.mo12683h1(r6)
            e.f.a.m.f r10 = r9.f11515a
            e.f.a.m.o.l r6 = r10.f11361d
            e.f.a.m.o.g r6 = r6.f11559e
            int r10 = r10.mo12657V()
            r6.mo12837d(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            e.f.a.m.e$b r10 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            e.f.a.m.f r10 = r9.f11515a
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r10.mo12674d1(r6)
            e.f.a.m.f r10 = r9.f11515a
            int r6 = r9.m15432e(r10, r0)
            r10.mo12632I0(r6)
            e.f.a.m.f r10 = r9.f11515a
            e.f.a.m.o.n r6 = r10.f11363e
            e.f.a.m.o.g r6 = r6.f11559e
            int r10 = r10.mo12720z()
            r6.mo12837d(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b4
            e.f.a.m.f r10 = r9.f11515a
            e.f.a.m.e$b[] r5 = r10.f11352X
            r6 = r5[r2]
            e.f.a.m.e$b r7 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r6 == r7) goto L_0x009b
            r5 = r5[r2]
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c5
        L_0x009b:
            int r10 = r10.mo12657V()
            int r10 = r10 + r4
            e.f.a.m.f r5 = r9.f11515a
            e.f.a.m.o.l r5 = r5.f11361d
            e.f.a.m.o.f r5 = r5.f11563i
            r5.mo12837d(r10)
            e.f.a.m.f r5 = r9.f11515a
            e.f.a.m.o.l r5 = r5.f11361d
            e.f.a.m.o.g r5 = r5.f11559e
            int r10 = r10 - r4
            r5.mo12837d(r10)
            goto L_0x00df
        L_0x00b4:
            e.f.a.m.f r10 = r9.f11515a
            e.f.a.m.e$b[] r4 = r10.f11352X
            r6 = r4[r0]
            e.f.a.m.e$b r7 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            if (r6 == r7) goto L_0x00c7
            r4 = r4[r0]
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r10 = 0
            goto L_0x00e0
        L_0x00c7:
            int r10 = r10.mo12720z()
            int r10 = r10 + r5
            e.f.a.m.f r4 = r9.f11515a
            e.f.a.m.o.n r4 = r4.f11363e
            e.f.a.m.o.f r4 = r4.f11563i
            r4.mo12837d(r10)
            e.f.a.m.f r4 = r9.f11515a
            e.f.a.m.o.n r4 = r4.f11363e
            e.f.a.m.o.g r4 = r4.f11559e
            int r10 = r10 - r5
            r4.mo12837d(r10)
        L_0x00df:
            r10 = 1
        L_0x00e0:
            r9.mo12833m()
            java.util.ArrayList<e.f.a.m.o.p> r4 = r9.f11519e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r5 = r4.next()
            e.f.a.m.o.p r5 = (p082e.p099f.p100a.p104m.p105o.C3562p) r5
            int r6 = r5.f11560f
            if (r6 == r11) goto L_0x00fa
            goto L_0x00e9
        L_0x00fa:
            e.f.a.m.e r6 = r5.f11556b
            e.f.a.m.f r7 = r9.f11515a
            if (r6 != r7) goto L_0x0105
            boolean r6 = r5.f11561g
            if (r6 != 0) goto L_0x0105
            goto L_0x00e9
        L_0x0105:
            r5.mo12821e()
            goto L_0x00e9
        L_0x0109:
            java.util.ArrayList<e.f.a.m.o.p> r4 = r9.f11519e
            java.util.Iterator r4 = r4.iterator()
        L_0x010f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0143
            java.lang.Object r5 = r4.next()
            e.f.a.m.o.p r5 = (p082e.p099f.p100a.p104m.p105o.C3562p) r5
            int r6 = r5.f11560f
            if (r6 == r11) goto L_0x0120
            goto L_0x010f
        L_0x0120:
            if (r10 != 0) goto L_0x0129
            e.f.a.m.e r6 = r5.f11556b
            e.f.a.m.f r7 = r9.f11515a
            if (r6 != r7) goto L_0x0129
            goto L_0x010f
        L_0x0129:
            e.f.a.m.o.f r6 = r5.f11562h
            boolean r6 = r6.f11532j
            if (r6 != 0) goto L_0x0131
        L_0x012f:
            r0 = 0
            goto L_0x0143
        L_0x0131:
            e.f.a.m.o.f r6 = r5.f11563i
            boolean r6 = r6.f11532j
            if (r6 != 0) goto L_0x0138
            goto L_0x012f
        L_0x0138:
            boolean r6 = r5 instanceof p082e.p099f.p100a.p104m.p105o.C3545c
            if (r6 != 0) goto L_0x010f
            e.f.a.m.o.g r5 = r5.f11559e
            boolean r5 = r5.f11532j
            if (r5 != 0) goto L_0x010f
            goto L_0x012f
        L_0x0143:
            e.f.a.m.f r10 = r9.f11515a
            r10.mo12640M0(r1)
            e.f.a.m.f r10 = r9.f11515a
            r10.mo12674d1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3547e.mo12830h(boolean, int):boolean");
    }

    /* renamed from: j */
    public void mo12831j() {
        this.f11516b = true;
    }

    /* renamed from: k */
    public void mo12832k() {
        this.f11517c = true;
    }

    /* renamed from: m */
    public void mo12833m() {
        C3550g gVar;
        Iterator<C3527e> it = this.f11515a.f11496P0.iterator();
        while (it.hasNext()) {
            C3527e next = it.next();
            if (!next.f11355a) {
                C3527e.C3529b[] bVarArr = next.f11352X;
                boolean z = false;
                C3527e.C3529b bVar = bVarArr[0];
                C3527e.C3529b bVar2 = bVarArr[1];
                int i = next.f11391s;
                int i2 = next.f11393t;
                C3527e.C3529b bVar3 = C3527e.C3529b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == C3527e.C3529b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == C3527e.C3529b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C3550g gVar2 = next.f11361d.f11559e;
                boolean z3 = gVar2.f11532j;
                C3550g gVar3 = next.f11363e.f11559e;
                boolean z4 = gVar3.f11532j;
                if (z3 && z4) {
                    C3527e.C3529b bVar4 = C3527e.C3529b.FIXED;
                    m15434l(next, bVar4, gVar2.f11529g, bVar4, gVar3.f11529g);
                    next.f11355a = true;
                } else if (z3 && z) {
                    m15434l(next, C3527e.C3529b.FIXED, gVar2.f11529g, bVar3, gVar3.f11529g);
                    if (bVar2 == C3527e.C3529b.MATCH_CONSTRAINT) {
                        next.f11363e.f11559e.f11536m = next.mo12720z();
                    } else {
                        next.f11363e.f11559e.mo12837d(next.mo12720z());
                        next.f11355a = true;
                    }
                } else if (z4 && z2) {
                    m15434l(next, bVar3, gVar2.f11529g, C3527e.C3529b.FIXED, gVar3.f11529g);
                    if (bVar == C3527e.C3529b.MATCH_CONSTRAINT) {
                        next.f11361d.f11559e.f11536m = next.mo12657V();
                    } else {
                        next.f11361d.f11559e.mo12837d(next.mo12657V());
                        next.f11355a = true;
                    }
                }
                if (next.f11355a && (gVar = next.f11363e.f11547l) != null) {
                    gVar.mo12837d(next.mo12704r());
                }
            }
        }
    }

    /* renamed from: n */
    public void mo12834n(C3542b.C3544b bVar) {
        this.f11520f = bVar;
    }
}
