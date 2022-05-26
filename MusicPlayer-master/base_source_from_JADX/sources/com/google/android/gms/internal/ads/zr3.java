package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zr3<T> implements yr3, sr3 {

    /* renamed from: b */
    private static final zr3<Object> f26896b = new zr3<>((Object) null);

    /* renamed from: a */
    private final T f26897a;

    private zr3(T t) {
        this.f26897a = t;
    }

    /* renamed from: b */
    public static <T> yr3<T> m34774b(T t) {
        gs3.m24489a(t, "instance cannot be null");
        return new zr3(t);
    }

    /* renamed from: c */
    public static <T> yr3<T> m34775c(T t) {
        return t == null ? f26896b : new zr3(t);
    }

    /* renamed from: a */
    public final T mo10679a() {
        return this.f26897a;
    }
}
