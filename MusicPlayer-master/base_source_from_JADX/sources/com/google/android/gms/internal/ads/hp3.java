package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class hp3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    private final int f17734g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<ap3> f17735h = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Map<K, V> f17736i = Collections.emptyMap();

    /* renamed from: j */
    private boolean f17737j;

    /* renamed from: k */
    private volatile ep3 f17738k;

    /* renamed from: l */
    private Map<K, V> f17739l = Collections.emptyMap();

    /* synthetic */ hp3(int i, gp3 gp3) {
        this.f17734g = i;
    }

    /* renamed from: k */
    private final int m24870k(K k) {
        int size = this.f17735h.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f17735h.get(size).mo15923c());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f17735h.get(i2).mo15923c());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final V m24871l(int i) {
        m24873n();
        V value = this.f17735h.remove(i).getValue();
        if (!this.f17736i.isEmpty()) {
            Iterator it = m24872m().entrySet().iterator();
            List<ap3> list = this.f17735h;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new ap3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap<K, V> m24872m() {
        m24873n();
        if (this.f17736i.isEmpty() && !(this.f17736i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f17736i = treeMap;
            this.f17739l = treeMap.descendingMap();
        }
        return (SortedMap) this.f17736i;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m24873n() {
        if (this.f17737j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo18182a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f17737j) {
            if (this.f17736i.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f17736i);
            }
            this.f17736i = map;
            if (this.f17739l.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f17739l);
            }
            this.f17739l = map2;
            this.f17737j = true;
        }
    }

    /* renamed from: b */
    public final int mo18183b() {
        return this.f17735h.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> mo18184c() {
        if (this.f17736i.isEmpty()) {
            return zo3.m34716a();
        }
        return this.f17736i.entrySet();
    }

    public final void clear() {
        m24873n();
        if (!this.f17735h.isEmpty()) {
            this.f17735h.clear();
        }
        if (!this.f17736i.isEmpty()) {
            this.f17736i.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m24870k(comparable) >= 0 || this.f17736i.containsKey(comparable);
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        m24873n();
        int k2 = m24870k(k);
        if (k2 >= 0) {
            return this.f17735h.get(k2).setValue(v);
        }
        m24873n();
        if (this.f17735h.isEmpty() && !(this.f17735h instanceof ArrayList)) {
            this.f17735h = new ArrayList(this.f17734g);
        }
        int i = -(k2 + 1);
        if (i >= this.f17734g) {
            return m24872m().put(k, v);
        }
        int size = this.f17735h.size();
        int i2 = this.f17734g;
        if (size == i2) {
            ap3 remove = this.f17735h.remove(i2 - 1);
            m24872m().put(remove.mo15923c(), remove.getValue());
        }
        this.f17735h.add(i, new ap3(this, k, v));
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f17738k == null) {
            this.f17738k = new ep3(this, (dp3) null);
        }
        return this.f17738k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp3)) {
            return super.equals(obj);
        }
        hp3 hp3 = (hp3) obj;
        int size = size();
        if (size != hp3.size()) {
            return false;
        }
        int b = mo18183b();
        if (b != hp3.mo18183b()) {
            return entrySet().equals(hp3.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo18190g(i).equals(hp3.mo18190g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f17736i.equals(hp3.f17736i);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry<K, V> mo18190g(int i) {
        return this.f17735h.get(i);
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = m24870k(comparable);
        if (k >= 0) {
            return this.f17735h.get(k).getValue();
        }
        return this.f17736i.get(comparable);
    }

    public final int hashCode() {
        int b = mo18183b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f17735h.get(i2).hashCode();
        }
        return this.f17736i.size() > 0 ? i + this.f17736i.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo18193j() {
        return this.f17737j;
    }

    public final V remove(Object obj) {
        m24873n();
        Comparable comparable = (Comparable) obj;
        int k = m24870k(comparable);
        if (k >= 0) {
            return m24871l(k);
        }
        if (this.f17736i.isEmpty()) {
            return null;
        }
        return this.f17736i.remove(comparable);
    }

    public final int size() {
        return this.f17735h.size() + this.f17736i.size();
    }
}
