package p159f.p166c.p231p.p235d;

import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.p.d.b */
/* compiled from: SingletonHolder.kt */
public class C4819b<T, A> {

    /* renamed from: a */
    private C8570l<? super A, ? extends T> f13633a;

    /* renamed from: b */
    private volatile T f13634b;

    public C4819b(C8570l<? super A, ? extends T> lVar) {
        C8594l.m46771e(lVar, "creator");
        this.f13633a = lVar;
    }

    /* renamed from: a */
    public final T mo15566a(A a) {
        T t;
        if (this.f13634b != null) {
            T t2 = this.f13634b;
            C8594l.m46769c(t2);
            return t2;
        }
        synchronized (this) {
            if (this.f13634b != null) {
                t = this.f13634b;
                C8594l.m46769c(t);
            } else {
                C8570l lVar = this.f13633a;
                C8594l.m46769c(lVar);
                t = lVar.invoke(a);
                this.f13634b = t;
                this.f13633a = null;
            }
        }
        return t;
    }
}
