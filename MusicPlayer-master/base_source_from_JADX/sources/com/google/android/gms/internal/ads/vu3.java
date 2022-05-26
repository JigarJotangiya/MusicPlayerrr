package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vu3 implements st3 {

    /* renamed from: g */
    private boolean f25019g;

    /* renamed from: h */
    private long f25020h;

    /* renamed from: i */
    private long f25021i;

    /* renamed from: j */
    private i10 f25022j = i10.f17853d;

    public vu3(ht1 ht1) {
    }

    /* renamed from: V */
    public final void mo18617V(i10 i10) {
        if (this.f25019g) {
            mo21600a(zza());
        }
        this.f25022j = i10;
    }

    /* renamed from: a */
    public final void mo21600a(long j) {
        this.f25020h = j;
        if (this.f25019g) {
            this.f25021i = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final i10 mo18619b() {
        return this.f25022j;
    }

    /* renamed from: c */
    public final void mo21601c() {
        if (!this.f25019g) {
            this.f25021i = SystemClock.elapsedRealtime();
            this.f25019g = true;
        }
    }

    /* renamed from: d */
    public final void mo21602d() {
        if (this.f25019g) {
            mo21600a(zza());
            this.f25019g = false;
        }
    }

    public final long zza() {
        long j;
        long j2 = this.f25020h;
        if (!this.f25019g) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25021i;
        i10 i10 = this.f25022j;
        if (i10.f17854a == 1.0f) {
            j = bw3.m21569c(elapsedRealtime);
        } else {
            j = i10.mo18252a(elapsedRealtime);
        }
        return j2 + j;
    }
}
