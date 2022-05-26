package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pz2 {

    /* renamed from: a */
    private final C5407od f21768a;

    /* renamed from: b */
    private final File f21769b;

    /* renamed from: c */
    private final File f21770c;

    /* renamed from: d */
    private final File f21771d;

    /* renamed from: e */
    private byte[] f21772e;

    public pz2(C5407od odVar, File file, File file2, File file3) {
        this.f21768a = odVar;
        this.f21769b = file;
        this.f21770c = file3;
        this.f21771d = file2;
    }

    /* renamed from: a */
    public final C5407od mo20348a() {
        return this.f21768a;
    }

    /* renamed from: b */
    public final File mo20349b() {
        return this.f21770c;
    }

    /* renamed from: c */
    public final File mo20350c() {
        return this.f21769b;
    }

    /* renamed from: d */
    public final boolean mo20351d(long j) {
        return this.f21768a.mo19960E() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo20352e() {
        /*
            r3 = this;
            byte[] r0 = r3.f21772e
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.io.File r0 = r3.f21771d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            com.google.android.gms.internal.ads.kl3 r0 = com.google.android.gms.internal.ads.kl3.zzy(r2)     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            byte[] r0 = r0.zzE()     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            com.google.android.gms.common.util.C3365j.m14462a(r2)
            goto L_0x0025
        L_0x0018:
            r0 = move-exception
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r0 = move-exception
        L_0x001c:
            com.google.android.gms.common.util.C3365j.m14462a(r1)
            throw r0
        L_0x0020:
            r2 = r1
        L_0x0021:
            com.google.android.gms.common.util.C3365j.m14462a(r2)
            r0 = r1
        L_0x0025:
            r3.f21772e = r0
        L_0x0027:
            byte[] r0 = r3.f21772e
            if (r0 != 0) goto L_0x002c
            return r1
        L_0x002c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pz2.mo20352e():byte[]");
    }
}
