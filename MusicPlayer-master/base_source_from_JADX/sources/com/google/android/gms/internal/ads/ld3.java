package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ld3 {
    /* renamed from: a */
    public static void m26660a(qg3 qg3) throws GeneralSecurityException {
        wj3.m33191e(m26662c(qg3.mo20446H().mo22365I()));
        m26661b(qg3.mo20446H().mo22366J());
        if (qg3.mo20447K() != 2) {
            fb3.m23600c(qg3.mo20445D().mo18888G());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m26661b(int i) throws NoSuchAlgorithmException {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(bh3.m21333a(i))));
    }

    /* renamed from: c */
    public static int m26662c(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(ah3.m20727a(i))));
    }

    /* renamed from: d */
    public static int m26663d(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(gg3.m24326a(i))));
            }
        }
        return i3;
    }
}
