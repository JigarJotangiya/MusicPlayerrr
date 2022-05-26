package p082e.p099f.p100a.p104m.p105o;

import p082e.p099f.p100a.p104m.C3521a;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.p105o.C3548f;

/* renamed from: e.f.a.m.o.k */
/* compiled from: HelperReferences */
class C3554k extends C3562p {
    public C3554k(C3527e eVar) {
        super(eVar);
    }

    /* renamed from: q */
    private void m15468q(C3548f fVar) {
        this.f11562h.f11533k.add(fVar);
        fVar.f11534l.add(this.f11562h);
    }

    /* renamed from: a */
    public void mo12819a(C3546d dVar) {
        C3521a aVar = (C3521a) this.f11556b;
        int s1 = aVar.mo12584s1();
        int i = 0;
        int i2 = -1;
        for (C3548f fVar : this.f11562h.f11534l) {
            int i3 = fVar.f11529g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (s1 == 0 || s1 == 2) {
            this.f11562h.mo12837d(i2 + aVar.mo12585t1());
        } else {
            this.f11562h.mo12837d(i + aVar.mo12585t1());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12820d() {
        C3527e eVar = this.f11556b;
        if (eVar instanceof C3521a) {
            this.f11562h.f11524b = true;
            C3521a aVar = (C3521a) eVar;
            int s1 = aVar.mo12584s1();
            boolean r1 = aVar.mo12583r1();
            int i = 0;
            if (s1 == 0) {
                this.f11562h.f11527e = C3548f.C3549a.LEFT;
                while (i < aVar.f11483Q0) {
                    C3527e eVar2 = aVar.f11482P0[i];
                    if (r1 || eVar2.mo12655U() != 8) {
                        C3548f fVar = eVar2.f11361d.f11562h;
                        fVar.f11533k.add(this.f11562h);
                        this.f11562h.f11534l.add(fVar);
                    }
                    i++;
                }
                m15468q(this.f11556b.f11361d.f11562h);
                m15468q(this.f11556b.f11361d.f11563i);
            } else if (s1 == 1) {
                this.f11562h.f11527e = C3548f.C3549a.RIGHT;
                while (i < aVar.f11483Q0) {
                    C3527e eVar3 = aVar.f11482P0[i];
                    if (r1 || eVar3.mo12655U() != 8) {
                        C3548f fVar2 = eVar3.f11361d.f11563i;
                        fVar2.f11533k.add(this.f11562h);
                        this.f11562h.f11534l.add(fVar2);
                    }
                    i++;
                }
                m15468q(this.f11556b.f11361d.f11562h);
                m15468q(this.f11556b.f11361d.f11563i);
            } else if (s1 == 2) {
                this.f11562h.f11527e = C3548f.C3549a.TOP;
                while (i < aVar.f11483Q0) {
                    C3527e eVar4 = aVar.f11482P0[i];
                    if (r1 || eVar4.mo12655U() != 8) {
                        C3548f fVar3 = eVar4.f11363e.f11562h;
                        fVar3.f11533k.add(this.f11562h);
                        this.f11562h.f11534l.add(fVar3);
                    }
                    i++;
                }
                m15468q(this.f11556b.f11363e.f11562h);
                m15468q(this.f11556b.f11363e.f11563i);
            } else if (s1 == 3) {
                this.f11562h.f11527e = C3548f.C3549a.BOTTOM;
                while (i < aVar.f11483Q0) {
                    C3527e eVar5 = aVar.f11482P0[i];
                    if (r1 || eVar5.mo12655U() != 8) {
                        C3548f fVar4 = eVar5.f11363e.f11563i;
                        fVar4.f11533k.add(this.f11562h);
                        this.f11562h.f11534l.add(fVar4);
                    }
                    i++;
                }
                m15468q(this.f11556b.f11363e.f11562h);
                m15468q(this.f11556b.f11363e.f11563i);
            }
        }
    }

    /* renamed from: e */
    public void mo12821e() {
        C3527e eVar = this.f11556b;
        if (eVar instanceof C3521a) {
            int s1 = ((C3521a) eVar).mo12584s1();
            if (s1 == 0 || s1 == 1) {
                this.f11556b.mo12688j1(this.f11562h.f11529g);
            } else {
                this.f11556b.mo12691k1(this.f11562h.f11529g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo12822f() {
        this.f11557c = null;
        this.f11562h.mo12836c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo12824m() {
        return false;
    }
}
