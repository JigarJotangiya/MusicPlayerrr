package p402l.p406b.p407a.p409f.p412e;

import java.util.Iterator;
import p402l.p406b.p407a.p409f.p410c.C8968b;
import p402l.p406b.p407a.p409f.p410c.C8972f;
import p402l.p406b.p407a.p409f.p410c.C8981o;
import p402l.p406b.p407a.p409f.p410c.C8983p;
import p402l.p406b.p407a.p409f.p410c.C8984q;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.p428q.C9138b;
import p402l.p406b.p426c.p428q.C9139c;
import p402l.p406b.p426c.p428q.C9142d;
import p402l.p406b.p426c.p428q.C9143e;
import p402l.p406b.p426c.p428q.C9144f;
import p402l.p406b.p426c.p428q.C9145g;

/* renamed from: l.b.a.f.e.b */
/* compiled from: TagConverter */
public final class C9013b {
    /* renamed from: a */
    public static C9139c m48165a(C8968b bVar) {
        C9132l lVar;
        C9139c cVar = new C9139c(true);
        for (C8972f n : C8972f.values()) {
            C8981o n2 = bVar.mo31305n(n);
            if (n2 != null) {
                for (C8984q next : n2.mo31390n()) {
                    if (next.mo31430y() != 1) {
                        lVar = new C9145g(next);
                    } else if (next.mo31423r().equals(C9138b.COVER_ART.getFieldName())) {
                        lVar = new C9143e(next);
                    } else if (next.mo31423r().equals(C9138b.BANNER_IMAGE.getFieldName())) {
                        lVar = new C9142d(next);
                    } else {
                        lVar = new C9144f(next);
                    }
                    cVar.mo31522f(lVar);
                }
            }
        }
        return cVar;
    }

    /* renamed from: b */
    public static C8981o[] m48166b(C9139c cVar) {
        Iterator<C9144f> p = cVar.mo31766p();
        C8981o[] c = C8983p.m48043d().mo31401c(C8972f.getOrdered());
        while (p.hasNext()) {
            C9144f next = p.next();
            boolean z = false;
            int i = 0;
            while (!z && i < c.length) {
                if (C8972f.areInCorrectOrder(c[i].mo31388k(), C9138b.getAsfFieldKey(next.mo31497D()).getHighestContainer()) && c[i].mo31349r(next.mo31772a())) {
                    c[i].mo31384g(next.mo31772a());
                    z = true;
                }
                i++;
            }
        }
        return c;
    }
}
