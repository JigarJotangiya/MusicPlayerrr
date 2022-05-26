package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dt2 {

    /* renamed from: a */
    private final Object f15744a;

    /* renamed from: b */
    private final List<d93<?>> f15745b;

    /* renamed from: c */
    final /* synthetic */ nt2 f15746c;

    /* synthetic */ dt2(nt2 nt2, Object obj, List list, ct2 ct2) {
        this.f15746c = nt2;
        this.f15744a = obj;
        this.f15745b = list;
    }

    /* renamed from: a */
    public final <O> mt2<O> mo17015a(Callable<O> callable) {
        r83<V> c = s83.m30601c(this.f15745b);
        d93<C> a = c.mo20613a(bt2.f14698a, hm0.f17713f);
        nt2 nt2 = this.f15746c;
        return new mt2(nt2, this.f15744a, (String) null, a, this.f15745b, c.mo20613a(callable, nt2.f20721a), (lt2) null);
    }
}
