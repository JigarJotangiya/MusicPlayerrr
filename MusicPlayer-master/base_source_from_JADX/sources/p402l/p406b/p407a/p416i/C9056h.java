package p402l.p406b.p407a.p416i;

import java.io.File;
import java.util.Iterator;
import java.util.Vector;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.p413g.C9020f;

/* renamed from: l.b.a.i.h */
/* compiled from: ModificationHandler */
public class C9056h implements C9050c {

    /* renamed from: a */
    private Vector<C9050c> f35536a = new Vector<>();

    /* renamed from: a */
    public void mo31535a(C8942a aVar, boolean z) throws C9020f {
        Iterator<C9050c> it = this.f35536a.iterator();
        while (it.hasNext()) {
            C9050c next = it.next();
            try {
                next.mo31535a(aVar, z);
            } catch (C9020f e) {
                mo31536b(next, aVar, e);
                throw e;
            }
        }
    }

    /* renamed from: b */
    public void mo31536b(C9050c cVar, C8942a aVar, C9020f fVar) {
        Iterator<C9050c> it = this.f35536a.iterator();
        while (it.hasNext()) {
            it.next().mo31536b(cVar, aVar, fVar);
        }
    }

    /* renamed from: c */
    public void mo31537c(C8942a aVar, File file) throws C9020f {
        Iterator<C9050c> it = this.f35536a.iterator();
        while (it.hasNext()) {
            C9050c next = it.next();
            try {
                next.mo31537c(aVar, file);
            } catch (C9020f e) {
                mo31536b(next, aVar, e);
                throw e;
            }
        }
    }

    /* renamed from: d */
    public void mo31538d(File file) {
        Iterator<C9050c> it = this.f35536a.iterator();
        while (it.hasNext()) {
            it.next().mo31538d(file);
        }
    }
}
