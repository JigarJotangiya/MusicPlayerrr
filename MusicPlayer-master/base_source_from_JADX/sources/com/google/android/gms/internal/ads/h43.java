package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h43<K, V> extends m43<K, V> {
    /* renamed from: a */
    public final h43<K, V> mo18074a(K k, V... vArr) {
        List asList = Arrays.asList(vArr);
        Collection collection = this.f19766a.get(k);
        if (collection != null) {
            for (Object next : asList) {
                e33.m22835b(k, next);
                collection.add(next);
            }
        } else {
            Iterator it = asList.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    e33.m22835b(k, next2);
                    arrayList.add(next2);
                }
                this.f19766a.put(k, arrayList);
            }
        }
        return this;
    }

    /* renamed from: b */
    public final i43<K, V> mo18075b() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.f19766a.entrySet();
        if (entrySet.isEmpty()) {
            return w33.zza;
        }
        j43 j43 = new j43(entrySet.size());
        int i = 0;
        for (Map.Entry next : entrySet) {
            Object key = next.getKey();
            g43 zzm = g43.zzm((Collection) next.getValue());
            if (!zzm.isEmpty()) {
                j43.mo18541a(key, zzm);
                i += zzm.size();
            }
        }
        return new i43<>(j43.mo18543c(), i);
    }
}
