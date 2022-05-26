package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.u */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5615u implements y84 {

    /* renamed from: b0 */
    public static final f94 f24073b0 = C5393o.f20774b;

    /* renamed from: c0 */
    private static final byte[] f24074c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static final byte[] f24075d0 = wy2.m33460w("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0 */
    private static final byte[] f24076e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public static final UUID f24077f0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public static final Map<String, Integer> f24078g0;

    /* renamed from: A */
    private long f24079A = -9223372036854775807L;

    /* renamed from: B */
    private za2 f24080B;

    /* renamed from: C */
    private za2 f24081C;

    /* renamed from: D */
    private boolean f24082D;

    /* renamed from: E */
    private boolean f24083E;

    /* renamed from: F */
    private int f24084F;

    /* renamed from: G */
    private long f24085G;

    /* renamed from: H */
    private long f24086H;

    /* renamed from: I */
    private int f24087I;

    /* renamed from: J */
    private int f24088J;

    /* renamed from: K */
    private int[] f24089K;

    /* renamed from: L */
    private int f24090L;

    /* renamed from: M */
    private int f24091M;

    /* renamed from: N */
    private int f24092N;

    /* renamed from: O */
    private int f24093O;

    /* renamed from: P */
    private boolean f24094P;

    /* renamed from: Q */
    private int f24095Q;

    /* renamed from: R */
    private int f24096R;

    /* renamed from: S */
    private int f24097S;

    /* renamed from: T */
    private boolean f24098T;

    /* renamed from: U */
    private boolean f24099U;

    /* renamed from: V */
    private boolean f24100V;

    /* renamed from: W */
    private int f24101W;

    /* renamed from: X */
    private byte f24102X;

    /* renamed from: Y */
    private boolean f24103Y;

    /* renamed from: Z */
    private b94 f24104Z;

    /* renamed from: a */
    private final C5726x f24105a;

    /* renamed from: a0 */
    private final C5319m f24106a0;

    /* renamed from: b */
    private final SparseArray<C5541s> f24107b;

    /* renamed from: c */
    private final boolean f24108c;

    /* renamed from: d */
    private final no2 f24109d;

    /* renamed from: e */
    private final no2 f24110e;

    /* renamed from: f */
    private final no2 f24111f;

    /* renamed from: g */
    private final no2 f24112g;

    /* renamed from: h */
    private final no2 f24113h;

    /* renamed from: i */
    private final no2 f24114i;

    /* renamed from: j */
    private final no2 f24115j;

    /* renamed from: k */
    private final no2 f24116k;

    /* renamed from: l */
    private final no2 f24117l;

    /* renamed from: m */
    private final no2 f24118m;

    /* renamed from: n */
    private ByteBuffer f24119n;

    /* renamed from: o */
    private long f24120o;

    /* renamed from: p */
    private long f24121p = -1;

    /* renamed from: q */
    private long f24122q = -9223372036854775807L;

    /* renamed from: r */
    private long f24123r = -9223372036854775807L;

    /* renamed from: s */
    private long f24124s = -9223372036854775807L;

    /* renamed from: t */
    private C5541s f24125t;

    /* renamed from: u */
    private boolean f24126u;

    /* renamed from: v */
    private int f24127v;

    /* renamed from: w */
    private long f24128w;

    /* renamed from: x */
    private boolean f24129x;

    /* renamed from: y */
    private long f24130y = -1;

    /* renamed from: z */
    private long f24131z = -1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f24078g0 = Collections.unmodifiableMap(hashMap);
    }

    public C5615u(int i) {
        C5319m mVar = new C5319m();
        this.f24106a0 = mVar;
        mVar.mo19306a(new C5467q(this, (C5430p) null));
        this.f24108c = true;
        this.f24105a = new C5726x();
        this.f24107b = new SparseArray<>();
        this.f24111f = new no2(4);
        this.f24112g = new no2(ByteBuffer.allocate(4).putInt(-1).array());
        this.f24113h = new no2(4);
        this.f24109d = new no2(df2.f15600a);
        this.f24110e = new no2(4);
        this.f24114i = new no2();
        this.f24115j = new no2();
        this.f24116k = new no2(8);
        this.f24117l = new no2();
        this.f24118m = new no2();
        this.f24089K = new int[1];
    }

    /* renamed from: n */
    protected static final int m31547n(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: o */
    protected static final boolean m31548o(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: p */
    private final int m31549p(z84 z84, C5541s sVar, int i) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(sVar.f23255b)) {
            m31557x(z84, f24074c0, i);
            int i3 = this.f24096R;
            m31556w();
            return i3;
        } else if ("S_TEXT/ASS".equals(sVar.f23255b)) {
            m31557x(z84, f24076e0, i);
            int i4 = this.f24096R;
            m31556w();
            return i4;
        } else {
            da4 da4 = sVar.f23252X;
            boolean z = true;
            if (!this.f24098T) {
                if (sVar.f23261h) {
                    this.f24092N &= -1073741825;
                    int i5 = 128;
                    if (!this.f24099U) {
                        ((t84) z84).mo19927e(this.f24111f.mo19781h(), 0, 1, false);
                        this.f24095Q++;
                        if ((this.f24111f.mo19781h()[0] & 128) != 128) {
                            this.f24102X = this.f24111f.mo19781h()[0];
                            this.f24099U = true;
                        } else {
                            throw C5464px.zza("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.f24102X;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.f24092N |= 1073741824;
                        if (!this.f24103Y) {
                            ((t84) z84).mo19927e(this.f24116k.mo19781h(), 0, 8, false);
                            this.f24095Q += 8;
                            this.f24103Y = true;
                            byte[] h = this.f24111f.mo19781h();
                            if (b2 != 2) {
                                i5 = 0;
                            }
                            h[0] = (byte) (i5 | 8);
                            this.f24111f.mo19779f(0);
                            da4.mo16890f(this.f24111f, 1, 1);
                            this.f24096R++;
                            this.f24116k.mo19779f(0);
                            da4.mo16890f(this.f24116k, 8, 1);
                            this.f24096R += 8;
                        }
                        if (b2 == 2) {
                            if (!this.f24100V) {
                                ((t84) z84).mo19927e(this.f24111f.mo19781h(), 0, 1, false);
                                this.f24095Q++;
                                this.f24111f.mo19779f(0);
                                this.f24101W = this.f24111f.mo19792s();
                                this.f24100V = true;
                            }
                            int i6 = this.f24101W * 4;
                            this.f24111f.mo19776c(i6);
                            ((t84) z84).mo19927e(this.f24111f.mo19781h(), 0, i6, false);
                            this.f24095Q += i6;
                            int i7 = (this.f24101W >> 1) + 1;
                            int i8 = (i7 * 6) + 2;
                            ByteBuffer byteBuffer = this.f24119n;
                            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                                this.f24119n = ByteBuffer.allocate(i8);
                            }
                            this.f24119n.position(0);
                            this.f24119n.putShort((short) i7);
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                i2 = this.f24101W;
                                if (i9 >= i2) {
                                    break;
                                }
                                int v = this.f24111f.mo19795v();
                                if (i9 % 2 == 0) {
                                    this.f24119n.putShort((short) (v - i10));
                                } else {
                                    this.f24119n.putInt(v - i10);
                                }
                                i9++;
                                i10 = v;
                            }
                            int i11 = (i - this.f24095Q) - i10;
                            if ((i2 & 1) == 1) {
                                this.f24119n.putInt(i11);
                            } else {
                                this.f24119n.putShort((short) i11);
                                this.f24119n.putInt(0);
                            }
                            this.f24117l.mo19777d(this.f24119n.array(), i8);
                            da4.mo16890f(this.f24117l, i8, 1);
                            this.f24096R += i8;
                        }
                    }
                } else {
                    byte[] bArr = sVar.f23262i;
                    if (bArr != null) {
                        this.f24114i.mo19777d(bArr, bArr.length);
                    }
                }
                if (sVar.f23259f > 0) {
                    this.f24092N |= 268435456;
                    this.f24118m.mo19776c(0);
                    this.f24111f.mo19776c(4);
                    this.f24111f.mo19781h()[0] = (byte) ((i >> 24) & 255);
                    this.f24111f.mo19781h()[1] = (byte) ((i >> 16) & 255);
                    this.f24111f.mo19781h()[2] = (byte) ((i >> 8) & 255);
                    this.f24111f.mo19781h()[3] = (byte) (i & 255);
                    da4.mo16890f(this.f24111f, 4, 2);
                    this.f24096R += 4;
                }
                this.f24098T = true;
            }
            int l = i + this.f24114i.mo19785l();
            if (!"V_MPEG4/ISO/AVC".equals(sVar.f23255b) && !"V_MPEGH/ISO/HEVC".equals(sVar.f23255b)) {
                if (sVar.f23248T != null) {
                    if (this.f24114i.mo19785l() != 0) {
                        z = false;
                    }
                    gs1.m24488f(z);
                    sVar.f23248T.mo20988d(z84);
                }
                while (true) {
                    int i12 = this.f24095Q;
                    if (i12 >= l) {
                        break;
                    }
                    int q = m31550q(z84, da4, l - i12);
                    this.f24095Q += q;
                    this.f24096R += q;
                }
            } else {
                byte[] h2 = this.f24110e.mo19781h();
                h2[0] = 0;
                h2[1] = 0;
                h2[2] = 0;
                int i13 = sVar.f23253Y;
                int i14 = 4 - i13;
                while (this.f24095Q < l) {
                    int i15 = this.f24097S;
                    if (i15 == 0) {
                        int min = Math.min(i13, this.f24114i.mo19782i());
                        ((t84) z84).mo19927e(h2, i14 + min, i13 - min, false);
                        if (min > 0) {
                            this.f24114i.mo19775b(h2, i14, min);
                        }
                        this.f24095Q += i13;
                        this.f24110e.mo19779f(0);
                        this.f24097S = this.f24110e.mo19795v();
                        this.f24109d.mo19779f(0);
                        ba4.m21199b(da4, this.f24109d, 4);
                        this.f24096R += 4;
                    } else {
                        int q2 = m31550q(z84, da4, i15);
                        this.f24095Q += q2;
                        this.f24096R += q2;
                        this.f24097S -= q2;
                    }
                }
            }
            if ("A_VORBIS".equals(sVar.f23255b)) {
                this.f24112g.mo19779f(0);
                ba4.m21199b(da4, this.f24112g, 4);
                this.f24096R += 4;
            }
            int i16 = this.f24096R;
            m31556w();
            return i16;
        }
    }

    /* renamed from: q */
    private final int m31550q(z84 z84, da4 da4, int i) throws IOException {
        int i2 = this.f24114i.mo19782i();
        if (i2 <= 0) {
            return ba4.m21198a(da4, z84, i, false);
        }
        int min = Math.min(i, i2);
        ba4.m21199b(da4, this.f24114i, min);
        return min;
    }

    /* renamed from: r */
    private final long m31551r(long j) throws C5464px {
        long j2 = this.f24122q;
        if (j2 != -9223372036854775807L) {
            return wy2.m33431Z(j, j2, 1000);
        }
        throw C5464px.zza("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    /* renamed from: s */
    private final void m31552s(int i) throws C5464px {
        if (this.f24080B == null || this.f24081C == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw C5464px.zza(sb.toString(), (Throwable) null);
        }
    }

    /* renamed from: t */
    private final void m31553t(int i) throws C5464px {
        if (this.f24125t == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a TrackEntry");
            throw C5464px.zza(sb.toString(), (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b9 A[EDGE_INSN: B:49:0x00b9->B:38:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m31554u(com.google.android.gms.internal.ads.C5541s r17, long r18, int r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            com.google.android.gms.internal.ads.t r1 = r2.f23248T
            r8 = 1
            if (r1 == 0) goto L_0x0018
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r1.mo20987c(r2, r3, r5, r6, r7)
            goto L_0x00fb
        L_0x0018:
            java.lang.String r1 = r2.f23255b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r1 = r3.equals(r1)
            java.lang.String r4 = "S_TEXT/ASS"
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r2.f23255b
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0048
        L_0x002c:
            int r1 = r0.f24088J
            java.lang.String r5 = "MatroskaExtractor"
            if (r1 <= r8) goto L_0x0038
            java.lang.String r1 = "Skipping subtitle sample in laced block."
            android.util.Log.w(r5, r1)
            goto L_0x0048
        L_0x0038:
            long r6 = r0.f24086H
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "Skipping subtitle sample with no duration."
            android.util.Log.w(r5, r1)
        L_0x0048:
            r1 = r21
            goto L_0x00cc
        L_0x004c:
            java.lang.String r1 = r2.f23255b
            com.google.android.gms.internal.ads.no2 r5 = r0.f24115j
            byte[] r5 = r5.mo19781h()
            int r9 = r1.hashCode()
            r10 = 738597099(0x2c0618eb, float:1.9056378E-12)
            r11 = 0
            if (r9 == r10) goto L_0x006c
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r9 == r4) goto L_0x0064
            goto L_0x0074
        L_0x0064:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            r1 = 0
            goto L_0x0075
        L_0x006c:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0074
            r1 = 1
            goto L_0x0075
        L_0x0074:
            r1 = -1
        L_0x0075:
            if (r1 == 0) goto L_0x008a
            if (r1 != r8) goto L_0x0084
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r1 = "%01d:%02d:%02d:%02d"
            byte[] r1 = m31558y(r6, r1, r3)
            r3 = 21
            goto L_0x0094
        L_0x0084:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x008a:
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r1 = "%02d:%02d:%02d,%03d"
            byte[] r1 = m31558y(r6, r1, r3)
            r3 = 19
        L_0x0094:
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r11, r5, r3, r4)
            com.google.android.gms.internal.ads.no2 r1 = r0.f24115j
            int r1 = r1.mo19784k()
        L_0x009e:
            com.google.android.gms.internal.ads.no2 r3 = r0.f24115j
            int r3 = r3.mo19785l()
            if (r1 >= r3) goto L_0x00b9
            com.google.android.gms.internal.ads.no2 r3 = r0.f24115j
            byte[] r3 = r3.mo19781h()
            byte r3 = r3[r1]
            if (r3 != 0) goto L_0x00b6
            com.google.android.gms.internal.ads.no2 r3 = r0.f24115j
            r3.mo19778e(r1)
            goto L_0x00b9
        L_0x00b6:
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00b9:
            com.google.android.gms.internal.ads.da4 r1 = r2.f23252X
            com.google.android.gms.internal.ads.no2 r3 = r0.f24115j
            int r4 = r3.mo19785l()
            com.google.android.gms.internal.ads.ba4.m21199b(r1, r3, r4)
            com.google.android.gms.internal.ads.no2 r1 = r0.f24115j
            int r1 = r1.mo19785l()
            int r1 = r21 + r1
        L_0x00cc:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r20 & r3
            if (r3 == 0) goto L_0x00ed
            int r3 = r0.f24088J
            if (r3 <= r8) goto L_0x00de
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r3 = r20 & r3
            r13 = r1
            r12 = r3
            goto L_0x00f0
        L_0x00de:
            com.google.android.gms.internal.ads.no2 r3 = r0.f24118m
            int r3 = r3.mo19785l()
            com.google.android.gms.internal.ads.da4 r4 = r2.f23252X
            com.google.android.gms.internal.ads.no2 r5 = r0.f24118m
            r6 = 2
            r4.mo16890f(r5, r3, r6)
            int r1 = r1 + r3
        L_0x00ed:
            r12 = r20
            r13 = r1
        L_0x00f0:
            com.google.android.gms.internal.ads.da4 r9 = r2.f23252X
            com.google.android.gms.internal.ads.ca4 r15 = r2.f23263j
            r10 = r18
            r14 = r22
            r9.mo16889e(r10, r12, r13, r14, r15)
        L_0x00fb:
            r0.f24083E = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5615u.m31554u(com.google.android.gms.internal.ads.s, long, int, int, int):void");
    }

    /* renamed from: v */
    private final void m31555v(z84 z84, int i) throws IOException {
        if (this.f24111f.mo19785l() < i) {
            if (this.f24111f.mo19783j() < i) {
                no2 no2 = this.f24111f;
                int j = no2.mo19783j();
                no2.mo19773H(Math.max(j + j, i));
            }
            ((t84) z84).mo19927e(this.f24111f.mo19781h(), this.f24111f.mo19785l(), i - this.f24111f.mo19785l(), false);
            this.f24111f.mo19778e(i);
        }
    }

    /* renamed from: w */
    private final void m31556w() {
        this.f24095Q = 0;
        this.f24096R = 0;
        this.f24097S = 0;
        this.f24098T = false;
        this.f24099U = false;
        this.f24100V = false;
        this.f24101W = 0;
        this.f24102X = 0;
        this.f24103Y = false;
        this.f24114i.mo19776c(0);
    }

    /* renamed from: x */
    private final void m31557x(z84 z84, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = i + 32;
        if (this.f24115j.mo19783j() < i2) {
            no2 no2 = this.f24115j;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            no2.mo19777d(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f24115j.mo19781h(), 0, 32);
        }
        ((t84) z84).mo19927e(this.f24115j.mo19781h(), 32, i, false);
        this.f24115j.mo19779f(0);
        this.f24115j.mo19778e(i2);
    }

    /* renamed from: y */
    private static byte[] m31558y(long j, String str, long j2) {
        gs1.m24486d(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return wy2.m33460w(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: z */
    private static int[] m31559z(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        return new C5652v().mo21405a(z84);
    }

    /* renamed from: d */
    public final int mo16802d(z84 z84, w94 w94) throws IOException {
        this.f24083E = false;
        while (!this.f24083E) {
            if (this.f24106a0.mo19308c(z84)) {
                long zze = z84.zze();
                if (this.f24129x) {
                    this.f24131z = zze;
                    w94.f25288a = this.f24130y;
                    this.f24129x = false;
                    return 1;
                } else if (this.f24126u) {
                    long j = this.f24131z;
                    if (j != -1) {
                        w94.f25288a = j;
                        this.f24131z = -1;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.f24107b.size(); i++) {
                    C5541s valueAt = this.f24107b.valueAt(i);
                    Objects.requireNonNull(valueAt.f23252X);
                    C5578t tVar = valueAt.f23248T;
                    if (tVar != null) {
                        tVar.mo20985a(valueAt);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0281, code lost:
        throw com.google.android.gms.internal.ads.C5464px.zza("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21195e(int r19, int r20, com.google.android.gms.internal.ads.z84 r21) throws java.io.IOException {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            r8 = r21
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            r4 = 4
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x0114
            if (r0 == r5) goto L_0x0114
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00de
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00b4
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x00a4
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x008f
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0069
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0059
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0041
            r18.m31553t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f24125t
            byte[] r2 = new byte[r1]
            r0.f23275v = r2
            r0 = r8
            com.google.android.gms.internal.ads.t84 r0 = (com.google.android.gms.internal.ads.t84) r0
            r0.mo19927e(r2, r10, r1, r10)
            return
        L_0x0041:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 26
            r1.<init>(r2)
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r0, r3)
            throw r0
        L_0x0059:
            r18.m31553t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f24125t
            byte[] r2 = new byte[r1]
            r0.f23264k = r2
            r0 = r8
            com.google.android.gms.internal.ads.t84 r0 = (com.google.android.gms.internal.ads.t84) r0
            r0.mo19927e(r2, r10, r1, r10)
            return
        L_0x0069:
            com.google.android.gms.internal.ads.no2 r0 = r7.f24113h
            byte[] r0 = r0.mo19781h()
            java.util.Arrays.fill(r0, r10)
            com.google.android.gms.internal.ads.no2 r0 = r7.f24113h
            byte[] r0 = r0.mo19781h()
            r2 = r8
            com.google.android.gms.internal.ads.t84 r2 = (com.google.android.gms.internal.ads.t84) r2
            int r3 = 4 - r1
            r2.mo19927e(r0, r3, r1, r10)
            com.google.android.gms.internal.ads.no2 r0 = r7.f24113h
            r0.mo19779f(r10)
            com.google.android.gms.internal.ads.no2 r0 = r7.f24113h
            long r0 = r0.mo19766A()
            int r1 = (int) r0
            r7.f24127v = r1
            return
        L_0x008f:
            byte[] r2 = new byte[r1]
            r3 = r8
            com.google.android.gms.internal.ads.t84 r3 = (com.google.android.gms.internal.ads.t84) r3
            r3.mo19927e(r2, r10, r1, r10)
            r18.m31553t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f24125t
            com.google.android.gms.internal.ads.ca4 r1 = new com.google.android.gms.internal.ads.ca4
            r1.<init>(r9, r2, r10, r10)
            r0.f23263j = r1
            return
        L_0x00a4:
            r18.m31553t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f24125t
            byte[] r2 = new byte[r1]
            r0.f23262i = r2
            r0 = r8
            com.google.android.gms.internal.ads.t84 r0 = (com.google.android.gms.internal.ads.t84) r0
            r0.mo19927e(r2, r10, r1, r10)
            return
        L_0x00b4:
            r18.m31553t(r19)
            com.google.android.gms.internal.ads.s r0 = r7.f24125t
            int r2 = r0.f23260g
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto L_0x00d3
            int r2 = r0.f23260g
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto L_0x00cc
            goto L_0x00d3
        L_0x00cc:
            r0 = r8
            com.google.android.gms.internal.ads.t84 r0 = (com.google.android.gms.internal.ads.t84) r0
            r0.mo21042o(r1, r10)
            return
        L_0x00d3:
            byte[] r2 = new byte[r1]
            r0.f23242N = r2
            r0 = r8
            com.google.android.gms.internal.ads.t84 r0 = (com.google.android.gms.internal.ads.t84) r0
            r0.mo19927e(r2, r10, r1, r10)
            return
        L_0x00de:
            int r0 = r7.f24084F
            if (r0 == r6) goto L_0x00e3
            return
        L_0x00e3:
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r0 = r7.f24107b
            int r2 = r7.f24090L
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.s r0 = (com.google.android.gms.internal.ads.C5541s) r0
            int r2 = r7.f24093O
            if (r2 != r4) goto L_0x010d
            java.lang.String r0 = r0.f23255b
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.internal.ads.no2 r0 = r7.f24118m
            r0.mo19776c(r1)
            com.google.android.gms.internal.ads.no2 r0 = r7.f24118m
            byte[] r0 = r0.mo19781h()
            r2 = r8
            com.google.android.gms.internal.ads.t84 r2 = (com.google.android.gms.internal.ads.t84) r2
            r2.mo19927e(r0, r10, r1, r10)
            return
        L_0x010d:
            r0 = r8
            com.google.android.gms.internal.ads.t84 r0 = (com.google.android.gms.internal.ads.t84) r0
            r0.mo21042o(r1, r10)
            return
        L_0x0114:
            int r2 = r7.f24084F
            r11 = 8
            if (r2 != 0) goto L_0x0139
            com.google.android.gms.internal.ads.x r2 = r7.f24105a
            long r12 = r2.mo21948d(r8, r10, r9, r11)
            int r2 = (int) r12
            r7.f24090L = r2
            com.google.android.gms.internal.ads.x r2 = r7.f24105a
            int r2 = r2.mo21947a()
            r7.f24091M = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f24086H = r12
            r7.f24084F = r9
            com.google.android.gms.internal.ads.no2 r2 = r7.f24111f
            r2.mo19776c(r10)
        L_0x0139:
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r2 = r7.f24107b
            int r12 = r7.f24090L
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.gms.internal.ads.s r12 = (com.google.android.gms.internal.ads.C5541s) r12
            if (r12 != 0) goto L_0x0153
            int r0 = r7.f24091M
            r2 = r8
            com.google.android.gms.internal.ads.t84 r2 = (com.google.android.gms.internal.ads.t84) r2
            int r0 = r1 - r0
            r2.mo21042o(r0, r10)
            r7.f24084F = r10
            return
        L_0x0153:
            java.util.Objects.requireNonNull(r12.f23252X)
            int r2 = r7.f24084F
            if (r2 != r9) goto L_0x02e2
            r2 = 3
            r7.m31555v(r8, r2)
            com.google.android.gms.internal.ads.no2 r13 = r7.f24111f
            byte[] r13 = r13.mo19781h()
            byte r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r9
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L_0x0180
            r7.f24088J = r9
            int[] r2 = r7.f24089K
            int[] r2 = m31559z(r2, r9)
            r7.f24089K = r2
            int r3 = r7.f24091M
            int r1 = r1 - r3
            int r1 = r1 + -3
            r2[r10] = r1
            goto L_0x0292
        L_0x0180:
            r7.m31555v(r8, r4)
            com.google.android.gms.internal.ads.no2 r15 = r7.f24111f
            byte[] r15 = r15.mo19781h()
            byte r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r9
            r7.f24088J = r15
            int[] r4 = r7.f24089K
            int[] r4 = m31559z(r4, r15)
            r7.f24089K = r4
            if (r13 != r6) goto L_0x01a6
            int r2 = r7.f24091M
            int r3 = r7.f24088J
            int r1 = r1 - r2
            int r1 = r1 + -4
            int r1 = r1 / r3
            java.util.Arrays.fill(r4, r10, r3, r1)
            goto L_0x0292
        L_0x01a6:
            if (r13 != r9) goto L_0x01de
            r2 = 0
            r3 = 0
            r4 = 4
        L_0x01ab:
            int r13 = r7.f24088J
            int r13 = r13 + -1
            if (r2 >= r13) goto L_0x01d3
            int[] r13 = r7.f24089K
            r13[r2] = r10
        L_0x01b5:
            int r4 = r4 + r9
            r7.m31555v(r8, r4)
            com.google.android.gms.internal.ads.no2 r13 = r7.f24111f
            byte[] r13 = r13.mo19781h()
            int r15 = r4 + -1
            byte r13 = r13[r15]
            r13 = r13 & r14
            int[] r15 = r7.f24089K
            r16 = r15[r2]
            int r16 = r16 + r13
            r15[r2] = r16
            if (r13 == r14) goto L_0x01b5
            int r3 = r3 + r16
            int r2 = r2 + 1
            goto L_0x01ab
        L_0x01d3:
            int[] r2 = r7.f24089K
            int r15 = r7.f24091M
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r3
            r2[r13] = r1
            goto L_0x0292
        L_0x01de:
            if (r13 != r2) goto L_0x02db
            r2 = 0
            r4 = 4
            r13 = 0
        L_0x01e3:
            int r15 = r7.f24088J
            int r15 = r15 + -1
            if (r2 >= r15) goto L_0x0289
            int[] r15 = r7.f24089K
            r15[r2] = r10
            int r4 = r4 + 1
            r7.m31555v(r8, r4)
            int r15 = r4 + -1
            com.google.android.gms.internal.ads.no2 r5 = r7.f24111f
            byte[] r5 = r5.mo19781h()
            byte r5 = r5[r15]
            if (r5 == 0) goto L_0x0282
            r5 = 0
        L_0x01ff:
            if (r5 >= r11) goto L_0x0251
            int r17 = 7 - r5
            int r6 = r9 << r17
            com.google.android.gms.internal.ads.no2 r9 = r7.f24111f
            byte[] r9 = r9.mo19781h()
            byte r9 = r9[r15]
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0247
            int r4 = r4 + r5
            r7.m31555v(r8, r4)
            int r9 = r15 + 1
            com.google.android.gms.internal.ads.no2 r10 = r7.f24111f
            byte[] r10 = r10.mo19781h()
            byte r10 = r10[r15]
            r10 = r10 & r14
            int r6 = ~r6
            r6 = r6 & r10
            long r14 = (long) r6
        L_0x0222:
            if (r9 >= r4) goto L_0x0238
            int r6 = r9 + 1
            long r14 = r14 << r11
            com.google.android.gms.internal.ads.no2 r10 = r7.f24111f
            byte[] r10 = r10.mo19781h()
            byte r9 = r10[r9]
            r10 = 255(0xff, float:3.57E-43)
            r9 = r9 & r10
            long r10 = (long) r9
            long r14 = r14 | r10
            r9 = r6
            r11 = 8
            goto L_0x0222
        L_0x0238:
            if (r2 <= 0) goto L_0x0253
            r9 = 1
            int r5 = r5 * 7
            int r5 = r5 + 6
            long r5 = r9 << r5
            r9 = -1
            long r5 = r5 + r9
            long r14 = r14 - r5
            goto L_0x0253
        L_0x0247:
            int r5 = r5 + 1
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01ff
        L_0x0251:
            r14 = 0
        L_0x0253:
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x027b
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x027b
            int r5 = (int) r14
            int[] r6 = r7.f24089K
            if (r2 == 0) goto L_0x026b
            int r9 = r2 + -1
            r9 = r6[r9]
            int r5 = r5 + r9
        L_0x026b:
            r6[r2] = r5
            int r13 = r13 + r5
            int r2 = r2 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01e3
        L_0x027b:
            java.lang.String r0 = "EBML lacing sample size out of range."
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r0, r3)
            throw r0
        L_0x0282:
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r0, r3)
            throw r0
        L_0x0289:
            int[] r2 = r7.f24089K
            int r3 = r7.f24091M
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r13
            r2[r15] = r1
        L_0x0292:
            com.google.android.gms.internal.ads.no2 r1 = r7.f24111f
            byte[] r1 = r1.mo19781h()
            r2 = 0
            byte r1 = r1[r2]
            com.google.android.gms.internal.ads.no2 r2 = r7.f24111f
            byte[] r2 = r2.mo19781h()
            r3 = 1
            byte r2 = r2[r3]
            long r3 = r7.f24079A
            r5 = 8
            int r1 = r1 << r5
            r5 = 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.m31551r(r1)
            long r3 = r3 + r1
            r7.f24085G = r3
            int r1 = r12.f23257d
            r2 = 2
            if (r1 == r2) goto L_0x02d2
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02d0
            com.google.android.gms.internal.ads.no2 r0 = r7.f24111f
            byte[] r0 = r0.mo19781h()
            byte r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x02ce
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x02d2
        L_0x02ce:
            r0 = 163(0xa3, float:2.28E-43)
        L_0x02d0:
            r1 = 0
            goto L_0x02d3
        L_0x02d2:
            r1 = 1
        L_0x02d3:
            r7.f24092N = r1
            r7.f24084F = r2
            r1 = 0
            r7.f24087I = r1
            goto L_0x02e2
        L_0x02db:
            java.lang.String r0 = "Unexpected lacing value: 2"
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r0, r3)
            throw r0
        L_0x02e2:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0314
        L_0x02e6:
            int r0 = r7.f24087I
            int r1 = r7.f24088J
            if (r0 >= r1) goto L_0x0310
            int[] r1 = r7.f24089K
            r0 = r1[r0]
            int r5 = r7.m31549p(r8, r12, r0)
            long r0 = r7.f24085G
            int r2 = r7.f24087I
            int r3 = r12.f23258e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f24092N
            r6 = 0
            r0 = r18
            r1 = r12
            r0.m31554u(r1, r2, r4, r5, r6)
            int r0 = r7.f24087I
            r1 = 1
            int r0 = r0 + r1
            r7.f24087I = r0
            goto L_0x02e6
        L_0x0310:
            r0 = 0
            r7.f24084F = r0
            return
        L_0x0314:
            int r0 = r7.f24087I
            int r1 = r7.f24088J
            if (r0 >= r1) goto L_0x032b
            int[] r1 = r7.f24089K
            r2 = r1[r0]
            int r2 = r7.m31549p(r8, r12, r2)
            r1[r0] = r2
            int r0 = r7.f24087I
            r1 = 1
            int r0 = r0 + r1
            r7.f24087I = r0
            goto L_0x0314
        L_0x032b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5615u.mo21195e(int, int, com.google.android.gms.internal.ads.z84):void");
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f24104Z = b94;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0252, code lost:
        if (r3.equals("V_AV1") != false) goto L_0x030a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21196g(int r22) throws com.google.android.gms.internal.ads.C5464px {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            com.google.android.gms.internal.ads.b94 r1 = r7.f24104Z
            com.google.android.gms.internal.ads.gs1.m24484b(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 2
            if (r0 == r1) goto L_0x0329
            r1 = 174(0xae, float:2.44E-43)
            r3 = -1
            if (r0 == r1) goto L_0x0188
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r5 = -1
            r2 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x0170
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x013d
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0127
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x010f
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00f9
            if (r0 == r2) goto L_0x0037
            goto L_0x017f
        L_0x0037:
            boolean r0 = r7.f24126u
            if (r0 != 0) goto L_0x00f3
            com.google.android.gms.internal.ads.b94 r0 = r7.f24104Z
            com.google.android.gms.internal.ads.za2 r1 = r7.f24080B
            com.google.android.gms.internal.ads.za2 r2 = r7.f24081C
            long r12 = r7.f24121p
            r14 = 0
            int r16 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r16 == 0) goto L_0x00e6
            long r5 = r7.f24124s
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00e6
            if (r1 == 0) goto L_0x00e6
            int r5 = r1.mo22353a()
            if (r5 == 0) goto L_0x00e6
            if (r2 == 0) goto L_0x00e6
            int r5 = r2.mo22353a()
            int r6 = r1.mo22353a()
            if (r5 == r6) goto L_0x0065
            goto L_0x00e6
        L_0x0065:
            int r5 = r1.mo22353a()
            int[] r6 = new int[r5]
            long[] r10 = new long[r5]
            long[] r11 = new long[r5]
            long[] r12 = new long[r5]
            r13 = 0
        L_0x0072:
            if (r13 >= r5) goto L_0x0087
            long r16 = r1.mo22354b(r13)
            r12[r13] = r16
            long r8 = r7.f24121p
            long r18 = r2.mo22354b(r13)
            long r8 = r8 + r18
            r10[r13] = r8
            int r13 = r13 + 1
            goto L_0x0072
        L_0x0087:
            r9 = 0
        L_0x0088:
            int r1 = r5 + -1
            if (r9 >= r1) goto L_0x00a2
            int r1 = r9 + 1
            r17 = r10[r1]
            r19 = r10[r9]
            long r3 = r17 - r19
            int r2 = (int) r3
            r6[r9] = r2
            r2 = r12[r1]
            r17 = r12[r9]
            long r2 = r2 - r17
            r11[r9] = r2
            r9 = r1
            r3 = -1
            goto L_0x0088
        L_0x00a2:
            long r2 = r7.f24121p
            long r4 = r7.f24120o
            long r2 = r2 + r4
            r4 = r10[r1]
            long r2 = r2 - r4
            int r3 = (int) r2
            r6[r1] = r3
            long r2 = r7.f24124s
            r4 = r12[r1]
            long r2 = r2 - r4
            r11[r1] = r2
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x00e0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 72
            r4.<init>(r5)
            java.lang.String r5 = "Discarding last cue point with unexpected duration: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "MatroskaExtractor"
            android.util.Log.w(r3, r2)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r10 = java.util.Arrays.copyOf(r10, r1)
            long[] r11 = java.util.Arrays.copyOf(r11, r1)
            long[] r12 = java.util.Arrays.copyOf(r12, r1)
        L_0x00e0:
            com.google.android.gms.internal.ads.r84 r1 = new com.google.android.gms.internal.ads.r84
            r1.<init>(r6, r10, r11, r12)
            goto L_0x00ed
        L_0x00e6:
            com.google.android.gms.internal.ads.y94 r1 = new com.google.android.gms.internal.ads.y94
            long r2 = r7.f24124s
            r1.<init>(r2, r14)
        L_0x00ed:
            r0.mo15723r(r1)
            r0 = 1
            r7.f24126u = r0
        L_0x00f3:
            r0 = 0
            r7.f24080B = r0
            r7.f24081C = r0
            return
        L_0x00f9:
            r0 = 0
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r1 = r7.f24107b
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0108
            com.google.android.gms.internal.ads.b94 r0 = r7.f24104Z
            r0.mo15722I()
            return
        L_0x0108:
            java.lang.String r1 = "No valid tracks were found"
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r1, r0)
            throw r0
        L_0x010f:
            long r0 = r7.f24122q
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x011a
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.f24122q = r0
        L_0x011a:
            long r0 = r7.f24123r
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x017f
            long r0 = r7.m31551r(r0)
            r7.f24124s = r0
            return
        L_0x0127:
            r21.m31553t(r22)
            com.google.android.gms.internal.ads.s r0 = r7.f24125t
            boolean r1 = r0.f23261h
            if (r1 == 0) goto L_0x017f
            byte[] r0 = r0.f23262i
            if (r0 != 0) goto L_0x0135
            goto L_0x017f
        L_0x0135:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r0, r1)
            throw r0
        L_0x013d:
            r21.m31553t(r22)
            com.google.android.gms.internal.ads.s r0 = r7.f24125t
            boolean r1 = r0.f23261h
            if (r1 == 0) goto L_0x017f
            com.google.android.gms.internal.ads.ca4 r1 = r0.f23263j
            if (r1 == 0) goto L_0x0168
            com.google.android.gms.internal.ads.zzs r1 = new com.google.android.gms.internal.ads.zzs
            r2 = 1
            com.google.android.gms.internal.ads.zzr[] r2 = new com.google.android.gms.internal.ads.zzr[r2]
            com.google.android.gms.internal.ads.zzr r3 = new com.google.android.gms.internal.ads.zzr
            java.util.UUID r4 = com.google.android.gms.internal.ads.bw3.f14720a
            com.google.android.gms.internal.ads.s r5 = r7.f24125t
            com.google.android.gms.internal.ads.ca4 r5 = r5.f23263j
            byte[] r5 = r5.f14931b
            java.lang.String r6 = "video/webm"
            r8 = 0
            r3.<init>(r4, r8, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r8, r2)
            r0.f23265l = r1
            return
        L_0x0168:
            r8 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r0, r8)
            throw r0
        L_0x0170:
            int r0 = r7.f24127v
            r1 = -1
            if (r0 == r1) goto L_0x0180
            long r3 = r7.f24128w
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0180
            if (r0 != r2) goto L_0x017f
            r7.f24130y = r3
        L_0x017f:
            return
        L_0x0180:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r0, r1)
            throw r0
        L_0x0188:
            r1 = -1
            com.google.android.gms.internal.ads.s r0 = r7.f24125t
            com.google.android.gms.internal.ads.gs1.m24484b(r0)
            java.lang.String r3 = r0.f23255b
            if (r3 == 0) goto L_0x0321
            int r4 = r3.hashCode()
            switch(r4) {
                case -2095576542: goto L_0x02ff;
                case -2095575984: goto L_0x02f5;
                case -1985379776: goto L_0x02ea;
                case -1784763192: goto L_0x02df;
                case -1730367663: goto L_0x02d4;
                case -1482641358: goto L_0x02c9;
                case -1482641357: goto L_0x02be;
                case -1373388978: goto L_0x02b3;
                case -933872740: goto L_0x02a8;
                case -538363189: goto L_0x029d;
                case -538363109: goto L_0x0292;
                case -425012669: goto L_0x0286;
                case -356037306: goto L_0x027a;
                case 62923557: goto L_0x026e;
                case 62923603: goto L_0x0262;
                case 62927045: goto L_0x0256;
                case 82318131: goto L_0x024c;
                case 82338133: goto L_0x0241;
                case 82338134: goto L_0x0236;
                case 99146302: goto L_0x022a;
                case 444813526: goto L_0x021e;
                case 542569478: goto L_0x0212;
                case 635596514: goto L_0x0206;
                case 725948237: goto L_0x01fa;
                case 725957860: goto L_0x01ee;
                case 738597099: goto L_0x01e2;
                case 855502857: goto L_0x01d6;
                case 1422270023: goto L_0x01ca;
                case 1809237540: goto L_0x01bf;
                case 1950749482: goto L_0x01b3;
                case 1950789798: goto L_0x01a7;
                case 1951062397: goto L_0x019b;
                default: goto L_0x0199;
            }
        L_0x0199:
            goto L_0x0309
        L_0x019b:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 11
            goto L_0x030a
        L_0x01a7:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 22
            goto L_0x030a
        L_0x01b3:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 17
            goto L_0x030a
        L_0x01bf:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 3
            goto L_0x030a
        L_0x01ca:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 27
            goto L_0x030a
        L_0x01d6:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 8
            goto L_0x030a
        L_0x01e2:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 28
            goto L_0x030a
        L_0x01ee:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 24
            goto L_0x030a
        L_0x01fa:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 25
            goto L_0x030a
        L_0x0206:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 26
            goto L_0x030a
        L_0x0212:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 20
            goto L_0x030a
        L_0x021e:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 10
            goto L_0x030a
        L_0x022a:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 30
            goto L_0x030a
        L_0x0236:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 1
            goto L_0x030a
        L_0x0241:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 0
            goto L_0x030a
        L_0x024c:
            java.lang.String r4 = "V_AV1"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0309
            goto L_0x030a
        L_0x0256:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 19
            goto L_0x030a
        L_0x0262:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 16
            goto L_0x030a
        L_0x026e:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 13
            goto L_0x030a
        L_0x027a:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 21
            goto L_0x030a
        L_0x0286:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 29
            goto L_0x030a
        L_0x0292:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 7
            goto L_0x030a
        L_0x029d:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 5
            goto L_0x030a
        L_0x02a8:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 31
            goto L_0x030a
        L_0x02b3:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 9
            goto L_0x030a
        L_0x02be:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 15
            goto L_0x030a
        L_0x02c9:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 14
            goto L_0x030a
        L_0x02d4:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 12
            goto L_0x030a
        L_0x02df:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 18
            goto L_0x030a
        L_0x02ea:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 23
            goto L_0x030a
        L_0x02f5:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 4
            goto L_0x030a
        L_0x02ff:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0309
            r2 = 6
            goto L_0x030a
        L_0x0309:
            r2 = -1
        L_0x030a:
            switch(r2) {
                case 0: goto L_0x030f;
                case 1: goto L_0x030f;
                case 2: goto L_0x030f;
                case 3: goto L_0x030f;
                case 4: goto L_0x030f;
                case 5: goto L_0x030f;
                case 6: goto L_0x030f;
                case 7: goto L_0x030f;
                case 8: goto L_0x030f;
                case 9: goto L_0x030f;
                case 10: goto L_0x030f;
                case 11: goto L_0x030f;
                case 12: goto L_0x030f;
                case 13: goto L_0x030f;
                case 14: goto L_0x030f;
                case 15: goto L_0x030f;
                case 16: goto L_0x030f;
                case 17: goto L_0x030f;
                case 18: goto L_0x030f;
                case 19: goto L_0x030f;
                case 20: goto L_0x030f;
                case 21: goto L_0x030f;
                case 22: goto L_0x030f;
                case 23: goto L_0x030f;
                case 24: goto L_0x030f;
                case 25: goto L_0x030f;
                case 26: goto L_0x030f;
                case 27: goto L_0x030f;
                case 28: goto L_0x030f;
                case 29: goto L_0x030f;
                case 30: goto L_0x030f;
                case 31: goto L_0x030f;
                default: goto L_0x030d;
            }
        L_0x030d:
            r0 = 0
            goto L_0x031e
        L_0x030f:
            com.google.android.gms.internal.ads.b94 r1 = r7.f24104Z
            int r2 = r0.f23256c
            r0.mo20756e(r1, r2)
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r1 = r7.f24107b
            int r2 = r0.f23256c
            r1.put(r2, r0)
            goto L_0x030d
        L_0x031e:
            r7.f24125t = r0
            return
        L_0x0321:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r1, r0)
            throw r0
        L_0x0329:
            int r0 = r7.f24084F
            if (r0 != r2) goto L_0x037d
            r0 = 0
            r4 = 0
        L_0x032f:
            int r1 = r7.f24088J
            if (r4 >= r1) goto L_0x033b
            int[] r1 = r7.f24089K
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L_0x032f
        L_0x033b:
            android.util.SparseArray<com.google.android.gms.internal.ads.s> r1 = r7.f24107b
            int r2 = r7.f24090L
            java.lang.Object r1 = r1.get(r2)
            r8 = r1
            com.google.android.gms.internal.ads.s r8 = (com.google.android.gms.internal.ads.C5541s) r8
            java.util.Objects.requireNonNull(r8.f23252X)
            r4 = 0
        L_0x034a:
            int r1 = r7.f24088J
            if (r4 >= r1) goto L_0x037a
            long r1 = r7.f24085G
            int r3 = r8.f23258e
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r2 = r1 + r5
            int r1 = r7.f24092N
            if (r4 != 0) goto L_0x0366
            boolean r4 = r7.f24094P
            if (r4 != 0) goto L_0x0363
            r1 = r1 | 1
        L_0x0363:
            r4 = r1
            r9 = 0
            goto L_0x0368
        L_0x0366:
            r9 = r4
            r4 = r1
        L_0x0368:
            int[] r1 = r7.f24089K
            r5 = r1[r9]
            int r10 = r0 - r5
            r0 = r21
            r1 = r8
            r6 = r10
            r0.m31554u(r1, r2, r4, r5, r6)
            r0 = 1
            int r4 = r9 + 1
            r0 = r10
            goto L_0x034a
        L_0x037a:
            r1 = 0
            r7.f24084F = r1
        L_0x037d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5615u.mo21196g(int):void");
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        this.f24079A = -9223372036854775807L;
        this.f24084F = 0;
        this.f24106a0.mo19307b();
        this.f24105a.mo21949e();
        m31556w();
        for (int i = 0; i < this.f24107b.size(); i++) {
            C5578t tVar = this.f24107b.valueAt(i).f23248T;
            if (tVar != null) {
                tVar.mo20986b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo21197i(int i, double d) throws C5464px {
        if (i == 181) {
            m31553t(i);
            this.f24125t.f23245Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m31553t(i);
                    this.f24125t.f23232D = (float) d;
                    return;
                case 21970:
                    m31553t(i);
                    this.f24125t.f23233E = (float) d;
                    return;
                case 21971:
                    m31553t(i);
                    this.f24125t.f23234F = (float) d;
                    return;
                case 21972:
                    m31553t(i);
                    this.f24125t.f23235G = (float) d;
                    return;
                case 21973:
                    m31553t(i);
                    this.f24125t.f23236H = (float) d;
                    return;
                case 21974:
                    m31553t(i);
                    this.f24125t.f23237I = (float) d;
                    return;
                case 21975:
                    m31553t(i);
                    this.f24125t.f23238J = (float) d;
                    return;
                case 21976:
                    m31553t(i);
                    this.f24125t.f23239K = (float) d;
                    return;
                case 21977:
                    m31553t(i);
                    this.f24125t.f23240L = (float) d;
                    return;
                case 21978:
                    m31553t(i);
                    this.f24125t.f23241M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m31553t(i);
                            this.f24125t.f23272s = (float) d;
                            return;
                        case 30324:
                            m31553t(i);
                            this.f24125t.f23273t = (float) d;
                            return;
                        case 30325:
                            m31553t(i);
                            this.f24125t.f23274u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f24123r = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo21198j(int i, long j) throws C5464px {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m31553t(i);
                        this.f24125t.f23257d = (int) j;
                        return;
                    case 136:
                        m31553t(i);
                        C5541s sVar = this.f24125t;
                        if (j == 1) {
                            z = true;
                        }
                        sVar.f23250V = z;
                        return;
                    case 155:
                        this.f24086H = m31551r(j);
                        return;
                    case 159:
                        m31553t(i);
                        this.f24125t.f23243O = (int) j;
                        return;
                    case 176:
                        m31553t(i);
                        this.f24125t.f23266m = (int) j;
                        return;
                    case 179:
                        m31552s(i);
                        this.f24080B.mo22355c(m31551r(j));
                        return;
                    case 186:
                        m31553t(i);
                        this.f24125t.f23267n = (int) j;
                        return;
                    case 215:
                        m31553t(i);
                        this.f24125t.f23256c = (int) j;
                        return;
                    case 231:
                        this.f24079A = m31551r(j);
                        return;
                    case 238:
                        this.f24093O = (int) j;
                        return;
                    case 241:
                        if (!this.f24082D) {
                            m31552s(i);
                            this.f24081C.mo22355c(j);
                            this.f24082D = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f24094P = true;
                        return;
                    case 16871:
                        m31553t(i);
                        this.f24125t.f23260g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw C5464px.zza(sb.toString(), (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw C5464px.zza(sb2.toString(), (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw C5464px.zza(sb3.toString(), (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw C5464px.zza(sb4.toString(), (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw C5464px.zza(sb5.toString(), (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f24128w = j + this.f24121p;
                        return;
                    case 21432:
                        m31553t(i);
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f24125t.f23276w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f24125t.f23276w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f24125t.f23276w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f24125t.f23276w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m31553t(i);
                        this.f24125t.f23268o = (int) j;
                        return;
                    case 21682:
                        m31553t(i);
                        this.f24125t.f23270q = (int) j;
                        return;
                    case 21690:
                        m31553t(i);
                        this.f24125t.f23269p = (int) j;
                        return;
                    case 21930:
                        m31553t(i);
                        C5541s sVar2 = this.f24125t;
                        if (j == 1) {
                            z = true;
                        }
                        sVar2.f23249U = z;
                        return;
                    case 21998:
                        m31553t(i);
                        this.f24125t.f23259f = (int) j;
                        return;
                    case 22186:
                        m31553t(i);
                        this.f24125t.f23246R = j;
                        return;
                    case 22203:
                        m31553t(i);
                        this.f24125t.f23247S = j;
                        return;
                    case 25188:
                        m31553t(i);
                        this.f24125t.f23244P = (int) j;
                        return;
                    case 30321:
                        m31553t(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f24125t.f23271r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f24125t.f23271r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f24125t.f23271r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f24125t.f23271r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m31553t(i);
                        this.f24125t.f23258e = (int) j;
                        return;
                    case 2807729:
                        this.f24122q = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m31553t(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f24125t.f23229A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f24125t.f23229A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m31553t(i);
                                int b = dy3.m22756b((int) j);
                                if (b != -1) {
                                    this.f24125t.f23279z = b;
                                    return;
                                }
                                return;
                            case 21947:
                                m31553t(i);
                                this.f24125t.f23277x = true;
                                int a = dy3.m22755a((int) j);
                                if (a != -1) {
                                    this.f24125t.f23278y = a;
                                    return;
                                }
                                return;
                            case 21948:
                                m31553t(i);
                                this.f24125t.f23230B = (int) j;
                                return;
                            case 21949:
                                m31553t(i);
                                this.f24125t.f23231C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw C5464px.zza(sb6.toString(), (Throwable) null);
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw C5464px.zza(sb7.toString(), (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo21199k(int i, long j, long j2) throws C5464px {
        gs1.m24484b(this.f24104Z);
        if (i == 160) {
            this.f24094P = false;
        } else if (i == 174) {
            this.f24125t = new C5541s((C5504r) null);
        } else if (i == 187) {
            this.f24082D = false;
        } else if (i == 19899) {
            this.f24127v = -1;
            this.f24128w = -1;
        } else if (i == 20533) {
            m31553t(i);
            this.f24125t.f23261h = true;
        } else if (i == 21968) {
            m31553t(i);
            this.f24125t.f23277x = true;
        } else if (i == 408125543) {
            long j3 = this.f24121p;
            if (j3 == -1 || j3 == j) {
                this.f24121p = j;
                this.f24120o = j2;
                return;
            }
            throw C5464px.zza("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.f24080B = new za2(32);
            this.f24081C = new za2(32);
        } else if (i != 524531317 || this.f24126u) {
        } else {
            if (!this.f24108c || this.f24130y == -1) {
                this.f24104Z.mo15723r(new y94(this.f24124s, 0));
                this.f24126u = true;
                return;
            }
            this.f24129x = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo21200l(int i, String str) throws C5464px {
        if (i == 134) {
            m31553t(i);
            this.f24125t.f23255b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m31553t(i);
                this.f24125t.f23254a = str;
            } else if (i == 2274716) {
                m31553t(i);
                this.f24125t.f23251W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw C5464px.zza(sb.toString(), (Throwable) null);
        }
    }
}
