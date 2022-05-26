package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tq0 implements qb1 {

    /* renamed from: a */
    private final qb1 f23966a;

    /* renamed from: b */
    private final long f23967b;

    /* renamed from: c */
    private final qb1 f23968c;

    /* renamed from: d */
    private long f23969d;

    /* renamed from: e */
    private Uri f23970e;

    tq0(qb1 qb1, int i, qb1 qb12) {
        this.f23966a = qb1;
        this.f23967b = (long) i;
        this.f23968c = qb12;
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f23969d;
        long j2 = this.f23967b;
        if (j < j2) {
            int c = this.f23966a.mo15695c(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f23969d + ((long) c);
            this.f23969d = j3;
            i3 = c;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f23967b) {
            return i3;
        }
        int c2 = this.f23968c.mo15695c(bArr, i + i3, i2 - i3);
        this.f23969d += (long) c2;
        return i3 + c2;
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f23970e;
    }

    /* renamed from: h */
    public final void mo15697h() throws IOException {
        this.f23966a.mo15697h();
        this.f23968c.mo15697h();
    }

    /* renamed from: l */
    public final void mo19648l(fr1 fr1) {
    }

    /* renamed from: m */
    public final long mo15698m(uf1 uf1) throws IOException {
        uf1 uf12;
        uf1 uf13 = uf1;
        this.f23970e = uf13.f24320a;
        long j = uf13.f24325f;
        long j2 = this.f23967b;
        uf1 uf14 = null;
        if (j >= j2) {
            uf12 = null;
        } else {
            long j3 = uf13.f24326g;
            uf12 = new uf1(uf13.f24320a, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = uf13.f24326g;
        if (j4 == -1 || uf13.f24325f + j4 > this.f23967b) {
            long max = Math.max(this.f23967b, uf13.f24325f);
            long j5 = uf13.f24326g;
            uf14 = new uf1(uf13.f24320a, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (uf13.f24325f + j5) - this.f23967b) : -1, (String) null, 0);
        }
        long j6 = 0;
        long m = uf12 != null ? this.f23966a.mo15698m(uf12) : 0;
        if (uf14 != null) {
            j6 = this.f23968c.mo15698m(uf14);
        }
        this.f23969d = uf13.f24325f;
        if (m == -1 || j6 == -1) {
            return -1;
        }
        return m + j6;
    }

    public final Map<String, List<String>> zza() {
        return k43.zzd();
    }
}
