package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* compiled from: com.google.android.play:core@@1.10.2 */
final class zzk extends ResultReceiver {

    /* renamed from: g */
    final /* synthetic */ C7643p f29741g;

    /* renamed from: h */
    final /* synthetic */ C6413r3 f29742h;

    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f29741g.mo28636e(-1);
            this.f29742h.f29623d.mo25364a((PendingIntent) null);
        } else if (i != 2) {
            this.f29741g.mo28635d(new C6317a(-100));
        } else {
            this.f29741g.mo28636e(0);
        }
    }
}
