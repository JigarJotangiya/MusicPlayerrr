package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class w10 {

    /* renamed from: a */
    private static final AtomicReference<u10> f25171a = new AtomicReference<>();

    /* renamed from: b */
    private static final AtomicReference<v10> f25172b = new AtomicReference<>();

    static {
        new AtomicBoolean();
    }

    /* renamed from: a */
    static u10 m32858a() {
        return f25171a.get();
    }

    /* renamed from: b */
    static v10 m32859b() {
        return f25172b.get();
    }

    /* renamed from: c */
    public static void m32860c(u10 u10) {
        f25171a.set(u10);
    }
}
