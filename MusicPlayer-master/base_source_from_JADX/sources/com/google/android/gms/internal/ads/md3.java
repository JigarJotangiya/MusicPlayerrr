package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class md3 implements rj3 {

    /* renamed from: a */
    private final String f20023a;

    /* renamed from: b */
    private final int f20024b;

    /* renamed from: c */
    private kf3 f20025c;

    /* renamed from: d */
    private le3 f20026d;

    /* renamed from: e */
    private int f20027e;

    /* renamed from: f */
    private wf3 f20028f;

    md3(rh3 rh3) throws GeneralSecurityException {
        String str;
        String H = rh3.mo20662H();
        this.f20023a = H;
        if (H.equals(hb3.f17607b)) {
            try {
                nf3 G = nf3.m27851G(rh3.mo20661G(), cm3.m21985a());
                this.f20025c = (kf3) fb3.m23601d(rh3);
                this.f20024b = G.mo19723D();
            } catch (bn3 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (H.equals(hb3.f17606a)) {
            try {
                oe3 F = oe3.m28465F(rh3.mo20661G(), cm3.m21985a());
                this.f20026d = (le3) fb3.m23601d(rh3);
                this.f20027e = F.mo19977G().mo21257D();
                this.f20024b = this.f20027e + F.mo19978H().mo18143D();
            } catch (bn3 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (H.equals(wc3.f25339a)) {
            try {
                zf3 G2 = zf3.m34578G(rh3.mo20661G(), cm3.m21985a());
                this.f20028f = (wf3) fb3.m23601d(rh3);
                this.f20024b = G2.mo22361D();
            } catch (bn3 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(H);
            if (valueOf.length() != 0) {
                str = "unsupported AEAD DEM key type: ".concat(valueOf);
            } else {
                str = new String("unsupported AEAD DEM key type: ");
            }
            throw new GeneralSecurityException(str);
        }
    }

    /* renamed from: a */
    public final nd3 mo19374a(byte[] bArr) throws GeneralSecurityException {
        Class<x93> cls = x93.class;
        if (bArr.length != this.f20024b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f20023a.equals(hb3.f17607b)) {
            if3 E = kf3.m26209E();
            E.mo19759l(this.f20025c);
            E.mo18327r(kl3.zzw(bArr, 0, this.f20024b));
            return new nd3((x93) fb3.m23604g(this.f20023a, (kf3) E.mo19761n(), cls));
        } else if (this.f20023a.equals(hb3.f17606a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f20027e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f20027e, this.f20024b);
            qe3 E2 = re3.m30095E();
            E2.mo19759l(this.f20026d.mo19160H());
            E2.mo20436r(kl3.zzv(copyOfRange));
            dh3 E3 = eh3.m22990E();
            E3.mo19759l(this.f20026d.mo19161I());
            E3.mo16932r(kl3.zzv(copyOfRange2));
            ke3 E4 = le3.m26709E();
            E4.mo18882t(this.f20026d.mo19159D());
            E4.mo18880r((re3) E2.mo19761n());
            E4.mo18881s((eh3) E3.mo19761n());
            return new nd3((x93) fb3.m23604g(this.f20023a, (le3) E4.mo19761n(), cls));
        } else if (this.f20023a.equals(wc3.f25339a)) {
            vf3 E5 = wf3.m33124E();
            E5.mo19759l(this.f20028f);
            E5.mo21493r(kl3.zzw(bArr, 0, this.f20024b));
            return new nd3((aa3) fb3.m23604g(this.f20023a, (wf3) E5.mo19761n(), aa3.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }

    public final int zza() {
        return this.f20024b;
    }
}
