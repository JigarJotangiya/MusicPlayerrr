package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class in1 {

    /* renamed from: a */
    private final Executor f18119a;

    /* renamed from: b */
    private final dn1 f18120b;

    public in1(Executor executor, dn1 dn1) {
        this.f18119a = executor;
        this.f18120b = dn1;
    }

    /* renamed from: a */
    public final d93<List<hn1>> mo18446a(JSONObject jSONObject, String str) {
        d93<O> d93;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return s83.m30607i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                d93 = s83.m30607i(null);
            } else {
                String optString = optJSONObject.optString("name");
                if (optString == null) {
                    d93 = s83.m30607i(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        d93 = s83.m30607i(new hn1(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        d93 = s83.m30611m(this.f18120b.mo16966e(optJSONObject, "image_value"), new fn1(optString), this.f18119a);
                    } else {
                        d93 = s83.m30607i(null);
                    }
                }
            }
            arrayList.add(d93);
        }
        return s83.m30611m(s83.m30603e(arrayList), gn1.f17205a, this.f18119a);
    }
}
