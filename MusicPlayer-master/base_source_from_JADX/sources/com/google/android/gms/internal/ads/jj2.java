package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jj2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final Map<String, Object> f18504a;

    public jj2(Map<String, Object> map) {
        this.f18504a = map;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", C2971s.m13214q().mo10979N(this.f18504a));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            C3018m1.m13388k(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
