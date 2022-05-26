package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bp0 {

    /* renamed from: a */
    private final C5785yk f14590a = new C5785yk(true, 65536);

    /* renamed from: b */
    private long f14591b = 15000000;

    /* renamed from: c */
    private long f14592c = 30000000;

    /* renamed from: d */
    private long f14593d = 2500000;

    /* renamed from: e */
    private long f14594e = 5000000;

    /* renamed from: f */
    private int f14595f;

    /* renamed from: g */
    private boolean f14596g;

    bp0() {
    }

    /* renamed from: a */
    public final void mo16336a() {
        mo16340e(false);
    }

    /* renamed from: b */
    public final void mo16337b() {
        mo16340e(true);
    }

    /* renamed from: c */
    public final void mo16338c() {
        mo16340e(true);
    }

    /* renamed from: d */
    public final void mo16339d(C5519re[] reVarArr, C4969ck ckVar, C5414ok okVar) {
        this.f14595f = 0;
        for (int i = 0; i < 2; i++) {
            if (okVar.mo20012a(i) != null) {
                this.f14595f += C4934bm.m21436f(reVarArr[i].mo20634b());
            }
        }
        this.f14590a.mo22210f(this.f14595f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo16340e(boolean z) {
        this.f14595f = 0;
        this.f14596g = false;
        if (z) {
            this.f14590a.mo22209e();
        }
    }

    /* renamed from: f */
    public final synchronized void mo16341f(int i) {
        this.f14593d = ((long) i) * 1000;
    }

    /* renamed from: g */
    public final synchronized void mo16342g(int i) {
        this.f14594e = ((long) i) * 1000;
    }

    /* renamed from: h */
    public final synchronized void mo16343h(int i) {
        this.f14592c = ((long) i) * 1000;
    }

    /* renamed from: i */
    public final synchronized void mo16344i(int i) {
        this.f14591b = ((long) i) * 1000;
    }

    /* renamed from: j */
    public final synchronized boolean mo16345j(long j) {
        boolean z;
        z = true;
        char c = j > this.f14592c ? 0 : j < this.f14591b ? (char) 2 : 1;
        int a = this.f14590a.mo22205a();
        int i = this.f14595f;
        if (c != 2) {
            if (c != 1 || !this.f14596g || a >= i) {
                z = false;
            }
        }
        this.f14596g = z;
        return z;
    }

    /* renamed from: k */
    public final synchronized boolean mo16346k(long j, boolean z) {
        long j2;
        j2 = z ? this.f14594e : this.f14593d;
        return j2 <= 0 || j >= j2;
    }

    /* renamed from: l */
    public final C5785yk mo16347l() {
        return this.f14590a;
    }
}
