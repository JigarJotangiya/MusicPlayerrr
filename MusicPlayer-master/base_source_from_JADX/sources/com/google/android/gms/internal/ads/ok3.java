package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ok3 {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f21025a = new nk3();

    /* renamed from: a */
    public static byte[] m28546a(int i) {
        byte[] bArr = new byte[i];
        f21025a.get().nextBytes(bArr);
        return bArr;
    }
}
