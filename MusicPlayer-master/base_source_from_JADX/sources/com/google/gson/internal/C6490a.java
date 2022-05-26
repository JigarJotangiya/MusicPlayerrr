package com.google.gson.internal;

import java.util.Objects;

/* renamed from: com.google.gson.internal.a */
/* compiled from: $Gson$Preconditions */
public final class C6490a {
    /* renamed from: a */
    public static void m37866a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static <T> T m37867b(T t) {
        Objects.requireNonNull(t);
        return t;
    }
}
