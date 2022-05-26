package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.C3359d;
import com.google.android.gms.internal.ads.rg2;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xc2<S extends rg2> implements sg2<S> {

    /* renamed from: a */
    private final AtomicReference<wc2<S>> f25749a = new AtomicReference<>();

    /* renamed from: b */
    private final C3359d f25750b;

    /* renamed from: c */
    private final sg2<S> f25751c;

    /* renamed from: d */
    private final long f25752d;

    public xc2(sg2<S> sg2, long j, C3359d dVar) {
        this.f25750b = dVar;
        this.f25751c = sg2;
        this.f25752d = j;
    }

    /* renamed from: a */
    public final d93<S> mo15767a() {
        wc2 wc2 = this.f25749a.get();
        if (wc2 == null || wc2.mo21798a()) {
            wc2 = new wc2(this.f25751c.mo15767a(), this.f25752d, this.f25750b);
            this.f25749a.set(wc2);
        }
        return wc2.f25336a;
    }
}
