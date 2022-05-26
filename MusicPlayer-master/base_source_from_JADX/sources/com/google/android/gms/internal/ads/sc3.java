package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sc3 {

    /* renamed from: a */
    private static final Logger f23419a = Logger.getLogger(sc3.class.getName());

    /* renamed from: b */
    private static final AtomicBoolean f23420b = new AtomicBoolean(false);

    private sc3() {
    }

    /* renamed from: a */
    static Boolean m30668a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            f23419a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m30669b() {
        return f23420b.get();
    }
}
