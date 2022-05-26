package androidx.work.impl.p007l.p008a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1228b;
import androidx.work.C1405l;
import androidx.work.C1421u;
import androidx.work.impl.C1246b;
import androidx.work.impl.C1264e;
import androidx.work.impl.C1285j;
import androidx.work.impl.p009m.C1295c;
import androidx.work.impl.p009m.C1296d;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.utils.C1367f;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.work.impl.l.a.b */
/* compiled from: GreedyScheduler */
public class C1292b implements C1264e, C1295c, C1246b {

    /* renamed from: o */
    private static final String f5242o = C1405l.m7462f("GreedyScheduler");

    /* renamed from: g */
    private final Context f5243g;

    /* renamed from: h */
    private final C1285j f5244h;

    /* renamed from: i */
    private final C1296d f5245i;

    /* renamed from: j */
    private final Set<C1340p> f5246j = new HashSet();

    /* renamed from: k */
    private C1290a f5247k;

    /* renamed from: l */
    private boolean f5248l;

    /* renamed from: m */
    private final Object f5249m;

    /* renamed from: n */
    Boolean f5250n;

    public C1292b(Context context, C1228b bVar, C1397a aVar, C1285j jVar) {
        this.f5243g = context;
        this.f5244h = jVar;
        this.f5245i = new C1296d(context, aVar, this);
        this.f5247k = new C1290a(this, bVar.mo6467k());
        this.f5249m = new Object();
    }

    /* renamed from: g */
    private void m7140g() {
        this.f5250n = Boolean.valueOf(C1367f.m7387b(this.f5243g, this.f5244h.mo6607i()));
    }

    /* renamed from: h */
    private void m7141h() {
        if (!this.f5248l) {
            this.f5244h.mo6609m().mo6568c(this);
            this.f5248l = true;
        }
    }

    /* renamed from: i */
    private void m7142i(String str) {
        synchronized (this.f5249m) {
            Iterator<C1340p> it = this.f5246j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1340p next = it.next();
                if (next.f5313a.equals(str)) {
                    C1405l.m7460c().mo6816a(f5242o, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f5246j.remove(next);
                    this.f5245i.mo6644d(this.f5246j);
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6556a(C1340p... pVarArr) {
        if (this.f5250n == null) {
            m7140g();
        }
        if (!this.f5250n.booleanValue()) {
            C1405l.m7460c().mo6818d(f5242o, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m7141h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1340p pVar : pVarArr) {
            long a = pVar.mo6706a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f5314b == C1421u.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C1290a aVar = this.f5247k;
                    if (aVar != null) {
                        aVar.mo6630a(pVar);
                    }
                } else if (pVar.mo6707b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && pVar.f5322j.mo6481h()) {
                        C1405l.m7460c().mo6816a(f5242o, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                    } else if (i < 24 || !pVar.f5322j.mo6477e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f5313a);
                    } else {
                        C1405l.m7460c().mo6816a(f5242o, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                    }
                } else {
                    C1405l.m7460c().mo6816a(f5242o, String.format("Starting work for %s", new Object[]{pVar.f5313a}), new Throwable[0]);
                    this.f5244h.mo6616u(pVar.f5313a);
                }
            }
        }
        synchronized (this.f5249m) {
            if (!hashSet.isEmpty()) {
                C1405l.m7460c().mo6816a(f5242o, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f5246j.addAll(hashSet);
                this.f5245i.mo6644d(this.f5246j);
            }
        }
    }

    /* renamed from: b */
    public void mo6541b(List<String> list) {
        for (String next : list) {
            C1405l.m7460c().mo6816a(f5242o, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f5244h.mo6619x(next);
        }
    }

    /* renamed from: c */
    public boolean mo6557c() {
        return false;
    }

    /* renamed from: d */
    public void mo6531d(String str, boolean z) {
        m7142i(str);
    }

    /* renamed from: e */
    public void mo6558e(String str) {
        if (this.f5250n == null) {
            m7140g();
        }
        if (!this.f5250n.booleanValue()) {
            C1405l.m7460c().mo6818d(f5242o, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m7141h();
        C1405l.m7460c().mo6816a(f5242o, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        C1290a aVar = this.f5247k;
        if (aVar != null) {
            aVar.mo6631b(str);
        }
        this.f5244h.mo6619x(str);
    }

    /* renamed from: f */
    public void mo6543f(List<String> list) {
        for (String next : list) {
            C1405l.m7460c().mo6816a(f5242o, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f5244h.mo6616u(next);
        }
    }
}
