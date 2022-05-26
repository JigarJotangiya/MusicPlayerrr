package p369i.p377u;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p369i.C8446k;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.c0 */
/* compiled from: Maps.kt */
class C8468c0 extends C8466b0 {
    /* renamed from: d */
    public static final <K, V> Map<K, V> m46590d() {
        C8493w wVar = C8493w.INSTANCE;
        Objects.requireNonNull(wVar, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        return wVar;
    }

    /* renamed from: e */
    public static final <K, V> Map<K, V> m46591e(Map<K, ? extends V> map) {
        C8594l.m46771e(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        if (size == 0) {
            return m46590d();
        }
        if (size != 1) {
            return map;
        }
        return C8466b0.m46588c(map);
    }

    /* renamed from: f */
    public static final <K, V> void m46592f(Map<? super K, ? super V> map, Iterable<? extends C8446k<? extends K, ? extends V>> iterable) {
        C8594l.m46771e(map, "$this$putAll");
        C8594l.m46771e(iterable, "pairs");
        for (C8446k kVar : iterable) {
            map.put(kVar.component1(), kVar.component2());
        }
    }

    /* renamed from: g */
    public static <K, V> Map<K, V> m46593g(Iterable<? extends C8446k<? extends K, ? extends V>> iterable) {
        C8594l.m46771e(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return m46590d();
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C8466b0.m46586a(collection.size()));
                m46594h(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return C8466b0.m46587b((C8446k) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        m46594h(iterable, linkedHashMap2);
        return m46591e(linkedHashMap2);
    }

    /* renamed from: h */
    public static final <K, V, M extends Map<? super K, ? super V>> M m46594h(Iterable<? extends C8446k<? extends K, ? extends V>> iterable, M m) {
        C8594l.m46771e(iterable, "$this$toMap");
        C8594l.m46771e(m, "destination");
        m46592f(m, iterable);
        return m;
    }

    /* renamed from: i */
    public static <K, V> Map<K, V> m46595i(Map<? extends K, ? extends V> map) {
        C8594l.m46771e(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }
}
