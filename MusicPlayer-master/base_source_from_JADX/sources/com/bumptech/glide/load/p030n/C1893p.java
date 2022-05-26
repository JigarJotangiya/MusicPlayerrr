package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.p051s.C2193j;

/* renamed from: com.bumptech.glide.load.n.p */
/* compiled from: EngineResource */
class C1893p<Z> implements C1902v<Z> {

    /* renamed from: g */
    private final boolean f6837g;

    /* renamed from: h */
    private final boolean f6838h;

    /* renamed from: i */
    private final C1902v<Z> f6839i;

    /* renamed from: j */
    private final C1894a f6840j;

    /* renamed from: k */
    private final C1786g f6841k;

    /* renamed from: l */
    private int f6842l;

    /* renamed from: m */
    private boolean f6843m;

    /* renamed from: com.bumptech.glide.load.n.p$a */
    /* compiled from: EngineResource */
    interface C1894a {
        /* renamed from: d */
        void mo7930d(C1786g gVar, C1893p<?> pVar);
    }

    C1893p(C1902v<Z> vVar, boolean z, boolean z2, C1786g gVar, C1894a aVar) {
        C2193j.m10269d(vVar);
        this.f6839i = vVar;
        this.f6837g = z;
        this.f6838h = z2;
        this.f6841k = gVar;
        C2193j.m10269d(aVar);
        this.f6840j = aVar;
    }

    /* renamed from: a */
    public synchronized void mo7965a() {
        if (this.f6842l > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f6843m) {
            this.f6843m = true;
            if (this.f6838h) {
                this.f6839i.mo7965a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo7966b() {
        if (!this.f6843m) {
            this.f6842l++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: c */
    public int mo7967c() {
        return this.f6839i.mo7967c();
    }

    /* renamed from: d */
    public Class<Z> mo7968d() {
        return this.f6839i.mo7968d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1902v<Z> mo7969e() {
        return this.f6839i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo7970f() {
        return this.f6837g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7971g() {
        boolean z;
        synchronized (this) {
            int i = this.f6842l;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f6842l = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f6840j.mo7930d(this.f6841k, this);
        }
    }

    public Z get() {
        return this.f6839i.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f6837g + ", listener=" + this.f6840j + ", key=" + this.f6841k + ", acquired=" + this.f6842l + ", isRecycled=" + this.f6843m + ", resource=" + this.f6839i + '}';
    }
}
