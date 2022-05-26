package p369i.p375e0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.e0.h */
/* compiled from: _Sequences.kt */
class C8414h extends C8413g {

    /* renamed from: i.e0.h$a */
    /* compiled from: Iterables.kt */
    public static final class C8415a implements Iterable<T>, C8607a {

        /* renamed from: g */
        final /* synthetic */ C8407b f34883g;

        public C8415a(C8407b bVar) {
            this.f34883g = bVar;
        }

        public Iterator<T> iterator() {
            return this.f34883g.iterator();
        }
    }

    /* renamed from: c */
    public static <T> Iterable<T> m46463c(C8407b<? extends T> bVar) {
        C8594l.m46771e(bVar, "$this$asIterable");
        return new C8415a(bVar);
    }

    /* renamed from: d */
    public static <T, R> C8407b<R> m46464d(C8407b<? extends T> bVar, C8570l<? super T, ? extends R> lVar) {
        C8594l.m46771e(bVar, "$this$map");
        C8594l.m46771e(lVar, "transform");
        return new C8416i(bVar, lVar);
    }

    /* renamed from: e */
    public static final <T, C extends Collection<? super T>> C m46465e(C8407b<? extends T> bVar, C c) {
        C8594l.m46771e(bVar, "$this$toCollection");
        C8594l.m46771e(c, "destination");
        for (Object add : bVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: f */
    public static <T> List<T> m46466f(C8407b<? extends T> bVar) {
        C8594l.m46771e(bVar, "$this$toList");
        return C8482l.m46669j(m46467g(bVar));
    }

    /* renamed from: g */
    public static final <T> List<T> m46467g(C8407b<? extends T> bVar) {
        C8594l.m46771e(bVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        m46465e(bVar, arrayList);
        return arrayList;
    }
}
