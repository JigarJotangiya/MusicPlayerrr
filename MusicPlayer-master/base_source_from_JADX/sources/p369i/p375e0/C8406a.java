package p369i.p375e0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.e0.a */
/* compiled from: SequencesJVM.kt */
public final class C8406a<T> implements C8407b<T> {

    /* renamed from: a */
    private final AtomicReference<C8407b<T>> f34881a;

    public C8406a(C8407b<? extends T> bVar) {
        C8594l.m46771e(bVar, "sequence");
        this.f34881a = new AtomicReference<>(bVar);
    }

    public Iterator<T> iterator() {
        C8407b andSet = this.f34881a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
