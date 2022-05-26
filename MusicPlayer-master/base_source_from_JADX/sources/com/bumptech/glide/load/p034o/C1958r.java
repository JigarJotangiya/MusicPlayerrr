package com.bumptech.glide.load.p034o;

import com.bumptech.glide.C1732i;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p051s.C2193j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.load.o.r */
/* compiled from: MultiModelLoaderFactory */
public class C1958r {

    /* renamed from: e */
    private static final C1961c f6946e = new C1961c();

    /* renamed from: f */
    private static final C1950n<Object, Object> f6947f = new C1959a();

    /* renamed from: a */
    private final List<C1960b<?, ?>> f6948a;

    /* renamed from: b */
    private final C1961c f6949b;

    /* renamed from: c */
    private final Set<C1960b<?, ?>> f6950c;

    /* renamed from: d */
    private final C3700f<List<Throwable>> f6951d;

    /* renamed from: com.bumptech.glide.load.o.r$a */
    /* compiled from: MultiModelLoaderFactory */
    private static class C1959a implements C1950n<Object, Object> {
        C1959a() {
        }

        /* renamed from: a */
        public boolean mo8003a(Object obj) {
            return false;
        }

        /* renamed from: b */
        public C1950n.C1951a<Object> mo8004b(Object obj, int i, int i2, C1790i iVar) {
            return null;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.r$b */
    /* compiled from: MultiModelLoaderFactory */
    private static class C1960b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f6952a;

        /* renamed from: b */
        final Class<Data> f6953b;

        /* renamed from: c */
        final C1952o<? extends Model, ? extends Data> f6954c;

        public C1960b(Class<Model> cls, Class<Data> cls2, C1952o<? extends Model, ? extends Data> oVar) {
            this.f6952a = cls;
            this.f6953b = cls2;
            this.f6954c = oVar;
        }

        /* renamed from: a */
        public boolean mo8065a(Class<?> cls) {
            return this.f6952a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo8066b(Class<?> cls, Class<?> cls2) {
            return mo8065a(cls) && this.f6953b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.r$c */
    /* compiled from: MultiModelLoaderFactory */
    static class C1961c {
        C1961c() {
        }

        /* renamed from: a */
        public <Model, Data> C1956q<Model, Data> mo8067a(List<C1950n<Model, Data>> list, C3700f<List<Throwable>> fVar) {
            return new C1956q<>(list, fVar);
        }
    }

    public C1958r(C3700f<List<Throwable>> fVar) {
        this(fVar, f6946e);
    }

    /* renamed from: a */
    private <Model, Data> void m9348a(Class<Model> cls, Class<Data> cls2, C1952o<? extends Model, ? extends Data> oVar, boolean z) {
        C1960b bVar = new C1960b(cls, cls2, oVar);
        List<C1960b<?, ?>> list = this.f6948a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* renamed from: c */
    private <Model, Data> C1950n<Model, Data> m9349c(C1960b<?, ?> bVar) {
        C1950n<? extends Model, ? extends Data> b = bVar.f6954c.mo8008b(this);
        C2193j.m10269d(b);
        return b;
    }

    /* renamed from: f */
    private static <Model, Data> C1950n<Model, Data> m9350f() {
        return f6947f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void mo8061b(Class<Model> cls, Class<Data> cls2, C1952o<? extends Model, ? extends Data> oVar) {
        m9348a(cls, cls2, oVar, true);
    }

    /* renamed from: d */
    public synchronized <Model, Data> C1950n<Model, Data> mo8062d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1960b next : this.f6948a) {
                if (this.f6950c.contains(next)) {
                    z = true;
                } else if (next.mo8066b(cls, cls2)) {
                    this.f6950c.add(next);
                    arrayList.add(m9349c(next));
                    this.f6950c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f6949b.mo8067a(arrayList, this.f6951d);
            } else if (arrayList.size() == 1) {
                return (C1950n) arrayList.get(0);
            } else if (z) {
                return m9350f();
            } else {
                throw new C1732i.C1735c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f6950c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized <Model> List<C1950n<Model, ?>> mo8063e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1960b next : this.f6948a) {
                if (!this.f6950c.contains(next)) {
                    if (next.mo8065a(cls)) {
                        this.f6950c.add(next);
                        arrayList.add(m9349c(next));
                        this.f6950c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f6950c.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized List<Class<?>> mo8064g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1960b next : this.f6948a) {
            if (!arrayList.contains(next.f6953b) && next.mo8065a(cls)) {
                arrayList.add(next.f6953b);
            }
        }
        return arrayList;
    }

    C1958r(C3700f<List<Throwable>> fVar, C1961c cVar) {
        this.f6948a = new ArrayList();
        this.f6950c = new HashSet();
        this.f6951d = fVar;
        this.f6949b = cVar;
    }
}
