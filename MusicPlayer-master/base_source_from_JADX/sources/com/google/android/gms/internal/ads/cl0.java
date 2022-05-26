package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2977b0;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cl0 extends C2977b0 {

    /* renamed from: c */
    final /* synthetic */ fl0 f15011c;

    cl0(fl0 fl0) {
        this.f15011c = fl0;
    }

    /* renamed from: a */
    public final void mo10867a() {
        C5614tz tzVar = new C5614tz(this.f15011c.f16667e, this.f15011c.f16668f.f27376g);
        synchronized (this.f15011c.f16663a) {
            try {
                C2971s.m13203f();
                C5725wz.m33467a(this.f15011c.f16669g, tzVar);
            } catch (IllegalArgumentException e) {
                ul0.m31863h("Cannot config CSI reporter.", e);
            }
        }
    }
}
