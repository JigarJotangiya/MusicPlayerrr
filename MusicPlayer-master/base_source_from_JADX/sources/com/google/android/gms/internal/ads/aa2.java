package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class aa2 implements C5497qt, yf1 {

    /* renamed from: g */
    private C5203iv f13830g;

    /* renamed from: a */
    public final synchronized void mo15728a(C5203iv ivVar) {
        this.f13830g = ivVar;
    }

    /* renamed from: o */
    public final synchronized void mo15729o() {
        C5203iv ivVar = this.f13830g;
        if (ivVar != null) {
            try {
                ivVar.mo18032a();
            } catch (RemoteException e) {
                ul0.m31863h("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    /* renamed from: u0 */
    public final synchronized void mo10632u0() {
        C5203iv ivVar = this.f13830g;
        if (ivVar != null) {
            try {
                ivVar.mo18032a();
            } catch (RemoteException e) {
                ul0.m31863h("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
