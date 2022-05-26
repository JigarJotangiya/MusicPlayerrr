package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p082e.p098e.C3465a;
import p082e.p098e.C3467b;

/* renamed from: com.google.android.gms.common.util.e */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3360e {
    @RecentlyNonNull
    /* renamed from: a */
    public static <K, V> Map<K, V> m14440a(@RecentlyNonNull K k, @RecentlyNonNull V v, @RecentlyNonNull K k2, @RecentlyNonNull V v2, @RecentlyNonNull K k3, @RecentlyNonNull V v3) {
        Map f = m14445f(3, false);
        f.put(k, v);
        f.put(k2, v2);
        f.put(k3, v3);
        return Collections.unmodifiableMap(f);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static <K, V> Map<K, V> m14441b(@RecentlyNonNull K[] kArr, @RecentlyNonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        } else if (length == 0) {
            return Collections.emptyMap();
        } else {
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map f = m14445f(length, false);
            for (int i = 0; i < kArr.length; i++) {
                f.put(kArr[i], vArr[i]);
            }
            return Collections.unmodifiableMap(f);
        }
    }

    @RecentlyNonNull
    @Deprecated
    /* renamed from: c */
    public static <T> Set<T> m14442c(@RecentlyNonNull T t, @RecentlyNonNull T t2, @RecentlyNonNull T t3) {
        Set e = m14444e(3, false);
        e.add(t);
        e.add(t2);
        e.add(t3);
        return Collections.unmodifiableSet(e);
    }

    @RecentlyNonNull
    @Deprecated
    /* renamed from: d */
    public static <T> Set<T> m14443d(@RecentlyNonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set e = m14444e(2, false);
            e.add(t);
            e.add(t2);
            return Collections.unmodifiableSet(e);
        } else if (length == 3) {
            return m14442c(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set e2 = m14444e(length, false);
                Collections.addAll(e2, tArr);
                return Collections.unmodifiableSet(e2);
            }
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            Set e3 = m14444e(4, false);
            e3.add(t3);
            e3.add(t4);
            e3.add(t5);
            e3.add(t6);
            return Collections.unmodifiableSet(e3);
        }
    }

    /* renamed from: e */
    private static <T> Set<T> m14444e(int i, boolean z) {
        float f = true != z ? 1.0f : 0.75f;
        if (i <= (true != z ? 256 : 128)) {
            return new C3467b(i);
        }
        return new HashSet(i, f);
    }

    /* renamed from: f */
    private static <K, V> Map<K, V> m14445f(int i, boolean z) {
        if (i <= 256) {
            return new C3465a(i);
        }
        return new HashMap(i, 1.0f);
    }
}
