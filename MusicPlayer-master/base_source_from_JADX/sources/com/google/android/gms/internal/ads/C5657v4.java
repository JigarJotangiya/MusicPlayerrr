package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.gms.internal.ads.v4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5657v4 extends C5694w4 {
    private final byte[] zza;

    public C5657v4(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.zza;
    }
}
