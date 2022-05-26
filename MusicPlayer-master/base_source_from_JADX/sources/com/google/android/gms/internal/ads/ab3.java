package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ab3 implements db3 {

    /* renamed from: a */
    final /* synthetic */ ma3 f13837a;

    ab3(ma3 ma3) {
        this.f13837a = ma3;
    }

    /* renamed from: a */
    public final ea3<?> mo15743a() {
        ma3 ma3 = this.f13837a;
        return new ga3(ma3, ma3.mo19366c());
    }

    /* renamed from: b */
    public final Class<?> mo15744b() {
        return this.f13837a.getClass();
    }

    /* renamed from: c */
    public final <Q> ea3<Q> mo15745c(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new ga3(this.f13837a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: f */
    public final Class<?> mo15746f() {
        return null;
    }

    public final Set<Class<?>> zze() {
        return this.f13837a.mo19369g();
    }
}
