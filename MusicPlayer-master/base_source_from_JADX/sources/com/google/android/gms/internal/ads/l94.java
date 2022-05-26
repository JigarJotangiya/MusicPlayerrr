package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l94 implements z94 {

    /* renamed from: a */
    private final n94 f19267a;

    /* renamed from: b */
    private final long f19268b;

    public l94(n94 n94, long j) {
        this.f19267a = n94;
        this.f19268b = j;
    }

    /* renamed from: b */
    private final aa4 m26604b(long j, long j2) {
        return new aa4((j * 1000000) / ((long) this.f19267a.f20559e), this.f19268b + j2);
    }

    /* renamed from: c */
    public final x94 mo15607c(long j) {
        long j2;
        gs1.m24484b(this.f19267a.f20565k);
        n94 n94 = this.f19267a;
        m94 m94 = n94.f20565k;
        long[] jArr = m94.f19813a;
        long[] jArr2 = m94.f19814b;
        int J = wy2.m33415J(jArr, n94.mo19658b(j), true, false);
        long j3 = 0;
        if (J == -1) {
            j2 = 0;
        } else {
            j2 = jArr[J];
        }
        if (J != -1) {
            j3 = jArr2[J];
        }
        aa4 b = m26604b(j2, j3);
        if (b.f13832a == j || J == jArr.length - 1) {
            return new x94(b, b);
        }
        int i = J + 1;
        return new x94(b, m26604b(jArr[i], jArr2[i]));
    }

    /* renamed from: e */
    public final boolean mo15608e() {
        return true;
    }

    public final long zze() {
        return this.f19267a.mo19657a();
    }
}
