package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ug0 implements Callable<tg0> {

    /* renamed from: a */
    final /* synthetic */ Context f24331a;

    /* renamed from: b */
    final /* synthetic */ wg0 f24332b;

    ug0(wg0 wg0, Context context) {
        this.f24332b = wg0;
        this.f24331a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        tg0 tg0;
        vg0 vg0 = (vg0) this.f24332b.f25385a.get(this.f24331a);
        if (vg0 == null || vg0.f24758a + w00.f25160a.mo20989e().longValue() < C2971s.m13198a().mo11988a()) {
            tg0 = new sg0(this.f24331a).mo20844a();
        } else {
            tg0 = new sg0(this.f24331a, vg0.f24759b).mo20844a();
        }
        this.f24332b.f25385a.put(this.f24331a, new vg0(this.f24332b, tg0));
        return tg0;
    }
}
