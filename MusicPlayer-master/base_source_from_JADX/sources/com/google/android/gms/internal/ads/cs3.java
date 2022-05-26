package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cs3<K, V> extends ur3<K, V, V> {
    static {
        zr3.m34774b(Collections.emptyMap());
    }

    /* synthetic */ cs3(Map map, as3 as3) {
        super(map);
    }

    /* renamed from: c */
    public static <K, V> bs3<K, V> m22109c(int i) {
        return new bs3<>(i, (as3) null);
    }

    /* renamed from: d */
    public final Map<K, V> mo10679a() {
        LinkedHashMap b = vr3.m32678b(mo21358b().size());
        for (Map.Entry entry : mo21358b().entrySet()) {
            b.put(entry.getKey(), ((ms3) entry.getValue()).mo10679a());
        }
        return Collections.unmodifiableMap(b);
    }
}
