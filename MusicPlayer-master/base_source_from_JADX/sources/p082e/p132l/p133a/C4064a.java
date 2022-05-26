package p082e.p132l.p133a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p082e.p098e.C3478g;

/* renamed from: e.l.a.a */
/* compiled from: AnimationHandler */
class C4064a {

    /* renamed from: g */
    public static final ThreadLocal<C4064a> f12246g = new ThreadLocal<>();

    /* renamed from: a */
    private final C3478g<C4066b, Long> f12247a = new C3478g<>();

    /* renamed from: b */
    final ArrayList<C4066b> f12248b = new ArrayList<>();

    /* renamed from: c */
    private final C4065a f12249c = new C4065a();

    /* renamed from: d */
    private C4067c f12250d;

    /* renamed from: e */
    long f12251e = 0;

    /* renamed from: f */
    private boolean f12252f = false;

    /* renamed from: e.l.a.a$a */
    /* compiled from: AnimationHandler */
    class C4065a {
        C4065a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14117a() {
            C4064a.this.f12251e = SystemClock.uptimeMillis();
            C4064a aVar = C4064a.this;
            aVar.mo14114c(aVar.f12251e);
            if (C4064a.this.f12248b.size() > 0) {
                C4064a.this.mo14115e().mo14119a();
            }
        }
    }

    /* renamed from: e.l.a.a$b */
    /* compiled from: AnimationHandler */
    interface C4066b {
        /* renamed from: a */
        boolean mo14118a(long j);
    }

    /* renamed from: e.l.a.a$c */
    /* compiled from: AnimationHandler */
    static abstract class C4067c {

        /* renamed from: a */
        final C4065a f12254a;

        C4067c(C4065a aVar) {
            this.f12254a = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo14119a();
    }

    /* renamed from: e.l.a.a$d */
    /* compiled from: AnimationHandler */
    private static class C4068d extends C4067c {

        /* renamed from: b */
        private final Runnable f12255b = new C4069a();

        /* renamed from: c */
        private final Handler f12256c = new Handler(Looper.myLooper());

        /* renamed from: d */
        long f12257d = -1;

        /* renamed from: e.l.a.a$d$a */
        /* compiled from: AnimationHandler */
        class C4069a implements Runnable {
            C4069a() {
            }

            public void run() {
                C4068d.this.f12257d = SystemClock.uptimeMillis();
                C4068d.this.f12254a.mo14117a();
            }
        }

        C4068d(C4065a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14119a() {
            this.f12256c.postDelayed(this.f12255b, Math.max(10 - (SystemClock.uptimeMillis() - this.f12257d), 0));
        }
    }

    /* renamed from: e.l.a.a$e */
    /* compiled from: AnimationHandler */
    private static class C4070e extends C4067c {

        /* renamed from: b */
        private final Choreographer f12259b = Choreographer.getInstance();

        /* renamed from: c */
        private final Choreographer.FrameCallback f12260c = new C4071a();

        /* renamed from: e.l.a.a$e$a */
        /* compiled from: AnimationHandler */
        class C4071a implements Choreographer.FrameCallback {
            C4071a() {
            }

            public void doFrame(long j) {
                C4070e.this.f12254a.mo14117a();
            }
        }

        C4070e(C4065a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14119a() {
            this.f12259b.postFrameCallback(this.f12260c);
        }
    }

    C4064a() {
    }

    /* renamed from: b */
    private void m18023b() {
        if (this.f12252f) {
            for (int size = this.f12248b.size() - 1; size >= 0; size--) {
                if (this.f12248b.get(size) == null) {
                    this.f12248b.remove(size);
                }
            }
            this.f12252f = false;
        }
    }

    /* renamed from: d */
    public static C4064a m18024d() {
        ThreadLocal<C4064a> threadLocal = f12246g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C4064a());
        }
        return threadLocal.get();
    }

    /* renamed from: f */
    private boolean m18025f(C4066b bVar, long j) {
        Long l = this.f12247a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f12247a.remove(bVar);
        return true;
    }

    /* renamed from: a */
    public void mo14113a(C4066b bVar, long j) {
        if (this.f12248b.size() == 0) {
            mo14115e().mo14119a();
        }
        if (!this.f12248b.contains(bVar)) {
            this.f12248b.add(bVar);
        }
        if (j > 0) {
            this.f12247a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14114c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f12248b.size(); i++) {
            C4066b bVar = this.f12248b.get(i);
            if (bVar != null && m18025f(bVar, uptimeMillis)) {
                bVar.mo14118a(j);
            }
        }
        m18023b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C4067c mo14115e() {
        if (this.f12250d == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                this.f12250d = new C4070e(this.f12249c);
            } else {
                this.f12250d = new C4068d(this.f12249c);
            }
        }
        return this.f12250d;
    }

    /* renamed from: g */
    public void mo14116g(C4066b bVar) {
        this.f12247a.remove(bVar);
        int indexOf = this.f12248b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f12248b.set(indexOf, (Object) null);
            this.f12252f = true;
        }
    }
}
