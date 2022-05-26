package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class l23 extends e53 {

    /* renamed from: i */
    final transient Map f19165i;

    /* renamed from: j */
    final /* synthetic */ z23 f19166j;

    l23(z23 z23, Map map) {
        this.f19166j = z23;
        this.f19165i = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set<Map.Entry> mo17122a() {
        return new j23(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map.Entry mo19050b(Map.Entry entry) {
        Object key = entry.getKey();
        return new c43(key, this.f19166j.zzc(key, (Collection) entry.getValue()));
    }

    public final void clear() {
        if (this.f19165i == this.f19166j.f26647j) {
            this.f19166j.zzp();
        } else {
            v43.m32154b(new k23(this));
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.f19165i;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f19165i.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) f53.m23475a(this.f19165i, obj);
        if (collection == null) {
            return null;
        }
        return this.f19166j.zzc(obj, collection);
    }

    public final int hashCode() {
        return this.f19165i.hashCode();
    }

    public Set keySet() {
        return this.f19166j.zzt();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f19165i.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza = this.f19166j.zza();
        zza.addAll(collection);
        z23 z23 = this.f19166j;
        z23.f26648k = z23.f26648k - collection.size();
        collection.clear();
        return zza;
    }

    public final int size() {
        return this.f19165i.size();
    }

    public final String toString() {
        return this.f19165i.toString();
    }
}
