package androidx.lifecycle;

import androidx.lifecycle.C0697n;
import java.util.Iterator;
import java.util.Map;
import p082e.p091b.p092a.p093a.C3445a;
import p082e.p091b.p092a.p094b.C3451b;

public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f3235k = new Object();

    /* renamed from: a */
    final Object f3236a;

    /* renamed from: b */
    private C3451b<C0672f0<? super T>, LiveData<T>.C1428c> f3237b;

    /* renamed from: c */
    int f3238c;

    /* renamed from: d */
    private boolean f3239d;

    /* renamed from: e */
    private volatile Object f3240e;

    /* renamed from: f */
    volatile Object f3241f;

    /* renamed from: g */
    private int f3242g;

    /* renamed from: h */
    private boolean f3243h;

    /* renamed from: i */
    private boolean f3244i;

    /* renamed from: j */
    private final Runnable f3245j;

    class LifecycleBoundObserver extends LiveData<T>.C1428c implements C0715s {

        /* renamed from: k */
        final C0718v f3246k;

        LifecycleBoundObserver(C0718v vVar, C0672f0<? super T> f0Var) {
            super(f0Var);
            this.f3246k = vVar;
        }

        /* renamed from: c */
        public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
            C0697n.C0700c b = this.f3246k.mo390v().mo4257b();
            if (b == C0697n.C0700c.DESTROYED) {
                LiveData.this.mo4154m(this.f3249g);
                return;
            }
            C0697n.C0700c cVar = null;
            while (cVar != b) {
                mo4161h(mo4159k());
                cVar = b;
                b = this.f3246k.mo390v().mo4257b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4157i() {
            this.f3246k.mo390v().mo4258c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo4158j(C0718v vVar) {
            return this.f3246k == vVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4159k() {
            return this.f3246k.mo390v().mo4257b().isAtLeast(C0697n.C0700c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C0645a implements Runnable {
        C0645a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f3236a) {
                obj = LiveData.this.f3241f;
                LiveData.this.f3241f = LiveData.f3235k;
            }
            LiveData.this.mo4156o(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C0646b extends LiveData<T>.C1428c {
        C0646b(LiveData liveData, C0672f0<? super T> f0Var) {
            super(f0Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4159k() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C0647c {

        /* renamed from: g */
        final C0672f0<? super T> f3249g;

        /* renamed from: h */
        boolean f3250h;

        /* renamed from: i */
        int f3251i = -1;

        C0647c(C0672f0<? super T> f0Var) {
            this.f3249g = f0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4161h(boolean z) {
            if (z != this.f3250h) {
                this.f3250h = z;
                LiveData.this.mo4144b(z ? 1 : -1);
                if (this.f3250h) {
                    LiveData.this.mo4145d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4157i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo4158j(C0718v vVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public abstract boolean mo4159k();
    }

    public LiveData(T t) {
        this.f3236a = new Object();
        this.f3237b = new C3451b<>();
        this.f3238c = 0;
        this.f3241f = f3235k;
        this.f3245j = new C0645a();
        this.f3240e = t;
        this.f3242g = 0;
    }

    /* renamed from: a */
    static void m4136a(String str) {
        if (!C3445a.m14718f().mo12229c()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: c */
    private void m4137c(LiveData<T>.C1428c cVar) {
        if (cVar.f3250h) {
            if (!cVar.mo4159k()) {
                cVar.mo4161h(false);
                return;
            }
            int i = cVar.f3251i;
            int i2 = this.f3242g;
            if (i < i2) {
                cVar.f3251i = i2;
                cVar.f3249g.onChanged(this.f3240e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4144b(int i) {
        int i2 = this.f3238c;
        this.f3238c = i + i2;
        if (!this.f3239d) {
            this.f3239d = true;
            while (true) {
                try {
                    int i3 = this.f3238c;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            mo4151j();
                        } else if (z2) {
                            mo4152k();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f3239d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4145d(LiveData<T>.C1428c cVar) {
        if (this.f3243h) {
            this.f3244i = true;
            return;
        }
        this.f3243h = true;
        do {
            this.f3244i = false;
            if (cVar == null) {
                C3451b<K, V>.d s = this.f3237b.mo12244s();
                while (s.hasNext()) {
                    m4137c((C0647c) ((Map.Entry) s.next()).getValue());
                    if (this.f3244i) {
                        break;
                    }
                }
            } else {
                m4137c(cVar);
                cVar = null;
            }
        } while (this.f3244i);
        this.f3243h = false;
    }

    /* renamed from: e */
    public T mo4146e() {
        T t = this.f3240e;
        if (t != f3235k) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo4147f() {
        return this.f3242g;
    }

    /* renamed from: g */
    public boolean mo4148g() {
        return this.f3238c > 0;
    }

    /* renamed from: h */
    public void mo4149h(C0718v vVar, C0672f0<? super T> f0Var) {
        m4136a("observe");
        if (vVar.mo390v().mo4257b() != C0697n.C0700c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(vVar, f0Var);
            C0647c v = this.f3237b.mo12236v(f0Var, lifecycleBoundObserver);
            if (v != null && !v.mo4158j(vVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (v == null) {
                vVar.mo390v().mo4256a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: i */
    public void mo4150i(C0672f0<? super T> f0Var) {
        m4136a("observeForever");
        C0646b bVar = new C0646b(this, f0Var);
        C0647c v = this.f3237b.mo12236v(f0Var, bVar);
        if (v instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (v == null) {
            bVar.mo4161h(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo4151j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4152k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo4153l(T t) {
        boolean z;
        synchronized (this.f3236a) {
            z = this.f3241f == f3235k;
            this.f3241f = t;
        }
        if (z) {
            C3445a.m14718f().mo12230d(this.f3245j);
        }
    }

    /* renamed from: m */
    public void mo4154m(C0672f0<? super T> f0Var) {
        m4136a("removeObserver");
        C0647c x = this.f3237b.mo12237x(f0Var);
        if (x != null) {
            x.mo4157i();
            x.mo4161h(false);
        }
    }

    /* renamed from: n */
    public void mo4155n(C0718v vVar) {
        m4136a("removeObservers");
        Iterator<Map.Entry<C0672f0<? super T>, LiveData<T>.C1428c>> it = this.f3237b.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((C0647c) next.getValue()).mo4158j(vVar)) {
                mo4154m((C0672f0) next.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo4156o(T t) {
        m4136a("setValue");
        this.f3242g++;
        this.f3240e = t;
        mo4145d((LiveData<T>.C1428c) null);
    }

    public LiveData() {
        this.f3236a = new Object();
        this.f3237b = new C3451b<>();
        this.f3238c = 0;
        Object obj = f3235k;
        this.f3241f = obj;
        this.f3245j = new C0645a();
        this.f3240e = obj;
        this.f3242g = -1;
    }
}
