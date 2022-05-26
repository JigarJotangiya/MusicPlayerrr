package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ew1 implements nw1, pv1 {

    /* renamed from: a */
    private final mw1 f16142a;

    /* renamed from: b */
    private final ow1 f16143b;

    /* renamed from: c */
    private final qv1 f16144c;

    /* renamed from: d */
    private final zv1 f16145d;

    /* renamed from: e */
    private final ov1 f16146e;

    /* renamed from: f */
    private final String f16147f;

    /* renamed from: g */
    private final Map<String, List<sv1>> f16148g;

    /* renamed from: h */
    private String f16149h = "{}";

    /* renamed from: i */
    private String f16150i = BuildConfig.FLAVOR;

    /* renamed from: j */
    private long f16151j = Long.MAX_VALUE;

    /* renamed from: k */
    private aw1 f16152k = aw1.NONE;

    /* renamed from: l */
    private boolean f16153l;

    /* renamed from: m */
    private int f16154m;

    /* renamed from: n */
    private boolean f16155n;

    /* renamed from: o */
    private dw1 f16156o = dw1.UNKNOWN;

    ew1(mw1 mw1, ow1 ow1, qv1 qv1, Context context, zzcjf zzcjf, zv1 zv1) {
        this.f16142a = mw1;
        this.f16143b = ow1;
        this.f16144c = qv1;
        this.f16148g = new HashMap();
        this.f16146e = new ov1(context);
        this.f16147f = zzcjf.f27376g;
        this.f16145d = zv1;
        C2971s.m13217t().mo10996g(this);
    }

    /* renamed from: o */
    private final synchronized JSONObject m23236o() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry next : this.f16148g.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (sv1 sv1 : (List) next.getValue()) {
                if (sv1.mo20969b()) {
                    jSONArray.put(sv1.mo20968a());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) next.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    /* renamed from: p */
    private final void m23237p() {
        this.f16155n = true;
        this.f16145d.mo22439c();
        this.f16142a.mo19563b(this);
        this.f16143b.mo20142c(this);
        this.f16144c.mo20513c(this);
        m23243v(C2971s.m13213p().mo17562h().mo11098m());
    }

    /* renamed from: q */
    private final void m23238q() {
        C2971s.m13213p().mo17562h().mo11074S(mo17364c());
    }

    /* renamed from: r */
    private final synchronized void m23239r(aw1 aw1, boolean z) {
        if (this.f16152k != aw1) {
            if (mo17374m()) {
                m23241t();
            }
            this.f16152k = aw1;
            if (mo17374m()) {
                m23242u();
            }
            if (z) {
                m23238q();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m23240s(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f16153l     // Catch:{ all -> 0x003d }
            if (r0 != r2) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r1.f16153l = r2     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.C5503qz.f22535h6     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.ads.oz r0 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x003d }
            java.lang.Object r2 = r0.mo20153b(r2)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x003d }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0027
            com.google.android.gms.ads.internal.util.c0 r2 = com.google.android.gms.ads.internal.C2971s.m13217t()     // Catch:{ all -> 0x003d }
            boolean r2 = r2.mo11001l()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r1.m23242u()     // Catch:{ all -> 0x003d }
            goto L_0x0034
        L_0x002b:
            boolean r2 = r1.mo17374m()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0034
            r1.m23241t()     // Catch:{ all -> 0x003d }
        L_0x0034:
            if (r3 == 0) goto L_0x003b
            r1.m23238q()     // Catch:{ all -> 0x003d }
            monitor-exit(r1)
            return
        L_0x003b:
            monitor-exit(r1)
            return
        L_0x003d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ew1.m23240s(boolean, boolean):void");
    }

    /* renamed from: t */
    private final synchronized void m23241t() {
        aw1 aw1 = aw1.NONE;
        int ordinal = this.f16152k.ordinal();
        if (ordinal == 1) {
            this.f16143b.mo20140a();
        } else if (ordinal == 2) {
            this.f16144c.mo20511a();
        }
    }

    /* renamed from: u */
    private final synchronized void m23242u() {
        aw1 aw1 = aw1.NONE;
        int ordinal = this.f16152k.ordinal();
        if (ordinal == 1) {
            this.f16143b.mo20141b();
        } else if (ordinal == 2) {
            this.f16144c.mo20512b();
        }
    }

    /* renamed from: v */
    private final synchronized void m23243v(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                m23240s(jSONObject.optBoolean("isTestMode", false), false);
                m23239r(aw1.zza(jSONObject.optString("gesture", "NONE")), false);
                this.f16149h = jSONObject.optString("networkExtras", "{}");
                this.f16151j = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final aw1 mo17362a() {
        return this.f16152k;
    }

    /* renamed from: b */
    public final synchronized String mo17363b() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue()) {
            if (mo17374m()) {
                if (this.f16151j < C2971s.m13198a().mo11988a() / 1000) {
                    this.f16149h = "{}";
                    this.f16151j = Long.MAX_VALUE;
                    return BuildConfig.FLAVOR;
                } else if (this.f16149h.equals("{}")) {
                    return BuildConfig.FLAVOR;
                } else {
                    return this.f16149h;
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(1:7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo17364c() {
        /*
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "isTestMode"
            boolean r2 = r7.f16153l     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "gesture"
            com.google.android.gms.internal.ads.aw1 r2 = r7.f16152k     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            long r1 = r7.f16151j     // Catch:{ JSONException -> 0x0033 }
            com.google.android.gms.common.util.d r3 = com.google.android.gms.ads.internal.C2971s.m13198a()     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.mo11988a()     // Catch:{ JSONException -> 0x0033 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            java.lang.String r1 = "networkExtras"
            java.lang.String r2 = r7.f16149h     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "networkExtrasExpirationSecs"
            long r2 = r7.f16151j     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0039 }
            monitor-exit(r7)
            return r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ew1.mo17364c():java.lang.String");
    }

    /* renamed from: d */
    public final synchronized JSONObject mo17365d() {
        JSONObject jSONObject;
        String str;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.f16147f);
            jSONObject.put("adapters", this.f16145d.mo22438a());
            if (this.f16151j < C2971s.m13198a().mo11988a() / 1000) {
                this.f16149h = "{}";
            }
            jSONObject.put("networkExtras", this.f16149h);
            jSONObject.put("adSlots", m23236o());
            jSONObject.put("appInfo", this.f16146e.mo20131a());
            String c = C2971s.m13213p().mo17562h().mo11088d().mo15849c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("cld", new JSONObject(c));
            }
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22543i6)).booleanValue() && !TextUtils.isEmpty(this.f16150i)) {
                String valueOf = String.valueOf(this.f16150i);
                if (valueOf.length() != 0) {
                    str = "Policy violation data: ".concat(valueOf);
                } else {
                    str = new String("Policy violation data: ");
                }
                ul0.m31857b(str);
                jSONObject.put("policyViolations", new JSONObject(this.f16150i));
            }
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22535h6)).booleanValue()) {
                jSONObject.put("openAction", this.f16156o);
                jSONObject.put("gesture", this.f16152k);
            }
        } catch (JSONException e) {
            C2971s.m13213p().mo17570r(e, "Inspector.toJson");
            ul0.m31863h("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17366e(java.lang.String r4, com.google.android.gms.internal.ads.sv1 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22422S5     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x005c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005a
            boolean r0 = r3.mo17374m()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x001a
            goto L_0x005a
        L_0x001a:
            int r0 = r3.f16154m     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.iz<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C5503qz.f22436U5     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r2.mo20153b(r1)     // Catch:{ all -> 0x005c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x005c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x005c }
            if (r0 < r1) goto L_0x0035
            java.lang.String r4 = "Maximum number of ad requests stored reached. Dropping the current request."
            com.google.android.gms.internal.ads.ul0.m31862g(r4)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0035:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.sv1>> r0 = r3.f16148g     // Catch:{ all -> 0x005c }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.sv1>> r0 = r3.f16148g     // Catch:{ all -> 0x005c }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            r0.put(r4, r1)     // Catch:{ all -> 0x005c }
        L_0x0047:
            int r0 = r3.f16154m     // Catch:{ all -> 0x005c }
            int r0 = r0 + 1
            r3.f16154m = r0     // Catch:{ all -> 0x005c }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.sv1>> r0 = r3.f16148g     // Catch:{ all -> 0x005c }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x005c }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x005c }
            r4.add(r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x005a:
            monitor-exit(r3)
            return
        L_0x005c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ew1.mo17366e(java.lang.String, com.google.android.gms.internal.ads.sv1):void");
    }

    /* renamed from: f */
    public final void mo17367f() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue()) {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22535h6)).booleanValue() || !C2971s.m13213p().mo17562h().mo11066J()) {
                String m = C2971s.m13213p().mo17562h().mo11098m();
                if (!TextUtils.isEmpty(m)) {
                    try {
                        if (new JSONObject(m).optBoolean("isTestMode", false)) {
                            m23237p();
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else {
                m23237p();
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo17368g(C4982cx cxVar, dw1 dw1) {
        if (!mo17374m()) {
            try {
                cxVar.mo11145O1(nq2.m28048d(18, (String) null, (zzbew) null));
            } catch (RemoteException unused) {
                ul0.m31862g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
            }
        } else {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue()) {
                try {
                    cxVar.mo11145O1(nq2.m28048d(1, (String) null, (zzbew) null));
                } catch (RemoteException unused2) {
                    ul0.m31862g("Ad inspector had an internal error.");
                }
            } else {
                this.f16156o = dw1;
                this.f16142a.mo19565d(cxVar, new z50(this));
            }
        }
    }

    /* renamed from: h */
    public final synchronized void mo17369h(String str, long j) {
        this.f16149h = str;
        this.f16151j = j;
        m23238q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r2 != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17370i(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f16155n
            if (r0 != 0) goto L_0x000a
            if (r2 == 0) goto L_0x0015
            r1.m23237p()
            goto L_0x000c
        L_0x000a:
            if (r2 == 0) goto L_0x0015
        L_0x000c:
            boolean r2 = r1.f16153l
            if (r2 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            r1.m23242u()
            return
        L_0x0015:
            boolean r2 = r1.mo17374m()
            if (r2 != 0) goto L_0x001e
            r1.m23241t()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ew1.mo17370i(boolean):void");
    }

    /* renamed from: j */
    public final void mo17371j(aw1 aw1) {
        m23239r(aw1, true);
    }

    /* renamed from: k */
    public final synchronized void mo17372k(String str) {
        this.f16150i = str;
    }

    /* renamed from: l */
    public final void mo17373l(boolean z) {
        if (!this.f16155n && z) {
            m23237p();
        }
        m23240s(z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r2.f16153l || com.google.android.gms.ads.internal.C2971s.m13217t().mo11001l();
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo17374m() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22535h6     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x002b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.f16153l     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0025
            com.google.android.gms.ads.internal.util.c0 r0 = com.google.android.gms.ads.internal.C2971s.m13217t()     // Catch:{ all -> 0x002b }
            boolean r0 = r0.mo11001l()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r2)
            return r0
        L_0x0025:
            r0 = 1
            goto L_0x0023
        L_0x0027:
            boolean r0 = r2.f16153l     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ew1.mo17374m():boolean");
    }

    /* renamed from: n */
    public final synchronized boolean mo17375n() {
        return this.f16153l;
    }
}
