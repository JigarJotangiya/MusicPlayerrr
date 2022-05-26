package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class fn3 {

    /* renamed from: a */
    protected volatile zn3 f16687a;

    /* renamed from: b */
    private volatile kl3 f16688b;

    static {
        cm3.m21985a();
    }

    /* renamed from: a */
    public final int mo17576a() {
        if (this.f16688b != null) {
            return ((il3) this.f16688b).zza.length;
        }
        if (this.f16687a != null) {
            return this.f16687a.mo20471g();
        }
        return 0;
    }

    /* renamed from: b */
    public final kl3 mo17577b() {
        if (this.f16688b != null) {
            return this.f16688b;
        }
        synchronized (this) {
            if (this.f16688b != null) {
                kl3 kl3 = this.f16688b;
                return kl3;
            }
            if (this.f16687a == null) {
                this.f16688b = kl3.zzb;
            } else {
                this.f16688b = this.f16687a.mo21560b();
            }
            kl3 kl32 = this.f16688b;
            return kl32;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17578c(com.google.android.gms.internal.ads.zn3 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zn3 r0 = r1.f16687a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zn3 r0 = r1.f16687a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f16687a = r2     // Catch:{ bn3 -> 0x0011 }
            com.google.android.gms.internal.ads.kl3 r0 = com.google.android.gms.internal.ads.kl3.zzb     // Catch:{ bn3 -> 0x0011 }
            r1.f16688b = r0     // Catch:{ bn3 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f16687a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.kl3 r2 = com.google.android.gms.internal.ads.kl3.zzb     // Catch:{ all -> 0x001b }
            r1.f16688b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fn3.mo17578c(com.google.android.gms.internal.ads.zn3):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn3)) {
            return false;
        }
        fn3 fn3 = (fn3) obj;
        zn3 zn3 = this.f16687a;
        zn3 zn32 = fn3.f16687a;
        if (zn3 == null && zn32 == null) {
            return mo17577b().equals(fn3.mo17577b());
        }
        if (zn3 != null && zn32 != null) {
            return zn3.equals(zn32);
        }
        if (zn3 != null) {
            fn3.mo17578c(zn3.mo15911c());
            return zn3.equals(fn3.f16687a);
        }
        mo17578c(zn32.mo15911c());
        return this.f16687a.equals(zn32);
    }

    public int hashCode() {
        return 1;
    }
}
