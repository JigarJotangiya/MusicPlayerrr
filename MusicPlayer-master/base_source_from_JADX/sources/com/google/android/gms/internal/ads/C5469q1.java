package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.q1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5469q1 extends C4914b2 {

    /* renamed from: n */
    private n94 f21788n;

    /* renamed from: o */
    private C5432p1 f21789o;

    C5469q1() {
    }

    /* renamed from: j */
    private static boolean m29301j(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo16005a(no2 no2) {
        if (!m29301j(no2.mo19781h())) {
            return -1;
        }
        int i = (no2.mo19781h()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int a = h94.m24736a(no2, i);
            no2.mo19779f(0);
            return (long) a;
        }
        no2.mo19780g(4);
        no2.mo19768C();
        int a2 = h94.m24736a(no2, i);
        no2.mo19779f(0);
        return (long) a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16006b(boolean z) {
        super.mo16006b(z);
        if (z) {
            this.f21788n = null;
            this.f21789o = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16007c(no2 no2, long j, C5728x1 x1Var) {
        byte[] h = no2.mo19781h();
        n94 n94 = this.f21788n;
        if (n94 == null) {
            n94 n942 = new n94(h, 17);
            this.f21788n = n942;
            x1Var.f25615a = n942.mo19659c(Arrays.copyOfRange(h, 9, no2.mo19785l()), (zzdd) null);
            return true;
        } else if ((h[0] & Byte.MAX_VALUE) == 3) {
            m94 b = k94.m26170b(no2);
            n94 f = n94.mo19662f(b);
            this.f21788n = f;
            this.f21789o = new C5432p1(f, b);
            return true;
        } else if (!m29301j(h)) {
            return true;
        } else {
            C5432p1 p1Var = this.f21789o;
            if (p1Var != null) {
                p1Var.mo20173a(j);
                x1Var.f25616b = this.f21789o;
            }
            Objects.requireNonNull(x1Var.f25615a);
            return false;
        }
    }
}
