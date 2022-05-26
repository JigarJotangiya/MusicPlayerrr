package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wd3 implements qa3 {

    /* renamed from: a */
    private final va3<qa3> f25368a;

    /* renamed from: b */
    private final byte[] f25369b = {0};

    /* synthetic */ wd3(va3 va3, vd3 vd3) {
        this.f25368a = va3;
    }

    /* renamed from: a */
    public final byte[] mo19410a(byte[] bArr) throws GeneralSecurityException {
        if (this.f25368a.mo21455b().mo20816d() == 4) {
            return mj3.m27285b(this.f25368a.mo21455b().mo20814b(), this.f25368a.mo21455b().mo20813a().mo19410a(mj3.m27285b(bArr, this.f25369b)));
        }
        return mj3.m27285b(this.f25368a.mo21455b().mo20814b(), this.f25368a.mo21455b().mo20813a().mo19410a(bArr));
    }
}
