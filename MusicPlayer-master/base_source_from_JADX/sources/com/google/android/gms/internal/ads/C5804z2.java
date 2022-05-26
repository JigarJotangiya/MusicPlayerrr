package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5804z2 {

    /* renamed from: a */
    private final da4 f26626a;

    /* renamed from: b */
    private long f26627b;

    /* renamed from: c */
    private boolean f26628c;

    /* renamed from: d */
    private int f26629d;

    /* renamed from: e */
    private long f26630e;

    /* renamed from: f */
    private boolean f26631f;

    /* renamed from: g */
    private boolean f26632g;

    /* renamed from: h */
    private boolean f26633h;

    /* renamed from: i */
    private boolean f26634i;

    /* renamed from: j */
    private boolean f26635j;

    /* renamed from: k */
    private long f26636k;

    /* renamed from: l */
    private long f26637l;

    /* renamed from: m */
    private boolean f26638m;

    public C5804z2(da4 da4) {
        this.f26626a = da4;
    }

    /* renamed from: e */
    private final void m34397e(int i) {
        long j = this.f26637l;
        if (j != -9223372036854775807L) {
            boolean z = this.f26638m;
            long j2 = this.f26627b;
            long j3 = this.f26636k;
            this.f26626a.mo16889e(j, z ? 1 : 0, (int) (j2 - j3), i, (ca4) null);
        }
    }

    /* renamed from: a */
    public final void mo22321a(long j, int i, boolean z) {
        if (this.f26635j && this.f26632g) {
            this.f26638m = this.f26628c;
            this.f26635j = false;
        } else if (this.f26633h || this.f26632g) {
            if (z && this.f26634i) {
                m34397e(i + ((int) (j - this.f26627b)));
            }
            this.f26636k = this.f26627b;
            this.f26637l = this.f26630e;
            this.f26638m = this.f26628c;
            this.f26634i = true;
        }
    }

    /* renamed from: b */
    public final void mo22322b(byte[] bArr, int i, int i2) {
        if (this.f26631f) {
            int i3 = this.f26629d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f26632g = (bArr[i4] & 128) != 0;
                this.f26631f = false;
                return;
            }
            this.f26629d = i3 + (i2 - i);
        }
    }

    /* renamed from: c */
    public final void mo22323c() {
        this.f26631f = false;
        this.f26632g = false;
        this.f26633h = false;
        this.f26634i = false;
        this.f26635j = false;
    }

    /* renamed from: d */
    public final void mo22324d(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.f26632g = false;
        this.f26633h = false;
        this.f26630e = j2;
        this.f26629d = 0;
        this.f26627b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f26634i && !this.f26635j) {
                if (z) {
                    m34397e(i);
                }
                this.f26634i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.f26633h = !this.f26635j;
                this.f26635j = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.f26628c = z3;
        if (z3 || i2 <= 9) {
            z2 = true;
        }
        this.f26631f = z2;
    }
}
