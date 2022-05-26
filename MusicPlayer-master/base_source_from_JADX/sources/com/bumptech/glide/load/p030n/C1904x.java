package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.p051s.C2189g;
import com.bumptech.glide.p051s.C2194k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.n.x */
/* compiled from: ResourceCacheKey */
final class C1904x implements C1786g {

    /* renamed from: j */
    private static final C2189g<Class<?>, byte[]> f6867j = new C2189g<>(50);

    /* renamed from: b */
    private final C1802b f6868b;

    /* renamed from: c */
    private final C1786g f6869c;

    /* renamed from: d */
    private final C1786g f6870d;

    /* renamed from: e */
    private final int f6871e;

    /* renamed from: f */
    private final int f6872f;

    /* renamed from: g */
    private final Class<?> f6873g;

    /* renamed from: h */
    private final C1790i f6874h;

    /* renamed from: i */
    private final C1794m<?> f6875i;

    C1904x(C1802b bVar, C1786g gVar, C1786g gVar2, int i, int i2, C1794m<?> mVar, Class<?> cls, C1790i iVar) {
        this.f6868b = bVar;
        this.f6869c = gVar;
        this.f6870d = gVar2;
        this.f6871e = i;
        this.f6872f = i2;
        this.f6875i = mVar;
        this.f6873g = cls;
        this.f6874h = iVar;
    }

    /* renamed from: c */
    private byte[] m9206c() {
        C2189g<Class<?>, byte[]> gVar = f6867j;
        byte[] g = gVar.mo8494g(this.f6873g);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f6873g.getName().getBytes(C1786g.f6570a);
        gVar.mo8496k(this.f6873g, bytes);
        return bytes;
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f6868b.mo7769c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f6871e).putInt(this.f6872f).array();
        this.f6870d.mo7735a(messageDigest);
        this.f6869c.mo7735a(messageDigest);
        messageDigest.update(bArr);
        C1794m<?> mVar = this.f6875i;
        if (mVar != null) {
            mVar.mo7735a(messageDigest);
        }
        this.f6874h.mo7735a(messageDigest);
        messageDigest.update(m9206c());
        this.f6868b.mo7770d(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1904x)) {
            return false;
        }
        C1904x xVar = (C1904x) obj;
        if (this.f6872f != xVar.f6872f || this.f6871e != xVar.f6871e || !C2194k.m10274d(this.f6875i, xVar.f6875i) || !this.f6873g.equals(xVar.f6873g) || !this.f6869c.equals(xVar.f6869c) || !this.f6870d.equals(xVar.f6870d) || !this.f6874h.equals(xVar.f6874h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f6869c.hashCode() * 31) + this.f6870d.hashCode()) * 31) + this.f6871e) * 31) + this.f6872f;
        C1794m<?> mVar = this.f6875i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f6873g.hashCode()) * 31) + this.f6874h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f6869c + ", signature=" + this.f6870d + ", width=" + this.f6871e + ", height=" + this.f6872f + ", decodedResourceClass=" + this.f6873g + ", transformation='" + this.f6875i + '\'' + ", options=" + this.f6874h + '}';
    }
}
