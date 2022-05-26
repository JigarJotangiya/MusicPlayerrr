package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class o04 extends c93 {

    /* renamed from: D0 */
    private static final byte[] f20784D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private final long[] f20785A;

    /* renamed from: A0 */
    private int f20786A0;

    /* renamed from: B */
    private final long[] f20787B;

    /* renamed from: B0 */
    private pz3 f20788B0;

    /* renamed from: C */
    private final long[] f20789C;

    /* renamed from: C0 */
    private pz3 f20790C0;

    /* renamed from: D */
    private C5689w f20791D;

    /* renamed from: E */
    private C5689w f20792E;

    /* renamed from: F */
    private long f20793F;

    /* renamed from: G */
    private float f20794G;

    /* renamed from: H */
    private float f20795H;

    /* renamed from: I */
    private k04 f20796I;

    /* renamed from: J */
    private C5689w f20797J;

    /* renamed from: K */
    private MediaFormat f20798K;

    /* renamed from: L */
    private boolean f20799L;

    /* renamed from: M */
    private float f20800M;

    /* renamed from: N */
    private ArrayDeque<m04> f20801N;

    /* renamed from: O */
    private n04 f20802O;

    /* renamed from: P */
    private m04 f20803P;

    /* renamed from: Q */
    private int f20804Q;

    /* renamed from: R */
    private boolean f20805R;

    /* renamed from: S */
    private boolean f20806S;

    /* renamed from: T */
    private boolean f20807T;

    /* renamed from: U */
    private boolean f20808U;

    /* renamed from: V */
    private boolean f20809V;

    /* renamed from: W */
    private boolean f20810W;

    /* renamed from: X */
    private boolean f20811X;

    /* renamed from: Y */
    private boolean f20812Y;

    /* renamed from: Z */
    private boolean f20813Z;

    /* renamed from: a0 */
    private boolean f20814a0;

    /* renamed from: b0 */
    private f04 f20815b0;

    /* renamed from: c0 */
    private long f20816c0;

    /* renamed from: d0 */
    private int f20817d0;

    /* renamed from: e0 */
    private int f20818e0;

    /* renamed from: f0 */
    private ByteBuffer f20819f0;

    /* renamed from: g0 */
    private boolean f20820g0;

    /* renamed from: h0 */
    private boolean f20821h0;

    /* renamed from: i0 */
    private boolean f20822i0;

    /* renamed from: j0 */
    private boolean f20823j0;

    /* renamed from: k0 */
    private boolean f20824k0;

    /* renamed from: l0 */
    private boolean f20825l0;

    /* renamed from: m0 */
    private int f20826m0;

    /* renamed from: n0 */
    private int f20827n0;

    /* renamed from: o0 */
    private int f20828o0;

    /* renamed from: p0 */
    private boolean f20829p0;

    /* renamed from: q0 */
    private boolean f20830q0;

    /* renamed from: r */
    private final q04 f20831r;

    /* renamed from: r0 */
    private boolean f20832r0;

    /* renamed from: s */
    private final float f20833s;

    /* renamed from: s0 */
    private long f20834s0;

    /* renamed from: t */
    private final k31 f20835t = new k31(0, 0);

    /* renamed from: t0 */
    private long f20836t0;

    /* renamed from: u */
    private final k31 f20837u = new k31(0, 0);

    /* renamed from: u0 */
    private boolean f20838u0;

    /* renamed from: v */
    private final k31 f20839v = new k31(2, 0);

    /* renamed from: v0 */
    private boolean f20840v0;

    /* renamed from: w */
    private final d04 f20841w;

    /* renamed from: w0 */
    private boolean f20842w0;

    /* renamed from: x */
    private final su2<C5689w> f20843x;

    /* renamed from: x0 */
    protected da3 f20844x0;

    /* renamed from: y */
    private final ArrayList<Long> f20845y;

    /* renamed from: y0 */
    private long f20846y0;

    /* renamed from: z */
    private final MediaCodec.BufferInfo f20847z;

    /* renamed from: z0 */
    private long f20848z0;

    public o04(int i, j04 j04, q04 q04, boolean z, float f) {
        super(i);
        Objects.requireNonNull(q04);
        this.f20831r = q04;
        this.f20833s = f;
        d04 d04 = new d04();
        this.f20841w = d04;
        this.f20843x = new su2<>(10);
        this.f20845y = new ArrayList<>();
        this.f20847z = new MediaCodec.BufferInfo();
        this.f20794G = 1.0f;
        this.f20795H = 1.0f;
        this.f20793F = -9223372036854775807L;
        this.f20785A = new long[10];
        this.f20787B = new long[10];
        this.f20789C = new long[10];
        this.f20846y0 = -9223372036854775807L;
        this.f20848z0 = -9223372036854775807L;
        d04.mo18796i(0);
        d04.f18743c.order(ByteOrder.nativeOrder());
        this.f20800M = -1.0f;
        this.f20804Q = 0;
        this.f20826m0 = 0;
        this.f20817d0 = -1;
        this.f20818e0 = -1;
        this.f20816c0 = -9223372036854775807L;
        this.f20834s0 = -9223372036854775807L;
        this.f20836t0 = -9223372036854775807L;
        this.f20827n0 = 0;
        this.f20828o0 = 0;
    }

    @TargetApi(23)
    /* renamed from: A0 */
    private final void m28197A0() throws ji3 {
        int i = this.f20828o0;
        if (i == 1) {
            mo22450f0();
        } else if (i == 2) {
            mo22450f0();
            m28200D0();
            throw null;
        } else if (i != 3) {
            this.f20840v0 = true;
            mo19873i0();
        } else {
            mo19880t0();
            mo19879r0();
        }
    }

    /* renamed from: B0 */
    private final void m28198B0() {
        this.f20817d0 = -1;
        this.f20837u.f18743c = null;
    }

    /* renamed from: C0 */
    private final void m28199C0() {
        this.f20818e0 = -1;
        this.f20819f0 = null;
    }

    /* renamed from: D0 */
    private final void m28200D0() throws ji3 {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw mo16571u(e, this.f20791D, false, 6006);
        }
    }

    @TargetApi(23)
    /* renamed from: E0 */
    private final boolean m28201E0() throws ji3 {
        if (this.f20829p0) {
            this.f20827n0 = 1;
            if (this.f20806S || this.f20808U) {
                this.f20828o0 = 3;
                return false;
            }
            this.f20828o0 = 2;
            return true;
        }
        m28200D0();
        throw null;
    }

    /* renamed from: P */
    private final void m28202P() {
        this.f20824k0 = false;
        this.f20841w.mo16814b();
        this.f20839v.mo16814b();
        this.f20823j0 = false;
        this.f20822i0 = false;
    }

    /* renamed from: Q */
    private final void mo16524Q() throws ji3 {
        if (this.f20829p0) {
            this.f20827n0 = 1;
            this.f20828o0 = 3;
            return;
        }
        mo19880t0();
        mo19879r0();
    }

    /* renamed from: a0 */
    private final boolean m28204a0() throws ji3 {
        k04 k04 = this.f20796I;
        if (k04 == null || this.f20827n0 == 2 || this.f20838u0) {
            return false;
        }
        if (this.f20817d0 < 0) {
            int zza = k04.zza();
            this.f20817d0 = zza;
            if (zza < 0) {
                return false;
            }
            this.f20837u.f18743c = this.f20796I.mo17806z(zza);
            this.f20837u.mo16814b();
        }
        if (this.f20827n0 == 1) {
            if (!this.f20814a0) {
                this.f20830q0 = true;
                this.f20796I.mo17795a(this.f20817d0, 0, 0, 0, 4);
                m28198B0();
            }
            this.f20827n0 = 2;
            return false;
        } else if (this.f20812Y) {
            this.f20812Y = false;
            this.f20837u.f18743c.put(f20784D0);
            this.f20796I.mo17795a(this.f20817d0, 0, 38, 0, 0);
            m28198B0();
            this.f20829p0 = true;
            return true;
        } else {
            if (this.f20826m0 == 1) {
                for (int i = 0; i < this.f20797J.f25135n.size(); i++) {
                    this.f20837u.f18743c.put(this.f20797J.f25135n.get(i));
                }
                this.f20826m0 = 2;
            }
            int position = this.f20837u.f18743c.position();
            qt3 y = mo16575y();
            try {
                int t = mo16570t(y, this.f20837u, 0);
                if (mo16573w()) {
                    this.f20836t0 = this.f20834s0;
                }
                if (t == -3) {
                    return false;
                }
                if (t == -5) {
                    if (this.f20826m0 == 2) {
                        this.f20837u.mo16814b();
                        this.f20826m0 = 1;
                    }
                    mo16521O(y);
                    return true;
                } else if (this.f20837u.mo17033g()) {
                    if (this.f20826m0 == 2) {
                        this.f20837u.mo16814b();
                        this.f20826m0 = 1;
                    }
                    this.f20838u0 = true;
                    if (!this.f20829p0) {
                        m28197A0();
                        return false;
                    }
                    try {
                        if (!this.f20814a0) {
                            this.f20830q0 = true;
                            this.f20796I.mo17795a(this.f20817d0, 0, 0, 0, 4);
                            m28198B0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo16571u(e, this.f20791D, false, bw3.m21568b(e.getErrorCode()));
                    }
                } else if (this.f20829p0 || this.f20837u.mo17034h()) {
                    boolean k = this.f20837u.mo18798k();
                    if (k) {
                        this.f20837u.f18742b.mo17791b(position);
                    }
                    if (this.f20805R && !k) {
                        ByteBuffer byteBuffer = this.f20837u.f18743c;
                        byte[] bArr = df2.f15600a;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (b == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b = 1;
                                }
                            } else if (b == 0) {
                                i3++;
                            }
                            if (b != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.f20837u.f18743c.position() == 0) {
                            return true;
                        }
                        this.f20805R = false;
                    }
                    k31 k31 = this.f20837u;
                    long j = k31.f18745e;
                    f04 f04 = this.f20815b0;
                    if (f04 != null) {
                        j = f04.mo17451b(this.f20791D, k31);
                        this.f20834s0 = Math.max(this.f20834s0, this.f20815b0.mo17450a(this.f20791D));
                    }
                    long j2 = j;
                    if (this.f20837u.mo17032f()) {
                        this.f20845y.add(Long.valueOf(j2));
                    }
                    if (this.f20842w0) {
                        this.f20843x.mo20966d(j2, this.f20791D);
                        this.f20842w0 = false;
                    }
                    this.f20834s0 = Math.max(this.f20834s0, j2);
                    this.f20837u.mo18797j();
                    if (this.f20837u.mo17031e()) {
                        mo16539q0(this.f20837u);
                    }
                    mo16535h0(this.f20837u);
                    if (k) {
                        try {
                            this.f20796I.mo17798d(this.f20817d0, 0, this.f20837u.f18742b, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo16571u(e2, this.f20791D, false, bw3.m21568b(e2.getErrorCode()));
                        }
                    } else {
                        this.f20796I.mo17795a(this.f20817d0, 0, this.f20837u.f18743c.limit(), j2, 0);
                    }
                    m28198B0();
                    this.f20829p0 = true;
                    this.f20826m0 = 0;
                    this.f20844x0.f15557c++;
                    return true;
                } else {
                    this.f20837u.mo16814b();
                    if (this.f20826m0 == 2) {
                        this.f20826m0 = 1;
                    }
                    return true;
                }
            } catch (i21 e3) {
                mo16529W(e3);
                m28206c0(0);
                mo22450f0();
                return true;
            }
        }
    }

    /* renamed from: b0 */
    private final boolean m28205b0() {
        return this.f20818e0 >= 0;
    }

    /* renamed from: c0 */
    private final boolean m28206c0(int i) throws ji3 {
        qt3 y = mo16575y();
        this.f20835t.mo16814b();
        int t = mo16570t(y, this.f20835t, i | 4);
        if (t == -5) {
            mo16521O(y);
            return true;
        } else if (t != -4 || !this.f20835t.mo17033g()) {
            return false;
        } else {
            this.f20838u0 = true;
            m28197A0();
            return false;
        }
    }

    /* renamed from: d0 */
    private final boolean m28207d0(long j) {
        return this.f20793F == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f20793F;
    }

    /* renamed from: e0 */
    private final boolean m28208e0(C5689w wVar) throws ji3 {
        if (!(wy2.f25579a < 23 || this.f20796I == null || this.f20828o0 == 3 || mo16567p() == 0)) {
            float L = mo16517L(this.f20795H, wVar, mo16569r());
            float f = this.f20800M;
            if (f == L) {
                return true;
            }
            if (L == -1.0f) {
                mo16524Q();
                return false;
            } else if (f == -1.0f && L <= this.f20833s) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", L);
                this.f20796I.mo17794N(bundle);
                this.f20800M = L;
            }
        }
        return true;
    }

    /* renamed from: f0 */
    private final void mo22450f0() {
        try {
            this.f20796I.mo17801g();
        } finally {
            mo16541u0();
        }
    }

    /* renamed from: z0 */
    protected static boolean m28210z0(C5689w wVar) {
        return wVar.f25120E == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo16485A() {
        this.f20791D = null;
        this.f20846y0 = -9223372036854775807L;
        this.f20848z0 = -9223372036854775807L;
        this.f20786A0 = 0;
        mo19883x0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo16513D(boolean z, boolean z2) throws ji3 {
        this.f20844x0 = new da3();
    }

    /* renamed from: E */
    public boolean mo16486E() {
        return this.f20840v0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo16487G(long j, boolean z) throws ji3 {
        this.f20838u0 = false;
        this.f20840v0 = false;
        if (this.f20822i0) {
            this.f20841w.mo16814b();
            this.f20839v.mo16814b();
            this.f20823j0 = false;
        } else {
            mo19882w0();
        }
        if (this.f20843x.mo20963a() > 0) {
            this.f20842w0 = true;
        }
        this.f20843x.mo20967e();
        int i = this.f20786A0;
        if (i != 0) {
            int i2 = i - 1;
            this.f20848z0 = this.f20787B[i2];
            this.f20846y0 = this.f20785A[i2];
            this.f20786A0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo16514H() {
        try {
            m28202P();
            mo19880t0();
        } finally {
            this.f20790C0 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo16488K(C5689w[] wVarArr, long j, long j2) throws ji3 {
        boolean z = true;
        if (this.f20848z0 == -9223372036854775807L) {
            if (this.f20846y0 != -9223372036854775807L) {
                z = false;
            }
            gs1.m24488f(z);
            this.f20846y0 = j;
            this.f20848z0 = j2;
            return;
        }
        int i = this.f20786A0;
        if (i == 10) {
            long j3 = this.f20787B[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.f20786A0 = i + 1;
        }
        long[] jArr = this.f20785A;
        int i2 = this.f20786A0 - 1;
        jArr[i2] = j;
        this.f20787B[i2] = j2;
        this.f20789C[i2] = this.f20834s0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract float mo16517L(float f, C5689w wVar, C5689w[] wVarArr);

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract int mo16518M(q04 q04, C5689w wVar) throws x04;

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract eb3 mo16519N(m04 m04, C5689w wVar, C5689w wVar2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (m28201E0() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (m28201E0() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        if (m28201E0() == false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0 A[RETURN] */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.eb3 mo16521O(com.google.android.gms.internal.ads.qt3 r13) throws com.google.android.gms.internal.ads.ji3 {
        /*
            r12 = this;
            r0 = 1
            r12.f20842w0 = r0
            com.google.android.gms.internal.ads.w r4 = r13.f22027a
            java.util.Objects.requireNonNull(r4)
            java.lang.String r1 = r4.f25133l
            r2 = 0
            if (r1 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.pz3 r13 = r13.f22028b
            r12.f20790C0 = r13
            r12.f20791D = r4
            boolean r1 = r12.f20822i0
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r12.f20824k0 = r0
            return r3
        L_0x001b:
            com.google.android.gms.internal.ads.k04 r1 = r12.f20796I
            if (r1 != 0) goto L_0x0025
            r12.f20801N = r3
            r12.mo19879r0()
            return r3
        L_0x0025:
            com.google.android.gms.internal.ads.m04 r3 = r12.f20803P
            com.google.android.gms.internal.ads.w r5 = r12.f20797J
            com.google.android.gms.internal.ads.pz3 r6 = r12.f20788B0
            r7 = 23
            if (r6 != r13) goto L_0x00d1
            if (r13 == r6) goto L_0x0038
            int r8 = com.google.android.gms.internal.ads.wy2.f25579a
            if (r8 < r7) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = 0
            goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            com.google.android.gms.internal.ads.gs1.m24488f(r7)
            com.google.android.gms.internal.ads.eb3 r7 = r12.mo16519N(r3, r5, r4)
            int r8 = r7.f15916d
            r9 = 3
            r10 = 16
            r11 = 2
            if (r8 == 0) goto L_0x00b4
            if (r8 == r0) goto L_0x008a
            if (r8 == r11) goto L_0x005e
            boolean r0 = r12.m28208e0(r4)
            if (r0 != 0) goto L_0x0053
            goto L_0x0090
        L_0x0053:
            r12.f20797J = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.m28201E0()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x005e:
            boolean r8 = r12.m28208e0(r4)
            if (r8 != 0) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            r12.f20825l0 = r0
            r12.f20826m0 = r0
            int r8 = r12.f20804Q
            if (r8 == r11) goto L_0x007d
            if (r8 != r0) goto L_0x007c
            int r8 = r4.f25138q
            int r10 = r5.f25138q
            if (r8 != r10) goto L_0x007c
            int r8 = r4.f25139r
            int r10 = r5.f25139r
            if (r8 != r10) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r12.f20812Y = r0
            r12.f20797J = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.m28201E0()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x008a:
            boolean r8 = r12.m28208e0(r4)
            if (r8 != 0) goto L_0x0093
        L_0x0090:
            r6 = 16
            goto L_0x00b8
        L_0x0093:
            r12.f20797J = r4
            if (r13 == r6) goto L_0x009f
            boolean r13 = r12.m28201E0()
            if (r13 != 0) goto L_0x00b7
        L_0x009d:
            r6 = 2
            goto L_0x00b8
        L_0x009f:
            boolean r13 = r12.f20829p0
            if (r13 == 0) goto L_0x00b7
            r12.f20827n0 = r0
            boolean r13 = r12.f20806S
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r12.f20808U
            if (r13 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r12.f20828o0 = r0
            goto L_0x00b7
        L_0x00b1:
            r12.f20828o0 = r9
            goto L_0x009d
        L_0x00b4:
            r12.mo16524Q()
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            int r13 = r7.f15916d
            if (r13 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.k04 r13 = r12.f20796I
            if (r13 != r1) goto L_0x00c4
            int r13 = r12.f20828o0
            if (r13 != r9) goto L_0x00d0
        L_0x00c4:
            com.google.android.gms.internal.ads.eb3 r13 = new com.google.android.gms.internal.ads.eb3
            java.lang.String r2 = r3.f19692a
            r0 = 0
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00d0:
            return r7
        L_0x00d1:
            if (r13 == 0) goto L_0x00e7
            if (r6 != 0) goto L_0x00d6
            goto L_0x00e7
        L_0x00d6:
            int r13 = com.google.android.gms.internal.ads.wy2.f25579a
            if (r13 < r7) goto L_0x00e7
            java.util.UUID r13 = com.google.android.gms.internal.ads.bw3.f14721b
            java.util.UUID r0 = com.google.android.gms.internal.ads.bw3.f14720a
            boolean r1 = r13.equals(r0)
            if (r1 != 0) goto L_0x00e7
            r13.equals(r0)
        L_0x00e7:
            r12.mo16524Q()
            com.google.android.gms.internal.ads.eb3 r13 = new com.google.android.gms.internal.ads.eb3
            java.lang.String r2 = r3.f19692a
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00f8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.ji3 r13 = r12.mo16571u(r13, r4, r2, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o04.mo16521O(com.google.android.gms.internal.ads.qt3):com.google.android.gms.internal.ads.eb3");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract i04 mo16526R(m04 m04, C5689w wVar, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public abstract List<m04> mo16528S(q04 q04, C5689w wVar, boolean z) throws x04;

    /* renamed from: U */
    public boolean mo16489U() {
        if (this.f20791D != null) {
            if (mo16568q() || m28205b0()) {
                return true;
            }
            if (this.f20816c0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f20816c0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public abstract void mo16529W(Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public abstract void mo16530X(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public abstract void mo16531Y(String str);

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public abstract void mo16532Z(C5689w wVar, MediaFormat mediaFormat) throws ji3;

    /* renamed from: e */
    public void mo16533e(float f, float f2) throws ji3 {
        this.f20794G = f;
        this.f20795H = f2;
        m28208e0(this.f20797J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public abstract void mo16534g0();

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public abstract void mo16535h0(k31 k31) throws ji3;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: com.google.android.gms.internal.ads.k04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: com.google.android.gms.internal.ads.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: com.google.android.gms.internal.ads.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: com.google.android.gms.internal.ads.o04} */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:84|85|(1:87)(0)|88|263|(1:198)|202|213|214) */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x026d, code lost:
        if (r15.f20792E != null) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b9, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        m28197A0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02bc, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02be, code lost:
        r1 = r1;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02c0, code lost:
        if (r15.f20840v0 != false) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02c2, code lost:
        mo19880t0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02c5, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x033a, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0154, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        m28197A0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0159, code lost:
        if (r15.f20840v0 != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015b, code lost:
        mo19880t0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015e, code lost:
        r2 = r9;
        r1 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x02b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0154 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b0 A[Catch:{ IllegalStateException -> 0x035f }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x031b A[Catch:{ IllegalStateException -> 0x035c }, LOOP:2: B:75:0x013d->B:196:0x031b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0325 A[Catch:{ IllegalStateException -> 0x035c }, LOOP:4: B:198:0x0325->B:201:0x032f, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x031a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0322 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016e A[Catch:{ IllegalStateException -> 0x035f }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16491i(long r24, long r26) throws com.google.android.gms.internal.ads.ji3 {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.f20840v0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x000c
            r23.mo19873i0()     // Catch:{ IllegalStateException -> 0x035f }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.w r0 = r15.f20791D     // Catch:{ IllegalStateException -> 0x035f }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.m28206c0(r11)     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.mo19879r0()     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r15.f20822i0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "bypassRender"
            com.google.android.gms.internal.ads.uw2.m32078a(r0)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0025:
            boolean r0 = r15.f20840v0     // Catch:{ IllegalStateException -> 0x035f }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.gs1.m24488f(r0)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo16819q()     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            java.nio.ByteBuffer r7 = r0.f18743c     // Catch:{ IllegalStateException -> 0x035f }
            int r8 = r15.f20818e0     // Catch:{ IllegalStateException -> 0x035f }
            int r10 = r0.mo16815m()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            long r11 = r0.f18745e     // Catch:{ IllegalStateException -> 0x035f }
            r6 = 0
            r9 = 0
            boolean r0 = r0.mo17032f()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.d04 r1 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            boolean r16 = r1.mo17033g()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.w r4 = r15.f20792E     // Catch:{ IllegalStateException -> 0x035f }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r0
            r14 = r16
            r15 = r17
            boolean r0 = r1.mo16536j0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0079 }
            if (r0 == 0) goto L_0x0073
            r15 = r23
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            long r0 = r0.mo16816n()     // Catch:{ IllegalStateException -> 0x035f }
            r15.mo16540s0(r0)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            r0.mo16814b()     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x007f
        L_0x0073:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x0127
        L_0x0079:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x02cb
        L_0x007f:
            boolean r0 = r15.f20838u0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0089
            r14 = 1
            r15.f20840v0 = r14     // Catch:{ IllegalStateException -> 0x035f }
            r13 = 0
            goto L_0x0127
        L_0x0089:
            r14 = 1
            boolean r0 = r15.f20823j0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.k31 r1 = r15.f20839v     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo16818p(r1)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.gs1.m24488f(r0)     // Catch:{ IllegalStateException -> 0x035f }
            r13 = 0
            r15.f20823j0 = r13     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x009e
        L_0x009d:
            r13 = 0
        L_0x009e:
            boolean r0 = r15.f20824k0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x00b6
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo16819q()     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x0025
            r23.m28202P()     // Catch:{ IllegalStateException -> 0x035f }
            r15.f20824k0 = r13     // Catch:{ IllegalStateException -> 0x035f }
            r23.mo19879r0()     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r15.f20822i0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0127
        L_0x00b6:
            boolean r0 = r15.f20838u0     // Catch:{ IllegalStateException -> 0x035f }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.gs1.m24488f(r0)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.qt3 r0 = r23.mo16575y()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.k31 r1 = r15.f20839v     // Catch:{ IllegalStateException -> 0x035f }
            r1.mo16814b()     // Catch:{ IllegalStateException -> 0x035f }
        L_0x00c5:
            com.google.android.gms.internal.ads.k31 r1 = r15.f20839v     // Catch:{ IllegalStateException -> 0x035f }
            r1.mo16814b()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.k31 r1 = r15.f20839v     // Catch:{ IllegalStateException -> 0x035f }
            int r1 = r15.mo16570t(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x035f }
            r2 = -5
            if (r1 == r2) goto L_0x0105
            r2 = -4
            if (r1 == r2) goto L_0x00d7
            goto L_0x0108
        L_0x00d7:
            com.google.android.gms.internal.ads.k31 r1 = r15.f20839v     // Catch:{ IllegalStateException -> 0x035f }
            boolean r1 = r1.mo17033g()     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x00e2
            r15.f20838u0 = r14     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x0108
        L_0x00e2:
            boolean r1 = r15.f20842w0     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x00f3
            com.google.android.gms.internal.ads.w r1 = r15.f20791D     // Catch:{ IllegalStateException -> 0x035f }
            java.util.Objects.requireNonNull(r1)
            r15.f20792E = r1     // Catch:{ IllegalStateException -> 0x035f }
            r2 = 0
            r15.mo16532Z(r1, r2)     // Catch:{ IllegalStateException -> 0x035f }
            r15.f20842w0 = r13     // Catch:{ IllegalStateException -> 0x035f }
        L_0x00f3:
            com.google.android.gms.internal.ads.k31 r1 = r15.f20839v     // Catch:{ IllegalStateException -> 0x035f }
            r1.mo18797j()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.d04 r1 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.k31 r2 = r15.f20839v     // Catch:{ IllegalStateException -> 0x035f }
            boolean r1 = r1.mo16818p(r2)     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 != 0) goto L_0x00c5
            r15.f20823j0 = r14     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x0108
        L_0x0105:
            r15.mo16521O(r0)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0108:
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo16819q()     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0115
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            r0.mo18797j()     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0115:
            com.google.android.gms.internal.ads.d04 r0 = r15.f20841w     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo16819q()     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x0025
            boolean r0 = r15.f20838u0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x0025
            boolean r0 = r15.f20824k0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0127
            goto L_0x0025
        L_0x0127:
            com.google.android.gms.internal.ads.uw2.m32079b()     // Catch:{ IllegalStateException -> 0x035f }
            r1 = r15
            r2 = 1
            r19 = 0
            goto L_0x0354
        L_0x0130:
            com.google.android.gms.internal.ads.k04 r0 = r15.f20796I     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0342
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x033d }
            java.lang.String r0 = "drainAndFeed"
            com.google.android.gms.internal.ads.uw2.m32078a(r0)     // Catch:{ IllegalStateException -> 0x033d }
        L_0x013d:
            boolean r0 = r23.m28205b0()     // Catch:{ IllegalStateException -> 0x033d }
            if (r0 != 0) goto L_0x0278
            boolean r0 = r15.f20809V     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0164
            boolean r0 = r15.f20830q0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0164
            com.google.android.gms.internal.ads.k04 r0 = r15.f20796I     // Catch:{ IllegalStateException -> 0x0154 }
            android.media.MediaCodec$BufferInfo r1 = r15.f20847z     // Catch:{ IllegalStateException -> 0x0154 }
            int r0 = r0.mo17802h(r1)     // Catch:{ IllegalStateException -> 0x0154 }
            goto L_0x016c
        L_0x0154:
            r23.m28197A0()     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r15.f20840v0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x015e
            r23.mo19880t0()     // Catch:{ IllegalStateException -> 0x035f }
        L_0x015e:
            r2 = r9
            r1 = r15
            r19 = 0
            goto L_0x0325
        L_0x0164:
            com.google.android.gms.internal.ads.k04 r0 = r15.f20796I     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaCodec$BufferInfo r1 = r15.f20847z     // Catch:{ IllegalStateException -> 0x035f }
            int r0 = r0.mo17802h(r1)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x016c:
            if (r0 >= 0) goto L_0x01b0
            r1 = -2
            if (r0 != r1) goto L_0x01a0
            r15.f20832r0 = r14     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.k04 r0 = r15.f20796I     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaFormat r0 = r0.mo17796b()     // Catch:{ IllegalStateException -> 0x035f }
            int r1 = r15.f20804Q     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x0192
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x035f }
            r2 = 32
            if (r1 != r2) goto L_0x0192
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 != r2) goto L_0x0192
            r15.f20813Z = r14     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x01bb
        L_0x0192:
            boolean r1 = r15.f20811X     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x019b
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x019b:
            r15.f20798K = r0     // Catch:{ IllegalStateException -> 0x035f }
            r15.f20799L = r14     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x01bb
        L_0x01a0:
            boolean r0 = r15.f20814a0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x015e
            boolean r0 = r15.f20838u0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x01ac
            int r0 = r15.f20827n0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != r11) goto L_0x015e
        L_0x01ac:
            r23.m28197A0()     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x015e
        L_0x01b0:
            boolean r1 = r15.f20813Z     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x01c3
            r15.f20813Z = r13     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.k04 r1 = r15.f20796I     // Catch:{ IllegalStateException -> 0x035f }
            r1.mo17800f(r0, r13)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x01bb:
            r2 = r9
            r1 = r15
            r16 = 2
            r19 = 0
            goto L_0x0314
        L_0x01c3:
            android.media.MediaCodec$BufferInfo r1 = r15.f20847z     // Catch:{ IllegalStateException -> 0x035f }
            int r2 = r1.size     // Catch:{ IllegalStateException -> 0x035f }
            if (r2 != 0) goto L_0x01d3
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x035f }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01d3
            r23.m28197A0()     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x015e
        L_0x01d3:
            r15.f20818e0 = r0     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.k04 r1 = r15.f20796I     // Catch:{ IllegalStateException -> 0x035f }
            java.nio.ByteBuffer r0 = r1.mo17805w(r0)     // Catch:{ IllegalStateException -> 0x035f }
            r15.f20819f0 = r0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x01f2
            android.media.MediaCodec$BufferInfo r1 = r15.f20847z     // Catch:{ IllegalStateException -> 0x035f }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x035f }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x035f }
            java.nio.ByteBuffer r0 = r15.f20819f0     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaCodec$BufferInfo r1 = r15.f20847z     // Catch:{ IllegalStateException -> 0x035f }
            int r2 = r1.offset     // Catch:{ IllegalStateException -> 0x035f }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x035f }
            int r2 = r2 + r1
            r0.limit(r2)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x01f2:
            boolean r0 = r15.f20810W     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0213
            android.media.MediaCodec$BufferInfo r0 = r15.f20847z     // Catch:{ IllegalStateException -> 0x035f }
            long r1 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x035f }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0213
            int r1 = r0.flags     // Catch:{ IllegalStateException -> 0x035f }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0213
            long r1 = r15.f20834s0     // Catch:{ IllegalStateException -> 0x035f }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0213
            r0.presentationTimeUs = r1     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0213:
            android.media.MediaCodec$BufferInfo r0 = r15.f20847z     // Catch:{ IllegalStateException -> 0x035f }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x035f }
            java.util.ArrayList<java.lang.Long> r2 = r15.f20845y     // Catch:{ IllegalStateException -> 0x035f }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x035f }
            r3 = 0
        L_0x021e:
            if (r3 >= r2) goto L_0x023a
            java.util.ArrayList<java.lang.Long> r4 = r15.f20845y     // Catch:{ IllegalStateException -> 0x035f }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x035f }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x035f }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x035f }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0237
            java.util.ArrayList<java.lang.Long> r0 = r15.f20845y     // Catch:{ IllegalStateException -> 0x035f }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x035f }
            r0 = 1
            goto L_0x023b
        L_0x0237:
            int r3 = r3 + 1
            goto L_0x021e
        L_0x023a:
            r0 = 0
        L_0x023b:
            r15.f20820g0 = r0     // Catch:{ IllegalStateException -> 0x035f }
            long r0 = r15.f20836t0     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaCodec$BufferInfo r2 = r15.f20847z     // Catch:{ IllegalStateException -> 0x035f }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x035f }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0249
            r0 = 1
            goto L_0x024a
        L_0x0249:
            r0 = 0
        L_0x024a:
            r15.f20821h0 = r0     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.su2<com.google.android.gms.internal.ads.w> r0 = r15.f20843x     // Catch:{ IllegalStateException -> 0x035f }
            java.lang.Object r0 = r0.mo20965c(r2)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.w r0 = (com.google.android.gms.internal.ads.C5689w) r0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x0262
            boolean r1 = r15.f20799L     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x0262
            com.google.android.gms.internal.ads.su2<com.google.android.gms.internal.ads.w> r0 = r15.f20843x     // Catch:{ IllegalStateException -> 0x035f }
            java.lang.Object r0 = r0.mo20964b()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.w r0 = (com.google.android.gms.internal.ads.C5689w) r0     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0262:
            if (r0 == 0) goto L_0x0267
            r15.f20792E = r0     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x026f
        L_0x0267:
            boolean r0 = r15.f20799L     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0278
            com.google.android.gms.internal.ads.w r0 = r15.f20792E     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0278
        L_0x026f:
            com.google.android.gms.internal.ads.w r0 = r15.f20792E     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaFormat r1 = r15.f20798K     // Catch:{ IllegalStateException -> 0x035f }
            r15.mo16532Z(r0, r1)     // Catch:{ IllegalStateException -> 0x035f }
            r15.f20799L = r13     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0278:
            boolean r0 = r15.f20809V     // Catch:{ IllegalStateException -> 0x033d }
            if (r0 == 0) goto L_0x02d4
            boolean r0 = r15.f20830q0     // Catch:{ IllegalStateException -> 0x02cf }
            if (r0 == 0) goto L_0x02d4
            com.google.android.gms.internal.ads.k04 r6 = r15.f20796I     // Catch:{ IllegalStateException -> 0x02b5 }
            java.nio.ByteBuffer r7 = r15.f20819f0     // Catch:{ IllegalStateException -> 0x02b5 }
            int r8 = r15.f20818e0     // Catch:{ IllegalStateException -> 0x02b5 }
            android.media.MediaCodec$BufferInfo r0 = r15.f20847z     // Catch:{ IllegalStateException -> 0x02b5 }
            int r12 = r0.flags     // Catch:{ IllegalStateException -> 0x02b5 }
            r16 = 1
            long r4 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02b5 }
            boolean r0 = r15.f20820g0     // Catch:{ IllegalStateException -> 0x02b5 }
            boolean r2 = r15.f20821h0     // Catch:{ IllegalStateException -> 0x02b5 }
            com.google.android.gms.internal.ads.w r3 = r15.f20792E     // Catch:{ IllegalStateException -> 0x02b5 }
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r12
            r10 = r16
            r16 = 2
            r11 = r19
            r19 = 0
            r13 = r0
            r14 = r17
            r15 = r18
            boolean r0 = r1.mo16536j0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02b9 }
            goto L_0x02f8
        L_0x02b5:
            r21 = r9
            r19 = 0
        L_0x02b9:
            r23.m28197A0()     // Catch:{ IllegalStateException -> 0x02c9 }
            r15 = r23
            boolean r0 = r15.f20840v0     // Catch:{ IllegalStateException -> 0x033a }
            if (r0 == 0) goto L_0x02c5
            r23.mo19880t0()     // Catch:{ IllegalStateException -> 0x033a }
        L_0x02c5:
            r1 = r15
        L_0x02c6:
            r2 = r21
            goto L_0x0325
        L_0x02c9:
            r0 = move-exception
            r2 = 1
        L_0x02cb:
            r1 = r23
            goto L_0x0364
        L_0x02cf:
            r0 = move-exception
            r19 = 0
            goto L_0x033b
        L_0x02d4:
            r21 = r9
            r16 = 2
            r19 = 0
            com.google.android.gms.internal.ads.k04 r6 = r15.f20796I     // Catch:{ IllegalStateException -> 0x033a }
            java.nio.ByteBuffer r7 = r15.f20819f0     // Catch:{ IllegalStateException -> 0x033a }
            int r8 = r15.f20818e0     // Catch:{ IllegalStateException -> 0x033a }
            android.media.MediaCodec$BufferInfo r0 = r15.f20847z     // Catch:{ IllegalStateException -> 0x033a }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x033a }
            r10 = 1
            long r11 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x033a }
            boolean r13 = r15.f20820g0     // Catch:{ IllegalStateException -> 0x033a }
            boolean r14 = r15.f20821h0     // Catch:{ IllegalStateException -> 0x033a }
            com.google.android.gms.internal.ads.w r0 = r15.f20792E     // Catch:{ IllegalStateException -> 0x033a }
            r1 = r23
            r2 = r24
            r4 = r26
            r15 = r0
            boolean r0 = r1.mo16536j0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0336 }
        L_0x02f8:
            if (r0 == 0) goto L_0x0322
            r1 = r23
            android.media.MediaCodec$BufferInfo r0 = r1.f20847z     // Catch:{ IllegalStateException -> 0x035c }
            long r2 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x035c }
            r1.mo16540s0(r2)     // Catch:{ IllegalStateException -> 0x035c }
            android.media.MediaCodec$BufferInfo r0 = r1.f20847z     // Catch:{ IllegalStateException -> 0x035c }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x035c }
            r23.m28199C0()     // Catch:{ IllegalStateException -> 0x035c }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0312
            r23.m28197A0()     // Catch:{ IllegalStateException -> 0x035c }
            goto L_0x02c6
        L_0x0312:
            r2 = r21
        L_0x0314:
            boolean r0 = r1.m28207d0(r2)     // Catch:{ IllegalStateException -> 0x035c }
            if (r0 != 0) goto L_0x031b
            goto L_0x0325
        L_0x031b:
            r15 = r1
            r9 = r2
            r11 = 2
            r13 = 0
            r14 = 1
            goto L_0x013d
        L_0x0322:
            r1 = r23
            goto L_0x02c6
        L_0x0325:
            boolean r0 = r23.m28204a0()     // Catch:{ IllegalStateException -> 0x035c }
            if (r0 == 0) goto L_0x0331
            boolean r0 = r1.m28207d0(r2)     // Catch:{ IllegalStateException -> 0x035c }
            if (r0 != 0) goto L_0x0325
        L_0x0331:
            com.google.android.gms.internal.ads.uw2.m32079b()     // Catch:{ IllegalStateException -> 0x035c }
            r2 = 1
            goto L_0x0354
        L_0x0336:
            r0 = move-exception
            r1 = r23
            goto L_0x035d
        L_0x033a:
            r0 = move-exception
        L_0x033b:
            r1 = r15
            goto L_0x035d
        L_0x033d:
            r0 = move-exception
            r1 = r15
            r19 = 0
            goto L_0x035d
        L_0x0342:
            r1 = r15
            r19 = 0
            com.google.android.gms.internal.ads.da3 r0 = r1.f20844x0     // Catch:{ IllegalStateException -> 0x035c }
            int r2 = r0.f15558d     // Catch:{ IllegalStateException -> 0x035c }
            int r3 = r23.mo16572v(r24)     // Catch:{ IllegalStateException -> 0x035c }
            int r2 = r2 + r3
            r0.f15558d = r2     // Catch:{ IllegalStateException -> 0x035c }
            r2 = 1
            r1.m28206c0(r2)     // Catch:{ IllegalStateException -> 0x035a }
        L_0x0354:
            com.google.android.gms.internal.ads.da3 r0 = r1.f20844x0     // Catch:{ IllegalStateException -> 0x035a }
            r0.mo16884a()     // Catch:{ IllegalStateException -> 0x035a }
            return
        L_0x035a:
            r0 = move-exception
            goto L_0x0364
        L_0x035c:
            r0 = move-exception
        L_0x035d:
            r2 = 1
            goto L_0x0364
        L_0x035f:
            r0 = move-exception
            r1 = r15
            r2 = 1
            r19 = 0
        L_0x0364:
            int r3 = com.google.android.gms.internal.ads.wy2.f25579a
            r4 = 21
            if (r3 < r4) goto L_0x036f
            boolean r5 = r0 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x036f
            goto L_0x0384
        L_0x036f:
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r6 = r5.length
            if (r6 <= 0) goto L_0x03ad
            r5 = r5[r19]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "android.media.MediaCodec"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x03ad
        L_0x0384:
            r1.mo16529W(r0)
            if (r3 < r4) goto L_0x0398
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x0398
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x0398
            r14 = 1
            goto L_0x0399
        L_0x0398:
            r14 = 0
        L_0x0399:
            if (r14 == 0) goto L_0x039e
            r23.mo19880t0()
        L_0x039e:
            com.google.android.gms.internal.ads.m04 r2 = r1.f20803P
            com.google.android.gms.internal.ads.l04 r0 = r1.mo16538o0(r0, r2)
            com.google.android.gms.internal.ads.w r2 = r1.f20791D
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.ji3 r0 = r1.mo16571u(r0, r2, r14, r3)
            throw r0
        L_0x03ad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o04.mo16491i(long, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo19873i0() throws ji3 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public abstract boolean mo16536j0(long j, long j2, k04 k04, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C5689w wVar) throws ji3;

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public boolean mo19874k0(C5689w wVar) {
        return false;
    }

    /* renamed from: l */
    public final int mo16492l(C5689w wVar) throws ji3 {
        try {
            return mo16518M(this.f20831r, wVar);
        } catch (x04 e) {
            throw mo16571u(e, wVar, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final float mo19875l0() {
        return this.f20794G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final long mo19876m0() {
        return this.f20848z0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final k04 mo19877n0() {
        return this.f20796I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public l04 mo16538o0(Throwable th, m04 m04) {
        return new l04(th, m04);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final m04 mo19878p0() {
        return this.f20803P;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo16539q0(k31 k31) throws ji3 {
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.view.Surface, com.google.android.gms.internal.ads.e14, android.media.MediaCrypto] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0202 A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0204 A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0233 A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x024b A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x024d A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0252 A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x025f A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x028f A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0291 A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02ef A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02f1 A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02fa A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x033b A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x033c A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x034e A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x035c A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x037f A[Catch:{ Exception -> 0x0383, x04 -> 0x0090, n04 -> 0x03db }] */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19879r0() throws com.google.android.gms.internal.ads.ji3 {
        /*
            r17 = this;
            r7 = r17
            com.google.android.gms.internal.ads.k04 r0 = r7.f20796I
            if (r0 != 0) goto L_0x03e6
            boolean r0 = r7.f20822i0
            if (r0 != 0) goto L_0x03e6
            com.google.android.gms.internal.ads.w r0 = r7.f20791D
            if (r0 != 0) goto L_0x0010
            goto L_0x03e6
        L_0x0010:
            com.google.android.gms.internal.ads.pz3 r1 = r7.f20790C0
            r8 = 1
            if (r1 != 0) goto L_0x004a
            boolean r0 = r7.mo19874k0(r0)
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.w r0 = r7.f20791D
            r17.m28202P()
            java.lang.String r0 = r0.f25133l
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0040
            com.google.android.gms.internal.ads.d04 r0 = r7.f20841w
            r0.mo16817o(r8)
            goto L_0x0047
        L_0x0040:
            com.google.android.gms.internal.ads.d04 r0 = r7.f20841w
            r1 = 32
            r0.mo16817o(r1)
        L_0x0047:
            r7.f20822i0 = r8
            return
        L_0x004a:
            com.google.android.gms.internal.ads.pz3 r0 = r7.f20790C0
            r7.f20788B0 = r0
            com.google.android.gms.internal.ads.w r1 = r7.f20791D
            java.lang.String r2 = r1.f25133l
            r9 = 0
            if (r0 == 0) goto L_0x0067
            boolean r2 = com.google.android.gms.internal.ads.qz3.f22688a
            if (r2 != 0) goto L_0x005a
            goto L_0x0067
        L_0x005a:
            com.google.android.gms.internal.ads.gz3 r0 = r0.mo20353a()
            com.google.android.gms.internal.ads.w r1 = r7.f20791D
            int r2 = r0.zza
            com.google.android.gms.internal.ads.ji3 r0 = r7.mo16571u(r0, r1, r9, r2)
            throw r0
        L_0x0067:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.m04> r0 = r7.f20801N     // Catch:{ n04 -> 0x03db }
            r10 = 0
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.q04 r0 = r7.f20831r     // Catch:{ x04 -> 0x0090 }
            java.util.List r0 = r7.mo16528S(r0, r1, r9)     // Catch:{ x04 -> 0x0090 }
            r0.isEmpty()     // Catch:{ x04 -> 0x0090 }
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ x04 -> 0x0090 }
            r1.<init>()     // Catch:{ x04 -> 0x0090 }
            r7.f20801N = r1     // Catch:{ x04 -> 0x0090 }
            boolean r1 = r0.isEmpty()     // Catch:{ x04 -> 0x0090 }
            if (r1 != 0) goto L_0x008d
            java.util.ArrayDeque<com.google.android.gms.internal.ads.m04> r1 = r7.f20801N     // Catch:{ x04 -> 0x0090 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ x04 -> 0x0090 }
            com.google.android.gms.internal.ads.m04 r0 = (com.google.android.gms.internal.ads.m04) r0     // Catch:{ x04 -> 0x0090 }
            r1.add(r0)     // Catch:{ x04 -> 0x0090 }
        L_0x008d:
            r7.f20802O = r10     // Catch:{ x04 -> 0x0090 }
            goto L_0x009c
        L_0x0090:
            r0 = move-exception
            com.google.android.gms.internal.ads.n04 r1 = new com.google.android.gms.internal.ads.n04     // Catch:{ n04 -> 0x03db }
            com.google.android.gms.internal.ads.w r2 = r7.f20791D     // Catch:{ n04 -> 0x03db }
            r3 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.C5689w) r2, (java.lang.Throwable) r0, (boolean) r9, (int) r3)     // Catch:{ n04 -> 0x03db }
            throw r1     // Catch:{ n04 -> 0x03db }
        L_0x009c:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.m04> r0 = r7.f20801N     // Catch:{ n04 -> 0x03db }
            boolean r0 = r0.isEmpty()     // Catch:{ n04 -> 0x03db }
            if (r0 != 0) goto L_0x03ce
        L_0x00a4:
            com.google.android.gms.internal.ads.k04 r0 = r7.f20796I     // Catch:{ n04 -> 0x03db }
            if (r0 != 0) goto L_0x03ca
            java.util.ArrayDeque<com.google.android.gms.internal.ads.m04> r0 = r7.f20801N     // Catch:{ n04 -> 0x03db }
            java.lang.Object r0 = r0.peekFirst()     // Catch:{ n04 -> 0x03db }
            r11 = r0
            com.google.android.gms.internal.ads.m04 r11 = (com.google.android.gms.internal.ads.m04) r11     // Catch:{ n04 -> 0x03db }
            boolean r0 = r7.mo16542y0(r11)     // Catch:{ n04 -> 0x03db }
            if (r0 != 0) goto L_0x00b8
            return
        L_0x00b8:
            java.lang.String r2 = r11.f19692a     // Catch:{ Exception -> 0x0383 }
            int r0 = com.google.android.gms.internal.ads.wy2.f25579a     // Catch:{ Exception -> 0x0383 }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 23
            if (r0 >= r3) goto L_0x00c5
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00d1
        L_0x00c5:
            float r4 = r7.f20795H     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.w r5 = r7.f20791D     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.w[] r6 = r17.mo16569r()     // Catch:{ Exception -> 0x0383 }
            float r4 = r7.mo16517L(r4, r5, r6)     // Catch:{ Exception -> 0x0383 }
        L_0x00d1:
            float r5 = r7.f20833s     // Catch:{ Exception -> 0x0383 }
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r1 = r4
        L_0x00d9:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0383 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0383 }
            int r12 = r6.length()     // Catch:{ Exception -> 0x0383 }
            java.lang.String r13 = "createCodec:"
            if (r12 == 0) goto L_0x00ee
            java.lang.String r6 = r13.concat(r6)     // Catch:{ Exception -> 0x0383 }
            goto L_0x00f3
        L_0x00ee:
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0383 }
            r6.<init>(r13)     // Catch:{ Exception -> 0x0383 }
        L_0x00f3:
            com.google.android.gms.internal.ads.uw2.m32078a(r6)     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.w r6 = r7.f20791D     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.i04 r6 = r7.mo16526R(r11, r6, r10, r1)     // Catch:{ Exception -> 0x0383 }
            r12 = 31
            if (r0 < r12) goto L_0x012e
            com.google.android.gms.internal.ads.w r12 = r6.f17840c     // Catch:{ Exception -> 0x0383 }
            java.lang.String r12 = r12.f25133l     // Catch:{ Exception -> 0x0383 }
            int r12 = com.google.android.gms.internal.ads.C5463pw.m29197a(r12)     // Catch:{ Exception -> 0x0383 }
            java.lang.String r13 = "DefaultMediaCodecAdapterFactory"
            java.lang.String r14 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r15 = com.google.android.gms.internal.ads.wy2.m33447j(r12)     // Catch:{ Exception -> 0x0383 }
            int r16 = r15.length()     // Catch:{ Exception -> 0x0383 }
            if (r16 == 0) goto L_0x011b
            java.lang.String r14 = r14.concat(r15)     // Catch:{ Exception -> 0x0383 }
            goto L_0x0121
        L_0x011b:
            java.lang.String r15 = new java.lang.String     // Catch:{ Exception -> 0x0383 }
            r15.<init>(r14)     // Catch:{ Exception -> 0x0383 }
            r14 = r15
        L_0x0121:
            android.util.Log.i(r13, r14)     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.vz3 r13 = new com.google.android.gms.internal.ads.vz3     // Catch:{ Exception -> 0x0383 }
            r13.<init>(r12, r9)     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.xz3 r6 = r13.mo21655c(r6)     // Catch:{ Exception -> 0x0383 }
            goto L_0x0173
        L_0x012e:
            com.google.android.gms.internal.ads.m04 r12 = r6.f17838a     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            java.util.Objects.requireNonNull(r12)
            java.lang.String r12 = r12.f19692a     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            int r15 = r14.length()     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            if (r15 == 0) goto L_0x0144
            java.lang.String r13 = r13.concat(r14)     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            goto L_0x014a
        L_0x0144:
            java.lang.String r14 = new java.lang.String     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            r14.<init>(r13)     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            r13 = r14
        L_0x014a:
            com.google.android.gms.internal.ads.uw2.m32078a(r13)     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            android.media.MediaCodec r12 = android.media.MediaCodec.createByCodecName(r12)     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            com.google.android.gms.internal.ads.uw2.m32079b()     // Catch:{ IOException -> 0x037b, RuntimeException -> 0x0379 }
            java.lang.String r13 = "configureCodec"
            com.google.android.gms.internal.ads.uw2.m32078a(r13)     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
            android.media.MediaFormat r13 = r6.f17839b     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
            android.view.Surface r6 = r6.f17841d     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
            r12.configure(r13, r6, r10, r9)     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
            com.google.android.gms.internal.ads.uw2.m32079b()     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
            java.lang.String r6 = "startCodec"
            com.google.android.gms.internal.ads.uw2.m32078a(r6)     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
            r12.start()     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
            com.google.android.gms.internal.ads.uw2.m32079b()     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
            com.google.android.gms.internal.ads.g14 r6 = new com.google.android.gms.internal.ads.g14     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
            r6.<init>(r12, r10, r10)     // Catch:{ IOException -> 0x0377, RuntimeException -> 0x0375 }
        L_0x0173:
            r7.f20796I = r6     // Catch:{ Exception -> 0x0383 }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0383 }
            r7.f20803P = r11     // Catch:{ Exception -> 0x0383 }
            r7.f20800M = r1     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.w r1 = r7.f20791D     // Catch:{ Exception -> 0x0383 }
            r7.f20797J = r1     // Catch:{ Exception -> 0x0383 }
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r6 = 25
            if (r0 > r6) goto L_0x01b1
            boolean r15 = r1.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r15 == 0) goto L_0x01b1
            java.lang.String r15 = com.google.android.gms.internal.ads.wy2.f25582d     // Catch:{ Exception -> 0x0383 }
            java.lang.String r10 = "SM-T585"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0383 }
            if (r10 != 0) goto L_0x01af
            java.lang.String r10 = "SM-A510"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0383 }
            if (r10 != 0) goto L_0x01af
            java.lang.String r10 = "SM-A520"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0383 }
            if (r10 != 0) goto L_0x01af
            java.lang.String r10 = "SM-J700"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0383 }
            if (r10 == 0) goto L_0x01b1
        L_0x01af:
            r10 = 2
            goto L_0x01ea
        L_0x01b1:
            r10 = 24
            if (r0 >= r10) goto L_0x01e9
            java.lang.String r10 = "OMX.Nvidia.h264.decode"
            boolean r10 = r10.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r10 != 0) goto L_0x01c5
            java.lang.String r10 = "OMX.Nvidia.h264.decode.secure"
            boolean r10 = r10.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r10 == 0) goto L_0x01e9
        L_0x01c5:
            java.lang.String r10 = "flounder"
            java.lang.String r15 = com.google.android.gms.internal.ads.wy2.f25580b     // Catch:{ Exception -> 0x0383 }
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0383 }
            if (r10 != 0) goto L_0x01e7
            java.lang.String r10 = "flounder_lte"
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0383 }
            if (r10 != 0) goto L_0x01e7
            java.lang.String r10 = "grouper"
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0383 }
            if (r10 != 0) goto L_0x01e7
            java.lang.String r10 = "tilapia"
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0383 }
            if (r10 == 0) goto L_0x01e9
        L_0x01e7:
            r10 = 1
            goto L_0x01ea
        L_0x01e9:
            r10 = 0
        L_0x01ea:
            r7.f20804Q = r10     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.w r10 = r7.f20797J     // Catch:{ Exception -> 0x0383 }
            r15 = 21
            if (r0 >= r15) goto L_0x0204
            java.util.List<byte[]> r10 = r10.f25135n     // Catch:{ Exception -> 0x0383 }
            boolean r10 = r10.isEmpty()     // Catch:{ Exception -> 0x0383 }
            if (r10 == 0) goto L_0x0204
            java.lang.String r10 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r10 = r10.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r10 == 0) goto L_0x0204
            r10 = 1
            goto L_0x0205
        L_0x0204:
            r10 = 0
        L_0x0205:
            r7.f20805R = r10     // Catch:{ Exception -> 0x0383 }
            r10 = 19
            r9 = 18
            if (r0 < r9) goto L_0x023c
            if (r0 != r9) goto L_0x021f
            java.lang.String r14 = "OMX.SEC.avc.dec"
            boolean r14 = r14.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r14 != 0) goto L_0x023c
            java.lang.String r14 = "OMX.SEC.avc.dec.secure"
            boolean r14 = r14.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r14 != 0) goto L_0x023c
        L_0x021f:
            if (r0 != r10) goto L_0x023a
            java.lang.String r14 = com.google.android.gms.internal.ads.wy2.f25582d     // Catch:{ Exception -> 0x0383 }
            java.lang.String r6 = "SM-G800"
            boolean r6 = r14.startsWith(r6)     // Catch:{ Exception -> 0x0383 }
            if (r6 == 0) goto L_0x023a
            java.lang.String r6 = "OMX.Exynos.avc.dec"
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r6 != 0) goto L_0x023c
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r1 == 0) goto L_0x023a
            goto L_0x023c
        L_0x023a:
            r1 = 0
            goto L_0x023d
        L_0x023c:
            r1 = 1
        L_0x023d:
            r7.f20806S = r1     // Catch:{ Exception -> 0x0383 }
            r1 = 29
            if (r0 != r1) goto L_0x024d
            java.lang.String r6 = "c2.android.aac.decoder"
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r6 == 0) goto L_0x024d
            r6 = 1
            goto L_0x024e
        L_0x024d:
            r6 = 0
        L_0x024e:
            r7.f20807T = r6     // Catch:{ Exception -> 0x0383 }
            if (r0 > r3) goto L_0x025d
            java.lang.String r3 = "OMX.google.vorbis.decoder"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r3 != 0) goto L_0x025b
            goto L_0x025d
        L_0x025b:
            r3 = 1
            goto L_0x0283
        L_0x025d:
            if (r0 > r10) goto L_0x0282
            java.lang.String r3 = "hb2000"
            java.lang.String r6 = com.google.android.gms.internal.ads.wy2.f25580b     // Catch:{ Exception -> 0x0383 }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0383 }
            if (r3 != 0) goto L_0x0271
            java.lang.String r3 = "stvm8"
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0383 }
            if (r3 == 0) goto L_0x0282
        L_0x0271:
            java.lang.String r3 = "OMX.amlogic.avc.decoder.awesome"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r3 != 0) goto L_0x025b
            java.lang.String r3 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r3 == 0) goto L_0x0282
            goto L_0x025b
        L_0x0282:
            r3 = 0
        L_0x0283:
            r7.f20808U = r3     // Catch:{ Exception -> 0x0383 }
            if (r0 != r15) goto L_0x0291
            java.lang.String r3 = "OMX.google.aac.decoder"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r3 == 0) goto L_0x0291
            r3 = 1
            goto L_0x0292
        L_0x0291:
            r3 = 0
        L_0x0292:
            r7.f20809V = r3     // Catch:{ Exception -> 0x0383 }
            if (r0 >= r15) goto L_0x02dc
            java.lang.String r3 = "OMX.SEC.mp3.dec"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r3 == 0) goto L_0x02dc
            java.lang.String r3 = "samsung"
            java.lang.String r6 = com.google.android.gms.internal.ads.wy2.f25581c     // Catch:{ Exception -> 0x0383 }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0383 }
            if (r3 == 0) goto L_0x02dc
            java.lang.String r3 = com.google.android.gms.internal.ads.wy2.f25580b     // Catch:{ Exception -> 0x0383 }
            java.lang.String r6 = "baffin"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0383 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "grand"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0383 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "fortuna"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0383 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "gprimelte"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0383 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "j2y18lte"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0383 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "ms01"
            boolean r3 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0383 }
            if (r3 == 0) goto L_0x02dc
        L_0x02da:
            r3 = 1
            goto L_0x02dd
        L_0x02dc:
            r3 = 0
        L_0x02dd:
            r7.f20810W = r3     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.w r3 = r7.f20797J     // Catch:{ Exception -> 0x0383 }
            if (r0 > r9) goto L_0x02f1
            int r3 = r3.f25146y     // Catch:{ Exception -> 0x0383 }
            if (r3 != r8) goto L_0x02f1
            java.lang.String r3 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0383 }
            if (r3 == 0) goto L_0x02f1
            r3 = 1
            goto L_0x02f2
        L_0x02f1:
            r3 = 0
        L_0x02f2:
            r7.f20811X = r3     // Catch:{ Exception -> 0x0383 }
            java.lang.String r3 = r11.f19692a     // Catch:{ Exception -> 0x0383 }
            r6 = 25
            if (r0 > r6) goto L_0x0305
            java.lang.String r6 = "OMX.rk.video_decoder.avc"
            boolean r6 = r6.equals(r3)     // Catch:{ Exception -> 0x0383 }
            if (r6 != 0) goto L_0x0303
            goto L_0x0305
        L_0x0303:
            r0 = 1
            goto L_0x033d
        L_0x0305:
            r6 = 17
            if (r0 > r6) goto L_0x0311
            java.lang.String r6 = "OMX.allwinner.video.decoder.avc"
            boolean r6 = r6.equals(r3)     // Catch:{ Exception -> 0x0383 }
            if (r6 != 0) goto L_0x0303
        L_0x0311:
            if (r0 > r1) goto L_0x0323
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0383 }
            if (r0 != 0) goto L_0x0303
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0383 }
            if (r0 != 0) goto L_0x0303
        L_0x0323:
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = com.google.android.gms.internal.ads.wy2.f25581c     // Catch:{ Exception -> 0x0383 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0383 }
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = "AFTS"
            java.lang.String r1 = com.google.android.gms.internal.ads.wy2.f25582d     // Catch:{ Exception -> 0x0383 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0383 }
            if (r0 == 0) goto L_0x033c
            boolean r0 = r11.f19697f     // Catch:{ Exception -> 0x0383 }
            if (r0 == 0) goto L_0x033c
            goto L_0x0303
        L_0x033c:
            r0 = 0
        L_0x033d:
            r7.f20814a0 = r0     // Catch:{ Exception -> 0x0383 }
            com.google.android.gms.internal.ads.k04 r0 = r7.f20796I     // Catch:{ Exception -> 0x0383 }
            r0.zzr()     // Catch:{ Exception -> 0x0383 }
            java.lang.String r0 = "c2.android.mp3.decoder"
            java.lang.String r1 = r11.f19692a     // Catch:{ Exception -> 0x0383 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0383 }
            if (r0 == 0) goto L_0x0355
            com.google.android.gms.internal.ads.f04 r0 = new com.google.android.gms.internal.ads.f04     // Catch:{ Exception -> 0x0383 }
            r0.<init>()     // Catch:{ Exception -> 0x0383 }
            r7.f20815b0 = r0     // Catch:{ Exception -> 0x0383 }
        L_0x0355:
            int r0 = r17.mo16567p()     // Catch:{ Exception -> 0x0383 }
            r1 = 2
            if (r0 != r1) goto L_0x0365
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0383 }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r9
            r7.f20816c0 = r0     // Catch:{ Exception -> 0x0383 }
        L_0x0365:
            com.google.android.gms.internal.ads.da3 r0 = r7.f20844x0     // Catch:{ Exception -> 0x0383 }
            int r1 = r0.f15555a     // Catch:{ Exception -> 0x0383 }
            int r1 = r1 + r8
            r0.f15555a = r1     // Catch:{ Exception -> 0x0383 }
            long r5 = r12 - r4
            r1 = r17
            r3 = r12
            r1.mo16530X(r2, r3, r5)     // Catch:{ Exception -> 0x0383 }
            goto L_0x03c3
        L_0x0375:
            r0 = move-exception
            goto L_0x037d
        L_0x0377:
            r0 = move-exception
            goto L_0x037d
        L_0x0379:
            r0 = move-exception
            goto L_0x037c
        L_0x037b:
            r0 = move-exception
        L_0x037c:
            r12 = 0
        L_0x037d:
            if (r12 == 0) goto L_0x0382
            r12.release()     // Catch:{ Exception -> 0x0383 }
        L_0x0382:
            throw r0     // Catch:{ Exception -> 0x0383 }
        L_0x0383:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ n04 -> 0x03db }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ n04 -> 0x03db }
            r2.length()     // Catch:{ n04 -> 0x03db }
            java.lang.String r2 = "MediaCodecRenderer"
            java.lang.String r3 = "Failed to initialize decoder: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ n04 -> 0x03db }
            java.lang.String r1 = r3.concat(r1)     // Catch:{ n04 -> 0x03db }
            com.google.android.gms.internal.ads.y92.m34068b(r2, r1, r0)     // Catch:{ n04 -> 0x03db }
            java.util.ArrayDeque<com.google.android.gms.internal.ads.m04> r1 = r7.f20801N     // Catch:{ n04 -> 0x03db }
            r1.removeFirst()     // Catch:{ n04 -> 0x03db }
            com.google.android.gms.internal.ads.n04 r1 = new com.google.android.gms.internal.ads.n04     // Catch:{ n04 -> 0x03db }
            com.google.android.gms.internal.ads.w r2 = r7.f20791D     // Catch:{ n04 -> 0x03db }
            r3 = 0
            r1.<init>((com.google.android.gms.internal.ads.C5689w) r2, (java.lang.Throwable) r0, (boolean) r3, (com.google.android.gms.internal.ads.m04) r11)     // Catch:{ n04 -> 0x03db }
            r7.mo16529W(r1)     // Catch:{ n04 -> 0x03db }
            com.google.android.gms.internal.ads.n04 r0 = r7.f20802O     // Catch:{ n04 -> 0x03db }
            if (r0 != 0) goto L_0x03b5
            r7.f20802O = r1     // Catch:{ n04 -> 0x03db }
            goto L_0x03bb
        L_0x03b5:
            com.google.android.gms.internal.ads.n04 r0 = com.google.android.gms.internal.ads.n04.zza(r0, r1)     // Catch:{ n04 -> 0x03db }
            r7.f20802O = r0     // Catch:{ n04 -> 0x03db }
        L_0x03bb:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.m04> r0 = r7.f20801N     // Catch:{ n04 -> 0x03db }
            boolean r0 = r0.isEmpty()     // Catch:{ n04 -> 0x03db }
            if (r0 != 0) goto L_0x03c7
        L_0x03c3:
            r9 = 0
            r10 = 0
            goto L_0x00a4
        L_0x03c7:
            com.google.android.gms.internal.ads.n04 r0 = r7.f20802O     // Catch:{ n04 -> 0x03db }
            throw r0     // Catch:{ n04 -> 0x03db }
        L_0x03ca:
            r1 = r10
            r7.f20801N = r1     // Catch:{ n04 -> 0x03db }
            return
        L_0x03ce:
            com.google.android.gms.internal.ads.n04 r0 = new com.google.android.gms.internal.ads.n04     // Catch:{ n04 -> 0x03db }
            com.google.android.gms.internal.ads.w r1 = r7.f20791D     // Catch:{ n04 -> 0x03db }
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r3 = 0
            r4 = 0
            r0.<init>((com.google.android.gms.internal.ads.C5689w) r1, (java.lang.Throwable) r3, (boolean) r4, (int) r2)     // Catch:{ n04 -> 0x03db }
            throw r0     // Catch:{ n04 -> 0x03db }
        L_0x03db:
            r0 = move-exception
            com.google.android.gms.internal.ads.w r1 = r7.f20791D
            r2 = 4001(0xfa1, float:5.607E-42)
            r3 = 0
            com.google.android.gms.internal.ads.ji3 r0 = r7.mo16571u(r0, r1, r3, r2)
            throw r0
        L_0x03e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o04.mo19879r0():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo16540s0(long j) {
        while (true) {
            int i = this.f20786A0;
            if (i != 0 && j >= this.f20789C[0]) {
                long[] jArr = this.f20785A;
                this.f20846y0 = jArr[0];
                this.f20848z0 = this.f20787B[0];
                int i2 = i - 1;
                this.f20786A0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f20787B;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f20786A0);
                long[] jArr3 = this.f20789C;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f20786A0);
                mo16534g0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public final void mo19880t0() {
        try {
            k04 k04 = this.f20796I;
            if (k04 != null) {
                k04.mo17804j();
                this.f20844x0.f15556b++;
                mo16531Y(this.f20803P.f19692a);
            }
        } finally {
            this.f20796I = null;
            this.f20788B0 = null;
            mo19881v0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo16541u0() {
        m28198B0();
        m28199C0();
        this.f20816c0 = -9223372036854775807L;
        this.f20830q0 = false;
        this.f20829p0 = false;
        this.f20812Y = false;
        this.f20813Z = false;
        this.f20820g0 = false;
        this.f20821h0 = false;
        this.f20845y.clear();
        this.f20834s0 = -9223372036854775807L;
        this.f20836t0 = -9223372036854775807L;
        f04 f04 = this.f20815b0;
        if (f04 != null) {
            f04.mo17452c();
        }
        this.f20827n0 = 0;
        this.f20828o0 = 0;
        this.f20826m0 = this.f20825l0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public final void mo19881v0() {
        mo16541u0();
        this.f20815b0 = null;
        this.f20801N = null;
        this.f20803P = null;
        this.f20797J = null;
        this.f20798K = null;
        this.f20799L = false;
        this.f20832r0 = false;
        this.f20800M = -1.0f;
        this.f20804Q = 0;
        this.f20805R = false;
        this.f20806S = false;
        this.f20807T = false;
        this.f20808U = false;
        this.f20809V = false;
        this.f20810W = false;
        this.f20811X = false;
        this.f20814a0 = false;
        this.f20825l0 = false;
        this.f20826m0 = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public final boolean mo19882w0() throws ji3 {
        boolean x0 = mo19883x0();
        if (x0) {
            mo19879r0();
        }
        return x0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public final boolean mo19883x0() {
        if (this.f20796I == null) {
            return false;
        }
        if (this.f20828o0 == 3 || this.f20806S || ((this.f20807T && !this.f20832r0) || (this.f20808U && this.f20830q0))) {
            mo19880t0();
            return true;
        }
        mo22450f0();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public boolean mo16542y0(m04 m04) {
        return true;
    }

    public final int zze() {
        return 8;
    }
}
