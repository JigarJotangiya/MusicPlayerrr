package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1786g;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.n.d */
/* compiled from: DataCacheKey */
final class C1857d implements C1786g {

    /* renamed from: b */
    private final C1786g f6693b;

    /* renamed from: c */
    private final C1786g f6694c;

    C1857d(C1786g gVar, C1786g gVar2) {
        this.f6693b = gVar;
        this.f6694c = gVar2;
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        this.f6693b.mo7735a(messageDigest);
        this.f6694c.mo7735a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1857d)) {
            return false;
        }
        C1857d dVar = (C1857d) obj;
        if (!this.f6693b.equals(dVar.f6693b) || !this.f6694c.equals(dVar.f6694c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f6693b.hashCode() * 31) + this.f6694c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f6693b + ", signature=" + this.f6694c + '}';
    }
}
