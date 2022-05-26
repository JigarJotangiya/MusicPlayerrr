package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mu1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Long f20173a;

    /* renamed from: b */
    private final String f20174b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f20175c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Integer f20176d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f20177e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Integer f20178f;

    /* synthetic */ mu1(String str, lu1 lu1) {
        this.f20174b = str;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ String m27470a(mu1 mu1) {
        String str = (String) C5054ev.m23225c().mo20153b(C5503qz.f22591o6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", mu1.f20173a);
            jSONObject.put("eventCategory", mu1.f20174b);
            jSONObject.putOpt("event", mu1.f20175c);
            jSONObject.putOpt("errorCode", mu1.f20176d);
            jSONObject.putOpt("rewardType", mu1.f20177e);
            jSONObject.putOpt("rewardAmount", mu1.f20178f);
        } catch (JSONException unused) {
            ul0.m31862g("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(jSONObject2);
        sb.append(");");
        return sb.toString();
    }
}
