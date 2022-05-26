package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.ads.internal.util.a2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2975a2 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C2979b2 f9974a;

    /* synthetic */ C2975a2(C2979b2 b2Var, C3057z1 z1Var) {
        this.f9974a = b2Var;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f9974a.f9984c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f9974a.f9984c = false;
        }
    }
}
