package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ku0 implements yr3<ah0> {

    /* renamed from: a */
    private final ms3<Context> f18992a;

    public ku0(ms3<Context> ms3) {
        this.f18992a = ms3;
    }

    /* renamed from: b */
    public final ah0 mo10679a() {
        Context b = ((rt0) this.f18992a).mo20741b();
        ba0 b2 = C2971s.m13204g().mo20616b(b, zzcjf.m34965Y());
        v90<JSONObject> v90 = y90.f26304b;
        b2.mo16162a("google.afma.request.getAdDictionary", v90, v90);
        return new zg0(b, C2971s.m13204g().mo20616b(b, zzcjf.m34965Y()).mo16162a("google.afma.sdkConstants.getSdkConstants", v90, v90));
    }
}
