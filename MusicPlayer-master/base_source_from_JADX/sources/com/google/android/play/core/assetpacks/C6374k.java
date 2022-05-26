package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7579b;
import p159f.p243f.p245b.p318c.p319a.p320a.C7604n0;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.k */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6374k extends C7579b {

    /* renamed from: h */
    final /* synthetic */ int f29532h;

    /* renamed from: i */
    final /* synthetic */ String f29533i;

    /* renamed from: j */
    final /* synthetic */ String f29534j;

    /* renamed from: k */
    final /* synthetic */ int f29535k;

    /* renamed from: l */
    final /* synthetic */ C7643p f29536l;

    /* renamed from: m */
    final /* synthetic */ C6424u f29537m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6374k(C6424u uVar, C7643p pVar, int i, String str, String str2, int i2, C7643p pVar2) {
        super(pVar);
        this.f29537m = uVar;
        this.f29532h = i;
        this.f29533i = str;
        this.f29534j = str2;
        this.f29535k = i2;
        this.f29536l = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25173a() {
        try {
            ((C7604n0) this.f29537m.f29665d.mo28603e()).mo28600n3(this.f29537m.f29662a, C6424u.m37789k(this.f29532h, this.f29533i, this.f29534j, this.f29535k), C6424u.m37785g(), new C6394o(this.f29537m, this.f29536l));
        } catch (RemoteException e) {
            C6424u.f29660g.mo28575b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f29533i, this.f29534j, Integer.valueOf(this.f29535k), Integer.valueOf(this.f29532h));
            this.f29536l.mo28635d(new RuntimeException(e));
        }
    }
}
