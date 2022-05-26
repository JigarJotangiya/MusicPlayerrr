package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.C3044v0;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gp2 {

    /* renamed from: a */
    public final String f17223a;

    /* renamed from: b */
    public final String f17224b;

    /* renamed from: c */
    public final JSONObject f17225c;

    /* renamed from: d */
    public final JSONObject f17226d;

    gp2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject h = C3044v0.m13481h(jsonReader);
        this.f17226d = h;
        this.f17223a = h.optString("ad_html", (String) null);
        this.f17224b = h.optString("ad_base_url", (String) null);
        this.f17225c = h.optJSONObject("ad_json");
    }
}
