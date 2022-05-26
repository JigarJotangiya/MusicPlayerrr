package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.qn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5491qn implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C5528rn f21973g;

    C5491qn(C5528rn rnVar) {
        this.f21973g = rnVar;
    }

    public final void run() {
        synchronized (this.f21973g.f22909i) {
            if (!this.f21973g.f22910j || !this.f21973g.f22911k) {
                ul0.m31857b("App is still foreground");
            } else {
                this.f21973g.f22910j = false;
                ul0.m31857b("App went background");
                for (C5565sn B : this.f21973g.f22912l) {
                    try {
                        B.mo17587B(false);
                    } catch (Exception e) {
                        ul0.m31860e(BuildConfig.FLAVOR, e);
                    }
                }
            }
        }
    }
}
