package p082e.p099f.p100a.p104m;

import java.util.HashMap;
import p082e.p099f.p100a.C3484d;
import p082e.p099f.p100a.C3493i;
import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;

/* renamed from: e.f.a.m.a */
/* compiled from: Barrier */
public class C3521a extends C3536j {

    /* renamed from: R0 */
    private int f11279R0 = 0;

    /* renamed from: S0 */
    private boolean f11280S0 = true;

    /* renamed from: T0 */
    private int f11281T0 = 0;

    /* renamed from: U0 */
    boolean f11282U0 = false;

    /* renamed from: g */
    public void mo12577g(C3484d dVar, boolean z) {
        C3524d[] dVarArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        C3524d[] dVarArr2 = this.f11349U;
        dVarArr2[0] = this.f11339M;
        dVarArr2[2] = this.f11341N;
        dVarArr2[1] = this.f11343O;
        dVarArr2[3] = this.f11344P;
        int i4 = 0;
        while (true) {
            dVarArr = this.f11349U;
            if (i4 >= dVarArr.length) {
                break;
            }
            dVarArr[i4].f11311i = dVar.mo12479q(dVarArr[i4]);
            i4++;
        }
        int i5 = this.f11279R0;
        if (i5 >= 0 && i5 < 4) {
            C3524d dVar2 = dVarArr[i5];
            if (!this.f11282U0) {
                mo12582q1();
            }
            if (this.f11282U0) {
                this.f11282U0 = false;
                int i6 = this.f11279R0;
                if (i6 == 0 || i6 == 1) {
                    dVar.mo12470f(this.f11339M.f11311i, this.f11362d0);
                    dVar.mo12470f(this.f11343O.f11311i, this.f11362d0);
                } else if (i6 == 2 || i6 == 3) {
                    dVar.mo12470f(this.f11341N.f11311i, this.f11364e0);
                    dVar.mo12470f(this.f11344P.f11311i, this.f11364e0);
                }
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 >= this.f11483Q0) {
                        z2 = false;
                        break;
                    }
                    C3527e eVar = this.f11482P0[i7];
                    if ((this.f11280S0 || eVar.mo12578h()) && ((((i2 = this.f11279R0) == 0 || i2 == 1) && eVar.mo12619C() == C3527e.C3529b.MATCH_CONSTRAINT && eVar.f11339M.f11308f != null && eVar.f11343O.f11308f != null) || (((i3 = this.f11279R0) == 2 || i3 == 3) && eVar.mo12651S() == C3527e.C3529b.MATCH_CONSTRAINT && eVar.f11341N.f11308f != null && eVar.f11344P.f11308f != null))) {
                        z2 = true;
                    } else {
                        i7++;
                    }
                }
                z2 = true;
                boolean z3 = this.f11339M.mo12604l() || this.f11343O.mo12604l();
                boolean z4 = this.f11341N.mo12604l() || this.f11344P.mo12604l();
                boolean z5 = !z2 && (((i = this.f11279R0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
                int i8 = 5;
                if (!z5) {
                    i8 = 4;
                }
                for (int i9 = 0; i9 < this.f11483Q0; i9++) {
                    C3527e eVar2 = this.f11482P0[i9];
                    if (this.f11280S0 || eVar2.mo12578h()) {
                        C3493i q = dVar.mo12479q(eVar2.f11349U[this.f11279R0]);
                        C3524d[] dVarArr3 = eVar2.f11349U;
                        int i10 = this.f11279R0;
                        dVarArr3[i10].f11311i = q;
                        int i11 = (dVarArr3[i10].f11308f == null || dVarArr3[i10].f11308f.f11306d != this) ? 0 : dVarArr3[i10].f11309g + 0;
                        if (i10 == 0 || i10 == 2) {
                            dVar.mo12473i(dVar2.f11311i, q, this.f11281T0 - i11, z2);
                        } else {
                            dVar.mo12471g(dVar2.f11311i, q, this.f11281T0 + i11, z2);
                        }
                        dVar.mo12469e(dVar2.f11311i, q, this.f11281T0 + i11, i8);
                    }
                }
                int i12 = this.f11279R0;
                if (i12 == 0) {
                    dVar.mo12469e(this.f11343O.f11311i, this.f11339M.f11311i, 0, 8);
                    dVar.mo12469e(this.f11339M.f11311i, this.f11353Y.f11343O.f11311i, 0, 4);
                    dVar.mo12469e(this.f11339M.f11311i, this.f11353Y.f11339M.f11311i, 0, 0);
                } else if (i12 == 1) {
                    dVar.mo12469e(this.f11339M.f11311i, this.f11343O.f11311i, 0, 8);
                    dVar.mo12469e(this.f11339M.f11311i, this.f11353Y.f11339M.f11311i, 0, 4);
                    dVar.mo12469e(this.f11339M.f11311i, this.f11353Y.f11343O.f11311i, 0, 0);
                } else if (i12 == 2) {
                    dVar.mo12469e(this.f11344P.f11311i, this.f11341N.f11311i, 0, 8);
                    dVar.mo12469e(this.f11341N.f11311i, this.f11353Y.f11344P.f11311i, 0, 4);
                    dVar.mo12469e(this.f11341N.f11311i, this.f11353Y.f11341N.f11311i, 0, 0);
                } else if (i12 == 3) {
                    dVar.mo12469e(this.f11341N.f11311i, this.f11344P.f11311i, 0, 8);
                    dVar.mo12469e(this.f11341N.f11311i, this.f11353Y.f11341N.f11311i, 0, 4);
                    dVar.mo12469e(this.f11341N.f11311i, this.f11353Y.f11344P.f11311i, 0, 0);
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo12578h() {
        return true;
    }

    /* renamed from: m0 */
    public boolean mo12579m0() {
        return this.f11282U0;
    }

    /* renamed from: n */
    public void mo12580n(C3527e eVar, HashMap<C3527e, C3527e> hashMap) {
        super.mo12580n(eVar, hashMap);
        C3521a aVar = (C3521a) eVar;
        this.f11279R0 = aVar.f11279R0;
        this.f11280S0 = aVar.f11280S0;
        this.f11281T0 = aVar.f11281T0;
    }

    /* renamed from: n0 */
    public boolean mo12581n0() {
        return this.f11282U0;
    }

    /* renamed from: q1 */
    public boolean mo12582q1() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f11483Q0;
            if (i4 >= i) {
                break;
            }
            C3527e eVar = this.f11482P0[i4];
            if ((this.f11280S0 || eVar.mo12578h()) && ((((i2 = this.f11279R0) == 0 || i2 == 1) && !eVar.mo12579m0()) || (((i3 = this.f11279R0) == 2 || i3 == 3) && !eVar.mo12581n0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f11483Q0; i6++) {
            C3527e eVar2 = this.f11482P0[i6];
            if (this.f11280S0 || eVar2.mo12578h()) {
                if (!z2) {
                    int i7 = this.f11279R0;
                    if (i7 == 0) {
                        i5 = eVar2.mo12702q(C3524d.C3526b.LEFT).mo12597e();
                    } else if (i7 == 1) {
                        i5 = eVar2.mo12702q(C3524d.C3526b.RIGHT).mo12597e();
                    } else if (i7 == 2) {
                        i5 = eVar2.mo12702q(C3524d.C3526b.TOP).mo12597e();
                    } else if (i7 == 3) {
                        i5 = eVar2.mo12702q(C3524d.C3526b.BOTTOM).mo12597e();
                    }
                    z2 = true;
                }
                int i8 = this.f11279R0;
                if (i8 == 0) {
                    i5 = Math.min(i5, eVar2.mo12702q(C3524d.C3526b.LEFT).mo12597e());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, eVar2.mo12702q(C3524d.C3526b.RIGHT).mo12597e());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, eVar2.mo12702q(C3524d.C3526b.TOP).mo12597e());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, eVar2.mo12702q(C3524d.C3526b.BOTTOM).mo12597e());
                }
            }
        }
        int i9 = i5 + this.f11281T0;
        int i10 = this.f11279R0;
        if (i10 == 0 || i10 == 1) {
            mo12620C0(i9, i9);
        } else {
            mo12626F0(i9, i9);
        }
        this.f11282U0 = true;
        return true;
    }

    /* renamed from: r1 */
    public boolean mo12583r1() {
        return this.f11280S0;
    }

    /* renamed from: s1 */
    public int mo12584s1() {
        return this.f11279R0;
    }

    /* renamed from: t1 */
    public int mo12585t1() {
        return this.f11281T0;
    }

    public String toString() {
        String str = "[Barrier] " + mo12712v() + " {";
        for (int i = 0; i < this.f11483Q0; i++) {
            C3527e eVar = this.f11482P0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.mo12712v();
        }
        return str + "}";
    }

    /* renamed from: u1 */
    public int mo12587u1() {
        int i = this.f11279R0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v1 */
    public void mo12588v1() {
        for (int i = 0; i < this.f11483Q0; i++) {
            C3527e eVar = this.f11482P0[i];
            if (this.f11280S0 || eVar.mo12578h()) {
                int i2 = this.f11279R0;
                if (i2 == 0 || i2 == 1) {
                    eVar.mo12646P0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    eVar.mo12646P0(1, true);
                }
            }
        }
    }

    /* renamed from: w1 */
    public void mo12589w1(boolean z) {
        this.f11280S0 = z;
    }

    /* renamed from: x1 */
    public void mo12590x1(int i) {
        this.f11279R0 = i;
    }

    /* renamed from: y1 */
    public void mo12591y1(int i) {
        this.f11281T0 = i;
    }
}
