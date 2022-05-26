package p159f.p334h.p335a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import p159f.p334h.p335a.C7755f;

/* renamed from: f.h.a.a */
/* compiled from: ArrayJsonAdapter */
final class C7740a extends C7755f<Object> {

    /* renamed from: c */
    public static final C7755f.C7756a f33097c = new C7741a();

    /* renamed from: a */
    private final Class<?> f33098a;

    /* renamed from: b */
    private final C7755f<Object> f33099b;

    /* renamed from: f.h.a.a$a */
    /* compiled from: ArrayJsonAdapter */
    class C7741a implements C7755f.C7756a {
        C7741a() {
        }

        /* renamed from: a */
        public C7755f<?> mo15565a(Type type, Set<? extends Annotation> set, C7781s sVar) {
            Type a = C7799u.m42763a(type);
            if (a != null && set.isEmpty()) {
                return new C7740a(C7799u.m42769g(a), sVar.mo29029d(a)).mo28954c();
            }
            return null;
        }
    }

    C7740a(Class<?> cls, C7755f<Object> fVar) {
        this.f33098a = cls;
        this.f33099b = fVar;
    }

    /* renamed from: a */
    public Object mo15563a(C7761k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        kVar.mo28968c();
        while (kVar.mo28957E()) {
            arrayList.add(this.f33099b.mo15563a(kVar));
        }
        kVar.mo28974p();
        Object newInstance = Array.newInstance(this.f33098a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public String toString() {
        return this.f33099b + ".array()";
    }
}
