package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mj1 extends m20 {

    /* renamed from: g */
    private final bk1 f20052g;

    /* renamed from: h */
    private C4863a f20053h;

    public mj1(bk1 bk1) {
        this.f20052g = bk1;
    }

    /* renamed from: e7 */
    private static float m27275e7(C4863a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) C4865b.m20502K0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    /* renamed from: Y */
    public final void mo19391Y(C4863a aVar) {
        this.f20053h = aVar;
    }

    /* renamed from: c */
    public final float mo19392c() throws RemoteException {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22501d4)).booleanValue() && this.f20052g.mo16266R() != null) {
            return this.f20052g.mo16266R().mo15829c();
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final float mo19393d() throws RemoteException {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22501d4)).booleanValue() && this.f20052g.mo16266R() != null) {
            return this.f20052g.mo16266R().mo15830d();
        }
        return 0.0f;
    }

    /* renamed from: e */
    public final C5427ox mo19394e() throws RemoteException {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22501d4)).booleanValue()) {
            return null;
        }
        return this.f20052g.mo16266R();
    }

    /* renamed from: g */
    public final C4863a mo19048g() throws RemoteException {
        C4863a aVar = this.f20053h;
        if (aVar != null) {
            return aVar;
        }
        q20 U = this.f20052g.mo16269U();
        if (U == null) {
            return null;
        }
        return U.mo16823c();
    }

    /* renamed from: i */
    public final boolean mo19395i() throws RemoteException {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22501d4)).booleanValue() && this.f20052g.mo16266R() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l1 */
    public final void mo19396l1(x30 x30) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22501d4)).booleanValue() && (this.f20052g.mo16266R() instanceof ms0)) {
            ((ms0) this.f20052g.mo16266R()).mo19504k7(x30);
        }
    }

    public final float zze() throws RemoteException {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22493c4)).booleanValue()) {
            return 0.0f;
        }
        if (this.f20052g.mo16258J() != 0.0f) {
            return this.f20052g.mo16258J();
        }
        if (this.f20052g.mo16266R() != null) {
            try {
                return this.f20052g.mo16266R().zze();
            } catch (RemoteException e) {
                ul0.m31860e("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        } else {
            C4863a aVar = this.f20053h;
            if (aVar != null) {
                return m27275e7(aVar);
            }
            q20 U = this.f20052g.mo16269U();
            if (U == null) {
                return 0.0f;
            }
            float f = (U.mo16824f() == -1 || U.mo16822b() == -1) ? 0.0f : ((float) U.mo16824f()) / ((float) U.mo16822b());
            return f == 0.0f ? m27275e7(U.mo16823c()) : f;
        }
    }
}
