package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3044v0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ri2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final Bundle f22865a;

    public ri2(Bundle bundle) {
        this.f22865a = bundle;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f22865a != null) {
            try {
                C3044v0.m13479f(C3044v0.m13479f(jSONObject, "device"), "play_store").put("parental_controls", C2971s.m13214q().mo10978M(this.f22865a));
            } catch (JSONException unused) {
                C3018m1.m13388k("Failed putting parental controls bundle.");
            }
        }
    }
}
