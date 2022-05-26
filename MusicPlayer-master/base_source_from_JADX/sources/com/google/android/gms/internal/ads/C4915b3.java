package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.b3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4915b3 implements C5470q2 {

    /* renamed from: a */
    private final no2 f14289a = new no2(10);

    /* renamed from: b */
    private da4 f14290b;

    /* renamed from: c */
    private boolean f14291c;

    /* renamed from: d */
    private long f14292d = -9223372036854775807L;

    /* renamed from: e */
    private int f14293e;

    /* renamed from: f */
    private int f14294f;

    /* renamed from: a */
    public final void mo15668a(no2 no2) {
        gs1.m24484b(this.f14290b);
        if (this.f14291c) {
            int i = no2.mo19782i();
            int i2 = this.f14294f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(no2.mo19781h(), no2.mo19784k(), this.f14289a.mo19781h(), this.f14294f, min);
                if (this.f14294f + min == 10) {
                    this.f14289a.mo19779f(0);
                    if (this.f14289a.mo19792s() == 73 && this.f14289a.mo19792s() == 68 && this.f14289a.mo19792s() == 51) {
                        this.f14289a.mo19780g(3);
                        this.f14293e = this.f14289a.mo19791r() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f14291c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f14293e - this.f14294f);
            ba4.m21199b(this.f14290b, no2, min2);
            this.f14294f += min2;
        }
    }

    /* renamed from: b */
    public final void mo15669b() {
        int i;
        gs1.m24484b(this.f14290b);
        if (this.f14291c && (i = this.f14293e) != 0 && this.f14294f == i) {
            long j = this.f14292d;
            if (j != -9223372036854775807L) {
                this.f14290b.mo16889e(j, 1, i, 0, (ca4) null);
            }
            this.f14291c = false;
        }
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        c4Var.mo16483c();
        da4 s = b94.mo15724s(c4Var.mo16481a(), 5);
        this.f14290b = s;
        jb4 jb4 = new jb4();
        jb4.mo18587h(c4Var.mo16482b());
        jb4.mo18599s("application/id3");
        s.mo16885a(jb4.mo18605y());
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if ((i & 4) != 0) {
            this.f14291c = true;
            if (j != -9223372036854775807L) {
                this.f14292d = j;
            }
            this.f14293e = 0;
            this.f14294f = 0;
        }
    }

    public final void zze() {
        this.f14291c = false;
        this.f14292d = -9223372036854775807L;
    }
}
