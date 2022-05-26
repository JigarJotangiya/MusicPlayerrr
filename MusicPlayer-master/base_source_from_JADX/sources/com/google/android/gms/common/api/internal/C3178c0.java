package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3261d;
import com.google.android.gms.common.internal.C3279h;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C3178c0 implements C3261d.C3264c, C3201n0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3147a.C3156f f10367a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3173b<?> f10368b;

    /* renamed from: c */
    private C3279h f10369c = null;

    /* renamed from: d */
    private Set<Scope> f10370d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f10371e = false;

    /* renamed from: f */
    final /* synthetic */ C3181e f10372f;

    public C3178c0(C3181e eVar, C3147a.C3156f fVar, C3173b<?> bVar) {
        this.f10372f = eVar;
        this.f10367a = fVar;
        this.f10368b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m13845h() {
        C3279h hVar;
        if (this.f10371e && (hVar = this.f10369c) != null) {
            this.f10367a.mo11504b(hVar, this.f10370d);
        }
    }

    /* renamed from: a */
    public final void mo11571a(ConnectionResult connectionResult) {
        this.f10372f.f10392v.post(new C3174b0(this, connectionResult));
    }

    /* renamed from: b */
    public final void mo11572b(C3279h hVar, Set<Scope> set) {
        if (hVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo11573c(new ConnectionResult(4));
            return;
        }
        this.f10369c = hVar;
        this.f10370d = set;
        m13845h();
    }

    /* renamed from: c */
    public final void mo11573c(ConnectionResult connectionResult) {
        C3224z zVar = (C3224z) this.f10372f.f10388r.get(this.f10368b);
        if (zVar != null) {
            zVar.mo11645o(connectionResult);
        }
    }
}
