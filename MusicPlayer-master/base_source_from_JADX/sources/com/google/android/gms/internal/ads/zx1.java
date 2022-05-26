package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zx1 {

    /* renamed from: a */
    private final mt0 f27059a;

    /* renamed from: b */
    private final Context f27060b;

    /* renamed from: c */
    private final zzcjf f27061c;

    /* renamed from: d */
    private final up2 f27062d;

    /* renamed from: e */
    private final Executor f27063e;

    /* renamed from: f */
    private final String f27064f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ab1 f27065g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final eb1 f27066h;

    public zx1(mt0 mt0, Context context, zzcjf zzcjf, up2 up2, Executor executor, String str, ab1 ab1, eb1 eb1) {
        this.f27059a = mt0;
        this.f27060b = context;
        this.f27061c = zzcjf;
        this.f27062d = up2;
        this.f27063e = executor;
        this.f27064f = str;
        this.f27065g = ab1;
        this.f27066h = eb1;
    }

    /* renamed from: e */
    private final d93<np2> m34860e(String str, String str2) {
        ba0 a = C2971s.m13204g().mo20615a(this.f27060b, this.f27061c);
        v90<JSONObject> v90 = y90.f26304b;
        d93<np2> n = s83.m30612n(s83.m30612n(s83.m30612n(s83.m30607i(BuildConfig.FLAVOR), new xx1(this, str, str2), this.f27063e), new vx1(a.mo16162a("google.afma.response.normalize", v90, v90)), this.f27063e), new wx1(this), this.f27063e);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22386N4)).booleanValue()) {
            s83.m30616r(n, new yx1(this), hm0.f17713f);
        }
        return n;
    }

    /* renamed from: f */
    private final String m34861f(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f27064f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            ul0.m31862g("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    /* renamed from: g */
    private static final String m34862g(String str) {
        try {
            return new JSONObject(str).optString("request_id", BuildConfig.FLAVOR);
        } catch (JSONException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: c */
    public final d93<np2> mo22445c() {
        String str = this.f27062d.f24395d.f27194D;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22365K4)).booleanValue()) {
                String g = m34862g(str);
                if (TextUtils.isEmpty(g)) {
                    if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22386N4)).booleanValue()) {
                        this.f27066h.mo17152g(true);
                    }
                    return s83.m30606h(new e62(15, "Invalid ad string."));
                }
                String b = this.f27059a.mo19527u().mo10701b(g);
                if (!TextUtils.isEmpty(b)) {
                    return m34860e(str, m34861f(b));
                }
            }
        }
        zzbeu zzbeu = this.f27062d.f24395d.f27213y;
        if (zzbeu != null) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22351I4)).booleanValue()) {
                String g2 = m34862g(zzbeu.f27184g);
                String g3 = m34862g(zzbeu.f27185h);
                if (!TextUtils.isEmpty(g3) && g2.equals(g3)) {
                    this.f27059a.mo19527u().mo10703d(g2);
                }
            }
            return m34860e(zzbeu.f27184g, m34861f(zzbeu.f27185h));
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22386N4)).booleanValue()) {
            this.f27066h.mo17152g(true);
        }
        return s83.m30606h(new e62(14, "Mismatch request IDs."));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ d93 mo22446d(JSONObject jSONObject) throws Exception {
        return s83.m30607i(new np2(new kp2(this.f27062d), mp2.m27384a(new StringReader(jSONObject.toString()))));
    }
}
