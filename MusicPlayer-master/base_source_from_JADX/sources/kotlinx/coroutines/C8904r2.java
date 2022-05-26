package kotlinx.coroutines;

import p369i.C8447l;
import p369i.C8450m;
import p369i.C8457t;

/* renamed from: kotlinx.coroutines.r2 */
/* compiled from: JobSupport.kt */
final class C8904r2<T> extends C8775h2 {

    /* renamed from: k */
    private final C8901r<T> f35296k;

    public C8904r2(C8901r<? super T> rVar) {
        this.f35296k = rVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo31007z((Throwable) obj);
        return C8457t.f34900a;
    }

    /* renamed from: z */
    public void mo31007z(Throwable th) {
        Object J = mo31009A().mo31053J();
        if (C8919v0.m47824a() && !(!(J instanceof C8920v1))) {
            throw new AssertionError();
        } else if (J instanceof C8724f0) {
            C8901r<T> rVar = this.f35296k;
            Throwable th2 = ((C8724f0) J).f35091a;
            C8447l.C8448a aVar = C8447l.Companion;
            rVar.resumeWith(C8447l.m50326constructorimpl(C8450m.m46574a(th2)));
        } else {
            C8901r<T> rVar2 = this.f35296k;
            Object h = C8863j2.m47671h(J);
            C8447l.C8448a aVar2 = C8447l.Companion;
            rVar2.resumeWith(C8447l.m50326constructorimpl(h));
        }
    }
}
