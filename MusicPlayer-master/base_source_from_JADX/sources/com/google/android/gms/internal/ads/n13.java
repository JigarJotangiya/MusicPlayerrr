package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class n13 extends BroadcastReceiver implements Runnable {

    /* renamed from: g */
    private final Handler f20460g;

    public n13(n33 n33, Handler handler, m23 m23) {
        this.f20460g = handler;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f20460g.post(this);
        }
    }

    public final void run() {
    }
}
