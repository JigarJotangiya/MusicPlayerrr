package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.p073w.C3120a;
import com.google.android.gms.common.C3238d;
import com.google.android.gms.common.C3243e;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wk0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ Context f25436g;

    /* renamed from: h */
    final /* synthetic */ mm0 f25437h;

    wk0(xk0 xk0, Context context, mm0 mm0) {
        this.f25436g = context;
        this.f25437h = mm0;
    }

    public final void run() {
        try {
            this.f25437h.mo19449c(C3120a.m13692b(this.f25436g));
        } catch (C3238d | C3243e | IOException | IllegalStateException e) {
            this.f25437h.mo19451e(e);
            ul0.m31860e("Exception while getting advertising Id info", e);
        }
    }
}
