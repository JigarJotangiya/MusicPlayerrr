package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class p33<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Object f21318m = new Object();

    /* renamed from: g */
    private transient Object f21319g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public transient int f21320h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public transient int f21321i;

    /* renamed from: j */
    private transient Set<K> f21322j;

    /* renamed from: k */
    private transient Set<Map.Entry<K, V>> f21323k;

    /* renamed from: l */
    private transient Collection<V> f21324l;
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;

    p33() {
        zzp(3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int[] m28872a() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Object[] m28873b() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Object[] m28874c() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final int m28875d() {
        return (1 << (this.f21320h & 31)) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final int m28876e(Object obj) {
        if (zzr()) {
            return -1;
        }
        int b = y33.m34010b(obj);
        int d = m28875d();
        Object obj2 = this.f21319g;
        obj2.getClass();
        int c = q33.m29344c(obj2, b & d);
        if (c != 0) {
            int i = ~d;
            int i2 = b & i;
            do {
                int i3 = c - 1;
                int i4 = m28872a()[i3];
                if ((i4 & i) == i2 && q13.m29306a(obj, m28873b()[i3])) {
                    return i3;
                }
                c = i4 & d;
            } while (c != 0);
        }
        return -1;
    }

    /* renamed from: f */
    private final int m28877f(int i, int i2, int i3, int i4) {
        Object d = q33.m29345d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            q33.m29346e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f21319g;
        obj.getClass();
        int[] a = m28872a();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = q33.m29344c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = a[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = q33.m29344c(d, i10);
                q33.m29346e(d, i10, c);
                a[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f21319g = d;
        m28879h(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final Object m28878g(Object obj) {
        if (zzr()) {
            return f21318m;
        }
        int d = m28875d();
        Object obj2 = this.f21319g;
        obj2.getClass();
        int b = q33.m29343b(obj, (Object) null, d, obj2, m28872a(), m28873b(), (Object[]) null);
        if (b == -1) {
            return f21318m;
        }
        Object obj3 = m28874c()[b];
        zzq(b, d);
        this.f21321i--;
        zzo();
        return obj3;
    }

    /* renamed from: h */
    private final void m28879h(int i) {
        this.f21320h = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f21320h & -32);
    }

    static /* synthetic */ Object zzg(p33 p33, int i) {
        return p33.m28873b()[i];
    }

    static /* synthetic */ Object zzi(p33 p33) {
        Object obj = p33.f21319g;
        obj.getClass();
        return obj;
    }

    static /* synthetic */ Object zzj(p33 p33, int i) {
        return p33.m28874c()[i];
    }

    static /* synthetic */ void zzn(p33 p33, int i, Object obj) {
        p33.m28874c()[i] = obj;
    }

    public final void clear() {
        if (!zzr()) {
            zzo();
            Map zzl = zzl();
            if (zzl != null) {
                this.f21320h = q63.m29378a(size(), 3, 1073741823);
                zzl.clear();
                this.f21319g = null;
                this.f21321i = 0;
                return;
            }
            Arrays.fill(m28873b(), 0, this.f21321i, (Object) null);
            Arrays.fill(m28874c(), 0, this.f21321i, (Object) null);
            Object obj = this.f21319g;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(m28872a(), 0, this.f21321i, 0);
            this.f21321i = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        return m28876e(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
        }
        for (int i = 0; i < this.f21321i; i++) {
            if (q13.m29306a(obj, m28874c()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f21323k;
        if (set != null) {
            return set;
        }
        i33 i33 = new i33(this);
        this.f21323k = i33;
        return i33;
    }

    public final V get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int e = m28876e(obj);
        if (e == -1) {
            return null;
        }
        return m28874c()[e];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f21322j;
        if (set != null) {
            return set;
        }
        l33 l33 = new l33(this);
        this.f21322j = l33;
        return l33;
    }

    public final V put(K k, V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (zzr()) {
            s13.m30504g(zzr(), "Arrays already allocated");
            int i = this.f21320h;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f21319g = q33.m29345d(max2);
            m28879h(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(k2, v2);
        }
        int[] a = m28872a();
        Object[] b = m28873b();
        V[] c = m28874c();
        int i2 = this.f21321i;
        int i3 = i2 + 1;
        int b2 = y33.m34010b(k);
        int d = m28875d();
        int i4 = b2 & d;
        Object obj = this.f21319g;
        obj.getClass();
        int c2 = q33.m29344c(obj, i4);
        if (c2 != 0) {
            int i5 = ~d;
            int i6 = b2 & i5;
            int i7 = 0;
            while (true) {
                int i8 = c2 - 1;
                int i9 = a[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !q13.m29306a(k2, b[i8])) {
                    int i11 = i9 & d;
                    i7++;
                    if (i11 != 0) {
                        c2 = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m28875d() + 1, 1.0f);
                        for (int zze = zze(); zze >= 0; zze = zzf(zze)) {
                            linkedHashMap.put(m28873b()[zze], m28874c()[zze]);
                        }
                        this.f21319g = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(k2, v2);
                    } else if (i3 > d) {
                        d = m28877f(d, q33.m29342a(d), b2, i2);
                    } else {
                        a[i8] = (i3 & d) | i10;
                    }
                } else {
                    V v3 = c[i8];
                    c[i8] = v2;
                    return v3;
                }
            }
        } else if (i3 > d) {
            d = m28877f(d, q33.m29342a(d), b2, i2);
        } else {
            Object obj2 = this.f21319g;
            obj2.getClass();
            q33.m29346e(obj2, i4, i3);
        }
        int length = m28872a().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(m28872a(), min);
            this.zzb = Arrays.copyOf(m28873b(), min);
            this.zzc = Arrays.copyOf(m28874c(), min);
        }
        m28872a()[i2] = (~d) & b2;
        m28873b()[i2] = k2;
        m28874c()[i2] = v2;
        this.f21321i = i3;
        zzo();
        return null;
    }

    public final V remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        V g = m28878g(obj);
        if (g == f21318m) {
            return null;
        }
        return g;
    }

    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.f21321i;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f21324l;
        if (collection != null) {
            return collection;
        }
        o33 o33 = new o33(this);
        this.f21324l = o33;
        return o33;
    }

    /* access modifiers changed from: package-private */
    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.f21321i) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final Map<K, V> zzl() {
        Object obj = this.f21319g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void zzo() {
        this.f21320h += 32;
    }

    /* access modifiers changed from: package-private */
    public final void zzp(int i) {
        this.f21320h = q63.m29378a(i, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    public final void zzq(int i, int i2) {
        Object obj = this.f21319g;
        obj.getClass();
        int[] a = m28872a();
        Object[] b = m28873b();
        Object[] c = m28874c();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = b[size];
            b[i] = obj2;
            c[i] = c[size];
            b[size] = null;
            c[size] = null;
            a[i] = a[size];
            a[size] = 0;
            int b2 = y33.m34010b(obj2) & i2;
            int c2 = q33.m29344c(obj, b2);
            int i3 = size + 1;
            if (c2 != i3) {
                while (true) {
                    int i4 = c2 - 1;
                    int i5 = a[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        c2 = i6;
                    } else {
                        a[i4] = ((i + 1) & i2) | (i5 & (~i2));
                        return;
                    }
                }
            } else {
                q33.m29346e(obj, b2, i + 1);
            }
        } else {
            b[i] = null;
            c[i] = null;
            a[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzr() {
        return this.f21319g == null;
    }

    p33(int i) {
        zzp(8);
    }
}
