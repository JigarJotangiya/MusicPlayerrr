package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zi1 implements y50<Object> {

    /* renamed from: a */
    private final WeakReference<aj1> f26795a;

    /* synthetic */ zi1(aj1 aj1, yi1 yi1) {
        this.f26795a = new WeakReference<>(aj1);
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map<String, String> map) {
        aj1 aj1 = (aj1) this.f26795a.get();
        if (aj1 != null) {
            aj1.f13910g.zza();
        }
    }
}
