package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xe */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C5741xe {

    /* renamed from: a */
    public static final C5741xe f25777a = new C5630ue();

    /* renamed from: a */
    public abstract int mo15822a(Object obj);

    /* renamed from: b */
    public abstract int mo15823b();

    /* renamed from: c */
    public abstract int mo15824c();

    /* renamed from: d */
    public abstract C5667ve mo15825d(int i, C5667ve veVar, boolean z);

    /* renamed from: e */
    public abstract C5704we mo15826e(int i, C5704we weVar, boolean z, long j);

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((mo15824c() - 1) == 0) goto L_0x0020;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo22025f(int r3, com.google.android.gms.internal.ads.C5667ve r4, com.google.android.gms.internal.ads.C5704we r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.mo15825d(r3, r4, r0)
            r2.mo22026g(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.mo15824c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = 0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.mo15824c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            r4 = -1
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.mo22026g(r4, r5, r0)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5741xe.mo22025f(int, com.google.android.gms.internal.ads.ve, com.google.android.gms.internal.ads.we, int):int");
    }

    /* renamed from: g */
    public final C5704we mo22026g(int i, C5704we weVar, boolean z) {
        return mo15826e(i, weVar, false, 0);
    }

    /* renamed from: h */
    public final boolean mo22027h() {
        return mo15824c() == 0;
    }
}
