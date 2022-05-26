package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* compiled from: com.google.android.play:core@@1.10.2 */
final class zzd extends ResultReceiver {

    /* renamed from: g */
    final /* synthetic */ C7643p f29324g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzd(C6300j jVar, Handler handler, C7643p pVar) {
        super(handler);
        this.f29324g = pVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f29324g.mo28636e(-1);
        } else if (i != 2) {
            this.f29324g.mo28636e(1);
        } else {
            this.f29324g.mo28636e(0);
        }
    }
}
