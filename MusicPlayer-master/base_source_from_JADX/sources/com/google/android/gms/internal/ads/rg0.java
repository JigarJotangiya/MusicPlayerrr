package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rg0 {

    /* renamed from: a */
    private final List<String> f22840a;

    /* renamed from: b */
    private final String f22841b;

    /* renamed from: c */
    private final String f22842c;

    /* renamed from: d */
    private final boolean f22843d;

    /* renamed from: e */
    private final boolean f22844e;

    /* renamed from: f */
    private final String f22845f;

    /* renamed from: g */
    private final int f22846g;

    /* renamed from: h */
    private final JSONObject f22847h;

    /* renamed from: i */
    private final String f22848i;

    public rg0(JSONObject jSONObject) {
        List<String> list;
        this.f22845f = jSONObject.optString("url");
        this.f22841b = jSONObject.optString("base_uri");
        this.f22842c = jSONObject.optString("post_parameters");
        this.f22843d = m30112j(jSONObject.optString("drt_include"));
        this.f22844e = m30112j(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        if (optString == null) {
            list = null;
        } else {
            list = Arrays.asList(optString.split(","));
        }
        this.f22840a = list;
        this.f22846g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f22847h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f22848i = jSONObject.optString("pool_key");
    }

    /* renamed from: j */
    private static boolean m30112j(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* renamed from: a */
    public final int mo20649a() {
        return this.f22846g;
    }

    /* renamed from: b */
    public final String mo20650b() {
        return this.f22841b;
    }

    /* renamed from: c */
    public final String mo20651c() {
        return this.f22848i;
    }

    /* renamed from: d */
    public final String mo20652d() {
        return this.f22842c;
    }

    /* renamed from: e */
    public final String mo20653e() {
        return this.f22845f;
    }

    /* renamed from: f */
    public final List<String> mo20654f() {
        return this.f22840a;
    }

    /* renamed from: g */
    public final JSONObject mo20655g() {
        return this.f22847h;
    }

    /* renamed from: h */
    public final boolean mo20656h() {
        return this.f22844e;
    }

    /* renamed from: i */
    public final boolean mo20657i() {
        return this.f22843d;
    }
}
