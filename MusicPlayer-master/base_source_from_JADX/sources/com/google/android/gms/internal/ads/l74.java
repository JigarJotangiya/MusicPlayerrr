package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l74 {

    /* renamed from: a */
    private final z64 f19228a = new z64();

    /* renamed from: b */
    private final g74 f19229b;

    /* renamed from: c */
    private final k74 f19230c;

    /* renamed from: d */
    private boolean f19231d;

    /* renamed from: e */
    private Surface f19232e;

    /* renamed from: f */
    private float f19233f;

    /* renamed from: g */
    private float f19234g;

    /* renamed from: h */
    private float f19235h;

    /* renamed from: i */
    private float f19236i;

    /* renamed from: j */
    private int f19237j;

    /* renamed from: k */
    private long f19238k;

    /* renamed from: l */
    private long f19239l;

    /* renamed from: m */
    private long f19240m;

    /* renamed from: n */
    private long f19241n;

    /* renamed from: o */
    private long f19242o;

    /* renamed from: p */
    private long f19243p;

    /* renamed from: q */
    private long f19244q;

    public l74(Context context) {
        g74 g74;
        k74 k74 = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            g74 = wy2.f25579a >= 17 ? j74.m25558b(applicationContext) : null;
            if (g74 == null) {
                g74 = i74.m25109b(applicationContext);
            }
        } else {
            g74 = null;
        }
        this.f19229b = g74;
        this.f19230c = g74 != null ? k74.m26152a() : k74;
        this.f19238k = -9223372036854775807L;
        this.f19239l = -9223372036854775807L;
        this.f19233f = -1.0f;
        this.f19236i = 1.0f;
        this.f19237j = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m26560b(l74 l74, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            l74.f19238k = refreshRate;
            l74.f19239l = (refreshRate * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        l74.f19238k = -9223372036854775807L;
        l74.f19239l = -9223372036854775807L;
    }

    /* renamed from: m */
    private final void m26561m() {
        Surface surface;
        if (wy2.f25579a >= 30 && (surface = this.f19232e) != null && this.f19237j != Integer.MIN_VALUE && this.f19235h != 0.0f) {
            this.f19235h = 0.0f;
            f74.m23528a(surface, 0.0f);
        }
    }

    /* renamed from: n */
    private final void m26562n() {
        this.f19240m = 0;
        this.f19243p = -1;
        this.f19241n = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r10.f19234g) >= r2) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r10.f19228a.mo22342b() >= 30) goto L_0x0064;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m26563o() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.wy2.f25579a
            r1 = 30
            if (r0 < r1) goto L_0x006d
            android.view.Surface r0 = r10.f19232e
            if (r0 != 0) goto L_0x000b
            goto L_0x006d
        L_0x000b:
            com.google.android.gms.internal.ads.z64 r0 = r10.f19228a
            boolean r0 = r0.mo22347g()
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.z64 r0 = r10.f19228a
            float r0 = r0.mo22341a()
            goto L_0x001c
        L_0x001a:
            float r0 = r10.f19233f
        L_0x001c:
            float r2 = r10.f19234g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.z64 r1 = r10.f19228a
            boolean r1 = r1.mo22347g()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.z64 r1 = r10.f19228a
            long r6 = r1.mo22344d()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x004b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x004b:
            float r1 = r10.f19234g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            goto L_0x0064
        L_0x0058:
            if (r6 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.z64 r2 = r10.f19228a
            int r2 = r2.mo22342b()
            if (r2 < r1) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            if (r3 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            return
        L_0x0068:
            r10.f19234g = r0
            r10.m26564p(r5)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l74.m26563o():void");
    }

    /* renamed from: p */
    private final void m26564p(boolean z) {
        Surface surface;
        if (wy2.f25579a >= 30 && (surface = this.f19232e) != null && this.f19237j != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.f19231d) {
                float f2 = this.f19234g;
                if (f2 != -1.0f) {
                    f = this.f19236i * f2;
                }
            }
            if (z || this.f19235h != f) {
                this.f19235h = f;
                f74.m23528a(surface, f);
            }
        }
    }

    /* renamed from: a */
    public final long mo19091a(long j) {
        long j2;
        if (this.f19243p != -1 && this.f19228a.mo22347g()) {
            long c = this.f19244q + ((long) (((float) (this.f19228a.mo22343c() * (this.f19240m - this.f19243p))) / this.f19236i));
            if (Math.abs(j - c) <= 20000000) {
                j = c;
            } else {
                m26562n();
            }
        }
        this.f19241n = this.f19240m;
        this.f19242o = j;
        k74 k74 = this.f19230c;
        if (k74 == null || this.f19238k == -9223372036854775807L) {
            return j;
        }
        long j3 = k74.f18832g;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.f19238k;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            long j6 = j5;
            j5 = j4 + j5;
            j2 = j6;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.f19239l;
    }

    /* renamed from: c */
    public final void mo19092c() {
        g74 g74 = this.f19229b;
        if (g74 != null) {
            g74.zza();
            k74 k74 = this.f19230c;
            Objects.requireNonNull(k74);
            k74.mo18867c();
        }
    }

    /* renamed from: d */
    public final void mo19093d() {
        if (this.f19229b != null) {
            k74 k74 = this.f19230c;
            Objects.requireNonNull(k74);
            k74.mo18866b();
            this.f19229b.mo17872a(new e74(this));
        }
    }

    /* renamed from: e */
    public final void mo19094e(float f) {
        this.f19233f = f;
        this.f19228a.mo22346f();
        m26563o();
    }

    /* renamed from: f */
    public final void mo19095f(long j) {
        long j2 = this.f19241n;
        if (j2 != -1) {
            this.f19243p = j2;
            this.f19244q = this.f19242o;
        }
        this.f19240m++;
        this.f19228a.mo22345e(j * 1000);
        m26563o();
    }

    /* renamed from: g */
    public final void mo19096g(float f) {
        this.f19236i = f;
        m26562n();
        m26564p(false);
    }

    /* renamed from: h */
    public final void mo19097h() {
        m26562n();
    }

    /* renamed from: i */
    public final void mo19098i() {
        this.f19231d = true;
        m26562n();
        m26564p(false);
    }

    /* renamed from: j */
    public final void mo19099j() {
        this.f19231d = false;
        m26561m();
    }

    /* renamed from: k */
    public final void mo19100k(Surface surface) {
        if (true == (surface instanceof zzuq)) {
            surface = null;
        }
        if (this.f19232e != surface) {
            m26561m();
            this.f19232e = surface;
            m26564p(true);
        }
    }

    /* renamed from: l */
    public final void mo19101l(int i) {
        if (this.f19237j != i) {
            this.f19237j = i;
            m26564p(true);
        }
    }
}
