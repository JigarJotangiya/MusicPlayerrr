package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.b2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class C4914b2 {

    /* renamed from: a */
    private final C5580t1 f14261a = new C5580t1();

    /* renamed from: b */
    private da4 f14262b;

    /* renamed from: c */
    private b94 f14263c;

    /* renamed from: d */
    private C5654v1 f14264d;

    /* renamed from: e */
    private long f14265e;

    /* renamed from: f */
    private long f14266f;

    /* renamed from: g */
    private long f14267g;

    /* renamed from: h */
    private int f14268h;

    /* renamed from: i */
    private int f14269i;

    /* renamed from: j */
    private C5728x1 f14270j = new C5728x1();

    /* renamed from: k */
    private long f14271k;

    /* renamed from: l */
    private boolean f14272l;

    /* renamed from: m */
    private boolean f14273m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo16005a(no2 no2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16006b(boolean z) {
        int i;
        if (z) {
            this.f14270j = new C5728x1();
            this.f14266f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f14268h = i;
        this.f14265e = -1;
        this.f14267g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo16007c(no2 no2, long j, C5728x1 x1Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo16008d(z84 z84, w94 w94) throws IOException {
        z84 z842 = z84;
        gs1.m24484b(this.f14262b);
        int i = wy2.f25579a;
        int i2 = this.f14268h;
        if (i2 == 0) {
            while (this.f14261a.mo20997e(z842)) {
                this.f14271k = z84.zze() - this.f14266f;
                if (mo16007c(this.f14261a.mo20993a(), this.f14266f, this.f14270j)) {
                    this.f14266f = z84.zze();
                } else {
                    C5689w wVar = this.f14270j.f25615a;
                    this.f14269i = wVar.f25147z;
                    if (!this.f14273m) {
                        this.f14262b.mo16885a(wVar);
                        this.f14273m = true;
                    }
                    C5654v1 v1Var = this.f14270j.f25616b;
                    if (v1Var != null) {
                        this.f14264d = v1Var;
                    } else if (z84.mo16584b() == -1) {
                        this.f14264d = new C4877a2((C5803z1) null);
                    } else {
                        C5617u1 b = this.f14261a.mo20994b();
                        this.f14264d = new C5395o1(this, this.f14266f, z84.mo16584b(), (long) (b.f24140d + b.f24141e), b.f24138b, (b.f24137a & 4) != 0);
                    }
                    this.f14268h = 2;
                    this.f14261a.mo20996d();
                    return 0;
                }
            }
            this.f14268h = 3;
            return -1;
        } else if (i2 == 1) {
            ((t84) z842).mo21042o((int) this.f14266f, false);
            this.f14268h = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long b2 = this.f14264d.mo15644b(z842);
            if (b2 >= 0) {
                w94.f25288a = b2;
                return 1;
            }
            if (b2 < -1) {
                mo16012h(-(b2 + 2));
            }
            if (!this.f14272l) {
                z94 zze = this.f14264d.zze();
                gs1.m24484b(zze);
                this.f14263c.mo15723r(zze);
                this.f14272l = true;
            }
            if (this.f14271k > 0 || this.f14261a.mo20997e(z842)) {
                this.f14271k = 0;
                no2 a = this.f14261a.mo20993a();
                long a2 = mo16005a(a);
                if (a2 >= 0) {
                    long j = this.f14267g;
                    if (j + a2 >= this.f14265e) {
                        long e = mo16009e(j);
                        ba4.m21199b(this.f14262b, a, a.mo19785l());
                        this.f14262b.mo16889e(e, 1, a.mo19785l(), 0, (ca4) null);
                        this.f14265e = -1;
                    }
                }
                this.f14267g += a2;
                return 0;
            }
            this.f14268h = 3;
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo16009e(long j) {
        return (j * 1000000) / ((long) this.f14269i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo16010f(long j) {
        return (((long) this.f14269i) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo16011g(b94 b94, da4 da4) {
        this.f14263c = b94;
        this.f14262b = da4;
        mo16006b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16012h(long j) {
        this.f14267g = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo16013i(long j, long j2) {
        this.f14261a.mo20995c();
        if (j == 0) {
            mo16006b(!this.f14272l);
        } else if (this.f14268h != 0) {
            long f = mo16010f(j2);
            this.f14265e = f;
            C5654v1 v1Var = this.f14264d;
            int i = wy2.f25579a;
            v1Var.mo15645c(f);
            this.f14268h = 2;
        }
    }
}
