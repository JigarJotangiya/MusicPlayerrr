package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class qf2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f21917a;

    public /* synthetic */ qf2(List list) {
        this.f21917a = list;
    }

    public final Object call() {
        List<d93> list = this.f21917a;
        JSONArray jSONArray = new JSONArray();
        for (d93 d93 : list) {
            if (((JSONObject) d93.get()) != null) {
                jSONArray.put(d93.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new sf2(jSONArray.toString());
    }
}
