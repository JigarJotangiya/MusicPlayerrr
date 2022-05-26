package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.internal.C3292l;
import java.util.regex.Pattern;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yo2 extends hh0 {

    /* renamed from: g */
    private final oo2 f26457g;

    /* renamed from: h */
    private final do2 f26458h;

    /* renamed from: i */
    private final pp2 f26459i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public rp1 f26460j;

    /* renamed from: k */
    private boolean f26461k = false;

    public yo2(oo2 oo2, do2 do2, pp2 pp2) {
        this.f26457g = oo2;
        this.f26458h = do2;
        this.f26459i = pp2;
    }

    /* renamed from: g7 */
    private final synchronized boolean m34240g7() {
        rp1 rp1;
        rp1 = this.f26460j;
        return rp1 != null && !rp1.mo20728j();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo18334A0(p159f.p243f.p245b.p246a.p248b.C4863a r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            com.google.android.gms.common.internal.C3292l.m14236d(r0)     // Catch:{ all -> 0x0024 }
            com.google.android.gms.internal.ads.rp1 r0 = r2.f26460j     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            if (r3 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            java.lang.Object r3 = p159f.p243f.p245b.p246a.p248b.C4865b.m20502K0(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof android.app.Activity     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x0024 }
        L_0x0019:
            com.google.android.gms.internal.ads.rp1 r3 = r2.f26460j     // Catch:{ all -> 0x0024 }
            boolean r1 = r2.f26461k     // Catch:{ all -> 0x0024 }
            r3.mo20731m(r1, r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yo2.mo18334A0(f.f.b.a.b.a):void");
    }

    /* renamed from: H2 */
    public final synchronized void mo18335H2(zzcen zzcen) throws RemoteException {
        C3292l.m14236d("loadAd must be called on the main UI thread.");
        String str = zzcen.f27359h;
        String str2 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22588o3);
        if (!(str2 == null || str == null)) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                C2971s.m13213p().mo17571s(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (m34240g7()) {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22604q3)).booleanValue()) {
                return;
            }
        }
        fo2 fo2 = new fo2((String) null);
        this.f26460j = null;
        this.f26457g.mo20066i(1);
        this.f26457g.mo16308a(zzcen.f27358g, zzcen.f27359h, fo2, new wo2(this));
    }

    /* renamed from: W1 */
    public final synchronized void mo18336W1(boolean z) {
        C3292l.m14236d("setImmersiveMode must be called on the main UI thread.");
        this.f26461k = z;
    }

    /* renamed from: X */
    public final synchronized void mo18337X(C4863a aVar) {
        Context context;
        C3292l.m14236d("pause must be called on the main UI thread.");
        if (this.f26460j != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) C4865b.m20502K0(aVar);
            }
            this.f26460j.mo17840d().mo17136P0(context);
        }
    }

    /* renamed from: a */
    public final Bundle mo18338a() {
        C3292l.m14236d("getAdMetadata can only be called from the UI thread.");
        rp1 rp1 = this.f26460j;
        return rp1 != null ? rp1.mo20726h() : new Bundle();
    }

    /* renamed from: b */
    public final synchronized C5316lx mo18339b() throws RemoteException {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22311D4)).booleanValue()) {
            return null;
        }
        rp1 rp1 = this.f26460j;
        if (rp1 == null) {
            return null;
        }
        return rp1.mo17839c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo18340c0(p159f.p243f.p245b.p246a.p248b.C4863a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.C3292l.m14236d(r0)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.do2 r0 = r2.f26458h     // Catch:{ all -> 0x0027 }
            r1 = 0
            r0.mo16979u(r1)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.rp1 r0 = r2.f26460j     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = p159f.p243f.p245b.p246a.p248b.C4865b.m20502K0(r3)     // Catch:{ all -> 0x0027 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0027 }
        L_0x001a:
            com.google.android.gms.internal.ads.rp1 r3 = r2.f26460j     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.e91 r3 = r3.mo17840d()     // Catch:{ all -> 0x0027 }
            r3.mo17135N0(r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yo2.mo18340c0(f.f.b.a.b.a):void");
    }

    /* renamed from: e */
    public final void mo18341e() {
        mo18337X((C4863a) null);
    }

    /* renamed from: f */
    public final synchronized String mo18342f() throws RemoteException {
        rp1 rp1 = this.f26460j;
        if (rp1 == null || rp1.mo17839c() == null) {
            return null;
        }
        return this.f26460j.mo17839c().zze();
    }

    /* renamed from: h */
    public final void mo18343h() {
        mo18351u0((C4863a) null);
    }

    /* renamed from: m2 */
    public final void mo18344m2(gh0 gh0) {
        C3292l.m14236d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f26458h.mo16974V(gh0);
    }

    /* renamed from: n */
    public final boolean mo18345n() {
        rp1 rp1 = this.f26460j;
        return rp1 != null && rp1.mo20730l();
    }

    /* renamed from: o */
    public final synchronized void mo18346o() throws RemoteException {
        mo18334A0((C4863a) null);
    }

    /* renamed from: o0 */
    public final synchronized void mo18347o0(String str) throws RemoteException {
        C3292l.m14236d("#008 Must be called on the main UI thread.: setCustomData");
        this.f26459i.f21454b = str;
    }

    /* renamed from: p0 */
    public final synchronized void mo18348p0(String str) throws RemoteException {
        C3292l.m14236d("setUserId must be called on the main UI thread.");
        this.f26459i.f21453a = str;
    }

    /* renamed from: s3 */
    public final void mo18349s3(lh0 lh0) throws RemoteException {
        C3292l.m14236d("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f26458h.mo16973R(lh0);
    }

    /* renamed from: t3 */
    public final void mo18350t3(C5018dw dwVar) {
        C3292l.m14236d("setAdMetadataListener can only be called from the UI thread.");
        if (dwVar == null) {
            this.f26458h.mo16979u((xx2) null);
        } else {
            this.f26458h.mo16979u(new xo2(this, dwVar));
        }
    }

    /* renamed from: u0 */
    public final synchronized void mo18351u0(C4863a aVar) {
        Context context;
        C3292l.m14236d("resume must be called on the main UI thread.");
        if (this.f26460j != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) C4865b.m20502K0(aVar);
            }
            this.f26460j.mo17840d().mo17137W0(context);
        }
    }

    public final void zze() throws RemoteException {
        mo18340c0((C4863a) null);
    }

    public final boolean zzs() throws RemoteException {
        C3292l.m14236d("isLoaded must be called on the main UI thread.");
        return m34240g7();
    }
}
