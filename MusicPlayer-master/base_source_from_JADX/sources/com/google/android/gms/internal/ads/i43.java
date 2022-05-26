package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class i43<K, V> extends p43<K, V> implements w43<K, V> {
    i43(k43<K, g43<V>> k43, int i) {
        super(k43, i);
    }

    public final g43<V> zza(K k) {
        g43<V> g43 = (g43) this.zzb.get(k);
        return g43 == null ? g43.zzo() : g43;
    }
}
