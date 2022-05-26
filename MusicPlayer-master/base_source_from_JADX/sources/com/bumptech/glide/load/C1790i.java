package com.bumptech.glide.load;

import com.bumptech.glide.p051s.C2182b;
import java.security.MessageDigest;
import p082e.p098e.C3465a;

/* renamed from: com.bumptech.glide.load.i */
/* compiled from: Options */
public final class C1790i implements C1786g {

    /* renamed from: b */
    private final C3465a<C1787h<?>, Object> f6576b = new C2182b();

    /* renamed from: f */
    private static <T> void m8827f(C1787h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.mo7740g(obj, messageDigest);
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f6576b.size(); i++) {
            m8827f(this.f6576b.mo12395i(i), this.f6576b.mo12397m(i), messageDigest);
        }
    }

    /* renamed from: c */
    public <T> T mo7744c(C1787h<T> hVar) {
        return this.f6576b.containsKey(hVar) ? this.f6576b.get(hVar) : hVar.mo7738c();
    }

    /* renamed from: d */
    public void mo7745d(C1790i iVar) {
        this.f6576b.mo8471j(iVar.f6576b);
    }

    /* renamed from: e */
    public <T> C1790i mo7746e(C1787h<T> hVar, T t) {
        this.f6576b.put(hVar, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1790i) {
            return this.f6576b.equals(((C1790i) obj).f6576b);
        }
        return false;
    }

    public int hashCode() {
        return this.f6576b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f6576b + '}';
    }
}
