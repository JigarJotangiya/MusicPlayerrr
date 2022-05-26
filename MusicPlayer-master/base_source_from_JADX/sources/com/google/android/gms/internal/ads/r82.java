package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r82 {

    /* renamed from: a */
    private final Map<String, t82> f22773a = new HashMap();

    /* renamed from: b */
    private final Map<String, v82> f22774b = new HashMap();

    /* renamed from: c */
    private final Map<String, Map<String, List<t82>>> f22775c = new HashMap();

    /* renamed from: d */
    private final Executor f22776d;

    /* renamed from: e */
    private JSONObject f22777e;

    r82(Executor executor) {
        this.f22776d = executor;
    }

    /* renamed from: g */
    private final synchronized List<t82> m29983g(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle l = m29988l(jSONObject.optJSONObject("data"));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i, BuildConfig.FLAVOR);
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList2.get(i2);
            mo20612f(str2);
            if (this.f22773a.get(str2) != null) {
                arrayList.add(new t82(str2, str, l));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final synchronized void m29984h() {
        this.f22774b.clear();
        this.f22773a.clear();
        m29986j();
        m29987k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m29985i(java.lang.String r3, java.lang.String r4, java.util.List<com.google.android.gms.internal.ads.t82> r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.t82>>> r0 = r2.f22775c     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0038 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x001c
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0038 }
            r0.<init>()     // Catch:{ all -> 0x0038 }
        L_0x001c:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.t82>>> r1 = r2.f22775c     // Catch:{ all -> 0x0038 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0038 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x0038 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0038 }
            if (r3 != 0) goto L_0x002e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0038 }
            r3.<init>()     // Catch:{ all -> 0x0038 }
        L_0x002e:
            r3.addAll(r5)     // Catch:{ all -> 0x0038 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            return
        L_0x0036:
            monitor-exit(r2)
            return
        L_0x0038:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r82.m29985i(java.lang.String, java.lang.String, java.util.List):void");
    }

    /* renamed from: j */
    private final synchronized void m29986j() {
        String str;
        JSONObject f = C2971s.m13213p().mo17562h().mo11088d().mo15852f();
        if (f != null) {
            try {
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                this.f22777e = f.optJSONObject("ad_unit_patterns");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22329F6)).booleanValue()) {
                            str = jSONObject.optString("ad_unit_id", BuildConfig.FLAVOR).toLowerCase(Locale.ROOT);
                        } else {
                            str = jSONObject.optString("ad_unit_id", BuildConfig.FLAVOR);
                        }
                        String optString = jSONObject.optString("format", BuildConfig.FLAVOR);
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("ad_networks");
                            if (optJSONArray2 != null) {
                                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                    arrayList.addAll(m29983g(optJSONArray2.getJSONObject(i2), optString));
                                }
                            }
                        }
                        m29985i(optString, str, arrayList);
                    }
                }
            } catch (JSONException e) {
                C3018m1.m13389l("Malformed config loading JSON.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m29987k() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.t00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.k10.f18714d     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r0.mo20989e()     // Catch:{ all -> 0x0083 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0081
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22514f1     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x0083 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0022
            goto L_0x0081
        L_0x0022:
            com.google.android.gms.internal.ads.fl0 r0 = com.google.android.gms.ads.internal.C2971s.m13213p()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.ads.internal.util.o1 r0 = r0.mo17562h()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.al0 r0 = r0.mo11088d()     // Catch:{ all -> 0x0083 }
            org.json.JSONObject r0 = r0.mo15852f()     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0036
            monitor-exit(r9)
            return
        L_0x0036:
            java.lang.String r1 = "signal_adapters"
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch:{ JSONException -> 0x0079 }
            r1 = 0
            r2 = 0
        L_0x003e:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x0079 }
            if (r2 >= r3) goto L_0x0077
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r4 = "data"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch:{ JSONException -> 0x0079 }
            android.os.Bundle r4 = m29988l(r4)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r5 = "adapter_class_name"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r6 = "render"
            boolean r6 = r3.optBoolean(r6, r1)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r7 = "collect_signals"
            boolean r3 = r3.optBoolean(r7, r1)     // Catch:{ JSONException -> 0x0079 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0079 }
            if (r7 != 0) goto L_0x0074
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.v82> r7 = r9.f22774b     // Catch:{ JSONException -> 0x0079 }
            com.google.android.gms.internal.ads.v82 r8 = new com.google.android.gms.internal.ads.v82     // Catch:{ JSONException -> 0x0079 }
            r8.<init>(r5, r3, r6, r4)     // Catch:{ JSONException -> 0x0079 }
            r7.put(r5, r8)     // Catch:{ JSONException -> 0x0079 }
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0077:
            monitor-exit(r9)
            return
        L_0x0079:
            r0 = move-exception
            java.lang.String r1 = "Malformed config loading JSON."
            com.google.android.gms.ads.internal.util.C3018m1.m13389l(r1, r0)     // Catch:{ all -> 0x0083 }
            monitor-exit(r9)
            return
        L_0x0081:
            monitor-exit(r9)
            return
        L_0x0083:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r82.m29987k():void");
    }

    /* renamed from: l */
    private static final Bundle m29988l(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, BuildConfig.FLAVOR));
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.Map<java.lang.String, java.util.List<android.os.Bundle>> mo20608a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x000f
            goto L_0x008b
        L_0x000f:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.t82>>> r0 = r3.f22775c     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0091 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x001f
            com.google.android.gms.internal.ads.k43 r4 = com.google.android.gms.internal.ads.k43.zzd()     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x001f:
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0091 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x004c
            org.json.JSONObject r1 = r3.f22777e     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = com.google.android.gms.internal.ads.jr1.m25825a(r1, r5, r4)     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.C5503qz.f22329F6     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0091 }
            java.lang.Object r5 = r1.mo20153b(r5)     // Catch:{ all -> 0x0091 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0091 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x0045
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch:{ all -> 0x0091 }
        L_0x0045:
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0091 }
            r1 = r4
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0091 }
        L_0x004c:
            if (r1 != 0) goto L_0x0054
            com.google.android.gms.internal.ads.k43 r4 = com.google.android.gms.internal.ads.k43.zzd()     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x0054:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0091 }
            r4.<init>()     // Catch:{ all -> 0x0091 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0091 }
        L_0x005d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.t82 r0 = (com.google.android.gms.internal.ads.t82) r0     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = r0.f23786a     // Catch:{ all -> 0x0091 }
            boolean r2 = r4.containsKey(r1)     // Catch:{ all -> 0x0091 }
            if (r2 != 0) goto L_0x0079
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0091 }
            r2.<init>()     // Catch:{ all -> 0x0091 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0091 }
        L_0x0079:
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x0091 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0091 }
            android.os.Bundle r0 = r0.f23787b     // Catch:{ all -> 0x0091 }
            r1.add(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x005d
        L_0x0085:
            com.google.android.gms.internal.ads.k43 r4 = com.google.android.gms.internal.ads.k43.zzc(r4)     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x008b:
            com.google.android.gms.internal.ads.k43 r4 = com.google.android.gms.internal.ads.k43.zzd()     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x0091:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r82.mo20608a(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: b */
    public final synchronized Map<String, v82> mo20609b() {
        return k43.zzc(this.f22774b);
    }

    /* renamed from: d */
    public final void mo20610d() {
        C2971s.m13213p().mo17562h().mo11075T(new p82(this));
        this.f22776d.execute(new q82(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo20611e() {
        this.f22776d.execute(new q82(this));
    }

    /* renamed from: f */
    public final synchronized void mo20612f(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!this.f22773a.containsKey(str)) {
                this.f22773a.put(str, new t82(str, BuildConfig.FLAVOR, new Bundle()));
            }
        }
    }
}
