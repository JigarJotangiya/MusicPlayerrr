package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tq1 implements a91 {

    /* renamed from: g */
    private final pr0 f23971g;

    tq1(pr0 pr0) {
        this.f23971g = pr0;
    }

    /* renamed from: b */
    public final void mo15713b(Context context) {
        pr0 pr0 = this.f23971g;
        if (pr0 != null) {
            pr0.onPause();
        }
    }

    /* renamed from: o */
    public final void mo15714o(Context context) {
        pr0 pr0 = this.f23971g;
        if (pr0 != null) {
            pr0.onResume();
        }
    }

    /* renamed from: u */
    public final void mo15715u(Context context) {
        pr0 pr0 = this.f23971g;
        if (pr0 != null) {
            pr0.destroy();
        }
    }
}
