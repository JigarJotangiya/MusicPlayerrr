package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ky1 extends ey1 {

    /* renamed from: g */
    private String f19105g;

    /* renamed from: h */
    private int f19106h = 1;

    public ky1(Context context) {
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
                    int i = this.f19106h;
                    if (i == 2) {
                        this.f16375f.mo16925i0().mo17909v1(this.f16374e, new dy1(this));
                    } else if (i == 3) {
                        this.f16375f.mo16925i0().mo17907O0(this.f19105g, new dy1(this));
                    } else {
                        this.f16370a.mo19451e(new uy1(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f16370a.mo19451e(new uy1(1));
                } catch (Throwable th) {
                    C2971s.m13213p().mo17571s(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.f16370a.mo19451e(new uy1(1));
                }
            }
        }
    }

    /* renamed from: b */
    public final d93<InputStream> mo19036b(zzcdq zzcdq) {
        synchronized (this.f16371b) {
            int i = this.f19106h;
            if (i != 1 && i != 2) {
                d93<InputStream> h = s83.m30606h(new uy1(2));
                return h;
            } else if (this.f16372c) {
                mm0<InputStream> mm0 = this.f16370a;
                return mm0;
            } else {
                this.f19106h = 2;
                this.f16372c = true;
                this.f16374e = zzcdq;
                this.f16375f.mo11803q();
                this.f16370a.mo15945h(new iy1(this), hm0.f17713f);
                mm0<InputStream> mm02 = this.f16370a;
                return mm02;
            }
        }
    }

    /* renamed from: c */
    public final d93<InputStream> mo19037c(String str) {
        synchronized (this.f16371b) {
            int i = this.f19106h;
            if (i != 1 && i != 3) {
                d93<InputStream> h = s83.m30606h(new uy1(2));
                return h;
            } else if (this.f16372c) {
                mm0<InputStream> mm0 = this.f16370a;
                return mm0;
            } else {
                this.f19106h = 3;
                this.f16372c = true;
                this.f19105g = str;
                this.f16375f.mo11803q();
                this.f16370a.mo15945h(new jy1(this), hm0.f17713f);
                mm0<InputStream> mm02 = this.f16370a;
                return mm02;
            }
        }
    }
}
