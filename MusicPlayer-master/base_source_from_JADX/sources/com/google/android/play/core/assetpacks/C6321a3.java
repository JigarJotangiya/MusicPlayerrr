package com.google.android.play.core.assetpacks;

import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;

/* renamed from: com.google.android.play.core.assetpacks.a3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6321a3 {

    /* renamed from: c */
    private static final C7577a f29371c = new C7577a("PatchSliceTaskHandler");

    /* renamed from: a */
    private final C6355g0 f29372a;

    /* renamed from: b */
    private final C7620y<C6347e4> f29373b;

    C6321a3(C6355g0 g0Var, C7620y<C6347e4> yVar) {
        this.f29372a = g0Var;
        this.f29373b = yVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00ab */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25213a(com.google.android.play.core.assetpacks.C6452z2 r15) {
        /*
            r14 = this;
            com.google.android.play.core.assetpacks.g0 r0 = r14.f29372a
            java.lang.String r1 = r15.f29410b
            int r2 = r15.f29730c
            long r3 = r15.f29731d
            java.io.File r0 = r0.mo25261u(r1, r2, r3)
            com.google.android.play.core.assetpacks.g0 r1 = r14.f29372a
            java.lang.String r2 = r15.f29410b
            int r3 = r15.f29730c
            long r4 = r15.f29731d
            java.lang.String r6 = r15.f29735h
            java.io.File r7 = new java.io.File
            java.io.File r1 = r1.mo25262v(r2, r3, r4)
            r7.<init>(r1, r6)
            r1 = 2
            r2 = 1
            r3 = 0
            java.io.InputStream r4 = r15.f29737j     // Catch:{ IOException -> 0x00ac }
            int r5 = r15.f29734g     // Catch:{ IOException -> 0x00ac }
            if (r5 == r1) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x00ac }
            r6 = 8192(0x2000, float:1.14794E-41)
            r5.<init>(r4, r6)     // Catch:{ IOException -> 0x00ac }
            r4 = r5
        L_0x0031:
            com.google.android.play.core.assetpacks.j0 r5 = new com.google.android.play.core.assetpacks.j0     // Catch:{ all -> 0x00a7 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x00a7 }
            com.google.android.play.core.assetpacks.g0 r8 = r14.f29372a     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = r15.f29410b     // Catch:{ all -> 0x00a7 }
            int r10 = r15.f29732e     // Catch:{ all -> 0x00a7 }
            long r11 = r15.f29733f     // Catch:{ all -> 0x00a7 }
            java.lang.String r13 = r15.f29735h     // Catch:{ all -> 0x00a7 }
            java.io.File r0 = r8.mo25242C(r9, r10, r11, r13)     // Catch:{ all -> 0x00a7 }
            boolean r6 = r0.exists()     // Catch:{ all -> 0x00a7 }
            if (r6 != 0) goto L_0x004d
            r0.mkdirs()     // Catch:{ all -> 0x00a7 }
        L_0x004d:
            com.google.android.play.core.assetpacks.h3 r13 = new com.google.android.play.core.assetpacks.h3     // Catch:{ all -> 0x00a7 }
            com.google.android.play.core.assetpacks.g0 r7 = r14.f29372a     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = r15.f29410b     // Catch:{ all -> 0x00a7 }
            int r9 = r15.f29732e     // Catch:{ all -> 0x00a7 }
            long r10 = r15.f29733f     // Catch:{ all -> 0x00a7 }
            java.lang.String r12 = r15.f29735h     // Catch:{ all -> 0x00a7 }
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x00a7 }
            com.google.android.play.core.assetpacks.k1 r6 = new com.google.android.play.core.assetpacks.k1     // Catch:{ all -> 0x00a7 }
            r6.<init>(r0, r13)     // Catch:{ all -> 0x00a7 }
            long r7 = r15.f29736i     // Catch:{ all -> 0x00a7 }
            p159f.p243f.p245b.p318c.p319a.p320a.C7617v.m42421a(r5, r4, r6, r7)     // Catch:{ all -> 0x00a7 }
            r13.mo25282i(r3)     // Catch:{ all -> 0x00a7 }
            r4.close()     // Catch:{ IOException -> 0x00ac }
            f.f.b.c.a.a.a r0 = f29371c
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f29735h
            r4[r3] = r5
            java.lang.String r5 = r15.f29410b
            r4[r2] = r5
            java.lang.String r5 = "Patching and extraction finished for slice %s of pack %s."
            r0.mo28577d(r5, r4)
            f.f.b.c.a.a.y<com.google.android.play.core.assetpacks.e4> r0 = r14.f29373b
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.e4 r0 = (com.google.android.play.core.assetpacks.C6347e4) r0
            int r4 = r15.f29409a
            java.lang.String r5 = r15.f29410b
            java.lang.String r6 = r15.f29735h
            r0.mo25231d(r4, r5, r6, r3)
            java.io.InputStream r0 = r15.f29737j     // Catch:{ IOException -> 0x0095 }
            r0.close()     // Catch:{ IOException -> 0x0095 }
            return
        L_0x0095:
            f.f.b.c.a.a.a r0 = f29371c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r15.f29735h
            r1[r3] = r4
            java.lang.String r15 = r15.f29410b
            r1[r2] = r15
            java.lang.String r15 = "Could not close file for slice %s of pack %s."
            r0.mo28578e(r15, r1)
            return
        L_0x00a7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            throw r0     // Catch:{ IOException -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            f.f.b.c.a.a.a r4 = f29371c
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r0.getMessage()
            r5[r3] = r6
            java.lang.String r6 = "IOException during patching %s."
            r4.mo28575b(r6, r5)
            com.google.android.play.core.assetpacks.h1 r4 = new com.google.android.play.core.assetpacks.h1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f29735h
            r1[r3] = r5
            java.lang.String r3 = r15.f29410b
            r1[r2] = r3
            java.lang.String r2 = "Error patching slice %s of pack %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r15 = r15.f29409a
            r4.<init>(r1, r0, r15)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6321a3.mo25213a(com.google.android.play.core.assetpacks.z2):void");
    }
}
