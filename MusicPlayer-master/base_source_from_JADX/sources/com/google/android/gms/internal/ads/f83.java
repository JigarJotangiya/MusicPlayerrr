package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f83<V> extends q73<Object, V> {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public e83<?> f16477v;

    f83(b43<? extends d93<?>> b43, boolean z, Executor executor, Callable<V> callable) {
        super(b43, z, false);
        this.f16477v = new d83(this, callable, executor);
        mo20407U();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo16547M(int i) {
        super.mo16547M(i);
        if (i == 1) {
            this.f16477v = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo16548S(int i, Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo16549T() {
        e83<?> e83 = this.f16477v;
        if (e83 != null) {
            e83.zzf();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo17511t() {
        e83<?> e83 = this.f16477v;
        if (e83 != null) {
            e83.zzh();
        }
    }
}
