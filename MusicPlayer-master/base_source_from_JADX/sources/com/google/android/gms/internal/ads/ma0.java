package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ma0 implements m60 {

    /* renamed from: a */
    private final mm0 f20004a;

    public ma0(na0 na0, mm0 mm0) {
        this.f20004a = mm0;
    }

    /* renamed from: a */
    public final void mo17140a(JSONObject jSONObject) {
        try {
            this.f20004a.mo19449c(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f20004a.mo19451e(e);
        }
    }

    /* renamed from: p */
    public final void mo17141p(String str) {
        if (str == null) {
            try {
                this.f20004a.mo19451e(new p90());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f20004a.mo19451e(new p90(str));
        }
    }
}
