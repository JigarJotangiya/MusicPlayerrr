package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zn3;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class ga3<PrimitiveT, KeyProtoT extends zn3> implements ea3<PrimitiveT> {

    /* renamed from: a */
    private final ma3<KeyProtoT> f17006a;

    /* renamed from: b */
    private final Class<PrimitiveT> f17007b;

    public ga3(ma3<KeyProtoT> ma3, Class<PrimitiveT> cls) {
        if (ma3.mo19369g().contains(cls) || Void.class.equals(cls)) {
            this.f17006a = ma3;
            this.f17007b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{ma3.toString(), cls.getName()}));
    }

    /* renamed from: g */
    private final fa3<?, KeyProtoT> m24221g() {
        return new fa3<>(this.f17006a.mo16216a());
    }

    /* renamed from: h */
    private final PrimitiveT m24222h(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.f17007b)) {
            this.f17006a.mo16219h(keyprotot);
            return this.f17006a.mo19368e(keyprotot, this.f17007b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: a */
    public final PrimitiveT mo17142a(zn3 zn3) throws GeneralSecurityException {
        String str;
        String valueOf = String.valueOf(this.f17006a.mo19367d().getName());
        if (valueOf.length() != 0) {
            str = "Expected proto of type ".concat(valueOf);
        } else {
            str = new String("Expected proto of type ");
        }
        if (this.f17006a.mo19367d().isInstance(zn3)) {
            return m24222h(zn3);
        }
        throw new GeneralSecurityException(str);
    }

    /* renamed from: b */
    public final Class<PrimitiveT> mo17143b() {
        return this.f17007b;
    }

    /* renamed from: c */
    public final String mo17144c() {
        return this.f17006a.mo16218f();
    }

    /* renamed from: d */
    public final PrimitiveT mo17145d(kl3 kl3) throws GeneralSecurityException {
        try {
            return m24222h(this.f17006a.mo16217b(kl3));
        } catch (bn3 e) {
            String valueOf = String.valueOf(this.f17006a.mo19367d().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* renamed from: e */
    public final zn3 mo17146e(kl3 kl3) throws GeneralSecurityException {
        try {
            return m24221g().mo17515a(kl3);
        } catch (bn3 e) {
            String valueOf = String.valueOf(this.f17006a.mo16216a().mo18876b().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* renamed from: f */
    public final oh3 mo17147f(kl3 kl3) throws GeneralSecurityException {
        try {
            zn3 a = m24221g().mo17515a(kl3);
            nh3 D = oh3.m28503D();
            D.mo19732r(this.f17006a.mo16218f());
            D.mo19733s(a.mo21560b());
            D.mo19734t(this.f17006a.mo16220j());
            return (oh3) D.mo19761n();
        } catch (bn3 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
