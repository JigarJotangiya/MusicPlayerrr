package com.bumptech.glide.load.p034o;

import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p050r.C2178d;

/* renamed from: com.bumptech.glide.load.o.v */
/* compiled from: UnitModelLoader */
public class C1972v<Model> implements C1950n<Model, Model> {

    /* renamed from: a */
    private static final C1972v<?> f6963a = new C1972v<>();

    /* renamed from: com.bumptech.glide.load.o.v$a */
    /* compiled from: UnitModelLoader */
    public static class C1973a<Model> implements C1952o<Model, Model> {

        /* renamed from: a */
        private static final C1973a<?> f6964a = new C1973a<>();

        /* renamed from: a */
        public static <T> C1973a<T> m9383a() {
            return f6964a;
        }

        /* renamed from: b */
        public C1950n<Model, Model> mo8008b(C1958r rVar) {
            return C1972v.m9380c();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.v$b */
    /* compiled from: UnitModelLoader */
    private static class C1974b<Model> implements C1752d<Model> {

        /* renamed from: g */
        private final Model f6965g;

        C1974b(Model model) {
            this.f6965g = model;
        }

        /* renamed from: a */
        public Class<Model> mo7688a() {
            return this.f6965g.getClass();
        }

        /* renamed from: b */
        public void mo7693b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C1744a mo7696d() {
            return C1744a.LOCAL;
        }

        /* renamed from: e */
        public void mo7697e(C1730g gVar, C1752d.C1753a<? super Model> aVar) {
            aVar.mo7705f(this.f6965g);
        }
    }

    /* renamed from: c */
    public static <T> C1972v<T> m9380c() {
        return f6963a;
    }

    /* renamed from: a */
    public boolean mo8003a(Model model) {
        return true;
    }

    /* renamed from: b */
    public C1950n.C1951a<Model> mo8004b(Model model, int i, int i2, C1790i iVar) {
        return new C1950n.C1951a<>(new C2178d(model), new C1974b(model));
    }
}
