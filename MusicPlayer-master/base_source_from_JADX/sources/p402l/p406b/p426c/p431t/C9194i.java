package p402l.p406b.p426c.p431t;

import java.io.UnsupportedEncodingException;
import java.util.LinkedHashSet;
import java.util.Set;
import p402l.p406b.p426c.C9135o;

/* renamed from: l.b.c.t.i */
/* compiled from: AggregatedFrame */
public class C9194i implements C9135o {

    /* renamed from: g */
    protected Set<C9176c> f35884g = new LinkedHashSet();

    /* renamed from: D */
    public String mo31497D() {
        StringBuilder sb = new StringBuilder();
        for (C9176c D : this.f35884g) {
            sb.append(D.mo31497D());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo31956a(C9176c cVar) {
        this.f35884g.add(cVar);
    }

    /* renamed from: b */
    public Set<C9176c> mo31957b() {
        return this.f35884g;
    }

    /* renamed from: c */
    public byte[] mo31499c() throws UnsupportedEncodingException {
        throw new UnsupportedEncodingException();
    }

    /* renamed from: f */
    public boolean mo31500f() {
        return true;
    }

    public String getContent() {
        StringBuilder sb = new StringBuilder();
        for (C9176c content : this.f35884g) {
            sb.append(content.getContent());
        }
        return sb.toString();
    }

    public boolean isEmpty() {
        return false;
    }
}
