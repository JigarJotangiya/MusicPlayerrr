package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ls3<T> implements ms3<T> {

    /* renamed from: c */
    private static final Object f19519c = new Object();

    /* renamed from: a */
    private volatile ms3<T> f19520a;

    /* renamed from: b */
    private volatile Object f19521b = f19519c;

    private ls3(ms3<T> ms3) {
        this.f19520a = ms3;
    }

    /* renamed from: b */
    public static <P extends ms3<T>, T> ms3<T> m26931b(P p) {
        if ((p instanceof ls3) || (p instanceof xr3)) {
            return p;
        }
        Objects.requireNonNull(p);
        return new ls3(p);
    }

    /* renamed from: a */
    public final T mo10679a() {
        T t = this.f19521b;
        if (t != f19519c) {
            return t;
        }
        ms3<T> ms3 = this.f19520a;
        if (ms3 == null) {
            return this.f19521b;
        }
        T a = ms3.mo10679a();
        this.f19521b = a;
        this.f19520a = null;
        return a;
    }
}
