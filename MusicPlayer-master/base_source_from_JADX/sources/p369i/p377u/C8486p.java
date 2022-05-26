package p369i.p377u;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.p */
/* compiled from: MutableCollectionsJVM.kt */
class C8486p extends C8485o {
    /* renamed from: n */
    public static <T extends Comparable<? super T>> void m46673n(List<T> list) {
        C8594l.m46771e(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: o */
    public static <T> void m46674o(List<T> list, Comparator<? super T> comparator) {
        C8594l.m46771e(list, "$this$sortWith");
        C8594l.m46771e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
