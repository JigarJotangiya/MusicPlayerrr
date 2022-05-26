package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ra3 {
    @Deprecated
    /* renamed from: a */
    public static final na3 m30023a(byte[] bArr) throws GeneralSecurityException {
        try {
            zh3 G = zh3.m34618G(bArr, cm3.m21985a());
            for (yh3 next : G.mo22369H()) {
                if (next.mo22198E().mo20000K() == 2 || next.mo22198E().mo20000K() == 3 || next.mo22198E().mo20000K() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return na3.m27786a(G);
        } catch (bn3 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
