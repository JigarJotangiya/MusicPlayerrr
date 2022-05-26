package p369i.p377u;

import java.util.Collection;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.m */
/* compiled from: Iterables.kt */
class C8483m extends C8482l {
    /* renamed from: m */
    public static <T> int m46672m(Iterable<? extends T> iterable, int i) {
        C8594l.m46771e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
