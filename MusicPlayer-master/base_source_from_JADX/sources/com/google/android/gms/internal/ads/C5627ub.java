package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ub */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5627ub implements Runnable {

    /* renamed from: g */
    final /* synthetic */ int f24284g;

    /* renamed from: h */
    final /* synthetic */ C5701wb f24285h;

    C5627ub(C5701wb wbVar, int i, boolean z) {
        this.f24285h = wbVar;
        this.f24284g = i;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.wb r0 = r5.f24285h
            int r1 = r5.f24284g
            if (r1 <= 0) goto L_0x000c
            int r1 = r1 * 1000
            long r1 = (long) r1
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x000c }
        L_0x000c:
            android.content.Context r1 = r0.f25311a     // Catch:{ all -> 0x002e }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x002e }
            android.content.Context r2 = r0.f25311a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x002e }
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ all -> 0x002e }
            android.content.Context r0 = r0.f25311a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ all -> 0x002e }
            int r1 = r1.versionCode     // Catch:{ all -> 0x002e }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.r8 r0 = com.google.android.gms.internal.ads.ly2.m27006a(r0, r2, r1)     // Catch:{ all -> 0x002e }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.wb r1 = r5.f24285h
            r1.f25320j = r0
            int r1 = r5.f24284g
            r2 = 4
            if (r1 >= r2) goto L_0x0076
            if (r0 != 0) goto L_0x003c
            goto L_0x006d
        L_0x003c:
            boolean r1 = r0.mo20602k0()
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = r0.mo20607y0()
            java.lang.String r2 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006d
            boolean r1 = r0.mo20603l0()
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.a9 r1 = r0.mo20605w0()
            boolean r1 = r1.mo15711G()
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.a9 r0 = r0.mo20605w0()
            long r0 = r0.mo15710D()
            r2 = -2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006d
            goto L_0x0076
        L_0x006d:
            com.google.android.gms.internal.ads.wb r0 = r5.f24285h
            int r1 = r5.f24284g
            r2 = 1
            int r1 = r1 + r2
            r0.mo21788o(r1, r2)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5627ub.run():void");
    }
}
