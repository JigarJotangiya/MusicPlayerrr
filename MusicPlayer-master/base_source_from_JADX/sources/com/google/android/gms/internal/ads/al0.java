package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class al0 {

    /* renamed from: a */
    private final List<String> f13952a = new ArrayList();

    /* renamed from: b */
    private final List<String> f13953b = new ArrayList();

    /* renamed from: c */
    private final Map<String, xa0> f13954c = new HashMap();

    /* renamed from: d */
    private String f13955d;

    /* renamed from: e */
    private String f13956e;

    /* renamed from: f */
    private long f13957f;

    /* renamed from: g */
    private JSONObject f13958g;

    /* renamed from: h */
    private boolean f13959h = false;

    /* renamed from: i */
    private final List<String> f13960i = new ArrayList();

    /* renamed from: j */
    private boolean f13961j = false;

    public al0(String str, long j) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        this.f13956e = str;
        this.f13957f = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f13958g = jSONObject;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f13959h = false;
                    ul0.m31862g("App settings could not be fetched successfully.");
                    return;
                }
                this.f13959h = true;
                this.f13955d = this.f13958g.optString("app_id");
                JSONArray optJSONArray2 = this.f13958g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f13953b.add(optString2);
                                } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject2 = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f13954c.put(optString2, new xa0(optJSONObject2));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.f13958g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                        this.f13952a.add(optJSONArray3.optString(i2));
                    }
                }
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22343H4)).booleanValue()) {
                    JSONObject optJSONObject3 = this.f13958g.optJSONObject("common_settings");
                    if (!(optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("loeid")) == null)) {
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            this.f13960i.add(optJSONArray.get(i3).toString());
                        }
                    }
                }
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22517f4)).booleanValue() && (optJSONObject = this.f13958g.optJSONObject("common_settings")) != null) {
                    this.f13961j = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e) {
                ul0.m31863h("Exception occurred while processing app setting json", e);
                C2971s.m13213p().mo17571s(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo15847a() {
        return this.f13957f;
    }

    /* renamed from: b */
    public final String mo15848b() {
        return this.f13955d;
    }

    /* renamed from: c */
    public final String mo15849c() {
        return this.f13956e;
    }

    /* renamed from: d */
    public final List<String> mo15850d() {
        return this.f13960i;
    }

    /* renamed from: e */
    public final Map<String, xa0> mo15851e() {
        return this.f13954c;
    }

    /* renamed from: f */
    public final JSONObject mo15852f() {
        return this.f13958g;
    }

    /* renamed from: g */
    public final void mo15853g(long j) {
        this.f13957f = j;
    }

    /* renamed from: h */
    public final boolean mo15854h() {
        return this.f13961j;
    }

    /* renamed from: i */
    public final boolean mo15855i() {
        return this.f13959h;
    }
}
