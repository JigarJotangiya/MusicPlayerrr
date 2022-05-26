package com.bumptech.glide.load.p034o;

import com.bumptech.glide.C1732i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.load.o.p */
/* compiled from: ModelLoaderRegistry */
public class C1953p {

    /* renamed from: a */
    private final C1958r f6933a;

    /* renamed from: b */
    private final C1954a f6934b;

    /* renamed from: com.bumptech.glide.load.o.p$a */
    /* compiled from: ModelLoaderRegistry */
    private static class C1954a {

        /* renamed from: a */
        private final Map<Class<?>, C1955a<?>> f6935a = new HashMap();

        /* renamed from: com.bumptech.glide.load.o.p$a$a */
        /* compiled from: ModelLoaderRegistry */
        private static class C1955a<Model> {

            /* renamed from: a */
            final List<C1950n<Model, ?>> f6936a;

            public C1955a(List<C1950n<Model, ?>> list) {
                this.f6936a = list;
            }
        }

        C1954a() {
        }

        /* renamed from: a */
        public void mo8057a() {
            this.f6935a.clear();
        }

        /* renamed from: b */
        public <Model> List<C1950n<Model, ?>> mo8058b(Class<Model> cls) {
            C1955a aVar = this.f6935a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f6936a;
        }

        /* renamed from: c */
        public <Model> void mo8059c(Class<Model> cls, List<C1950n<Model, ?>> list) {
            if (this.f6935a.put(cls, new C1955a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public C1953p(C3700f<List<Throwable>> fVar) {
        this(new C1958r(fVar));
    }

    /* renamed from: b */
    private static <A> Class<A> m9331b(A a) {
        return a.getClass();
    }

    /* renamed from: e */
    private synchronized <A> List<C1950n<A, ?>> m9332e(Class<A> cls) {
        List<C1950n<A, ?>> b;
        b = this.f6934b.mo8058b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f6933a.mo8063e(cls));
            this.f6934b.mo8059c(cls, b);
        }
        return b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo8054a(Class<Model> cls, Class<Data> cls2, C1952o<? extends Model, ? extends Data> oVar) {
        this.f6933a.mo8061b(cls, cls2, oVar);
        this.f6934b.mo8057a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> mo8055c(Class<?> cls) {
        return this.f6933a.mo8064g(cls);
    }

    /* renamed from: d */
    public <A> List<C1950n<A, ?>> mo8056d(A a) {
        List e = m9332e(m9331b(a));
        if (!e.isEmpty()) {
            int size = e.size();
            List<C1950n<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C1950n nVar = (C1950n) e.get(i);
                if (nVar.mo8003a(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C1732i.C1735c(a, e);
        }
        throw new C1732i.C1735c(a);
    }

    private C1953p(C1958r rVar) {
        this.f6934b = new C1954a();
        this.f6933a = rVar;
    }
}
