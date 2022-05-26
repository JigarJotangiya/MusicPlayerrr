package com.bumptech.glide.p050r;

import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.p051s.C2193j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.r.d */
/* compiled from: ObjectKey */
public final class C2178d implements C1786g {

    /* renamed from: b */
    private final Object f7414b;

    public C2178d(Object obj) {
        C2193j.m10269d(obj);
        this.f7414b = obj;
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        messageDigest.update(this.f7414b.toString().getBytes(C1786g.f6570a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2178d) {
            return this.f7414b.equals(((C2178d) obj).f7414b);
        }
        return false;
    }

    public int hashCode() {
        return this.f7414b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f7414b + '}';
    }
}
