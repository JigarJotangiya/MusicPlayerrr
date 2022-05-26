package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class va1 implements Runnable {

    /* renamed from: g */
    private final WeakReference<wa1> f24660g;

    /* synthetic */ va1(wa1 wa1, ua1 ua1) {
        this.f24660g = new WeakReference<>(wa1);
    }

    public final void run() {
        wa1 wa1 = (wa1) this.f24660g.get();
        if (wa1 != null) {
            wa1.mo21253K0(ta1.f23807a);
        }
    }
}
