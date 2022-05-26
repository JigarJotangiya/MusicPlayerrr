package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x50 {

    /* renamed from: a */
    public static final y50<pr0> f25661a = f50.f16436a;

    /* renamed from: b */
    public static final y50<pr0> f25662b = c50.f14825a;

    /* renamed from: c */
    public static final y50<pr0> f25663c = d50.f15508a;

    /* renamed from: d */
    public static final y50<pr0> f25664d = new p50();

    /* renamed from: e */
    public static final y50<pr0> f25665e = new q50();

    /* renamed from: f */
    public static final y50<pr0> f25666f = g50.f16951a;

    /* renamed from: g */
    public static final y50<Object> f25667g = new r50();

    /* renamed from: h */
    public static final y50<pr0> f25668h = new s50();

    /* renamed from: i */
    public static final y50<pr0> f25669i = h50.f17533a;

    /* renamed from: j */
    public static final y50<pr0> f25670j = new t50();

    /* renamed from: k */
    public static final y50<pr0> f25671k = new u50();

    /* renamed from: l */
    public static final y50<eo0> f25672l = new rp0();

    /* renamed from: m */
    public static final y50<eo0> f25673m = new sp0();

    /* renamed from: n */
    public static final y50<pr0> f25674n = new a50();

    /* renamed from: o */
    public static final n60 f25675o = new n60();

    /* renamed from: p */
    public static final y50<pr0> f25676p = new v50();

    /* renamed from: q */
    public static final y50<pr0> f25677q = new w50();

    /* renamed from: r */
    public static final y50<pr0> f25678r = new l50();

    /* renamed from: s */
    public static final y50<pr0> f25679s = new m50();

    /* renamed from: t */
    public static final y50<pr0> f25680t = new n50();

    /* renamed from: a */
    public static y50<pr0> m33571a(yf1 yf1) {
        return new b50(yf1);
    }

    /* renamed from: b */
    public static d93<String> m33572b(pr0 pr0, String str) {
        Uri parse = Uri.parse(str);
        try {
            C5737xa J = pr0.mo17662J();
            if (J != null && J.mo22002f(parse)) {
                parse = J.mo21997a(parse, pr0.getContext(), pr0.mo15939Z(), pr0.mo17241i());
            }
        } catch (C5775ya unused) {
            ul0.m31862g(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        String b = ek0.m23024b(parse, pr0.getContext());
        long longValue = e10.f15824e.mo20989e().longValue();
        if (longValue <= 0 || longValue > 214106404) {
            return s83.m30607i(b);
        }
        j83<String> E = j83.m25564E(pr0.mo17670O0());
        k50 k50 = k50.f18780a;
        e93 e93 = hm0.f17713f;
        return s83.m30604f(s83.m30611m(s83.m30604f(E, Throwable.class, k50, e93), new i50(b), e93), Throwable.class, new j50(b), e93);
    }

    /* renamed from: c */
    static /* synthetic */ void m33573c(rs0 rs0, Map map) {
        String str;
        PackageManager packageManager = rs0.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String valueOf = String.valueOf(optString7);
                                if (valueOf.length() != 0) {
                                    str = "Error parsing the url: ".concat(valueOf);
                                } else {
                                    str = new String("Error parsing the url: ");
                                }
                                ul0.m31860e(str, uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            ul0.m31860e("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        ul0.m31860e("Error parsing the intent data.", e3);
                    }
                }
                ((d80) rs0).mo16881r("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((d80) rs0).mo16881r("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((d80) rs0).mo16881r("openableIntents", new JSONObject());
        }
    }

    /* renamed from: d */
    public static void m33574d(Map<String, String> map, yf1 yf1) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22297B6)).booleanValue() && map.containsKey("sc") && map.get("sc").equals("1") && yf1 != null) {
            yf1.mo15729o();
        }
    }
}
