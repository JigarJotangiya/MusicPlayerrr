package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.C6460a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.appupdate.s */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6309s extends C6308r<Void> {
    C6309s(C6311u uVar, C7643p<Void> pVar) {
        super(uVar, new C7577a("OnCompleteUpdateCallback"), pVar);
    }

    /* renamed from: z0 */
    public final void mo25175z0(Bundle bundle) throws RemoteException {
        super.mo25175z0(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f29308h.mo28635d(new C6460a(bundle.getInt("error.code", -2)));
        } else {
            this.f29308h.mo28636e(null);
        }
    }
}
