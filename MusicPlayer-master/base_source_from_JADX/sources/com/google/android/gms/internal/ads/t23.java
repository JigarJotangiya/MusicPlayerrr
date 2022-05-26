package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class t23 extends l23 implements SortedMap {

    /* renamed from: k */
    SortedSet f23694k;

    /* renamed from: l */
    final /* synthetic */ z23 f23695l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t23(z23 z23, SortedMap sortedMap) {
        super(z23, sortedMap);
        this.f23695l = z23;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public SortedMap mo20360c() {
        return (SortedMap) this.f19165i;
    }

    public final Comparator comparator() {
        return mo20360c().comparator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public SortedSet mo20363d() {
        return new u23(this.f23695l, mo20360c());
    }

    /* renamed from: e */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f23694k;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet d = mo20363d();
        this.f23694k = d;
        return d;
    }

    public final Object firstKey() {
        return mo20360c().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new t23(this.f23695l, mo20360c().headMap(obj));
    }

    public final Object lastKey() {
        return mo20360c().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new t23(this.f23695l, mo20360c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new t23(this.f23695l, mo20360c().tailMap(obj));
    }
}
