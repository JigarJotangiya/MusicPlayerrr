package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tn3<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: g */
    private static final tn3 f23951g;
    private boolean zzb = true;

    static {
        tn3 tn3 = new tn3();
        f23951g = tn3;
        tn3.zzb = false;
    }

    private tn3() {
    }

    /* renamed from: a */
    private static int m31406a(Object obj) {
        if (obj instanceof byte[]) {
            return zm3.m34697b((byte[]) obj);
        }
        if (!(obj instanceof sm3)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private final void m31407b() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public static <K, V> tn3<K, V> zza() {
        return f23951g;
    }

    public final void clear() {
        m31407b();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m31406a(entry.getValue()) ^ m31406a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m31407b();
        zm3.m34700e(k);
        zm3.m34700e(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m31407b();
        for (Object next : map.keySet()) {
            zm3.m34700e(next);
            zm3.m34700e(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m31407b();
        return super.remove(obj);
    }

    public final tn3<K, V> zzb() {
        return isEmpty() ? new tn3<>() : new tn3<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(tn3<K, V> tn3) {
        m31407b();
        if (!tn3.isEmpty()) {
            putAll(tn3);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private tn3(Map<K, V> map) {
        super(map);
    }
}
