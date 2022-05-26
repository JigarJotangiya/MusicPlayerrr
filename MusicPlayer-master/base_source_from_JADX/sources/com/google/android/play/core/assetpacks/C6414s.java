package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.s */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6414s extends C6384m<Void> {

    /* renamed from: i */
    final int f29625i;

    /* renamed from: j */
    final String f29626j;

    /* renamed from: k */
    final int f29627k;

    /* renamed from: l */
    final /* synthetic */ C6424u f29628l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6414s(C6424u uVar, C7643p<Void> pVar, int i, String str, int i2) {
        super(uVar, pVar);
        this.f29628l = uVar;
        this.f29625i = i;
        this.f29626j = str;
        this.f29627k = i2;
    }

    /* renamed from: l0 */
    public final void mo25322l0(Bundle bundle) {
        this.f29628l.f29665d.mo28606s(this.f29568g);
        int i = bundle.getInt("error_code");
        C6424u.f29660g.mo28575b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f29627k;
        if (i2 > 0) {
            this.f29628l.m37788j(this.f29625i, this.f29626j, i2 - 1);
        }
    }
}
