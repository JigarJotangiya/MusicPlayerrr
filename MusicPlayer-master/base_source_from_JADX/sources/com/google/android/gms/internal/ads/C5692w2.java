package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.w2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5692w2 {

    /* renamed from: a */
    private final da4 f25179a;

    /* renamed from: b */
    private final SparseArray<ce2> f25180b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<bd2> f25181c = new SparseArray<>();

    /* renamed from: d */
    private final byte[] f25182d;

    /* renamed from: e */
    private int f25183e;

    /* renamed from: f */
    private long f25184f;

    /* renamed from: g */
    private long f25185g;

    /* renamed from: h */
    private boolean f25186h;

    /* renamed from: i */
    private long f25187i;

    /* renamed from: j */
    private long f25188j;

    /* renamed from: k */
    private boolean f25189k;

    public C5692w2(da4 da4, boolean z, boolean z2) {
        this.f25179a = da4;
        byte[] bArr = new byte[128];
        this.f25182d = bArr;
        new op2(bArr, 0, 0);
        this.f25186h = false;
    }

    /* renamed from: a */
    public final void mo21679a(bd2 bd2) {
        this.f25181c.append(bd2.f14407a, bd2);
    }

    /* renamed from: b */
    public final void mo21680b(ce2 ce2) {
        this.f25180b.append(ce2.f14954d, ce2);
    }

    /* renamed from: c */
    public final void mo21681c() {
        this.f25186h = false;
    }

    /* renamed from: d */
    public final void mo21682d(long j, int i, long j2) {
        this.f25183e = i;
        this.f25185g = j2;
        this.f25184f = j;
    }

    /* renamed from: e */
    public final boolean mo21683e(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f25183e == 9) {
            if (z && this.f25186h) {
                long j2 = this.f25184f;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f25188j;
                if (j3 != -9223372036854775807L) {
                    boolean z4 = this.f25189k;
                    long j4 = this.f25187i;
                    this.f25179a.mo16889e(j3, z4 ? 1 : 0, (int) (j2 - j4), i2, (ca4) null);
                }
            }
            this.f25187i = this.f25184f;
            this.f25188j = this.f25185g;
            this.f25189k = false;
            this.f25186h = true;
        }
        boolean z5 = this.f25189k;
        int i3 = this.f25183e;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.f25189k = z6;
        return z6;
    }
}
