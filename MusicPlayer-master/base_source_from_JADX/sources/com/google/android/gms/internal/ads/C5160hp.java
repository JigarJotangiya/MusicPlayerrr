package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3261d;

/* renamed from: com.google.android.gms.internal.ads.hp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5160hp implements C3261d.C3263b {

    /* renamed from: a */
    final /* synthetic */ C5197ip f17723a;

    C5160hp(C5197ip ipVar) {
        this.f17723a = ipVar;
    }

    /* renamed from: C0 */
    public final void mo11815C0(ConnectionResult connectionResult) {
        synchronized (this.f17723a.f18140b) {
            this.f17723a.f18143e = null;
            if (this.f17723a.f18141c != null) {
                this.f17723a.f18141c = null;
            }
            this.f17723a.f18140b.notifyAll();
        }
    }
}
