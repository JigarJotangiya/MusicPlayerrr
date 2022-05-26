package androidx.room;

import androidx.room.C0994s0;
import java.util.concurrent.Executor;
import p082e.p149u.p150a.C4215c;

/* renamed from: androidx.room.o0 */
/* compiled from: QueryInterceptorOpenHelperFactory */
final class C0986o0 implements C4215c.C4219c {

    /* renamed from: a */
    private final C4215c.C4219c f4213a;

    /* renamed from: b */
    private final C0994s0.C1000f f4214b;

    /* renamed from: c */
    private final Executor f4215c;

    C0986o0(C4215c.C4219c cVar, C0994s0.C1000f fVar, Executor executor) {
        this.f4213a = cVar;
        this.f4214b = fVar;
        this.f4215c = executor;
    }

    /* renamed from: a */
    public C4215c mo5440a(C4215c.C4217b bVar) {
        return new C0984n0(this.f4213a.mo5440a(bVar), this.f4214b, this.f4215c);
    }
}
