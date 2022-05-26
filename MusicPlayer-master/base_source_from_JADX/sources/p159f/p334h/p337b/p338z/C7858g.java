package p159f.p334h.p337b.p338z;

import java.util.LinkedHashSet;
import java.util.Set;
import p159f.p334h.p337b.C7846x;

/* renamed from: f.h.b.z.g */
/* compiled from: RouteDatabase */
public final class C7858g {

    /* renamed from: a */
    private final Set<C7846x> f33389a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void mo29295a(C7846x xVar) {
        this.f33389a.remove(xVar);
    }

    /* renamed from: b */
    public synchronized void mo29296b(C7846x xVar) {
        this.f33389a.add(xVar);
    }

    /* renamed from: c */
    public synchronized boolean mo29297c(C7846x xVar) {
        return this.f33389a.contains(xVar);
    }
}
