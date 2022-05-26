package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mk3 implements qa3 {

    /* renamed from: a */
    private final yd3 f20071a;

    /* renamed from: b */
    private final int f20072b;

    public mk3(yd3 yd3, int i) throws GeneralSecurityException {
        this.f20071a = yd3;
        this.f20072b = i;
        if (i >= 10) {
            yd3.mo18646a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo19410a(byte[] bArr) throws GeneralSecurityException {
        return this.f20071a.mo18646a(bArr, this.f20072b);
    }
}
