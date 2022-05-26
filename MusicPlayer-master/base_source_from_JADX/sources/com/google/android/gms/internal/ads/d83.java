package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class d83 extends e83 {
    final /* synthetic */ f83 zza;
    private final Callable zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d83(f83 f83, Callable callable, Executor executor) {
        super(f83, executor);
        this.zza = f83;
        Objects.requireNonNull(callable);
        this.zzc = callable;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzc.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj) {
        this.zza.mo18105w(obj);
    }
}
