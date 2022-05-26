package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cy1 extends ey1 {
    public cy1(Context context) {
        this.f16375f = new dg0(context, C2971s.m13218u().mo11123b(), this, this);
    }

    /* renamed from: C0 */
    public final void mo11815C0(ConnectionResult connectionResult) {
        ul0.m31857b("Cannot connect to remote service, fallback to local instance.");
        this.f16370a.mo19451e(new uy1(1));
    }

    /* renamed from: K0 */
    public final void mo11813K0(Bundle bundle) {
        synchronized (this.f16371b) {
            if (!this.f16373d) {
                this.f16373d = true;
                try {
                    this.f16375f.mo16925i0().mo17908c3(this.f16374e, new dy1(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f16370a.mo19451e(new uy1(1));
                } catch (Throwable th) {
                    C2971s.m13213p().mo17571s(th, "RemoteAdRequestClientTask.onConnected");
                    this.f16370a.mo19451e(new uy1(1));
                }
            }
        }
    }
}
