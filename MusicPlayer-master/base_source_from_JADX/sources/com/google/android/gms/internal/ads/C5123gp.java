package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C3261d;

/* renamed from: com.google.android.gms.internal.ads.gp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5123gp implements C3261d.C3262a {

    /* renamed from: a */
    final /* synthetic */ C5197ip f17218a;

    C5123gp(C5197ip ipVar) {
        this.f17218a = ipVar;
    }

    /* renamed from: K0 */
    public final void mo11813K0(Bundle bundle) {
        synchronized (this.f17218a.f18140b) {
            try {
                if (this.f17218a.f18141c != null) {
                    C5197ip ipVar = this.f17218a;
                    ipVar.f18143e = ipVar.f18141c.mo18955j0();
                }
            } catch (DeadObjectException e) {
                ul0.m31860e("Unable to obtain a cache service instance.", e);
                C5197ip.m25351h(this.f17218a);
            }
            this.f17218a.f18140b.notifyAll();
        }
    }

    /* renamed from: z */
    public final void mo11814z(int i) {
        synchronized (this.f17218a.f18140b) {
            this.f17218a.f18143e = null;
            this.f17218a.f18140b.notifyAll();
        }
    }
}
