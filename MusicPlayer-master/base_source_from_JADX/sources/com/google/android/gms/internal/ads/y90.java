package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y90 {

    /* renamed from: a */
    private static final Charset f26303a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final v90<JSONObject> f26304b = new x90();

    /* renamed from: c */
    public static final s90<InputStream> f26305c = w90.f25286a;

    /* renamed from: a */
    static /* synthetic */ InputStream m34065a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f26303a));
    }
}
