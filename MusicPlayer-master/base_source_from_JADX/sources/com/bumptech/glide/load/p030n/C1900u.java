package com.bumptech.glide.load.p030n;

import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.p052l.C2196a;
import com.bumptech.glide.p051s.p052l.C2205c;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.load.n.u */
/* compiled from: LockedResource */
final class C1900u<Z> implements C1902v<Z>, C2196a.C2202f {

    /* renamed from: k */
    private static final C3700f<C1900u<?>> f6852k = C2196a.m10297d(20, new C1901a());

    /* renamed from: g */
    private final C2205c f6853g = C2205c.m10314a();

    /* renamed from: h */
    private C1902v<Z> f6854h;

    /* renamed from: i */
    private boolean f6855i;

    /* renamed from: j */
    private boolean f6856j;

    /* renamed from: com.bumptech.glide.load.n.u$a */
    /* compiled from: LockedResource */
    class C1901a implements C2196a.C2200d<C1900u<?>> {
        C1901a() {
        }

        /* renamed from: b */
        public C1900u<?> mo7847a() {
            return new C1900u<>();
        }
    }

    C1900u() {
    }

    /* renamed from: b */
    private void m9189b(C1902v<Z> vVar) {
        this.f6856j = false;
        this.f6855i = true;
        this.f6854h = vVar;
    }

    /* renamed from: e */
    static <Z> C1900u<Z> m9190e(C1902v<Z> vVar) {
        C1900u<Z> b = f6852k.mo8513b();
        C2193j.m10269d(b);
        C1900u<Z> uVar = b;
        uVar.m9189b(vVar);
        return uVar;
    }

    /* renamed from: f */
    private void m9191f() {
        this.f6854h = null;
        f6852k.mo8512a(this);
    }

    /* renamed from: a */
    public synchronized void mo7965a() {
        this.f6853g.mo8515c();
        this.f6856j = true;
        if (!this.f6855i) {
            this.f6854h.mo7965a();
            m9191f();
        }
    }

    /* renamed from: c */
    public int mo7967c() {
        return this.f6854h.mo7967c();
    }

    /* renamed from: d */
    public Class<Z> mo7968d() {
        return this.f6854h.mo7968d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo7995g() {
        this.f6853g.mo8515c();
        if (this.f6855i) {
            this.f6855i = false;
            if (this.f6856j) {
                mo7965a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Z get() {
        return this.f6854h.get();
    }

    /* renamed from: j */
    public C2205c mo7849j() {
        return this.f6853g;
    }
}
