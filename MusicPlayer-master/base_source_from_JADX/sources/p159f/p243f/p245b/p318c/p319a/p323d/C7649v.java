package p159f.p243f.p245b.p318c.p319a.p323d;

import java.util.concurrent.CountDownLatch;

/* renamed from: f.f.b.c.a.d.v */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C7649v implements C7650w {

    /* renamed from: a */
    private final CountDownLatch f33016a = new CountDownLatch(1);

    /* synthetic */ C7649v(C7648u uVar) {
    }

    /* renamed from: a */
    public final void mo25351a(Object obj) {
        this.f33016a.countDown();
    }

    /* renamed from: b */
    public final void mo25350b(Exception exc) {
        this.f33016a.countDown();
    }

    /* renamed from: c */
    public final void mo28643c() throws InterruptedException {
        this.f33016a.await();
    }
}
