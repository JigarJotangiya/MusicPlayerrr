package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.u1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5617u1 {

    /* renamed from: a */
    public int f24137a;

    /* renamed from: b */
    public long f24138b;

    /* renamed from: c */
    public int f24139c;

    /* renamed from: d */
    public int f24140d;

    /* renamed from: e */
    public int f24141e;

    /* renamed from: f */
    public final int[] f24142f = new int[255];

    /* renamed from: g */
    private final no2 f24143g = new no2(255);

    C5617u1() {
    }

    /* renamed from: a */
    public final void mo21203a() {
        this.f24137a = 0;
        this.f24138b = 0;
        this.f24139c = 0;
        this.f24140d = 0;
        this.f24141e = 0;
    }

    /* renamed from: b */
    public final boolean mo21204b(z84 z84, boolean z) throws IOException {
        mo21203a();
        this.f24143g.mo19776c(27);
        if (c94.m21831c(z84, this.f24143g.mo19781h(), 0, 27, z) && this.f24143g.mo19766A() == 1332176723) {
            if (this.f24143g.mo19792s() == 0) {
                this.f24137a = this.f24143g.mo19792s();
                this.f24138b = this.f24143g.mo19797x();
                this.f24143g.mo19798y();
                this.f24143g.mo19798y();
                this.f24143g.mo19798y();
                int s = this.f24143g.mo19792s();
                this.f24139c = s;
                this.f24140d = s + 27;
                this.f24143g.mo19776c(s);
                if (c94.m21831c(z84, this.f24143g.mo19781h(), 0, this.f24139c, z)) {
                    for (int i = 0; i < this.f24139c; i++) {
                        this.f24142f[i] = this.f24143g.mo19792s();
                        this.f24141e += this.f24142f[i];
                    }
                    return true;
                }
            } else if (z) {
                return false;
            } else {
                throw C5464px.zzc("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo21205c(z84 z84, long j) throws IOException {
        int i;
        gs1.m24486d(z84.zze() == z84.mo16585f());
        this.f24143g.mo19776c(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || z84.zze() + 4 < j) && c94.m21831c(z84, this.f24143g.mo19781h(), 0, 4, true)) {
                this.f24143g.mo19779f(0);
                if (this.f24143g.mo19766A() != 1332176723) {
                    ((t84) z84).mo21042o(1, false);
                } else {
                    z84.mo19928h();
                    return true;
                }
            }
        }
        do {
            if ((i != 0 && z84.zze() >= j) || z84.mo19924A(1) == -1) {
                return false;
            }
            break;
        } while (z84.mo19924A(1) == -1);
        return false;
    }
}
