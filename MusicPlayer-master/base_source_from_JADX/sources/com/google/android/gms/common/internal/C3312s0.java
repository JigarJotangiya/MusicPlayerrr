package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.s0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3312s0 extends C3281h0 {

    /* renamed from: g */
    public final IBinder f10662g;

    /* renamed from: h */
    final /* synthetic */ C3261d f10663h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3312s0(C3261d dVar, int i, IBinder iBinder, Bundle bundle) {
        super(dVar, i, bundle);
        this.f10663h = dVar;
        this.f10662g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo11846f() {
        try {
            IBinder iBinder = this.f10662g;
            C3292l.m14240h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f10663h.mo11773D().equals(interfaceDescriptor)) {
                String D = this.f10663h.mo11773D();
                StringBuilder sb = new StringBuilder(String.valueOf(D).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(D);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface s = this.f10663h.mo11805s(this.f10662g);
            if (s == null || (!C3261d.m14123d0(this.f10663h, 2, 4, s) && !C3261d.m14123d0(this.f10663h, 3, 4, s))) {
                return false;
            }
            ConnectionResult unused = this.f10663h.f10606z = null;
            Bundle w = this.f10663h.mo11809w();
            if (this.f10663h.f10601u == null) {
                return true;
            }
            this.f10663h.f10601u.mo11813K0(w);
            return true;
        } catch (RemoteException unused2) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo11847g(ConnectionResult connectionResult) {
        if (this.f10663h.f10602v != null) {
            this.f10663h.f10602v.mo11815C0(connectionResult);
        }
        this.f10663h.mo11780K(connectionResult);
    }
}
