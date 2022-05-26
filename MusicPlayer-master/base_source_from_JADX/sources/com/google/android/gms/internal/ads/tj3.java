package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tj3 implements ca3 {

    /* renamed from: f */
    private static final byte[] f23903f = new byte[0];

    /* renamed from: a */
    private final vj3 f23904a;

    /* renamed from: b */
    private final String f23905b;

    /* renamed from: c */
    private final byte[] f23906c;

    /* renamed from: d */
    private final rj3 f23907d;

    /* renamed from: e */
    private final int f23908e;

    public tj3(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, rj3 rj3) throws GeneralSecurityException {
        wj3.m33189c(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f23904a = new vj3(eCPublicKey);
        this.f23906c = bArr;
        this.f23905b = str;
        this.f23908e = i;
        this.f23907d = rj3;
    }

    /* renamed from: a */
    public final byte[] mo16579a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        uj3 a = this.f23904a.mo21558a(this.f23905b, this.f23906c, bArr2, this.f23907d.zza(), this.f23908e);
        byte[] a2 = this.f23907d.mo19374a(a.mo21279b()).mo19711a(bArr, f23903f);
        byte[] a3 = a.mo21278a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
