package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ek3;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yj3<T_WRAPPER extends ek3<T_ENGINE>, T_ENGINE> {

    /* renamed from: b */
    private static final Logger f26375b = Logger.getLogger(yj3.class.getName());

    /* renamed from: c */
    private static final List<Provider> f26376c;

    /* renamed from: d */
    private static final boolean f26377d;

    /* renamed from: e */
    public static final yj3<zj3, Cipher> f26378e = new yj3<>(new zj3());

    /* renamed from: f */
    public static final yj3<dk3, Mac> f26379f = new yj3<>(new dk3());

    /* renamed from: g */
    public static final yj3<ak3, KeyAgreement> f26380g = new yj3<>(new ak3());

    /* renamed from: h */
    public static final yj3<ck3, KeyPairGenerator> f26381h = new yj3<>(new ck3());

    /* renamed from: i */
    public static final yj3<bk3, KeyFactory> f26382i = new yj3<>(new bk3());

    /* renamed from: a */
    private final T_WRAPPER f26383a;

    static {
        if (sc3.m30669b()) {
            f26376c = m34141b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f26377d = false;
        } else if (pk3.m29043b()) {
            f26376c = m34141b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f26377d = true;
        } else {
            f26376c = new ArrayList();
            f26377d = true;
        }
    }

    public yj3(T_WRAPPER t_wrapper) {
        this.f26383a = t_wrapper;
    }

    /* renamed from: b */
    public static List<Provider> m34141b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f26375b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final T_ENGINE mo22204a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a : f26376c) {
            try {
                return this.f26383a.mo15841a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f26377d) {
            return this.f26383a.mo15841a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
