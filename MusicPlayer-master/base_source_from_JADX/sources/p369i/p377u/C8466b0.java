package p369i.p377u;

import java.util.Collections;
import java.util.Map;
import p369i.C8446k;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.b0 */
/* compiled from: MapsJVM.kt */
class C8466b0 extends C8460a0 {
    /* renamed from: a */
    public static int m46586a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m46587b(C8446k<? extends K, ? extends V> kVar) {
        C8594l.m46771e(kVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(kVar.getFirst(), kVar.getSecond());
        C8594l.m46770d(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m46588c(Map<? extends K, ? extends V> map) {
        C8594l.m46771e(map, "$this$toSingletonMap");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C8594l.m46770d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
