package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zn3;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fa3<KeyFormatProtoT extends zn3, KeyProtoT extends zn3> {

    /* renamed from: a */
    final ka3<KeyFormatProtoT, KeyProtoT> f16498a;

    fa3(ka3<KeyFormatProtoT, KeyProtoT> ka3) {
        this.f16498a = ka3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final KeyProtoT mo17515a(kl3 kl3) throws GeneralSecurityException, bn3 {
        KeyFormatProtoT a = this.f16498a.mo15753a(kl3);
        this.f16498a.mo15756e(a);
        return this.f16498a.mo15754c(a);
    }
}
