package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3279h;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C3174b0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ ConnectionResult f10358g;

    /* renamed from: h */
    final /* synthetic */ C3178c0 f10359h;

    C3174b0(C3178c0 c0Var, ConnectionResult connectionResult) {
        this.f10359h = c0Var;
        this.f10358g = connectionResult;
    }

    public final void run() {
        C3224z zVar = (C3224z) this.f10359h.f10372f.f10388r.get(this.f10359h.f10368b);
        if (zVar != null) {
            if (this.f10358g.mo11450v0()) {
                boolean unused = this.f10359h.f10371e = true;
                if (this.f10359h.f10367a.mo11516p()) {
                    this.f10359h.m13845h();
                    return;
                }
                try {
                    this.f10359h.f10367a.mo11504b((C3279h) null, this.f10359h.f10367a.mo11503a());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f10359h.f10367a.mo11506d("Failed to get service from broker.");
                    zVar.mo11646p(new ConnectionResult(10), (Exception) null);
                }
            } else {
                zVar.mo11646p(this.f10358g, (Exception) null);
            }
        }
    }
}
