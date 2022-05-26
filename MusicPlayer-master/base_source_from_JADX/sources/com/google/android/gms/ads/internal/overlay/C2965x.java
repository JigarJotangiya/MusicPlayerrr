package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5497qt;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.we0;
import com.google.android.gms.internal.ads.yf1;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.ads.internal.overlay.x */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2965x extends we0 {

    /* renamed from: g */
    private final AdOverlayInfoParcel f9909g;

    /* renamed from: h */
    private final Activity f9910h;

    /* renamed from: i */
    private boolean f9911i = false;

    /* renamed from: j */
    private boolean f9912j = false;

    public C2965x(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f9909g = adOverlayInfoParcel;
        this.f9910h = activity;
    }

    /* renamed from: a */
    private final synchronized void m13127a() {
        if (!this.f9912j) {
            C2958q qVar = this.f9909g.f9852i;
            if (qVar != null) {
                qVar.mo10903z(4);
            }
            this.f9912j = true;
        }
    }

    /* renamed from: F */
    public final boolean mo10868F() throws RemoteException {
        return false;
    }

    /* renamed from: K */
    public final void mo10870K(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f9911i);
    }

    /* renamed from: U4 */
    public final void mo10872U4(Bundle bundle) {
        C2958q qVar;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22408Q5)).booleanValue()) {
            this.f9910h.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9909g;
        if (adOverlayInfoParcel == null) {
            this.f9910h.finish();
        } else if (z) {
            this.f9910h.finish();
        } else {
            if (bundle == null) {
                C5497qt qtVar = adOverlayInfoParcel.f9851h;
                if (qtVar != null) {
                    qtVar.mo10632u0();
                }
                yf1 yf1 = this.f9909g.f9849E;
                if (yf1 != null) {
                    yf1.mo15729o();
                }
                if (!(this.f9910h.getIntent() == null || !this.f9910h.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (qVar = this.f9909g.f9852i) == null)) {
                    qVar.mo10900a();
                }
            }
            C2971s.m13207j();
            Activity activity = this.f9910h;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9909g;
            zzc zzc = adOverlayInfoParcel2.f9850g;
            if (!C2940a.m13081b(activity, zzc, adOverlayInfoParcel2.f9858o, zzc.f9921o)) {
                this.f9910h.finish();
            }
        }
    }

    /* renamed from: Y */
    public final void mo10873Y(C4863a aVar) throws RemoteException {
    }

    /* renamed from: b3 */
    public final void mo10876b3(int i, int i2, Intent intent) throws RemoteException {
    }

    /* renamed from: e */
    public final void mo10878e() throws RemoteException {
    }

    /* renamed from: j */
    public final void mo10882j() throws RemoteException {
        if (this.f9910h.isFinishing()) {
            m13127a();
        }
    }

    /* renamed from: k */
    public final void mo10885k() throws RemoteException {
        C2958q qVar = this.f9909g.f9852i;
        if (qVar != null) {
            qVar.mo10902y3();
        }
        if (this.f9910h.isFinishing()) {
            m13127a();
        }
    }

    /* renamed from: l */
    public final void mo10887l() throws RemoteException {
    }

    /* renamed from: n */
    public final void mo10891n() throws RemoteException {
        C2958q qVar = this.f9909g.f9852i;
        if (qVar != null) {
            qVar.zze();
        }
    }

    /* renamed from: t */
    public final void mo10892t() throws RemoteException {
    }

    public final void zzp() throws RemoteException {
        if (this.f9911i) {
            this.f9910h.finish();
            return;
        }
        this.f9911i = true;
        C2958q qVar = this.f9909g.f9852i;
        if (qVar != null) {
            qVar.mo10899F5();
        }
    }

    public final void zzr() throws RemoteException {
    }

    public final void zzs() throws RemoteException {
        if (this.f9910h.isFinishing()) {
            m13127a();
        }
    }
}
