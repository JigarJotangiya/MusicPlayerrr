package p159f.p334h.p335a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import p159f.p334h.p335a.C7755f;

/* renamed from: f.h.a.r */
/* compiled from: MapJsonAdapter */
final class C7779r<K, V> extends C7755f<Map<K, V>> {

    /* renamed from: c */
    public static final C7755f.C7756a f33161c = new C7780a();

    /* renamed from: a */
    private final C7755f<K> f33162a;

    /* renamed from: b */
    private final C7755f<V> f33163b;

    /* renamed from: f.h.a.r$a */
    /* compiled from: MapJsonAdapter */
    class C7780a implements C7755f.C7756a {
        C7780a() {
        }

        /* renamed from: a */
        public C7755f<?> mo15565a(Type type, Set<? extends Annotation> set, C7781s sVar) {
            Class<?> g;
            if (!set.isEmpty() || (g = C7799u.m42769g(type)) != Map.class) {
                return null;
            }
            Type[] i = C7799u.m42771i(type, g);
            return new C7779r(sVar, i[0], i[1]).mo28954c();
        }
    }

    C7779r(C7781s sVar, Type type, Type type2) {
        this.f33162a = sVar.mo29029d(type);
        this.f33163b = sVar.mo29029d(type2);
    }

    /* renamed from: d */
    public Map<K, V> mo15563a(C7761k kVar) throws IOException {
        C7769q qVar = new C7769q();
        kVar.mo28969d();
        while (kVar.mo28957E()) {
            kVar.mo28977z0();
            K a = this.f33162a.mo15563a(kVar);
            V a2 = this.f33163b.mo15563a(kVar);
            Object put = qVar.put(a, a2);
            if (put != null) {
                throw new C7758h("Map key '" + a + "' has multiple values at path " + kVar.getPath() + ": " + put + " and " + a2);
            }
        }
        kVar.mo28976x();
        return qVar;
    }

    public String toString() {
        return "JsonAdapter(" + this.f33162a + "=" + this.f33163b + ")";
    }
}
