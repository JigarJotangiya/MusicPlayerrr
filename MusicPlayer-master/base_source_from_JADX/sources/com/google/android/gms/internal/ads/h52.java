package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.C3369n;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h52 implements b52<vj1> {

    /* renamed from: a */
    private final mi1 f17535a;

    /* renamed from: b */
    private final e93 f17536b;

    /* renamed from: c */
    private final pm1 f17537c;

    /* renamed from: d */
    private final lq2<bp1> f17538d;

    /* renamed from: e */
    private final ip1 f17539e;

    public h52(mi1 mi1, e93 e93, pm1 pm1, lq2<bp1> lq2, ip1 ip1) {
        this.f17535a = mi1;
        this.f17536b = e93;
        this.f17537c = pm1;
        this.f17538d = lq2;
        this.f17539e = ip1;
    }

    /* renamed from: g */
    private final d93<vj1> m24671g(np2 np2, bp2 bp2, JSONObject jSONObject) {
        d93<bp1> a = this.f17538d.mo19271a();
        d93<bk1> a2 = this.f17537c.mo20283a(np2, bp2, jSONObject);
        return s83.m30602d(a, a2).mo20613a(new g52(this, a2, a, np2, bp2, jSONObject), this.f17536b);
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        gp2 gp2 = bp2.f14665t;
        return (gp2 == null || gp2.f17225c == null) ? false : true;
    }

    /* renamed from: b */
    public final d93<List<d93<vj1>>> mo15701b(np2 np2, bp2 bp2) {
        return s83.m30612n(s83.m30612n(this.f17538d.mo19271a(), new e52(this, bp2), this.f17536b), new f52(this, np2, bp2), this.f17536b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ vj1 mo18083c(d93 d93, d93 d932, np2 np2, bp2 bp2, JSONObject jSONObject) throws Exception {
        bk1 bk1 = (bk1) d93.get();
        bp1 bp1 = (bp1) d932.get();
        ck1 c = this.f17535a.mo19388c(new w41(np2, bp2, (String) null), new nk1(bk1), new cj1(jSONObject, bp1));
        c.mo15980j().mo19481b();
        c.mo15981k().mo22057a(bp1);
        c.mo15979i().mo21338a(bk1.mo16274Z());
        c.mo15982l().mo18180a(this.f17539e);
        return c.mo15978h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ d93 mo18084d(bp1 bp1, JSONObject jSONObject) throws Exception {
        this.f17538d.mo19272b(s83.m30607i(bp1));
        if (jSONObject.optBoolean("success")) {
            return s83.m30607i(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new p90("process json failed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ d93 mo18085e(bp2 bp2, bp1 bp1) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22328F5)).booleanValue() && C3369n.m14479k()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", bp2.f14665t.f17225c);
        jSONObject2.put("sdk_params", jSONObject);
        return s83.m30612n(bp1.mo16350d("google.afma.nativeAds.preProcessJson", jSONObject2), new d52(this, bp1), this.f17536b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ d93 mo18086f(np2 np2, bp2 bp2, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return s83.m30606h(new pw1(3));
        }
        if (np2.f20682a.f18953a.f24402k <= 1) {
            return s83.m30611m(m24671g(np2, bp2, jSONArray.getJSONObject(0)), c52.f14827a, this.f17536b);
        }
        int length = jSONArray.length();
        this.f17538d.mo19273c(Math.min(length, np2.f20682a.f18953a.f24402k));
        ArrayList arrayList = new ArrayList(np2.f20682a.f18953a.f24402k);
        for (int i = 0; i < np2.f20682a.f18953a.f24402k; i++) {
            if (i < length) {
                arrayList.add(m24671g(np2, bp2, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(s83.m30606h(new pw1(3)));
            }
        }
        return s83.m30607i(arrayList);
    }
}
