package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bb3 implements db3 {

    /* renamed from: a */
    final /* synthetic */ ya3 f14389a;

    /* renamed from: b */
    final /* synthetic */ ma3 f14390b;

    bb3(ya3 ya3, ma3 ma3) {
        this.f14389a = ya3;
        this.f14390b = ma3;
    }

    /* renamed from: a */
    public final ea3<?> mo15743a() {
        ya3 ya3 = this.f14389a;
        return new xa3(ya3, this.f14390b, ya3.mo19366c());
    }

    /* renamed from: b */
    public final Class<?> mo15744b() {
        return this.f14389a.getClass();
    }

    /* renamed from: c */
    public final <Q> ea3<Q> mo15745c(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new xa3(this.f14389a, this.f14390b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: f */
    public final Class<?> mo15746f() {
        return this.f14390b.getClass();
    }

    public final Set<Class<?>> zze() {
        return this.f14389a.mo19369g();
    }
}
