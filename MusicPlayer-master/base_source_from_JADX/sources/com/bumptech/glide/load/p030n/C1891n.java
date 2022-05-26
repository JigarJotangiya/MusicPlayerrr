package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.p051s.C2193j;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.n */
/* compiled from: EngineKey */
class C1891n implements C1786g {

    /* renamed from: b */
    private final Object f6828b;

    /* renamed from: c */
    private final int f6829c;

    /* renamed from: d */
    private final int f6830d;

    /* renamed from: e */
    private final Class<?> f6831e;

    /* renamed from: f */
    private final Class<?> f6832f;

    /* renamed from: g */
    private final C1786g f6833g;

    /* renamed from: h */
    private final Map<Class<?>, C1794m<?>> f6834h;

    /* renamed from: i */
    private final C1790i f6835i;

    /* renamed from: j */
    private int f6836j;

    C1891n(Object obj, C1786g gVar, int i, int i2, Map<Class<?>, C1794m<?>> map, Class<?> cls, Class<?> cls2, C1790i iVar) {
        C2193j.m10269d(obj);
        this.f6828b = obj;
        C2193j.m10270e(gVar, "Signature must not be null");
        this.f6833g = gVar;
        this.f6829c = i;
        this.f6830d = i2;
        C2193j.m10269d(map);
        this.f6834h = map;
        C2193j.m10270e(cls, "Resource class must not be null");
        this.f6831e = cls;
        C2193j.m10270e(cls2, "Transcode class must not be null");
        this.f6832f = cls2;
        C2193j.m10269d(iVar);
        this.f6835i = iVar;
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1891n)) {
            return false;
        }
        C1891n nVar = (C1891n) obj;
        if (!this.f6828b.equals(nVar.f6828b) || !this.f6833g.equals(nVar.f6833g) || this.f6830d != nVar.f6830d || this.f6829c != nVar.f6829c || !this.f6834h.equals(nVar.f6834h) || !this.f6831e.equals(nVar.f6831e) || !this.f6832f.equals(nVar.f6832f) || !this.f6835i.equals(nVar.f6835i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f6836j == 0) {
            int hashCode = this.f6828b.hashCode();
            this.f6836j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f6833g.hashCode();
            this.f6836j = hashCode2;
            int i = (hashCode2 * 31) + this.f6829c;
            this.f6836j = i;
            int i2 = (i * 31) + this.f6830d;
            this.f6836j = i2;
            int hashCode3 = (i2 * 31) + this.f6834h.hashCode();
            this.f6836j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f6831e.hashCode();
            this.f6836j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f6832f.hashCode();
            this.f6836j = hashCode5;
            this.f6836j = (hashCode5 * 31) + this.f6835i.hashCode();
        }
        return this.f6836j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f6828b + ", width=" + this.f6829c + ", height=" + this.f6830d + ", resourceClass=" + this.f6831e + ", transcodeClass=" + this.f6832f + ", signature=" + this.f6833g + ", hashCode=" + this.f6836j + ", transformations=" + this.f6834h + ", options=" + this.f6835i + '}';
    }
}
