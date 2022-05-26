package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class l14 implements u34 {

    /* renamed from: a */
    public final u34 f19149a;

    /* renamed from: b */
    private boolean f19150b;

    /* renamed from: c */
    final /* synthetic */ m14 f19151c;

    public l14(m14 m14, u34 u34) {
        this.f19151c = m14;
        this.f19149a = u34;
    }

    /* renamed from: a */
    public final int mo16847a(long j) {
        if (this.f19151c.mo19325p()) {
            return -3;
        }
        return this.f19149a.mo16847a(j);
    }

    /* renamed from: b */
    public final int mo16848b(qt3 qt3, k31 k31, int i) {
        if (this.f19151c.mo19325p()) {
            return -3;
        }
        if (this.f19150b) {
            k31.mo17029c(4);
            return -4;
        }
        int b = this.f19149a.mo16848b(qt3, k31, i);
        if (b == -5) {
            C5689w wVar = qt3.f22027a;
            Objects.requireNonNull(wVar);
            int i2 = wVar.f25117B;
            int i3 = 0;
            if (i2 == 0) {
                if (wVar.f25118C != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (this.f19151c.f19705k == Long.MIN_VALUE) {
                i3 = wVar.f25118C;
            }
            jb4 b2 = wVar.mo21657b();
            b2.mo18577c(i2);
            b2.mo18579d(i3);
            qt3.f22027a = b2.mo18605y();
            return -5;
        }
        m14 m14 = this.f19151c;
        long j = m14.f19705k;
        if (j == Long.MIN_VALUE || ((b != -4 || k31.f18745e < j) && (b != -3 || m14.mo17092a() != Long.MIN_VALUE || k31.f18744d))) {
            return b;
        }
        k31.mo16814b();
        k31.mo17029c(4);
        this.f19150b = true;
        return -4;
    }

    /* renamed from: c */
    public final void mo19047c() {
        this.f19150b = false;
    }

    /* renamed from: f */
    public final void mo16849f() throws IOException {
        this.f19149a.mo16849f();
    }

    public final boolean zze() {
        return !this.f19151c.mo19325p() && this.f19149a.zze();
    }
}
