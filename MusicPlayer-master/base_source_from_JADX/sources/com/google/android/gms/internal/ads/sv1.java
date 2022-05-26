package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sv1 implements h81, cb1, y91 {

    /* renamed from: g */
    private final ew1 f23638g;

    /* renamed from: h */
    private final String f23639h;

    /* renamed from: i */
    private int f23640i = 0;

    /* renamed from: j */
    private rv1 f23641j = rv1.AD_REQUESTED;

    /* renamed from: k */
    private x71 f23642k;

    /* renamed from: l */
    private zzbew f23643l;

    sv1(ew1 ew1, up2 up2) {
        this.f23638g = ew1;
        this.f23639h = up2.f24397f;
    }

    /* renamed from: d */
    private static JSONObject m30959d(zzbew zzbew) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzbew.f27188i);
        jSONObject.put("errorCode", zzbew.f27186g);
        jSONObject.put("errorDescription", zzbew.f27187h);
        zzbew zzbew2 = zzbew.f27189j;
        jSONObject.put("underlyingError", zzbew2 == null ? null : m30959d(zzbew2));
        return jSONObject;
    }

    /* renamed from: e */
    private static JSONObject m30960e(x71 x71) throws JSONException {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", x71.zze());
        jSONObject2.put("responseSecsSinceEpoch", x71.mo21982b());
        jSONObject2.put("responseId", x71.mo18760c());
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22551j6)).booleanValue()) {
            String f = x71.mo21984f();
            if (!TextUtils.isEmpty(f)) {
                String valueOf = String.valueOf(f);
                if (valueOf.length() != 0) {
                    str = "Bidding data: ".concat(valueOf);
                } else {
                    str = new String("Bidding data: ");
                }
                ul0.m31857b(str);
                jSONObject2.put("biddingData", new JSONObject(f));
            }
        }
        JSONArray jSONArray = new JSONArray();
        List<zzbfm> d = x71.mo18761d();
        if (d != null) {
            for (zzbfm next : d) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("adapterClassName", next.f27234g);
                jSONObject3.put("latencyMillis", next.f27235h);
                zzbew zzbew = next.f27236i;
                if (zzbew == null) {
                    jSONObject = null;
                } else {
                    jSONObject = m30959d(zzbew);
                }
                jSONObject3.put("error", jSONObject);
                jSONArray.put(jSONObject3);
            }
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    /* renamed from: L */
    public final void mo15740L(np2 np2) {
        if (!np2.f20683b.f20120a.isEmpty()) {
            this.f23640i = np2.f20683b.f20120a.get(0).f14637b;
        }
    }

    /* renamed from: a */
    public final JSONObject mo20968a() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f23641j);
        jSONObject.put("format", bp2.m21487a(this.f23640i));
        x71 x71 = this.f23642k;
        JSONObject jSONObject2 = null;
        if (x71 != null) {
            jSONObject2 = m30960e(x71);
        } else {
            zzbew zzbew = this.f23643l;
            if (!(zzbew == null || (iBinder = zzbew.f27190k) == null)) {
                x71 x712 = (x71) iBinder;
                jSONObject2 = m30960e(x712);
                List<zzbfm> d = x712.mo18761d();
                if (d != null && d.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m30959d(this.f23643l));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    /* renamed from: b */
    public final boolean mo20969b() {
        return this.f23641j != rv1.AD_REQUESTED;
    }

    /* renamed from: c */
    public final void mo16370c(zzbew zzbew) {
        this.f23641j = rv1.AD_LOAD_FAILED;
        this.f23643l = zzbew;
    }

    /* renamed from: k0 */
    public final void mo20970k0(g41 g41) {
        this.f23642k = g41.mo17839c();
        this.f23641j = rv1.AD_LOADED;
    }

    /* renamed from: y0 */
    public final void mo15741y0(zzcdq zzcdq) {
        this.f23638g.mo17366e(this.f23639h, this);
    }
}
