package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.C3032r0;
import com.google.android.gms.common.C3237c;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.p078l.C3334c;
import com.google.android.gms.common.util.C3369n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ti0 implements zi0 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final List<Future<Void>> f23881l = Collections.synchronizedList(new ArrayList());

    /* renamed from: m */
    public static final /* synthetic */ int f23882m = 0;

    /* renamed from: a */
    private final fq3 f23883a;

    /* renamed from: b */
    private final LinkedHashMap<String, zq3> f23884b;

    /* renamed from: c */
    private final List<String> f23885c = new ArrayList();

    /* renamed from: d */
    private final List<String> f23886d = new ArrayList();

    /* renamed from: e */
    private final Context f23887e;

    /* renamed from: f */
    boolean f23888f;

    /* renamed from: g */
    private final zzcgc f23889g;

    /* renamed from: h */
    private final Object f23890h = new Object();

    /* renamed from: i */
    private HashSet<String> f23891i = new HashSet<>();

    /* renamed from: j */
    private boolean f23892j = false;

    /* renamed from: k */
    private boolean f23893k = false;

    public ti0(Context context, zzcjf zzcjf, zzcgc zzcgc, String str, wi0 wi0, byte[] bArr) {
        C3292l.m14241i(zzcgc, "SafeBrowsing config is not present.");
        this.f23887e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f23884b = new LinkedHashMap<>();
        this.f23889g = zzcgc;
        for (String lowerCase : zzcgc.f27368k) {
            this.f23891i.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f23891i.remove("cookie".toLowerCase(Locale.ENGLISH));
        fq3 D = dr3.m22645D();
        D.mo17595F(9);
        D.mo17591B(str);
        D.mo17603z(str);
        hq3 D2 = iq3.m25374D();
        String str2 = this.f23889g.f27364g;
        if (str2 != null) {
            D2.mo18199r(str2);
        }
        D.mo17602y((iq3) D2.mo19761n());
        br3 D3 = cr3.m22088D();
        D3.mo16366t(C3334c.m14368a(this.f23887e).mo11914g());
        String str3 = zzcjf.f27376g;
        if (str3 != null) {
            D3.mo16364r(str3);
        }
        long a = (long) C3237c.m14031f().mo11693a(this.f23887e);
        if (a > 0) {
            D3.mo16365s(a);
        }
        D.mo17601w((cr3) D3.mo19761n());
        this.f23883a = D;
    }

    /* renamed from: V */
    public final void mo21064V(String str) {
        synchronized (this.f23890h) {
            if (str == null) {
                this.f23883a.mo17599u();
            } else {
                this.f23883a.mo17600v(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21065a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f23890h
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.f23893k = r2     // Catch:{ all -> 0x00b7 }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zq3> r2 = r6.f23884b     // Catch:{ all -> 0x00b7 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0024
            if (r9 != r1) goto L_0x0022
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zq3> r8 = r6.f23884b     // Catch:{ all -> 0x00b7 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zq3 r7 = (com.google.android.gms.internal.ads.zq3) r7     // Catch:{ all -> 0x00b7 }
            int r8 = com.google.android.gms.internal.ads.yq3.m34278a(r1)     // Catch:{ all -> 0x00b7 }
            r7.mo22425v(r8)     // Catch:{ all -> 0x00b7 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x0024:
            com.google.android.gms.internal.ads.zq3 r1 = com.google.android.gms.internal.ads.ar3.m20933E()     // Catch:{ all -> 0x00b7 }
            int r9 = com.google.android.gms.internal.ads.yq3.m34278a(r9)     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x0031
            r1.mo22425v(r9)     // Catch:{ all -> 0x00b7 }
        L_0x0031:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zq3> r9 = r6.f23884b     // Catch:{ all -> 0x00b7 }
            int r9 = r9.size()     // Catch:{ all -> 0x00b7 }
            r1.mo22422s(r9)     // Catch:{ all -> 0x00b7 }
            r1.mo22424u(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.lq3 r9 = com.google.android.gms.internal.ads.oq3.m28658D()     // Catch:{ all -> 0x00b7 }
            java.util.HashSet<java.lang.String> r2 = r6.f23891i     // Catch:{ all -> 0x00b7 }
            int r2 = r2.size()     // Catch:{ all -> 0x00b7 }
            if (r2 <= 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00a7
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0053:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00b7 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b7 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b7 }
            goto L_0x006e
        L_0x006c:
            java.lang.String r3 = ""
        L_0x006e:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x007b
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b7 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r2 = ""
        L_0x007d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00b7 }
            java.util.HashSet<java.lang.String> r5 = r6.f23891i     // Catch:{ all -> 0x00b7 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.jq3 r4 = com.google.android.gms.internal.ads.kq3.m26390D()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.kl3 r3 = com.google.android.gms.internal.ads.kl3.zzx(r3)     // Catch:{ all -> 0x00b7 }
            r4.mo18703r(r3)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.kl3 r2 = com.google.android.gms.internal.ads.kl3.zzx(r2)     // Catch:{ all -> 0x00b7 }
            r4.mo18704s(r2)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.qm3 r2 = r4.mo19761n()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.kq3 r2 = (com.google.android.gms.internal.ads.kq3) r2     // Catch:{ all -> 0x00b7 }
            r9.mo19274r(r2)     // Catch:{ all -> 0x00b7 }
            goto L_0x0053
        L_0x00a7:
            com.google.android.gms.internal.ads.qm3 r8 = r9.mo19761n()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.oq3 r8 = (com.google.android.gms.internal.ads.oq3) r8     // Catch:{ all -> 0x00b7 }
            r1.mo22423t(r8)     // Catch:{ all -> 0x00b7 }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zq3> r8 = r6.f23884b     // Catch:{ all -> 0x00b7 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x00b7:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ti0.mo21065a(java.lang.String, java.util.Map, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21066b(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcgc r0 = r7.f23889g
            boolean r0 = r0.f27366i
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.f23892j
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            com.google.android.gms.ads.internal.C2971s.m13214q()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0014
            goto L_0x006d
        L_0x0014:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002d }
            r8.setDrawingCacheEnabled(r0)     // Catch:{ RuntimeException -> 0x002d }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002d }
            if (r3 == 0) goto L_0x0026
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            goto L_0x002f
        L_0x002d:
            r2 = move-exception
            r3 = r1
        L_0x002f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.ul0.m31860e(r4, r2)
        L_0x0034:
            if (r3 != 0) goto L_0x006c
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            if (r2 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0065 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0065 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0065 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0065 }
            r1 = r4
            goto L_0x006d
        L_0x005f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.ul0.m31862g(r8)     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.ul0.m31860e(r2, r8)
            goto L_0x006d
        L_0x006c:
            r1 = r3
        L_0x006d:
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.yi0.m34127a(r8)
            return
        L_0x0075:
            r7.f23892j = r0
            com.google.android.gms.internal.ads.qi0 r8 = new com.google.android.gms.internal.ads.qi0
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.C2979b2.m13245U(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ti0.mo21066b(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo21067c(Map map) throws Exception {
        d93<O> m;
        zq3 zq3;
        String str;
        if (map != null) {
            try {
                for (String str2 : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str2)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f23890h) {
                            int length = optJSONArray.length();
                            synchronized (this.f23890h) {
                                zq3 = this.f23884b.get(str2);
                            }
                            if (zq3 == null) {
                                String valueOf = String.valueOf(str2);
                                if (valueOf.length() != 0) {
                                    str = "Cannot find the corresponding resource object for ".concat(valueOf);
                                } else {
                                    str = new String("Cannot find the corresponding resource object for ");
                                }
                                yi0.m34127a(str);
                            } else {
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    zq3.mo22421r(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                boolean z2 = this.f23888f;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f23888f = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (m10.f19699a.mo20989e().booleanValue()) {
                    ul0.m31858c("Failed to get SafeBrowsing metadata", e);
                }
                return s83.m30606h(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f23888f) {
            synchronized (this.f23890h) {
                this.f23883a.mo17595F(10);
            }
        }
        boolean z3 = this.f23888f;
        if ((!z3 || !this.f23889g.f27370m) && ((!this.f23893k || !this.f23889g.f27369l) && (z3 || !this.f23889g.f27367j))) {
            return s83.m30607i(null);
        }
        synchronized (this.f23890h) {
            for (zq3 n : this.f23884b.values()) {
                this.f23883a.mo17598t((ar3) n.mo19761n());
            }
            this.f23883a.mo17596r(this.f23885c);
            this.f23883a.mo17597s(this.f23886d);
            if (yi0.m34128b()) {
                String D = this.f23883a.mo17593D();
                String C = this.f23883a.mo17592C();
                StringBuilder sb = new StringBuilder(String.valueOf(D).length() + 53 + String.valueOf(C).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(D);
                sb.append("\n  clickUrl: ");
                sb.append(C);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (ar3 next : this.f23883a.mo17594E()) {
                    sb2.append("    [");
                    sb2.append(next.mo15933D());
                    sb2.append("] ");
                    sb2.append(next.mo15934G());
                }
                yi0.m34127a(sb2.toString());
            }
            byte[] e2 = ((dr3) this.f23883a.mo19761n()).mo21561e();
            d93<String> b = new C3032r0(this.f23887e).mo11110b(1, this.f23889g.f27365h, (Map<String, String>) null, e2);
            if (yi0.m34128b()) {
                b.mo15945h(ri0.f22864g, hm0.f17708a);
            }
            m = s83.m30611m(b, oi0.f21010a, hm0.f17713f);
        }
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo21068e(Bitmap bitmap) {
        jl3 zzt = kl3.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.f23890h) {
            fq3 fq3 = this.f23883a;
            tq3 D = vq3.m32661D();
            D.mo21143r(zzt.mo18663d());
            D.mo21144s("image/png");
            D.mo21145t(2);
            fq3.mo17590A((vq3) D.mo19761n());
        }
    }

    /* renamed from: g */
    public final boolean mo21069g() {
        return C3369n.m14473e() && this.f23889g.f27366i && !this.f23892j;
    }

    public final zzcgc zza() {
        return this.f23889g;
    }

    public final void zze() {
        synchronized (this.f23890h) {
            this.f23884b.keySet();
            d93 i = s83.m30607i(Collections.emptyMap());
            pi0 pi0 = new pi0(this);
            e93 e93 = hm0.f17713f;
            d93 n = s83.m30612n(i, pi0, e93);
            d93 o = s83.m30613o(n, 10, TimeUnit.SECONDS, hm0.f17711d);
            s83.m30616r(n, new si0(this, o), e93);
            f23881l.add(o);
        }
    }
}
