package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.v0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3217v0 extends C3213t0<Boolean> {

    /* renamed from: c */
    public final C3187h<?> f10455c;

    public C3217v0(C3187h<?> hVar, C7471i<Boolean> iVar) {
        super(4, iVar);
        this.f10455c = hVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11630c(C3206q qVar, boolean z) {
    }

    /* renamed from: f */
    public final Feature[] mo11590f(C3224z<?> zVar) {
        C3194k0 k0Var = zVar.mo11650t().get(this.f10455c);
        if (k0Var == null) {
            return null;
        }
        return k0Var.f10420a.mo11600b();
    }

    /* renamed from: g */
    public final boolean mo11591g(C3224z<?> zVar) {
        C3194k0 k0Var = zVar.mo11650t().get(this.f10455c);
        if (k0Var == null) {
            return false;
        }
        k0Var.f10420a.mo11602d();
        throw null;
    }

    /* renamed from: h */
    public final void mo11629h(C3224z<?> zVar) throws RemoteException {
        C3194k0 remove = zVar.mo11650t().remove(this.f10455c);
        if (remove != null) {
            remove.f10421b.mo11618a(zVar.mo11649s(), this.f10449b);
            remove.f10420a.mo11599a();
            return;
        }
        this.f10449b.mo28356e(Boolean.FALSE);
    }
}
