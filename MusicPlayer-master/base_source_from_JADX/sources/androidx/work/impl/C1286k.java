package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1228b;
import androidx.work.C1236e;
import androidx.work.C1402j;
import androidx.work.C1405l;
import androidx.work.C1421u;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.C1269a;
import androidx.work.impl.p012n.C1318b;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.p012n.C1342q;
import androidx.work.impl.p012n.C1354t;
import androidx.work.impl.utils.C1365d;
import androidx.work.impl.utils.C1373k;
import androidx.work.impl.utils.C1376l;
import androidx.work.impl.utils.C1378m;
import androidx.work.impl.utils.p013o.C1396c;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p159f.p243f.p327d.p330c.p331a.C7738a;

/* renamed from: androidx.work.impl.k */
/* compiled from: WorkerWrapper */
public class C1286k implements Runnable {

    /* renamed from: z */
    static final String f5201z = C1405l.m7462f("WorkerWrapper");

    /* renamed from: g */
    Context f5202g;

    /* renamed from: h */
    private String f5203h;

    /* renamed from: i */
    private List<C1264e> f5204i;

    /* renamed from: j */
    private WorkerParameters.C1226a f5205j;

    /* renamed from: k */
    C1340p f5206k;

    /* renamed from: l */
    ListenableWorker f5207l;

    /* renamed from: m */
    C1397a f5208m;

    /* renamed from: n */
    ListenableWorker.C1221a f5209n = ListenableWorker.C1221a.m6836a();

    /* renamed from: o */
    private C1228b f5210o;

    /* renamed from: p */
    private C1269a f5211p;

    /* renamed from: q */
    private WorkDatabase f5212q;

    /* renamed from: r */
    private C1342q f5213r;

    /* renamed from: s */
    private C1318b f5214s;

    /* renamed from: t */
    private C1354t f5215t;

    /* renamed from: u */
    private List<String> f5216u;

    /* renamed from: v */
    private String f5217v;

    /* renamed from: w */
    C1396c<Boolean> f5218w = C1396c.m7435u();

    /* renamed from: x */
    C7738a<ListenableWorker.C1221a> f5219x = null;

    /* renamed from: y */
    private volatile boolean f5220y;

    /* renamed from: androidx.work.impl.k$a */
    /* compiled from: WorkerWrapper */
    class C1287a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C7738a f5221g;

        /* renamed from: h */
        final /* synthetic */ C1396c f5222h;

        C1287a(C7738a aVar, C1396c cVar) {
            this.f5221g = aVar;
            this.f5222h = cVar;
        }

        public void run() {
            try {
                this.f5221g.get();
                C1405l.m7460c().mo6816a(C1286k.f5201z, String.format("Starting work for %s", new Object[]{C1286k.this.f5206k.f5315c}), new Throwable[0]);
                C1286k kVar = C1286k.this;
                kVar.f5219x = kVar.f5207l.startWork();
                this.f5222h.mo6790s(C1286k.this.f5219x);
            } catch (Throwable th) {
                this.f5222h.mo6789r(th);
            }
        }
    }

    /* renamed from: androidx.work.impl.k$b */
    /* compiled from: WorkerWrapper */
    class C1288b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C1396c f5224g;

        /* renamed from: h */
        final /* synthetic */ String f5225h;

        C1288b(C1396c cVar, String str) {
            this.f5224g = cVar;
            this.f5225h = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                ListenableWorker.C1221a aVar = (ListenableWorker.C1221a) this.f5224g.get();
                if (aVar == null) {
                    C1405l.m7460c().mo6817b(C1286k.f5201z, String.format("%s returned a null result. Treating it as a failure.", new Object[]{C1286k.this.f5206k.f5315c}), new Throwable[0]);
                } else {
                    C1405l.m7460c().mo6816a(C1286k.f5201z, String.format("%s returned a %s result.", new Object[]{C1286k.this.f5206k.f5315c, aVar}), new Throwable[0]);
                    C1286k.this.f5209n = aVar;
                }
            } catch (CancellationException e) {
                C1405l.m7460c().mo6818d(C1286k.f5201z, String.format("%s was cancelled", new Object[]{this.f5225h}), e);
            } catch (InterruptedException | ExecutionException e2) {
                C1405l.m7460c().mo6817b(C1286k.f5201z, String.format("%s failed because it threw an exception/error", new Object[]{this.f5225h}), e2);
            } catch (Throwable th) {
                C1286k.this.mo6622f();
                throw th;
            }
            C1286k.this.mo6622f();
        }
    }

    /* renamed from: androidx.work.impl.k$c */
    /* compiled from: WorkerWrapper */
    public static class C1289c {

        /* renamed from: a */
        Context f5227a;

        /* renamed from: b */
        ListenableWorker f5228b;

        /* renamed from: c */
        C1269a f5229c;

        /* renamed from: d */
        C1397a f5230d;

        /* renamed from: e */
        C1228b f5231e;

        /* renamed from: f */
        WorkDatabase f5232f;

        /* renamed from: g */
        String f5233g;

        /* renamed from: h */
        List<C1264e> f5234h;

        /* renamed from: i */
        WorkerParameters.C1226a f5235i = new WorkerParameters.C1226a();

        public C1289c(Context context, C1228b bVar, C1397a aVar, C1269a aVar2, WorkDatabase workDatabase, String str) {
            this.f5227a = context.getApplicationContext();
            this.f5230d = aVar;
            this.f5229c = aVar2;
            this.f5231e = bVar;
            this.f5232f = workDatabase;
            this.f5233g = str;
        }

        /* renamed from: a */
        public C1286k mo6627a() {
            return new C1286k(this);
        }

        /* renamed from: b */
        public C1289c mo6628b(WorkerParameters.C1226a aVar) {
            if (aVar != null) {
                this.f5235i = aVar;
            }
            return this;
        }

        /* renamed from: c */
        public C1289c mo6629c(List<C1264e> list) {
            this.f5234h = list;
            return this;
        }
    }

    C1286k(C1289c cVar) {
        this.f5202g = cVar.f5227a;
        this.f5208m = cVar.f5230d;
        this.f5211p = cVar.f5229c;
        this.f5203h = cVar.f5233g;
        this.f5204i = cVar.f5234h;
        this.f5205j = cVar.f5235i;
        this.f5207l = cVar.f5228b;
        this.f5210o = cVar.f5231e;
        WorkDatabase workDatabase = cVar.f5232f;
        this.f5212q = workDatabase;
        this.f5213r = workDatabase.mo6527N();
        this.f5214s = this.f5212q.mo6522F();
        this.f5215t = this.f5212q.mo6528O();
    }

    /* renamed from: a */
    private String m7120a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f5203h);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: c */
    private void m7121c(ListenableWorker.C1221a aVar) {
        if (aVar instanceof ListenableWorker.C1221a.C1224c) {
            C1405l.m7460c().mo6818d(f5201z, String.format("Worker result SUCCESS for %s", new Object[]{this.f5217v}), new Throwable[0]);
            if (this.f5206k.mo6709d()) {
                m7124h();
            } else {
                m7128m();
            }
        } else if (aVar instanceof ListenableWorker.C1221a.C1223b) {
            C1405l.m7460c().mo6818d(f5201z, String.format("Worker result RETRY for %s", new Object[]{this.f5217v}), new Throwable[0]);
            m7123g();
        } else {
            C1405l.m7460c().mo6818d(f5201z, String.format("Worker result FAILURE for %s", new Object[]{this.f5217v}), new Throwable[0]);
            if (this.f5206k.mo6709d()) {
                m7124h();
            } else {
                mo6623l();
            }
        }
    }

    /* renamed from: e */
    private void m7122e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f5213r.mo6727m(str2) != C1421u.CANCELLED) {
                this.f5213r.mo6716b(C1421u.FAILED, str2);
            }
            linkedList.addAll(this.f5214s.mo6683b(str2));
        }
    }

    /* renamed from: g */
    private void m7123g() {
        this.f5212q.mo5576c();
        try {
            this.f5213r.mo6716b(C1421u.ENQUEUED, this.f5203h);
            this.f5213r.mo6733s(this.f5203h, System.currentTimeMillis());
            this.f5213r.mo6717c(this.f5203h, -1);
            this.f5212q.mo5573C();
        } finally {
            this.f5212q.mo5580g();
            m7125i(true);
        }
    }

    /* renamed from: h */
    private void m7124h() {
        this.f5212q.mo5576c();
        try {
            this.f5213r.mo6733s(this.f5203h, System.currentTimeMillis());
            this.f5213r.mo6716b(C1421u.ENQUEUED, this.f5203h);
            this.f5213r.mo6729o(this.f5203h);
            this.f5213r.mo6717c(this.f5203h, -1);
            this.f5212q.mo5573C();
        } finally {
            this.f5212q.mo5580g();
            m7125i(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    private void m7125i(boolean z) {
        ListenableWorker listenableWorker;
        this.f5212q.mo5576c();
        try {
            if (!this.f5212q.mo6527N().mo6725k()) {
                C1365d.m7382a(this.f5202g, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f5213r.mo6716b(C1421u.ENQUEUED, this.f5203h);
                this.f5213r.mo6717c(this.f5203h, -1);
            }
            if (!(this.f5206k == null || (listenableWorker = this.f5207l) == null || !listenableWorker.isRunInForeground())) {
                this.f5211p.mo6567b(this.f5203h);
            }
            this.f5212q.mo5573C();
            this.f5212q.mo5580g();
            this.f5218w.mo6788q(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f5212q.mo5580g();
            throw th;
        }
    }

    /* renamed from: j */
    private void m7126j() {
        C1421u m = this.f5213r.mo6727m(this.f5203h);
        if (m == C1421u.RUNNING) {
            C1405l.m7460c().mo6816a(f5201z, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f5203h}), new Throwable[0]);
            m7125i(true);
            return;
        }
        C1405l.m7460c().mo6816a(f5201z, String.format("Status for %s is %s; not doing any work", new Object[]{this.f5203h, m}), new Throwable[0]);
        m7125i(false);
    }

    /* renamed from: k */
    private void m7127k() {
        C1236e b;
        if (!m7129n()) {
            this.f5212q.mo5576c();
            try {
                C1340p n = this.f5213r.mo6728n(this.f5203h);
                this.f5206k = n;
                if (n == null) {
                    C1405l.m7460c().mo6817b(f5201z, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f5203h}), new Throwable[0]);
                    m7125i(false);
                    this.f5212q.mo5573C();
                } else if (n.f5314b != C1421u.ENQUEUED) {
                    m7126j();
                    this.f5212q.mo5573C();
                    C1405l.m7460c().mo6816a(f5201z, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f5206k.f5315c}), new Throwable[0]);
                    this.f5212q.mo5580g();
                } else {
                    if (n.mo6709d() || this.f5206k.mo6708c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C1340p pVar = this.f5206k;
                        if (!(pVar.f5326n == 0) && currentTimeMillis < pVar.mo6706a()) {
                            C1405l.m7460c().mo6816a(f5201z, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f5206k.f5315c}), new Throwable[0]);
                            m7125i(true);
                            this.f5212q.mo5573C();
                            this.f5212q.mo5580g();
                            return;
                        }
                    }
                    this.f5212q.mo5573C();
                    this.f5212q.mo5580g();
                    if (this.f5206k.mo6709d()) {
                        b = this.f5206k.f5317e;
                    } else {
                        C1402j b2 = this.f5210o.mo6462f().mo6815b(this.f5206k.f5316d);
                        if (b2 == null) {
                            C1405l.m7460c().mo6817b(f5201z, String.format("Could not create Input Merger %s", new Object[]{this.f5206k.f5316d}), new Throwable[0]);
                            mo6623l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f5206k.f5317e);
                        arrayList.addAll(this.f5213r.mo6731q(this.f5203h));
                        b = b2.mo6410b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f5203h), b, this.f5216u, this.f5205j, this.f5206k.f5323k, this.f5210o.mo6461e(), this.f5208m, this.f5210o.mo6469m(), new C1378m(this.f5212q, this.f5208m), new C1376l(this.f5212q, this.f5211p, this.f5208m));
                    if (this.f5207l == null) {
                        this.f5207l = this.f5210o.mo6469m().mo6839b(this.f5202g, this.f5206k.f5315c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f5207l;
                    if (listenableWorker == null) {
                        C1405l.m7460c().mo6817b(f5201z, String.format("Could not create Worker %s", new Object[]{this.f5206k.f5315c}), new Throwable[0]);
                        mo6623l();
                    } else if (listenableWorker.isUsed()) {
                        C1405l.m7460c().mo6817b(f5201z, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f5206k.f5315c}), new Throwable[0]);
                        mo6623l();
                    } else {
                        this.f5207l.setUsed();
                        if (!m7130o()) {
                            m7126j();
                        } else if (!m7129n()) {
                            C1396c u = C1396c.m7435u();
                            C1373k kVar = new C1373k(this.f5202g, this.f5206k, this.f5207l, workerParameters.mo6448b(), this.f5208m);
                            this.f5208m.mo6803a().execute(kVar);
                            C7738a<Void> a = kVar.mo6767a();
                            a.mo6781d(new C1287a(a, u), this.f5208m.mo6803a());
                            u.mo6781d(new C1288b(u, this.f5217v), this.f5208m.mo6805c());
                        }
                    }
                }
            } finally {
                this.f5212q.mo5580g();
            }
        }
    }

    /* renamed from: m */
    private void m7128m() {
        this.f5212q.mo5576c();
        try {
            this.f5213r.mo6716b(C1421u.SUCCEEDED, this.f5203h);
            this.f5213r.mo6723i(this.f5203h, ((ListenableWorker.C1221a.C1224c) this.f5209n).mo6440e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f5214s.mo6683b(this.f5203h)) {
                if (this.f5213r.mo6727m(next) == C1421u.BLOCKED && this.f5214s.mo6684c(next)) {
                    C1405l.m7460c().mo6818d(f5201z, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.f5213r.mo6716b(C1421u.ENQUEUED, next);
                    this.f5213r.mo6733s(next, currentTimeMillis);
                }
            }
            this.f5212q.mo5573C();
        } finally {
            this.f5212q.mo5580g();
            m7125i(false);
        }
    }

    /* renamed from: n */
    private boolean m7129n() {
        if (!this.f5220y) {
            return false;
        }
        C1405l.m7460c().mo6816a(f5201z, String.format("Work interrupted for %s", new Object[]{this.f5217v}), new Throwable[0]);
        C1421u m = this.f5213r.mo6727m(this.f5203h);
        if (m == null) {
            m7125i(false);
        } else {
            m7125i(!m.isFinished());
        }
        return true;
    }

    /* renamed from: o */
    private boolean m7130o() {
        this.f5212q.mo5576c();
        try {
            boolean z = true;
            if (this.f5213r.mo6727m(this.f5203h) == C1421u.ENQUEUED) {
                this.f5213r.mo6716b(C1421u.RUNNING, this.f5203h);
                this.f5213r.mo6732r(this.f5203h);
            } else {
                z = false;
            }
            this.f5212q.mo5573C();
            return z;
        } finally {
            this.f5212q.mo5580g();
        }
    }

    /* renamed from: b */
    public C7738a<Boolean> mo6620b() {
        return this.f5218w;
    }

    /* renamed from: d */
    public void mo6621d() {
        boolean z;
        this.f5220y = true;
        m7129n();
        C7738a<ListenableWorker.C1221a> aVar = this.f5219x;
        if (aVar != null) {
            z = aVar.isDone();
            this.f5219x.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f5207l;
        if (listenableWorker == null || z) {
            C1405l.m7460c().mo6816a(f5201z, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.f5206k}), new Throwable[0]);
            return;
        }
        listenableWorker.stop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo6622f() {
        if (!m7129n()) {
            this.f5212q.mo5576c();
            try {
                C1421u m = this.f5213r.mo6727m(this.f5203h);
                this.f5212q.mo6526M().mo6702a(this.f5203h);
                if (m == null) {
                    m7125i(false);
                } else if (m == C1421u.RUNNING) {
                    m7121c(this.f5209n);
                } else if (!m.isFinished()) {
                    m7123g();
                }
                this.f5212q.mo5573C();
            } finally {
                this.f5212q.mo5580g();
            }
        }
        List<C1264e> list = this.f5204i;
        if (list != null) {
            for (C1264e e : list) {
                e.mo6558e(this.f5203h);
            }
            C1265f.m7047b(this.f5210o, this.f5212q, this.f5204i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6623l() {
        this.f5212q.mo5576c();
        try {
            m7122e(this.f5203h);
            this.f5213r.mo6723i(this.f5203h, ((ListenableWorker.C1221a.C1222a) this.f5209n).mo6433e());
            this.f5212q.mo5573C();
        } finally {
            this.f5212q.mo5580g();
            m7125i(false);
        }
    }

    public void run() {
        List<String> b = this.f5215t.mo6738b(this.f5203h);
        this.f5216u = b;
        this.f5217v = m7120a(b);
        m7127k();
    }
}
