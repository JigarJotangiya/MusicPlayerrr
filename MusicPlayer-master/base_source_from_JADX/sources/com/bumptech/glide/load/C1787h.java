package com.bumptech.glide.load;

import com.bumptech.glide.p051s.C2193j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.h */
/* compiled from: Option */
public final class C1787h<T> {

    /* renamed from: e */
    private static final C1789b<Object> f6571e = new C1788a();

    /* renamed from: a */
    private final T f6572a;

    /* renamed from: b */
    private final C1789b<T> f6573b;

    /* renamed from: c */
    private final String f6574c;

    /* renamed from: d */
    private volatile byte[] f6575d;

    /* renamed from: com.bumptech.glide.load.h$a */
    /* compiled from: Option */
    class C1788a implements C1789b<Object> {
        C1788a() {
        }

        /* renamed from: a */
        public void mo7743a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.h$b */
    /* compiled from: Option */
    public interface C1789b<T> {
        /* renamed from: a */
        void mo7743a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C1787h(String str, T t, C1789b<T> bVar) {
        C2193j.m10267b(str);
        this.f6574c = str;
        this.f6572a = t;
        C2193j.m10269d(bVar);
        this.f6573b = bVar;
    }

    /* renamed from: a */
    public static <T> C1787h<T> m8818a(String str, T t, C1789b<T> bVar) {
        return new C1787h<>(str, t, bVar);
    }

    /* renamed from: b */
    private static <T> C1789b<T> m8819b() {
        return f6571e;
    }

    /* renamed from: d */
    private byte[] m8820d() {
        if (this.f6575d == null) {
            this.f6575d = this.f6574c.getBytes(C1786g.f6570a);
        }
        return this.f6575d;
    }

    /* renamed from: e */
    public static <T> C1787h<T> m8821e(String str) {
        return new C1787h<>(str, (Object) null, m8819b());
    }

    /* renamed from: f */
    public static <T> C1787h<T> m8822f(String str, T t) {
        return new C1787h<>(str, t, m8819b());
    }

    /* renamed from: c */
    public T mo7738c() {
        return this.f6572a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1787h) {
            return this.f6574c.equals(((C1787h) obj).f6574c);
        }
        return false;
    }

    /* renamed from: g */
    public void mo7740g(T t, MessageDigest messageDigest) {
        this.f6573b.mo7743a(m8820d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f6574c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f6574c + '\'' + '}';
    }
}
