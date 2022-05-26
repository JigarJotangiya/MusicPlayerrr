package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.q0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3308q0 extends C3284i0 {

    /* renamed from: g */
    private C3261d f10658g;

    /* renamed from: h */
    private final int f10659h;

    public C3308q0(C3261d dVar, int i) {
        this.f10658g = dVar;
        this.f10659h = i;
    }

    /* renamed from: D4 */
    public final void mo11850D4(int i, IBinder iBinder, zzi zzi) {
        C3261d dVar = this.f10658g;
        C3292l.m14241i(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C3292l.m14240h(zzi);
        C3261d.m14126g0(dVar, zzi);
        mo11852z3(i, iBinder, zzi.f10693g);
    }

    /* renamed from: g0 */
    public final void mo11851g0(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    /* renamed from: z3 */
    public final void mo11852z3(int i, IBinder iBinder, Bundle bundle) {
        C3292l.m14241i(this.f10658g, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f10658g.mo11782M(i, iBinder, bundle, this.f10659h);
        this.f10658g = null;
    }
}
