package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class q93 extends b93<d93> {
    final /* synthetic */ s93 zza;
    private final x73 zzb;

    q93(s93 s93, x73 x73) {
        this.zza = s93;
        Objects.requireNonNull(x73);
        this.zzb = x73;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        d93 zza2 = this.zzb.zza();
        s13.m30501d(zza2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza2;
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
    public final /* synthetic */ void zze(Object obj) {
        this.zza.mo18107y((d93) obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
