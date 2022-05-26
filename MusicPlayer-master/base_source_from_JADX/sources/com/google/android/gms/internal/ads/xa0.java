package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xa0 {

    /* renamed from: a */
    public final List<wa0> f25730a;

    /* renamed from: b */
    public final List<String> f25731b;

    /* renamed from: c */
    public final List<String> f25732c;

    /* renamed from: d */
    public final List<String> f25733d;

    /* renamed from: e */
    public final List<String> f25734e;

    /* renamed from: f */
    public final List<String> f25735f;

    public xa0(JSONObject jSONObject) throws JSONException {
        String str;
        if (ul0.m31865j(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            if (valueOf.length() != 0) {
                str = "Mediation Response JSON: ".concat(valueOf);
            } else {
                str = new String("Mediation Response JSON: ");
            }
            C3018m1.m13388k(str);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                wa0 wa0 = new wa0(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(wa0.f25300l);
                arrayList.add(wa0);
                if (i < 0) {
                    Iterator<String> it = wa0.f25289a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f25730a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            C2971s.m13205h();
            this.f25731b = ya0.m34073a(optJSONObject, "click_urls");
            C2971s.m13205h();
            this.f25732c = ya0.m34073a(optJSONObject, "imp_urls");
            C2971s.m13205h();
            this.f25733d = ya0.m34073a(optJSONObject, "downloaded_imp_urls");
            C2971s.m13205h();
            this.f25734e = ya0.m34073a(optJSONObject, "nofill_urls");
            C2971s.m13205h();
            this.f25735f = ya0.m34073a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1);
            zzces Y = zzces.m34963Y(optJSONObject.optJSONArray("rewards"));
            if (Y != null) {
                String str2 = Y.f27360g;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
