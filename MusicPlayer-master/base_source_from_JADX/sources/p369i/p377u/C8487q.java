package p369i.p377u;

import java.util.Collection;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.q */
/* compiled from: MutableCollections.kt */
class C8487q extends C8486p {
    /* renamed from: p */
    public static <T> boolean m46675p(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C8594l.m46771e(collection, "$this$addAll");
        C8594l.m46771e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
