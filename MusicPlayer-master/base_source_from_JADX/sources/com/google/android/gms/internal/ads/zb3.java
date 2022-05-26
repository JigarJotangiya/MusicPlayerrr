package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zb3 extends ma3<qf3> {
    zb3() {
        super(qf3.class, new xb3(x93.class));
    }

    /* renamed from: k */
    public static void m34510k(boolean z) throws GeneralSecurityException {
        if (m34512m()) {
            fb3.m23610m(new zb3(), true);
        }
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ ja3 m34511l(int i, int i2) {
        sf3 E = tf3.m31239E();
        E.mo20841r(i);
        return new ja3((tf3) E.mo19761n(), i2);
    }

    /* renamed from: m */
    private static boolean m34512m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final ka3<tf3, qf3> mo16216a() {
        return new yb3(this, tf3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zn3 mo16217b(kl3 kl3) throws bn3 {
        return qf3.m29507G(kl3, cm3.m21985a());
    }

    /* renamed from: f */
    public final String mo16218f() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo16219h(zn3 zn3) throws GeneralSecurityException {
        qf3 qf3 = (qf3) zn3;
        qk3.m29555b(qf3.mo20442D(), 0);
        qk3.m29554a(qf3.mo20443H().zzd());
    }

    /* renamed from: j */
    public final int mo16220j() {
        return 3;
    }
}
