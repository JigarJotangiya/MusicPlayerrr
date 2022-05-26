package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uc2 implements sg2<rg2<Bundle>> {

    /* renamed from: a */
    private final ul2 f24295a;

    uc2(ul2 ul2) {
        this.f24295a = ul2;
    }

    /* renamed from: a */
    public final d93<rg2<Bundle>> mo15767a() {
        ul2 ul2 = this.f24295a;
        tc2 tc2 = null;
        if (!(ul2 == null || ul2.mo21312a() == null || this.f24295a.mo21312a().isEmpty())) {
            tc2 = new tc2(this);
        }
        return s83.m30607i(tc2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo21247b(Bundle bundle) {
        bundle.putString("key_schema", this.f24295a.mo21312a());
    }
}
