package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class s84 implements z94 {

    /* renamed from: a */
    private final long f23378a;

    /* renamed from: b */
    private final long f23379b;

    /* renamed from: c */
    private final int f23380c;

    /* renamed from: d */
    private final long f23381d;

    /* renamed from: e */
    private final int f23382e;

    /* renamed from: f */
    private final long f23383f;

    public s84(long j, long j2, int i, int i2, boolean z) {
        long d;
        this.f23378a = j;
        this.f23379b = j2;
        this.f23380c = i2 == -1 ? 1 : i2;
        this.f23382e = i;
        if (j == -1) {
            this.f23381d = -1;
            d = -9223372036854775807L;
        } else {
            this.f23381d = j - j2;
            d = m30617d(j, j2, i);
        }
        this.f23383f = d;
    }

    /* renamed from: d */
    private static long m30617d(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    /* renamed from: b */
    public final long mo20810b(long j) {
        return m30617d(j, this.f23379b, this.f23382e);
    }

    /* renamed from: c */
    public final x94 mo15607c(long j) {
        long j2 = this.f23381d;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        if (i != 0) {
            int i2 = this.f23382e;
            long j3 = (long) this.f23380c;
            long j4 = (((((long) i2) * j) / 8000000) / j3) * j3;
            if (i != 0) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.f23379b + Math.max(j4, 0);
            long b = mo20810b(max);
            aa4 aa4 = new aa4(b, max);
            if (this.f23381d != -1 && b < j) {
                long j5 = max + ((long) this.f23380c);
                if (j5 < this.f23378a) {
                    return new x94(aa4, new aa4(mo20810b(j5), j5));
                }
            }
            return new x94(aa4, aa4);
        }
        aa4 aa42 = new aa4(0, this.f23379b);
        return new x94(aa42, aa42);
    }

    /* renamed from: e */
    public final boolean mo15608e() {
        return this.f23381d != -1;
    }

    public final long zze() {
        return this.f23383f;
    }
}
