package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class p43<K, V> extends d33<K, V> implements Serializable {
    final transient k43<K, ? extends b43<V>> zzb;
    final transient int zzc;

    p43(k43<K, ? extends b43<V>> k43, int i) {
        this.zzb = k43;
        this.zzc = i;
    }

    public final int zze() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Collection zzf() {
        return new n43(this);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> zzj() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    public final Set<K> zzl() {
        throw new AssertionError("unreachable");
    }

    @Deprecated
    public final void zzp() {
        throw null;
    }

    @Deprecated
    public final boolean zzq(K k, V v) {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Collection zzr() {
        throw null;
    }

    public final /* synthetic */ Map zzs() {
        return this.zzb;
    }

    public final boolean zzu(Object obj) {
        return obj != null && super.zzu(obj);
    }
}
