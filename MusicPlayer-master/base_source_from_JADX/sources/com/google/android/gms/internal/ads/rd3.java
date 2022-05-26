package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rd3 extends la3<qa3, eh3> {
    rd3(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo15750b(Object obj) throws GeneralSecurityException {
        eh3 eh3 = (eh3) obj;
        int I = eh3.mo17191I().mo19171I();
        SecretKeySpec secretKeySpec = new SecretKeySpec(eh3.mo17192J().zzE(), "HMAC");
        int D = eh3.mo17191I().mo19170D();
        int i = I - 2;
        if (i == 1) {
            return new mk3(new lk3("HMACSHA1", secretKeySpec), D);
        }
        if (i == 2) {
            return new mk3(new lk3("HMACSHA384", secretKeySpec), D);
        }
        if (i == 3) {
            return new mk3(new lk3("HMACSHA256", secretKeySpec), D);
        }
        if (i == 4) {
            return new mk3(new lk3("HMACSHA512", secretKeySpec), D);
        }
        if (i == 5) {
            return new mk3(new lk3("HMACSHA224", secretKeySpec), D);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
