package p082e.p147t.p148e;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: e.t.e.h0 */
/* compiled from: Selection */
public class C4163h0<K> implements Iterable<K> {

    /* renamed from: g */
    final Set<K> f12501g = new LinkedHashSet();

    /* renamed from: h */
    final Set<K> f12502h = new LinkedHashSet();

    C4163h0() {
    }

    /* renamed from: s */
    private boolean m18377s(C4163h0<?> h0Var) {
        return this.f12501g.equals(h0Var.f12501g) && this.f12502h.equals(h0Var.f12502h);
    }

    /* access modifiers changed from: package-private */
    public boolean add(K k) {
        return this.f12501g.add(k);
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.f12501g.clear();
    }

    public boolean contains(K k) {
        return this.f12501g.contains(k) || this.f12502h.contains(k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo14313d() {
        this.f12502h.clear();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C4163h0) && m18377s((C4163h0) obj));
    }

    public int hashCode() {
        return this.f12501g.hashCode() ^ this.f12502h.hashCode();
    }

    public boolean isEmpty() {
        return this.f12501g.isEmpty() && this.f12502h.isEmpty();
    }

    public Iterator<K> iterator() {
        return this.f12501g.iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo14318p(C4163h0<K> h0Var) {
        this.f12501g.clear();
        this.f12501g.addAll(h0Var.f12501g);
        this.f12502h.clear();
        this.f12502h.addAll(h0Var.f12502h);
    }

    /* access modifiers changed from: package-private */
    public boolean remove(K k) {
        return this.f12501g.remove(k);
    }

    public int size() {
        return this.f12501g.size() + this.f12502h.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo14321t() {
        this.f12501g.addAll(this.f12502h);
        this.f12502h.clear();
    }

    public String toString() {
        if (size() <= 0) {
            return "size=0, items=[]";
        }
        StringBuilder sb = new StringBuilder(size() * 28);
        sb.append("Selection{");
        sb.append("primary{size=" + this.f12501g.size());
        sb.append(", entries=" + this.f12501g);
        sb.append("}, provisional{size=" + this.f12502h.size());
        sb.append(", entries=" + this.f12502h);
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Map<K, Boolean> mo14323u(Set<K> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K next : this.f12502h) {
            if (!set.contains(next) && !this.f12501g.contains(next)) {
                linkedHashMap.put(next, Boolean.FALSE);
            }
        }
        for (K next2 : this.f12501g) {
            if (!set.contains(next2)) {
                linkedHashMap.put(next2, Boolean.FALSE);
            }
        }
        for (K next3 : set) {
            if (!this.f12501g.contains(next3) && !this.f12502h.contains(next3)) {
                linkedHashMap.put(next3, Boolean.TRUE);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue()) {
                this.f12502h.add(key);
            } else {
                this.f12502h.remove(key);
            }
        }
        return linkedHashMap;
    }
}
