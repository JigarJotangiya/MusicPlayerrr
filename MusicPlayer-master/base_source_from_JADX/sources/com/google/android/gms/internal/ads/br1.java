package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class br1 {

    /* renamed from: a */
    private final yq1 f14684a;

    /* renamed from: b */
    private final AtomicReference<cb0> f14685b = new AtomicReference<>();

    br1(yq1 yq1) {
        this.f14684a = yq1;
    }

    /* renamed from: e */
    private final cb0 m21494e() throws RemoteException {
        cb0 cb0 = this.f14685b.get();
        if (cb0 != null) {
            return cb0;
        }
        ul0.m31862g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    /* renamed from: a */
    public final bd0 mo16360a(String str) throws RemoteException {
        bd0 b0 = m21494e().mo15736b0(str);
        this.f14684a.mo22278d(str, b0);
        return b0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(r6) != false) goto L_0x004f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.kq2 mo16361b(java.lang.String r6, org.json.JSONObject r7) throws com.google.android.gms.internal.ads.zp2 {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            com.google.android.gms.internal.ads.kq2 r1 = new com.google.android.gms.internal.ads.kq2     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0017
            com.google.android.gms.internal.ads.bc0 r7 = new com.google.android.gms.internal.ads.bc0     // Catch:{ all -> 0x0083 }
            com.google.ads.mediation.admob.AdMobAdapter r0 = new com.google.ads.mediation.admob.AdMobAdapter     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r7.<init>((com.google.android.gms.ads.mediation.C3075f) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x0017:
            java.lang.String r2 = "com.google.ads.mediation.AdUrlAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.bc0 r7 = new com.google.android.gms.internal.ads.bc0     // Catch:{ all -> 0x0083 }
            com.google.ads.mediation.AdUrlAdapter r0 = new com.google.ads.mediation.AdUrlAdapter     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r7.<init>((com.google.android.gms.ads.mediation.C3075f) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x002a:
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobCustomTabsAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.bc0 r7 = new com.google.android.gms.internal.ads.bc0     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzcaf r0 = new com.google.android.gms.internal.ads.zzcaf     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r7.<init>((com.google.android.gms.ads.mediation.C3075f) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x003d:
            com.google.android.gms.internal.ads.cb0 r2 = r5.m21494e()     // Catch:{ all -> 0x0083 }
            boolean r3 = r0.equals(r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            if (r3 != 0) goto L_0x004f
            boolean r3 = r4.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0076
        L_0x004f:
            java.lang.String r3 = "class_name"
            java.lang.String r7 = r7.getString(r3)     // Catch:{ JSONException -> 0x0070 }
            boolean r3 = r2.mo15739v(r7)     // Catch:{ JSONException -> 0x0070 }
            if (r3 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.fb0 r7 = r2.mo15737p(r4)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x007a
        L_0x0060:
            boolean r3 = r2.mo15738q(r7)     // Catch:{ JSONException -> 0x0070 }
            if (r3 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.fb0 r7 = r2.mo15737p(r7)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x007a
        L_0x006b:
            com.google.android.gms.internal.ads.fb0 r7 = r2.mo15737p(r0)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x007a
        L_0x0070:
            r7 = move-exception
            java.lang.String r0 = "Invalid custom event."
            com.google.android.gms.internal.ads.ul0.m31860e(r0, r7)     // Catch:{ all -> 0x0083 }
        L_0x0076:
            com.google.android.gms.internal.ads.fb0 r7 = r2.mo15737p(r6)     // Catch:{ all -> 0x0083 }
        L_0x007a:
            r1.<init>(r7)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.yq1 r7 = r5.f14684a
            r7.mo22277c(r6, r1)
            return r1
        L_0x0083:
            r6 = move-exception
            com.google.android.gms.internal.ads.zp2 r7 = new com.google.android.gms.internal.ads.zp2
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.br1.mo16361b(java.lang.String, org.json.JSONObject):com.google.android.gms.internal.ads.kq2");
    }

    /* renamed from: c */
    public final void mo16362c(cb0 cb0) {
        this.f14685b.compareAndSet((Object) null, cb0);
    }

    /* renamed from: d */
    public final boolean mo16363d() {
        return this.f14685b.get() != null;
    }
}
