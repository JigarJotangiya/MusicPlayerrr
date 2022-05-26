package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class c43<K, V> extends a33<K, V> implements Serializable {
    final K zza;
    final V zzb;

    c43(K k, V v) {
        this.zza = k;
        this.zzb = v;
    }

    public final K getKey() {
        return this.zza;
    }

    public final V getValue() {
        return this.zzb;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
