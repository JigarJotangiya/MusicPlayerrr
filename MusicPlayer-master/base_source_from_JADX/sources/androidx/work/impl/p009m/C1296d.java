package androidx.work.impl.p009m;

import android.content.Context;
import androidx.work.C1405l;
import androidx.work.impl.p009m.p010e.C1297a;
import androidx.work.impl.p009m.p010e.C1298b;
import androidx.work.impl.p009m.p010e.C1299c;
import androidx.work.impl.p009m.p010e.C1301d;
import androidx.work.impl.p009m.p010e.C1302e;
import androidx.work.impl.p009m.p010e.C1303f;
import androidx.work.impl.p009m.p010e.C1304g;
import androidx.work.impl.p009m.p010e.C1305h;
import androidx.work.impl.p012n.C1340p;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.m.d */
/* compiled from: WorkConstraintsTracker */
public class C1296d implements C1299c.C1300a {

    /* renamed from: d */
    private static final String f5255d = C1405l.m7462f("WorkConstraintsTracker");

    /* renamed from: a */
    private final C1295c f5256a;

    /* renamed from: b */
    private final C1299c<?>[] f5257b;

    /* renamed from: c */
    private final Object f5258c = new Object();

    public C1296d(Context context, C1397a aVar, C1295c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5256a = cVar;
        this.f5257b = new C1299c[]{new C1297a(applicationContext, aVar), new C1298b(applicationContext, aVar), new C1305h(applicationContext, aVar), new C1301d(applicationContext, aVar), new C1304g(applicationContext, aVar), new C1303f(applicationContext, aVar), new C1302e(applicationContext, aVar)};
    }

    /* renamed from: a */
    public void mo6641a(List<String> list) {
        synchronized (this.f5258c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (mo6643c(next)) {
                    C1405l.m7460c().mo6816a(f5255d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            C1295c cVar = this.f5256a;
            if (cVar != null) {
                cVar.mo6543f(arrayList);
            }
        }
    }

    /* renamed from: b */
    public void mo6642b(List<String> list) {
        synchronized (this.f5258c) {
            C1295c cVar = this.f5256a;
            if (cVar != null) {
                cVar.mo6541b(list);
            }
        }
    }

    /* renamed from: c */
    public boolean mo6643c(String str) {
        synchronized (this.f5258c) {
            for (C1299c<?> cVar : this.f5257b) {
                if (cVar.mo6650d(str)) {
                    C1405l.m7460c().mo6816a(f5255d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void mo6644d(Iterable<C1340p> iterable) {
        synchronized (this.f5258c) {
            for (C1299c<?> g : this.f5257b) {
                g.mo6653g((C1299c.C1300a) null);
            }
            for (C1299c<?> e : this.f5257b) {
                e.mo6651e(iterable);
            }
            for (C1299c<?> g2 : this.f5257b) {
                g2.mo6653g(this);
            }
        }
    }

    /* renamed from: e */
    public void mo6645e() {
        synchronized (this.f5258c) {
            for (C1299c<?> f : this.f5257b) {
                f.mo6652f();
            }
        }
    }
}
