package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.C3373r;
import java.util.Objects;

/* renamed from: com.google.android.gms.common.internal.l */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3292l {
    /* renamed from: a */
    public static void m14233a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m14234b(boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m14235c(@RecentlyNonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: d */
    public static void m14236d(@RecentlyNonNull String str) {
        if (!C3373r.m14482a()) {
            throw new IllegalStateException(str);
        }
    }

    @RecentlyNonNull
    /* renamed from: e */
    public static String m14237e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @RecentlyNonNull
    /* renamed from: f */
    public static String m14238f(String str, @RecentlyNonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: g */
    public static void m14239g(@RecentlyNonNull String str) {
        if (C3373r.m14482a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: h */
    public static <T> T m14240h(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    /* renamed from: i */
    public static <T> T m14241i(@RecentlyNonNull T t, @RecentlyNonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: j */
    public static void m14242j(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k */
    public static void m14243k(boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: l */
    public static void m14244l(boolean z, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
