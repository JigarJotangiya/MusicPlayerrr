package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C2979b2;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class go0 implements Runnable {

    /* renamed from: g */
    private final rn0 f17210g;

    /* renamed from: h */
    private boolean f17211h = false;

    go0(rn0 rn0) {
        this.f17210g = rn0;
    }

    /* renamed from: c */
    private final void m24459c() {
        w03 w03 = C2979b2.f9980i;
        w03.removeCallbacks(this);
        w03.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void mo17998a() {
        this.f17211h = true;
        this.f17210g.mo20720y();
    }

    /* renamed from: b */
    public final void mo17999b() {
        this.f17211h = false;
        m24459c();
    }

    public final void run() {
        if (!this.f17211h) {
            this.f17210g.mo20720y();
            m24459c();
        }
    }
}
