package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pa3 {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<oa3> f21381a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static oa3 m28955a(String str) throws GeneralSecurityException {
        Iterator<oa3> it = f21381a.iterator();
        while (it.hasNext()) {
            oa3 next = it.next();
            if (next.zza()) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
