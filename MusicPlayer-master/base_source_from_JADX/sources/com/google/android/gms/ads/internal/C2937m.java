package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.ads.internal.m */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2937m implements View.OnTouchListener {

    /* renamed from: g */
    final /* synthetic */ C2970r f9841g;

    C2937m(C2970r rVar) {
        this.f9841g = rVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f9841g.f9937n == null) {
            return false;
        }
        this.f9841g.f9937n.mo22000d(motionEvent);
        return false;
    }
}
