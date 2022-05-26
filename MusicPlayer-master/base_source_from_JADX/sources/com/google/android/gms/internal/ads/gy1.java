package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gy1 extends ey1 {
    public gy1(Context context) {
        this.f16375f = new dg0(context, C2971s.m13218u().mo11123b(), this, this);
    }

    /* renamed from: K0 */
    public final void mo11813K0(Bundle bundle) {
        synchronized (this.f16371b) {
            if (!this.f16373d) {
                this.f16373d = true;
                try {
                    this.f16375f.mo16925i0().mo17906L0(this.f16374e, new dy1(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f16370a.mo19451e(new uy1(1));
                } catch (Throwable th) {
                    C2971s.m13213p().mo17571s(th, "RemoteSignalsClientTask.onConnected");
                    this.f16370a.mo19451e(new uy1(1));
                }
            }
        }
    }
}
