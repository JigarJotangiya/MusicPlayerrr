package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.C2955n;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f22 extends TimerTask {

    /* renamed from: g */
    final /* synthetic */ AlertDialog f16408g;

    /* renamed from: h */
    final /* synthetic */ Timer f16409h;

    /* renamed from: i */
    final /* synthetic */ C2955n f16410i;

    f22(AlertDialog alertDialog, Timer timer, C2955n nVar) {
        this.f16408g = alertDialog;
        this.f16409h = timer;
        this.f16410i = nVar;
    }

    public final void run() {
        this.f16408g.dismiss();
        this.f16409h.cancel();
        C2955n nVar = this.f16410i;
        if (nVar != null) {
            nVar.mo10874a();
        }
    }
}
