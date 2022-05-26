package p369i.p375e0;

import java.util.Iterator;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.e0.i */
/* compiled from: Sequences.kt */
public final class C8416i<T, R> implements C8407b<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8407b<T> f34884a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8570l<T, R> f34885b;

    /* renamed from: i.e0.i$a */
    /* compiled from: Sequences.kt */
    public static final class C8417a implements Iterator<R>, C8607a {

        /* renamed from: g */
        private final Iterator<T> f34886g;

        /* renamed from: h */
        final /* synthetic */ C8416i f34887h;

        C8417a(C8416i iVar) {
            this.f34887h = iVar;
            this.f34886g = iVar.f34884a.iterator();
        }

        public boolean hasNext() {
            return this.f34886g.hasNext();
        }

        public R next() {
            return this.f34887h.f34885b.invoke(this.f34886g.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8416i(C8407b<? extends T> bVar, C8570l<? super T, ? extends R> lVar) {
        C8594l.m46771e(bVar, "sequence");
        C8594l.m46771e(lVar, "transformer");
        this.f34884a = bVar;
        this.f34885b = lVar;
    }

    public Iterator<R> iterator() {
        return new C8417a(this);
    }
}
