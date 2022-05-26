package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class za3 implements db3 {

    /* renamed from: a */
    final /* synthetic */ ea3 f26719a;

    za3(ea3 ea3) {
        this.f26719a = ea3;
    }

    /* renamed from: a */
    public final ea3<?> mo15743a() {
        return this.f26719a;
    }

    /* renamed from: b */
    public final Class<?> mo15744b() {
        return this.f26719a.getClass();
    }

    /* renamed from: c */
    public final <Q> ea3<Q> mo15745c(Class<Q> cls) throws GeneralSecurityException {
        if (this.f26719a.mo17143b().equals(cls)) {
            return this.f26719a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    /* renamed from: f */
    public final Class<?> mo15746f() {
        return null;
    }

    public final Set<Class<?>> zze() {
        return Collections.singleton(this.f26719a.mo17143b());
    }
}
