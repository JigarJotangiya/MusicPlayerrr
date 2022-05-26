package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class oa4 implements o84 {

    /* renamed from: a */
    private final n94 f20961a;

    /* renamed from: b */
    private final int f20962b;

    /* renamed from: c */
    private final g94 f20963c = new g94();

    /* synthetic */ oa4(n94 n94, int i, na4 na4) {
        this.f20961a = n94;
        this.f20962b = i;
    }

    /* renamed from: c */
    private final long m28392c(z84 z84) throws IOException {
        z84 z842 = z84;
        while (z84.mo16585f() < z84.mo16584b() - 6) {
            n94 n94 = this.f20961a;
            int i = this.f20962b;
            g94 g94 = this.f20963c;
            long f = z84.mo16585f();
            byte[] bArr = new byte[2];
            t84 t84 = (t84) z842;
            t84.mo19929i(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                z84.mo19928h();
                t84.mo21041n((int) (f - z84.zze()), false);
            } else {
                no2 no2 = new no2(16);
                System.arraycopy(bArr, 0, no2.mo19781h(), 0, 2);
                no2.mo19778e(c94.m21829a(z842, no2.mo19781h(), 2, 14));
                z84.mo19928h();
                t84.mo21041n((int) (f - z84.zze()), false);
                if (h94.m24738c(no2, n94, i, g94)) {
                    break;
                }
            }
            t84.mo21041n(1, false);
        }
        if (z84.mo16585f() < z84.mo16584b() - 6) {
            return this.f20963c.f17002a;
        }
        ((t84) z842).mo21041n((int) (z84.mo16584b() - z84.mo16585f()), false);
        return this.f20961a.f20564j;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo18283a() {
    }

    /* renamed from: b */
    public final n84 mo18284b(z84 z84, long j) throws IOException {
        long zze = z84.zze();
        long c = m28392c(z84);
        long f = z84.mo16585f();
        ((t84) z84).mo21041n(Math.max(6, this.f20961a.f20557c), false);
        long c2 = m28392c(z84);
        long f2 = z84.mo16585f();
        if (c > j || c2 <= j) {
            return c2 <= j ? n84.m27765f(c2, f2) : n84.m27763d(c, zze);
        }
        return n84.m27764e(f);
    }
}
