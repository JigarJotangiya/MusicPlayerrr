package p402l.p406b.p426c.p428q;

import p402l.p406b.p407a.p409f.p410c.C8984q;
import p402l.p406b.p407a.p409f.p412e.C9014c;
import p402l.p406b.p426c.C9135o;

/* renamed from: l.b.c.q.g */
/* compiled from: AsfTagTextField */
public class C9145g extends C9144f implements C9135o {
    public C9145g(C8984q qVar) {
        super(qVar);
        if (qVar.mo31430y() == 1) {
            throw new IllegalArgumentException("Cannot interpret binary as string.");
        }
    }

    public String getContent() {
        return mo31772a().mo31429w();
    }

    public boolean isEmpty() {
        return C9014c.m48172f(getContent());
    }

    public C9145g(String str, String str2) {
        super(str);
        this.f35769g.mo31408G(str2);
    }
}
