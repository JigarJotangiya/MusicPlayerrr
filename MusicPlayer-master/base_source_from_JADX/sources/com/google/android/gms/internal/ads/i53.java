package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class i53 extends m53 {

    /* renamed from: a */
    final /* synthetic */ Comparator f17896a;

    i53(Comparator comparator) {
        this.f17896a = comparator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <K, V> Map<K, Collection<V>> mo18087a() {
        return new TreeMap(this.f17896a);
    }
}
