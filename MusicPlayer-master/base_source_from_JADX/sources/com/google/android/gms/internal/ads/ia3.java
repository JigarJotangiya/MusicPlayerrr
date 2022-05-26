package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ia3 {
    /* renamed from: a */
    public static ha3 m25124a(String str) throws GeneralSecurityException {
        String str2;
        if (fb3.m23607j().containsKey(str)) {
            return fb3.m23607j().get(str);
        }
        if (str.length() != 0) {
            str2 = "cannot find key template: ".concat(str);
        } else {
            str2 = new String("cannot find key template: ");
        }
        throw new GeneralSecurityException(str2);
    }
}
