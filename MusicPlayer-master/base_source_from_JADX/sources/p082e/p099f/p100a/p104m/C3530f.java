package p082e.p099f.p100a.p104m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p082e.p099f.p100a.C3484d;
import p082e.p099f.p100a.C3487e;
import p082e.p099f.p100a.C3493i;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.p105o.C3542b;
import p082e.p099f.p100a.p104m.p105o.C3547e;

/* renamed from: e.f.a.m.f */
/* compiled from: ConstraintWidgetContainer */
public class C3530f extends C3540n {

    /* renamed from: Q0 */
    C3542b f11410Q0 = new C3542b(this);

    /* renamed from: R0 */
    public C3547e f11411R0 = new C3547e(this);

    /* renamed from: S0 */
    private int f11412S0;

    /* renamed from: T0 */
    protected C3542b.C3544b f11413T0 = null;

    /* renamed from: U0 */
    private boolean f11414U0 = false;

    /* renamed from: V0 */
    public C3487e f11415V0;

    /* renamed from: W0 */
    protected C3484d f11416W0 = new C3484d();

    /* renamed from: X0 */
    int f11417X0;

    /* renamed from: Y0 */
    int f11418Y0;

    /* renamed from: Z0 */
    public int f11419Z0 = 0;

    /* renamed from: a1 */
    public int f11420a1 = 0;

    /* renamed from: b1 */
    C3523c[] f11421b1 = new C3523c[4];

    /* renamed from: c1 */
    C3523c[] f11422c1 = new C3523c[4];

    /* renamed from: d1 */
    private int f11423d1 = 257;

    /* renamed from: e1 */
    private boolean f11424e1 = false;

    /* renamed from: f1 */
    private boolean f11425f1 = false;

    /* renamed from: g1 */
    private WeakReference<C3524d> f11426g1 = null;

    /* renamed from: h1 */
    private WeakReference<C3524d> f11427h1 = null;

    /* renamed from: i1 */
    private WeakReference<C3524d> f11428i1 = null;

    /* renamed from: j1 */
    private WeakReference<C3524d> f11429j1 = null;

    /* renamed from: k1 */
    HashSet<C3527e> f11430k1 = new HashSet<>();

    /* renamed from: l1 */
    public C3542b.C3543a f11431l1 = new C3542b.C3543a();

    /* renamed from: P1 */
    public static boolean m15260P1(int i, C3527e eVar, C3542b.C3544b bVar, C3542b.C3543a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (eVar.mo12655U() == 8 || (eVar instanceof C3533h) || (eVar instanceof C3521a)) {
            aVar.f11507e = 0;
            aVar.f11508f = 0;
            return false;
        }
        aVar.f11503a = eVar.mo12619C();
        aVar.f11504b = eVar.mo12651S();
        aVar.f11505c = eVar.mo12657V();
        aVar.f11506d = eVar.mo12720z();
        aVar.f11511i = false;
        aVar.f11512j = i2;
        C3527e.C3529b bVar2 = aVar.f11503a;
        C3527e.C3529b bVar3 = C3527e.C3529b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f11504b == bVar3;
        boolean z3 = z && eVar.f11358b0 > 0.0f;
        boolean z4 = z2 && eVar.f11358b0 > 0.0f;
        if (z && eVar.mo12665Z(0) && eVar.f11391s == 0 && !z3) {
            aVar.f11503a = C3527e.C3529b.WRAP_CONTENT;
            if (z2 && eVar.f11393t == 0) {
                aVar.f11503a = C3527e.C3529b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.mo12665Z(1) && eVar.f11393t == 0 && !z4) {
            aVar.f11504b = C3527e.C3529b.WRAP_CONTENT;
            if (z && eVar.f11391s == 0) {
                aVar.f11504b = C3527e.C3529b.FIXED;
            }
            z2 = false;
        }
        if (eVar.mo12579m0()) {
            aVar.f11503a = C3527e.C3529b.FIXED;
            z = false;
        }
        if (eVar.mo12581n0()) {
            aVar.f11504b = C3527e.C3529b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.f11395u[0] == 4) {
                aVar.f11503a = C3527e.C3529b.FIXED;
            } else if (!z2) {
                C3527e.C3529b bVar4 = aVar.f11504b;
                C3527e.C3529b bVar5 = C3527e.C3529b.FIXED;
                if (bVar4 == bVar5) {
                    i4 = aVar.f11506d;
                } else {
                    aVar.f11503a = C3527e.C3529b.WRAP_CONTENT;
                    bVar.mo2894b(eVar, aVar);
                    i4 = aVar.f11508f;
                }
                aVar.f11503a = bVar5;
                aVar.f11505c = (int) (eVar.mo12716x() * ((float) i4));
            }
        }
        if (z4) {
            if (eVar.f11395u[1] == 4) {
                aVar.f11504b = C3527e.C3529b.FIXED;
            } else if (!z) {
                C3527e.C3529b bVar6 = aVar.f11503a;
                C3527e.C3529b bVar7 = C3527e.C3529b.FIXED;
                if (bVar6 == bVar7) {
                    i3 = aVar.f11505c;
                } else {
                    aVar.f11504b = C3527e.C3529b.WRAP_CONTENT;
                    bVar.mo2894b(eVar, aVar);
                    i3 = aVar.f11507e;
                }
                aVar.f11504b = bVar7;
                if (eVar.mo12718y() == -1) {
                    aVar.f11506d = (int) (((float) i3) / eVar.mo12716x());
                } else {
                    aVar.f11506d = (int) (eVar.mo12716x() * ((float) i3));
                }
            }
        }
        bVar.mo2894b(eVar, aVar);
        eVar.mo12683h1(aVar.f11507e);
        eVar.mo12632I0(aVar.f11508f);
        eVar.mo12630H0(aVar.f11510h);
        eVar.mo12717x0(aVar.f11509g);
        aVar.f11512j = C3542b.C3543a.f11500k;
        return aVar.f11511i;
    }

    /* renamed from: R1 */
    private void m15261R1() {
        this.f11419Z0 = 0;
        this.f11420a1 = 0;
    }

    /* renamed from: u1 */
    private void m15262u1(C3527e eVar) {
        int i = this.f11419Z0 + 1;
        C3523c[] cVarArr = this.f11422c1;
        if (i >= cVarArr.length) {
            this.f11422c1 = (C3523c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f11422c1[this.f11419Z0] = new C3523c(eVar, 0, mo12734M1());
        this.f11419Z0++;
    }

    /* renamed from: x1 */
    private void m15263x1(C3524d dVar, C3493i iVar) {
        this.f11416W0.mo12472h(iVar, this.f11416W0.mo12479q(dVar), 0, 5);
    }

    /* renamed from: y1 */
    private void m15264y1(C3524d dVar, C3493i iVar) {
        this.f11416W0.mo12472h(this.f11416W0.mo12479q(dVar), iVar, 0, 5);
    }

    /* renamed from: z1 */
    private void m15265z1(C3527e eVar) {
        int i = this.f11420a1 + 1;
        C3523c[] cVarArr = this.f11421b1;
        if (i >= cVarArr.length) {
            this.f11421b1 = (C3523c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f11421b1[this.f11420a1] = new C3523c(eVar, 1, mo12734M1());
        this.f11420a1++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A1 */
    public void mo12722A1(C3524d dVar) {
        WeakReference<C3524d> weakReference = this.f11428i1;
        if (weakReference == null || weakReference.get() == null || dVar.mo12597e() > ((C3524d) this.f11428i1.get()).mo12597e()) {
            this.f11428i1 = new WeakReference<>(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void mo12723B1(C3524d dVar) {
        WeakReference<C3524d> weakReference = this.f11426g1;
        if (weakReference == null || weakReference.get() == null || dVar.mo12597e() > ((C3524d) this.f11426g1.get()).mo12597e()) {
            this.f11426g1 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: C1 */
    public boolean mo12724C1(boolean z) {
        return this.f11411R0.mo12828f(z);
    }

    /* renamed from: D1 */
    public boolean mo12725D1(boolean z) {
        return this.f11411R0.mo12829g(z);
    }

    /* renamed from: E1 */
    public boolean mo12726E1(boolean z, int i) {
        return this.f11411R0.mo12830h(z, i);
    }

    /* renamed from: F1 */
    public C3542b.C3544b mo12727F1() {
        return this.f11413T0;
    }

    /* renamed from: G1 */
    public int mo12728G1() {
        return this.f11423d1;
    }

    /* renamed from: H1 */
    public C3484d mo12729H1() {
        return this.f11416W0;
    }

    /* renamed from: I1 */
    public boolean mo12730I1() {
        return false;
    }

    /* renamed from: J1 */
    public void mo12731J1() {
        this.f11411R0.mo12831j();
    }

    /* renamed from: K1 */
    public void mo12732K1() {
        this.f11411R0.mo12832k();
    }

    /* renamed from: L1 */
    public boolean mo12733L1() {
        return this.f11425f1;
    }

    /* renamed from: M1 */
    public boolean mo12734M1() {
        return this.f11414U0;
    }

    /* renamed from: N1 */
    public boolean mo12735N1() {
        return this.f11424e1;
    }

    /* renamed from: O1 */
    public long mo12736O1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f11417X0 = i10;
        int i11 = i9;
        this.f11418Y0 = i11;
        return this.f11410Q0.mo12817d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: Q1 */
    public boolean mo12737Q1(int i) {
        return (this.f11423d1 & i) == i;
    }

    /* renamed from: S1 */
    public void mo12738S1(C3542b.C3544b bVar) {
        this.f11413T0 = bVar;
        this.f11411R0.mo12834n(bVar);
    }

    /* renamed from: T1 */
    public void mo12739T1(int i) {
        this.f11423d1 = i;
        C3484d.f11069r = mo12737Q1(512);
    }

    /* renamed from: U1 */
    public void mo12740U1(int i) {
        this.f11412S0 = i;
    }

    /* renamed from: V1 */
    public void mo12741V1(boolean z) {
        this.f11414U0 = z;
    }

    /* renamed from: W1 */
    public boolean mo12742W1(C3484d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean Q1 = mo12737Q1(64);
        mo12697n1(dVar, Q1);
        int size = this.f11496P0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C3527e eVar = this.f11496P0.get(i);
            eVar.mo12697n1(dVar, Q1);
            if (eVar.mo12669b0()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: X1 */
    public void mo12743X1() {
        this.f11410Q0.mo12818e(this);
    }

    /* renamed from: m1 */
    public void mo12696m1(boolean z, boolean z2) {
        super.mo12696m1(z, z2);
        int size = this.f11496P0.size();
        for (int i = 0; i < size; i++) {
            this.f11496P0.get(i).mo12696m1(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x031d  */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12744p1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f11362d0 = r2
            r1.f11364e0 = r2
            r1.f11424e1 = r2
            r1.f11425f1 = r2
            java.util.ArrayList<e.f.a.m.e> r0 = r1.f11496P0
            int r3 = r0.size()
            int r0 = r18.mo12657V()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.mo12720z()
            int r4 = java.lang.Math.max(r2, r4)
            e.f.a.m.e$b[] r5 = r1.f11352X
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            e.f.a.e r8 = r1.f11415V0
            if (r8 == 0) goto L_0x0033
            long r9 = r8.f11121z
            r11 = 1
            long r9 = r9 + r11
            r8.f11121z = r9
        L_0x0033:
            int r8 = r1.f11412S0
            if (r8 != 0) goto L_0x0093
            int r8 = r1.f11423d1
            boolean r8 = p082e.p099f.p100a.p104m.C3537k.m15380b(r8, r6)
            if (r8 == 0) goto L_0x0093
            e.f.a.m.o.b$b r8 = r18.mo12727F1()
            p082e.p099f.p100a.p104m.p105o.C3551h.m15456h(r1, r8)
            r8 = 0
        L_0x0047:
            if (r8 >= r3) goto L_0x0093
            java.util.ArrayList<e.f.a.m.e> r9 = r1.f11496P0
            java.lang.Object r9 = r9.get(r8)
            e.f.a.m.e r9 = (p082e.p099f.p100a.p104m.C3527e) r9
            boolean r10 = r9.mo12693l0()
            if (r10 == 0) goto L_0x0090
            boolean r10 = r9 instanceof p082e.p099f.p100a.p104m.C3533h
            if (r10 != 0) goto L_0x0090
            boolean r10 = r9 instanceof p082e.p099f.p100a.p104m.C3521a
            if (r10 != 0) goto L_0x0090
            boolean r10 = r9 instanceof p082e.p099f.p100a.p104m.C3539m
            if (r10 != 0) goto L_0x0090
            boolean r10 = r9.mo12690k0()
            if (r10 != 0) goto L_0x0090
            e.f.a.m.e$b r10 = r9.mo12714w(r2)
            e.f.a.m.e$b r11 = r9.mo12714w(r6)
            e.f.a.m.e$b r12 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0081
            int r10 = r9.f11391s
            if (r10 == r6) goto L_0x0081
            if (r11 != r12) goto L_0x0081
            int r10 = r9.f11393t
            if (r10 == r6) goto L_0x0081
            r10 = 1
            goto L_0x0082
        L_0x0081:
            r10 = 0
        L_0x0082:
            if (r10 != 0) goto L_0x0090
            e.f.a.m.o.b$a r10 = new e.f.a.m.o.b$a
            r10.<init>()
            e.f.a.m.o.b$b r11 = r1.f11413T0
            int r12 = p082e.p099f.p100a.p104m.p105o.C3542b.C3543a.f11500k
            m15260P1(r2, r9, r11, r10, r12)
        L_0x0090:
            int r8 = r8 + 1
            goto L_0x0047
        L_0x0093:
            r8 = 2
            if (r3 <= r8) goto L_0x00dc
            e.f.a.m.e$b r9 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r5 == r9) goto L_0x009c
            if (r7 != r9) goto L_0x00dc
        L_0x009c:
            int r10 = r1.f11423d1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = p082e.p099f.p100a.p104m.C3537k.m15380b(r10, r11)
            if (r10 == 0) goto L_0x00dc
            e.f.a.m.o.b$b r10 = r18.mo12727F1()
            boolean r10 = p082e.p099f.p100a.p104m.p105o.C3552i.m15460c(r1, r10)
            if (r10 == 0) goto L_0x00dc
            if (r5 != r9) goto L_0x00c4
            int r10 = r18.mo12657V()
            if (r0 >= r10) goto L_0x00c0
            if (r0 <= 0) goto L_0x00c0
            r1.mo12683h1(r0)
            r1.f11424e1 = r6
            goto L_0x00c4
        L_0x00c0:
            int r0 = r18.mo12657V()
        L_0x00c4:
            if (r7 != r9) goto L_0x00d8
            int r9 = r18.mo12720z()
            if (r4 >= r9) goto L_0x00d4
            if (r4 <= 0) goto L_0x00d4
            r1.mo12632I0(r4)
            r1.f11425f1 = r6
            goto L_0x00d8
        L_0x00d4:
            int r4 = r18.mo12720z()
        L_0x00d8:
            r9 = r4
            r4 = r0
            r0 = 1
            goto L_0x00df
        L_0x00dc:
            r9 = r4
            r4 = r0
            r0 = 0
        L_0x00df:
            r10 = 64
            boolean r11 = r1.mo12737Q1(r10)
            if (r11 != 0) goto L_0x00f2
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.mo12737Q1(r11)
            if (r11 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r11 = 0
            goto L_0x00f3
        L_0x00f2:
            r11 = 1
        L_0x00f3:
            e.f.a.d r12 = r1.f11416W0
            r12.f11085h = r2
            r12.f11086i = r2
            int r13 = r1.f11423d1
            if (r13 == 0) goto L_0x0101
            if (r11 == 0) goto L_0x0101
            r12.f11086i = r6
        L_0x0101:
            java.util.ArrayList<e.f.a.m.e> r11 = r1.f11496P0
            e.f.a.m.e$b r12 = r18.mo12619C()
            e.f.a.m.e$b r13 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r12 == r13) goto L_0x0114
            e.f.a.m.e$b r12 = r18.mo12651S()
            if (r12 != r13) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r12 = 0
            goto L_0x0115
        L_0x0114:
            r12 = 1
        L_0x0115:
            r18.m15261R1()
            r13 = 0
        L_0x0119:
            if (r13 >= r3) goto L_0x012f
            java.util.ArrayList<e.f.a.m.e> r14 = r1.f11496P0
            java.lang.Object r14 = r14.get(r13)
            e.f.a.m.e r14 = (p082e.p099f.p100a.p104m.C3527e) r14
            boolean r15 = r14 instanceof p082e.p099f.p100a.p104m.C3540n
            if (r15 == 0) goto L_0x012c
            e.f.a.m.n r14 = (p082e.p099f.p100a.p104m.C3540n) r14
            r14.mo12744p1()
        L_0x012c:
            int r13 = r13 + 1
            goto L_0x0119
        L_0x012f:
            boolean r10 = r1.mo12737Q1(r10)
            r13 = r0
            r0 = 0
            r14 = 1
        L_0x0136:
            if (r14 == 0) goto L_0x0324
            int r15 = r0 + 1
            e.f.a.d r0 = r1.f11416W0     // Catch:{ Exception -> 0x01e7 }
            r0.mo12465D()     // Catch:{ Exception -> 0x01e7 }
            r18.m15261R1()     // Catch:{ Exception -> 0x01e7 }
            e.f.a.d r0 = r1.f11416W0     // Catch:{ Exception -> 0x01e7 }
            r1.mo12698o(r0)     // Catch:{ Exception -> 0x01e7 }
            r0 = 0
        L_0x0148:
            if (r0 >= r3) goto L_0x015c
            java.util.ArrayList<e.f.a.m.e> r6 = r1.f11496P0     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x01e7 }
            e.f.a.m.e r6 = (p082e.p099f.p100a.p104m.C3527e) r6     // Catch:{ Exception -> 0x01e7 }
            e.f.a.d r2 = r1.f11416W0     // Catch:{ Exception -> 0x01e7 }
            r6.mo12698o(r2)     // Catch:{ Exception -> 0x01e7 }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x0148
        L_0x015c:
            e.f.a.d r0 = r1.f11416W0     // Catch:{ Exception -> 0x01e7 }
            boolean r14 = r1.mo12746t1(r0)     // Catch:{ Exception -> 0x01e7 }
            java.lang.ref.WeakReference<e.f.a.m.d> r0 = r1.f11426g1     // Catch:{ Exception -> 0x01e7 }
            r2 = 0
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x0182
            java.lang.ref.WeakReference<e.f.a.m.d> r0 = r1.f11426g1     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            e.f.a.m.d r0 = (p082e.p099f.p100a.p104m.C3524d) r0     // Catch:{ Exception -> 0x01e7 }
            e.f.a.d r6 = r1.f11416W0     // Catch:{ Exception -> 0x01e7 }
            e.f.a.m.d r8 = r1.f11341N     // Catch:{ Exception -> 0x01e7 }
            e.f.a.i r6 = r6.mo12479q(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.m15264y1(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f11426g1 = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x0182:
            java.lang.ref.WeakReference<e.f.a.m.d> r0 = r1.f11428i1     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01a1
            java.lang.ref.WeakReference<e.f.a.m.d> r0 = r1.f11428i1     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            e.f.a.m.d r0 = (p082e.p099f.p100a.p104m.C3524d) r0     // Catch:{ Exception -> 0x01e7 }
            e.f.a.d r6 = r1.f11416W0     // Catch:{ Exception -> 0x01e7 }
            e.f.a.m.d r8 = r1.f11344P     // Catch:{ Exception -> 0x01e7 }
            e.f.a.i r6 = r6.mo12479q(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.m15263x1(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f11428i1 = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x01a1:
            java.lang.ref.WeakReference<e.f.a.m.d> r0 = r1.f11427h1     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01c0
            java.lang.ref.WeakReference<e.f.a.m.d> r0 = r1.f11427h1     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            e.f.a.m.d r0 = (p082e.p099f.p100a.p104m.C3524d) r0     // Catch:{ Exception -> 0x01e7 }
            e.f.a.d r6 = r1.f11416W0     // Catch:{ Exception -> 0x01e7 }
            e.f.a.m.d r8 = r1.f11339M     // Catch:{ Exception -> 0x01e7 }
            e.f.a.i r6 = r6.mo12479q(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.m15264y1(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f11427h1 = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x01c0:
            java.lang.ref.WeakReference<e.f.a.m.d> r0 = r1.f11429j1     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01df
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01df
            java.lang.ref.WeakReference<e.f.a.m.d> r0 = r1.f11429j1     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            e.f.a.m.d r0 = (p082e.p099f.p100a.p104m.C3524d) r0     // Catch:{ Exception -> 0x01e7 }
            e.f.a.d r6 = r1.f11416W0     // Catch:{ Exception -> 0x01e7 }
            e.f.a.m.d r8 = r1.f11343O     // Catch:{ Exception -> 0x01e7 }
            e.f.a.i r6 = r6.mo12479q(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.m15263x1(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f11429j1 = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x01df:
            if (r14 == 0) goto L_0x0201
            e.f.a.d r0 = r1.f11416W0     // Catch:{ Exception -> 0x01e7 }
            r0.mo12484z()     // Catch:{ Exception -> 0x01e7 }
            goto L_0x0201
        L_0x01e7:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x0201:
            if (r14 == 0) goto L_0x020c
            e.f.a.d r0 = r1.f11416W0
            boolean[] r2 = p082e.p099f.p100a.p104m.C3537k.f11484a
            boolean r0 = r1.mo12742W1(r0, r2)
            goto L_0x0225
        L_0x020c:
            e.f.a.d r0 = r1.f11416W0
            r1.mo12697n1(r0, r10)
            r0 = 0
        L_0x0212:
            if (r0 >= r3) goto L_0x0224
            java.util.ArrayList<e.f.a.m.e> r2 = r1.f11496P0
            java.lang.Object r2 = r2.get(r0)
            e.f.a.m.e r2 = (p082e.p099f.p100a.p104m.C3527e) r2
            e.f.a.d r6 = r1.f11416W0
            r2.mo12697n1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0212
        L_0x0224:
            r0 = 0
        L_0x0225:
            r2 = 8
            if (r12 == 0) goto L_0x0296
            if (r15 >= r2) goto L_0x0296
            boolean[] r6 = p082e.p099f.p100a.p104m.C3537k.f11484a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0296
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0235:
            if (r6 >= r3) goto L_0x025f
            java.util.ArrayList<e.f.a.m.e> r2 = r1.f11496P0
            java.lang.Object r2 = r2.get(r6)
            e.f.a.m.e r2 = (p082e.p099f.p100a.p104m.C3527e) r2
            r16 = r0
            int r0 = r2.f11362d0
            int r17 = r2.mo12657V()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f11364e0
            int r2 = r2.mo12720z()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0235
        L_0x025f:
            r16 = r0
            int r0 = r1.f11376k0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f11378l0
            int r2 = java.lang.Math.max(r2, r8)
            e.f.a.m.e$b r6 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r5 != r6) goto L_0x0282
            int r8 = r18.mo12657V()
            if (r8 >= r0) goto L_0x0282
            r1.mo12683h1(r0)
            e.f.a.m.e$b[] r0 = r1.f11352X
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0282:
            if (r7 != r6) goto L_0x0298
            int r0 = r18.mo12720z()
            if (r0 >= r2) goto L_0x0298
            r1.mo12632I0(r2)
            e.f.a.m.e$b[] r0 = r1.f11352X
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x0298
        L_0x0296:
            r16 = r0
        L_0x0298:
            int r0 = r1.f11376k0
            int r2 = r18.mo12657V()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo12657V()
            if (r0 <= r2) goto L_0x02b5
            r1.mo12683h1(r0)
            e.f.a.m.e$b[] r0 = r1.f11352X
            e.f.a.m.e$b r2 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02b5:
            int r0 = r1.f11378l0
            int r2 = r18.mo12720z()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo12720z()
            if (r0 <= r2) goto L_0x02d3
            r1.mo12632I0(r0)
            e.f.a.m.e$b[] r0 = r1.f11352X
            e.f.a.m.e$b r2 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = 1
            r16 = 1
            goto L_0x02d5
        L_0x02d3:
            r6 = 1
            r2 = r13
        L_0x02d5:
            if (r2 != 0) goto L_0x0314
            e.f.a.m.e$b[] r0 = r1.f11352X
            r8 = 0
            r0 = r0[r8]
            e.f.a.m.e$b r13 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02f6
            if (r4 <= 0) goto L_0x02f6
            int r0 = r18.mo12657V()
            if (r0 <= r4) goto L_0x02f6
            r1.f11424e1 = r6
            e.f.a.m.e$b[] r0 = r1.f11352X
            e.f.a.m.e$b r2 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r0[r8] = r2
            r1.mo12683h1(r4)
            r2 = 1
            r16 = 1
        L_0x02f6:
            e.f.a.m.e$b[] r0 = r1.f11352X
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0314
            if (r9 <= 0) goto L_0x0314
            int r0 = r18.mo12720z()
            if (r0 <= r9) goto L_0x0314
            r1.f11425f1 = r6
            e.f.a.m.e$b[] r0 = r1.f11352X
            e.f.a.m.e$b r2 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED
            r0[r6] = r2
            r1.mo12632I0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x0319
        L_0x0314:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x0319:
            if (r15 <= r0) goto L_0x031d
            r14 = 0
            goto L_0x031e
        L_0x031d:
            r14 = r2
        L_0x031e:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x0136
        L_0x0324:
            r1.f11496P0 = r11
            if (r13 == 0) goto L_0x0330
            e.f.a.m.e$b[] r0 = r1.f11352X
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0330:
            e.f.a.d r0 = r1.f11416W0
            e.f.a.c r0 = r0.mo12482v()
            r1.mo12715w0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.C3530f.mo12744p1():void");
    }

    /* renamed from: s0 */
    public void mo12707s0() {
        this.f11416W0.mo12465D();
        this.f11417X0 = 0;
        this.f11418Y0 = 0;
        super.mo12707s0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void mo12745s1(C3527e eVar, int i) {
        if (i == 0) {
            m15262u1(eVar);
        } else if (i == 1) {
            m15265z1(eVar);
        }
    }

    /* renamed from: t1 */
    public boolean mo12746t1(C3484d dVar) {
        boolean Q1 = mo12737Q1(64);
        mo12577g(dVar, Q1);
        int size = this.f11496P0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C3527e eVar = this.f11496P0.get(i);
            eVar.mo12646P0(0, false);
            eVar.mo12646P0(1, false);
            if (eVar instanceof C3521a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C3527e eVar2 = this.f11496P0.get(i2);
                if (eVar2 instanceof C3521a) {
                    ((C3521a) eVar2).mo12588v1();
                }
            }
        }
        this.f11430k1.clear();
        for (int i3 = 0; i3 < size; i3++) {
            C3527e eVar3 = this.f11496P0.get(i3);
            if (eVar3.mo12677f()) {
                if (eVar3 instanceof C3539m) {
                    this.f11430k1.add(eVar3);
                } else {
                    eVar3.mo12577g(dVar, Q1);
                }
            }
        }
        while (this.f11430k1.size() > 0) {
            int size2 = this.f11430k1.size();
            Iterator<C3527e> it = this.f11430k1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3539m mVar = (C3539m) it.next();
                if (mVar.mo12806s1(this.f11430k1)) {
                    mVar.mo12577g(dVar, Q1);
                    this.f11430k1.remove(mVar);
                    break;
                }
            }
            if (size2 == this.f11430k1.size()) {
                Iterator<C3527e> it2 = this.f11430k1.iterator();
                while (it2.hasNext()) {
                    it2.next().mo12577g(dVar, Q1);
                }
                this.f11430k1.clear();
            }
        }
        if (C3484d.f11069r) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                C3527e eVar4 = this.f11496P0.get(i4);
                if (!eVar4.mo12677f()) {
                    hashSet.add(eVar4);
                }
            }
            mo12675e(this, dVar, hashSet, mo12619C() == C3527e.C3529b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                C3527e eVar5 = (C3527e) it3.next();
                C3537k.m15379a(this, dVar, eVar5);
                eVar5.mo12577g(dVar, Q1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                C3527e eVar6 = this.f11496P0.get(i5);
                if (eVar6 instanceof C3530f) {
                    C3527e.C3529b[] bVarArr = eVar6.f11352X;
                    C3527e.C3529b bVar = bVarArr[0];
                    C3527e.C3529b bVar2 = bVarArr[1];
                    C3527e.C3529b bVar3 = C3527e.C3529b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.mo12640M0(C3527e.C3529b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.mo12674d1(C3527e.C3529b.FIXED);
                    }
                    eVar6.mo12577g(dVar, Q1);
                    if (bVar == bVar3) {
                        eVar6.mo12640M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.mo12674d1(bVar2);
                    }
                } else {
                    C3537k.m15379a(this, dVar, eVar6);
                    if (!eVar6.mo12677f()) {
                        eVar6.mo12577g(dVar, Q1);
                    }
                }
            }
        }
        if (this.f11419Z0 > 0) {
            C3522b.m15120b(this, dVar, (ArrayList<C3527e>) null, 0);
        }
        if (this.f11420a1 > 0) {
            C3522b.m15120b(this, dVar, (ArrayList<C3527e>) null, 1);
        }
        return true;
    }

    /* renamed from: v1 */
    public void mo12747v1(C3524d dVar) {
        WeakReference<C3524d> weakReference = this.f11429j1;
        if (weakReference == null || weakReference.get() == null || dVar.mo12597e() > ((C3524d) this.f11429j1.get()).mo12597e()) {
            this.f11429j1 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: w1 */
    public void mo12748w1(C3524d dVar) {
        WeakReference<C3524d> weakReference = this.f11427h1;
        if (weakReference == null || weakReference.get() == null || dVar.mo12597e() > ((C3524d) this.f11427h1.get()).mo12597e()) {
            this.f11427h1 = new WeakReference<>(dVar);
        }
    }
}
