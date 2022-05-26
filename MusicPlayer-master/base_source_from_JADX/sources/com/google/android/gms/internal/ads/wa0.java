package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wa0 {

    /* renamed from: a */
    public final List<String> f25289a;

    /* renamed from: b */
    public final List<String> f25290b;

    /* renamed from: c */
    public final List<String> f25291c;

    /* renamed from: d */
    public final List<String> f25292d;

    /* renamed from: e */
    public final List<String> f25293e;

    /* renamed from: f */
    public final List<String> f25294f;

    /* renamed from: g */
    public final String f25295g;

    /* renamed from: h */
    public final List<String> f25296h;

    /* renamed from: i */
    public final List<String> f25297i;

    /* renamed from: j */
    public final List<String> f25298j;

    /* renamed from: k */
    public final List<String> f25299k;

    /* renamed from: l */
    public final String f25300l;

    public wa0(JSONObject jSONObject) throws JSONException {
        List<String> list;
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f25289a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", (String) null);
        C2971s.m13205h();
        this.f25290b = ya0.m34073a(jSONObject, "clickurl");
        C2971s.m13205h();
        this.f25291c = ya0.m34073a(jSONObject, "imp_urls");
        C2971s.m13205h();
        this.f25292d = ya0.m34073a(jSONObject, "downloaded_imp_urls");
        C2971s.m13205h();
        this.f25294f = ya0.m34073a(jSONObject, "fill_urls");
        C2971s.m13205h();
        this.f25296h = ya0.m34073a(jSONObject, "video_start_urls");
        C2971s.m13205h();
        this.f25298j = ya0.m34073a(jSONObject, "video_complete_urls");
        C2971s.m13205h();
        this.f25297i = ya0.m34073a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            C2971s.m13205h();
            list = ya0.m34073a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f25293e = list;
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f25295g = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", (String) null);
        jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        C2971s.m13205h();
        this.f25299k = ya0.m34073a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f25300l = jSONObject.optString("response_type", (String) null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
