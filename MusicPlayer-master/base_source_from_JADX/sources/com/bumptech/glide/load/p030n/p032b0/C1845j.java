package com.bumptech.glide.load.p030n.p032b0;

import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.p051s.C2189g;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.C2194k;
import com.bumptech.glide.p051s.p052l.C2196a;
import com.bumptech.glide.p051s.p052l.C2205c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.load.n.b0.j */
/* compiled from: SafeKeyGenerator */
public class C1845j {

    /* renamed from: a */
    private final C2189g<C1786g, String> f6663a = new C2189g<>(1000);

    /* renamed from: b */
    private final C3700f<C1847b> f6664b = C2196a.m10297d(10, new C1846a(this));

    /* renamed from: com.bumptech.glide.load.n.b0.j$a */
    /* compiled from: SafeKeyGenerator */
    class C1846a implements C2196a.C2200d<C1847b> {
        C1846a(C1845j jVar) {
        }

        /* renamed from: b */
        public C1847b mo7847a() {
            try {
                return new C1847b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.j$b */
    /* compiled from: SafeKeyGenerator */
    private static final class C1847b implements C2196a.C2202f {

        /* renamed from: g */
        final MessageDigest f6665g;

        /* renamed from: h */
        private final C2205c f6666h = C2205c.m10314a();

        C1847b(MessageDigest messageDigest) {
            this.f6665g = messageDigest;
        }

        /* renamed from: j */
        public C2205c mo7849j() {
            return this.f6666h;
        }
    }

    /* renamed from: a */
    private String m9002a(C1786g gVar) {
        C1847b b = this.f6664b.mo8513b();
        C2193j.m10269d(b);
        C1847b bVar = b;
        try {
            gVar.mo7735a(bVar.f6665g);
            return C2194k.m10293w(bVar.f6665g.digest());
        } finally {
            this.f6664b.mo8512a(bVar);
        }
    }

    /* renamed from: b */
    public String mo7846b(C1786g gVar) {
        String g;
        synchronized (this.f6663a) {
            g = this.f6663a.mo8494g(gVar);
        }
        if (g == null) {
            g = m9002a(gVar);
        }
        synchronized (this.f6663a) {
            this.f6663a.mo8496k(gVar, g);
        }
        return g;
    }
}
