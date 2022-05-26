package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.wl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5711wl implements C5452pl {

    /* renamed from: a */
    private boolean f25454a;

    /* renamed from: b */
    private long f25455b;

    /* renamed from: c */
    private long f25456c;

    /* renamed from: d */
    private C5482qe f25457d = C5482qe.f21905d;

    /* renamed from: K */
    public final long mo20279K() {
        long j;
        long j2 = this.f25455b;
        if (!this.f25454a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25456c;
        C5482qe qeVar = this.f25457d;
        if (qeVar.f21906a == 1.0f) {
            j = C5740xd.m33642a(elapsedRealtime);
        } else {
            j = qeVar.mo20431a(elapsedRealtime);
        }
        return j2 + j;
    }

    /* renamed from: a */
    public final void mo21844a(long j) {
        this.f25455b = j;
        if (this.f25454a) {
            this.f25456c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo21845b() {
        if (!this.f25454a) {
            this.f25456c = SystemClock.elapsedRealtime();
            this.f25454a = true;
        }
    }

    /* renamed from: c */
    public final void mo21846c() {
        if (this.f25454a) {
            mo21844a(mo20279K());
            this.f25454a = false;
        }
    }

    /* renamed from: d */
    public final C5482qe mo20280d(C5482qe qeVar) {
        if (this.f25454a) {
            mo21844a(mo20279K());
        }
        this.f25457d = qeVar;
        return qeVar;
    }

    /* renamed from: e */
    public final void mo21847e(C5452pl plVar) {
        mo21844a(plVar.mo20279K());
        this.f25457d = plVar.mo20281s();
    }

    /* renamed from: s */
    public final C5482qe mo20281s() {
        throw null;
    }
}
