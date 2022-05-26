package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kw2 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ lw2 f19011a;

    kw2(lw2 lw2) {
        this.f19011a = lw2;
    }

    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent != null) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                lw2.m26992b(this.f19011a, true);
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                lw2.m26992b(this.f19011a, false);
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                lw2.m26992b(this.f19011a, false);
            }
        }
    }
}
