package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class k43<K, V> implements Map<K, V>, Serializable {

    /* renamed from: g */
    private transient r43<Map.Entry<K, V>> f18761g;

    /* renamed from: h */
    private transient r43<K> f18762h;

    /* renamed from: i */
    private transient b43<V> f18763i;

    k43() {
    }

    public static <K, V> k43<K, V> zzc(Map<? extends K, ? extends V> map) {
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        j43 j43 = new j43(entrySet instanceof Collection ? entrySet.size() : 4);
        j43.mo18542b(entrySet);
        return j43.mo18543c();
    }

    public static <K, V> k43<K, V> zzd() {
        return a63.zza;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public final int hashCode() {
        return f63.m23502a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        r43<K> r43 = this.f18762h;
        if (r43 != null) {
            return r43;
        }
        r43<K> zzf = zzf();
        this.f18762h = zzf;
        return zzf;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        e33.m22834a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract b43<V> zza();

    /* renamed from: zzb */
    public final b43<V> values() {
        b43<V> b43 = this.f18763i;
        if (b43 != null) {
            return b43;
        }
        b43<V> zza = zza();
        this.f18763i = zza;
        return zza;
    }

    /* access modifiers changed from: package-private */
    public abstract r43<Map.Entry<K, V>> zze();

    /* access modifiers changed from: package-private */
    public abstract r43<K> zzf();

    /* renamed from: zzg */
    public final r43<Map.Entry<K, V>> entrySet() {
        r43<Map.Entry<K, V>> r43 = this.f18761g;
        if (r43 != null) {
            return r43;
        }
        r43<Map.Entry<K, V>> zze = zze();
        this.f18761g = zze;
        return zze;
    }
}
