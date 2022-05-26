package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7596j0;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.appupdate.r */
/* compiled from: com.google.android.play:core@@1.10.2 */
class C6308r<T> extends C7596j0 {

    /* renamed from: g */
    final C7577a f29307g;

    /* renamed from: h */
    final C7643p<T> f29308h;

    /* renamed from: i */
    final /* synthetic */ C6311u f29309i;

    C6308r(C6311u uVar, C7577a aVar, C7643p<T> pVar) {
        this.f29309i = uVar;
        this.f29307g = aVar;
        this.f29308h = pVar;
    }

    /* renamed from: r0 */
    public void mo25174r0(Bundle bundle) throws RemoteException {
        this.f29309i.f29314a.mo28606s(this.f29308h);
        this.f29307g.mo28577d("onRequestInfo", new Object[0]);
    }

    /* renamed from: z0 */
    public void mo25175z0(Bundle bundle) throws RemoteException {
        this.f29309i.f29314a.mo28606s(this.f29308h);
        this.f29307g.mo28577d("onCompleteUpdate", new Object[0]);
    }
}
