package p082e.p099f.p100a.p104m;

import p082e.p099f.p100a.C3484d;
import p082e.p099f.p100a.p104m.C3524d;

/* renamed from: e.f.a.m.l */
/* compiled from: Placeholder */
public class C3538l extends C3539m {
    /* renamed from: g */
    public void mo12577g(C3484d dVar, boolean z) {
        super.mo12577g(dVar, z);
        if (this.f11483Q0 > 0) {
            C3527e eVar = this.f11482P0[0];
            eVar.mo12709t0();
            C3524d.C3526b bVar = C3524d.C3526b.LEFT;
            eVar.mo12686j(bVar, this, bVar);
            C3524d.C3526b bVar2 = C3524d.C3526b.RIGHT;
            eVar.mo12686j(bVar2, this, bVar2);
            C3524d.C3526b bVar3 = C3524d.C3526b.TOP;
            eVar.mo12686j(bVar3, this, bVar3);
            C3524d.C3526b bVar4 = C3524d.C3526b.BOTTOM;
            eVar.mo12686j(bVar4, this, bVar4);
        }
    }

    /* renamed from: z1 */
    public void mo12767z1(int i, int i2, int i3, int i4) {
        boolean z = false;
        int w1 = mo12810w1() + mo12811x1() + 0;
        int y1 = mo12812y1() + mo12809v1() + 0;
        if (this.f11483Q0 > 0) {
            w1 += this.f11482P0[0].mo12657V();
            y1 += this.f11482P0[0].mo12720z();
        }
        int max = Math.max(mo12635K(), w1);
        int max2 = Math.max(mo12633J(), y1);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(max, i2) : i == 0 ? max : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(max2, i4) : i3 == 0 ? max2 : 0;
        }
        mo12796E1(i2, i4);
        mo12683h1(i2);
        mo12632I0(i4);
        if (this.f11483Q0 > 0) {
            z = true;
        }
        mo12795D1(z);
    }
}
