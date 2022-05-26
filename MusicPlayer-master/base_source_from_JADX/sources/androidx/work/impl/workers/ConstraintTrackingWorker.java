package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C1405l;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1285j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p009m.C1295c;
import androidx.work.impl.p009m.C1296d;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.utils.p013o.C1396c;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.Collections;
import java.util.List;
import p159f.p243f.p327d.p330c.p331a.C7738a;

public class ConstraintTrackingWorker extends ListenableWorker implements C1295c {

    /* renamed from: q */
    private static final String f5453q = C1405l.m7462f("ConstraintTrkngWrkr");

    /* renamed from: l */
    private WorkerParameters f5454l;

    /* renamed from: m */
    final Object f5455m = new Object();

    /* renamed from: n */
    volatile boolean f5456n = false;

    /* renamed from: o */
    C1396c<ListenableWorker.C1221a> f5457o = C1396c.m7435u();

    /* renamed from: p */
    private ListenableWorker f5458p;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    class C1400a implements Runnable {
        C1400a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.mo6811e();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    class C1401b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C7738a f5460g;

        C1401b(C7738a aVar) {
            this.f5460g = aVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f5455m) {
                if (ConstraintTrackingWorker.this.f5456n) {
                    ConstraintTrackingWorker.this.mo6810d();
                } else {
                    ConstraintTrackingWorker.this.f5457o.mo6790s(this.f5460g);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5454l = workerParameters;
    }

    /* renamed from: a */
    public WorkDatabase mo6808a() {
        return C1285j.m7100k(getApplicationContext()).mo6611o();
    }

    /* renamed from: b */
    public void mo6541b(List<String> list) {
        C1405l.m7460c().mo6816a(f5453q, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f5455m) {
            this.f5456n = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6809c() {
        this.f5457o.mo6788q(ListenableWorker.C1221a.m6836a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6810d() {
        this.f5457o.mo6788q(ListenableWorker.C1221a.m6837b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6811e() {
        String i = getInputData().mo6506i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i)) {
            C1405l.m7460c().mo6817b(f5453q, "No worker to delegate to.", new Throwable[0]);
            mo6809c();
            return;
        }
        ListenableWorker b = getWorkerFactory().mo6839b(getApplicationContext(), i, this.f5454l);
        this.f5458p = b;
        if (b == null) {
            C1405l.m7460c().mo6816a(f5453q, "No worker to delegate to.", new Throwable[0]);
            mo6809c();
            return;
        }
        C1340p n = mo6808a().mo6527N().mo6728n(getId().toString());
        if (n == null) {
            mo6809c();
            return;
        }
        C1296d dVar = new C1296d(getApplicationContext(), getTaskExecutor(), this);
        dVar.mo6644d(Collections.singletonList(n));
        if (dVar.mo6643c(getId().toString())) {
            C1405l.m7460c().mo6816a(f5453q, String.format("Constraints met for delegate %s", new Object[]{i}), new Throwable[0]);
            try {
                C7738a<ListenableWorker.C1221a> startWork = this.f5458p.startWork();
                startWork.mo6781d(new C1401b(startWork), getBackgroundExecutor());
            } catch (Throwable th) {
                C1405l c = C1405l.m7460c();
                String str = f5453q;
                c.mo6816a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{i}), th);
                synchronized (this.f5455m) {
                    if (this.f5456n) {
                        C1405l.m7460c().mo6816a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        mo6810d();
                    } else {
                        mo6809c();
                    }
                }
            }
        } else {
            C1405l.m7460c().mo6816a(f5453q, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{i}), new Throwable[0]);
            mo6810d();
        }
    }

    /* renamed from: f */
    public void mo6543f(List<String> list) {
    }

    public C1397a getTaskExecutor() {
        return C1285j.m7100k(getApplicationContext()).mo6612p();
    }

    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f5458p;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f5458p;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f5458p.stop();
        }
    }

    public C7738a<ListenableWorker.C1221a> startWork() {
        getBackgroundExecutor().execute(new C1400a());
        return this.f5457o;
    }
}
