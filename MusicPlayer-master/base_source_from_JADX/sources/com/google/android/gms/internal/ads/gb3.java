package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gb3 {
    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static ei3 m24250a(zh3 zh3) {
        bi3 D = ei3.m23007D();
        D.mo16249s(zh3.mo22368E());
        for (yh3 next : zh3.mo22369H()) {
            ci3 D2 = di3.m22529D();
            D2.mo16640s(next.mo22198E().mo19999H());
            D2.mo16642u(next.mo22200H());
            D2.mo16641t(next.mo22201I());
            D2.mo16639r(next.mo22197D());
            D.mo16248r((di3) D2.mo19761n());
        }
        return (ei3) D.mo19761n();
    }

    /* renamed from: b */
    public static void m24251b(zh3 zh3) throws GeneralSecurityException {
        int E = zh3.mo22368E();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (yh3 next : zh3.mo22369H()) {
            if (next.mo22200H() == 3) {
                if (!next.mo22199G()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.mo22197D())}));
                } else if (next.mo22201I() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.mo22197D())}));
                } else if (next.mo22200H() != 2) {
                    if (next.mo22197D() == E) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= next.mo22198E().mo20000K() == 5;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.mo22197D())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
