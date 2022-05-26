package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.C6460a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.appupdate.t */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6310t extends C6308r<C6286a> {

    /* renamed from: j */
    private final String f29310j;

    /* renamed from: k */
    final /* synthetic */ C6311u f29311k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6310t(C6311u uVar, C7643p<C6286a> pVar, String str) {
        super(uVar, new C7577a("OnRequestInstallCallback"), pVar);
        this.f29311k = uVar;
        this.f29310j = str;
    }

    /* renamed from: r0 */
    public final void mo25174r0(Bundle bundle) throws RemoteException {
        super.mo25174r0(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f29308h.mo28635d(new C6460a(bundle.getInt("error.code", -2)));
        } else {
            this.f29308h.mo28636e(C6311u.m37528d(this.f29311k, bundle, this.f29310j));
        }
    }
}
