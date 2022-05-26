package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
/* compiled from: SnackbarManager */
class C6190b {

    /* renamed from: e */
    private static C6190b f28872e;

    /* renamed from: a */
    private final Object f28873a = new Object();

    /* renamed from: b */
    private final Handler f28874b = new Handler(Looper.getMainLooper(), new C6191a());

    /* renamed from: c */
    private C6193c f28875c;

    /* renamed from: d */
    private C6193c f28876d;

    /* renamed from: com.google.android.material.snackbar.b$a */
    /* compiled from: SnackbarManager */
    class C6191a implements Handler.Callback {
        C6191a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C6190b.this.mo24701d((C6193c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b */
    /* compiled from: SnackbarManager */
    interface C6192b {
        /* renamed from: a */
        void mo24661a(int i);

        /* renamed from: b */
        void mo24662b();
    }

    /* renamed from: com.google.android.material.snackbar.b$c */
    /* compiled from: SnackbarManager */
    private static class C6193c {

        /* renamed from: a */
        final WeakReference<C6192b> f28878a;

        /* renamed from: b */
        int f28879b;

        /* renamed from: c */
        boolean f28880c;

        C6193c(int i, C6192b bVar) {
            this.f28878a = new WeakReference<>(bVar);
            this.f28879b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo24709a(C6192b bVar) {
            return bVar != null && this.f28878a.get() == bVar;
        }
    }

    private C6190b() {
    }

    /* renamed from: a */
    private boolean m37017a(C6193c cVar, int i) {
        C6192b bVar = (C6192b) cVar.f28878a.get();
        if (bVar == null) {
            return false;
        }
        this.f28874b.removeCallbacksAndMessages(cVar);
        bVar.mo24661a(i);
        return true;
    }

    /* renamed from: c */
    static C6190b m37018c() {
        if (f28872e == null) {
            f28872e = new C6190b();
        }
        return f28872e;
    }

    /* renamed from: f */
    private boolean m37019f(C6192b bVar) {
        C6193c cVar = this.f28875c;
        return cVar != null && cVar.mo24709a(bVar);
    }

    /* renamed from: g */
    private boolean m37020g(C6192b bVar) {
        C6193c cVar = this.f28876d;
        return cVar != null && cVar.mo24709a(bVar);
    }

    /* renamed from: l */
    private void m37021l(C6193c cVar) {
        int i = cVar.f28879b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f28874b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f28874b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: n */
    private void m37022n() {
        C6193c cVar = this.f28876d;
        if (cVar != null) {
            this.f28875c = cVar;
            this.f28876d = null;
            C6192b bVar = (C6192b) cVar.f28878a.get();
            if (bVar != null) {
                bVar.mo24662b();
            } else {
                this.f28875c = null;
            }
        }
    }

    /* renamed from: b */
    public void mo24700b(C6192b bVar, int i) {
        synchronized (this.f28873a) {
            if (m37019f(bVar)) {
                m37017a(this.f28875c, i);
            } else if (m37020g(bVar)) {
                m37017a(this.f28876d, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24701d(C6193c cVar) {
        synchronized (this.f28873a) {
            if (this.f28875c == cVar || this.f28876d == cVar) {
                m37017a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo24702e(C6192b bVar) {
        boolean z;
        synchronized (this.f28873a) {
            if (!m37019f(bVar)) {
                if (!m37020g(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public void mo24703h(C6192b bVar) {
        synchronized (this.f28873a) {
            if (m37019f(bVar)) {
                this.f28875c = null;
                if (this.f28876d != null) {
                    m37022n();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo24704i(C6192b bVar) {
        synchronized (this.f28873a) {
            if (m37019f(bVar)) {
                m37021l(this.f28875c);
            }
        }
    }

    /* renamed from: j */
    public void mo24705j(C6192b bVar) {
        synchronized (this.f28873a) {
            if (m37019f(bVar)) {
                C6193c cVar = this.f28875c;
                if (!cVar.f28880c) {
                    cVar.f28880c = true;
                    this.f28874b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo24706k(C6192b bVar) {
        synchronized (this.f28873a) {
            if (m37019f(bVar)) {
                C6193c cVar = this.f28875c;
                if (cVar.f28880c) {
                    cVar.f28880c = false;
                    m37021l(cVar);
                }
            }
        }
    }

    /* renamed from: m */
    public void mo24707m(int i, C6192b bVar) {
        synchronized (this.f28873a) {
            if (m37019f(bVar)) {
                C6193c cVar = this.f28875c;
                cVar.f28879b = i;
                this.f28874b.removeCallbacksAndMessages(cVar);
                m37021l(this.f28875c);
                return;
            }
            if (m37020g(bVar)) {
                this.f28876d.f28879b = i;
            } else {
                this.f28876d = new C6193c(i, bVar);
            }
            C6193c cVar2 = this.f28875c;
            if (cVar2 == null || !m37017a(cVar2, 4)) {
                this.f28875c = null;
                m37022n();
            }
        }
    }
}
