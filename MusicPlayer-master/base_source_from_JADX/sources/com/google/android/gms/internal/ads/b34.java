package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b34 implements g64, v14 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f14297a = x14.m33513a();

    /* renamed from: b */
    private final Uri f14298b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final t64 f14299c;

    /* renamed from: d */
    private final x24 f14300d;

    /* renamed from: e */
    private final b94 f14301e;

    /* renamed from: f */
    private final kv1 f14302f;

    /* renamed from: g */
    private final w94 f14303g = new w94();

    /* renamed from: h */
    private volatile boolean f14304h;

    /* renamed from: i */
    private boolean f14305i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f14306j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public uf1 f14307k = m21077j(0);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f14308l = -1;

    /* renamed from: m */
    private da4 f14309m;

    /* renamed from: n */
    private boolean f14310n;

    /* renamed from: o */
    final /* synthetic */ g34 f14311o;

    public b34(g34 g34, Uri uri, qb1 qb1, x24 x24, b94 b94, kv1 kv1) {
        this.f14311o = g34;
        this.f14298b = uri;
        this.f14299c = new t64(qb1);
        this.f14300d = x24;
        this.f14301e = b94;
        this.f14302f = kv1;
    }

    /* renamed from: i */
    static /* bridge */ /* synthetic */ void m21076i(b34 b34, long j, long j2) {
        b34.f14303g.f25288a = j;
        b34.f14306j = j2;
        b34.f14305i = true;
        b34.f14310n = false;
    }

    /* renamed from: j */
    private final uf1 m21077j(long j) {
        sd1 sd1 = new sd1();
        sd1.mo20833d(this.f14298b);
        sd1.mo20832c(j);
        sd1.mo20830a(6);
        sd1.mo20831b(g34.f16895Q);
        return sd1.mo20834e();
    }

    /* renamed from: a */
    public final void mo16040a(no2 no2) {
        long j;
        if (!this.f14310n) {
            j = this.f14306j;
        } else {
            j = Math.max(this.f14311o.m24104B(), this.f14306j);
        }
        int i = no2.mo19782i();
        da4 da4 = this.f14309m;
        Objects.requireNonNull(da4);
        ba4.m21199b(da4, no2, i);
        da4.mo16889e(j, 1, i, 0, (ca4) null);
        this.f14310n = true;
    }

    /* renamed from: e */
    public final void mo16041e() {
        this.f14304h = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:71|72|(1:74)(1:75)|76) */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r7 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0125, code lost:
        if (r7.length() != 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0127, code lost:
        r7 = "Invalid metadata interval: ".concat(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012c, code lost:
        r7 = new java.lang.String("Invalid metadata interval: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        android.util.Log.w("IcyHeaders", r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x011d */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x022e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01ed A[EDGE_INSN: B:125:0x01ed->B:108:0x01ed ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f3 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0135 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0139 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0194 A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019d A[Catch:{ all -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01aa A[SYNTHETIC, Splitter:B:93:0x01aa] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16042g() throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.f14304h
            if (r2 != 0) goto L_0x022e
            r2 = -1
            r4 = 1
            r5 = 0
            com.google.android.gms.internal.ads.w94 r6 = r1.f14303g     // Catch:{ all -> 0x020f }
            long r13 = r6.f25288a     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.uf1 r6 = r1.m21077j(r13)     // Catch:{ all -> 0x020f }
            r1.f14307k = r6     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.t64 r7 = r1.f14299c     // Catch:{ all -> 0x020f }
            long r6 = r7.mo15698m(r6)     // Catch:{ all -> 0x020f }
            r1.f14308l = r6     // Catch:{ all -> 0x020f }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0025
            long r6 = r6 + r13
            r1.f14308l = r6     // Catch:{ all -> 0x020f }
        L_0x0025:
            com.google.android.gms.internal.ads.g34 r6 = r1.f14311o     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.t64 r7 = r1.f14299c     // Catch:{ all -> 0x020f }
            java.util.Map r7 = r7.zza()     // Catch:{ all -> 0x020f }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x020f }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x020f }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x0087
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0069 }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x004a
            r8 = 1
            goto L_0x0066
        L_0x004a:
            java.lang.String r12 = "Invalid bitrate: "
            java.lang.String r15 = java.lang.String.valueOf(r8)     // Catch:{ NumberFormatException -> 0x006a }
            int r16 = r15.length()     // Catch:{ NumberFormatException -> 0x006a }
            if (r16 == 0) goto L_0x005b
            java.lang.String r12 = r12.concat(r15)     // Catch:{ NumberFormatException -> 0x006a }
            goto L_0x0061
        L_0x005b:
            java.lang.String r15 = new java.lang.String     // Catch:{ NumberFormatException -> 0x006a }
            r15.<init>(r12)     // Catch:{ NumberFormatException -> 0x006a }
            r12 = r15
        L_0x0061:
            android.util.Log.w(r9, r12)     // Catch:{ NumberFormatException -> 0x006a }
            r8 = 0
            r11 = -1
        L_0x0066:
            r16 = r11
            goto L_0x008a
        L_0x0069:
            r11 = -1
        L_0x006a:
            java.lang.String r12 = "Invalid bitrate header: "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x020f }
            int r15 = r8.length()     // Catch:{ all -> 0x020f }
            if (r15 == 0) goto L_0x007b
            java.lang.String r8 = r12.concat(r8)     // Catch:{ all -> 0x020f }
            goto L_0x0080
        L_0x007b:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x020f }
            r8.<init>(r12)     // Catch:{ all -> 0x020f }
        L_0x0080:
            android.util.Log.w(r9, r8)     // Catch:{ all -> 0x020f }
            r16 = r11
            r8 = 0
            goto L_0x008a
        L_0x0087:
            r8 = 0
            r16 = -1
        L_0x008a:
            java.lang.String r11 = "icy-genre"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020f }
            r12 = 0
            if (r11 == 0) goto L_0x009f
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            r17 = r8
            r8 = 1
            goto L_0x00a1
        L_0x009f:
            r17 = r12
        L_0x00a1:
            java.lang.String r11 = "icy-name"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020f }
            if (r11 == 0) goto L_0x00b5
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            r18 = r8
            r8 = 1
            goto L_0x00b7
        L_0x00b5:
            r18 = r12
        L_0x00b7:
            java.lang.String r11 = "icy-url"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020f }
            if (r11 == 0) goto L_0x00cb
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            r19 = r8
            r8 = 1
            goto L_0x00cd
        L_0x00cb:
            r19 = r12
        L_0x00cd:
            java.lang.String r11 = "icy-pub"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020f }
            if (r11 == 0) goto L_0x00e7
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020f }
            java.lang.String r11 = "1"
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x020f }
            r20 = r8
            r8 = 1
            goto L_0x00e9
        L_0x00e7:
            r20 = 0
        L_0x00e9:
            java.lang.String r11 = "icy-metaint"
            java.lang.Object r7 = r7.get(r11)     // Catch:{ all -> 0x020f }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x020f }
            if (r7 == 0) goto L_0x0135
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x020f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x020f }
            int r11 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x011c }
            if (r11 <= 0) goto L_0x0101
            r8 = 1
            goto L_0x0119
        L_0x0101:
            java.lang.String r15 = java.lang.String.valueOf(r7)     // Catch:{ NumberFormatException -> 0x011d }
            int r21 = r15.length()     // Catch:{ NumberFormatException -> 0x011d }
            if (r21 == 0) goto L_0x0110
            java.lang.String r15 = r0.concat(r15)     // Catch:{ NumberFormatException -> 0x011d }
            goto L_0x0115
        L_0x0110:
            java.lang.String r15 = new java.lang.String     // Catch:{ NumberFormatException -> 0x011d }
            r15.<init>(r0)     // Catch:{ NumberFormatException -> 0x011d }
        L_0x0115:
            android.util.Log.w(r9, r15)     // Catch:{ NumberFormatException -> 0x011d }
            r11 = -1
        L_0x0119:
            r21 = r11
            goto L_0x0137
        L_0x011c:
            r11 = -1
        L_0x011d:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x020f }
            int r15 = r7.length()     // Catch:{ all -> 0x020f }
            if (r15 == 0) goto L_0x012c
            java.lang.String r7 = r0.concat(r7)     // Catch:{ all -> 0x020f }
            goto L_0x0131
        L_0x012c:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x020f }
            r7.<init>(r0)     // Catch:{ all -> 0x020f }
        L_0x0131:
            android.util.Log.w(r9, r7)     // Catch:{ all -> 0x020f }
            goto L_0x0119
        L_0x0135:
            r21 = -1
        L_0x0137:
            if (r8 == 0) goto L_0x013f
            com.google.android.gms.internal.ads.zzzd r12 = new com.google.android.gms.internal.ads.zzzd     // Catch:{ all -> 0x020f }
            r15 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x020f }
        L_0x013f:
            r6.f16927u = r12     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.t64 r6 = r1.f14299c     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.g34 r7 = r1.f14311o     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.zzzd r7 = r7.f16927u     // Catch:{ all -> 0x020f }
            if (r7 == 0) goto L_0x0174
            com.google.android.gms.internal.ads.g34 r7 = r1.f14311o     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.zzzd r7 = r7.f16927u     // Catch:{ all -> 0x020f }
            int r7 = r7.f27445l     // Catch:{ all -> 0x020f }
            if (r7 == r10) goto L_0x0174
            com.google.android.gms.internal.ads.w14 r6 = new com.google.android.gms.internal.ads.w14     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.t64 r7 = r1.f14299c     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.g34 r8 = r1.f14311o     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.zzzd r8 = r8.f16927u     // Catch:{ all -> 0x020f }
            int r8 = r8.f27445l     // Catch:{ all -> 0x020f }
            r6.<init>(r7, r8, r1)     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.g34 r7 = r1.f14311o     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.da4 r7 = r7.mo17829T()     // Catch:{ all -> 0x020f }
            r1.f14309m = r7     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.w r8 = com.google.android.gms.internal.ads.g34.f16896R     // Catch:{ all -> 0x020f }
            r7.mo16885a(r8)     // Catch:{ all -> 0x020f }
        L_0x0174:
            r8 = r6
            com.google.android.gms.internal.ads.x24 r7 = r1.f14300d     // Catch:{ all -> 0x020f }
            android.net.Uri r9 = r1.f14298b     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.t64 r6 = r1.f14299c     // Catch:{ all -> 0x020f }
            java.util.Map r10 = r6.zza()     // Catch:{ all -> 0x020f }
            long r11 = r1.f14308l     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.b94 r15 = r1.f14301e     // Catch:{ all -> 0x020f }
            r16 = r11
            r11 = r13
            r2 = r13
            r13 = r16
            r7.mo18784d(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.g34 r6 = r1.f14311o     // Catch:{ all -> 0x020f }
            com.google.android.gms.internal.ads.zzzd r6 = r6.f16927u     // Catch:{ all -> 0x020f }
            if (r6 == 0) goto L_0x0199
            com.google.android.gms.internal.ads.x24 r6 = r1.f14300d     // Catch:{ all -> 0x020f }
            r6.mo18782b()     // Catch:{ all -> 0x020f }
        L_0x0199:
            boolean r6 = r1.f14305i     // Catch:{ all -> 0x020f }
            if (r6 == 0) goto L_0x01a6
            com.google.android.gms.internal.ads.x24 r6 = r1.f14300d     // Catch:{ all -> 0x020f }
            long r7 = r1.f14306j     // Catch:{ all -> 0x020f }
            r6.mo18783c(r2, r7)     // Catch:{ all -> 0x020f }
            r1.f14305i = r5     // Catch:{ all -> 0x020f }
        L_0x01a6:
            r13 = r2
            r2 = 0
        L_0x01a8:
            if (r2 != 0) goto L_0x01ed
            boolean r3 = r1.f14304h     // Catch:{ all -> 0x01ea }
            if (r3 != 0) goto L_0x01e8
            com.google.android.gms.internal.ads.kv1 r3 = r1.f14302f     // Catch:{ InterruptedException -> 0x01e2 }
            r3.mo19013a()     // Catch:{ InterruptedException -> 0x01e2 }
            com.google.android.gms.internal.ads.x24 r3 = r1.f14300d     // Catch:{ all -> 0x01ea }
            com.google.android.gms.internal.ads.w94 r6 = r1.f14303g     // Catch:{ all -> 0x01ea }
            int r2 = r3.mo18785e(r6)     // Catch:{ all -> 0x01ea }
            com.google.android.gms.internal.ads.x24 r3 = r1.f14300d     // Catch:{ all -> 0x01ea }
            long r6 = r3.mo18781a()     // Catch:{ all -> 0x01ea }
            com.google.android.gms.internal.ads.g34 r3 = r1.f14311o     // Catch:{ all -> 0x01ea }
            long r8 = r3.f16919m     // Catch:{ all -> 0x01ea }
            long r8 = r8 + r13
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a8
            com.google.android.gms.internal.ads.kv1 r3 = r1.f14302f     // Catch:{ all -> 0x01ea }
            r3.mo19015c()     // Catch:{ all -> 0x01ea }
            com.google.android.gms.internal.ads.g34 r3 = r1.f14311o     // Catch:{ all -> 0x01ea }
            android.os.Handler r3 = r3.f16925s     // Catch:{ all -> 0x01ea }
            com.google.android.gms.internal.ads.g34 r8 = r1.f14311o     // Catch:{ all -> 0x01ea }
            java.lang.Runnable r8 = r8.f16924r     // Catch:{ all -> 0x01ea }
            r3.post(r8)     // Catch:{ all -> 0x01ea }
            r13 = r6
            goto L_0x01a8
        L_0x01e2:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01ea }
            r0.<init>()     // Catch:{ all -> 0x01ea }
            throw r0     // Catch:{ all -> 0x01ea }
        L_0x01e8:
            r2 = 0
            goto L_0x01ed
        L_0x01ea:
            r0 = move-exception
            r5 = r2
            goto L_0x0210
        L_0x01ed:
            if (r2 != r4) goto L_0x01f0
            goto L_0x0207
        L_0x01f0:
            com.google.android.gms.internal.ads.x24 r3 = r1.f14300d
            long r3 = r3.mo18781a()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0206
            com.google.android.gms.internal.ads.w94 r3 = r1.f14303g
            com.google.android.gms.internal.ads.x24 r4 = r1.f14300d
            long r4 = r4.mo18781a()
            r3.f25288a = r4
        L_0x0206:
            r5 = r2
        L_0x0207:
            com.google.android.gms.internal.ads.t64 r2 = r1.f14299c
            com.google.android.gms.internal.ads.wy2.m33450m(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x022e
        L_0x020f:
            r0 = move-exception
        L_0x0210:
            if (r5 == r4) goto L_0x0228
            com.google.android.gms.internal.ads.x24 r2 = r1.f14300d
            long r2 = r2.mo18781a()
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0228
            com.google.android.gms.internal.ads.w94 r2 = r1.f14303g
            com.google.android.gms.internal.ads.x24 r3 = r1.f14300d
            long r3 = r3.mo18781a()
            r2.f25288a = r3
        L_0x0228:
            com.google.android.gms.internal.ads.t64 r2 = r1.f14299c
            com.google.android.gms.internal.ads.wy2.m33450m(r2)
            throw r0
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b34.mo16042g():void");
    }
}
