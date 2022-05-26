package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xj3 implements x93 {

    /* renamed from: a */
    private final gk3 f25860a;

    /* renamed from: b */
    private final qa3 f25861b;

    public xj3(gk3 gk3, qa3 qa3, int i) {
        this.f25860a = gk3;
        this.f25861b = qa3;
    }

    /* renamed from: a */
    public final byte[] mo17953a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.f25860a.mo16940a(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
        return mj3.m27285b(a, this.f25861b.mo19410a(mj3.m27285b(bArr2, a, copyOf)));
    }
}
