package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class xx1 implements y73 {

    /* renamed from: a */
    public final /* synthetic */ String f26119a;

    /* renamed from: b */
    public final /* synthetic */ String f26120b;

    public /* synthetic */ xx1(zx1 zx1, String str, String str2) {
        this.f26119a = str;
        this.f26120b = str2;
    }

    /* renamed from: b */
    public final d93 mo10692b(Object obj) {
        String str = this.f26119a;
        String str2 = this.f26120b;
        String str3 = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put("body", str);
            jSONObject2.put("base_url", BuildConfig.FLAVOR);
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return s83.m30607i(jSONObject);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Preloaded loader: ".concat(valueOf) : new String("Preloaded loader: "));
        }
    }
}
