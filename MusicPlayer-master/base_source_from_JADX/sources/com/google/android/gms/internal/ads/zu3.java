package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zu3 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bv3 f26923a;

    /* synthetic */ zu3(bv3 bv3, yu3 yu3) {
        this.f26923a = bv3;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f26923a.f14712b.post(new xu3(this.f26923a));
    }
}
