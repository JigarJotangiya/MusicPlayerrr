package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class s63<V, X extends Throwable> extends u63<V, X, y73<? super X, ? extends V>, d93<? extends V>> {
    s63(d93<? extends V> d93, Class<X> cls, y73<? super X, ? extends V> y73) {
        super(d93, cls, y73);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* bridge */ /* synthetic */ Object mo20796F(Object obj, Throwable th) throws Exception {
        y73 y73 = (y73) obj;
        d93 b = y73.mo10692b(th);
        s13.m30501d(b, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", y73);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* synthetic */ void mo20797G(Object obj) {
        mo18107y((d93) obj);
    }
}
