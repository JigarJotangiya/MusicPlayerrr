package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.p026y.C1679d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.m */
/* compiled from: LottieTask */
public class C1495m<T> {

    /* renamed from: e */
    public static Executor f5753e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<C1490h<T>> f5754a;

    /* renamed from: b */
    private final Set<C1490h<Throwable>> f5755b;

    /* renamed from: c */
    private final Handler f5756c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile C1494l<T> f5757d;

    /* renamed from: com.airbnb.lottie.m$a */
    /* compiled from: LottieTask */
    class C1496a implements Runnable {
        C1496a() {
        }

        public void run() {
            if (C1495m.this.f5757d != null) {
                C1494l a = C1495m.this.f5757d;
                if (a.mo7118b() != null) {
                    C1495m.this.m7762i(a.mo7118b());
                } else {
                    C1495m.this.m7760g(a.mo7117a());
                }
            }
        }
    }

    /* renamed from: com.airbnb.lottie.m$b */
    /* compiled from: LottieTask */
    private class C1497b extends FutureTask<C1494l<T>> {
        C1497b(Callable<C1494l<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    C1495m.this.m7763l((C1494l) get());
                } catch (InterruptedException | ExecutionException e) {
                    C1495m.this.m7763l(new C1494l(e));
                }
            }
        }
    }

    public C1495m(Callable<C1494l<T>> callable) {
        this(callable, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public synchronized void m7760g(Throwable th) {
        ArrayList<C1490h> arrayList = new ArrayList<>(this.f5755b);
        if (arrayList.isEmpty()) {
            C1679d.m8417d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (C1490h a : arrayList) {
            a.mo6989a(th);
        }
    }

    /* renamed from: h */
    private void m7761h() {
        this.f5756c.post(new C1496a());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m7762i(T t) {
        for (C1490h a : new ArrayList(this.f5754a)) {
            a.mo6989a(t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m7763l(C1494l<T> lVar) {
        if (this.f5757d == null) {
            this.f5757d = lVar;
            m7761h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: e */
    public synchronized C1495m<T> mo7121e(C1490h<Throwable> hVar) {
        if (!(this.f5757d == null || this.f5757d.mo7117a() == null)) {
            hVar.mo6989a(this.f5757d.mo7117a());
        }
        this.f5755b.add(hVar);
        return this;
    }

    /* renamed from: f */
    public synchronized C1495m<T> mo7122f(C1490h<T> hVar) {
        if (!(this.f5757d == null || this.f5757d.mo7118b() == null)) {
            hVar.mo6989a(this.f5757d.mo7118b());
        }
        this.f5754a.add(hVar);
        return this;
    }

    /* renamed from: j */
    public synchronized C1495m<T> mo7123j(C1490h<Throwable> hVar) {
        this.f5755b.remove(hVar);
        return this;
    }

    /* renamed from: k */
    public synchronized C1495m<T> mo7124k(C1490h<T> hVar) {
        this.f5754a.remove(hVar);
        return this;
    }

    C1495m(Callable<C1494l<T>> callable, boolean z) {
        this.f5754a = new LinkedHashSet(1);
        this.f5755b = new LinkedHashSet(1);
        this.f5756c = new Handler(Looper.getMainLooper());
        this.f5757d = null;
        if (z) {
            try {
                m7763l(callable.call());
            } catch (Throwable th) {
                m7763l(new C1494l(th));
            }
        } else {
            f5753e.execute(new C1497b(callable));
        }
    }
}
