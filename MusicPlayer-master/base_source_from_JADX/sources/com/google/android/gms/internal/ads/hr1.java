package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hr1 {

    /* renamed from: a */
    private final Map<String, Map<String, JSONObject>> f17748a = new ConcurrentHashMap();

    /* renamed from: b */
    private JSONObject f17749b;

    /* renamed from: c */
    private final Executor f17750c;

    /* renamed from: d */
    private boolean f17751d;

    /* renamed from: e */
    private JSONObject f17752e;

    public hr1(Executor executor) {
        this.f17750c = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final synchronized void mo18206f() {
        Map map;
        this.f17751d = true;
        al0 d = C2971s.m13213p().mo17562h().mo11088d();
        if (d != null) {
            JSONObject f = d.mo15852f();
            if (f != null) {
                this.f17749b = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22587o2)).booleanValue() ? f.optJSONObject("common_settings") : null;
                this.f17752e = f.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.f17748a.containsKey(optString2)) {
                                    map = this.f17748a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f17748a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo18201a() {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22587o2)).booleanValue()) {
            return null;
        }
        return this.f17749b;
    }

    /* renamed from: b */
    public final JSONObject mo18202b(String str, String str2) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22579n2)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f17751d) {
            mo18206f();
        }
        Map map = this.f17748a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a = jr1.m25825a(this.f17752e, str, str2);
        if (a == null) {
            return null;
        }
        return (JSONObject) map.get(a);
    }

    /* renamed from: c */
    public final void mo18203c() {
        C2971s.m13213p().mo17562h().mo11075T(new er1(this));
        this.f17750c.execute(new gr1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo18205e() {
        this.f17750c.execute(new dr1(this));
    }
}
