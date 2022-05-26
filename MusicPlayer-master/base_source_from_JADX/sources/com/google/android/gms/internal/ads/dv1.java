package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class dv1 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ mm0 f15758g;

    public /* synthetic */ dv1(mv1 mv1, mm0 mm0) {
        this.f15758g = mm0;
    }

    public final void run() {
        mm0 mm0 = this.f15758g;
        String c = C2971s.m13213p().mo17562h().mo11088d().mo15849c();
        if (!TextUtils.isEmpty(c)) {
            mm0.mo19449c(c);
        } else {
            mm0.mo19451e(new Exception());
        }
    }
}
