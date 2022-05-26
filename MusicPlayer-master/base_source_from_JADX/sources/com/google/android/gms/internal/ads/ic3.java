package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ic3 implements x93 {

    /* renamed from: c */
    private static final byte[] f17951c = new byte[0];

    /* renamed from: a */
    private final rh3 f17952a;

    /* renamed from: b */
    private final x93 f17953b;

    public ic3(rh3 rh3, x93 x93) {
        this.f17952a = rh3;
        this.f17953b = x93;
    }

    /* renamed from: a */
    public final byte[] mo17953a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] e = fb3.m23601d(this.f17952a).mo21561e();
        byte[] a = this.f17953b.mo17953a(e, f17951c);
        byte[] a2 = ((x93) fb3.m23605h(this.f17952a.mo20662H(), e, x93.class)).mo17953a(bArr, bArr2);
        int length = a.length;
        return ByteBuffer.allocate(length + 4 + a2.length).putInt(length).put(a).put(a2).array();
    }
}
