package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.List;
import p159f.p243f.p245b.p318c.p319a.p320a.C7579b;
import p159f.p243f.p245b.p318c.p319a.p320a.C7604n0;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.f */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6348f extends C7579b {

    /* renamed from: h */
    final /* synthetic */ List f29440h;

    /* renamed from: i */
    final /* synthetic */ C7643p f29441i;

    /* renamed from: j */
    final /* synthetic */ C6424u f29442j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6348f(C6424u uVar, C7643p pVar, List list, C7643p pVar2) {
        super(pVar);
        this.f29442j = uVar;
        this.f29440h = list;
        this.f29441i = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25173a() {
        try {
            ((C7604n0) this.f29442j.f29665d.mo28603e()).mo28595K3(this.f29442j.f29662a, C6424u.m37798t(this.f29440h), C6424u.m37785g(), new C6389n(this.f29442j, this.f29441i));
        } catch (RemoteException e) {
            C6424u.f29660g.mo28576c(e, "cancelDownloads(%s)", this.f29440h);
        }
    }
}
