package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class la3<PrimitiveT, KeyT> {

    /* renamed from: a */
    private final Class<PrimitiveT> f19273a;

    public la3(Class<PrimitiveT> cls) {
        this.f19273a = cls;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Class<PrimitiveT> mo19113a() {
        return this.f19273a;
    }

    /* renamed from: b */
    public abstract PrimitiveT mo15750b(KeyT keyt) throws GeneralSecurityException;
}
