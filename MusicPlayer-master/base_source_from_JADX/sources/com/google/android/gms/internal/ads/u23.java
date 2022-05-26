package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class u23 extends p23 implements SortedSet {

    /* renamed from: i */
    final /* synthetic */ z23 f24157i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u23(z23 z23, SortedMap sortedMap) {
        super(z23, sortedMap);
        this.f24157i = z23;
    }

    public final Comparator comparator() {
        return mo20563d().comparator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public SortedMap mo20563d() {
        return (SortedMap) this.f14828g;
    }

    public final Object first() {
        return mo20563d().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new u23(this.f24157i, mo20563d().headMap(obj));
    }

    public final Object last() {
        return mo20563d().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new u23(this.f24157i, mo20563d().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new u23(this.f24157i, mo20563d().tailMap(obj));
    }
}
