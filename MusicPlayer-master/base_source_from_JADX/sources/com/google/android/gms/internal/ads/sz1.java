package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sz1 implements o83<ParcelFileDescriptor> {

    /* renamed from: a */
    final /* synthetic */ mg0 f23659a;

    sz1(wz1 wz1, mg0 mg0) {
        this.f23659a = mg0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        try {
            this.f23659a.mo17045E3((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            C3018m1.m13389l("Service can't call client", e);
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        try {
            this.f23659a.mo17046b7(zzbd.m13526Y(th));
        } catch (RemoteException e) {
            C3018m1.m13389l("Service can't call client", e);
        }
    }
}
