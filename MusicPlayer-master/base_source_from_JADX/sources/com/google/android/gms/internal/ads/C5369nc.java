package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.nc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5369nc implements Callable {

    /* renamed from: a */
    private final C5701wb f20578a;

    /* renamed from: b */
    private final C4920b8 f20579b;

    public C5369nc(C5701wb wbVar, C4920b8 b8Var) {
        this.f20578a = wbVar;
        this.f20579b = b8Var;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f20578a.mo21787l() != null) {
            this.f20578a.mo21787l().get();
        }
        C5513r8 c = this.f20578a.mo21779c();
        if (c == null) {
            return null;
        }
        try {
            synchronized (this.f20579b) {
                C4920b8 b8Var = this.f20579b;
                byte[] e = c.mo21561e();
                b8Var.mo19760m(e, 0, e.length, cm3.m21985a());
            }
            return null;
        } catch (bn3 | NullPointerException unused) {
            return null;
        }
    }
}
