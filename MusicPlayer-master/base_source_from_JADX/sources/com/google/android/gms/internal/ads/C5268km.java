package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.km */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5268km {

    /* renamed from: a */
    private final C5231jm f18910a;

    /* renamed from: b */
    private final boolean f18911b;

    /* renamed from: c */
    private final long f18912c;

    /* renamed from: d */
    private final long f18913d;

    /* renamed from: e */
    private long f18914e;

    /* renamed from: f */
    private long f18915f;

    /* renamed from: g */
    private long f18916g;

    /* renamed from: h */
    private boolean f18917h;

    /* renamed from: i */
    private long f18918i;

    /* renamed from: j */
    private long f18919j;

    /* renamed from: k */
    private long f18920k;

    private C5268km(double d) {
        long j;
        boolean z = d != -1.0d;
        this.f18911b = z;
        if (z) {
            this.f18910a = C5231jm.m25773a();
            long j2 = (long) (1.0E9d / d);
            this.f18912c = j2;
            j = (j2 * 80) / 100;
        } else {
            this.f18910a = null;
            j = -1;
            this.f18912c = -1;
        }
        this.f18913d = j;
    }

    /* renamed from: d */
    private final boolean m26267d(long j, long j2) {
        return Math.abs((j2 - this.f18918i) - (j - this.f18919j)) > 20000000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo18918a(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f18917h
            if (r2 == 0) goto L_0x0042
            long r2 = r11.f18914e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r11.f18920k
            r4 = 1
            long r2 = r2 + r4
            r11.f18920k = r2
            long r2 = r11.f18916g
            r11.f18915f = r2
        L_0x0019:
            long r2 = r11.f18920k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r11.f18919j
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.f18915f
            long r2 = r2 + r4
            boolean r4 = r11.m26267d(r2, r14)
            if (r4 == 0) goto L_0x0033
            r11.f18917h = r6
            goto L_0x0042
        L_0x0033:
            long r4 = r11.f18918i
            long r4 = r4 + r2
            long r6 = r11.f18919j
            long r4 = r4 - r6
            goto L_0x0044
        L_0x003a:
            boolean r2 = r11.m26267d(r0, r14)
            if (r2 == 0) goto L_0x0042
            r11.f18917h = r6
        L_0x0042:
            r4 = r14
            r2 = r0
        L_0x0044:
            boolean r6 = r11.f18917h
            r7 = 0
            if (r6 != 0) goto L_0x0053
            r11.f18919j = r0
            r11.f18918i = r14
            r11.f18920k = r7
            r14 = 1
            r11.f18917h = r14
        L_0x0053:
            r11.f18914e = r12
            r11.f18916g = r2
            com.google.android.gms.internal.ads.jm r12 = r11.f18910a
            if (r12 == 0) goto L_0x0086
            long r12 = r12.f18527g
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0062
            goto L_0x0086
        L_0x0062:
            com.google.android.gms.internal.ads.jm r12 = r11.f18910a
            long r12 = r12.f18527g
            long r14 = r11.f18912c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0075
            long r14 = r12 - r14
            goto L_0x0079
        L_0x0075:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x0079:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r12 = r14
        L_0x0082:
            long r14 = r11.f18913d
            long r12 = r12 - r14
            return r12
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5268km.mo18918a(long, long):long");
    }

    /* renamed from: b */
    public final void mo18919b() {
        if (this.f18911b) {
            this.f18910a.mo18668c();
        }
    }

    /* renamed from: c */
    public final void mo18920c() {
        this.f18917h = false;
        if (this.f18911b) {
            this.f18910a.mo18667b();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5268km(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0018
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001a
        L_0x0018:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001a:
            r2.<init>((double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5268km.<init>(android.content.Context):void");
    }
}
