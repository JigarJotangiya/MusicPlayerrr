package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C6457d;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;

/* renamed from: com.google.android.play.core.assetpacks.d2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6339d2 {

    /* renamed from: e */
    private static final C7577a f29422e = new C7577a("ExtractorTaskFinder");

    /* renamed from: a */
    private final C6320a2 f29423a;

    /* renamed from: b */
    private final C6355g0 f29424b;

    /* renamed from: c */
    private final C6405q0 f29425c;

    /* renamed from: d */
    private final C6457d f29426d;

    C6339d2(C6320a2 a2Var, C6355g0 g0Var, C6405q0 q0Var, C6457d dVar) {
        this.f29423a = a2Var;
        this.f29424b = g0Var;
        this.f29425c = q0Var;
        this.f29426d = dVar;
    }

    /* renamed from: b */
    private final boolean m37595b(C6441x1 x1Var, C6446y1 y1Var) {
        C6355g0 g0Var = this.f29424b;
        C6436w1 w1Var = x1Var.f29708c;
        return new C6363h3(g0Var, w1Var.f29693a, x1Var.f29707b, w1Var.f29694b, y1Var.f29719a).mo25286m();
    }

    /* renamed from: c */
    private static boolean m37596c(C6446y1 y1Var) {
        int i = y1Var.f29724f;
        return i == 1 || i == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.play.core.assetpacks.q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.play.core.assetpacks.q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.play.core.assetpacks.n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.play.core.assetpacks.k3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.k3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: com.google.android.play.core.assetpacks.c3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: com.google.android.play.core.assetpacks.c3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: com.google.android.play.core.assetpacks.k3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: com.google.android.play.core.assetpacks.n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: com.google.android.play.core.assetpacks.q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: com.google.android.play.core.assetpacks.c3} */
    /* JADX WARNING: type inference failed for: r0v50 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        if (r0 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        f29422e.mo28574a("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r7.f29706a), r7.f29708c.f29693a);
        r11 = r7.f29706a;
        r8 = r7.f29708c;
        r10 = new com.google.android.play.core.assetpacks.C6407q2(r11, r8.f29693a, r7.f29707b, r8.f29694b, r8.f29695c);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C6332c2 mo25223a() {
        /*
            r33 = this;
            r1 = r33
            com.google.android.play.core.assetpacks.a2 r0 = r1.f29423a     // Catch:{ all -> 0x03ff }
            r0.mo25206h()     // Catch:{ all -> 0x03ff }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x03ff }
            r2.<init>()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.a2 r0 = r1.f29423a     // Catch:{ all -> 0x03ff }
            java.util.Map r0 = r0.mo25204f()     // Catch:{ all -> 0x03ff }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x03ff }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x03ff }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x03ff }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.x1 r3 = (com.google.android.play.core.assetpacks.C6441x1) r3     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r4 = r3.f29708c     // Catch:{ all -> 0x03ff }
            int r4 = r4.f29696d     // Catch:{ all -> 0x03ff }
            boolean r4 = com.google.android.play.core.assetpacks.C6349f0.m37611b(r4)     // Catch:{ all -> 0x03ff }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x03ff }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x03ff }
            r3 = 0
            if (r0 == 0) goto L_0x0041
            com.google.android.play.core.assetpacks.a2 r0 = r1.f29423a
        L_0x003d:
            r0.mo25208j()
            return r3
        L_0x0041:
            com.google.android.play.core.common.d r0 = r1.f29426d     // Catch:{ all -> 0x03ff }
            java.lang.String r4 = "assetOnlyUpdates"
            boolean r0 = r0.mo25384a(r4)     // Catch:{ all -> 0x03ff }
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x00b7
            com.google.android.play.core.assetpacks.g0 r0 = r1.f29424b     // Catch:{ all -> 0x03ff }
            java.util.Map r0 = r0.mo25245F()     // Catch:{ all -> 0x03ff }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x03ff }
        L_0x0058:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x03ff }
            if (r8 == 0) goto L_0x00ad
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.x1 r8 = (com.google.android.play.core.assetpacks.C6441x1) r8     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r8.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r9.f29693a     // Catch:{ all -> 0x03ff }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x03ff }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x03ff }
            if (r9 == 0) goto L_0x0058
            com.google.android.play.core.assetpacks.w1 r10 = r8.f29708c     // Catch:{ all -> 0x03ff }
            long r10 = r10.f29694b     // Catch:{ all -> 0x03ff }
            long r12 = r9.longValue()     // Catch:{ all -> 0x03ff }
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0058
            f.f.b.c.a.a.a r0 = f29422e     // Catch:{ all -> 0x03ff }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x03ff }
            int r9 = r8.f29706a     // Catch:{ all -> 0x03ff }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03ff }
            r7[r6] = r9     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r8.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r9.f29693a     // Catch:{ all -> 0x03ff }
            r7[r5] = r9     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = "Found promote pack task for session %s with pack %s."
            r0.mo28574a(r9, r7)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.c3 r0 = new com.google.android.play.core.assetpacks.c3     // Catch:{ all -> 0x03ff }
            int r11 = r8.f29706a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r7 = r8.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r12 = r7.f29693a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.g0 r7 = r1.f29424b     // Catch:{ all -> 0x03ff }
            int r13 = r7.mo25256p(r12)     // Catch:{ all -> 0x03ff }
            int r14 = r8.f29707b     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r7 = r8.f29708c     // Catch:{ all -> 0x03ff }
            long r7 = r7.f29694b     // Catch:{ all -> 0x03ff }
            r10 = r0
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03ff }
            goto L_0x00ae
        L_0x00ad:
            r0 = r3
        L_0x00ae:
            if (r0 != 0) goto L_0x00b1
            goto L_0x00b7
        L_0x00b1:
            com.google.android.play.core.assetpacks.a2 r2 = r1.f29423a
        L_0x00b3:
            r2.mo25208j()
            return r0
        L_0x00b7:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03ff }
        L_0x00bb:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x03ff }
            if (r7 == 0) goto L_0x012a
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.x1 r7 = (com.google.android.play.core.assetpacks.C6441x1) r7     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.g0 r8 = r1.f29424b     // Catch:{ IOException -> 0x010b }
            com.google.android.play.core.assetpacks.w1 r9 = r7.f29708c     // Catch:{ IOException -> 0x010b }
            java.lang.String r10 = r9.f29693a     // Catch:{ IOException -> 0x010b }
            int r11 = r7.f29707b     // Catch:{ IOException -> 0x010b }
            long r12 = r9.f29694b     // Catch:{ IOException -> 0x010b }
            int r8 = r8.mo25257q(r10, r11, r12)     // Catch:{ IOException -> 0x010b }
            com.google.android.play.core.assetpacks.w1 r9 = r7.f29708c     // Catch:{ IOException -> 0x010b }
            java.util.List<com.google.android.play.core.assetpacks.y1> r9 = r9.f29698f     // Catch:{ IOException -> 0x010b }
            int r9 = r9.size()     // Catch:{ IOException -> 0x010b }
            if (r8 != r9) goto L_0x00bb
            f.f.b.c.a.a.a r0 = f29422e     // Catch:{ all -> 0x03ff }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x03ff }
            int r9 = r7.f29706a     // Catch:{ all -> 0x03ff }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03ff }
            r8[r6] = r9     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r9.f29693a     // Catch:{ all -> 0x03ff }
            r8[r5] = r9     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.mo28574a(r9, r8)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.q2 r0 = new com.google.android.play.core.assetpacks.q2     // Catch:{ all -> 0x03ff }
            int r11 = r7.f29706a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r8 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r12 = r8.f29693a     // Catch:{ all -> 0x03ff }
            int r13 = r7.f29707b     // Catch:{ all -> 0x03ff }
            long r14 = r8.f29694b     // Catch:{ all -> 0x03ff }
            java.lang.String r7 = r8.f29695c     // Catch:{ all -> 0x03ff }
            r10 = r0
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r16)     // Catch:{ all -> 0x03ff }
            goto L_0x012b
        L_0x010b:
            r0 = move-exception
            com.google.android.play.core.assetpacks.h1 r2 = new com.google.android.play.core.assetpacks.h1     // Catch:{ all -> 0x03ff }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x03ff }
            int r4 = r7.f29706a     // Catch:{ all -> 0x03ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03ff }
            r3[r6] = r4     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r4 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r4 = r4.f29693a     // Catch:{ all -> 0x03ff }
            r3[r5] = r4     // Catch:{ all -> 0x03ff }
            java.lang.String r4 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x03ff }
            int r4 = r7.f29706a     // Catch:{ all -> 0x03ff }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x03ff }
            throw r2     // Catch:{ all -> 0x03ff }
        L_0x012a:
            r0 = r3
        L_0x012b:
            if (r0 != 0) goto L_0x00b1
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03ff }
        L_0x0131:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x03ff }
            r8 = 3
            if (r7 == 0) goto L_0x01b4
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.x1 r7 = (com.google.android.play.core.assetpacks.C6441x1) r7     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r7.f29708c     // Catch:{ all -> 0x03ff }
            int r9 = r9.f29696d     // Catch:{ all -> 0x03ff }
            boolean r9 = com.google.android.play.core.assetpacks.C6349f0.m37611b(r9)     // Catch:{ all -> 0x03ff }
            if (r9 == 0) goto L_0x0131
            com.google.android.play.core.assetpacks.w1 r9 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.util.List<com.google.android.play.core.assetpacks.y1> r9 = r9.f29698f     // Catch:{ all -> 0x03ff }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x03ff }
        L_0x0150:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x03ff }
            if (r10 == 0) goto L_0x0131
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.y1 r10 = (com.google.android.play.core.assetpacks.C6446y1) r10     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.g0 r11 = r1.f29424b     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r12 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r13 = r12.f29693a     // Catch:{ all -> 0x03ff }
            int r14 = r7.f29707b     // Catch:{ all -> 0x03ff }
            long r3 = r12.f29694b     // Catch:{ all -> 0x03ff }
            java.lang.String r15 = r10.f29719a     // Catch:{ all -> 0x03ff }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r3
            java.io.File r3 = r11.mo25243D(r12, r13, r14, r16)     // Catch:{ all -> 0x03ff }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x03ff }
            if (r3 == 0) goto L_0x01b1
            f.f.b.c.a.a.a r0 = f29422e     // Catch:{ all -> 0x03ff }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x03ff }
            int r4 = r7.f29706a     // Catch:{ all -> 0x03ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03ff }
            r3[r6] = r4     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r4 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r4 = r4.f29693a     // Catch:{ all -> 0x03ff }
            r3[r5] = r4     // Catch:{ all -> 0x03ff }
            java.lang.String r4 = r10.f29719a     // Catch:{ all -> 0x03ff }
            r9 = 2
            r3[r9] = r4     // Catch:{ all -> 0x03ff }
            java.lang.String r4 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo28574a(r4, r3)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.n2 r0 = new com.google.android.play.core.assetpacks.n2     // Catch:{ all -> 0x03ff }
            int r3 = r7.f29706a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r4 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r4.f29693a     // Catch:{ all -> 0x03ff }
            int r7 = r7.f29707b     // Catch:{ all -> 0x03ff }
            long r11 = r4.f29694b     // Catch:{ all -> 0x03ff }
            java.lang.String r4 = r10.f29719a     // Catch:{ all -> 0x03ff }
            r18 = r0
            r19 = r3
            r20 = r9
            r21 = r7
            r22 = r11
            r24 = r4
            r18.<init>(r19, r20, r21, r22, r24)     // Catch:{ all -> 0x03ff }
            goto L_0x01b5
        L_0x01b1:
            r3 = 0
            r4 = 2
            goto L_0x0150
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            if (r0 != 0) goto L_0x00b1
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03ff }
        L_0x01bb:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x03ff }
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.x1 r3 = (com.google.android.play.core.assetpacks.C6441x1) r3     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r4 = r3.f29708c     // Catch:{ all -> 0x03ff }
            int r4 = r4.f29696d     // Catch:{ all -> 0x03ff }
            boolean r4 = com.google.android.play.core.assetpacks.C6349f0.m37611b(r4)     // Catch:{ all -> 0x03ff }
            if (r4 == 0) goto L_0x01bb
            com.google.android.play.core.assetpacks.w1 r4 = r3.f29708c     // Catch:{ all -> 0x03ff }
            java.util.List<com.google.android.play.core.assetpacks.y1> r4 = r4.f29698f     // Catch:{ all -> 0x03ff }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x03ff }
        L_0x01d9:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x03ff }
            if (r7 == 0) goto L_0x01bb
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.y1 r7 = (com.google.android.play.core.assetpacks.C6446y1) r7     // Catch:{ all -> 0x03ff }
            boolean r9 = r1.m37595b(r3, r7)     // Catch:{ all -> 0x03ff }
            if (r9 == 0) goto L_0x01d9
            com.google.android.play.core.assetpacks.g0 r10 = r1.f29424b     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r3.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r11 = r9.f29693a     // Catch:{ all -> 0x03ff }
            int r12 = r3.f29707b     // Catch:{ all -> 0x03ff }
            long r13 = r9.f29694b     // Catch:{ all -> 0x03ff }
            java.lang.String r15 = r7.f29719a     // Catch:{ all -> 0x03ff }
            java.io.File r9 = r10.mo25242C(r11, r12, r13, r15)     // Catch:{ all -> 0x03ff }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x03ff }
            if (r9 == 0) goto L_0x01d9
            f.f.b.c.a.a.a r0 = f29422e     // Catch:{ all -> 0x03ff }
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x03ff }
            int r9 = r3.f29706a     // Catch:{ all -> 0x03ff }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03ff }
            r4[r6] = r9     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r3.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r9.f29693a     // Catch:{ all -> 0x03ff }
            r4[r5] = r9     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r7.f29719a     // Catch:{ all -> 0x03ff }
            r10 = 2
            r4[r10] = r9     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo28574a(r9, r4)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.k3 r0 = new com.google.android.play.core.assetpacks.k3     // Catch:{ all -> 0x03ff }
            int r4 = r3.f29706a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r3.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r10 = r9.f29693a     // Catch:{ all -> 0x03ff }
            int r3 = r3.f29707b     // Catch:{ all -> 0x03ff }
            long r11 = r9.f29694b     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r7.f29719a     // Catch:{ all -> 0x03ff }
            java.lang.String r13 = r7.f29720b     // Catch:{ all -> 0x03ff }
            long r14 = r7.f29721c     // Catch:{ all -> 0x03ff }
            r18 = r0
            r19 = r4
            r20 = r10
            r21 = r3
            r22 = r11
            r24 = r9
            r25 = r13
            r26 = r14
            r18.<init>(r19, r20, r21, r22, r24, r25, r26)     // Catch:{ all -> 0x03ff }
            goto L_0x0244
        L_0x0243:
            r0 = 0
        L_0x0244:
            if (r0 != 0) goto L_0x00b1
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x03ff }
        L_0x024a:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03ff }
            r4 = 4
            if (r0 == 0) goto L_0x0337
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x03ff }
            r7 = r0
            com.google.android.play.core.assetpacks.x1 r7 = (com.google.android.play.core.assetpacks.C6441x1) r7     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r0 = r7.f29708c     // Catch:{ all -> 0x03ff }
            int r0 = r0.f29696d     // Catch:{ all -> 0x03ff }
            boolean r0 = com.google.android.play.core.assetpacks.C6349f0.m37611b(r0)     // Catch:{ all -> 0x03ff }
            if (r0 == 0) goto L_0x024a
            com.google.android.play.core.assetpacks.w1 r0 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.util.List<com.google.android.play.core.assetpacks.y1> r0 = r0.f29698f     // Catch:{ all -> 0x03ff }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x03ff }
        L_0x026a:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x03ff }
            if (r0 == 0) goto L_0x024a
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x03ff }
            r10 = r0
            com.google.android.play.core.assetpacks.y1 r10 = (com.google.android.play.core.assetpacks.C6446y1) r10     // Catch:{ all -> 0x03ff }
            boolean r0 = m37596c(r10)     // Catch:{ all -> 0x03ff }
            if (r0 != 0) goto L_0x026a
            com.google.android.play.core.assetpacks.h3 r0 = new com.google.android.play.core.assetpacks.h3     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.g0 r11 = r1.f29424b     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r12 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r13 = r12.f29693a     // Catch:{ all -> 0x03ff }
            int r14 = r7.f29707b     // Catch:{ all -> 0x03ff }
            r16 = r9
            long r8 = r12.f29694b     // Catch:{ all -> 0x03ff }
            java.lang.String r12 = r10.f29719a     // Catch:{ all -> 0x03ff }
            r18 = r0
            r19 = r11
            r20 = r13
            r21 = r14
            r22 = r8
            r24 = r12
            r18.<init>(r19, r20, r21, r22, r24)     // Catch:{ all -> 0x03ff }
            int r0 = r0.mo25274a()     // Catch:{ IOException -> 0x02a1 }
            goto L_0x02af
        L_0x02a1:
            r0 = move-exception
            r8 = r0
            f.f.b.c.a.a.a r0 = f29422e     // Catch:{ all -> 0x03ff }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x03ff }
            r9[r6] = r8     // Catch:{ all -> 0x03ff }
            java.lang.String r8 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.mo28575b(r8, r9)     // Catch:{ all -> 0x03ff }
            r0 = 0
        L_0x02af:
            r8 = -1
            if (r0 == r8) goto L_0x0332
            java.util.List<com.google.android.play.core.assetpacks.u1> r8 = r10.f29722d     // Catch:{ all -> 0x03ff }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.u1 r8 = (com.google.android.play.core.assetpacks.C6426u1) r8     // Catch:{ all -> 0x03ff }
            boolean r8 = r8.f29669a     // Catch:{ all -> 0x03ff }
            if (r8 == 0) goto L_0x0332
            f.f.b.c.a.a.a r3 = f29422e     // Catch:{ all -> 0x03ff }
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x03ff }
            int r9 = r10.f29723e     // Catch:{ all -> 0x03ff }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03ff }
            r8[r6] = r9     // Catch:{ all -> 0x03ff }
            int r9 = r7.f29706a     // Catch:{ all -> 0x03ff }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03ff }
            r8[r5] = r9     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r9.f29693a     // Catch:{ all -> 0x03ff }
            r11 = 2
            r8[r11] = r9     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r10.f29719a     // Catch:{ all -> 0x03ff }
            r11 = 3
            r8[r11] = r9     // Catch:{ all -> 0x03ff }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03ff }
            r8[r4] = r9     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.mo28574a(r9, r8)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.q0 r3 = r1.f29425c     // Catch:{ all -> 0x03ff }
            int r8 = r7.f29706a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r9.f29693a     // Catch:{ all -> 0x03ff }
            java.lang.String r11 = r10.f29719a     // Catch:{ all -> 0x03ff }
            java.io.InputStream r32 = r3.mo25352a(r8, r9, r11, r0)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.b1 r3 = new com.google.android.play.core.assetpacks.b1     // Catch:{ all -> 0x03ff }
            int r8 = r7.f29706a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r9 = r7.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r11 = r9.f29693a     // Catch:{ all -> 0x03ff }
            int r12 = r7.f29707b     // Catch:{ all -> 0x03ff }
            long r13 = r9.f29694b     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r9.f29695c     // Catch:{ all -> 0x03ff }
            java.lang.String r15 = r10.f29719a     // Catch:{ all -> 0x03ff }
            int r5 = r10.f29723e     // Catch:{ all -> 0x03ff }
            java.util.List<com.google.android.play.core.assetpacks.u1> r10 = r10.f29722d     // Catch:{ all -> 0x03ff }
            int r28 = r10.size()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r7 = r7.f29708c     // Catch:{ all -> 0x03ff }
            r16 = r5
            long r4 = r7.f29697e     // Catch:{ all -> 0x03ff }
            int r7 = r7.f29696d     // Catch:{ all -> 0x03ff }
            r18 = r3
            r19 = r8
            r20 = r11
            r21 = r12
            r22 = r13
            r24 = r9
            r25 = r15
            r26 = r16
            r27 = r0
            r29 = r4
            r31 = r7
            r18.<init>(r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x03ff }
            goto L_0x0338
        L_0x0332:
            r9 = r16
            r8 = 3
            goto L_0x026a
        L_0x0337:
            r3 = 0
        L_0x0338:
            if (r3 != 0) goto L_0x03fb
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03ff }
        L_0x033e:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x03ff }
            if (r2 == 0) goto L_0x03ed
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.x1 r2 = (com.google.android.play.core.assetpacks.C6441x1) r2     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r3 = r2.f29708c     // Catch:{ all -> 0x03ff }
            int r3 = r3.f29696d     // Catch:{ all -> 0x03ff }
            boolean r3 = com.google.android.play.core.assetpacks.C6349f0.m37611b(r3)     // Catch:{ all -> 0x03ff }
            if (r3 == 0) goto L_0x033e
            com.google.android.play.core.assetpacks.w1 r3 = r2.f29708c     // Catch:{ all -> 0x03ff }
            java.util.List<com.google.android.play.core.assetpacks.y1> r3 = r3.f29698f     // Catch:{ all -> 0x03ff }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x03ff }
        L_0x035c:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x03ff }
            if (r4 == 0) goto L_0x033e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.y1 r4 = (com.google.android.play.core.assetpacks.C6446y1) r4     // Catch:{ all -> 0x03ff }
            boolean r5 = m37596c(r4)     // Catch:{ all -> 0x03ff }
            if (r5 == 0) goto L_0x035c
            java.util.List<com.google.android.play.core.assetpacks.u1> r5 = r4.f29722d     // Catch:{ all -> 0x03ff }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.u1 r5 = (com.google.android.play.core.assetpacks.C6426u1) r5     // Catch:{ all -> 0x03ff }
            boolean r5 = r5.f29669a     // Catch:{ all -> 0x03ff }
            if (r5 == 0) goto L_0x035c
            boolean r5 = r1.m37595b(r2, r4)     // Catch:{ all -> 0x03ff }
            if (r5 != 0) goto L_0x035c
            f.f.b.c.a.a.a r0 = f29422e     // Catch:{ all -> 0x03ff }
            r5 = 4
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x03ff }
            int r5 = r4.f29724f     // Catch:{ all -> 0x03ff }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03ff }
            r3[r6] = r5     // Catch:{ all -> 0x03ff }
            int r5 = r2.f29706a     // Catch:{ all -> 0x03ff }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03ff }
            r7 = 1
            r3[r7] = r5     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r5 = r2.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r5 = r5.f29693a     // Catch:{ all -> 0x03ff }
            r8 = 2
            r3[r8] = r5     // Catch:{ all -> 0x03ff }
            java.lang.String r5 = r4.f29719a     // Catch:{ all -> 0x03ff }
            r9 = 3
            r3[r9] = r5     // Catch:{ all -> 0x03ff }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo28574a(r5, r3)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.q0 r0 = r1.f29425c     // Catch:{ all -> 0x03ff }
            int r3 = r2.f29706a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r5 = r2.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r5 = r5.f29693a     // Catch:{ all -> 0x03ff }
            java.lang.String r7 = r4.f29719a     // Catch:{ all -> 0x03ff }
            java.io.InputStream r30 = r0.mo25352a(r3, r5, r7, r6)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.z2 r0 = new com.google.android.play.core.assetpacks.z2     // Catch:{ all -> 0x03ff }
            int r3 = r2.f29706a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r5 = r2.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r5 = r5.f29693a     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.g0 r6 = r1.f29424b     // Catch:{ all -> 0x03ff }
            int r20 = r6.mo25256p(r5)     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.g0 r6 = r1.f29424b     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r7 = r2.f29708c     // Catch:{ all -> 0x03ff }
            java.lang.String r7 = r7.f29693a     // Catch:{ all -> 0x03ff }
            long r21 = r6.mo25258r(r7)     // Catch:{ all -> 0x03ff }
            int r6 = r2.f29707b     // Catch:{ all -> 0x03ff }
            com.google.android.play.core.assetpacks.w1 r2 = r2.f29708c     // Catch:{ all -> 0x03ff }
            long r7 = r2.f29694b     // Catch:{ all -> 0x03ff }
            int r2 = r4.f29724f     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = r4.f29719a     // Catch:{ all -> 0x03ff }
            long r10 = r4.f29721c     // Catch:{ all -> 0x03ff }
            r17 = r0
            r18 = r3
            r19 = r5
            r23 = r6
            r24 = r7
            r26 = r2
            r27 = r9
            r28 = r10
            r17.<init>(r18, r19, r20, r21, r23, r24, r26, r27, r28, r30)     // Catch:{ all -> 0x03ff }
            goto L_0x03ee
        L_0x03ed:
            r0 = 0
        L_0x03ee:
            if (r0 == 0) goto L_0x03f4
            com.google.android.play.core.assetpacks.a2 r2 = r1.f29423a
            goto L_0x00b3
        L_0x03f4:
            com.google.android.play.core.assetpacks.a2 r0 = r1.f29423a
            r0.mo25208j()
            r2 = 0
            return r2
        L_0x03fb:
            com.google.android.play.core.assetpacks.a2 r0 = r1.f29423a
            goto L_0x003d
        L_0x03ff:
            r0 = move-exception
            com.google.android.play.core.assetpacks.a2 r2 = r1.f29423a
            r2.mo25208j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6339d2.mo25223a():com.google.android.play.core.assetpacks.c2");
    }
}
