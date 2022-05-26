package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kq0 extends eq0 implements C5267kl<C5673vk> {

    /* renamed from: j */
    private String f18954j;

    /* renamed from: k */
    private final do0 f18955k;

    /* renamed from: l */
    private boolean f18956l;

    /* renamed from: m */
    private final jq0 f18957m = new jq0();

    /* renamed from: n */
    private final op0 f18958n = new op0();

    /* renamed from: o */
    private ByteBuffer f18959o;

    /* renamed from: p */
    private boolean f18960p;

    /* renamed from: q */
    private final Object f18961q = new Object();

    /* renamed from: r */
    private final String f18962r;

    /* renamed from: s */
    private final int f18963s;

    /* renamed from: t */
    private boolean f18964t;

    public kq0(eo0 eo0, do0 do0) {
        super(eo0);
        this.f18955k = do0;
        this.f18962r = eo0 != null ? eo0.mo17246n() : BuildConfig.FLAVOR;
        this.f18963s = eo0 != null ? eo0.mo17237e() : 0;
    }

    /* renamed from: A */
    protected static final String m26351A(String str) {
        String valueOf = String.valueOf(nl0.m27916e(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    /* renamed from: B */
    private final void m26352B() {
        int a = (int) this.f18957m.mo18701a();
        int a2 = (int) this.f18958n.mo20067a(this.f18959o);
        int position = this.f18959o.position();
        int round = Math.round(((float) a2) * (((float) position) / ((float) a)));
        boolean z = round > 0;
        int S = un0.m31901S();
        int U = un0.m31902U();
        String str = this.f18954j;
        mo17266m(str, m26351A(str), position, a, (long) round, (long) a2, z, S, U);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo18904h(Object obj, int i) {
    }

    /* renamed from: i */
    public final void mo17262i() {
        this.f18956l = true;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ void mo18905r(Object obj, C5747xk xkVar) {
        this.f18957m.mo18702b((C4896al) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.al} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.al} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: com.google.android.gms.internal.ads.ap0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.gms.internal.ads.al} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d1, code lost:
        if (r9.f18959o.remaining() > 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d3, code lost:
        m26352B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00da, code lost:
        if (r9.f18956l != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        r12 = r1.mo11988a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
        if ((r12 - r16) < r4) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
        m26352B();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r0 = new java.lang.StringBuilder(49);
        r0.append("Timeout exceeded. Limit: ");
        r0.append(r6);
        r0.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        throw new java.io.IOException(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1 = r9.f18959o.limit();
        r2 = new java.lang.StringBuilder(35);
        r2.append("Precache abort at ");
        r2.append(r1);
        r2.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0141, code lost:
        throw new java.io.IOException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0142, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17272u(java.lang.String r27) {
        /*
            r26 = this;
            r9 = r26
            r10 = r27
            r9.f18954j = r10
            java.lang.String r11 = m26351A(r27)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.al r0 = new com.google.android.gms.internal.ads.al     // Catch:{ Exception -> 0x014b }
            java.lang.String r2 = r9.f16060h     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.do0 r1 = r9.f18955k     // Catch:{ Exception -> 0x014b }
            int r5 = r1.f15687d     // Catch:{ Exception -> 0x014b }
            r3 = 0
            int r6 = r1.f15688e     // Catch:{ Exception -> 0x014b }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.do0 r1 = r9.f18955k     // Catch:{ Exception -> 0x014b }
            boolean r1 = r1.f15692i     // Catch:{ Exception -> 0x014b }
            if (r1 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.ap0 r15 = new com.google.android.gms.internal.ads.ap0     // Catch:{ Exception -> 0x014b }
            android.content.Context r2 = r9.f16059g     // Catch:{ Exception -> 0x014b }
            java.lang.String r4 = r9.f18962r     // Catch:{ Exception -> 0x014b }
            int r5 = r9.f18963s     // Catch:{ Exception -> 0x014b }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r15
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x014b }
            r0 = r15
        L_0x0037:
            android.net.Uri r16 = android.net.Uri.parse(r27)     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.xk r1 = new com.google.android.gms.internal.ads.xk     // Catch:{ Exception -> 0x014b }
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = -1
            r24 = 0
            r25 = 0
            r15 = r1
            r15.<init>(r16, r17, r18, r20, r22, r24, r25)     // Catch:{ Exception -> 0x014b }
            r0.mo15844c(r1)     // Catch:{ Exception -> 0x014b }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.eo0> r1 = r9.f16061i     // Catch:{ Exception -> 0x014b }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.eo0 r1 = (com.google.android.gms.internal.ads.eo0) r1     // Catch:{ Exception -> 0x014b }
            if (r1 == 0) goto L_0x005d
            r1.mo17227A(r11, r9)     // Catch:{ Exception -> 0x014b }
        L_0x005d:
            com.google.android.gms.common.util.d r1 = com.google.android.gms.ads.internal.C2971s.m13198a()     // Catch:{ Exception -> 0x014b }
            long r2 = r1.mo11988a()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.iz<java.lang.Long> r4 = com.google.android.gms.internal.ads.C5503qz.f22600q     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.oz r5 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ Exception -> 0x014b }
            java.lang.Object r4 = r5.mo20153b(r4)     // Catch:{ Exception -> 0x014b }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x014b }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.iz<java.lang.Long> r6 = com.google.android.gms.internal.ads.C5503qz.f22592p     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.oz r7 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ Exception -> 0x014b }
            java.lang.Object r6 = r7.mo20153b(r6)     // Catch:{ Exception -> 0x014b }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x014b }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.do0 r8 = r9.f18955k     // Catch:{ Exception -> 0x014b }
            int r8 = r8.f15686c     // Catch:{ Exception -> 0x014b }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x014b }
            r9.f18959o = r8     // Catch:{ Exception -> 0x014b }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x014b }
            r16 = r2
        L_0x0095:
            java.nio.ByteBuffer r14 = r9.f18959o     // Catch:{ Exception -> 0x014b }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x014b }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x014b }
            int r14 = r0.mo15842a(r15, r13, r14)     // Catch:{ Exception -> 0x014b }
            r8 = -1
            if (r14 != r8) goto L_0x00b8
            r8 = 1
            r9.f18964t = r8     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.op0 r0 = r9.f18958n     // Catch:{ Exception -> 0x014b }
            java.nio.ByteBuffer r1 = r9.f18959o     // Catch:{ Exception -> 0x014b }
            long r0 = r0.mo20067a(r1)     // Catch:{ Exception -> 0x014b }
            int r1 = (int) r0     // Catch:{ Exception -> 0x014b }
            long r0 = (long) r1     // Catch:{ Exception -> 0x014b }
            r9.mo17265l(r10, r11, r0)     // Catch:{ Exception -> 0x014b }
        L_0x00b6:
            r1 = 1
            goto L_0x00d7
        L_0x00b8:
            java.lang.Object r8 = r9.f18961q     // Catch:{ Exception -> 0x014b }
            monitor-enter(r8)     // Catch:{ Exception -> 0x014b }
            boolean r13 = r9.f18956l     // Catch:{ all -> 0x0146 }
            if (r13 != 0) goto L_0x00c8
            java.nio.ByteBuffer r13 = r9.f18959o     // Catch:{ all -> 0x0146 }
            r21 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x0144 }
            goto L_0x00ca
        L_0x00c8:
            r21 = r12
        L_0x00ca:
            monitor-exit(r8)     // Catch:{ all -> 0x0144 }
            java.nio.ByteBuffer r8 = r9.f18959o     // Catch:{ Exception -> 0x0142 }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x0142 }
            if (r8 > 0) goto L_0x00d8
            r26.m26352B()     // Catch:{ Exception -> 0x0142 }
            goto L_0x00b6
        L_0x00d7:
            return r1
        L_0x00d8:
            boolean r8 = r9.f18956l     // Catch:{ Exception -> 0x0142 }
            if (r8 != 0) goto L_0x011c
            long r12 = r1.mo11988a()     // Catch:{ Exception -> 0x0142 }
            long r22 = r12 - r16
            int r8 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00eb
            r26.m26352B()     // Catch:{ Exception -> 0x0142 }
            r16 = r12
        L_0x00eb:
            long r12 = r12 - r2
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r6
            int r8 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r8 > 0) goto L_0x00fa
            r12 = r21
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x0095
        L_0x00fa:
            java.lang.String r12 = "downloadTimeout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            r1 = 49
            r0.<init>(r1)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r0.append(r1)     // Catch:{ Exception -> 0x011a }
            r0.append(r6)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = " sec"
            r0.append(r1)     // Catch:{ Exception -> 0x011a }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x011a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x011a }
            throw r1     // Catch:{ Exception -> 0x011a }
        L_0x011a:
            r0 = move-exception
            goto L_0x0150
        L_0x011c:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x011a }
            java.nio.ByteBuffer r1 = r9.f18959o     // Catch:{ Exception -> 0x011a }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x011a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            r3 = 35
            r2.<init>(r3)     // Catch:{ Exception -> 0x011a }
            java.lang.String r3 = "Precache abort at "
            r2.append(r3)     // Catch:{ Exception -> 0x011a }
            r2.append(r1)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = " bytes"
            r2.append(r1)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x011a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x011a }
            throw r0     // Catch:{ Exception -> 0x011a }
        L_0x0142:
            r0 = move-exception
            goto L_0x014e
        L_0x0144:
            r0 = move-exception
            goto L_0x0149
        L_0x0146:
            r0 = move-exception
            r21 = r12
        L_0x0149:
            monitor-exit(r8)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ Exception -> 0x0142 }
        L_0x014b:
            r0 = move-exception
            r21 = r12
        L_0x014e:
            r12 = r21
        L_0x0150:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 1
            int r2 = r2 + r5
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r1 = ":"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = java.lang.String.valueOf(r27)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 34
            int r3 = r0.length()
            int r1 = r1 + r3
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.ul0.m31862g(r1)
            r9.mo17263j(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kq0.mo17272u(java.lang.String):boolean");
    }

    /* renamed from: x */
    public final String mo18957x() {
        return this.f18954j;
    }

    /* renamed from: y */
    public final ByteBuffer mo18958y() {
        synchronized (this.f18961q) {
            ByteBuffer byteBuffer = this.f18959o;
            if (byteBuffer != null && !this.f18960p) {
                byteBuffer.flip();
                this.f18960p = true;
            }
            this.f18956l = true;
        }
        return this.f18959o;
    }

    /* renamed from: z */
    public final boolean mo18959z() {
        return this.f18964t;
    }
}
