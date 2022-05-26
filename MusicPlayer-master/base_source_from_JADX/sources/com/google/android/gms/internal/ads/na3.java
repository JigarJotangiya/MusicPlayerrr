package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class na3 {

    /* renamed from: a */
    private final zh3 f20572a;

    private na3(zh3 zh3) {
        this.f20572a = zh3;
    }

    /* renamed from: a */
    static final na3 m27786a(zh3 zh3) throws GeneralSecurityException {
        if (zh3 != null && zh3.mo22367D() > 0) {
            return new na3(zh3);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: b */
    public final <P> P mo19666b(Class<P> cls) throws GeneralSecurityException {
        String str;
        Class<?> e = fb3.m23602e(cls);
        if (e == null) {
            String valueOf = String.valueOf(cls.getName());
            if (valueOf.length() != 0) {
                str = "No wrapper found for ".concat(valueOf);
            } else {
                str = new String("No wrapper found for ");
            }
            throw new GeneralSecurityException(str);
        }
        gb3.m24251b(this.f20572a);
        va3<P> c = va3.m32253c(e);
        for (yh3 next : this.f20572a.mo22369H()) {
            if (next.mo22200H() == 3) {
                sa3<P> a = c.mo21454a(fb3.m23603f(next.mo22198E(), e), next);
                if (next.mo22197D() == this.f20572a.mo22368E()) {
                    c.mo21457e(a);
                }
            }
        }
        return fb3.m23606i(c, cls);
    }

    public final String toString() {
        return gb3.m24250a(this.f20572a).toString();
    }
}
