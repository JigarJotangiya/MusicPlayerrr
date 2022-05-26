package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class r93 extends b93 {
    final /* synthetic */ s93 zza;
    private final Callable zzb;

    r93(s93 s93, Callable callable) {
        this.zza = s93;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        this.zza.mo18106x(th);
    }

    /* access modifiers changed from: package-private */
    public final void zze(Object obj) {
        this.zza.mo18105w(obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
