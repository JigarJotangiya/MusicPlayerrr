package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w53 extends g43<Map.Entry> {
    final /* synthetic */ x53 zza;

    w53(x53 x53) {
        this.zza = x53;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        s13.m30498a(i, this.zza.f25689k, "index");
        int i2 = i + i;
        Object obj = this.zza.f25688j[i2];
        obj.getClass();
        Object obj2 = this.zza.f25688j[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.f25689k;
    }

    public final boolean zzf() {
        return true;
    }
}
