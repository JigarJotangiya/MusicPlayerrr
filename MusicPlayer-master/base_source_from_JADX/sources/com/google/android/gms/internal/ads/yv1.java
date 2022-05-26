package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yv1 {

    /* renamed from: a */
    private final String f26556a;

    /* renamed from: b */
    private final String f26557b;

    /* renamed from: c */
    private final int f26558c;

    /* renamed from: d */
    private final String f26559d;

    /* renamed from: e */
    private final int f26560e;

    public yv1(String str, String str2, int i, String str3, int i2) {
        this.f26556a = str;
        this.f26557b = str2;
        this.f26558c = i;
        this.f26559d = str3;
        this.f26560e = i2;
    }

    /* renamed from: a */
    public final JSONObject mo22297a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f26556a);
        jSONObject.put("version", this.f26557b);
        jSONObject.put("status", this.f26558c);
        jSONObject.put("description", this.f26559d);
        jSONObject.put("initializationLatencyMillis", this.f26560e);
        return jSONObject;
    }
}
