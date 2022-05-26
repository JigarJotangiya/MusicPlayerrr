package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7579b;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.appupdate.q */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6307q extends C7579b {

    /* renamed from: h */
    final /* synthetic */ C7643p f29304h;

    /* renamed from: i */
    final /* synthetic */ String f29305i;

    /* renamed from: j */
    final /* synthetic */ C6311u f29306j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6307q(C6311u uVar, C7643p pVar, C7643p pVar2, String str) {
        super(pVar);
        this.f29306j = uVar;
        this.f29304h = pVar2;
        this.f29305i = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25173a() {
        try {
            this.f29306j.f29314a.mo28603e().mo28592f6(this.f29306j.f29315b, C6311u.m37531i(), new C6309s(this.f29306j, this.f29304h));
        } catch (RemoteException e) {
            C6311u.f29312e.mo28576c(e, "completeUpdate(%s)", this.f29305i);
            this.f29304h.mo28635d(new RuntimeException(e));
        }
    }
}
