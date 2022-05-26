package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class q53<K, V> extends h23<K, V> {
    final transient e23<? extends List<V>> zza;

    q53(Map<K, Collection<V>> map, e23<? extends List<V>> e23) {
        super(map);
        this.zza = e23;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Collection zza() {
        return this.zza.zza();
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> zzj() {
        return zzk();
    }

    /* access modifiers changed from: package-private */
    public final Set<K> zzl() {
        return zzm();
    }
}
