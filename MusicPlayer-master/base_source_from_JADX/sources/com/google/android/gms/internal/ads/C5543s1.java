package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.s1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5543s1 implements y84 {

    /* renamed from: d */
    public static final f94 f23290d = C5506r1.f22701b;

    /* renamed from: a */
    private b94 f23291a;

    /* renamed from: b */
    private C4914b2 f23292b;

    /* renamed from: c */
    private boolean f23293c;

    /* renamed from: a */
    private final boolean m30491a(z84 z84) throws IOException {
        C5617u1 u1Var = new C5617u1();
        if (u1Var.mo21204b(z84, true) && (u1Var.f24137a & 2) == 2) {
            int min = Math.min(u1Var.f24141e, 8);
            no2 no2 = new no2(min);
            ((t84) z84).mo19929i(no2.mo19781h(), 0, min, false);
            no2.mo19779f(0);
            if (no2.mo19782i() >= 5 && no2.mo19792s() == 127 && no2.mo19766A() == 1179402563) {
                this.f23292b = new C5469q1();
            } else {
                no2.mo19779f(0);
                try {
                    if (ia4.m25127c(1, no2, true)) {
                        this.f23292b = new C4988d2();
                    }
                } catch (C5464px unused) {
                }
                no2.mo19779f(0);
                if (C5691w1.m32854j(no2)) {
                    this.f23292b = new C5691w1();
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        try {
            return m30491a(z84);
        } catch (C5464px unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final int mo16802d(z84 z84, w94 w94) throws IOException {
        gs1.m24484b(this.f23291a);
        if (this.f23292b == null) {
            if (m30491a(z84)) {
                z84.mo19928h();
            } else {
                throw C5464px.zza("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f23293c) {
            da4 s = this.f23291a.mo15724s(0, 1);
            this.f23291a.mo15722I();
            this.f23292b.mo16011g(this.f23291a, s);
            this.f23293c = true;
        }
        return this.f23292b.mo16008d(z84, w94);
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f23291a = b94;
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        C4914b2 b2Var = this.f23292b;
        if (b2Var != null) {
            b2Var.mo16013i(j, j2);
        }
    }
}
