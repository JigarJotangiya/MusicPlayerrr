package p369i.p377u;

import java.util.Set;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.g0 */
/* compiled from: Sets.kt */
class C8476g0 extends C8474f0 {
    /* renamed from: b */
    public static <T> Set<T> m46625b() {
        return C8494x.INSTANCE;
    }

    /* renamed from: c */
    public static final <T> Set<T> m46626c(Set<? extends T> set) {
        C8594l.m46771e(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        if (size == 0) {
            return m46625b();
        }
        if (size != 1) {
            return set;
        }
        return C8474f0.m46614a(set.iterator().next());
    }
}
