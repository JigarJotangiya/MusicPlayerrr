package p082e.p099f.p100a.p104m;

import java.util.ArrayList;
import java.util.HashMap;
import p082e.p099f.p100a.C3484d;
import p082e.p099f.p100a.p104m.C3527e;

/* renamed from: e.f.a.m.g */
/* compiled from: Flow */
public class C3531g extends C3539m {
    /* access modifiers changed from: private */

    /* renamed from: A1 */
    public int f11432A1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: c1 */
    public int f11433c1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: d1 */
    public int f11434d1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: e1 */
    public int f11435e1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public int f11436f1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: g1 */
    public int f11437g1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: h1 */
    public int f11438h1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: i1 */
    public float f11439i1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public float f11440j1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: k1 */
    public float f11441k1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: l1 */
    public float f11442l1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: m1 */
    public float f11443m1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: n1 */
    public float f11444n1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: o1 */
    public int f11445o1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: p1 */
    public int f11446p1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: q1 */
    public int f11447q1 = 2;
    /* access modifiers changed from: private */

    /* renamed from: r1 */
    public int f11448r1 = 2;

    /* renamed from: s1 */
    private int f11449s1 = 0;

    /* renamed from: t1 */
    private int f11450t1 = -1;

    /* renamed from: u1 */
    private int f11451u1 = 0;

    /* renamed from: v1 */
    private ArrayList<C3532a> f11452v1 = new ArrayList<>();

    /* renamed from: w1 */
    private C3527e[] f11453w1 = null;

    /* renamed from: x1 */
    private C3527e[] f11454x1 = null;

    /* renamed from: y1 */
    private int[] f11455y1 = null;
    /* access modifiers changed from: private */

    /* renamed from: z1 */
    public C3527e[] f11456z1;

    /* renamed from: e.f.a.m.g$a */
    /* compiled from: Flow */
    private class C3532a {

        /* renamed from: a */
        private int f11457a = 0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C3527e f11458b = null;

        /* renamed from: c */
        int f11459c = 0;

        /* renamed from: d */
        private C3524d f11460d;

        /* renamed from: e */
        private C3524d f11461e;

        /* renamed from: f */
        private C3524d f11462f;

        /* renamed from: g */
        private C3524d f11463g;

        /* renamed from: h */
        private int f11464h = 0;

        /* renamed from: i */
        private int f11465i = 0;

        /* renamed from: j */
        private int f11466j = 0;

        /* renamed from: k */
        private int f11467k = 0;

        /* renamed from: l */
        private int f11468l = 0;

        /* renamed from: m */
        private int f11469m = 0;

        /* renamed from: n */
        private int f11470n = 0;

        /* renamed from: o */
        private int f11471o = 0;

        /* renamed from: p */
        private int f11472p = 0;

        /* renamed from: q */
        private int f11473q = 0;

        public C3532a(int i, C3524d dVar, C3524d dVar2, C3524d dVar3, C3524d dVar4, int i2) {
            this.f11457a = i;
            this.f11460d = dVar;
            this.f11461e = dVar2;
            this.f11462f = dVar3;
            this.f11463g = dVar4;
            this.f11464h = C3531g.this.mo12810w1();
            this.f11465i = C3531g.this.mo12812y1();
            this.f11466j = C3531g.this.mo12811x1();
            this.f11467k = C3531g.this.mo12809v1();
            this.f11473q = i2;
        }

        /* renamed from: h */
        private void m15344h() {
            this.f11468l = 0;
            this.f11469m = 0;
            this.f11458b = null;
            this.f11459c = 0;
            int i = this.f11471o;
            int i2 = 0;
            while (i2 < i && this.f11470n + i2 < C3531g.this.f11432A1) {
                C3527e eVar = C3531g.this.f11456z1[this.f11470n + i2];
                if (this.f11457a == 0) {
                    int V = eVar.mo12657V();
                    int M1 = C3531g.this.f11445o1;
                    if (eVar.mo12655U() == 8) {
                        M1 = 0;
                    }
                    this.f11468l += V + M1;
                    int Z1 = C3531g.this.m15316h2(eVar, this.f11473q);
                    if (this.f11458b == null || this.f11459c < Z1) {
                        this.f11458b = eVar;
                        this.f11459c = Z1;
                        this.f11469m = Z1;
                    }
                } else {
                    int Y1 = C3531g.this.m15317i2(eVar, this.f11473q);
                    int Z12 = C3531g.this.m15316h2(eVar, this.f11473q);
                    int N1 = C3531g.this.f11446p1;
                    if (eVar.mo12655U() == 8) {
                        N1 = 0;
                    }
                    this.f11469m += Z12 + N1;
                    if (this.f11458b == null || this.f11459c < Y1) {
                        this.f11458b = eVar;
                        this.f11459c = Y1;
                        this.f11468l = Y1;
                    }
                }
                i2++;
            }
        }

        /* renamed from: b */
        public void mo12769b(C3527e eVar) {
            int i = 0;
            if (this.f11457a == 0) {
                int Y1 = C3531g.this.m15317i2(eVar, this.f11473q);
                if (eVar.mo12619C() == C3527e.C3529b.MATCH_CONSTRAINT) {
                    this.f11472p++;
                    Y1 = 0;
                }
                int M1 = C3531g.this.f11445o1;
                if (eVar.mo12655U() != 8) {
                    i = M1;
                }
                this.f11468l += Y1 + i;
                int Z1 = C3531g.this.m15316h2(eVar, this.f11473q);
                if (this.f11458b == null || this.f11459c < Z1) {
                    this.f11458b = eVar;
                    this.f11459c = Z1;
                    this.f11469m = Z1;
                }
            } else {
                int Y12 = C3531g.this.m15317i2(eVar, this.f11473q);
                int Z12 = C3531g.this.m15316h2(eVar, this.f11473q);
                if (eVar.mo12651S() == C3527e.C3529b.MATCH_CONSTRAINT) {
                    this.f11472p++;
                    Z12 = 0;
                }
                int N1 = C3531g.this.f11446p1;
                if (eVar.mo12655U() != 8) {
                    i = N1;
                }
                this.f11469m += Z12 + i;
                if (this.f11458b == null || this.f11459c < Y12) {
                    this.f11458b = eVar;
                    this.f11459c = Y12;
                    this.f11468l = Y12;
                }
            }
            this.f11471o++;
        }

        /* renamed from: c */
        public void mo12770c() {
            this.f11459c = 0;
            this.f11458b = null;
            this.f11468l = 0;
            this.f11469m = 0;
            this.f11470n = 0;
            this.f11471o = 0;
            this.f11472p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo12771d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f11471o
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f11470n
                int r4 = r4 + r3
                e.f.a.m.g r5 = p082e.p099f.p100a.p104m.C3531g.this
                int r5 = r5.f11432A1
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                e.f.a.m.g r4 = p082e.p099f.p100a.p104m.C3531g.this
                e.f.a.m.e[] r4 = r4.f11456z1
                int r5 = r0.f11470n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.mo12711u0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0382
                e.f.a.m.e r3 = r0.f11458b
                if (r3 != 0) goto L_0x002f
                goto L_0x0382
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = 0
            L_0x0036:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f11470n
                int r10 = r10 + r9
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                int r11 = r11.f11432A1
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                e.f.a.m.g r10 = p082e.p099f.p100a.p104m.C3531g.this
                e.f.a.m.e[] r10 = r10.f11456z1
                int r11 = r0.f11470n
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.mo12655U()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                r6 = 0
                int r9 = r0.f11457a
                if (r9 != 0) goto L_0x020c
                e.f.a.m.e r9 = r0.f11458b
                e.f.a.m.g r10 = p082e.p099f.p100a.p104m.C3531g.this
                int r10 = r10.f11434d1
                r9.mo12670b1(r10)
                int r10 = r0.f11465i
                if (r18 <= 0) goto L_0x0084
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                int r11 = r11.f11446p1
                int r10 = r10 + r11
            L_0x0084:
                e.f.a.m.d r11 = r9.f11341N
                e.f.a.m.d r12 = r0.f11461e
                r11.mo12593a(r12, r10)
                if (r19 == 0) goto L_0x0096
                e.f.a.m.d r10 = r9.f11344P
                e.f.a.m.d r11 = r0.f11463g
                int r12 = r0.f11467k
                r10.mo12593a(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                e.f.a.m.d r10 = r0.f11461e
                e.f.a.m.e r10 = r10.f11306d
                e.f.a.m.d r10 = r10.f11344P
                e.f.a.m.d r11 = r9.f11341N
                r10.mo12593a(r11, r2)
            L_0x00a3:
                e.f.a.m.g r10 = p082e.p099f.p100a.p104m.C3531g.this
                int r10 = r10.f11448r1
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r9.mo12663Y()
                if (r10 != 0) goto L_0x00dd
                r10 = 0
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.f11470n
                int r13 = r13 + r12
                e.f.a.m.g r14 = p082e.p099f.p100a.p104m.C3531g.this
                int r14 = r14.f11432A1
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                e.f.a.m.g r13 = p082e.p099f.p100a.p104m.C3531g.this
                e.f.a.m.e[] r13 = r13.f11456z1
                int r14 = r0.f11470n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.mo12663Y()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r9
            L_0x00de:
                r10 = 0
            L_0x00df:
                if (r10 >= r1) goto L_0x0382
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.f11470n
                int r14 = r14 + r13
                e.f.a.m.g r15 = p082e.p099f.p100a.p104m.C3531g.this
                int r15 = r15.f11432A1
                if (r14 < r15) goto L_0x00f5
                goto L_0x0382
            L_0x00f5:
                e.f.a.m.g r14 = p082e.p099f.p100a.p104m.C3531g.this
                e.f.a.m.e[] r14 = r14.f11456z1
                int r15 = r0.f11470n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r6
            L_0x0103:
                r6 = 3
                goto L_0x0206
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                e.f.a.m.d r15 = r14.f11339M
                e.f.a.m.d r11 = r0.f11460d
                int r3 = r0.f11464h
                r14.mo12692l(r15, r11, r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                e.f.a.m.g r3 = p082e.p099f.p100a.p104m.C3531g.this
                int r3 = r3.f11433c1
                r11 = 1065353216(0x3f800000, float:1.0)
                e.f.a.m.g r13 = p082e.p099f.p100a.p104m.C3531g.this
                float r13 = r13.f11439i1
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.f11470n
                if (r15 != 0) goto L_0x0149
                e.f.a.m.g r15 = p082e.p099f.p100a.p104m.C3531g.this
                int r15 = r15.f11435e1
                if (r15 == r5) goto L_0x0149
                e.f.a.m.g r3 = p082e.p099f.p100a.p104m.C3531g.this
                int r3 = r3.f11435e1
                if (r17 == 0) goto L_0x0141
                e.f.a.m.g r13 = p082e.p099f.p100a.p104m.C3531g.this
                float r13 = r13.f11441k1
            L_0x013f:
                float r11 = r11 - r13
                goto L_0x0147
            L_0x0141:
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                float r11 = r11.f11441k1
            L_0x0147:
                r13 = r11
                goto L_0x0169
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                e.f.a.m.g r15 = p082e.p099f.p100a.p104m.C3531g.this
                int r15 = r15.f11437g1
                if (r15 == r5) goto L_0x0169
                e.f.a.m.g r3 = p082e.p099f.p100a.p104m.C3531g.this
                int r3 = r3.f11437g1
                if (r17 == 0) goto L_0x0162
                e.f.a.m.g r13 = p082e.p099f.p100a.p104m.C3531g.this
                float r13 = r13.f11443m1
                goto L_0x013f
            L_0x0162:
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                float r11 = r11.f11443m1
                goto L_0x0147
            L_0x0169:
                r14.mo12636K0(r3)
                r14.mo12634J0(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                e.f.a.m.d r3 = r14.f11343O
                e.f.a.m.d r11 = r0.f11462f
                int r13 = r0.f11466j
                r14.mo12692l(r3, r11, r13)
            L_0x017c:
                if (r6 == 0) goto L_0x01a7
                e.f.a.m.d r3 = r14.f11339M
                e.f.a.m.d r11 = r6.f11343O
                e.f.a.m.g r13 = p082e.p099f.p100a.p104m.C3531g.this
                int r13 = r13.f11445o1
                r3.mo12593a(r11, r13)
                if (r10 != r7) goto L_0x0194
                e.f.a.m.d r3 = r14.f11339M
                int r11 = r0.f11464h
                r3.mo12614u(r11)
            L_0x0194:
                e.f.a.m.d r3 = r6.f11343O
                e.f.a.m.d r11 = r14.f11339M
                r3.mo12593a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                e.f.a.m.d r3 = r6.f11343O
                int r6 = r0.f11466j
                r3.mo12614u(r6)
            L_0x01a7:
                if (r14 == r9) goto L_0x0103
                e.f.a.m.g r3 = p082e.p099f.p100a.p104m.C3531g.this
                int r3 = r3.f11448r1
                r6 = 3
                if (r3 != r6) goto L_0x01c8
                boolean r3 = r12.mo12663Y()
                if (r3 == 0) goto L_0x01c8
                if (r14 == r12) goto L_0x01c8
                boolean r3 = r14.mo12663Y()
                if (r3 == 0) goto L_0x01c8
                e.f.a.m.d r3 = r14.f11345Q
                e.f.a.m.d r11 = r12.f11345Q
                r3.mo12593a(r11, r2)
                goto L_0x0206
            L_0x01c8:
                e.f.a.m.g r3 = p082e.p099f.p100a.p104m.C3531g.this
                int r3 = r3.f11448r1
                if (r3 == 0) goto L_0x01ff
                r11 = 1
                if (r3 == r11) goto L_0x01f7
                if (r4 == 0) goto L_0x01e8
                e.f.a.m.d r3 = r14.f11341N
                e.f.a.m.d r11 = r0.f11461e
                int r13 = r0.f11465i
                r3.mo12593a(r11, r13)
                e.f.a.m.d r3 = r14.f11344P
                e.f.a.m.d r11 = r0.f11463g
                int r13 = r0.f11467k
                r3.mo12593a(r11, r13)
                goto L_0x0206
            L_0x01e8:
                e.f.a.m.d r3 = r14.f11341N
                e.f.a.m.d r11 = r9.f11341N
                r3.mo12593a(r11, r2)
                e.f.a.m.d r3 = r14.f11344P
                e.f.a.m.d r11 = r9.f11344P
                r3.mo12593a(r11, r2)
                goto L_0x0206
            L_0x01f7:
                e.f.a.m.d r3 = r14.f11344P
                e.f.a.m.d r11 = r9.f11344P
                r3.mo12593a(r11, r2)
                goto L_0x0206
            L_0x01ff:
                e.f.a.m.d r3 = r14.f11341N
                e.f.a.m.d r11 = r9.f11341N
                r3.mo12593a(r11, r2)
            L_0x0206:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto L_0x00df
            L_0x020c:
                e.f.a.m.e r3 = r0.f11458b
                e.f.a.m.g r9 = p082e.p099f.p100a.p104m.C3531g.this
                int r9 = r9.f11433c1
                r3.mo12636K0(r9)
                int r9 = r0.f11464h
                if (r18 <= 0) goto L_0x0222
                e.f.a.m.g r10 = p082e.p099f.p100a.p104m.C3531g.this
                int r10 = r10.f11445o1
                int r9 = r9 + r10
            L_0x0222:
                if (r17 == 0) goto L_0x0244
                e.f.a.m.d r10 = r3.f11343O
                e.f.a.m.d r11 = r0.f11462f
                r10.mo12593a(r11, r9)
                if (r19 == 0) goto L_0x0236
                e.f.a.m.d r9 = r3.f11339M
                e.f.a.m.d r10 = r0.f11460d
                int r11 = r0.f11466j
                r9.mo12593a(r10, r11)
            L_0x0236:
                if (r18 <= 0) goto L_0x0263
                e.f.a.m.d r9 = r0.f11462f
                e.f.a.m.e r9 = r9.f11306d
                e.f.a.m.d r9 = r9.f11339M
                e.f.a.m.d r10 = r3.f11343O
                r9.mo12593a(r10, r2)
                goto L_0x0263
            L_0x0244:
                e.f.a.m.d r10 = r3.f11339M
                e.f.a.m.d r11 = r0.f11460d
                r10.mo12593a(r11, r9)
                if (r19 == 0) goto L_0x0256
                e.f.a.m.d r9 = r3.f11343O
                e.f.a.m.d r10 = r0.f11462f
                int r11 = r0.f11466j
                r9.mo12593a(r10, r11)
            L_0x0256:
                if (r18 <= 0) goto L_0x0263
                e.f.a.m.d r9 = r0.f11460d
                e.f.a.m.e r9 = r9.f11306d
                e.f.a.m.d r9 = r9.f11343O
                e.f.a.m.d r10 = r3.f11339M
                r9.mo12593a(r10, r2)
            L_0x0263:
                r9 = 0
            L_0x0264:
                if (r9 >= r1) goto L_0x0382
                int r10 = r0.f11470n
                int r10 = r10 + r9
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                int r11 = r11.f11432A1
                if (r10 < r11) goto L_0x0273
                goto L_0x0382
            L_0x0273:
                e.f.a.m.g r10 = p082e.p099f.p100a.p104m.C3531g.this
                e.f.a.m.e[] r10 = r10.f11456z1
                int r11 = r0.f11470n
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0283
                r12 = 1
                goto L_0x037e
            L_0x0283:
                if (r9 != 0) goto L_0x02cf
                e.f.a.m.d r11 = r10.f11341N
                e.f.a.m.d r12 = r0.f11461e
                int r13 = r0.f11465i
                r10.mo12692l(r11, r12, r13)
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                int r11 = r11.f11434d1
                e.f.a.m.g r12 = p082e.p099f.p100a.p104m.C3531g.this
                float r12 = r12.f11440j1
                int r13 = r0.f11470n
                if (r13 != 0) goto L_0x02b3
                e.f.a.m.g r13 = p082e.p099f.p100a.p104m.C3531g.this
                int r13 = r13.f11436f1
                if (r13 == r5) goto L_0x02b3
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                int r11 = r11.f11436f1
                e.f.a.m.g r12 = p082e.p099f.p100a.p104m.C3531g.this
                float r12 = r12.f11442l1
                goto L_0x02c9
            L_0x02b3:
                if (r19 == 0) goto L_0x02c9
                e.f.a.m.g r13 = p082e.p099f.p100a.p104m.C3531g.this
                int r13 = r13.f11438h1
                if (r13 == r5) goto L_0x02c9
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                int r11 = r11.f11438h1
                e.f.a.m.g r12 = p082e.p099f.p100a.p104m.C3531g.this
                float r12 = r12.f11444n1
            L_0x02c9:
                r10.mo12670b1(r11)
                r10.mo12668a1(r12)
            L_0x02cf:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02dc
                e.f.a.m.d r11 = r10.f11344P
                e.f.a.m.d r12 = r0.f11463g
                int r13 = r0.f11467k
                r10.mo12692l(r11, r12, r13)
            L_0x02dc:
                if (r6 == 0) goto L_0x0307
                e.f.a.m.d r11 = r10.f11341N
                e.f.a.m.d r12 = r6.f11344P
                e.f.a.m.g r13 = p082e.p099f.p100a.p104m.C3531g.this
                int r13 = r13.f11446p1
                r11.mo12593a(r12, r13)
                if (r9 != r7) goto L_0x02f4
                e.f.a.m.d r11 = r10.f11341N
                int r12 = r0.f11465i
                r11.mo12614u(r12)
            L_0x02f4:
                e.f.a.m.d r11 = r6.f11344P
                e.f.a.m.d r12 = r10.f11341N
                r11.mo12593a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x0307
                e.f.a.m.d r6 = r6.f11344P
                int r11 = r0.f11467k
                r6.mo12614u(r11)
            L_0x0307:
                if (r10 == r3) goto L_0x037c
                r6 = 2
                if (r17 == 0) goto L_0x0339
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                int r11 = r11.f11447q1
                if (r11 == 0) goto L_0x0331
                r12 = 1
                if (r11 == r12) goto L_0x0329
                if (r11 == r6) goto L_0x031a
                goto L_0x037c
            L_0x031a:
                e.f.a.m.d r6 = r10.f11339M
                e.f.a.m.d r11 = r3.f11339M
                r6.mo12593a(r11, r2)
                e.f.a.m.d r6 = r10.f11343O
                e.f.a.m.d r11 = r3.f11343O
                r6.mo12593a(r11, r2)
                goto L_0x037c
            L_0x0329:
                e.f.a.m.d r6 = r10.f11339M
                e.f.a.m.d r11 = r3.f11339M
                r6.mo12593a(r11, r2)
                goto L_0x037c
            L_0x0331:
                e.f.a.m.d r6 = r10.f11343O
                e.f.a.m.d r11 = r3.f11343O
                r6.mo12593a(r11, r2)
                goto L_0x037c
            L_0x0339:
                e.f.a.m.g r11 = p082e.p099f.p100a.p104m.C3531g.this
                int r11 = r11.f11447q1
                if (r11 == 0) goto L_0x0373
                r12 = 1
                if (r11 == r12) goto L_0x036b
                if (r11 == r6) goto L_0x0347
                goto L_0x037d
            L_0x0347:
                if (r4 == 0) goto L_0x035c
                e.f.a.m.d r6 = r10.f11339M
                e.f.a.m.d r11 = r0.f11460d
                int r13 = r0.f11464h
                r6.mo12593a(r11, r13)
                e.f.a.m.d r6 = r10.f11343O
                e.f.a.m.d r11 = r0.f11462f
                int r13 = r0.f11466j
                r6.mo12593a(r11, r13)
                goto L_0x037d
            L_0x035c:
                e.f.a.m.d r6 = r10.f11339M
                e.f.a.m.d r11 = r3.f11339M
                r6.mo12593a(r11, r2)
                e.f.a.m.d r6 = r10.f11343O
                e.f.a.m.d r11 = r3.f11343O
                r6.mo12593a(r11, r2)
                goto L_0x037d
            L_0x036b:
                e.f.a.m.d r6 = r10.f11343O
                e.f.a.m.d r11 = r3.f11343O
                r6.mo12593a(r11, r2)
                goto L_0x037d
            L_0x0373:
                r12 = 1
                e.f.a.m.d r6 = r10.f11339M
                e.f.a.m.d r11 = r3.f11339M
                r6.mo12593a(r11, r2)
                goto L_0x037d
            L_0x037c:
                r12 = 1
            L_0x037d:
                r6 = r10
            L_0x037e:
                int r9 = r9 + 1
                goto L_0x0264
            L_0x0382:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.C3531g.C3532a.mo12771d(boolean, int, boolean):void");
        }

        /* renamed from: e */
        public int mo12772e() {
            if (this.f11457a == 1) {
                return this.f11469m - C3531g.this.f11446p1;
            }
            return this.f11469m;
        }

        /* renamed from: f */
        public int mo12773f() {
            if (this.f11457a == 0) {
                return this.f11468l - C3531g.this.f11445o1;
            }
            return this.f11468l;
        }

        /* renamed from: g */
        public void mo12774g(int i) {
            int i2 = this.f11472p;
            if (i2 != 0) {
                int i3 = this.f11471o;
                int i4 = i / i2;
                int i5 = 0;
                while (i5 < i3 && this.f11470n + i5 < C3531g.this.f11432A1) {
                    C3527e eVar = C3531g.this.f11456z1[this.f11470n + i5];
                    if (this.f11457a == 0) {
                        if (eVar != null && eVar.mo12619C() == C3527e.C3529b.MATCH_CONSTRAINT && eVar.f11391s == 0) {
                            C3531g.this.mo12792A1(eVar, C3527e.C3529b.FIXED, i4, eVar.mo12651S(), eVar.mo12720z());
                        }
                    } else if (eVar != null && eVar.mo12651S() == C3527e.C3529b.MATCH_CONSTRAINT && eVar.f11393t == 0) {
                        C3531g.this.mo12792A1(eVar, eVar.mo12619C(), eVar.mo12657V(), C3527e.C3529b.FIXED, i4);
                    }
                    i5++;
                }
                m15344h();
            }
        }

        /* renamed from: i */
        public void mo12775i(int i) {
            this.f11470n = i;
        }

        /* renamed from: j */
        public void mo12776j(int i, C3524d dVar, C3524d dVar2, C3524d dVar3, C3524d dVar4, int i2, int i3, int i4, int i5, int i6) {
            this.f11457a = i;
            this.f11460d = dVar;
            this.f11461e = dVar2;
            this.f11462f = dVar3;
            this.f11463g = dVar4;
            this.f11464h = i2;
            this.f11465i = i3;
            this.f11466j = i4;
            this.f11467k = i5;
            this.f11473q = i6;
        }
    }

    /* renamed from: g2 */
    private void m15315g2(boolean z) {
        C3527e eVar;
        float f;
        int i;
        if (this.f11455y1 != null && this.f11454x1 != null && this.f11453w1 != null) {
            for (int i2 = 0; i2 < this.f11432A1; i2++) {
                this.f11456z1[i2].mo12711u0();
            }
            int[] iArr = this.f11455y1;
            int i3 = iArr[0];
            int i4 = iArr[1];
            C3527e eVar2 = null;
            float f2 = this.f11439i1;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.f11439i1;
                } else {
                    f = f2;
                    i = i5;
                }
                C3527e eVar3 = this.f11454x1[i];
                if (!(eVar3 == null || eVar3.mo12655U() == 8)) {
                    if (i5 == 0) {
                        eVar3.mo12692l(eVar3.f11339M, this.f11339M, mo12810w1());
                        eVar3.mo12636K0(this.f11433c1);
                        eVar3.mo12634J0(f);
                    }
                    if (i5 == i3 - 1) {
                        eVar3.mo12692l(eVar3.f11343O, this.f11343O, mo12811x1());
                    }
                    if (i5 > 0 && eVar2 != null) {
                        eVar3.mo12692l(eVar3.f11339M, eVar2.f11343O, this.f11445o1);
                        eVar2.mo12692l(eVar2.f11343O, eVar3.f11339M, 0);
                    }
                    eVar2 = eVar3;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                C3527e eVar4 = this.f11453w1[i6];
                if (!(eVar4 == null || eVar4.mo12655U() == 8)) {
                    if (i6 == 0) {
                        eVar4.mo12692l(eVar4.f11341N, this.f11341N, mo12812y1());
                        eVar4.mo12670b1(this.f11434d1);
                        eVar4.mo12668a1(this.f11440j1);
                    }
                    if (i6 == i4 - 1) {
                        eVar4.mo12692l(eVar4.f11344P, this.f11344P, mo12809v1());
                    }
                    if (i6 > 0 && eVar2 != null) {
                        eVar4.mo12692l(eVar4.f11341N, eVar2.f11344P, this.f11446p1);
                        eVar2.mo12692l(eVar2.f11344P, eVar4.f11341N, 0);
                    }
                    eVar2 = eVar4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.f11451u1 == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    C3527e[] eVarArr = this.f11456z1;
                    if (!(i9 >= eVarArr.length || (eVar = eVarArr[i9]) == null || eVar.mo12655U() == 8)) {
                        C3527e eVar5 = this.f11454x1[i7];
                        C3527e eVar6 = this.f11453w1[i8];
                        if (eVar != eVar5) {
                            eVar.mo12692l(eVar.f11339M, eVar5.f11339M, 0);
                            eVar.mo12692l(eVar.f11343O, eVar5.f11343O, 0);
                        }
                        if (eVar != eVar6) {
                            eVar.mo12692l(eVar.f11341N, eVar6.f11341N, 0);
                            eVar.mo12692l(eVar.f11344P, eVar6.f11344P, 0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final int m15316h2(C3527e eVar, int i) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.mo12651S() == C3527e.C3529b.MATCH_CONSTRAINT) {
            int i2 = eVar.f11393t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.f11315A * ((float) i));
                if (i3 != eVar.mo12720z()) {
                    eVar.mo12658V0(true);
                    mo12792A1(eVar, eVar.mo12619C(), eVar.mo12657V(), C3527e.C3529b.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return eVar.mo12720z();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) eVar.mo12657V()) * eVar.f11358b0) + 0.5f);
                }
            }
        }
        return eVar.mo12720z();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final int m15317i2(C3527e eVar, int i) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.mo12619C() == C3527e.C3529b.MATCH_CONSTRAINT) {
            int i2 = eVar.f11391s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.f11401x * ((float) i));
                if (i3 != eVar.mo12657V()) {
                    eVar.mo12658V0(true);
                    mo12792A1(eVar, C3527e.C3529b.FIXED, i3, eVar.mo12651S(), eVar.mo12720z());
                }
                return i3;
            } else if (i2 == 1) {
                return eVar.mo12657V();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) eVar.mo12720z()) * eVar.f11358b0) + 0.5f);
                }
            }
        }
        return eVar.mo12657V();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068  */
    /* renamed from: j2 */
    private void m15318j2(p082e.p099f.p100a.p104m.C3527e[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            if (r3 != 0) goto L_0x0030
            int r6 = r0.f11450t1
            if (r6 > 0) goto L_0x002d
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0014:
            if (r7 >= r2) goto L_0x002d
            if (r7 <= 0) goto L_0x001b
            int r9 = r0.f11445o1
            int r8 = r8 + r9
        L_0x001b:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            int r9 = r0.m15317i2(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            int r6 = r6 + 1
        L_0x002a:
            int r7 = r7 + 1
            goto L_0x0014
        L_0x002d:
            r7 = r6
            r6 = 0
            goto L_0x0051
        L_0x0030:
            int r6 = r0.f11450t1
            if (r6 > 0) goto L_0x0050
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0037:
            if (r7 >= r2) goto L_0x0050
            if (r7 <= 0) goto L_0x003e
            int r9 = r0.f11446p1
            int r8 = r8 + r9
        L_0x003e:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0043
            goto L_0x004d
        L_0x0043:
            int r9 = r0.m15316h2(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x004b
            goto L_0x0050
        L_0x004b:
            int r6 = r6 + 1
        L_0x004d:
            int r7 = r7 + 1
            goto L_0x0037
        L_0x0050:
            r7 = 0
        L_0x0051:
            int[] r8 = r0.f11455y1
            if (r8 != 0) goto L_0x005a
            r8 = 2
            int[] r8 = new int[r8]
            r0.f11455y1 = r8
        L_0x005a:
            r8 = 1
            if (r6 != 0) goto L_0x005f
            if (r3 == r8) goto L_0x0063
        L_0x005f:
            if (r7 != 0) goto L_0x0065
            if (r3 != 0) goto L_0x0065
        L_0x0063:
            r9 = 1
            goto L_0x0066
        L_0x0065:
            r9 = 0
        L_0x0066:
            if (r9 != 0) goto L_0x012b
            if (r3 != 0) goto L_0x0074
            float r6 = (float) r2
            float r10 = (float) r7
            float r6 = r6 / r10
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            int r6 = (int) r10
            goto L_0x007d
        L_0x0074:
            float r7 = (float) r2
            float r10 = (float) r6
            float r7 = r7 / r10
            double r10 = (double) r7
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
        L_0x007d:
            e.f.a.m.e[] r10 = r0.f11454x1
            r11 = 0
            if (r10 == 0) goto L_0x008a
            int r12 = r10.length
            if (r12 >= r7) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            java.util.Arrays.fill(r10, r11)
            goto L_0x008e
        L_0x008a:
            e.f.a.m.e[] r10 = new p082e.p099f.p100a.p104m.C3527e[r7]
            r0.f11454x1 = r10
        L_0x008e:
            e.f.a.m.e[] r10 = r0.f11453w1
            if (r10 == 0) goto L_0x009a
            int r12 = r10.length
            if (r12 >= r6) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            java.util.Arrays.fill(r10, r11)
            goto L_0x009e
        L_0x009a:
            e.f.a.m.e[] r10 = new p082e.p099f.p100a.p104m.C3527e[r6]
            r0.f11453w1 = r10
        L_0x009e:
            r10 = 0
        L_0x009f:
            if (r10 >= r7) goto L_0x00e7
            r11 = 0
        L_0x00a2:
            if (r11 >= r6) goto L_0x00e4
            int r12 = r11 * r7
            int r12 = r12 + r10
            if (r3 != r8) goto L_0x00ac
            int r12 = r10 * r6
            int r12 = r12 + r11
        L_0x00ac:
            int r13 = r1.length
            if (r12 < r13) goto L_0x00b0
            goto L_0x00e1
        L_0x00b0:
            r12 = r1[r12]
            if (r12 != 0) goto L_0x00b5
            goto L_0x00e1
        L_0x00b5:
            int r13 = r0.m15317i2(r12, r4)
            e.f.a.m.e[] r14 = r0.f11454x1
            r15 = r14[r10]
            if (r15 == 0) goto L_0x00c7
            r14 = r14[r10]
            int r14 = r14.mo12657V()
            if (r14 >= r13) goto L_0x00cb
        L_0x00c7:
            e.f.a.m.e[] r13 = r0.f11454x1
            r13[r10] = r12
        L_0x00cb:
            int r13 = r0.m15316h2(r12, r4)
            e.f.a.m.e[] r14 = r0.f11453w1
            r15 = r14[r11]
            if (r15 == 0) goto L_0x00dd
            r14 = r14[r11]
            int r14 = r14.mo12720z()
            if (r14 >= r13) goto L_0x00e1
        L_0x00dd:
            e.f.a.m.e[] r13 = r0.f11453w1
            r13[r11] = r12
        L_0x00e1:
            int r11 = r11 + 1
            goto L_0x00a2
        L_0x00e4:
            int r10 = r10 + 1
            goto L_0x009f
        L_0x00e7:
            r10 = 0
            r11 = 0
        L_0x00e9:
            if (r10 >= r7) goto L_0x00fe
            e.f.a.m.e[] r12 = r0.f11454x1
            r12 = r12[r10]
            if (r12 == 0) goto L_0x00fb
            if (r10 <= 0) goto L_0x00f6
            int r13 = r0.f11445o1
            int r11 = r11 + r13
        L_0x00f6:
            int r12 = r0.m15317i2(r12, r4)
            int r11 = r11 + r12
        L_0x00fb:
            int r10 = r10 + 1
            goto L_0x00e9
        L_0x00fe:
            r10 = 0
            r12 = 0
        L_0x0100:
            if (r10 >= r6) goto L_0x0115
            e.f.a.m.e[] r13 = r0.f11453w1
            r13 = r13[r10]
            if (r13 == 0) goto L_0x0112
            if (r10 <= 0) goto L_0x010d
            int r14 = r0.f11446p1
            int r12 = r12 + r14
        L_0x010d:
            int r13 = r0.m15316h2(r13, r4)
            int r12 = r12 + r13
        L_0x0112:
            int r10 = r10 + 1
            goto L_0x0100
        L_0x0115:
            r21[r5] = r11
            r21[r8] = r12
            if (r3 != 0) goto L_0x0123
            if (r11 <= r4) goto L_0x0063
            if (r7 <= r8) goto L_0x0063
            int r7 = r7 + -1
            goto L_0x0066
        L_0x0123:
            if (r12 <= r4) goto L_0x0063
            if (r6 <= r8) goto L_0x0063
            int r6 = r6 + -1
            goto L_0x0066
        L_0x012b:
            int[] r1 = r0.f11455y1
            r1[r5] = r7
            r1[r8] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.C3531g.m15318j2(e.f.a.m.e[], int, int, int, int[]):void");
    }

    /* renamed from: k2 */
    private void m15319k2(C3527e[] eVarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        C3524d dVar;
        int i5;
        int i6;
        int i7;
        C3524d dVar2;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.f11452v1.clear();
            C3532a aVar = new C3532a(i2, this.f11339M, this.f11341N, this.f11343O, this.f11344P, i3);
            this.f11452v1.add(aVar);
            if (i2 == 0) {
                i4 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i13 < i10) {
                    C3527e eVar = eVarArr[i13];
                    int i22 = m15317i2(eVar, i11);
                    if (eVar.mo12619C() == C3527e.C3529b.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i14 = i4;
                    boolean z = (i12 == i11 || (this.f11445o1 + i12) + i22 > i11) && aVar.f11458b != null;
                    if (!z && i13 > 0 && (i9 = this.f11450t1) > 0 && i13 % i9 == 0) {
                        z = true;
                    }
                    if (z) {
                        aVar = new C3532a(i2, this.f11339M, this.f11341N, this.f11343O, this.f11344P, i3);
                        aVar.mo12775i(i13);
                        this.f11452v1.add(aVar);
                    } else if (i13 > 0) {
                        i12 += this.f11445o1 + i22;
                        aVar.mo12769b(eVar);
                        i13++;
                        i4 = i14;
                    }
                    i12 = i22;
                    aVar.mo12769b(eVar);
                    i13++;
                    i4 = i14;
                }
            } else {
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i17 < i10) {
                    C3527e eVar2 = eVarArr[i17];
                    int h2 = m15316h2(eVar2, i11);
                    if (eVar2.mo12651S() == C3527e.C3529b.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i18 = i4;
                    boolean z2 = (i16 == i11 || (this.f11446p1 + i16) + h2 > i11) && aVar.f11458b != null;
                    if (!z2 && i17 > 0 && (i8 = this.f11450t1) > 0 && i17 % i8 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new C3532a(i2, this.f11339M, this.f11341N, this.f11343O, this.f11344P, i3);
                        aVar.mo12775i(i17);
                        this.f11452v1.add(aVar);
                    } else if (i17 > 0) {
                        i16 += this.f11446p1 + h2;
                        aVar.mo12769b(eVar2);
                        i17++;
                        i15 = i18;
                    }
                    i16 = h2;
                    aVar.mo12769b(eVar2);
                    i17++;
                    i15 = i18;
                }
            }
            int size = this.f11452v1.size();
            C3524d dVar3 = this.f11339M;
            C3524d dVar4 = this.f11341N;
            C3524d dVar5 = this.f11343O;
            C3524d dVar6 = this.f11344P;
            int w1 = mo12810w1();
            int y1 = mo12812y1();
            int x1 = mo12811x1();
            int v1 = mo12809v1();
            C3527e.C3529b C = mo12619C();
            C3527e.C3529b bVar = C3527e.C3529b.WRAP_CONTENT;
            boolean z3 = C == bVar || mo12651S() == bVar;
            if (i4 > 0 && z3) {
                for (int i19 = 0; i19 < size; i19++) {
                    C3532a aVar2 = this.f11452v1.get(i19);
                    if (i2 == 0) {
                        aVar2.mo12774g(i11 - aVar2.mo12773f());
                    } else {
                        aVar2.mo12774g(i11 - aVar2.mo12772e());
                    }
                }
            }
            int i20 = y1;
            int i21 = x1;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = w1;
            C3524d dVar7 = dVar4;
            C3524d dVar8 = dVar3;
            int i27 = v1;
            while (i25 < size) {
                C3532a aVar3 = this.f11452v1.get(i25);
                if (i2 == 0) {
                    if (i25 < size - 1) {
                        dVar2 = this.f11452v1.get(i25 + 1).f11458b.f11341N;
                        i7 = 0;
                    } else {
                        dVar2 = this.f11344P;
                        i7 = mo12809v1();
                    }
                    C3524d dVar9 = aVar3.f11458b.f11344P;
                    C3524d dVar10 = dVar8;
                    C3524d dVar11 = dVar8;
                    int i28 = i23;
                    C3524d dVar12 = dVar7;
                    int i29 = i24;
                    C3524d dVar13 = dVar5;
                    C3524d dVar14 = dVar5;
                    i5 = i25;
                    aVar3.mo12776j(i2, dVar10, dVar12, dVar13, dVar2, i26, i20, i21, i7, i3);
                    int max = Math.max(i29, aVar3.mo12773f());
                    i23 = i28 + aVar3.mo12772e();
                    if (i5 > 0) {
                        i23 += this.f11446p1;
                    }
                    dVar8 = dVar11;
                    i24 = max;
                    dVar7 = dVar9;
                    i20 = 0;
                    dVar = dVar14;
                    int i30 = i7;
                    dVar6 = dVar2;
                    i27 = i30;
                } else {
                    C3524d dVar15 = dVar8;
                    int i31 = i23;
                    int i32 = i24;
                    i5 = i25;
                    if (i5 < size - 1) {
                        dVar = this.f11452v1.get(i5 + 1).f11458b.f11339M;
                        i6 = 0;
                    } else {
                        dVar = this.f11343O;
                        i6 = mo12811x1();
                    }
                    C3524d dVar16 = aVar3.f11458b.f11343O;
                    aVar3.mo12776j(i2, dVar15, dVar7, dVar, dVar6, i26, i20, i6, i27, i3);
                    i24 = i32 + aVar3.mo12773f();
                    int max2 = Math.max(i31, aVar3.mo12772e());
                    if (i5 > 0) {
                        i24 += this.f11445o1;
                    }
                    i23 = max2;
                    i21 = i6;
                    dVar8 = dVar16;
                    i26 = 0;
                }
                i25 = i5 + 1;
                int i33 = i3;
                dVar5 = dVar;
            }
            iArr[0] = i24;
            iArr[1] = i23;
        }
    }

    /* renamed from: l2 */
    private void m15320l2(C3527e[] eVarArr, int i, int i2, int i3, int[] iArr) {
        C3532a aVar;
        int i4 = i;
        if (i4 != 0) {
            if (this.f11452v1.size() == 0) {
                aVar = new C3532a(i2, this.f11339M, this.f11341N, this.f11343O, this.f11344P, i3);
                this.f11452v1.add(aVar);
            } else {
                C3532a aVar2 = this.f11452v1.get(0);
                aVar2.mo12770c();
                aVar = aVar2;
                int i5 = i2;
                aVar.mo12776j(i5, this.f11339M, this.f11341N, this.f11343O, this.f11344P, mo12810w1(), mo12812y1(), mo12811x1(), mo12809v1(), i3);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                aVar.mo12769b(eVarArr[i6]);
            }
            iArr[0] = aVar.mo12773f();
            iArr[1] = aVar.mo12772e();
        }
    }

    /* renamed from: A2 */
    public void mo12749A2(int i) {
        this.f11448r1 = i;
    }

    /* renamed from: B2 */
    public void mo12750B2(float f) {
        this.f11440j1 = f;
    }

    /* renamed from: C2 */
    public void mo12751C2(int i) {
        this.f11446p1 = i;
    }

    /* renamed from: D2 */
    public void mo12752D2(int i) {
        this.f11434d1 = i;
    }

    /* renamed from: E2 */
    public void mo12753E2(int i) {
        this.f11449s1 = i;
    }

    /* renamed from: g */
    public void mo12577g(C3484d dVar, boolean z) {
        super.mo12577g(dVar, z);
        boolean z2 = mo12639M() != null && ((C3530f) mo12639M()).mo12734M1();
        int i = this.f11449s1;
        if (i != 0) {
            if (i == 1) {
                int size = this.f11452v1.size();
                int i2 = 0;
                while (i2 < size) {
                    this.f11452v1.get(i2).mo12771d(z2, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                m15315g2(z2);
            }
        } else if (this.f11452v1.size() > 0) {
            this.f11452v1.get(0).mo12771d(z2, 0, true);
        }
        mo12795D1(false);
    }

    /* renamed from: m2 */
    public void mo12754m2(float f) {
        this.f11441k1 = f;
    }

    /* renamed from: n */
    public void mo12580n(C3527e eVar, HashMap<C3527e, C3527e> hashMap) {
        super.mo12580n(eVar, hashMap);
        C3531g gVar = (C3531g) eVar;
        this.f11433c1 = gVar.f11433c1;
        this.f11434d1 = gVar.f11434d1;
        this.f11435e1 = gVar.f11435e1;
        this.f11436f1 = gVar.f11436f1;
        this.f11437g1 = gVar.f11437g1;
        this.f11438h1 = gVar.f11438h1;
        this.f11439i1 = gVar.f11439i1;
        this.f11440j1 = gVar.f11440j1;
        this.f11441k1 = gVar.f11441k1;
        this.f11442l1 = gVar.f11442l1;
        this.f11443m1 = gVar.f11443m1;
        this.f11444n1 = gVar.f11444n1;
        this.f11445o1 = gVar.f11445o1;
        this.f11446p1 = gVar.f11446p1;
        this.f11447q1 = gVar.f11447q1;
        this.f11448r1 = gVar.f11448r1;
        this.f11449s1 = gVar.f11449s1;
        this.f11450t1 = gVar.f11450t1;
        this.f11451u1 = gVar.f11451u1;
    }

    /* renamed from: n2 */
    public void mo12755n2(int i) {
        this.f11435e1 = i;
    }

    /* renamed from: o2 */
    public void mo12756o2(float f) {
        this.f11442l1 = f;
    }

    /* renamed from: p2 */
    public void mo12757p2(int i) {
        this.f11436f1 = i;
    }

    /* renamed from: q2 */
    public void mo12758q2(int i) {
        this.f11447q1 = i;
    }

    /* renamed from: r2 */
    public void mo12759r2(float f) {
        this.f11439i1 = f;
    }

    /* renamed from: s2 */
    public void mo12760s2(int i) {
        this.f11445o1 = i;
    }

    /* renamed from: t2 */
    public void mo12761t2(int i) {
        this.f11433c1 = i;
    }

    /* renamed from: u2 */
    public void mo12762u2(float f) {
        this.f11443m1 = f;
    }

    /* renamed from: v2 */
    public void mo12763v2(int i) {
        this.f11437g1 = i;
    }

    /* renamed from: w2 */
    public void mo12764w2(float f) {
        this.f11444n1 = f;
    }

    /* renamed from: x2 */
    public void mo12765x2(int i) {
        this.f11438h1 = i;
    }

    /* renamed from: y2 */
    public void mo12766y2(int i) {
        this.f11450t1 = i;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12767z1(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.f11483Q0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.mo12793B1()
            if (r0 != 0) goto L_0x001c
            r6.mo12796E1(r11, r11)
            r6.mo12795D1(r11)
            return
        L_0x001c:
            int r12 = r18.mo12810w1()
            int r13 = r18.mo12811x1()
            int r14 = r18.mo12812y1()
            int r15 = r18.mo12809v1()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.f11451u1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004c
            int r2 = r6.f11433c1
            if (r2 != r1) goto L_0x0045
            r6.f11433c1 = r11
        L_0x0045:
            int r2 = r6.f11434d1
            if (r2 != r1) goto L_0x0058
            r6.f11434d1 = r11
            goto L_0x0058
        L_0x004c:
            int r2 = r6.f11433c1
            if (r2 != r1) goto L_0x0052
            r6.f11433c1 = r11
        L_0x0052:
            int r2 = r6.f11434d1
            if (r2 != r1) goto L_0x0058
            r6.f11434d1 = r11
        L_0x0058:
            e.f.a.m.e[] r1 = r6.f11482P0
            r2 = 0
            r3 = 0
        L_0x005c:
            int r11 = r6.f11483Q0
            r0 = 8
            if (r2 >= r11) goto L_0x0072
            e.f.a.m.e[] r11 = r6.f11482P0
            r11 = r11[r2]
            int r11 = r11.mo12655U()
            if (r11 != r0) goto L_0x006e
            int r3 = r3 + 1
        L_0x006e:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005c
        L_0x0072:
            if (r3 <= 0) goto L_0x0091
            int r11 = r11 - r3
            e.f.a.m.e[] r1 = new p082e.p099f.p100a.p104m.C3527e[r11]
            r2 = 0
            r3 = 0
        L_0x0079:
            int r11 = r6.f11483Q0
            if (r2 >= r11) goto L_0x008f
            e.f.a.m.e[] r11 = r6.f11482P0
            r11 = r11[r2]
            int r4 = r11.mo12655U()
            if (r4 == r0) goto L_0x008b
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x008b:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0079
        L_0x008f:
            r2 = r3
            goto L_0x0092
        L_0x0091:
            r2 = r11
        L_0x0092:
            r6.f11456z1 = r1
            r6.f11432A1 = r2
            int r0 = r6.f11449s1
            if (r0 == 0) goto L_0x00bf
            r4 = 1
            if (r0 == r4) goto L_0x00b2
            r3 = 2
            if (r0 == r3) goto L_0x00a5
            r17 = r5
            r0 = 0
            r11 = 1
            goto L_0x00cc
        L_0x00a5:
            int r3 = r6.f11451u1
            r0 = r18
            r11 = 1
            r4 = r16
            r17 = r5
            r0.m15318j2(r1, r2, r3, r4, r5)
            goto L_0x00cb
        L_0x00b2:
            r17 = r5
            r11 = 1
            int r3 = r6.f11451u1
            r0 = r18
            r4 = r16
            r0.m15319k2(r1, r2, r3, r4, r5)
            goto L_0x00cb
        L_0x00bf:
            r17 = r5
            r11 = 1
            int r3 = r6.f11451u1
            r0 = r18
            r4 = r16
            r0.m15320l2(r1, r2, r3, r4, r5)
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00dc
            r1 = r8
            goto L_0x00e7
        L_0x00dc:
            if (r7 != r3) goto L_0x00e3
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00e7
        L_0x00e3:
            if (r7 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r1 = 0
        L_0x00e7:
            if (r9 != r4) goto L_0x00eb
            r2 = r10
            goto L_0x00f6
        L_0x00eb:
            if (r9 != r3) goto L_0x00f2
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x00f6
        L_0x00f2:
            if (r9 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            r6.mo12796E1(r1, r2)
            r6.mo12683h1(r1)
            r6.mo12632I0(r2)
            int r1 = r6.f11483Q0
            if (r1 <= 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r11 = 0
        L_0x0105:
            r6.mo12795D1(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.C3531g.mo12767z1(int, int, int, int):void");
    }

    /* renamed from: z2 */
    public void mo12768z2(int i) {
        this.f11451u1 = i;
    }
}
