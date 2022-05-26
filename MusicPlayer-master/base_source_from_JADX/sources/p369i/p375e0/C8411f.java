package p369i.p375e0;

import java.util.Iterator;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.e0.f */
/* compiled from: Sequences.kt */
class C8411f extends C8410e {

    /* renamed from: i.e0.f$a */
    /* compiled from: Sequences.kt */
    public static final class C8412a implements C8407b<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f34882a;

        public C8412a(Iterator it) {
            this.f34882a = it;
        }

        public Iterator<T> iterator() {
            return this.f34882a;
        }
    }

    /* renamed from: a */
    public static <T> C8407b<T> m46461a(Iterator<? extends T> it) {
        C8594l.m46771e(it, "$this$asSequence");
        return m46462b(new C8412a(it));
    }

    /* renamed from: b */
    public static final <T> C8407b<T> m46462b(C8407b<? extends T> bVar) {
        C8594l.m46771e(bVar, "$this$constrainOnce");
        return bVar instanceof C8406a ? bVar : new C8406a(bVar);
    }
}
