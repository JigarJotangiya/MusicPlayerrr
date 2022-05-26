package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.C2964w;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class i60 implements C2964w {

    /* renamed from: a */
    boolean f17901a = false;

    /* renamed from: b */
    final /* synthetic */ boolean f17902b;

    /* renamed from: c */
    final /* synthetic */ C5497qt f17903c;

    /* renamed from: d */
    final /* synthetic */ Map f17904d;

    /* renamed from: e */
    final /* synthetic */ Map f17905e;

    i60(k60 k60, boolean z, C5497qt qtVar, Map map, Map map2) {
        this.f17902b = z;
        this.f17903c = qtVar;
        this.f17904d = map;
        this.f17905e = map2;
    }

    /* renamed from: A */
    public final void mo10910A(int i) {
    }

    /* renamed from: B */
    public final void mo10911B(boolean z) {
        if (!this.f17901a) {
            if (z && this.f17902b) {
                ((yf1) this.f17903c).mo15729o();
            }
            this.f17901a = true;
            this.f17904d.put((String) this.f17905e.get("event_id"), Boolean.valueOf(z));
            ((d80) this.f17903c).mo16880n0("openIntentAsync", this.f17904d);
        }
    }
}
