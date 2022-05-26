package p082e.p099f.p100a.p104m;

import java.util.HashSet;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.p105o.C3542b;

/* renamed from: e.f.a.m.m */
/* compiled from: VirtualLayout */
public class C3539m extends C3536j {

    /* renamed from: R0 */
    private int f11485R0 = 0;

    /* renamed from: S0 */
    private int f11486S0 = 0;

    /* renamed from: T0 */
    private int f11487T0 = 0;

    /* renamed from: U0 */
    private int f11488U0 = 0;

    /* renamed from: V0 */
    private int f11489V0 = 0;

    /* renamed from: W0 */
    private int f11490W0 = 0;

    /* renamed from: X0 */
    private boolean f11491X0 = false;

    /* renamed from: Y0 */
    private int f11492Y0 = 0;

    /* renamed from: Z0 */
    private int f11493Z0 = 0;

    /* renamed from: a1 */
    protected C3542b.C3543a f11494a1 = new C3542b.C3543a();

    /* renamed from: b1 */
    C3542b.C3544b f11495b1 = null;

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public void mo12792A1(C3527e eVar, C3527e.C3529b bVar, int i, C3527e.C3529b bVar2, int i2) {
        while (this.f11495b1 == null && mo12639M() != null) {
            this.f11495b1 = ((C3530f) mo12639M()).mo12727F1();
        }
        C3542b.C3543a aVar = this.f11494a1;
        aVar.f11503a = bVar;
        aVar.f11504b = bVar2;
        aVar.f11505c = i;
        aVar.f11506d = i2;
        this.f11495b1.mo2894b(eVar, aVar);
        eVar.mo12683h1(this.f11494a1.f11507e);
        eVar.mo12632I0(this.f11494a1.f11508f);
        eVar.mo12630H0(this.f11494a1.f11510h);
        eVar.mo12717x0(this.f11494a1.f11509g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B1 */
    public boolean mo12793B1() {
        C3527e eVar = this.f11353Y;
        C3542b.C3544b F1 = eVar != null ? ((C3530f) eVar).mo12727F1() : null;
        if (F1 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f11483Q0) {
                return true;
            }
            C3527e eVar2 = this.f11482P0[i];
            if (eVar2 != null && !(eVar2 instanceof C3533h)) {
                C3527e.C3529b w = eVar2.mo12714w(0);
                C3527e.C3529b w2 = eVar2.mo12714w(1);
                C3527e.C3529b bVar = C3527e.C3529b.MATCH_CONSTRAINT;
                if (w != bVar || eVar2.f11391s == 1 || w2 != bVar || eVar2.f11393t == 1) {
                    z = false;
                }
                if (!z) {
                    if (w == bVar) {
                        w = C3527e.C3529b.WRAP_CONTENT;
                    }
                    if (w2 == bVar) {
                        w2 = C3527e.C3529b.WRAP_CONTENT;
                    }
                    C3542b.C3543a aVar = this.f11494a1;
                    aVar.f11503a = w;
                    aVar.f11504b = w2;
                    aVar.f11505c = eVar2.mo12657V();
                    this.f11494a1.f11506d = eVar2.mo12720z();
                    F1.mo2894b(eVar2, this.f11494a1);
                    eVar2.mo12683h1(this.f11494a1.f11507e);
                    eVar2.mo12632I0(this.f11494a1.f11508f);
                    eVar2.mo12717x0(this.f11494a1.f11509g);
                }
            }
            i++;
        }
    }

    /* renamed from: C1 */
    public boolean mo12794C1() {
        return this.f11491X0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D1 */
    public void mo12795D1(boolean z) {
        this.f11491X0 = z;
    }

    /* renamed from: E1 */
    public void mo12796E1(int i, int i2) {
        this.f11492Y0 = i;
        this.f11493Z0 = i2;
    }

    /* renamed from: F1 */
    public void mo12797F1(int i) {
        this.f11485R0 = i;
        this.f11486S0 = i;
        this.f11487T0 = i;
        this.f11488U0 = i;
    }

    /* renamed from: G1 */
    public void mo12798G1(int i) {
        this.f11486S0 = i;
    }

    /* renamed from: H1 */
    public void mo12799H1(int i) {
        this.f11488U0 = i;
    }

    /* renamed from: I1 */
    public void mo12800I1(int i) {
        this.f11489V0 = i;
    }

    /* renamed from: J1 */
    public void mo12801J1(int i) {
        this.f11490W0 = i;
    }

    /* renamed from: K1 */
    public void mo12802K1(int i) {
        this.f11487T0 = i;
        this.f11489V0 = i;
        this.f11490W0 = i;
    }

    /* renamed from: L1 */
    public void mo12803L1(int i) {
        this.f11485R0 = i;
    }

    /* renamed from: c */
    public void mo12789c(C3530f fVar) {
        mo12805r1();
    }

    /* renamed from: q1 */
    public void mo12804q1(boolean z) {
        int i = this.f11487T0;
        if (i <= 0 && this.f11488U0 <= 0) {
            return;
        }
        if (z) {
            this.f11489V0 = this.f11488U0;
            this.f11490W0 = i;
            return;
        }
        this.f11489V0 = i;
        this.f11490W0 = this.f11488U0;
    }

    /* renamed from: r1 */
    public void mo12805r1() {
        for (int i = 0; i < this.f11483Q0; i++) {
            C3527e eVar = this.f11482P0[i];
            if (eVar != null) {
                eVar.mo12650R0(true);
            }
        }
    }

    /* renamed from: s1 */
    public boolean mo12806s1(HashSet<C3527e> hashSet) {
        for (int i = 0; i < this.f11483Q0; i++) {
            if (hashSet.contains(this.f11482P0[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t1 */
    public int mo12807t1() {
        return this.f11493Z0;
    }

    /* renamed from: u1 */
    public int mo12808u1() {
        return this.f11492Y0;
    }

    /* renamed from: v1 */
    public int mo12809v1() {
        return this.f11486S0;
    }

    /* renamed from: w1 */
    public int mo12810w1() {
        return this.f11489V0;
    }

    /* renamed from: x1 */
    public int mo12811x1() {
        return this.f11490W0;
    }

    /* renamed from: y1 */
    public int mo12812y1() {
        return this.f11485R0;
    }

    /* renamed from: z1 */
    public void mo12767z1(int i, int i2, int i3, int i4) {
    }
}
