package p402l.p406b.p426c.p431t;

import p402l.p406b.p441d.C9300a;

/* renamed from: l.b.c.t.f */
/* compiled from: AbstractTagFrame */
public abstract class C9188f extends C9192h {

    /* renamed from: h */
    protected C9190g f35855h;

    public C9188f() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9188f)) {
            return false;
        }
        C9188f fVar = (C9188f) obj;
        if (!C9300a.m49299b(mo31857g(), fVar.mo31857g()) || !C9300a.m49299b(this.f35855h, fVar.f35855h) || !super.equals(fVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public C9190g mo31934j() {
        return this.f35855h;
    }

    /* renamed from: k */
    public void mo31935k(C9190g gVar) {
        this.f35855h = gVar;
        gVar.mo31945q(this);
    }

    public String toString() {
        return mo31934j().toString();
    }

    public C9188f(C9188f fVar) {
        C9190g gVar = (C9190g) C9238m.m49067f(fVar.f35855h);
        this.f35855h = gVar;
        gVar.mo31945q(this);
    }
}
