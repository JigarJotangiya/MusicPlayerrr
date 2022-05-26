package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.q */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6404q extends C6384m<Void> {

    /* renamed from: i */
    final /* synthetic */ C6424u f29607i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6404q(C6424u uVar, C7643p<Void> pVar) {
        super(uVar, pVar);
        this.f29607i = uVar;
    }

    /* renamed from: W5 */
    public final void mo25317W5(Bundle bundle, Bundle bundle2) {
        super.mo25317W5(bundle, bundle2);
        if (!this.f29607i.f29667f.compareAndSet(true, false)) {
            C6424u.f29660g.mo28578e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f29607i.mo25230c();
        }
    }
}
