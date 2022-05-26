package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class g43<E> extends b43<E> implements List<E>, RandomAccess {

    /* renamed from: h */
    private static final k63<Object> f16947h = new e43(v53.zza, 0);

    g43() {
    }

    public static <E> d43<E> zzi() {
        return new d43<>(4);
    }

    static <E> g43<E> zzj(Object[] objArr) {
        return zzk(objArr, objArr.length);
    }

    static <E> g43<E> zzk(Object[] objArr, int i) {
        if (i == 0) {
            return v53.zza;
        }
        return new v53(objArr, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Collection, java.lang.Iterable<? extends E>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E> com.google.android.gms.internal.ads.g43<E> zzl(java.lang.Iterable<? extends E> r0) {
        /*
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.g43 r0 = zzm(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g43.zzl(java.lang.Iterable):com.google.android.gms.internal.ads.g43");
    }

    public static <E> g43<E> zzm(Collection<? extends E> collection) {
        if (collection instanceof b43) {
            g43<E> zzd = ((b43) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzk(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        t53.m31105b(array2, length);
        return zzk(array2, length);
    }

    public static <E> g43<E> zzn(E[] eArr) {
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        t53.m31105b(objArr, length);
        return zzk(objArr, length);
    }

    public static <E> g43<E> zzo() {
        return v53.zza;
    }

    public static <E> g43<E> zzp(E e) {
        Object[] objArr = {e};
        t53.m31105b(objArr, 1);
        return zzk(objArr, 1);
    }

    public static <E> g43<E> zzq(E e, E e2) {
        Object[] objArr = {e, e2};
        t53.m31105b(objArr, 2);
        return zzk(objArr, 2);
    }

    public static <E> g43<E> zzr(E e, E e2, E e3) {
        Object[] objArr = {"2011", "1009", "3010"};
        t53.m31105b(objArr, 3);
        return zzk(objArr, 3);
    }

    public static <E> g43<E> zzs(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        t53.m31105b(objArr, 5);
        return zzk(objArr, 5);
    }

    public static <E> g43<E> zzt(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        t53.m31105b(objArr, 6);
        return zzk(objArr, 6);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (q13.m29306a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!q13.m29306a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Deprecated
    public final g43<E> zzd() {
        return this;
    }

    public final j63<E> zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public g43<E> subList(int i, int i2) {
        s13.m30503f(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return v53.zza;
        }
        return new f43(this, i, i3);
    }

    /* renamed from: zzu */
    public final k63<E> listIterator(int i) {
        s13.m30499b(i, size(), "index");
        if (isEmpty()) {
            return f16947h;
        }
        return new e43(this, i);
    }
}
