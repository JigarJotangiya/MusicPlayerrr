package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1239g;
import androidx.work.C1240h;
import androidx.work.C1405l;
import androidx.work.ListenableWorker;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.utils.p013o.C1396c;
import androidx.work.impl.utils.p014p.C1397a;
import p082e.p109h.p115l.C3643a;
import p159f.p243f.p327d.p330c.p331a.C7738a;

/* renamed from: androidx.work.impl.utils.k */
/* compiled from: WorkForegroundRunnable */
public class C1373k implements Runnable {

    /* renamed from: m */
    static final String f5386m = C1405l.m7462f("WorkForegroundRunnable");

    /* renamed from: g */
    final C1396c<Void> f5387g = C1396c.m7435u();

    /* renamed from: h */
    final Context f5388h;

    /* renamed from: i */
    final C1340p f5389i;

    /* renamed from: j */
    final ListenableWorker f5390j;

    /* renamed from: k */
    final C1240h f5391k;

    /* renamed from: l */
    final C1397a f5392l;

    /* renamed from: androidx.work.impl.utils.k$a */
    /* compiled from: WorkForegroundRunnable */
    class C1374a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C1396c f5393g;

        C1374a(C1396c cVar) {
            this.f5393g = cVar;
        }

        public void run() {
            this.f5393g.mo6790s(C1373k.this.f5390j.getForegroundInfoAsync());
        }
    }

    /* renamed from: androidx.work.impl.utils.k$b */
    /* compiled from: WorkForegroundRunnable */
    class C1375b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C1396c f5395g;

        C1375b(C1396c cVar) {
            this.f5395g = cVar;
        }

        public void run() {
            try {
                C1239g gVar = (C1239g) this.f5395g.get();
                if (gVar != null) {
                    C1405l.m7460c().mo6816a(C1373k.f5386m, String.format("Updating notification for %s", new Object[]{C1373k.this.f5389i.f5315c}), new Throwable[0]);
                    C1373k.this.f5390j.setRunInForeground(true);
                    C1373k kVar = C1373k.this;
                    kVar.f5387g.mo6790s(kVar.f5391k.mo6520a(kVar.f5388h, kVar.f5390j.getId(), gVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{C1373k.this.f5389i.f5315c}));
            } catch (Throwable th) {
                C1373k.this.f5387g.mo6789r(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public C1373k(Context context, C1340p pVar, ListenableWorker listenableWorker, C1240h hVar, C1397a aVar) {
        this.f5388h = context;
        this.f5389i = pVar;
        this.f5390j = listenableWorker;
        this.f5391k = hVar;
        this.f5392l = aVar;
    }

    /* renamed from: a */
    public C7738a<Void> mo6767a() {
        return this.f5387g;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f5389i.f5329q || C3643a.m15699c()) {
            this.f5387g.mo6788q(null);
            return;
        }
        C1396c u = C1396c.m7435u();
        this.f5392l.mo6803a().execute(new C1374a(u));
        u.mo6781d(new C1375b(u), this.f5392l.mo6803a());
    }
}
