package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ui1 implements y50<Object> {

    /* renamed from: a */
    private final WeakReference<aj1> f24340a;

    /* synthetic */ ui1(aj1 aj1, ti1 ti1) {
        this.f24340a = new WeakReference<>(aj1);
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map<String, String> map) {
        aj1 aj1 = (aj1) this.f24340a.get();
        if (aj1 != null && "_ac".equals(map.get("eventName"))) {
            aj1.f13911h.mo10632u0();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22305C6)).booleanValue()) {
                aj1.f13912i.mo15729o();
            }
        }
    }
}
