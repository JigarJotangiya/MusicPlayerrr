package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.C3245g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zg0 extends ah0 {

    /* renamed from: a */
    private final Object f26758a = new Object();

    /* renamed from: b */
    private final Context f26759b;

    /* renamed from: c */
    private SharedPreferences f26760c;

    /* renamed from: d */
    private final q90<JSONObject, JSONObject> f26761d;

    public zg0(Context context, q90<JSONObject, JSONObject> q90) {
        this.f26759b = context.getApplicationContext();
        this.f26761d = q90;
    }

    /* renamed from: c */
    public static JSONObject m34584c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcjf.m34965Y().f27376g);
            jSONObject.put("mf", f10.f16401a.mo20989e());
            jSONObject.put("cl", "428884702");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", C3245g.f10501a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m14488c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", C3245g.f10501a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final d93<Void> mo15785a() {
        synchronized (this.f26758a) {
            if (this.f26760c == null) {
                this.f26760c = this.f26759b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (C2971s.m13198a().mo11988a() - this.f26760c.getLong("js_last_update", 0) < f10.f16402b.mo20989e().longValue()) {
            return s83.m30607i(null);
        }
        return s83.m30611m(this.f26761d.mo17513a(m34584c(this.f26759b)), new xg0(this), hm0.f17713f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Void mo22362b(JSONObject jSONObject) {
        C5503qz.m29791d(this.f26759b, 1, jSONObject);
        this.f26760c.edit().putLong("js_last_update", C2971s.m13198a().mo11988a()).apply();
        return null;
    }
}
