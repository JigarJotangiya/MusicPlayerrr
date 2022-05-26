package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class e83<T> extends b93<T> {
    private final Executor zza;
    final /* synthetic */ f83 zzb;

    e83(f83 f83, Executor executor) {
        this.zzb = f83;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzc(T t);

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        this.zzb.f16477v = null;
        if (th instanceof ExecutionException) {
            this.zzb.mo18106x(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.mo18106x(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zze(T t) {
        this.zzb.f16477v = null;
        zzc(t);
    }

    /* access modifiers changed from: package-private */
    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.mo18106x(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
