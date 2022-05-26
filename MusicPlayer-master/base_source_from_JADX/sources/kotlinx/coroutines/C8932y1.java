package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p369i.C8457t;
import p369i.p387z.p388c.C8570l;

/* renamed from: kotlinx.coroutines.y1 */
/* compiled from: JobSupport.kt */
final class C8932y1 extends C8682c2 {

    /* renamed from: l */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35318l = AtomicIntegerFieldUpdater.newUpdater(C8932y1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: k */
    private final C8570l<Throwable, C8457t> f35319k;

    public C8932y1(C8570l<? super Throwable, C8457t> lVar) {
        this.f35319k = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo31007z((Throwable) obj);
        return C8457t.f34900a;
    }

    /* renamed from: z */
    public void mo31007z(Throwable th) {
        if (f35318l.compareAndSet(this, 0, 1)) {
            this.f35319k.invoke(th);
        }
    }
}
