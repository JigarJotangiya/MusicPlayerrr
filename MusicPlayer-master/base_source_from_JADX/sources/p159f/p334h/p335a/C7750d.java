package p159f.p334h.p335a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p159f.p334h.p335a.C7755f;

/* renamed from: f.h.a.d */
/* compiled from: CollectionJsonAdapter */
abstract class C7750d<C extends Collection<T>, T> extends C7755f<C> {

    /* renamed from: b */
    public static final C7755f.C7756a f33116b = new C7751a();

    /* renamed from: a */
    private final C7755f<T> f33117a;

    /* renamed from: f.h.a.d$a */
    /* compiled from: CollectionJsonAdapter */
    class C7751a implements C7755f.C7756a {
        C7751a() {
        }

        /* renamed from: a */
        public C7755f<?> mo15565a(Type type, Set<? extends Annotation> set, C7781s sVar) {
            Class<?> g = C7799u.m42769g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (g == List.class || g == Collection.class) {
                return C7750d.m42631e(type, sVar).mo28954c();
            }
            if (g == Set.class) {
                return C7750d.m42632g(type, sVar).mo28954c();
            }
            return null;
        }
    }

    /* renamed from: f.h.a.d$b */
    /* compiled from: CollectionJsonAdapter */
    class C7752b extends C7750d<Collection<T>, T> {
        C7752b(C7755f fVar) {
            super(fVar, (C7751a) null);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo15563a(C7761k kVar) throws IOException {
            return C7750d.super.mo28948d(kVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Collection<T> mo28949f() {
            return new ArrayList();
        }
    }

    /* renamed from: f.h.a.d$c */
    /* compiled from: CollectionJsonAdapter */
    class C7753c extends C7750d<Set<T>, T> {
        C7753c(C7755f fVar) {
            super(fVar, (C7751a) null);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo15563a(C7761k kVar) throws IOException {
            return C7750d.super.mo28948d(kVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Set<T> mo28949f() {
            return new LinkedHashSet();
        }
    }

    /* synthetic */ C7750d(C7755f fVar, C7751a aVar) {
        this(fVar);
    }

    /* renamed from: e */
    static <T> C7755f<Collection<T>> m42631e(Type type, C7781s sVar) {
        return new C7752b(sVar.mo29029d(C7799u.m42765c(type, Collection.class)));
    }

    /* renamed from: g */
    static <T> C7755f<Set<T>> m42632g(Type type, C7781s sVar) {
        return new C7753c(sVar.mo29029d(C7799u.m42765c(type, Collection.class)));
    }

    /* renamed from: d */
    public C mo28948d(C7761k kVar) throws IOException {
        C f = mo28949f();
        kVar.mo28968c();
        while (kVar.mo28957E()) {
            f.add(this.f33117a.mo15563a(kVar));
        }
        kVar.mo28974p();
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract C mo28949f();

    public String toString() {
        return this.f33117a + ".collection()";
    }

    private C7750d(C7755f<T> fVar) {
        this.f33117a = fVar;
    }
}
