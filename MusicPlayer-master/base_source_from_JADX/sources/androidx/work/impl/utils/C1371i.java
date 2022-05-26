package androidx.work.impl.utils;

import androidx.work.C1405l;
import androidx.work.C1421u;
import androidx.work.impl.C1262d;
import androidx.work.impl.C1285j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012n.C1342q;

/* renamed from: androidx.work.impl.utils.i */
/* compiled from: StopWorkRunnable */
public class C1371i implements Runnable {

    /* renamed from: j */
    private static final String f5380j = C1405l.m7462f("StopWorkRunnable");

    /* renamed from: g */
    private final C1285j f5381g;

    /* renamed from: h */
    private final String f5382h;

    /* renamed from: i */
    private final boolean f5383i;

    public C1371i(C1285j jVar, String str, boolean z) {
        this.f5381g = jVar;
        this.f5382h = str;
        this.f5383i = z;
    }

    public void run() {
        boolean z;
        WorkDatabase o = this.f5381g.mo6611o();
        C1262d m = this.f5381g.mo6609m();
        C1342q N = o.mo6527N();
        o.mo5576c();
        try {
            boolean h = m.mo6571h(this.f5382h);
            if (this.f5383i) {
                z = this.f5381g.mo6609m().mo6576n(this.f5382h);
            } else {
                if (!h && N.mo6727m(this.f5382h) == C1421u.RUNNING) {
                    N.mo6716b(C1421u.ENQUEUED, this.f5382h);
                }
                z = this.f5381g.mo6609m().mo6577o(this.f5382h);
            }
            C1405l.m7460c().mo6816a(f5380j, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f5382h, Boolean.valueOf(z)}), new Throwable[0]);
            o.mo5573C();
        } finally {
            o.mo5580g();
        }
    }
}
