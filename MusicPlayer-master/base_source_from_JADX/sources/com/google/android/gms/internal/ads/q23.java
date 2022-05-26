package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class q23 extends t23 implements NavigableMap {

    /* renamed from: m */
    final /* synthetic */ z23 f21797m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q23(z23 z23, NavigableMap navigableMap) {
        super(z23, navigableMap);
        this.f21797m = z23;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ SortedMap mo20360c() {
        return (NavigableMap) ((SortedMap) this.f19165i);
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f19165i)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return mo19050b(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f19165i)).ceilingKey(obj);
    }

    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final NavigableMap descendingMap() {
        return new q23(this.f21797m, ((NavigableMap) ((SortedMap) this.f19165i)).descendingMap());
    }

    /* renamed from: e */
    public final /* synthetic */ SortedSet mo20366e() {
        return (NavigableSet) super.keySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Map.Entry mo20367f(Iterator<Map.Entry> it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry next = it.next();
        Collection zza = this.f21797m.zza();
        zza.addAll((Collection) next.getValue());
        it.remove();
        return new c43(next.getKey(), this.f21797m.zzb(zza));
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f19165i)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return mo19050b(firstEntry);
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f19165i)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return mo19050b(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f19165i)).floorKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final NavigableSet mo20363d() {
        return new r23(this.f21797m, (NavigableMap) ((SortedMap) this.f19165i));
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f19165i)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return mo19050b(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f19165i)).higherKey(obj);
    }

    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f19165i)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return mo19050b(lastEntry);
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f19165i)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return mo19050b(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f19165i)).lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return mo20367f(entrySet().iterator());
    }

    public final Map.Entry pollLastEntry() {
        return mo20367f(descendingMap().entrySet().iterator());
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new q23(this.f21797m, ((NavigableMap) ((SortedMap) this.f19165i)).headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new q23(this.f21797m, ((NavigableMap) ((SortedMap) this.f19165i)).subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new q23(this.f21797m, ((NavigableMap) ((SortedMap) this.f19165i)).tailMap(obj, z));
    }
}
