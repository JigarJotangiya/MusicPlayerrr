package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cj3 extends ThreadLocal<Cipher> {
    cj3() {
    }

    /* renamed from: a */
    protected static final Cipher m21933a() {
        try {
            return yj3.f26378e.mo22204a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m21933a();
    }
}
