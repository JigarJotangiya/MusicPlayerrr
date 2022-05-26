package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class x53<K, V> extends r43<Map.Entry<K, V>> {

    /* renamed from: i */
    private final transient k43<K, V> f25687i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final transient Object[] f25688j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final transient int f25689k;

    x53(k43<K, V> k43, Object[] objArr, int i, int i2) {
        this.f25687i = k43;
        this.f25688j = objArr;
        this.f25689k = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f25687i.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    public final int size() {
        return this.f25689k;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzd().zza(objArr, i);
    }

    public final j63<Map.Entry<K, V>> zze() {
        return zzd().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final g43<Map.Entry<K, V>> zzi() {
        return new w53(this);
    }
}
