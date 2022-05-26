package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* renamed from: com.google.android.gms.ads.internal.util.q1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C3030q1 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3033r1 f10064g;

    /* renamed from: h */
    public final /* synthetic */ Context f10065h;

    /* renamed from: i */
    public final /* synthetic */ String f10066i = "admob";

    public /* synthetic */ C3030q1(C3033r1 r1Var, Context context, String str) {
        this.f10064g = r1Var;
        this.f10065h = context;
    }

    public final void run() {
        this.f10064g.mo11111l(this.f10065h, this.f10066i);
    }
}
