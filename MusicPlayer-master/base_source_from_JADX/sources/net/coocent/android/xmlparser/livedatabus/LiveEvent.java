package net.coocent.android.xmlparser.livedatabus;

import androidx.lifecycle.C0672f0;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0718v;
import java.util.Map;

abstract class LiveEvent<T> {

    /* renamed from: h */
    private static final Object f36419h = new Object();

    /* renamed from: a */
    private C9472c<C0672f0<T>, LiveEvent<T>.C0000a> f36420a = new C9472c<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f36421b = 0;

    /* renamed from: c */
    private volatile Object f36422c;

    /* renamed from: d */
    private volatile Object f36423d;

    /* renamed from: e */
    private int f36424e;

    /* renamed from: f */
    private boolean f36425f;

    /* renamed from: g */
    private boolean f36426g;

    class LifecycleBoundObserver extends LiveEvent<T>.C0000a implements Object {

        /* renamed from: k */
        final C0718v f36427k;

        /* renamed from: l */
        final /* synthetic */ LiveEvent f36428l;

        /* renamed from: c */
        public void mo32599c(C0718v vVar, C0697n.C0699b bVar) {
            if (this.f36427k.mo390v().mo4257b() == C0697n.C0700c.DESTROYED) {
                this.f36428l.mo32597k(this.f36429g);
            } else {
                mo32602h(mo32601j());
            }
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [androidx.lifecycle.u, net.coocent.android.xmlparser.livedatabus.LiveEvent$LifecycleBoundObserver] */
        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo32600i() {
            this.f36427k.mo390v().mo4258c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo32601j() {
            return this.f36427k.mo390v().mo4257b().isAtLeast(this.f36428l.mo32594h());
        }
    }

    /* renamed from: net.coocent.android.xmlparser.livedatabus.LiveEvent$a */
    private abstract class C9462a {

        /* renamed from: g */
        final C0672f0<T> f36429g;

        /* renamed from: h */
        boolean f36430h;

        /* renamed from: i */
        int f36431i;

        /* renamed from: j */
        final /* synthetic */ LiveEvent f36432j;

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo32602h(boolean z) {
            if (z != this.f36430h) {
                this.f36430h = z;
                int i = 1;
                boolean z2 = this.f36432j.f36421b == 0;
                LiveEvent liveEvent = this.f36432j;
                if (!this.f36430h) {
                    i = -1;
                }
                LiveEvent.m49814c(liveEvent, i);
                if (z2 && this.f36430h) {
                    this.f36432j.mo32595i();
                }
                if (this.f36432j.f36421b == 0 && !this.f36430h) {
                    this.f36432j.mo32596j();
                }
                if (this.f36430h) {
                    this.f36432j.m49818g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo32600i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract boolean mo32601j();
    }

    /* renamed from: net.coocent.android.xmlparser.livedatabus.LiveEvent$b */
    private class C9463b implements Runnable {

        /* renamed from: g */
        private Object f36433g;

        public C9463b(Object obj) {
            this.f36433g = obj;
        }

        public void run() {
            LiveEvent.this.mo32598l(this.f36433g);
        }
    }

    LiveEvent() {
        Object obj = f36419h;
        this.f36422c = obj;
        this.f36423d = obj;
        this.f36424e = -1;
    }

    /* renamed from: c */
    static /* synthetic */ int m49814c(LiveEvent liveEvent, int i) {
        int i2 = liveEvent.f36421b + i;
        liveEvent.f36421b = i2;
        return i2;
    }

    /* renamed from: e */
    private static void m49816e(String str) {
        if (!C9469b.m49836a().mo32606b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: f */
    private void m49817f(LiveEvent<T>.C0000a aVar) {
        if (aVar.f36430h) {
            if (!aVar.mo32601j()) {
                aVar.mo32602h(false);
                return;
            }
            int i = aVar.f36431i;
            int i2 = this.f36424e;
            if (i < i2) {
                aVar.f36431i = i2;
                aVar.f36429g.onChanged(this.f36422c);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m49818g(LiveEvent<T>.C0000a aVar) {
        if (this.f36425f) {
            this.f36426g = true;
            return;
        }
        this.f36425f = true;
        do {
            this.f36426g = false;
            if (aVar == null) {
                C9472c<K, V>.d s = this.f36420a.mo32611s();
                while (s.hasNext()) {
                    m49817f((C9462a) ((Map.Entry) s.next()).getValue());
                    if (this.f36426g) {
                        break;
                    }
                }
            } else {
                m49817f(aVar);
                aVar = null;
            }
        } while (this.f36426g);
        this.f36425f = false;
    }

    /* renamed from: a */
    public void mo32593a(T t) {
        C9469b.m49836a().mo32607c(new C9463b(t));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0697n.C0700c mo32594h() {
        return C0697n.C0700c.CREATED;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo32595i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo32596j() {
    }

    /* renamed from: k */
    public void mo32597k(C0672f0<T> f0Var) {
        m49816e("removeObserver");
        C9462a t = this.f36420a.mo32613t(f0Var);
        if (t != null) {
            t.mo32600i();
            t.mo32602h(false);
        }
    }

    /* renamed from: l */
    public void mo32598l(T t) {
        m49816e("setValue");
        this.f36424e++;
        this.f36422c = t;
        m49818g((LiveEvent<T>.C0000a) null);
    }
}
