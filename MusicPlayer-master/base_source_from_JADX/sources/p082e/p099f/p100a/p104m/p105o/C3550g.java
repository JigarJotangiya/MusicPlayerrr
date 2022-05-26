package p082e.p099f.p100a.p104m.p105o;

import p082e.p099f.p100a.p104m.p105o.C3548f;

/* renamed from: e.f.a.m.o.g */
/* compiled from: DimensionDependency */
class C3550g extends C3548f {

    /* renamed from: m */
    public int f11536m;

    public C3550g(C3562p pVar) {
        super(pVar);
        if (pVar instanceof C3555l) {
            this.f11527e = C3548f.C3549a.HORIZONTAL_DIMENSION;
        } else {
            this.f11527e = C3548f.C3549a.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: d */
    public void mo12837d(int i) {
        if (!this.f11532j) {
            this.f11532j = true;
            this.f11529g = i;
            for (C3546d next : this.f11533k) {
                next.mo12819a(next);
            }
        }
    }
}
