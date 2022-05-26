package com.bumptech.glide.p051s.p052l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p118o.C3700f;
import p082e.p109h.p118o.C3702h;

/* renamed from: com.bumptech.glide.s.l.a */
/* compiled from: FactoryPools */
public final class C2196a {

    /* renamed from: a */
    private static final C2203g<Object> f7443a = new C2197a();

    /* renamed from: com.bumptech.glide.s.l.a$a */
    /* compiled from: FactoryPools */
    class C2197a implements C2203g<Object> {
        C2197a() {
        }

        /* renamed from: a */
        public void mo8509a(Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.s.l.a$b */
    /* compiled from: FactoryPools */
    class C2198b implements C2200d<List<T>> {
        C2198b() {
        }

        /* renamed from: b */
        public List<T> mo7847a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.s.l.a$c */
    /* compiled from: FactoryPools */
    class C2199c implements C2203g<List<T>> {
        C2199c() {
        }

        /* renamed from: b */
        public void mo8509a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.s.l.a$d */
    /* compiled from: FactoryPools */
    public interface C2200d<T> {
        /* renamed from: a */
        T mo7847a();
    }

    /* renamed from: com.bumptech.glide.s.l.a$e */
    /* compiled from: FactoryPools */
    private static final class C2201e<T> implements C3700f<T> {

        /* renamed from: a */
        private final C2200d<T> f7444a;

        /* renamed from: b */
        private final C2203g<T> f7445b;

        /* renamed from: c */
        private final C3700f<T> f7446c;

        C2201e(C3700f<T> fVar, C2200d<T> dVar, C2203g<T> gVar) {
            this.f7446c = fVar;
            this.f7444a = dVar;
            this.f7445b = gVar;
        }

        /* renamed from: a */
        public boolean mo8512a(T t) {
            if (t instanceof C2202f) {
                ((C2202f) t).mo7849j().mo8514b(true);
            }
            this.f7445b.mo8509a(t);
            return this.f7446c.mo8512a(t);
        }

        /* renamed from: b */
        public T mo8513b() {
            T b = this.f7446c.mo8513b();
            if (b == null) {
                b = this.f7444a.mo7847a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b.getClass());
                }
            }
            if (b instanceof C2202f) {
                ((C2202f) b).mo7849j().mo8514b(false);
            }
            return b;
        }
    }

    /* renamed from: com.bumptech.glide.s.l.a$f */
    /* compiled from: FactoryPools */
    public interface C2202f {
        /* renamed from: j */
        C2205c mo7849j();
    }

    /* renamed from: com.bumptech.glide.s.l.a$g */
    /* compiled from: FactoryPools */
    public interface C2203g<T> {
        /* renamed from: a */
        void mo8509a(T t);
    }

    /* renamed from: a */
    private static <T extends C2202f> C3700f<T> m10294a(C3700f<T> fVar, C2200d<T> dVar) {
        return m10295b(fVar, dVar, m10296c());
    }

    /* renamed from: b */
    private static <T> C3700f<T> m10295b(C3700f<T> fVar, C2200d<T> dVar, C2203g<T> gVar) {
        return new C2201e(fVar, dVar, gVar);
    }

    /* renamed from: c */
    private static <T> C2203g<T> m10296c() {
        return f7443a;
    }

    /* renamed from: d */
    public static <T extends C2202f> C3700f<T> m10297d(int i, C2200d<T> dVar) {
        return m10294a(new C3702h(i), dVar);
    }

    /* renamed from: e */
    public static <T> C3700f<List<T>> m10298e() {
        return m10299f(20);
    }

    /* renamed from: f */
    public static <T> C3700f<List<T>> m10299f(int i) {
        return m10295b(new C3702h(i), new C2198b(), new C2199c());
    }
}
