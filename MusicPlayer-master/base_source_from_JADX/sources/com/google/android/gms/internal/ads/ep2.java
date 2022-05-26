package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.util.C3044v0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ep2 {

    /* renamed from: a */
    public final List<String> f16049a;

    /* renamed from: b */
    public final String f16050b;

    /* renamed from: c */
    public final int f16051c;

    /* renamed from: d */
    public final String f16052d;

    /* renamed from: e */
    public final int f16053e;

    /* renamed from: f */
    public final long f16054f;

    /* renamed from: g */
    public final boolean f16055g;

    /* renamed from: h */
    public final String f16056h;

    /* renamed from: i */
    public final dp2 f16057i;

    ep2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        int i = 0;
        String str = BuildConfig.FLAVOR;
        long j = 0;
        dp2 dp2 = null;
        boolean z = false;
        String str2 = str;
        String str3 = str2;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = C3044v0.m13477d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22638u5)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    dp2 = new dp2(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.f16049a = emptyList;
        this.f16051c = i;
        this.f16050b = str2;
        this.f16052d = str3;
        this.f16053e = i2;
        this.f16054f = j;
        this.f16057i = dp2;
        this.f16055g = z;
        this.f16056h = str;
    }
}
