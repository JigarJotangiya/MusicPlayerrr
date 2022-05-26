package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ep3 extends AbstractSet<Map.Entry> {

    /* renamed from: g */
    final /* synthetic */ hp3 f16058g;

    /* synthetic */ ep3(hp3 hp3, dp3 dp3) {
        this.f16058g = hp3;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f16058g.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f16058g.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f16058g.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        return new cp3(this.f16058g, (bp3) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f16058g.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f16058g.size();
    }
}
