package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nd3 {

    /* renamed from: a */
    private final x93 f20599a;

    /* renamed from: b */
    private final aa3 f20600b;

    public nd3(aa3 aa3) {
        this.f20599a = null;
        this.f20600b = aa3;
    }

    public nd3(x93 x93) {
        this.f20599a = x93;
        this.f20600b = null;
    }

    /* renamed from: a */
    public final byte[] mo19711a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        x93 x93 = this.f20599a;
        if (x93 != null) {
            return x93.mo17953a(bArr, bArr2);
        }
        return this.f20600b.mo15730a(bArr, bArr2);
    }
}
