package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z43 {
    /* renamed from: a */
    public static <E> ArrayList<E> m34424a(int i) {
        e33.m22834a(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    /* renamed from: b */
    public static <F, T> List<T> m34425b(List<F> list, i13<? super F, ? extends T> i13) {
        return new y43(list, i13);
    }
}
