package androidx.work.impl.p009m.p010e;

import androidx.work.impl.p009m.C1293a;
import androidx.work.impl.p009m.p011f.C1310d;
import androidx.work.impl.p012n.C1340p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.m.e.c */
/* compiled from: ConstraintController */
public abstract class C1299c<T> implements C1293a<T> {

    /* renamed from: a */
    private final List<String> f5259a = new ArrayList();

    /* renamed from: b */
    private T f5260b;

    /* renamed from: c */
    private C1310d<T> f5261c;

    /* renamed from: d */
    private C1300a f5262d;

    /* renamed from: androidx.work.impl.m.e.c$a */
    /* compiled from: ConstraintController */
    public interface C1300a {
        /* renamed from: a */
        void mo6641a(List<String> list);

        /* renamed from: b */
        void mo6642b(List<String> list);
    }

    C1299c(C1310d<T> dVar) {
        this.f5261c = dVar;
    }

    /* renamed from: h */
    private void m7167h(C1300a aVar, T t) {
        if (!this.f5259a.isEmpty() && aVar != null) {
            if (t == null || mo6647c(t)) {
                aVar.mo6642b(this.f5259a);
            } else {
                aVar.mo6641a(this.f5259a);
            }
        }
    }

    /* renamed from: a */
    public void mo6633a(T t) {
        this.f5260b = t;
        m7167h(this.f5262d, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo6646b(C1340p pVar);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo6647c(T t);

    /* renamed from: d */
    public boolean mo6650d(String str) {
        T t = this.f5260b;
        return t != null && mo6647c(t) && this.f5259a.contains(str);
    }

    /* renamed from: e */
    public void mo6651e(Iterable<C1340p> iterable) {
        this.f5259a.clear();
        for (C1340p next : iterable) {
            if (mo6646b(next)) {
                this.f5259a.add(next.f5313a);
            }
        }
        if (this.f5259a.isEmpty()) {
            this.f5261c.mo6668c(this);
        } else {
            this.f5261c.mo6667a(this);
        }
        m7167h(this.f5262d, this.f5260b);
    }

    /* renamed from: f */
    public void mo6652f() {
        if (!this.f5259a.isEmpty()) {
            this.f5259a.clear();
            this.f5261c.mo6668c(this);
        }
    }

    /* renamed from: g */
    public void mo6653g(C1300a aVar) {
        if (this.f5262d != aVar) {
            this.f5262d = aVar;
            m7167h(aVar, this.f5260b);
        }
    }
}
