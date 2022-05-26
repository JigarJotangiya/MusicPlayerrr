package com.bumptech.glide.load.p034o.p035y;

import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.p034o.C1937g;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.load.p034o.C1952o;
import com.bumptech.glide.load.p034o.C1958r;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.o.y.e */
/* compiled from: UrlLoader */
public class C1993e implements C1950n<URL, InputStream> {

    /* renamed from: a */
    private final C1950n<C1937g, InputStream> f6997a;

    /* renamed from: com.bumptech.glide.load.o.y.e$a */
    /* compiled from: UrlLoader */
    public static class C1994a implements C1952o<URL, InputStream> {
        /* renamed from: b */
        public C1950n<URL, InputStream> mo8008b(C1958r rVar) {
            return new C1993e(rVar.mo8062d(C1937g.class, InputStream.class));
        }
    }

    public C1993e(C1950n<C1937g, InputStream> nVar) {
        this.f6997a = nVar;
    }

    /* renamed from: c */
    public C1950n.C1951a<InputStream> mo8004b(URL url, int i, int i2, C1790i iVar) {
        return this.f6997a.mo8004b(new C1937g(url), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo8003a(URL url) {
        return true;
    }
}
