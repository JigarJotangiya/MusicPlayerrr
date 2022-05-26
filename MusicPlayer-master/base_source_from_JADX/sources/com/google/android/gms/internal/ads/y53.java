package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y53<K> extends r43<K> {

    /* renamed from: i */
    private final transient k43<K, ?> f26273i;

    /* renamed from: j */
    private final transient g43<K> f26274j;

    y53(k43<K, ?> k43, g43<K> g43) {
        this.f26273i = k43;
        this.f26274j = g43;
    }

    public final boolean contains(Object obj) {
        return this.f26273i.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f26274j.listIterator(0);
    }

    public final int size() {
        return this.f26273i.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return this.f26274j.zza(objArr, i);
    }

    public final g43<K> zzd() {
        return this.f26274j;
    }

    public final j63<K> zze() {
        return this.f26274j.listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
