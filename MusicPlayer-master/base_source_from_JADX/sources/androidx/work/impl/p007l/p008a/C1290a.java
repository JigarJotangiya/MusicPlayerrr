package androidx.work.impl.p007l.p008a;

import androidx.work.C1405l;
import androidx.work.C1419s;
import androidx.work.impl.p012n.C1340p;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.l.a.a */
/* compiled from: DelayedWorkTracker */
public class C1290a {

    /* renamed from: d */
    static final String f5236d = C1405l.m7462f("DelayedWorkTracker");

    /* renamed from: a */
    final C1292b f5237a;

    /* renamed from: b */
    private final C1419s f5238b;

    /* renamed from: c */
    private final Map<String, Runnable> f5239c = new HashMap();

    /* renamed from: androidx.work.impl.l.a.a$a */
    /* compiled from: DelayedWorkTracker */
    class C1291a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C1340p f5240g;

        C1291a(C1340p pVar) {
            this.f5240g = pVar;
        }

        public void run() {
            C1405l.m7460c().mo6816a(C1290a.f5236d, String.format("Scheduling work %s", new Object[]{this.f5240g.f5313a}), new Throwable[0]);
            C1290a.this.f5237a.mo6556a(this.f5240g);
        }
    }

    public C1290a(C1292b bVar, C1419s sVar) {
        this.f5237a = bVar;
        this.f5238b = sVar;
    }

    /* renamed from: a */
    public void mo6630a(C1340p pVar) {
        Runnable remove = this.f5239c.remove(pVar.f5313a);
        if (remove != null) {
            this.f5238b.mo6530b(remove);
        }
        C1291a aVar = new C1291a(pVar);
        this.f5239c.put(pVar.f5313a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f5238b.mo6529a(pVar.mo6706a() - currentTimeMillis, aVar);
    }

    /* renamed from: b */
    public void mo6631b(String str) {
        Runnable remove = this.f5239c.remove(str);
        if (remove != null) {
            this.f5238b.mo6530b(remove);
        }
    }
}
