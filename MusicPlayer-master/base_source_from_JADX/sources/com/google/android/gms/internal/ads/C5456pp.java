package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.pp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C5456pp implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C5567sp f21447g;

    /* renamed from: h */
    public final /* synthetic */ C5271kp f21448h;

    /* renamed from: i */
    public final /* synthetic */ zzbak f21449i;

    /* renamed from: j */
    public final /* synthetic */ mm0 f21450j;

    public /* synthetic */ C5456pp(C5567sp spVar, C5271kp kpVar, zzbak zzbak, mm0 mm0) {
        this.f21447g = spVar;
        this.f21448h = kpVar;
        this.f21449i = zzbak;
        this.f21450j = mm0;
    }

    public final void run() {
        zzbah zzbah;
        C5567sp spVar = this.f21447g;
        C5271kp kpVar = this.f21448h;
        zzbak zzbak = this.f21449i;
        mm0 mm0 = this.f21450j;
        try {
            C5345mp j0 = kpVar.mo18955j0();
            if (kpVar.mo18954i0()) {
                zzbah = j0.mo19484o5(zzbak);
            } else {
                zzbah = j0.mo19485y3(zzbak);
            }
            if (!zzbah.mo22528v0()) {
                mm0.mo19451e(new RuntimeException("No entry contents."));
                C5641up.m31946e(spVar.f23572c);
                return;
            }
            C5530rp rpVar = new C5530rp(spVar, zzbah.mo22526n0(), 1);
            int read = rpVar.read();
            if (read != -1) {
                rpVar.unread(read);
                mm0.mo19449c(C5715wp.m33250b(rpVar, zzbah.mo22527o0(), zzbah.mo22523A0(), zzbah.mo22524Y(), zzbah.mo22530z0()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            ul0.m31860e("Unable to obtain a cache service instance.", e);
            mm0.mo19451e(e);
            C5641up.m31946e(spVar.f23572c);
        }
    }
}
