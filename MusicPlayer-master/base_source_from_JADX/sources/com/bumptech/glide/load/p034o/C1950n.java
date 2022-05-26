package com.bumptech.glide.load.p034o;

import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.p051s.C2193j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.n */
/* compiled from: ModelLoader */
public interface C1950n<Model, Data> {

    /* renamed from: com.bumptech.glide.load.o.n$a */
    /* compiled from: ModelLoader */
    public static class C1951a<Data> {

        /* renamed from: a */
        public final C1786g f6930a;

        /* renamed from: b */
        public final List<C1786g> f6931b;

        /* renamed from: c */
        public final C1752d<Data> f6932c;

        public C1951a(C1786g gVar, C1752d<Data> dVar) {
            this(gVar, Collections.emptyList(), dVar);
        }

        public C1951a(C1786g gVar, List<C1786g> list, C1752d<Data> dVar) {
            C2193j.m10269d(gVar);
            this.f6930a = gVar;
            C2193j.m10269d(list);
            this.f6931b = list;
            C2193j.m10269d(dVar);
            this.f6932c = dVar;
        }
    }

    /* renamed from: a */
    boolean mo8003a(Model model);

    /* renamed from: b */
    C1951a<Data> mo8004b(Model model, int i, int i2, C1790i iVar);
}
