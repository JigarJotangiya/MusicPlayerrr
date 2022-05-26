package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f43 extends g43 {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ g43 zzc;

    f43(g43 g43, int i, int i2) {
        this.zzc = g43;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        s13.m30498a(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    public final g43 zzh(int i, int i2) {
        s13.m30503f(i, i2, this.zzb);
        g43 g43 = this.zzc;
        int i3 = this.zza;
        return g43.subList(i + i3, i2 + i3);
    }
}
