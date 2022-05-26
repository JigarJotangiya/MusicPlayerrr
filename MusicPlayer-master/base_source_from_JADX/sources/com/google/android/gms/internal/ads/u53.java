package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class u53<T> implements Comparator<T> {
    protected u53() {
    }

    public static <T> u53<T> zzb(Comparator<T> comparator) {
        if (comparator instanceof u53) {
            return (u53) comparator;
        }
        return new r33(comparator);
    }

    public static <C extends Comparable> u53<C> zzc() {
        return s53.zza;
    }

    public abstract int compare(T t, T t2);

    public <S extends T> u53<S> zza() {
        return new d63(this);
    }
}
