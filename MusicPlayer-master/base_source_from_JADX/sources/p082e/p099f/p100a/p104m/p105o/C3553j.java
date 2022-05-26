package p082e.p099f.p100a.p104m.p105o;

import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3533h;

/* renamed from: e.f.a.m.o.j */
/* compiled from: GuidelineReference */
class C3553j extends C3562p {
    public C3553j(C3527e eVar) {
        super(eVar);
        eVar.f11361d.mo12822f();
        eVar.f11363e.mo12822f();
        this.f11560f = ((C3533h) eVar).mo12778p1();
    }

    /* renamed from: q */
    private void m15462q(C3548f fVar) {
        this.f11562h.f11533k.add(fVar);
        fVar.f11534l.add(this.f11562h);
    }

    /* renamed from: a */
    public void mo12819a(C3546d dVar) {
        C3548f fVar = this.f11562h;
        if (fVar.f11525c && !fVar.f11532j) {
            this.f11562h.mo12837d((int) ((((float) fVar.f11534l.get(0).f11529g) * ((C3533h) this.f11556b).mo12781s1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12820d() {
        C3533h hVar = (C3533h) this.f11556b;
        int q1 = hVar.mo12779q1();
        int r1 = hVar.mo12780r1();
        hVar.mo12781s1();
        if (hVar.mo12778p1() == 1) {
            if (q1 != -1) {
                this.f11562h.f11534l.add(this.f11556b.f11353Y.f11361d.f11562h);
                this.f11556b.f11353Y.f11361d.f11562h.f11533k.add(this.f11562h);
                this.f11562h.f11528f = q1;
            } else if (r1 != -1) {
                this.f11562h.f11534l.add(this.f11556b.f11353Y.f11361d.f11563i);
                this.f11556b.f11353Y.f11361d.f11563i.f11533k.add(this.f11562h);
                this.f11562h.f11528f = -r1;
            } else {
                C3548f fVar = this.f11562h;
                fVar.f11524b = true;
                fVar.f11534l.add(this.f11556b.f11353Y.f11361d.f11563i);
                this.f11556b.f11353Y.f11361d.f11563i.f11533k.add(this.f11562h);
            }
            m15462q(this.f11556b.f11361d.f11562h);
            m15462q(this.f11556b.f11361d.f11563i);
            return;
        }
        if (q1 != -1) {
            this.f11562h.f11534l.add(this.f11556b.f11353Y.f11363e.f11562h);
            this.f11556b.f11353Y.f11363e.f11562h.f11533k.add(this.f11562h);
            this.f11562h.f11528f = q1;
        } else if (r1 != -1) {
            this.f11562h.f11534l.add(this.f11556b.f11353Y.f11363e.f11563i);
            this.f11556b.f11353Y.f11363e.f11563i.f11533k.add(this.f11562h);
            this.f11562h.f11528f = -r1;
        } else {
            C3548f fVar2 = this.f11562h;
            fVar2.f11524b = true;
            fVar2.f11534l.add(this.f11556b.f11353Y.f11363e.f11563i);
            this.f11556b.f11353Y.f11363e.f11563i.f11533k.add(this.f11562h);
        }
        m15462q(this.f11556b.f11363e.f11562h);
        m15462q(this.f11556b.f11363e.f11563i);
    }

    /* renamed from: e */
    public void mo12821e() {
        if (((C3533h) this.f11556b).mo12778p1() == 1) {
            this.f11556b.mo12688j1(this.f11562h.f11529g);
        } else {
            this.f11556b.mo12691k1(this.f11562h.f11529g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo12822f() {
        this.f11562h.mo12836c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo12824m() {
        return false;
    }
}
