package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mv1 {

    /* renamed from: a */
    private boolean f20293a = false;

    /* renamed from: b */
    private boolean f20294b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f20295c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final long f20296d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final mm0<Boolean> f20297e = new mm0<>();

    /* renamed from: f */
    private final Context f20298f;

    /* renamed from: g */
    private final WeakReference<Context> f20299g;

    /* renamed from: h */
    private final br1 f20300h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Executor f20301i;

    /* renamed from: j */
    private final Executor f20302j;

    /* renamed from: k */
    private final ScheduledExecutorService f20303k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final qt1 f20304l;

    /* renamed from: m */
    private final zzcjf f20305m;

    /* renamed from: n */
    private final Map<String, zzbtn> f20306n = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final cf1 f20307o;

    /* renamed from: p */
    private boolean f20308p = true;

    public mv1(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, br1 br1, ScheduledExecutorService scheduledExecutorService, qt1 qt1, zzcjf zzcjf, cf1 cf1) {
        this.f20300h = br1;
        this.f20298f = context;
        this.f20299g = weakReference;
        this.f20301i = executor2;
        this.f20303k = scheduledExecutorService;
        this.f20302j = executor;
        this.f20304l = qt1;
        this.f20305m = zzcjf;
        this.f20307o = cf1;
        this.f20296d = C2971s.m13198a().mo11989b();
        m27503u("com.google.android.gms.ads.MobileAds", false, BuildConfig.FLAVOR, 0);
    }

    /* renamed from: i */
    static /* bridge */ /* synthetic */ void m27500i(mv1 mv1, String str) {
        mv1 mv12 = mv1;
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = new Object();
                mm0 mm0 = new mm0();
                d93 o = s83.m30613o(mm0, ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22530h1)).longValue(), TimeUnit.SECONDS, mv12.f20303k);
                mv12.f20304l.mo20506b(next);
                mv12.f20307o.mo16619p(next);
                long b = C2971s.m13198a().mo11989b();
                Iterator<String> it = keys;
                gv1 gv1 = r1;
                gv1 gv12 = new gv1(mv1, obj, mm0, next, b);
                o.mo15945h(gv1, mv12.f20301i);
                arrayList.add(o);
                lv1 lv1 = new lv1(mv1, obj, next, b, mm0);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", BuildConfig.FLAVOR);
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, BuildConfig.FLAVOR));
                                }
                            }
                            arrayList2.add(new zzbtx(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                mv12.m27503u(next, false, BuildConfig.FLAVOR, 0);
                try {
                    mv12.f20302j.execute(new fv1(mv1, mv12.f20300h.mo16361b(next, new JSONObject()), lv1, arrayList2, next));
                } catch (zp2 unused2) {
                    try {
                        lv1.mo18553q("Failed to create Adapter.");
                    } catch (RemoteException e) {
                        ul0.m31860e(BuildConfig.FLAVOR, e);
                    }
                }
                keys = it;
            }
            s83.m30599a(arrayList).mo20613a(new hv1(mv12), mv12.f20301i);
        } catch (JSONException e2) {
            C3018m1.m13389l("Malformed CLD response", e2);
        }
    }

    /* renamed from: t */
    private final synchronized d93<String> m27502t() {
        String c = C2971s.m13213p().mo17562h().mo11088d().mo15849c();
        if (!TextUtils.isEmpty(c)) {
            return s83.m30607i(c);
        }
        mm0 mm0 = new mm0();
        C2971s.m13213p().mo17562h().mo11075T(new ev1(this, mm0));
        return mm0;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m27503u(String str, boolean z, String str2, int i) {
        this.f20306n.put(str, new zzbtn(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Object mo19552e() throws Exception {
        this.f20297e.mo19449c(Boolean.TRUE);
        return null;
    }

    /* renamed from: f */
    public final List<zzbtn> mo19553f() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f20306n.keySet()) {
            zzbtn zzbtn = this.f20306n.get(next);
            arrayList.add(new zzbtn(next, zzbtn.f27268h, zzbtn.f27269i, zzbtn.f27270j));
        }
        return arrayList;
    }

    /* renamed from: k */
    public final void mo19554k() {
        this.f20308p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo19555l() {
        synchronized (this) {
            if (!this.f20295c) {
                m27503u("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (C2971s.m13198a().mo11989b() - this.f20296d));
                this.f20297e.mo19451e(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        com.google.android.gms.internal.ads.ul0.m31860e(p453me.zhanghai.android.materialprogressbar.BuildConfig.FLAVOR, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 74);
        r4.append("Failed to initialize adapter. ");
        r4.append(r5);
        r4.append(" does not implement the initialize() method.");
        r3.mo18553q(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo19556m(com.google.android.gms.internal.ads.kq2 r2, com.google.android.gms.internal.ads.l70 r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f20299g     // Catch:{ zp2 -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ zp2 -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ zp2 -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.f20298f     // Catch:{ zp2 -> 0x0011 }
        L_0x000d:
            r2.mo18974l(r0, r3, r4)     // Catch:{ zp2 -> 0x0011 }
            return
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2.length()     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2 + 74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0035 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = "Failed to initialize adapter. "
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            r4.append(r5)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = r4.toString()     // Catch:{ RemoteException -> 0x0035 }
            r3.mo18553q(r2)     // Catch:{ RemoteException -> 0x0035 }
            return
        L_0x0035:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.ul0.m31860e(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mv1.mo19556m(com.google.android.gms.internal.ads.kq2, com.google.android.gms.internal.ads.l70, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo19557n(mm0 mm0) {
        this.f20301i.execute(new dv1(this, mm0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo19558o() {
        this.f20304l.mo20508d();
        this.f20307o.mo16618f();
        this.f20294b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo19559p(Object obj, mm0 mm0, String str, long j) {
        synchronized (obj) {
            if (!mm0.isDone()) {
                m27503u(str, false, "Timeout.", (int) (C2971s.m13198a().mo11989b() - j));
                this.f20304l.mo20505a(str, "timeout");
                this.f20307o.mo16616V(str, "timeout");
                mm0.mo19449c(Boolean.FALSE);
            }
        }
    }

    /* renamed from: q */
    public final void mo19560q() {
        if (!k10.f18711a.mo20989e().booleanValue()) {
            if (this.f20305m.f27378i >= ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22522g1)).intValue() && this.f20308p) {
                if (!this.f20293a) {
                    synchronized (this) {
                        if (!this.f20293a) {
                            this.f20304l.mo20509e();
                            this.f20307o.zze();
                            this.f20297e.mo15945h(new bv1(this), this.f20301i);
                            this.f20293a = true;
                            d93<String> t = m27502t();
                            this.f20303k.schedule(new av1(this), ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22538i1)).longValue(), TimeUnit.SECONDS);
                            s83.m30616r(t, new jv1(this), this.f20301i);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.f20293a) {
            m27503u("com.google.android.gms.ads.MobileAds", true, BuildConfig.FLAVOR, 0);
            this.f20297e.mo19449c(Boolean.FALSE);
            this.f20293a = true;
            this.f20294b = true;
        }
    }

    /* renamed from: r */
    public final void mo19561r(o70 o70) {
        this.f20297e.mo15945h(new cv1(this, o70), this.f20302j);
    }

    /* renamed from: s */
    public final boolean mo19562s() {
        return this.f20294b;
    }
}
