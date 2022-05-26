package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hj3 extends ThreadLocal<Cipher> {
    hj3() {
    }

    /* renamed from: a */
    protected static final Cipher m24832a() {
        try {
            return yj3.f26378e.mo22204a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m24832a();
    }
}
