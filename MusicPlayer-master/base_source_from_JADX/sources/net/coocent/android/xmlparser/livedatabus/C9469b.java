package net.coocent.android.xmlparser.livedatabus;

import android.os.Handler;
import android.os.Looper;

/* renamed from: net.coocent.android.xmlparser.livedatabus.b */
/* compiled from: MainThreadManager */
class C9469b {

    /* renamed from: a */
    private final Object f36437a;

    /* renamed from: b */
    private volatile Handler f36438b;

    /* renamed from: net.coocent.android.xmlparser.livedatabus.b$b */
    /* compiled from: MainThreadManager */
    private static class C9471b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C9469b f36439a = new C9469b();
    }

    /* renamed from: a */
    public static C9469b m49836a() {
        return C9471b.f36439a;
    }

    /* renamed from: b */
    public boolean mo32606b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo32607c(Runnable runnable) {
        if (this.f36438b == null) {
            synchronized (this.f36437a) {
                if (this.f36438b == null) {
                    this.f36438b = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f36438b.post(runnable);
    }

    private C9469b() {
        this.f36437a = new Object();
    }
}
