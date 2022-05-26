package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7579b;
import p159f.p243f.p245b.p318c.p319a.p320a.C7604n0;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.h */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6359h extends C7579b {

    /* renamed from: h */
    final /* synthetic */ int f29465h;

    /* renamed from: i */
    final /* synthetic */ String f29466i;

    /* renamed from: j */
    final /* synthetic */ String f29467j;

    /* renamed from: k */
    final /* synthetic */ int f29468k;

    /* renamed from: l */
    final /* synthetic */ C7643p f29469l;

    /* renamed from: m */
    final /* synthetic */ C6424u f29470m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6359h(C6424u uVar, C7643p pVar, int i, String str, String str2, int i2, C7643p pVar2) {
        super(pVar);
        this.f29470m = uVar;
        this.f29465h = i;
        this.f29466i = str;
        this.f29467j = str2;
        this.f29468k = i2;
        this.f29469l = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25173a() {
        try {
            ((C7604n0) this.f29470m.f29665d.mo28603e()).mo28601n4(this.f29470m.f29662a, C6424u.m37789k(this.f29465h, this.f29466i, this.f29467j, this.f29468k), C6424u.m37785g(), new C6409r(this.f29470m, this.f29469l));
        } catch (RemoteException e) {
            C6424u.f29660g.mo28576c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
