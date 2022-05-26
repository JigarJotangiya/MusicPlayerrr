package p369i.p377u;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.k */
/* compiled from: CollectionsJVM.kt */
class C8481k {
    /* renamed from: a */
    public static final <T> Object[] m46660a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        C8594l.m46771e(tArr, "$this$copyToArrayOfAny");
        if (z && C8594l.m46767a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: b */
    public static <T> List<T> m46661b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C8594l.m46770d(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }
}
