package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tv2 {

    /* renamed from: a */
    private long f24030a;

    /* renamed from: b */
    private long f24031b;

    /* renamed from: c */
    private long f24032c;

    /* renamed from: d */
    private final ThreadLocal<Long> f24033d = new ThreadLocal<>();

    public tv2(long j) {
        mo21176f(0);
    }

    /* renamed from: a */
    public final synchronized long mo21171a(long j) {
        if (this.f24031b == -9223372036854775807L) {
            long j2 = this.f24030a;
            if (j2 == 9223372036854775806L) {
                Long l = this.f24033d.get();
                Objects.requireNonNull(l);
                j2 = l.longValue();
            }
            this.f24031b = j2 - j;
            notifyAll();
        }
        this.f24032c = j;
        return j + this.f24031b;
    }

    /* renamed from: b */
    public final synchronized long mo21172b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f24032c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((-1 + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return mo21171a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long mo21173c() {
        long j = this.f24030a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: d */
    public final synchronized long mo21174d() {
        long j;
        j = this.f24032c;
        return j != -9223372036854775807L ? j + this.f24031b : mo21173c();
    }

    /* renamed from: e */
    public final synchronized long mo21175e() {
        return this.f24031b;
    }

    /* renamed from: f */
    public final synchronized void mo21176f(long j) {
        this.f24030a = j;
        this.f24031b = j == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f24032c = -9223372036854775807L;
    }
}
