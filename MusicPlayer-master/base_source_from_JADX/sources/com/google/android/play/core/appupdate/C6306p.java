package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import p159f.p243f.p245b.p318c.p319a.p320a.C7579b;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.appupdate.p */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6306p extends C7579b {

    /* renamed from: h */
    final /* synthetic */ String f29301h;

    /* renamed from: i */
    final /* synthetic */ C7643p f29302i;

    /* renamed from: j */
    final /* synthetic */ C6311u f29303j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6306p(C6311u uVar, C7643p pVar, String str, C7643p pVar2) {
        super(pVar);
        this.f29303j = uVar;
        this.f29301h = str;
        this.f29302i = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25173a() {
        try {
            this.f29303j.f29314a.mo28603e().mo28591L3(this.f29303j.f29315b, C6311u.m37526b(this.f29303j, this.f29301h), new C6310t(this.f29303j, this.f29302i, this.f29301h));
        } catch (RemoteException e) {
            C6311u.f29312e.mo28576c(e, "requestUpdateInfo(%s)", this.f29301h);
            this.f29302i.mo28635d(new RuntimeException(e));
        }
    }
}
