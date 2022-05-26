package com.bumptech.glide.p051s;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

/* renamed from: com.bumptech.glide.s.j */
/* compiled from: Preconditions */
public final class C2193j {
    /* renamed from: a */
    public static void m10266a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m10267b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m10268c(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: d */
    public static <T> T m10269d(T t) {
        m10270e(t, "Argument must not be null");
        return t;
    }

    /* renamed from: e */
    public static <T> T m10270e(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
