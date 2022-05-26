package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class xl3 extends bl3 {

    /* renamed from: b */
    private static final Logger f25872b = Logger.getLogger(xl3.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f25873c = vp3.m32633a();

    /* renamed from: a */
    yl3 f25874a;

    private xl3() {
    }

    /* synthetic */ xl3(wl3 wl3) {
    }

    /* renamed from: A */
    public static int m33729A(fn3 fn3) {
        int a = fn3.mo17576a();
        return m33733a(a) + a;
    }

    /* renamed from: B */
    static int m33730B(zn3 zn3, to3 to3) {
        vk3 vk3 = (vk3) zn3;
        int d = vk3.mo20468d();
        if (d == -1) {
            d = to3.mo16703b(vk3);
            vk3.mo20474j(d);
        }
        return m33733a(d) + d;
    }

    /* renamed from: C */
    public static int m33731C(String str) {
        int i;
        try {
            i = aq3.m20917e(str);
        } catch (zp3 unused) {
            i = str.getBytes(zm3.f26835a).length;
        }
        return m33733a(i) + i;
    }

    /* renamed from: D */
    public static int m33732D(int i) {
        return m33733a(i << 3);
    }

    /* renamed from: a */
    public static int m33733a(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: b */
    public static int m33734b(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: c */
    public static xl3 m33735c(byte[] bArr) {
        return new ul3(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m33737x(kl3 kl3) {
        int zzd = kl3.zzd();
        return m33733a(zzd) + zzd;
    }

    @Deprecated
    /* renamed from: y */
    static int m33738y(int i, zn3 zn3, to3 to3) {
        int a = m33733a(i << 3);
        int i2 = a + a;
        vk3 vk3 = (vk3) zn3;
        int d = vk3.mo20468d();
        if (d == -1) {
            d = to3.mo16703b(vk3);
            vk3.mo20474j(d);
        }
        return i2 + d;
    }

    /* renamed from: z */
    public static int m33739z(int i) {
        if (i >= 0) {
            return m33733a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo22049d() {
        if (mo21315g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo22050e(String str, zp3 zp3) throws IOException {
        f25872b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zp3);
        byte[] bytes = str.getBytes(zm3.f26835a);
        try {
            int length = bytes.length;
            mo21329u(length);
            mo21325q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new vl3(e);
        } catch (vl3 e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    public abstract int mo21315g();

    /* renamed from: h */
    public abstract void mo21316h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo21317i(int i, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo21318j(int i, kl3 kl3) throws IOException;

    /* renamed from: k */
    public abstract void mo21319k(int i, int i2) throws IOException;

    /* renamed from: l */
    public abstract void mo21320l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo21321m(int i, long j) throws IOException;

    /* renamed from: n */
    public abstract void mo21322n(long j) throws IOException;

    /* renamed from: o */
    public abstract void mo21323o(int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo21324p(int i) throws IOException;

    /* renamed from: q */
    public abstract void mo21325q(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo21326r(int i, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo21327s(int i, int i2) throws IOException;

    /* renamed from: t */
    public abstract void mo21328t(int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo21329u(int i) throws IOException;

    /* renamed from: v */
    public abstract void mo21330v(int i, long j) throws IOException;

    /* renamed from: w */
    public abstract void mo21331w(long j) throws IOException;
}
