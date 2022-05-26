package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;
import p159f.p243f.p245b.p318c.p319a.p320a.C7579b;
import p159f.p243f.p245b.p318c.p319a.p320a.C7604n0;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.g */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6354g extends C7579b {

    /* renamed from: h */
    final /* synthetic */ Map f29455h;

    /* renamed from: i */
    final /* synthetic */ C7643p f29456i;

    /* renamed from: j */
    final /* synthetic */ C6424u f29457j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6354g(C6424u uVar, C7643p pVar, Map map, C7643p pVar2) {
        super(pVar);
        this.f29457j = uVar;
        this.f29455h = map;
        this.f29456i = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25173a() {
        try {
            ((C7604n0) this.f29457j.f29665d.mo28603e()).mo28597S1(this.f29457j.f29662a, C6424u.m37792n(this.f29455h), new C6399p(this.f29457j, this.f29456i));
        } catch (RemoteException e) {
            C6424u.f29660g.mo28576c(e, "syncPacks", new Object[0]);
            this.f29456i.mo28635d(new RuntimeException(e));
        }
    }
}
