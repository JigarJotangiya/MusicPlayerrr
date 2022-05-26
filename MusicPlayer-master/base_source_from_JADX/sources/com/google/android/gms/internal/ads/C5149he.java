package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.he */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5149he {

    /* renamed from: a */
    public final C5265kj f17635a;

    /* renamed from: b */
    public final Object f17636b;

    /* renamed from: c */
    public final int f17637c;

    /* renamed from: d */
    public final C5709wj[] f17638d = new C5709wj[2];

    /* renamed from: e */
    public final boolean[] f17639e = new boolean[2];

    /* renamed from: f */
    public final long f17640f;

    /* renamed from: g */
    public int f17641g;

    /* renamed from: h */
    public long f17642h;

    /* renamed from: i */
    public boolean f17643i;

    /* renamed from: j */
    public boolean f17644j;

    /* renamed from: k */
    public boolean f17645k;

    /* renamed from: l */
    public C5149he f17646l;

    /* renamed from: m */
    public C5525rk f17647m;

    /* renamed from: n */
    private final C5519re[] f17648n;

    /* renamed from: o */
    private final C5556se[] f17649o;

    /* renamed from: p */
    private final C5488qk f17650p;

    /* renamed from: q */
    private final C5339mj f17651q;

    /* renamed from: r */
    private C5525rk f17652r;

    /* renamed from: s */
    private final bp0 f17653s;

    public C5149he(C5519re[] reVarArr, C5556se[] seVarArr, long j, C5488qk qkVar, bp0 bp0, C5339mj mjVar, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.f17648n = reVarArr;
        this.f17649o = seVarArr;
        this.f17640f = j;
        this.f17650p = qkVar;
        this.f17653s = bp0;
        this.f17651q = mjVar;
        Objects.requireNonNull(obj);
        this.f17636b = obj;
        this.f17637c = i;
        this.f17641g = i2;
        this.f17643i = z;
        this.f17642h = j2;
        this.f17635a = mjVar.mo18383c(i2, bp0.mo16347l());
    }

    /* renamed from: a */
    public final long mo18129a(long j, boolean z) {
        return mo18130b(j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo18130b(long j, boolean z, boolean[] zArr) {
        C5414ok okVar = this.f17647m.f22885b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.f17639e;
            if (z || !this.f17647m.mo20671a(this.f17652r, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long f = this.f17635a.mo17939f(okVar.mo20013b(), this.f17639e, this.f17638d, zArr, j);
        this.f17652r = this.f17647m;
        this.f17645k = false;
        int i2 = 0;
        while (true) {
            C5709wj[] wjVarArr = this.f17638d;
            if (i2 < 2) {
                if (wjVarArr[i2] != null) {
                    C5304ll.m26776e(okVar.mo20012a(i2) != null);
                    this.f17645k = true;
                } else {
                    C5304ll.m26776e(okVar.mo20012a(i2) == null);
                }
                i2++;
            } else {
                this.f17653s.mo16339d(this.f17648n, this.f17647m.f22884a, okVar);
                return f;
            }
        }
    }

    /* renamed from: c */
    public final void mo18131c() {
        try {
            this.f17651q.mo18381a(this.f17635a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    /* renamed from: d */
    public final boolean mo18132d() {
        return this.f17644j && (!this.f17645k || this.f17635a.mo17937d() == Long.MIN_VALUE);
    }

    /* renamed from: e */
    public final boolean mo18133e() throws C5778yd {
        C5525rk a = this.f17650p.mo19398a(this.f17649o, this.f17635a.mo17942k());
        C5525rk rkVar = this.f17652r;
        if (rkVar != null) {
            int i = 0;
            while (i < 2) {
                if (a.mo20671a(rkVar, i)) {
                    i++;
                }
            }
            return false;
        }
        this.f17647m = a;
        return true;
    }
}
