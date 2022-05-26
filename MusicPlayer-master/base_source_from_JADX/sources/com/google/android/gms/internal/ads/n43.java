package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class n43<K, V> extends b43<V> {

    /* renamed from: h */
    private final transient p43<K, V> f20510h;

    n43(p43<K, V> p43) {
        this.f20510h = p43;
    }

    public final boolean contains(Object obj) {
        return this.f20510h.zzu(obj);
    }

    public final /* synthetic */ Iterator iterator() {
        return new l43(this.f20510h);
    }

    public final int size() {
        return this.f20510h.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        k63 zzu = ((g43) this.f20510h.zzb.values()).listIterator(0);
        while (zzu.hasNext()) {
            i = ((b43) zzu.next()).zza(objArr, i);
        }
        return i;
    }

    public final j63<V> zze() {
        return new l43(this.f20510h);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
