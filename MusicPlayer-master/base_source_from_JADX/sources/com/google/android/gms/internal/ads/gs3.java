package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gs3 {
    /* renamed from: a */
    public static <T> T m24489a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: b */
    public static <T> T m24490b(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }

    /* renamed from: c */
    public static <T> void m24491c(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
