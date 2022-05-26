package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class sl3 {

    /* renamed from: d */
    private static volatile int f23541d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f23542e = 0;

    /* renamed from: a */
    int f23543a;

    /* renamed from: b */
    final int f23544b = f23541d;

    /* renamed from: c */
    tl3 f23545c;

    /* synthetic */ sl3(rl3 rl3) {
    }

    /* renamed from: e */
    public static int m30774e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: f */
    public static long m30775f(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    static sl3 m30776g(byte[] bArr, int i, int i2, boolean z) {
        ml3 ml3 = new ml3(bArr, i, i2, z, (ll3) null);
        try {
            ml3.mo19432k(i2);
            return ml3;
        } catch (bn3 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract void mo19417A(int i) throws bn3;

    /* renamed from: a */
    public abstract void mo19425a(int i);

    /* renamed from: b */
    public abstract boolean mo19426b() throws IOException;

    /* renamed from: c */
    public abstract boolean mo19427c() throws IOException;

    /* renamed from: d */
    public abstract boolean mo19428d(int i) throws IOException;

    /* renamed from: h */
    public abstract double mo19429h() throws IOException;

    /* renamed from: i */
    public abstract float mo19430i() throws IOException;

    /* renamed from: j */
    public abstract int mo19431j();

    /* renamed from: k */
    public abstract int mo19432k(int i) throws bn3;

    /* renamed from: l */
    public abstract int mo19433l() throws IOException;

    /* renamed from: m */
    public abstract int mo19434m() throws IOException;

    /* renamed from: n */
    public abstract int mo19435n() throws IOException;

    /* renamed from: o */
    public abstract int mo19436o() throws IOException;

    /* renamed from: p */
    public abstract int mo19437p() throws IOException;

    /* renamed from: q */
    public abstract int mo19438q() throws IOException;

    /* renamed from: r */
    public abstract int mo19439r() throws IOException;

    /* renamed from: s */
    public abstract long mo19440s() throws IOException;

    /* renamed from: t */
    public abstract long mo19441t() throws IOException;

    /* renamed from: u */
    public abstract long mo19442u() throws IOException;

    /* renamed from: v */
    public abstract long mo19443v() throws IOException;

    /* renamed from: w */
    public abstract long mo19444w() throws IOException;

    /* renamed from: x */
    public abstract kl3 mo19445x() throws IOException;

    /* renamed from: y */
    public abstract String mo19446y() throws IOException;

    /* renamed from: z */
    public abstract String mo19447z() throws IOException;
}
