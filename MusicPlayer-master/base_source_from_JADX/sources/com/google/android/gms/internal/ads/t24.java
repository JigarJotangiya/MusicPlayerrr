package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class t24 implements u34 {

    /* renamed from: a */
    private final u34 f23696a;

    /* renamed from: b */
    private final long f23697b;

    public t24(u34 u34, long j) {
        this.f23696a = u34;
        this.f23697b = j;
    }

    /* renamed from: a */
    public final int mo16847a(long j) {
        return this.f23696a.mo16847a(j - this.f23697b);
    }

    /* renamed from: b */
    public final int mo16848b(qt3 qt3, k31 k31, int i) {
        int b = this.f23696a.mo16848b(qt3, k31, i);
        if (b != -4) {
            return b;
        }
        k31.f18745e = Math.max(0, k31.f18745e + this.f23697b);
        return -4;
    }

    /* renamed from: c */
    public final u34 mo21004c() {
        return this.f23696a;
    }

    /* renamed from: f */
    public final void mo16849f() throws IOException {
        this.f23696a.mo16849f();
    }

    public final boolean zze() {
        return this.f23696a.zze();
    }
}
