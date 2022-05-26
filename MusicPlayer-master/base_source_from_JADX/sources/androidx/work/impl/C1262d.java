package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.C0506a;
import androidx.work.C1228b;
import androidx.work.C1239g;
import androidx.work.C1405l;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1286k;
import androidx.work.impl.foreground.C1269a;
import androidx.work.impl.foreground.C1270b;
import androidx.work.impl.utils.C1372j;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p159f.p243f.p327d.p330c.p331a.C7738a;

/* renamed from: androidx.work.impl.d */
/* compiled from: Processor */
public class C1262d implements C1246b, C1269a {

    /* renamed from: r */
    private static final String f5123r = C1405l.m7462f("Processor");

    /* renamed from: g */
    private PowerManager.WakeLock f5124g;

    /* renamed from: h */
    private Context f5125h;

    /* renamed from: i */
    private C1228b f5126i;

    /* renamed from: j */
    private C1397a f5127j;

    /* renamed from: k */
    private WorkDatabase f5128k;

    /* renamed from: l */
    private Map<String, C1286k> f5129l = new HashMap();

    /* renamed from: m */
    private Map<String, C1286k> f5130m = new HashMap();

    /* renamed from: n */
    private List<C1264e> f5131n;

    /* renamed from: o */
    private Set<String> f5132o;

    /* renamed from: p */
    private final List<C1246b> f5133p;

    /* renamed from: q */
    private final Object f5134q;

    /* renamed from: androidx.work.impl.d$a */
    /* compiled from: Processor */
    private static class C1263a implements Runnable {

        /* renamed from: g */
        private C1246b f5135g;

        /* renamed from: h */
        private String f5136h;

        /* renamed from: i */
        private C7738a<Boolean> f5137i;

        C1263a(C1246b bVar, String str, C7738a<Boolean> aVar) {
            this.f5135g = bVar;
            this.f5136h = str;
            this.f5137i = aVar;
        }

        public void run() {
            boolean z;
            try {
                z = this.f5137i.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f5135g.mo6531d(this.f5136h, z);
        }
    }

    public C1262d(Context context, C1228b bVar, C1397a aVar, WorkDatabase workDatabase, List<C1264e> list) {
        this.f5125h = context;
        this.f5126i = bVar;
        this.f5127j = aVar;
        this.f5128k = workDatabase;
        this.f5131n = list;
        this.f5132o = new HashSet();
        this.f5133p = new ArrayList();
        this.f5124g = null;
        this.f5134q = new Object();
    }

    /* renamed from: e */
    private static boolean m7028e(String str, C1286k kVar) {
        if (kVar != null) {
            kVar.mo6621d();
            C1405l.m7460c().mo6816a(f5123r, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        C1405l.m7460c().mo6816a(f5123r, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    /* renamed from: m */
    private void m7029m() {
        synchronized (this.f5134q) {
            if (!(!this.f5129l.isEmpty())) {
                try {
                    this.f5125h.startService(C1270b.m7057e(this.f5125h));
                } catch (Throwable th) {
                    C1405l.m7460c().mo6817b(f5123r, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f5124g;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f5124g = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6566a(String str, C1239g gVar) {
        synchronized (this.f5134q) {
            C1405l.m7460c().mo6818d(f5123r, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            C1286k remove = this.f5130m.remove(str);
            if (remove != null) {
                if (this.f5124g == null) {
                    PowerManager.WakeLock b = C1372j.m7391b(this.f5125h, "ProcessorForegroundLck");
                    this.f5124g = b;
                    b.acquire();
                }
                this.f5129l.put(str, remove);
                C0506a.m3157i(this.f5125h, C1270b.m7056c(this.f5125h, str, gVar));
            }
        }
    }

    /* renamed from: b */
    public void mo6567b(String str) {
        synchronized (this.f5134q) {
            this.f5129l.remove(str);
            m7029m();
        }
    }

    /* renamed from: c */
    public void mo6568c(C1246b bVar) {
        synchronized (this.f5134q) {
            this.f5133p.add(bVar);
        }
    }

    /* renamed from: d */
    public void mo6531d(String str, boolean z) {
        synchronized (this.f5134q) {
            this.f5130m.remove(str);
            C1405l.m7460c().mo6816a(f5123r, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (C1246b d : this.f5133p) {
                d.mo6531d(str, z);
            }
        }
    }

    /* renamed from: f */
    public boolean mo6569f(String str) {
        boolean contains;
        synchronized (this.f5134q) {
            contains = this.f5132o.contains(str);
        }
        return contains;
    }

    /* renamed from: g */
    public boolean mo6570g(String str) {
        boolean z;
        synchronized (this.f5134q) {
            if (!this.f5130m.containsKey(str)) {
                if (!this.f5129l.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo6571h(String str) {
        boolean containsKey;
        synchronized (this.f5134q) {
            containsKey = this.f5129l.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: i */
    public void mo6572i(C1246b bVar) {
        synchronized (this.f5134q) {
            this.f5133p.remove(bVar);
        }
    }

    /* renamed from: j */
    public boolean mo6573j(String str) {
        return mo6574k(str, (WorkerParameters.C1226a) null);
    }

    /* renamed from: k */
    public boolean mo6574k(String str, WorkerParameters.C1226a aVar) {
        synchronized (this.f5134q) {
            if (mo6570g(str)) {
                C1405l.m7460c().mo6816a(f5123r, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            C1286k.C1289c cVar = new C1286k.C1289c(this.f5125h, this.f5126i, this.f5127j, this, this.f5128k, str);
            cVar.mo6629c(this.f5131n);
            cVar.mo6628b(aVar);
            C1286k a = cVar.mo6627a();
            C7738a<Boolean> b = a.mo6620b();
            b.mo6781d(new C1263a(this, str, b), this.f5127j.mo6803a());
            this.f5130m.put(str, a);
            this.f5127j.mo6805c().execute(a);
            C1405l.m7460c().mo6816a(f5123r, String.format("%s: processing %s", new Object[]{C1262d.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean mo6575l(String str) {
        boolean e;
        synchronized (this.f5134q) {
            boolean z = true;
            C1405l.m7460c().mo6816a(f5123r, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f5132o.add(str);
            C1286k remove = this.f5129l.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.f5130m.remove(str);
            }
            e = m7028e(str, remove);
            if (z) {
                m7029m();
            }
        }
        return e;
    }

    /* renamed from: n */
    public boolean mo6576n(String str) {
        boolean e;
        synchronized (this.f5134q) {
            C1405l.m7460c().mo6816a(f5123r, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            e = m7028e(str, this.f5129l.remove(str));
        }
        return e;
    }

    /* renamed from: o */
    public boolean mo6577o(String str) {
        boolean e;
        synchronized (this.f5134q) {
            C1405l.m7460c().mo6816a(f5123r, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            e = m7028e(str, this.f5130m.remove(str));
        }
        return e;
    }
}
