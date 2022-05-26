package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class c33<K, V> implements g53<K, V> {

    /* renamed from: g */
    private transient Set<K> f14812g;

    /* renamed from: h */
    private transient Collection<V> f14813h;

    /* renamed from: i */
    private transient Map<K, Collection<V>> f14814i;

    c33() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g53)) {
            return false;
        }
        return zzs().equals(((g53) obj).zzs());
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> zzf();

    /* access modifiers changed from: package-private */
    public Iterator<V> zzg() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> zzj();

    /* access modifiers changed from: package-private */
    public abstract Set<K> zzl();

    public abstract boolean zzq(K k, V v);

    public Collection<V> zzr() {
        Collection<V> collection = this.f14813h;
        if (collection != null) {
            return collection;
        }
        Collection<V> zzf = zzf();
        this.f14813h = zzf;
        return zzf;
    }

    public Map<K, Collection<V>> zzs() {
        Map<K, Collection<V>> map = this.f14814i;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> zzj = zzj();
        this.f14814i = zzj;
        return zzj;
    }

    public final Set<K> zzt() {
        Set<K> set = this.f14812g;
        if (set != null) {
            return set;
        }
        Set<K> zzl = zzl();
        this.f14812g = zzl;
        return zzl;
    }

    public boolean zzu(Object obj) {
        for (Collection contains : zzs().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
