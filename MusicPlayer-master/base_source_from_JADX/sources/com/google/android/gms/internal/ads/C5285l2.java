package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.l2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5285l2 implements y84 {

    /* renamed from: j */
    public static final f94 f19152j = C5248k2.f18719b;

    /* renamed from: a */
    private final C5322m2 f19153a = new C5322m2(true, (String) null);

    /* renamed from: b */
    private final no2 f19154b = new no2(2048);

    /* renamed from: c */
    private final no2 f19155c;

    /* renamed from: d */
    private final mn2 f19156d;

    /* renamed from: e */
    private b94 f19157e;

    /* renamed from: f */
    private long f19158f;

    /* renamed from: g */
    private long f19159g = -1;

    /* renamed from: h */
    private boolean f19160h;

    /* renamed from: i */
    private boolean f19161i;

    public C5285l2(int i) {
        no2 no2 = new no2(10);
        this.f19155c = no2;
        byte[] h = no2.mo19781h();
        this.f19156d = new mn2(h, h.length);
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        t84 t84;
        int i = 0;
        while (true) {
            t84 = (t84) z84;
            t84.mo19929i(this.f19155c.mo19781h(), 0, 10, false);
            this.f19155c.mo19779f(0);
            if (this.f19155c.mo19794u() != 4801587) {
                break;
            }
            this.f19155c.mo19780g(3);
            int r = this.f19155c.mo19791r();
            i += r + 10;
            t84.mo21041n(r, false);
        }
        z84.mo19928h();
        t84.mo21041n(i, false);
        if (this.f19159g == -1) {
            this.f19159g = (long) i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            t84.mo19929i(this.f19155c.mo19781h(), 0, 2, false);
            this.f19155c.mo19779f(0);
            if (!C5322m2.m27083e(this.f19155c.mo19796w())) {
                i2++;
                z84.mo19928h();
                t84.mo21041n(i2, false);
            } else {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                t84.mo19929i(this.f19155c.mo19781h(), 0, 4, false);
                this.f19156d.mo19474h(14);
                int c = this.f19156d.mo19469c(13);
                if (c <= 6) {
                    i2++;
                    z84.mo19928h();
                    t84.mo21041n(i2, false);
                } else {
                    t84.mo21041n(c - 6, false);
                    i4 += c;
                }
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    /* renamed from: d */
    public final int mo16802d(z84 z84, w94 w94) throws IOException {
        gs1.m24484b(this.f19157e);
        int c = z84.mo15695c(this.f19154b.mo19781h(), 0, 2048);
        if (!this.f19161i) {
            this.f19157e.mo15723r(new y94(-9223372036854775807L, 0));
            this.f19161i = true;
        }
        if (c == -1) {
            return -1;
        }
        this.f19154b.mo19779f(0);
        this.f19154b.mo19778e(c);
        if (!this.f19160h) {
            this.f19153a.mo15671d(this.f19158f, 4);
            this.f19160h = true;
        }
        this.f19153a.mo15668a(this.f19154b);
        return 0;
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f19157e = b94;
        this.f19153a.mo15670c(b94, new C4953c4(Integer.MIN_VALUE, 0, 1));
        b94.mo15722I();
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        this.f19160h = false;
        this.f19153a.zze();
        this.f19158f = j2;
    }
}
