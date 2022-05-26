package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.j4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5213j4 implements C5176i4 {

    /* renamed from: a */
    private final b94 f18350a;

    /* renamed from: b */
    private final da4 f18351b;

    /* renamed from: c */
    private final C5287l4 f18352c;

    /* renamed from: d */
    private final C5689w f18353d;

    /* renamed from: e */
    private final int f18354e;

    /* renamed from: f */
    private long f18355f;

    /* renamed from: g */
    private int f18356g;

    /* renamed from: h */
    private long f18357h;

    public C5213j4(b94 b94, da4 da4, C5287l4 l4Var, String str, int i) throws C5464px {
        this.f18350a = b94;
        this.f18351b = da4;
        this.f18352c = l4Var;
        int i2 = (l4Var.f19192b * l4Var.f19195e) / 8;
        int i3 = l4Var.f19194d;
        if (i3 == i2) {
            int i4 = l4Var.f19193c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.f18354e = max;
            jb4 jb4 = new jb4();
            jb4.mo18599s(str);
            jb4.mo18580d0(i5);
            jb4.mo18595o(i5);
            jb4.mo18592l(max);
            jb4.mo18582e0(l4Var.f19192b);
            jb4.mo18600t(l4Var.f19193c);
            jb4.mo18594n(i);
            this.f18353d = jb4.mo18605y();
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(i3);
        throw C5464px.zza(sb.toString(), (Throwable) null);
    }

    /* renamed from: a */
    public final void mo18066a(long j) {
        this.f18355f = j;
        this.f18356g = 0;
        this.f18357h = 0;
    }

    /* renamed from: b */
    public final void mo18067b(int i, long j) {
        this.f18350a.mo15723r(new C5398o4(this.f18352c, 1, (long) i, j));
        this.f18351b.mo16885a(this.f18353d);
    }

    /* renamed from: c */
    public final boolean mo18068c(z84 z84, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i <= 0 || (i2 = this.f18356g) >= (i3 = this.f18354e)) {
                C5287l4 l4Var = this.f18352c;
                int i4 = l4Var.f19194d;
                int i5 = this.f18356g / i4;
            } else {
                int a = ba4.m21198a(this.f18351b, z84, (int) Math.min((long) (i3 - i2), j2), true);
                if (a == -1) {
                    j2 = 0;
                } else {
                    this.f18356g += a;
                    j2 -= (long) a;
                }
            }
        }
        C5287l4 l4Var2 = this.f18352c;
        int i42 = l4Var2.f19194d;
        int i52 = this.f18356g / i42;
        if (i52 > 0) {
            long j3 = this.f18355f;
            long Z = wy2.m33431Z(this.f18357h, 1000000, (long) l4Var2.f19193c);
            int i6 = i52 * i42;
            int i7 = this.f18356g - i6;
            this.f18351b.mo16889e(j3 + Z, 1, i6, i7, (ca4) null);
            this.f18357h += (long) i52;
            this.f18356g = i7;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }
}
