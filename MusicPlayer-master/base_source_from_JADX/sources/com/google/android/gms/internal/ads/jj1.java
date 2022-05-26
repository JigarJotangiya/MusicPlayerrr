package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jj1 implements yr3<C5638um> {

    /* renamed from: a */
    private final ms3<zzcjf> f18502a;

    /* renamed from: b */
    private final ms3<String> f18503b;

    public jj1(ms3<zzcjf> ms3, ms3<String> ms32) {
        this.f18502a = ms3;
        this.f18503b = ms32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        zzcjf b = ((cu0) this.f18502a).mo16749b();
        C2971s.m13214q();
        return new C5638um(UUID.randomUUID().toString(), b, "native", new JSONObject(), false, true);
    }
}
