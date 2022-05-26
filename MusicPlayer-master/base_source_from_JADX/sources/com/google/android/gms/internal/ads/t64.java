package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t64 implements qb1 {

    /* renamed from: a */
    private final qb1 f23772a;

    /* renamed from: b */
    private long f23773b;

    /* renamed from: c */
    private Uri f23774c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f23775d = Collections.emptyMap();

    public t64(qb1 qb1) {
        Objects.requireNonNull(qb1);
        this.f23772a = qb1;
    }

    /* renamed from: b */
    public final long mo21033b() {
        return this.f23773b;
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws IOException {
        int c = this.f23772a.mo15695c(bArr, i, i2);
        if (c != -1) {
            this.f23773b += (long) c;
        }
        return c;
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f23772a.mo15696g();
    }

    /* renamed from: h */
    public final void mo15697h() throws IOException {
        this.f23772a.mo15697h();
    }

    /* renamed from: l */
    public final void mo19648l(fr1 fr1) {
        Objects.requireNonNull(fr1);
        this.f23772a.mo19648l(fr1);
    }

    /* renamed from: m */
    public final long mo15698m(uf1 uf1) throws IOException {
        this.f23774c = uf1.f24320a;
        this.f23775d = Collections.emptyMap();
        long m = this.f23772a.mo15698m(uf1);
        Uri g = mo15696g();
        Objects.requireNonNull(g);
        this.f23774c = g;
        this.f23775d = zza();
        return m;
    }

    /* renamed from: n */
    public final Uri mo21034n() {
        return this.f23774c;
    }

    /* renamed from: o */
    public final Map<String, List<String>> mo21035o() {
        return this.f23775d;
    }

    public final Map<String, List<String>> zza() {
        return this.f23772a.zza();
    }
}
