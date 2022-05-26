package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.t1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5580t1 {

    /* renamed from: a */
    private final C5617u1 f23676a = new C5617u1();

    /* renamed from: b */
    private final no2 f23677b = new no2(new byte[65025], 0);

    /* renamed from: c */
    private int f23678c = -1;

    /* renamed from: d */
    private int f23679d;

    /* renamed from: e */
    private boolean f23680e;

    C5580t1() {
    }

    /* renamed from: f */
    private final int m31017f(int i) {
        int i2;
        int i3 = 0;
        this.f23679d = 0;
        do {
            int i4 = this.f23679d;
            int i5 = i + i4;
            C5617u1 u1Var = this.f23676a;
            if (i5 >= u1Var.f24139c) {
                break;
            }
            int[] iArr = u1Var.f24142f;
            this.f23679d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public final no2 mo20993a() {
        return this.f23677b;
    }

    /* renamed from: b */
    public final C5617u1 mo20994b() {
        return this.f23676a;
    }

    /* renamed from: c */
    public final void mo20995c() {
        this.f23676a.mo21203a();
        this.f23677b.mo19776c(0);
        this.f23678c = -1;
        this.f23680e = false;
    }

    /* renamed from: d */
    public final void mo20996d() {
        if (this.f23677b.mo19781h().length != 65025) {
            no2 no2 = this.f23677b;
            no2.mo19777d(Arrays.copyOf(no2.mo19781h(), Math.max(65025, this.f23677b.mo19785l())), this.f23677b.mo19785l());
        }
    }

    /* renamed from: e */
    public final boolean mo20997e(z84 z84) throws IOException {
        if (this.f23680e) {
            this.f23680e = false;
            this.f23677b.mo19776c(0);
        }
        while (true) {
            boolean z = true;
            if (this.f23680e) {
                return true;
            }
            int i = this.f23678c;
            if (i < 0) {
                if (!this.f23676a.mo21205c(z84, -1) || !this.f23676a.mo21204b(z84, true)) {
                    return false;
                }
                C5617u1 u1Var = this.f23676a;
                int i2 = u1Var.f24140d;
                if ((u1Var.f24137a & 1) == 1 && this.f23677b.mo19785l() == 0) {
                    i2 += m31017f(0);
                    i = this.f23679d;
                } else {
                    i = 0;
                }
                if (!c94.m21833e(z84, i2)) {
                    return false;
                }
                this.f23678c = i;
            }
            int f = m31017f(i);
            int i3 = this.f23678c + this.f23679d;
            if (f > 0) {
                no2 no2 = this.f23677b;
                no2.mo19773H(no2.mo19785l() + f);
                if (!c94.m21832d(z84, this.f23677b.mo19781h(), this.f23677b.mo19785l(), f)) {
                    return false;
                }
                no2 no22 = this.f23677b;
                no22.mo19778e(no22.mo19785l() + f);
                if (this.f23676a.f24142f[i3 - 1] == 255) {
                    z = false;
                }
                this.f23680e = z;
            }
            if (i3 == this.f23676a.f24139c) {
                i3 = -1;
            }
            this.f23678c = i3;
        }
        return false;
    }
}
