package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ak3 implements ek3<KeyAgreement> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15841a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
