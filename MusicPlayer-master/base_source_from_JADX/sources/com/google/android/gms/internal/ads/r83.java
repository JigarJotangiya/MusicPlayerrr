package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r83<V> {

    /* renamed from: a */
    private final boolean f22778a;

    /* renamed from: b */
    private final g43<d93<? extends V>> f22779b;

    /* synthetic */ r83(boolean z, g43 g43, q83 q83) {
        this.f22778a = z;
        this.f22779b = g43;
    }

    /* renamed from: a */
    public final <C> d93<C> mo20613a(Callable<C> callable, Executor executor) {
        return new f83(this.f22779b, this.f22778a, executor, callable);
    }
}
