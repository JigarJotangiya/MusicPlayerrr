package com.google.android.play.core.assetpacks;

import java.io.File;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;

/* renamed from: com.google.android.play.core.assetpacks.c1 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6331c1 {

    /* renamed from: g */
    private static final C7577a f29402g = new C7577a("ExtractChunkTaskHandler");

    /* renamed from: a */
    private final byte[] f29403a = new byte[8192];

    /* renamed from: b */
    private final C6355g0 f29404b;

    /* renamed from: c */
    private final C7620y<C6347e4> f29405c;

    /* renamed from: d */
    private final C7620y<C6318a0> f29406d;

    /* renamed from: e */
    private final C6381l1 f29407e;

    /* renamed from: f */
    private final C6432v2 f29408f;

    C6331c1(C6355g0 g0Var, C7620y<C6347e4> yVar, C7620y<C6318a0> yVar2, C6381l1 l1Var, C6432v2 v2Var) {
        this.f29404b = g0Var;
        this.f29405c = yVar;
        this.f29406d = yVar2;
        this.f29407e = l1Var;
        this.f29408f = v2Var;
    }

    /* renamed from: b */
    private final File m37588b(C6325b1 b1Var) {
        File C = this.f29404b.mo25242C(b1Var.f29410b, b1Var.f29384c, b1Var.f29385d, b1Var.f29387f);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:93|113|114|115|116) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0349 */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0186 A[Catch:{ all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ab A[Catch:{ all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01df A[Catch:{ all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x029e A[SYNTHETIC, Splitter:B:98:0x029e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:94:0x0295=Splitter:B:94:0x0295, B:115:0x0349=Splitter:B:115:0x0349} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25222a(com.google.android.play.core.assetpacks.C6325b1 r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.android.play.core.assetpacks.h3 r0 = new com.google.android.play.core.assetpacks.h3
            com.google.android.play.core.assetpacks.g0 r10 = r1.f29404b
            java.lang.String r11 = r2.f29410b
            int r12 = r2.f29384c
            long r13 = r2.f29385d
            java.lang.String r15 = r2.f29387f
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r15
            java.io.File r3 = r3.mo25241B(r4, r5, r6, r8)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            java.io.InputStream r3 = r2.f29393l     // Catch:{ IOException -> 0x034a }
            int r4 = r2.f29388g     // Catch:{ IOException -> 0x034a }
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r4 == r13) goto L_0x0039
            r9 = r3
            goto L_0x003f
        L_0x0039:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x034a }
            r4.<init>(r3, r15)     // Catch:{ IOException -> 0x034a }
            r9 = r4
        L_0x003f:
            int r3 = r2.f29389h     // Catch:{ all -> 0x0344 }
            r16 = 0
            if (r3 <= 0) goto L_0x0182
            com.google.android.play.core.assetpacks.g3 r3 = r0.mo25275b()     // Catch:{ all -> 0x0344 }
            int r4 = r3.mo25269b()     // Catch:{ all -> 0x0344 }
            int r5 = r2.f29389h     // Catch:{ all -> 0x0344 }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x0161
            int r4 = r3.mo25268a()     // Catch:{ all -> 0x0344 }
            if (r4 == r13) goto L_0x00db
            if (r4 == r12) goto L_0x009c
            if (r4 != r11) goto L_0x0082
            f.f.b.c.a.a.a r4 = f29402g     // Catch:{ all -> 0x0344 }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x0344 }
            r4.mo28574a(r5, r6)     // Catch:{ all -> 0x0344 }
            long r3 = r3.mo25270c()     // Catch:{ all -> 0x0344 }
            r0.mo25277d(r9, r3)     // Catch:{ all -> 0x0344 }
            boolean r3 = r23.mo25218a()     // Catch:{ all -> 0x0344 }
            if (r3 == 0) goto L_0x0078
            r10 = r9
        L_0x0074:
            r9 = r16
            goto L_0x0184
        L_0x0078:
            com.google.android.play.core.assetpacks.h1 r0 = new com.google.android.play.core.assetpacks.h1     // Catch:{ all -> 0x0344 }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f29409a     // Catch:{ all -> 0x0344 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0344 }
            throw r0     // Catch:{ all -> 0x0344 }
        L_0x0082:
            com.google.android.play.core.assetpacks.h1 r0 = new com.google.android.play.core.assetpacks.h1     // Catch:{ all -> 0x0344 }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x0344 }
            int r3 = r3.mo25268a()     // Catch:{ all -> 0x0344 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0344 }
            r4[r14] = r3     // Catch:{ all -> 0x0344 }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0344 }
            int r4 = r2.f29409a     // Catch:{ all -> 0x0344 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0344 }
            throw r0     // Catch:{ all -> 0x0344 }
        L_0x009c:
            f.f.b.c.a.a.a r3 = f29402g     // Catch:{ all -> 0x0344 }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x0344 }
            r3.mo28574a(r4, r5)     // Catch:{ all -> 0x0344 }
            com.google.android.play.core.assetpacks.g0 r3 = r1.f29404b     // Catch:{ all -> 0x0344 }
            java.lang.String r4 = r2.f29410b     // Catch:{ all -> 0x0344 }
            int r5 = r2.f29384c     // Catch:{ all -> 0x0344 }
            long r6 = r2.f29385d     // Catch:{ all -> 0x0344 }
            java.lang.String r8 = r2.f29387f     // Catch:{ all -> 0x0344 }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.mo25266z(r17, r18, r19, r21)     // Catch:{ all -> 0x0344 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0344 }
            if (r4 == 0) goto L_0x00d1
            java.io.SequenceInputStream r4 = new java.io.SequenceInputStream     // Catch:{ all -> 0x0344 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0344 }
            r5.<init>(r3)     // Catch:{ all -> 0x0344 }
            r4.<init>(r5, r9)     // Catch:{ all -> 0x0344 }
            r10 = r9
            r9 = r4
            goto L_0x0184
        L_0x00d1:
            com.google.android.play.core.assetpacks.h1 r0 = new com.google.android.play.core.assetpacks.h1     // Catch:{ all -> 0x0344 }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f29409a     // Catch:{ all -> 0x0344 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0344 }
            throw r0     // Catch:{ all -> 0x0344 }
        L_0x00db:
            f.f.b.c.a.a.a r4 = f29402g     // Catch:{ all -> 0x0344 }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0344 }
            java.lang.String r6 = r3.mo25272e()     // Catch:{ all -> 0x0344 }
            r5[r14] = r6     // Catch:{ all -> 0x0344 }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.mo28574a(r6, r5)     // Catch:{ all -> 0x0344 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0344 }
            java.lang.String r5 = r3.mo25272e()     // Catch:{ all -> 0x0344 }
            r4.<init>(r5)     // Catch:{ all -> 0x0344 }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x0344 }
            if (r5 == 0) goto L_0x0156
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0344 }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x0344 }
            long r6 = r3.mo25270c()     // Catch:{ all -> 0x0344 }
            r5.seek(r6)     // Catch:{ all -> 0x0344 }
            long r6 = r3.mo25271d()     // Catch:{ all -> 0x0344 }
        L_0x010b:
            r10 = 8192(0x2000, double:4.0474E-320)
            long r10 = java.lang.Math.min(r6, r10)     // Catch:{ all -> 0x0344 }
            int r3 = (int) r10     // Catch:{ all -> 0x0344 }
            byte[] r8 = r1.f29403a     // Catch:{ all -> 0x0344 }
            int r8 = r9.read(r8, r14, r3)     // Catch:{ all -> 0x0344 }
            int r8 = java.lang.Math.max(r8, r14)     // Catch:{ all -> 0x0344 }
            if (r8 <= 0) goto L_0x0123
            byte[] r10 = r1.f29403a     // Catch:{ all -> 0x0344 }
            r5.write(r10, r14, r8)     // Catch:{ all -> 0x0344 }
        L_0x0123:
            long r10 = (long) r8     // Catch:{ all -> 0x0344 }
            long r10 = r6 - r10
            r6 = 0
            int r19 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r19 <= 0) goto L_0x0131
            if (r8 > 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r6 = r10
            goto L_0x010b
        L_0x0131:
            long r6 = r5.length()     // Catch:{ all -> 0x0344 }
            r5.close()     // Catch:{ all -> 0x0344 }
            if (r8 == r3) goto L_0x0182
            f.f.b.c.a.a.a r3 = f29402g     // Catch:{ all -> 0x0344 }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x0344 }
            r3.mo28574a(r5, r8)     // Catch:{ all -> 0x0344 }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x0344 }
            int r8 = r2.f29389h     // Catch:{ all -> 0x0344 }
            r3 = r0
            r5 = r6
            r19 = r8
            r7 = r10
            r10 = r9
            r9 = r19
            r3.mo25280g(r4, r5, r7, r9)     // Catch:{ all -> 0x0292 }
            goto L_0x0074
        L_0x0156:
            r10 = r9
            com.google.android.play.core.assetpacks.h1 r0 = new com.google.android.play.core.assetpacks.h1     // Catch:{ all -> 0x0292 }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f29409a     // Catch:{ all -> 0x0292 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0292 }
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x0161:
            r10 = r9
            com.google.android.play.core.assetpacks.h1 r0 = new com.google.android.play.core.assetpacks.h1     // Catch:{ all -> 0x0292 }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x0292 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0292 }
            r6[r14] = r5     // Catch:{ all -> 0x0292 }
            int r3 = r3.mo25269b()     // Catch:{ all -> 0x0292 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0292 }
            r6[r13] = r3     // Catch:{ all -> 0x0292 }
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x0292 }
            int r4 = r2.f29409a     // Catch:{ all -> 0x0292 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0292 }
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x0182:
            r10 = r9
            r9 = r10
        L_0x0184:
            if (r9 == 0) goto L_0x0295
            com.google.android.play.core.assetpacks.s0 r3 = new com.google.android.play.core.assetpacks.s0     // Catch:{ all -> 0x0292 }
            r3.<init>(r9)     // Catch:{ all -> 0x0292 }
            java.io.File r4 = r22.m37588b(r23)     // Catch:{ all -> 0x0292 }
        L_0x018f:
            com.google.android.play.core.assetpacks.n3 r5 = r3.mo25358d()     // Catch:{ all -> 0x0292 }
            boolean r6 = r5.mo25341e()     // Catch:{ all -> 0x0292 }
            if (r6 != 0) goto L_0x01e6
            boolean r6 = r3.mo25359p()     // Catch:{ all -> 0x0292 }
            if (r6 != 0) goto L_0x01e6
            boolean r6 = r5.mo25344h()     // Catch:{ all -> 0x0292 }
            if (r6 == 0) goto L_0x01df
            boolean r6 = r5.mo25343g()     // Catch:{ all -> 0x0292 }
            if (r6 != 0) goto L_0x01df
            byte[] r6 = r5.mo25342f()     // Catch:{ all -> 0x0292 }
            r0.mo25283j(r6)     // Catch:{ all -> 0x0292 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0292 }
            java.lang.String r7 = r5.mo25339c()     // Catch:{ all -> 0x0292 }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x0292 }
            java.io.File r7 = r6.getParentFile()     // Catch:{ all -> 0x0292 }
            r7.mkdirs()     // Catch:{ all -> 0x0292 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0292 }
            r7.<init>(r6)     // Catch:{ all -> 0x0292 }
            byte[] r6 = r1.f29403a     // Catch:{ all -> 0x0292 }
            int r6 = r3.read(r6, r14, r15)     // Catch:{ all -> 0x0292 }
        L_0x01cd:
            if (r6 <= 0) goto L_0x01db
            byte[] r8 = r1.f29403a     // Catch:{ all -> 0x0292 }
            r7.write(r8, r14, r6)     // Catch:{ all -> 0x0292 }
            byte[] r6 = r1.f29403a     // Catch:{ all -> 0x0292 }
            int r6 = r3.read(r6, r14, r15)     // Catch:{ all -> 0x0292 }
            goto L_0x01cd
        L_0x01db:
            r7.close()     // Catch:{ all -> 0x0292 }
            goto L_0x01e6
        L_0x01df:
            byte[] r6 = r5.mo25342f()     // Catch:{ all -> 0x0292 }
            r0.mo25284k(r6, r3)     // Catch:{ all -> 0x0292 }
        L_0x01e6:
            boolean r6 = r3.mo25362x()     // Catch:{ all -> 0x0292 }
            if (r6 != 0) goto L_0x01f2
            boolean r6 = r3.mo25359p()     // Catch:{ all -> 0x0292 }
            if (r6 == 0) goto L_0x018f
        L_0x01f2:
            boolean r4 = r3.mo25359p()     // Catch:{ all -> 0x0292 }
            if (r4 == 0) goto L_0x0208
            f.f.b.c.a.a.a r4 = f29402g     // Catch:{ all -> 0x0292 }
            java.lang.String r6 = "Writing central directory metadata."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x0292 }
            r4.mo28574a(r6, r7)     // Catch:{ all -> 0x0292 }
            byte[] r4 = r5.mo25342f()     // Catch:{ all -> 0x0292 }
            r0.mo25284k(r4, r9)     // Catch:{ all -> 0x0292 }
        L_0x0208:
            boolean r4 = r23.mo25218a()     // Catch:{ all -> 0x0292 }
            if (r4 != 0) goto L_0x0295
            boolean r4 = r5.mo25341e()     // Catch:{ all -> 0x0292 }
            if (r4 == 0) goto L_0x0227
            f.f.b.c.a.a.a r3 = f29402g     // Catch:{ all -> 0x0292 }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x0292 }
            r3.mo28574a(r4, r6)     // Catch:{ all -> 0x0292 }
            byte[] r3 = r5.mo25342f()     // Catch:{ all -> 0x0292 }
            int r4 = r2.f29389h     // Catch:{ all -> 0x0292 }
            r0.mo25281h(r3, r4)     // Catch:{ all -> 0x0292 }
            goto L_0x0295
        L_0x0227:
            boolean r4 = r3.mo25359p()     // Catch:{ all -> 0x0292 }
            if (r4 == 0) goto L_0x023c
            f.f.b.c.a.a.a r3 = f29402g     // Catch:{ all -> 0x0292 }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x0292 }
            r3.mo28574a(r4, r5)     // Catch:{ all -> 0x0292 }
            int r3 = r2.f29389h     // Catch:{ all -> 0x0292 }
            r0.mo25279f(r3)     // Catch:{ all -> 0x0292 }
            goto L_0x0295
        L_0x023c:
            int r4 = r5.mo25337a()     // Catch:{ all -> 0x0292 }
            if (r4 != 0) goto L_0x0272
            f.f.b.c.a.a.a r4 = f29402g     // Catch:{ all -> 0x0292 }
            java.lang.String r6 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x0292 }
            r4.mo28574a(r6, r7)     // Catch:{ all -> 0x0292 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0292 }
            java.io.File r6 = r22.m37588b(r23)     // Catch:{ all -> 0x0292 }
            java.lang.String r7 = r5.mo25339c()     // Catch:{ all -> 0x0292 }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x0292 }
            long r5 = r5.mo25338b()     // Catch:{ all -> 0x0292 }
            long r7 = r3.mo25357c()     // Catch:{ all -> 0x0292 }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x0292 }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x026a
            goto L_0x0283
        L_0x026a:
            com.google.android.play.core.assetpacks.h1 r0 = new com.google.android.play.core.assetpacks.h1     // Catch:{ all -> 0x0292 }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x0292 }
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x0272:
            f.f.b.c.a.a.a r4 = f29402g     // Catch:{ all -> 0x0292 }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x0292 }
            r4.mo28574a(r5, r6)     // Catch:{ all -> 0x0292 }
            java.io.File r4 = r0.mo25276c()     // Catch:{ all -> 0x0292 }
            long r5 = r4.length()     // Catch:{ all -> 0x0292 }
        L_0x0283:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x0292 }
            long r7 = r3.mo25357c()     // Catch:{ all -> 0x0292 }
            int r9 = r2.f29389h     // Catch:{ all -> 0x0292 }
            r3 = r0
            r3.mo25280g(r4, r5, r7, r9)     // Catch:{ all -> 0x0292 }
            goto L_0x0295
        L_0x0292:
            r0 = move-exception
            goto L_0x0346
        L_0x0295:
            r10.close()     // Catch:{ IOException -> 0x034a }
            boolean r3 = r23.mo25218a()
            if (r3 == 0) goto L_0x02be
            int r3 = r2.f29389h     // Catch:{ IOException -> 0x02a4 }
            r0.mo25282i(r3)     // Catch:{ IOException -> 0x02a4 }
            goto L_0x02be
        L_0x02a4:
            r0 = move-exception
            f.f.b.c.a.a.a r3 = f29402g
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.mo28575b(r5, r4)
            com.google.android.play.core.assetpacks.h1 r3 = new com.google.android.play.core.assetpacks.h1
            int r2 = r2.f29409a
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02be:
            f.f.b.c.a.a.a r0 = f29402g
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f29389h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.f29387f
            r3[r13] = r4
            java.lang.String r4 = r2.f29410b
            r3[r12] = r4
            int r4 = r2.f29409a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.mo28577d(r4, r3)
            f.f.b.c.a.a.y<com.google.android.play.core.assetpacks.e4> r0 = r1.f29405c
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.e4 r0 = (com.google.android.play.core.assetpacks.C6347e4) r0
            int r3 = r2.f29409a
            java.lang.String r4 = r2.f29410b
            java.lang.String r5 = r2.f29387f
            int r6 = r2.f29389h
            r0.mo25231d(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f29393l     // Catch:{ IOException -> 0x02fa }
            r0.close()     // Catch:{ IOException -> 0x02fa }
            goto L_0x0314
        L_0x02fa:
            f.f.b.c.a.a.a r0 = f29402g
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f29389h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.f29387f
            r4[r13] = r3
            java.lang.String r3 = r2.f29410b
            r4[r12] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.mo28578e(r3, r4)
        L_0x0314:
            int r0 = r2.f29392k
            r3 = 3
            if (r0 != r3) goto L_0x0343
            f.f.b.c.a.a.y<com.google.android.play.core.assetpacks.a0> r0 = r1.f29406d
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.a0 r0 = (com.google.android.play.core.assetpacks.C6318a0) r0
            java.lang.String r3 = r2.f29410b
            long r7 = r2.f29391j
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.l1 r6 = r1.f29407e
            double r9 = r6.mo25307b(r3, r2)
            r11 = 1
            java.lang.String r12 = r2.f29386e
            com.google.android.play.core.assetpacks.v2 r6 = r1.f29408f
            java.lang.String r2 = r2.f29410b
            java.lang.String r13 = r6.mo25369a(r2)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.m37540h(r2, r3, r4, r5, r7, r9, r11, r12, r13)
            r0.mo25197j(r2)
        L_0x0343:
            return
        L_0x0344:
            r0 = move-exception
            r10 = r9
        L_0x0346:
            r10.close()     // Catch:{ all -> 0x0349 }
        L_0x0349:
            throw r0     // Catch:{ IOException -> 0x034a }
        L_0x034a:
            r0 = move-exception
            f.f.b.c.a.a.a r3 = f29402g
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.mo28575b(r5, r4)
            com.google.android.play.core.assetpacks.h1 r3 = new com.google.android.play.core.assetpacks.h1
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f29389h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r14] = r5
            java.lang.String r5 = r2.f29387f
            r4[r13] = r5
            java.lang.String r5 = r2.f29410b
            r4[r12] = r5
            int r5 = r2.f29409a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f29409a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6331c1.mo25222a(com.google.android.play.core.assetpacks.b1):void");
    }
}
