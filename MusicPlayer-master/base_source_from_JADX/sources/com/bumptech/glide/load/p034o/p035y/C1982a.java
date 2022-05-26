package com.bumptech.glide.load.p034o.p035y;

import com.bumptech.glide.load.C1787h;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1762j;
import com.bumptech.glide.load.p034o.C1937g;
import com.bumptech.glide.load.p034o.C1947m;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.load.p034o.C1952o;
import com.bumptech.glide.load.p034o.C1958r;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.y.a */
/* compiled from: HttpGlideUrlLoader */
public class C1982a implements C1950n<C1937g, InputStream> {

    /* renamed from: b */
    public static final C1787h<Integer> f6973b = C1787h.m8822f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C1947m<C1937g, C1937g> f6974a;

    /* renamed from: com.bumptech.glide.load.o.y.a$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class C1983a implements C1952o<C1937g, InputStream> {

        /* renamed from: a */
        private final C1947m<C1937g, C1937g> f6975a = new C1947m<>(500);

        /* renamed from: b */
        public C1950n<C1937g, InputStream> mo8008b(C1958r rVar) {
            return new C1982a(this.f6975a);
        }
    }

    public C1982a(C1947m<C1937g, C1937g> mVar) {
        this.f6974a = mVar;
    }

    /* renamed from: c */
    public C1950n.C1951a<InputStream> mo8004b(C1937g gVar, int i, int i2, C1790i iVar) {
        C1947m<C1937g, C1937g> mVar = this.f6974a;
        if (mVar != null) {
            C1937g a = mVar.mo8048a(gVar, 0, 0);
            if (a == null) {
                this.f6974a.mo8049b(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new C1950n.C1951a<>(gVar, new C1762j(gVar, ((Integer) iVar.mo7744c(f6973b)).intValue()));
    }

    /* renamed from: d */
    public boolean mo8003a(C1937g gVar) {
        return true;
    }
}
