package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zabr extends BroadcastReceiver {

    /* renamed from: a */
    Context f10479a;

    /* renamed from: b */
    private final C3180d0 f10480b;

    /* renamed from: a */
    public final synchronized void mo11657a() {
        Context context = this.f10479a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f10479a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f10480b.mo11576a();
            mo11657a();
        }
    }
}
