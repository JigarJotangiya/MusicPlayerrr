package kotlinx.coroutines.p397f3.p398q;

import kotlinx.coroutines.p397f3.C8730c;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p387z.p388c.C8575q;
import p369i.p387z.p389d.C8592j;
import p369i.p387z.p389d.C8606x;

/* renamed from: kotlinx.coroutines.f3.q.j */
/* compiled from: SafeCollector.kt */
public final class C8762j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C8575q<C8730c<Object>, Object, C8508d<? super C8457t>, Object> f35118a;

    /* renamed from: kotlinx.coroutines.f3.q.j$a */
    /* compiled from: SafeCollector.kt */
    /* synthetic */ class C8763a extends C8592j implements C8575q<C8730c<? super Object>, Object, C8457t> {
        public static final C8763a INSTANCE = new C8763a();

        C8763a() {
            super(3, C8730c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(C8730c<Object> cVar, Object obj, C8508d<? super C8457t> dVar) {
            return cVar.emit(obj, dVar);
        }
    }

    static {
        C8763a aVar = C8763a.INSTANCE;
        C8606x.m46798b(aVar, 3);
        f35118a = aVar;
    }
}
