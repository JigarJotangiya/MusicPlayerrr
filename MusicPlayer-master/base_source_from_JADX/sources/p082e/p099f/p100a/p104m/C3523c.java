package p082e.p099f.p100a.p104m;

import java.util.ArrayList;
import p082e.p099f.p100a.p104m.C3527e;

/* renamed from: e.f.a.m.c */
/* compiled from: ChainHead */
public class C3523c {

    /* renamed from: a */
    protected C3527e f11283a;

    /* renamed from: b */
    protected C3527e f11284b;

    /* renamed from: c */
    protected C3527e f11285c;

    /* renamed from: d */
    protected C3527e f11286d;

    /* renamed from: e */
    protected C3527e f11287e;

    /* renamed from: f */
    protected C3527e f11288f;

    /* renamed from: g */
    protected C3527e f11289g;

    /* renamed from: h */
    protected ArrayList<C3527e> f11290h;

    /* renamed from: i */
    protected int f11291i;

    /* renamed from: j */
    protected int f11292j;

    /* renamed from: k */
    protected float f11293k = 0.0f;

    /* renamed from: l */
    int f11294l;

    /* renamed from: m */
    int f11295m;

    /* renamed from: n */
    int f11296n;

    /* renamed from: o */
    private int f11297o;

    /* renamed from: p */
    private boolean f11298p = false;

    /* renamed from: q */
    protected boolean f11299q;

    /* renamed from: r */
    protected boolean f11300r;

    /* renamed from: s */
    protected boolean f11301s;

    /* renamed from: t */
    private boolean f11302t;

    public C3523c(C3527e eVar, int i, boolean z) {
        this.f11283a = eVar;
        this.f11297o = i;
        this.f11298p = z;
    }

    /* renamed from: b */
    private void m15121b() {
        int i = this.f11297o * 2;
        C3527e eVar = this.f11283a;
        boolean z = false;
        C3527e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f11291i++;
            C3527e[] eVarArr = eVar.f11334J0;
            int i2 = this.f11297o;
            C3527e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f11332I0[i2] = null;
            if (eVar.mo12655U() != 8) {
                this.f11294l++;
                C3527e.C3529b w = eVar.mo12714w(this.f11297o);
                C3527e.C3529b bVar = C3527e.C3529b.MATCH_CONSTRAINT;
                if (w != bVar) {
                    this.f11295m += eVar.mo12627G(this.f11297o);
                }
                int f = this.f11295m + eVar.f11349U[i].mo12598f();
                this.f11295m = f;
                int i3 = i + 1;
                this.f11295m = f + eVar.f11349U[i3].mo12598f();
                int f2 = this.f11296n + eVar.f11349U[i].mo12598f();
                this.f11296n = f2;
                this.f11296n = f2 + eVar.f11349U[i3].mo12598f();
                if (this.f11284b == null) {
                    this.f11284b = eVar;
                }
                this.f11286d = eVar;
                C3527e.C3529b[] bVarArr = eVar.f11352X;
                int i4 = this.f11297o;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = eVar.f11395u;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f11292j++;
                        float[] fArr = eVar.f11330H0;
                        float f3 = fArr[i4];
                        if (f3 > 0.0f) {
                            this.f11293k += fArr[i4];
                        }
                        if (m15122c(eVar, i4)) {
                            if (f3 < 0.0f) {
                                this.f11299q = true;
                            } else {
                                this.f11300r = true;
                            }
                            if (this.f11290h == null) {
                                this.f11290h = new ArrayList<>();
                            }
                            this.f11290h.add(eVar);
                        }
                        if (this.f11288f == null) {
                            this.f11288f = eVar;
                        }
                        C3527e eVar4 = this.f11289g;
                        if (eVar4 != null) {
                            eVar4.f11332I0[this.f11297o] = eVar;
                        }
                        this.f11289g = eVar;
                    }
                    if (this.f11297o == 0) {
                        if (eVar.f11391s == 0 && eVar.f11397v == 0) {
                            int i5 = eVar.f11399w;
                        }
                    } else if (eVar.f11393t == 0 && eVar.f11403y == 0) {
                        int i6 = eVar.f11405z;
                    }
                    int i7 = (eVar.f11358b0 > 0.0f ? 1 : (eVar.f11358b0 == 0.0f ? 0 : -1));
                }
            }
            if (eVar2 != eVar) {
                eVar2.f11334J0[this.f11297o] = eVar;
            }
            C3524d dVar = eVar.f11349U[i + 1].f11308f;
            if (dVar != null) {
                C3527e eVar5 = dVar.f11306d;
                C3524d[] dVarArr = eVar5.f11349U;
                if (dVarArr[i].f11308f != null && dVarArr[i].f11308f.f11306d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C3527e eVar6 = this.f11284b;
        if (eVar6 != null) {
            this.f11295m -= eVar6.f11349U[i].mo12598f();
        }
        C3527e eVar7 = this.f11286d;
        if (eVar7 != null) {
            this.f11295m -= eVar7.f11349U[i + 1].mo12598f();
        }
        this.f11285c = eVar;
        if (this.f11297o != 0 || !this.f11298p) {
            this.f11287e = this.f11283a;
        } else {
            this.f11287e = eVar;
        }
        if (this.f11300r && this.f11299q) {
            z = true;
        }
        this.f11301s = z;
    }

    /* renamed from: c */
    private static boolean m15122c(C3527e eVar, int i) {
        if (eVar.mo12655U() != 8 && eVar.f11352X[i] == C3527e.C3529b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f11395u;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo12592a() {
        if (!this.f11302t) {
            m15121b();
        }
        this.f11302t = true;
    }
}
