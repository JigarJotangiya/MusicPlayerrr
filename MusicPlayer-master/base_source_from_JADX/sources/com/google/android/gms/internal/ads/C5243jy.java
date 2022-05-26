package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5243jy extends C5536rv {

    /* renamed from: g */
    final /* synthetic */ C5280ky f18676g;

    /* synthetic */ C5243jy(C5280ky kyVar, C5206iy iyVar) {
        this.f18676g = kyVar;
    }

    /* renamed from: Y0 */
    public final void mo15716Y0(zzbfd zzbfd, int i) throws RemoteException {
        ul0.m31859d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        nl0.f20646b.post(new C5169hy(this));
    }

    /* renamed from: c */
    public final String mo15717c() throws RemoteException {
        return null;
    }

    /* renamed from: g */
    public final boolean mo15718g() throws RemoteException {
        return false;
    }

    /* renamed from: r4 */
    public final void mo15719r4(zzbfd zzbfd) throws RemoteException {
        mo15716Y0(zzbfd, 1);
    }

    public final String zze() throws RemoteException {
        return null;
    }
}
