package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C3261d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f70 implements C3261d.C3262a {

    /* renamed from: a */
    final /* synthetic */ mm0 f16462a;

    /* renamed from: b */
    final /* synthetic */ h70 f16463b;

    f70(h70 h70, mm0 mm0) {
        this.f16463b = h70;
        this.f16462a = mm0;
    }

    /* renamed from: K0 */
    public final void mo11813K0(Bundle bundle) {
        try {
            this.f16462a.mo19449c(this.f16463b.f17559a.mo21434i0());
        } catch (DeadObjectException e) {
            this.f16462a.mo19451e(e);
        }
    }

    /* renamed from: z */
    public final void mo11814z(int i) {
        mm0 mm0 = this.f16462a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        mm0.mo19451e(new RuntimeException(sb.toString()));
    }
}
