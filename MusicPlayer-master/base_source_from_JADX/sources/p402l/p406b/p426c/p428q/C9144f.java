package p402l.p406b.p426c.p428q;

import p402l.p406b.p407a.p409f.p410c.C8984q;
import p402l.p406b.p426c.C9132l;

/* renamed from: l.b.c.q.f */
/* compiled from: AsfTagField */
public class C9144f implements C9132l, Cloneable {

    /* renamed from: g */
    protected C8984q f35769g;

    static {
        Class<C9144f> cls = C9144f.class;
    }

    public C9144f(C9138b bVar) {
        this.f35769g = new C8984q(bVar.getHighestContainer(), bVar.getFieldName(), 0);
    }

    /* renamed from: D */
    public String mo31497D() {
        return this.f35769g.mo31423r();
    }

    /* renamed from: a */
    public C8984q mo31772a() {
        return this.f35769g;
    }

    /* renamed from: c */
    public byte[] mo31499c() {
        return this.f35769g.mo31425t();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: f */
    public boolean mo31500f() {
        return C9139c.f35762j.contains(C9138b.getAsfFieldKey(mo31497D()));
    }

    public boolean isEmpty() {
        return this.f35769g.mo31431z();
    }

    public String toString() {
        return this.f35769g.mo31429w();
    }

    public C9144f(C8984q qVar) {
        this.f35769g = qVar.mo31416h();
    }

    public C9144f(String str) {
        this.f35769g = new C8984q(C9138b.getAsfFieldKey(str).getHighestContainer(), str, 0);
    }
}
