package p159f.p243f.p327d.p329b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: f.f.d.b.e0 */
/* compiled from: Multimap */
public interface C7673e0<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k);

    Set<K> keySet();

    boolean remove(Object obj, Object obj2);

    int size();
}
