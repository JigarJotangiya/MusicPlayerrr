package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ap1<T> implements y50<Object> {

    /* renamed from: a */
    private final WeakReference<T> f14029a;

    /* renamed from: b */
    private final String f14030b;

    /* renamed from: c */
    private final y50<T> f14031c;

    /* renamed from: d */
    final /* synthetic */ bp1 f14032d;

    /* synthetic */ ap1(bp1 bp1, WeakReference weakReference, String str, y50 y50, zo1 zo1) {
        this.f14032d = bp1;
        this.f14029a = weakReference;
        this.f14030b = str;
        this.f14031c = y50;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map<String, String> map) {
        Object obj2 = this.f14029a.get();
        if (obj2 == null) {
            this.f14032d.mo16357k(this.f14030b, this);
        } else {
            this.f14031c.mo15685a(obj2, map);
        }
    }
}
