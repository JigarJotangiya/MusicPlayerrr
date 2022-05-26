package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class r23 extends u23 implements NavigableSet {

    /* renamed from: j */
    final /* synthetic */ z23 f22717j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r23(z23 z23, NavigableMap navigableMap) {
        super(z23, navigableMap);
        this.f22717j = z23;
    }

    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f14828g)).ceilingKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ SortedMap mo20563d() {
        return (NavigableMap) ((SortedMap) this.f14828g);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new r23(this.f22717j, ((NavigableMap) ((SortedMap) this.f14828g)).descendingMap());
    }

    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f14828g)).floorKey(obj);
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f14828g)).higherKey(obj);
    }

    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f14828g)).lowerKey(obj);
    }

    public final Object pollFirst() {
        return v43.m32153a(iterator());
    }

    public final Object pollLast() {
        return v43.m32153a(descendingIterator());
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new r23(this.f22717j, ((NavigableMap) ((SortedMap) this.f14828g)).headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new r23(this.f22717j, ((NavigableMap) ((SortedMap) this.f14828g)).subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new r23(this.f22717j, ((NavigableMap) ((SortedMap) this.f14828g)).tailMap(obj, z));
    }
}
