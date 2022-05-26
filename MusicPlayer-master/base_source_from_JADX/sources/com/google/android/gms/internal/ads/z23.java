package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class z23<K, V> extends c33<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public transient Map<K, Collection<V>> f26647j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public transient int f26648k;

    protected z23(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f26647j = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    static /* bridge */ /* synthetic */ void zzo(z23 z23, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = z23.f26647j;
        Objects.requireNonNull(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            z23.f26648k -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> zza();

    /* access modifiers changed from: package-private */
    public <E> Collection<E> zzb(Collection<E> collection) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public Collection<V> zzc(K k, Collection<V> collection) {
        throw null;
    }

    public final int zze() {
        return this.f26648k;
    }

    /* access modifiers changed from: package-private */
    public final Collection<V> zzf() {
        return new b33(this);
    }

    /* access modifiers changed from: package-private */
    public final Iterator<V> zzg() {
        return new i23(this);
    }

    /* access modifiers changed from: package-private */
    public final List<V> zzh(K k, List<V> list, w23 w23) {
        if (list instanceof RandomAccess) {
            return new s23(this, k, list, w23);
        }
        return new y23(this, k, list, w23);
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> zzj() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> zzk() {
        Map<K, Collection<V>> map = this.f26647j;
        if (map instanceof NavigableMap) {
            return new q23(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new t23(this, (SortedMap) map);
        }
        return new l23(this, map);
    }

    /* access modifiers changed from: package-private */
    public Set<K> zzl() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Set<K> zzm() {
        Map<K, Collection<V>> map = this.f26647j;
        if (map instanceof NavigableMap) {
            return new r23(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new u23(this, (SortedMap) map);
        }
        return new p23(this, map);
    }

    public final void zzp() {
        for (Collection<V> clear : this.f26647j.values()) {
            clear.clear();
        }
        this.f26647j.clear();
        this.f26648k = 0;
    }

    public final boolean zzq(K k, V v) {
        Collection collection = this.f26647j.get(k);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(v)) {
                this.f26648k++;
                this.f26647j.put(k, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f26648k++;
            return true;
        }
    }
}
