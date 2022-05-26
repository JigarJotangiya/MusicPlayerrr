package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2926b;
import com.google.android.gms.ads.internal.C2935k;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3044v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dn1 {

    /* renamed from: a */
    private final Context f15659a;

    /* renamed from: b */
    private final lm1 f15660b;

    /* renamed from: c */
    private final C5737xa f15661c;

    /* renamed from: d */
    private final zzcjf f15662d;

    /* renamed from: e */
    private final C2925a f15663e;

    /* renamed from: f */
    private final C5790yp f15664f;

    /* renamed from: g */
    private final Executor f15665g;

    /* renamed from: h */
    private final zzbnw f15666h;

    /* renamed from: i */
    private final vn1 f15667i;

    /* renamed from: j */
    private final oq1 f15668j;

    /* renamed from: k */
    private final ScheduledExecutorService f15669k;

    /* renamed from: l */
    private final ip1 f15670l;

    /* renamed from: m */
    private final gt1 f15671m;

    /* renamed from: n */
    private final gu2 f15672n;

    /* renamed from: o */
    private final lv2 f15673o;

    /* renamed from: p */
    private final y12 f15674p;

    public dn1(Context context, lm1 lm1, C5737xa xaVar, zzcjf zzcjf, C2925a aVar, C5790yp ypVar, Executor executor, up2 up2, vn1 vn1, oq1 oq1, ScheduledExecutorService scheduledExecutorService, gt1 gt1, gu2 gu2, lv2 lv2, y12 y12, ip1 ip1) {
        this.f15659a = context;
        this.f15660b = lm1;
        this.f15661c = xaVar;
        this.f15662d = zzcjf;
        this.f15663e = aVar;
        this.f15664f = ypVar;
        this.f15665g = executor;
        this.f15666h = up2.f24400i;
        this.f15667i = vn1;
        this.f15668j = oq1;
        this.f15669k = scheduledExecutorService;
        this.f15671m = gt1;
        this.f15672n = gu2;
        this.f15673o = lv2;
        this.f15674p = y12;
        this.f15670l = ip1;
    }

    /* renamed from: i */
    public static final C5020dy m22568i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m22577r(optJSONObject);
    }

    /* renamed from: j */
    public static final List<C5020dy> m22569j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return g43.zzo();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return g43.zzo();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            C5020dy r = m22577r(optJSONArray.optJSONObject(i));
            if (r != null) {
                arrayList.add(r);
            }
        }
        return g43.zzm(arrayList);
    }

    /* renamed from: k */
    private final zzbfi m22570k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzbfi.m34950n0();
            }
            i = 0;
        }
        return new zzbfi(this.f15659a, new C2921g(i, i2));
    }

    /* renamed from: l */
    private static <T> d93<T> m22571l(d93<T> d93, T t) {
        return s83.m30605g(d93, Exception.class, new sm1((Object) null), hm0.f17713f);
    }

    /* renamed from: m */
    private static <T> d93<T> m22572m(boolean z, d93<T> d93, T t) {
        if (z) {
            return s83.m30612n(d93, new zm1(d93), hm0.f17713f);
        }
        return m22571l(d93, (Object) null);
    }

    /* renamed from: n */
    private final d93<d20> m22573n(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return s83.m30607i(null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return s83.m30607i(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return s83.m30607i(new d20((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m22572m(jSONObject.optBoolean("require"), s83.m30611m(this.f15660b.mo19185b(optString, optDouble, optBoolean), new vm1(optString, optDouble, optInt, optInt2), this.f15665g), (Object) null);
    }

    /* renamed from: o */
    private final d93<List<d20>> m22574o(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return s83.m30607i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m22573n(jSONArray.optJSONObject(i), z));
        }
        return s83.m30611m(s83.m30603e(arrayList), wm1.f25460a, this.f15665g);
    }

    /* renamed from: p */
    private final d93<pr0> m22575p(JSONObject jSONObject, bp2 bp2, ep2 ep2) {
        d93<pr0> b = this.f15667i.mo21567b(jSONObject.optString("base_url"), jSONObject.optString("html"), bp2, ep2, m22570k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return s83.m30612n(b, new cn1(b), hm0.f17713f);
    }

    /* renamed from: q */
    private static Integer m22576q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: r */
    private static final C5020dy m22577r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new C5020dy(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ a20 mo16962a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer q = m22576q(jSONObject, "bg_color");
        Integer q2 = m22576q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new a20(optString, list, q, q2, num, optInt3 + optInt2, this.f15666h.f27252k, optBoolean);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ d93 mo16963b(zzbfi zzbfi, bp2 bp2, ep2 ep2, String str, String str2, Object obj) throws Exception {
        pr0 a = this.f15668j.mo20090a(zzbfi, bp2, ep2);
        lm0 f = lm0.m26780f(a);
        fp1 b = this.f15670l.mo18473b();
        fp1 fp1 = b;
        et0 Q0 = a.mo17673Q0();
        C2926b bVar = r3;
        C2926b bVar2 = new C2926b(this.f15659a, (zi0) null, (zzcde) null);
        Q0.mo17293O(b, fp1, b, b, b, false, (b60) null, bVar, (de0) null, (zi0) null, this.f15674p, this.f15673o, this.f15671m, this.f15672n, (z50) null, b);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22499d2)).booleanValue()) {
            a.mo17686d0("/getNativeAdViewSignals", x50.f25679s);
        }
        a.mo17686d0("/getNativeClickMeta", x50.f25680t);
        a.mo17673Q0().mo17300d1(new rm1(f));
        a.mo17715w0(str, str2, (String) null);
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo16964c(String str, Object obj) throws Exception {
        C2971s.m13197A();
        pr0 a = cs0.m22106a(this.f15659a, gt0.m24492a(), "native-omid", false, false, this.f15661c, (q00) null, this.f15662d, (f00) null, (C2935k) null, this.f15663e, this.f15664f, (bp2) null, (ep2) null);
        lm0 f = lm0.m26780f(a);
        a.mo17673Q0().mo17300d1(new tm1(f));
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22548j3)).booleanValue()) {
            a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            a.loadData(str, "text/html", "UTF-8");
        }
        return f;
    }

    /* renamed from: d */
    public final d93<a20> mo16965d(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return s83.m30607i(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m22572m(optJSONObject.optBoolean("require"), s83.m30611m(m22574o(optJSONArray, false, true), new um1(this, optJSONObject), this.f15665g), (Object) null);
    }

    /* renamed from: e */
    public final d93<d20> mo16966e(JSONObject jSONObject, String str) {
        return m22573n(jSONObject.optJSONObject(str), this.f15666h.f27249h);
    }

    /* renamed from: f */
    public final d93<List<d20>> mo16967f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbnw zzbnw = this.f15666h;
        return m22574o(optJSONArray, zzbnw.f27249h, zzbnw.f27251j);
    }

    /* renamed from: g */
    public final d93<pr0> mo16968g(JSONObject jSONObject, String str, bp2 bp2, ep2 ep2) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22607q6)).booleanValue()) {
            return s83.m30607i(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return s83.m30607i(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return s83.m30607i(null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        zzbfi k = m22570k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return s83.m30607i(null);
        }
        d93 n = s83.m30612n(s83.m30607i(null), new xm1(this, k, bp2, ep2, optString, optString2), hm0.f17712e);
        return s83.m30612n(n, new an1(n), hm0.f17713f);
    }

    /* renamed from: h */
    public final d93<pr0> mo16969h(JSONObject jSONObject, bp2 bp2, ep2 ep2) {
        d93<pr0> d93;
        JSONObject g = C3044v0.m13480g(jSONObject, "html_containers", "instream");
        if (g != null) {
            return m22575p(g, bp2, ep2);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return s83.m30607i(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22599p6)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                ul0.m31862g("Required field 'vast_xml' or 'html' is missing");
                return s83.m30607i(null);
            }
        } else if (!z) {
            d93 = this.f15667i.mo21566a(optJSONObject);
            return m22571l(s83.m30613o(d93, (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22507e2)).intValue(), TimeUnit.SECONDS, this.f15669k), (Object) null);
        }
        d93 = m22575p(optJSONObject, bp2, ep2);
        return m22571l(s83.m30613o(d93, (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22507e2)).intValue(), TimeUnit.SECONDS, this.f15669k), (Object) null);
    }
}
