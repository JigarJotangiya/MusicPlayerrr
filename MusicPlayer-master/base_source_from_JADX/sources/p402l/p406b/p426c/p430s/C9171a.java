package p402l.p406b.p426c.p430s;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p402l.p406b.p407a.p414h.p415i.C9043g;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.p440y.C9298d;

/* renamed from: l.b.c.s.a */
/* compiled from: FlacTag */
public class C9171a implements C9130j {

    /* renamed from: g */
    private C9298d f35806g;

    /* renamed from: h */
    private List<C9043g> f35807h;

    public C9171a() {
        this(C9298d.m49285m(), new ArrayList());
    }

    /* renamed from: a */
    public List<C9132l> mo31559a(C9123c cVar) throws C9128h {
        if (!cVar.equals(C9123c.COVER_ART)) {
            return this.f35806g.mo31559a(cVar);
        }
        ArrayList arrayList = new ArrayList();
        for (C9043g add : this.f35807h) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: b */
    public int mo31518b() {
        return this.f35806g.mo31518b() + this.f35807h.size();
    }

    /* renamed from: c */
    public C9132l mo31843c(C9123c cVar, String str) throws C9128h, C9122b {
        if (!cVar.equals(C9123c.COVER_ART)) {
            return this.f35806g.mo31523g(cVar, str);
        }
        throw new UnsupportedOperationException(C9118b.ARTWORK_CANNOT_BE_CREATED_WITH_THIS_METHOD.getMsg());
    }

    /* renamed from: d */
    public Iterator<C9132l> mo31520d() {
        return this.f35806g.mo31520d();
    }

    /* renamed from: e */
    public void mo31521e(C9123c cVar, String str) throws C9128h, C9122b {
        mo31846h(mo31843c(cVar, str));
    }

    /* renamed from: f */
    public List<C9043g> mo31844f() {
        return this.f35807h;
    }

    /* renamed from: g */
    public C9298d mo31845g() {
        return this.f35806g;
    }

    /* renamed from: h */
    public void mo31846h(C9132l lVar) throws C9122b {
        if (!(lVar instanceof C9043g)) {
            this.f35806g.mo31528k(lVar);
        } else if (this.f35807h.size() == 0) {
            this.f35807h.add(0, (C9043g) lVar);
        } else {
            this.f35807h.set(0, (C9043g) lVar);
        }
    }

    public boolean isEmpty() {
        C9298d dVar = this.f35806g;
        return (dVar == null || dVar.isEmpty()) && this.f35807h.size() == 0;
    }

    public C9171a(C9298d dVar, List<C9043g> list) {
        this.f35806g = null;
        this.f35807h = new ArrayList();
        this.f35806g = dVar;
        this.f35807h = list;
    }
}
