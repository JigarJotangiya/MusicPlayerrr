package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3024o1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class dk0 {

    /* renamed from: a */
    static dk0 f15646a;

    /* renamed from: d */
    public static synchronized dk0 m22545d(Context context) {
        synchronized (dk0.class) {
            dk0 dk0 = f15646a;
            if (dk0 != null) {
                return dk0;
            }
            Context applicationContext = context.getApplicationContext();
            C5503qz.m29790c(applicationContext);
            C3024o1 h = C2971s.m13213p().mo17562h();
            h.mo11071P(applicationContext);
            hj0 hj0 = new hj0((gj0) null);
            hj0.mo18151b(applicationContext);
            hj0.mo18152c(C2971s.m13198a());
            hj0.mo18150a(h);
            hj0.mo18153d(C2971s.m13212o());
            dk0 e = hj0.mo18154e();
            f15646a = e;
            e.mo16941a().mo15796a();
            f15646a.mo16942b().mo17197c();
            hk0 c = f15646a.mo16943c();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22537i0)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) C5054ev.m23225c().mo20153b(C5503qz.f22545j0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String c2 : hashMap.keySet()) {
                        c.mo18161c(c2);
                    }
                    c.mo18162d(new fk0(c, hashMap));
                } catch (JSONException e2) {
                    ul0.m31858c("Failed to parse listening list", e2);
                }
            }
            dk0 dk02 = f15646a;
            return dk02;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract aj0 mo16941a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract ej0 mo16942b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract hk0 mo16943c();
}
