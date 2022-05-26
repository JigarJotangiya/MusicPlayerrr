package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.room.z0 */
/* compiled from: SharedSQLiteStatement */
public abstract class C1025z0 {

    /* renamed from: a */
    private final AtomicBoolean f4334a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C0994s0 f4335b;

    /* renamed from: c */
    private volatile C4222f f4336c;

    public C1025z0(C0994s0 s0Var) {
        this.f4335b = s0Var;
    }

    /* renamed from: c */
    private C4222f m5964c() {
        return this.f4335b.mo5577d(mo5692d());
    }

    /* renamed from: e */
    private C4222f m5965e(boolean z) {
        if (!z) {
            return m5964c();
        }
        if (this.f4336c == null) {
            this.f4336c = m5964c();
        }
        return this.f4336c;
    }

    /* renamed from: a */
    public C4222f mo5690a() {
        mo5691b();
        return m5965e(this.f4334a.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5691b() {
        this.f4335b.mo5574a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo5692d();

    /* renamed from: f */
    public void mo5693f(C4222f fVar) {
        if (fVar == this.f4336c) {
            this.f4334a.set(false);
        }
    }
}
