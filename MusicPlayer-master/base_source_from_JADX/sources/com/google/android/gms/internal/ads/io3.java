package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class io3 {

    /* renamed from: c */
    private static final io3 f18136c = new io3();

    /* renamed from: a */
    private final uo3 f18137a = new rn3();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, to3<?>> f18138b = new ConcurrentHashMap();

    private io3() {
    }

    /* renamed from: a */
    public static io3 m25345a() {
        return f18136c;
    }

    /* renamed from: b */
    public final <T> to3<T> mo18467b(Class<T> cls) {
        zm3.m34701f(cls, "messageType");
        to3<T> to3 = (to3) this.f18138b.get(cls);
        if (to3 == null) {
            to3 = this.f18137a.mo20722c(cls);
            zm3.m34701f(cls, "messageType");
            zm3.m34701f(to3, "schema");
            to3<T> putIfAbsent = this.f18138b.putIfAbsent(cls, to3);
            return putIfAbsent == null ? to3 : putIfAbsent;
        }
    }
}
