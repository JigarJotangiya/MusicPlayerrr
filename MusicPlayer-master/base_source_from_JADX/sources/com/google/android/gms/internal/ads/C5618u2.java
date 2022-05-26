package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5618u2 {

    /* renamed from: a */
    private final da4 f24147a;

    /* renamed from: b */
    private boolean f24148b;

    /* renamed from: c */
    private boolean f24149c;

    /* renamed from: d */
    private boolean f24150d;

    /* renamed from: e */
    private int f24151e;

    /* renamed from: f */
    private int f24152f;

    /* renamed from: g */
    private long f24153g;

    /* renamed from: h */
    private long f24154h;

    public C5618u2(da4 da4) {
        this.f24147a = da4;
    }

    /* renamed from: a */
    public final void mo21208a(byte[] bArr, int i, int i2) {
        if (this.f24149c) {
            int i3 = this.f24152f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f24150d = ((bArr[i4] & 192) >> 6) == 0;
                this.f24149c = false;
                return;
            }
            this.f24152f = i3 + (i2 - i);
        }
    }

    /* renamed from: b */
    public final void mo21209b(long j, int i, boolean z) {
        if (this.f24151e == 182 && z && this.f24148b) {
            long j2 = this.f24154h;
            if (j2 != -9223372036854775807L) {
                long j3 = this.f24153g;
                int i2 = (int) (j - j3);
                this.f24147a.mo16889e(j2, this.f24150d ? 1 : 0, i2, i, (ca4) null);
            }
        }
        if (this.f24151e != 179) {
            this.f24153g = j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21210c(int r5, long r6) {
        /*
            r4 = this;
            r4.f24151e = r5
            r0 = 0
            r4.f24150d = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L_0x0013
            if (r5 != r1) goto L_0x0011
            r5 = 179(0xb3, float:2.51E-43)
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            r4.f24148b = r1
            if (r5 != r2) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r4.f24149c = r3
            r4.f24152f = r0
            r4.f24154h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5618u2.mo21210c(int, long):void");
    }

    /* renamed from: d */
    public final void mo21211d() {
        this.f24148b = false;
        this.f24149c = false;
        this.f24150d = false;
        this.f24151e = -1;
    }
}
