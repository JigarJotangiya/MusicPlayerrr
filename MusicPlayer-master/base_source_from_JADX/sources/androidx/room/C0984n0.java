package androidx.room;

import androidx.room.C0994s0;
import java.util.concurrent.Executor;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;

/* renamed from: androidx.room.n0 */
/* compiled from: QueryInterceptorOpenHelper */
final class C0984n0 implements C4215c, C0951e0 {

    /* renamed from: g */
    private final C4215c f4207g;

    /* renamed from: h */
    private final C0994s0.C1000f f4208h;

    /* renamed from: i */
    private final Executor f4209i;

    C0984n0(C4215c cVar, C0994s0.C1000f fVar, Executor executor) {
        this.f4207g = cVar;
        this.f4208h = fVar;
        this.f4209i = executor;
    }

    /* renamed from: R */
    public C4214b mo5550R() {
        return new C0982m0(this.f4207g.mo5550R(), this.f4208h, this.f4209i);
    }

    /* renamed from: V */
    public C4214b mo5551V() {
        return new C0982m0(this.f4207g.mo5551V(), this.f4208h, this.f4209i);
    }

    /* renamed from: c */
    public C4215c mo5474c() {
        return this.f4207g;
    }

    public void close() {
        this.f4207g.close();
    }

    public String getDatabaseName() {
        return this.f4207g.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f4207g.setWriteAheadLoggingEnabled(z);
    }
}
