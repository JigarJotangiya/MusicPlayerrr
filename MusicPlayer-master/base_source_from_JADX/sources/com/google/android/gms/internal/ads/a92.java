package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a92 extends C5536rv {

    /* renamed from: g */
    private final ha2 f13827g;

    public a92(Context context, mt0 mt0, sp2 sp2, mk1 mk1, C5314lv lvVar) {
        ja2 ja2 = new ja2(mk1, mt0.mo19509D());
        ja2.mo18574e(lvVar);
        this.f13827g = new ha2(new ta2(mt0, context, ja2, sp2), sp2.mo20929h());
    }

    /* renamed from: Y0 */
    public final synchronized void mo15716Y0(zzbfd zzbfd, int i) throws RemoteException {
        this.f13827g.mo18115d(zzbfd, i);
    }

    /* renamed from: c */
    public final synchronized String mo15717c() {
        return this.f13827g.mo18114b();
    }

    /* renamed from: g */
    public final synchronized boolean mo15718g() throws RemoteException {
        return this.f13827g.mo18116e();
    }

    /* renamed from: r4 */
    public final void mo15719r4(zzbfd zzbfd) throws RemoteException {
        this.f13827g.mo18115d(zzbfd, 1);
    }

    public final synchronized String zze() {
        return this.f13827g.mo18113a();
    }
}
