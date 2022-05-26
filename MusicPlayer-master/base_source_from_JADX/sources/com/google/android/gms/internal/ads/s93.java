package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class s93<V> extends i83<V> implements RunnableFuture<V> {

    /* renamed from: n */
    private volatile b93<?> f23385n;

    s93(x73<V> x73) {
        this.f23385n = new q93(this, x73);
    }

    /* renamed from: F */
    static <V> s93<V> m30624F(Runnable runnable, V v) {
        return new s93<>(Executors.callable(runnable, v));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo18099i() {
        b93<?> b93 = this.f23385n;
        if (b93 == null) {
            return super.mo18099i();
        }
        String obj = b93.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18102j() {
        b93<?> b93;
        if (mo18108z() && (b93 = this.f23385n) != null) {
            b93.zzh();
        }
        this.f23385n = null;
    }

    public final void run() {
        b93<?> b93 = this.f23385n;
        if (b93 != null) {
            b93.run();
        }
        this.f23385n = null;
    }

    s93(Callable<V> callable) {
        this.f23385n = new r93(this, callable);
    }
}
