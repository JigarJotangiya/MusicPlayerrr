package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class b43<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: g */
    private static final Object[] f14317g = new Object[0];

    b43() {
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f14317g);
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int zzb() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zzc() {
        throw new UnsupportedOperationException();
    }

    public g43<E> zzd() {
        if (isEmpty()) {
            return g43.zzo();
        }
        return g43.zzj(toArray(f14317g));
    }

    /* renamed from: zze */
    public abstract j63<E> iterator();

    /* access modifiers changed from: package-private */
    public abstract boolean zzf();

    /* access modifiers changed from: package-private */
    public Object[] zzg() {
        return null;
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] zzg = zzg();
            if (zzg != null) {
                return Arrays.copyOfRange(zzg, zzc(), zzb(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }
}
