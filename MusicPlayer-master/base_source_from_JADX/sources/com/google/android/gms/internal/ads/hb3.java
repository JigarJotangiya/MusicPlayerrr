package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hb3 {

    /* renamed from: a */
    public static final String f17606a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f17607b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated

    /* renamed from: c */
    public static final vi3 f17608c = vi3.m32391E();

    static {
        new nb3();
        new wb3();
        new zb3();
        new tb3();
        new hc3();
        new lc3();
        new cc3();
        new oc3();
        try {
            m24758a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m24758a() throws GeneralSecurityException {
        fb3.m23611n(new kb3());
        ud3.m31780a();
        fb3.m23610m(new nb3(), true);
        fb3.m23610m(new wb3(), true);
        if (!sc3.m30669b()) {
            fb3.m23610m(new tb3(), true);
            zb3.m34510k(true);
            fb3.m23610m(new cc3(), true);
            fb3.m23610m(new hc3(), true);
            fb3.m23610m(new lc3(), true);
            fb3.m23610m(new oc3(), true);
        }
    }
}
