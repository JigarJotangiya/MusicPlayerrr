package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u82 extends dd0 {

    /* renamed from: g */
    private final String f24228g;

    /* renamed from: h */
    private final bd0 f24229h;

    /* renamed from: i */
    private final mm0<JSONObject> f24230i;

    /* renamed from: j */
    private final JSONObject f24231j;

    /* renamed from: k */
    private boolean f24232k = false;

    public u82(String str, bd0 bd0, mm0<JSONObject> mm0) {
        JSONObject jSONObject = new JSONObject();
        this.f24231j = jSONObject;
        this.f24230i = mm0;
        this.f24228g = str;
        this.f24229h = bd0;
        try {
            jSONObject.put("adapter_version", bd0.mo16208c().toString());
            jSONObject.put("sdk_version", bd0.mo16209d().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* renamed from: Q6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17177Q6(com.google.android.gms.internal.ads.zzbew r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f24232k     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f24231j     // Catch:{ JSONException -> 0x0010 }
            java.lang.String r1 = "signal_error"
            java.lang.String r3 = r3.f27187h     // Catch:{ JSONException -> 0x0010 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0010 }
        L_0x0010:
            com.google.android.gms.internal.ads.mm0<org.json.JSONObject> r3 = r2.f24230i     // Catch:{ all -> 0x001c }
            org.json.JSONObject r0 = r2.f24231j     // Catch:{ all -> 0x001c }
            r3.mo19449c(r0)     // Catch:{ all -> 0x001c }
            r3 = 1
            r2.f24232k = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u82.mo17177Q6(com.google.android.gms.internal.ads.zzbew):void");
    }

    /* renamed from: a */
    public final synchronized void mo21235a() {
        if (!this.f24232k) {
            this.f24230i.mo19449c(this.f24231j);
            this.f24232k = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0017 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17178q(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f24232k     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = "Adapter returned null signals"
            r2.mo17179v(r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0010:
            org.json.JSONObject r0 = r2.f24231j     // Catch:{ JSONException -> 0x0017 }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0017 }
        L_0x0017:
            com.google.android.gms.internal.ads.mm0<org.json.JSONObject> r3 = r2.f24230i     // Catch:{ all -> 0x0023 }
            org.json.JSONObject r0 = r2.f24231j     // Catch:{ all -> 0x0023 }
            r3.mo19449c(r0)     // Catch:{ all -> 0x0023 }
            r3 = 1
            r2.f24232k = r3     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u82.mo17178q(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17179v(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f24232k     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f24231j     // Catch:{ JSONException -> 0x000e }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            com.google.android.gms.internal.ads.mm0<org.json.JSONObject> r3 = r2.f24230i     // Catch:{ all -> 0x001a }
            org.json.JSONObject r0 = r2.f24231j     // Catch:{ all -> 0x001a }
            r3.mo19449c(r0)     // Catch:{ all -> 0x001a }
            r3 = 1
            r2.f24232k = r3     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u82.mo17179v(java.lang.String):void");
    }
}
