package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qc2 implements sg2<rc2> {

    /* renamed from: a */
    private final e93 f21899a;

    /* renamed from: b */
    private final Context f21900b;

    public qc2(e93 e93, Context context) {
        this.f21899a = e93;
        this.f21900b = context;
    }

    /* renamed from: a */
    public final d93<rc2> mo15767a() {
        return this.f21899a.mo17138A0(new pc2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ rc2 mo20428b() throws Exception {
        double d;
        Intent registerReceiver = this.f21900b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d = ((double) registerReceiver.getIntExtra("level", -1)) / ((double) registerReceiver.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new rc2(d, z);
    }
}
