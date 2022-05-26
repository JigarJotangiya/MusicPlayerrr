package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7579b;
import p159f.p243f.p245b.p318c.p319a.p320a.C7604n0;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.j */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6369j extends C7579b {

    /* renamed from: h */
    final /* synthetic */ int f29509h;

    /* renamed from: i */
    final /* synthetic */ C7643p f29510i;

    /* renamed from: j */
    final /* synthetic */ C6424u f29511j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6369j(C6424u uVar, C7643p pVar, int i, C7643p pVar2) {
        super(pVar);
        this.f29511j = uVar;
        this.f29509h = i;
        this.f29510i = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25173a() {
        try {
            ((C7604n0) this.f29511j.f29665d.mo28603e()).mo28598S5(this.f29511j.f29662a, C6424u.m37786h(this.f29509h), C6424u.m37785g(), new C6419t(this.f29511j, this.f29510i));
        } catch (RemoteException e) {
            C6424u.f29660g.mo28576c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
