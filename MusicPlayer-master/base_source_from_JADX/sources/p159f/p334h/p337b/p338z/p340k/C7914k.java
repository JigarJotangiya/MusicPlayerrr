package p159f.p334h.p337b.p338z.p340k;

import java.util.concurrent.CountDownLatch;

/* renamed from: f.h.b.z.k.k */
/* compiled from: Ping */
public final class C7914k {

    /* renamed from: a */
    private final CountDownLatch f33556a = new CountDownLatch(1);

    /* renamed from: b */
    private long f33557b = -1;

    /* renamed from: c */
    private long f33558c = -1;

    C7914k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29411a() {
        if (this.f33558c == -1) {
            long j = this.f33557b;
            if (j != -1) {
                this.f33558c = j - 1;
                this.f33556a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29412b() {
        if (this.f33558c != -1 || this.f33557b == -1) {
            throw new IllegalStateException();
        }
        this.f33558c = System.nanoTime();
        this.f33556a.countDown();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo29413c() {
        if (this.f33557b == -1) {
            this.f33557b = System.nanoTime();
            return;
        }
        throw new IllegalStateException();
    }
}
