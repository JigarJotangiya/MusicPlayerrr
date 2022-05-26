package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3044v0;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sh2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final JSONObject f23478a;

    public sh2(JSONObject jSONObject) {
        this.f23478a = jSONObject;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        try {
            JSONObject f = C3044v0.m13479f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f23478a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            C3018m1.m13388k("Failed putting app indexing json.");
        }
    }
}
