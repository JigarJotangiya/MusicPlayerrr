package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C0865h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
/* compiled from: AsyncListDiffer */
public class C0844d<T> {

    /* renamed from: h */
    private static final Executor f3815h = new C0849c();

    /* renamed from: a */
    private final C0905s f3816a;

    /* renamed from: b */
    final C0842c<T> f3817b;

    /* renamed from: c */
    Executor f3818c;

    /* renamed from: d */
    private final List<C0848b<T>> f3819d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private List<T> f3820e;

    /* renamed from: f */
    private List<T> f3821f = Collections.emptyList();

    /* renamed from: g */
    int f3822g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* compiled from: AsyncListDiffer */
    class C0845a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ List f3823g;

        /* renamed from: h */
        final /* synthetic */ List f3824h;

        /* renamed from: i */
        final /* synthetic */ int f3825i;

        /* renamed from: j */
        final /* synthetic */ Runnable f3826j;

        /* renamed from: androidx.recyclerview.widget.d$a$a */
        /* compiled from: AsyncListDiffer */
        class C0846a extends C0865h.C0867b {
            C0846a() {
            }

            /* renamed from: a */
            public boolean mo5203a(int i, int i2) {
                Object obj = C0845a.this.f3823g.get(i);
                Object obj2 = C0845a.this.f3824h.get(i2);
                if (obj != null && obj2 != null) {
                    return C0844d.this.f3817b.mo5194b().mo5271a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* renamed from: b */
            public boolean mo5204b(int i, int i2) {
                Object obj = C0845a.this.f3823g.get(i);
                Object obj2 = C0845a.this.f3824h.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return C0844d.this.f3817b.mo5194b().mo5272b(obj, obj2);
            }

            /* renamed from: c */
            public Object mo5205c(int i, int i2) {
                Object obj = C0845a.this.f3823g.get(i);
                Object obj2 = C0845a.this.f3824h.get(i2);
                if (obj != null && obj2 != null) {
                    return C0844d.this.f3817b.mo5194b().mo5273c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* renamed from: d */
            public int mo5206d() {
                return C0845a.this.f3824h.size();
            }

            /* renamed from: e */
            public int mo5207e() {
                return C0845a.this.f3823g.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        /* compiled from: AsyncListDiffer */
        class C0847b implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0865h.C0870e f3829g;

            C0847b(C0865h.C0870e eVar) {
                this.f3829g = eVar;
            }

            public void run() {
                C0845a aVar = C0845a.this;
                C0844d dVar = C0844d.this;
                if (dVar.f3822g == aVar.f3825i) {
                    dVar.mo5199c(aVar.f3824h, this.f3829g, aVar.f3826j);
                }
            }
        }

        C0845a(List list, List list2, int i, Runnable runnable) {
            this.f3823g = list;
            this.f3824h = list2;
            this.f3825i = i;
            this.f3826j = runnable;
        }

        public void run() {
            C0844d.this.f3818c.execute(new C0847b(C0865h.m5391b(new C0846a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* compiled from: AsyncListDiffer */
    public interface C0848b<T> {
        /* renamed from: a */
        void mo5209a(List<T> list, List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* compiled from: AsyncListDiffer */
    private static class C0849c implements Executor {

        /* renamed from: g */
        final Handler f3831g = new Handler(Looper.getMainLooper());

        C0849c() {
        }

        public void execute(Runnable runnable) {
            this.f3831g.post(runnable);
        }
    }

    public C0844d(C0905s sVar, C0842c<T> cVar) {
        this.f3816a = sVar;
        this.f3817b = cVar;
        if (cVar.mo5195c() != null) {
            this.f3818c = cVar.mo5195c();
        } else {
            this.f3818c = f3815h;
        }
    }

    /* renamed from: d */
    private void m5317d(List<T> list, Runnable runnable) {
        for (C0848b<T> a : this.f3819d) {
            a.mo5209a(list, this.f3821f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo5197a(C0848b<T> bVar) {
        this.f3819d.add(bVar);
    }

    /* renamed from: b */
    public List<T> mo5198b() {
        return this.f3821f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5199c(List<T> list, C0865h.C0870e eVar, Runnable runnable) {
        List<T> list2 = this.f3821f;
        this.f3820e = list;
        this.f3821f = Collections.unmodifiableList(list);
        eVar.mo5270b(this.f3816a);
        m5317d(list2, runnable);
    }

    /* renamed from: e */
    public void mo5200e(List<T> list) {
        mo5201f(list, (Runnable) null);
    }

    /* renamed from: f */
    public void mo5201f(List<T> list, Runnable runnable) {
        int i = this.f3822g + 1;
        this.f3822g = i;
        List<T> list2 = this.f3820e;
        if (list != list2) {
            List<T> list3 = this.f3821f;
            if (list == null) {
                int size = list2.size();
                this.f3820e = null;
                this.f3821f = Collections.emptyList();
                this.f3816a.mo5175c(0, size);
                m5317d(list3, runnable);
            } else if (list2 == null) {
                this.f3820e = list;
                this.f3821f = Collections.unmodifiableList(list);
                this.f3816a.mo5174b(0, list.size());
                m5317d(list3, runnable);
            } else {
                this.f3817b.mo5193a().execute(new C0845a(list2, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
