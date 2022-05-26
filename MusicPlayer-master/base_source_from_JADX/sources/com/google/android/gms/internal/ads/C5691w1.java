package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.w1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5691w1 extends C4914b2 {

    /* renamed from: o */
    private static final byte[] f25169o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    private boolean f25170n;

    C5691w1() {
    }

    /* renamed from: j */
    public static boolean m32854j(no2 no2) {
        if (no2.mo19782i() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        no2.mo19775b(bArr, 0, 8);
        return Arrays.equals(bArr, f25169o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo16005a(no2 no2) {
        byte[] h = no2.mo19781h();
        byte b = h[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = h[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo16010f(((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16006b(boolean z) {
        super.mo16006b(z);
        if (z) {
            this.f25170n = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16007c(no2 no2, long j, C5728x1 x1Var) {
        boolean z = true;
        if (!this.f25170n) {
            byte[] copyOf = Arrays.copyOf(no2.mo19781h(), no2.mo19785l());
            byte b = copyOf[9];
            List<byte[]> a = v94.m32233a(copyOf);
            jb4 jb4 = new jb4();
            jb4.mo18599s("audio/opus");
            jb4.mo18582e0(b & 255);
            jb4.mo18600t(48000);
            jb4.mo18589i(a);
            x1Var.f25615a = jb4.mo18605y();
            this.f25170n = true;
            return true;
        }
        Objects.requireNonNull(x1Var.f25615a);
        if (no2.mo19786m() != 1332770163) {
            z = false;
        }
        no2.mo19779f(0);
        return z;
    }
}
