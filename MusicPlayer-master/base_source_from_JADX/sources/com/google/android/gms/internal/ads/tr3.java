package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class tr3<K, V, V2> {

    /* renamed from: a */
    final LinkedHashMap<K, ms3<V>> f23978a;

    tr3(int i) {
        this.f23978a = vr3.m32678b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final tr3<K, V, V2> mo21148a(K k, ms3<V> ms3) {
        LinkedHashMap<K, ms3<V>> linkedHashMap = this.f23978a;
        gs3.m24489a(k, "key");
        gs3.m24489a(ms3, "provider");
        linkedHashMap.put(k, ms3);
        return this;
    }
}
