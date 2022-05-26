package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7579b;
import p159f.p243f.p245b.p318c.p319a.p320a.C7604n0;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.i */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6364i extends C7579b {

    /* renamed from: h */
    final /* synthetic */ int f29483h;

    /* renamed from: i */
    final /* synthetic */ String f29484i;

    /* renamed from: j */
    final /* synthetic */ C7643p f29485j;

    /* renamed from: k */
    final /* synthetic */ int f29486k;

    /* renamed from: l */
    final /* synthetic */ C6424u f29487l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6364i(C6424u uVar, C7643p pVar, int i, String str, C7643p pVar2, int i2) {
        super(pVar);
        this.f29487l = uVar;
        this.f29483h = i;
        this.f29484i = str;
        this.f29485j = pVar2;
        this.f29486k = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25173a() {
        try {
            ((C7604n0) this.f29487l.f29665d.mo28603e()).mo28599T6(this.f29487l.f29662a, C6424u.m37802x(this.f29483h, this.f29484i), C6424u.m37785g(), new C6414s(this.f29487l, this.f29485j, this.f29483h, this.f29484i, this.f29486k));
        } catch (RemoteException e) {
            C6424u.f29660g.mo28576c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
