package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7579b;
import p159f.p243f.p245b.p318c.p319a.p320a.C7604n0;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.l */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6379l extends C7579b {

    /* renamed from: h */
    final /* synthetic */ C7643p f29552h;

    /* renamed from: i */
    final /* synthetic */ C6424u f29553i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6379l(C6424u uVar, C7643p pVar, C7643p pVar2) {
        super(pVar);
        this.f29553i = uVar;
        this.f29552h = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25173a() {
        try {
            ((C7604n0) this.f29553i.f29666e.mo28603e()).mo28596L5(this.f29553i.f29662a, C6424u.m37785g(), new C6404q(this.f29553i, this.f29552h));
        } catch (RemoteException e) {
            C6424u.f29660g.mo28576c(e, "keepAlive", new Object[0]);
        }
    }
}
