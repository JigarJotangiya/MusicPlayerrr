package p082e.p126k.p129c.p131j;

import java.io.IOException;
import p082e.p126k.p129c.p131j.C4042w1;

/* renamed from: e.k.c.j.l0 */
/* compiled from: MapEntryLite */
public class C3976l0<K, V> {

    /* renamed from: a */
    private final C3977a<K, V> f12104a;

    /* renamed from: b */
    private final K f12105b;

    /* renamed from: c */
    private final V f12106c;

    /* renamed from: e.k.c.j.l0$a */
    /* compiled from: MapEntryLite */
    static class C3977a<K, V> {

        /* renamed from: a */
        public final C4042w1.C4044b f12107a;

        /* renamed from: b */
        public final K f12108b;

        /* renamed from: c */
        public final C4042w1.C4044b f12109c;

        /* renamed from: d */
        public final V f12110d;

        public C3977a(C4042w1.C4044b bVar, K k, C4042w1.C4044b bVar2, V v) {
            this.f12107a = bVar;
            this.f12108b = k;
            this.f12109c = bVar2;
            this.f12110d = v;
        }
    }

    private C3976l0(C4042w1.C4044b bVar, K k, C4042w1.C4044b bVar2, V v) {
        this.f12104a = new C3977a<>(bVar, k, bVar2, v);
        this.f12105b = k;
        this.f12106c = v;
    }

    /* renamed from: b */
    static <K, V> int m17289b(C3977a<K, V> aVar, K k, V v) {
        return C4028v.m17717d(aVar.f12107a, 1, k) + C4028v.m17717d(aVar.f12109c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> C3976l0<K, V> m17290d(C4042w1.C4044b bVar, K k, C4042w1.C4044b bVar2, V v) {
        return new C3976l0<>(bVar, k, bVar2, v);
    }

    /* renamed from: e */
    static <K, V> void m17291e(C3970l lVar, C3977a<K, V> aVar, K k, V v) throws IOException {
        C4028v.m17728z(lVar, aVar.f12107a, 1, k);
        C4028v.m17728z(lVar, aVar.f12109c, 2, v);
    }

    /* renamed from: a */
    public int mo13780a(int i, K k, V v) {
        return C3970l.m17139W(i) + C3970l.m17120D(m17289b(this.f12104a, k, v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3977a<K, V> mo13781c() {
        return this.f12104a;
    }
}
