package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.im */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5194im extends C5190ii {

    /* renamed from: Q */
    private final Context f18065Q;

    /* renamed from: R */
    private final C5268km f18066R;

    /* renamed from: S */
    private final C5564sm f18067S;

    /* renamed from: T */
    private final boolean f18068T;

    /* renamed from: U */
    private final long[] f18069U;

    /* renamed from: V */
    private zzapg[] f18070V;

    /* renamed from: W */
    private C5157hm f18071W;

    /* renamed from: X */
    private Surface f18072X;

    /* renamed from: Y */
    private Surface f18073Y;

    /* renamed from: Z */
    private boolean f18074Z;

    /* renamed from: a0 */
    private long f18075a0;

    /* renamed from: b0 */
    private long f18076b0;

    /* renamed from: c0 */
    private int f18077c0;

    /* renamed from: d0 */
    private int f18078d0;

    /* renamed from: e0 */
    private int f18079e0;

    /* renamed from: f0 */
    private float f18080f0;

    /* renamed from: g0 */
    private int f18081g0;

    /* renamed from: h0 */
    private int f18082h0;

    /* renamed from: i0 */
    private int f18083i0;

    /* renamed from: j0 */
    private float f18084j0;

    /* renamed from: k0 */
    private int f18085k0;

    /* renamed from: l0 */
    private int f18086l0;

    /* renamed from: m0 */
    private int f18087m0;

    /* renamed from: n0 */
    private float f18088n0;

    /* renamed from: o0 */
    private long f18089o0;

    /* renamed from: p0 */
    private int f18090p0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5194im(Context context, C5264ki kiVar, long j, Handler handler, C5601tm tmVar, int i) {
        super(2, kiVar, (C5336mg) null, false);
        boolean z = false;
        this.f18065Q = context.getApplicationContext();
        this.f18066R = new C5268km(context);
        this.f18067S = new C5564sm(handler, tmVar);
        if (C4934bm.f14552a <= 22 && "foster".equals(C4934bm.f14553b) && "NVIDIA".equals(C4934bm.f14554c)) {
            z = true;
        }
        this.f18068T = z;
        this.f18069U = new long[10];
        this.f18089o0 = -9223372036854775807L;
        this.f18075a0 = -9223372036854775807L;
        this.f18081g0 = -1;
        this.f18082h0 = -1;
        this.f18084j0 = -1.0f;
        this.f18080f0 = -1.0f;
        m25260e0();
    }

    /* renamed from: d0 */
    private static int m25259d0(zzapg zzapg) {
        int i = zzapg.f27133s;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: e0 */
    private final void m25260e0() {
        this.f18085k0 = -1;
        this.f18086l0 = -1;
        this.f18088n0 = -1.0f;
        this.f18087m0 = -1;
    }

    /* renamed from: f0 */
    private final void m25261f0() {
        if (this.f18077c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f18067S.mo20876d(this.f18077c0, elapsedRealtime - this.f18076b0);
            this.f18077c0 = 0;
            this.f18076b0 = elapsedRealtime;
        }
    }

    /* renamed from: g0 */
    private final void m25262g0() {
        int i = this.f18085k0;
        int i2 = this.f18081g0;
        if (i != i2 || this.f18086l0 != this.f18082h0 || this.f18087m0 != this.f18083i0 || this.f18088n0 != this.f18084j0) {
            this.f18067S.mo20880h(i2, this.f18082h0, this.f18083i0, this.f18084j0);
            this.f18085k0 = this.f18081g0;
            this.f18086l0 = this.f18082h0;
            this.f18087m0 = this.f18083i0;
            this.f18088n0 = this.f18084j0;
        }
    }

    /* renamed from: h0 */
    private final void m25263h0() {
        if (this.f18085k0 != -1 || this.f18086l0 != -1) {
            this.f18067S.mo20880h(this.f18081g0, this.f18082h0, this.f18083i0, this.f18084j0);
        }
    }

    /* renamed from: i0 */
    private static boolean m25264i0(long j) {
        return j < -30000;
    }

    /* renamed from: j0 */
    private final boolean m25265j0(boolean z) {
        if (C4934bm.f14552a < 23 || (z && !zzaxh.m34937b(this.f18065Q))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo18403A() {
        if (!this.f18074Z) {
            this.f18074Z = true;
            this.f18067S.mo20879g(this.f18072X);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18356E(com.google.android.gms.internal.ads.C5116gi r12, android.media.MediaCodec r13, com.google.android.gms.internal.ads.zzapg r14, android.media.MediaCrypto r15) throws com.google.android.gms.internal.ads.C5375ni {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzapg[] r15 = r11.f18070V
            int r0 = r14.f27130p
            int r1 = r14.f27131q
            int r2 = r14.f27127m
            r3 = 0
            r4 = -1
            if (r2 != r4) goto L_0x0091
            java.lang.String r2 = r14.f27126l
            if (r0 == r4) goto L_0x0090
            if (r1 != r4) goto L_0x0014
            goto L_0x0090
        L_0x0014:
            int r5 = r2.hashCode()
            r6 = 5
            r7 = 1
            r8 = 4
            r9 = 3
            r10 = 2
            switch(r5) {
                case -1664118616: goto L_0x0053;
                case -1662541442: goto L_0x0049;
                case 1187890754: goto L_0x003f;
                case 1331836730: goto L_0x0035;
                case 1599127256: goto L_0x002b;
                case 1599127257: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x005d
        L_0x0021:
            java.lang.String r5 = "video/x-vnd.on2.vp9"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 5
            goto L_0x005e
        L_0x002b:
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 3
            goto L_0x005e
        L_0x0035:
            java.lang.String r5 = "video/avc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 2
            goto L_0x005e
        L_0x003f:
            java.lang.String r5 = "video/mp4v-es"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x0049:
            java.lang.String r5 = "video/hevc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 4
            goto L_0x005e
        L_0x0053:
            java.lang.String r5 = "video/3gpp"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 0
            goto L_0x005e
        L_0x005d:
            r2 = -1
        L_0x005e:
            if (r2 == 0) goto L_0x0088
            if (r2 == r7) goto L_0x0088
            if (r2 == r10) goto L_0x006e
            if (r2 == r9) goto L_0x0088
            if (r2 == r8) goto L_0x006b
            if (r2 == r6) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            int r2 = r0 * r1
            goto L_0x008b
        L_0x006e:
            java.lang.String r2 = com.google.android.gms.internal.ads.C4934bm.f14555d
            java.lang.String r5 = "BRAVIA 4K 2015"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            r2 = 16
            int r5 = com.google.android.gms.internal.ads.C4934bm.m21434d(r0, r2)
            int r2 = com.google.android.gms.internal.ads.C4934bm.m21434d(r1, r2)
            int r5 = r5 * r2
            int r2 = r5 * 256
            goto L_0x008a
        L_0x0088:
            int r2 = r0 * r1
        L_0x008a:
            r8 = 2
        L_0x008b:
            int r2 = r2 * 3
            int r8 = r8 + r8
            int r2 = r2 / r8
            goto L_0x0091
        L_0x0090:
            r2 = -1
        L_0x0091:
            int r15 = r15.length
            com.google.android.gms.internal.ads.hm r15 = new com.google.android.gms.internal.ads.hm
            r15.<init>(r0, r1, r2)
            r11.f18071W = r15
            boolean r0 = r11.f18068T
            android.media.MediaFormat r14 = r14.mo22481b()
            int r1 = r15.f17705a
            java.lang.String r2 = "max-width"
            r14.setInteger(r2, r1)
            int r1 = r15.f17706b
            java.lang.String r2 = "max-height"
            r14.setInteger(r2, r1)
            int r15 = r15.f17707c
            if (r15 == r4) goto L_0x00b6
            java.lang.String r1 = "max-input-size"
            r14.setInteger(r1, r15)
        L_0x00b6:
            if (r0 == 0) goto L_0x00bd
            java.lang.String r15 = "auto-frc"
            r14.setInteger(r15, r3)
        L_0x00bd:
            android.view.Surface r15 = r11.f18072X
            if (r15 != 0) goto L_0x00dc
            boolean r15 = r12.f17105d
            boolean r15 = r11.m25265j0(r15)
            com.google.android.gms.internal.ads.C5304ll.m26776e(r15)
            android.view.Surface r15 = r11.f18073Y
            if (r15 != 0) goto L_0x00d8
            android.content.Context r15 = r11.f18065Q
            boolean r12 = r12.f17105d
            com.google.android.gms.internal.ads.zzaxh r12 = com.google.android.gms.internal.ads.zzaxh.m34936a(r15, r12)
            r11.f18073Y = r12
        L_0x00d8:
            android.view.Surface r12 = r11.f18073Y
            r11.f18072X = r12
        L_0x00dc:
            android.view.Surface r12 = r11.f18072X
            r15 = 0
            r13.configure(r14, r12, r15, r3)
            int r12 = com.google.android.gms.internal.ads.C4934bm.f14552a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5194im.mo18356E(com.google.android.gms.internal.ads.gi, android.media.MediaCodec, com.google.android.gms.internal.ads.zzapg, android.media.MediaCrypto):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo18358G(String str, long j, long j2) {
        this.f18067S.mo20874b(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo18359H(zzapg zzapg) throws C5778yd {
        super.mo18359H(zzapg);
        this.f18067S.mo20878f(zzapg);
        float f = zzapg.f27134t;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f18080f0 = f;
        this.f18079e0 = m25259d0(zzapg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo18360J(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f18081g0 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f18082h0 = i2;
        float f = this.f18080f0;
        this.f18084j0 = f;
        if (C4934bm.f14552a >= 21) {
            int i3 = this.f18079e0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f18081g0;
                this.f18081g0 = i2;
                this.f18082h0 = i4;
                this.f18084j0 = 1.0f / f;
            }
        } else {
            this.f18083i0 = this.f18079e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final boolean mo18362M(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.f18090p0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.f18069U;
            long j5 = jArr[0];
            if (j4 < j5) {
                break;
            }
            this.f18089o0 = j5;
            int i5 = i4 - 1;
            this.f18090p0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j6 = j4 - this.f18089o0;
        if (z) {
            mo18406c0(mediaCodec2, i3, j6);
            return true;
        }
        long j7 = j4 - j;
        if (this.f18072X == this.f18073Y) {
            if (!m25264i0(j7)) {
                return false;
            }
            mo18406c0(mediaCodec2, i3, j6);
            return true;
        } else if (!this.f18074Z) {
            if (C4934bm.f14552a >= 21) {
                mo18405b0(mediaCodec, i, j6, System.nanoTime());
            } else {
                mo18404a0(mediaCodec2, i3, j6);
            }
            return true;
        } else if (mo20633a() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long a = this.f18066R.mo18918a(j4, ((j7 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j8 = (a - nanoTime) / 1000;
            if (m25264i0(j8)) {
                C5786yl.m34154a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                C5786yl.m34155b();
                C5188ig igVar = this.f18020O;
                igVar.f17983f++;
                this.f18077c0++;
                int i6 = this.f18078d0 + 1;
                this.f18078d0 = i6;
                igVar.f17984g = Math.max(i6, igVar.f17984g);
                if (this.f18077c0 == -1) {
                    m25261f0();
                }
                return true;
            }
            if (C4934bm.f14552a >= 21) {
                if (j8 < 50000) {
                    mo18405b0(mediaCodec, i, j6, a);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                mo18404a0(mediaCodec2, i3, j6);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo18367W(C5225jg jgVar) {
        int i = C4934bm.f14552a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo18368X() {
        try {
            super.mo18368X();
        } finally {
            Surface surface = this.f18073Y;
            if (surface != null) {
                if (this.f18072X == surface) {
                    this.f18072X = null;
                }
                surface.release();
                this.f18073Y = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final boolean mo18369Y(MediaCodec mediaCodec, boolean z, zzapg zzapg, zzapg zzapg2) {
        if (!zzapg.f27126l.equals(zzapg2.f27126l) || m25259d0(zzapg) != m25259d0(zzapg2)) {
            return false;
        }
        if (!z && (zzapg.f27130p != zzapg2.f27130p || zzapg.f27131q != zzapg2.f27131q)) {
            return false;
        }
        int i = zzapg2.f27130p;
        C5157hm hmVar = this.f18071W;
        return i <= hmVar.f17705a && zzapg2.f27131q <= hmVar.f17706b && zzapg2.f27127m <= hmVar.f17707c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final boolean mo18370Z(C5116gi giVar) {
        return this.f18072X != null || m25265j0(giVar.f17105d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public final void mo18404a0(MediaCodec mediaCodec, int i, long j) {
        m25262g0();
        C5786yl.m34154a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C5786yl.m34155b();
        this.f18020O.f17981d++;
        this.f18078d0 = 0;
        mo18403A();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    /* renamed from: b0 */
    public final void mo18405b0(MediaCodec mediaCodec, int i, long j, long j2) {
        m25262g0();
        C5786yl.m34154a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C5786yl.m34155b();
        this.f18020O.f17981d++;
        this.f18078d0 = 0;
        mo18403A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public final void mo18406c0(MediaCodec mediaCodec, int i, long j) {
        C5786yl.m34154a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C5786yl.m34155b();
        this.f18020O.f17982e++;
    }

    /* renamed from: i */
    public final void mo15757i(int i, Object obj) throws C5778yd {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f18073Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    C5116gi U = mo18365U();
                    if (U != null && m25265j0(U.f17105d)) {
                        surface = zzaxh.m34936a(this.f18065Q, U.f17105d);
                        this.f18073Y = surface;
                    }
                }
            }
            if (this.f18072X != surface) {
                this.f18072X = surface;
                int a = mo20633a();
                if (a == 1 || a == 2) {
                    MediaCodec N = mo18363N();
                    if (C4934bm.f14552a < 23 || N == null || surface == null) {
                        mo18368X();
                        mo18366V();
                    } else {
                        N.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f18073Y) {
                    m25260e0();
                    this.f18074Z = false;
                    int i2 = C4934bm.f14552a;
                    return;
                }
                m25263h0();
                this.f18074Z = false;
                int i3 = C4934bm.f14552a;
                if (a == 2) {
                    this.f18075a0 = -9223372036854775807L;
                }
            } else if (surface != null && surface != this.f18073Y) {
                m25263h0();
                if (this.f18074Z) {
                    this.f18067S.mo20879g(this.f18072X);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo18372o() {
        this.f18081g0 = -1;
        this.f18082h0 = -1;
        this.f18084j0 = -1.0f;
        this.f18080f0 = -1.0f;
        this.f18089o0 = -9223372036854775807L;
        this.f18090p0 = 0;
        m25260e0();
        this.f18074Z = false;
        int i = C4934bm.f14552a;
        this.f18066R.mo18919b();
        try {
            super.mo18372o();
        } finally {
            this.f18020O.mo18329a();
            this.f18067S.mo20875c(this.f18020O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo18373p(boolean z) throws C5778yd {
        super.mo18373p(z);
        int i = mo21802n().f23833a;
        this.f18067S.mo20877e(this.f18020O);
        this.f18066R.mo18920c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo18374q(long j, boolean z) throws C5778yd {
        super.mo18374q(j, z);
        this.f18074Z = false;
        int i = C4934bm.f14552a;
        this.f18078d0 = 0;
        int i2 = this.f18090p0;
        if (i2 != 0) {
            this.f18089o0 = this.f18069U[i2 - 1];
            this.f18090p0 = 0;
        }
        this.f18075a0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo18407r() {
        this.f18077c0 = 0;
        this.f18076b0 = SystemClock.elapsedRealtime();
        this.f18075a0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo18408u() {
        m25261f0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo18409v(zzapg[] zzapgArr, long j) throws C5778yd {
        this.f18070V = zzapgArr;
        if (this.f18089o0 == -9223372036854775807L) {
            this.f18089o0 = j;
            return;
        }
        int i = this.f18090p0;
        if (i == 10) {
            long j2 = this.f18069U[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j2);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.f18090p0 = i + 1;
        }
        this.f18069U[this.f18090p0 - 1] = j;
    }

    /* renamed from: w */
    public final boolean mo18375w() {
        Surface surface;
        if (super.mo18375w() && (this.f18074Z || (((surface = this.f18073Y) != null && this.f18072X == surface) || mo18363N() == null))) {
            this.f18075a0 = -9223372036854775807L;
            return true;
        } else if (this.f18075a0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f18075a0) {
                return true;
            }
            this.f18075a0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final int mo18376z(C5264ki kiVar, zzapg zzapg) throws C5375ni {
        boolean z;
        int i;
        int i2;
        String str = zzapg.f27126l;
        int i3 = 0;
        if (!C5489ql.m29557b(str)) {
            return 0;
        }
        zzarf zzarf = zzapg.f27129o;
        if (zzarf != null) {
            z = false;
            for (int i4 = 0; i4 < zzarf.f27148i; i4++) {
                z |= zzarf.mo22495a(i4).f27145k;
            }
        } else {
            z = false;
        }
        C5116gi c = C5560si.m30725c(str, z);
        if (c == null) {
            return 1;
        }
        boolean e = c.mo17926e(zzapg.f27123i);
        if (e && (i = zzapg.f27130p) > 0 && (i2 = zzapg.f27131q) > 0) {
            if (C4934bm.f14552a >= 21) {
                e = c.mo17927f(i, i2, (double) zzapg.f27132r);
            } else {
                e = i * i2 <= C5560si.m30723a();
                if (!e) {
                    int i5 = zzapg.f27130p;
                    int i6 = zzapg.f27131q;
                    String str2 = C4934bm.f14556e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        int i7 = true != c.f17103b ? 4 : 8;
        if (true == c.f17104c) {
            i3 = 16;
        }
        return (true != e ? 2 : 3) | i7 | i3;
    }
}
