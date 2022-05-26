package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ha2 {

    /* renamed from: a */
    private final ma2<g41> f17589a;

    /* renamed from: b */
    private final String f17590b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5316lx f17591c;

    public ha2(ma2<g41> ma2, String str) {
        this.f17589a = ma2;
        this.f17590b = str;
    }

    /* renamed from: a */
    public final synchronized String mo18113a() {
        String str;
        str = null;
        try {
            C5316lx lxVar = this.f17591c;
            if (lxVar != null) {
                str = lxVar.zze();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public final synchronized String mo18114b() {
        String str;
        str = null;
        try {
            C5316lx lxVar = this.f17591c;
            if (lxVar != null) {
                str = lxVar.zze();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public final synchronized void mo18115d(zzbfd zzbfd, int i) throws RemoteException {
        this.f17591c = null;
        this.f17589a.mo16308a(zzbfd, this.f17590b, new na2(i), new ga2(this));
    }

    /* renamed from: e */
    public final synchronized boolean mo18116e() throws RemoteException {
        return this.f17589a.zza();
    }
}
