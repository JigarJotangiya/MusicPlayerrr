package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.gh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5115gh implements C5447pg {

    /* renamed from: Z */
    private static final byte[] f17045Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0 */
    private static final byte[] f17046a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public static final UUID f17047b0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private C5415ol f17048A;

    /* renamed from: B */
    private C5415ol f17049B;

    /* renamed from: C */
    private boolean f17050C;

    /* renamed from: D */
    private int f17051D;

    /* renamed from: E */
    private long f17052E;

    /* renamed from: F */
    private long f17053F;

    /* renamed from: G */
    private int f17054G;

    /* renamed from: H */
    private int f17055H;

    /* renamed from: I */
    private int[] f17056I;

    /* renamed from: J */
    private int f17057J;

    /* renamed from: K */
    private int f17058K;

    /* renamed from: L */
    private int f17059L;

    /* renamed from: M */
    private int f17060M;

    /* renamed from: N */
    private boolean f17061N;

    /* renamed from: O */
    private boolean f17062O;

    /* renamed from: P */
    private boolean f17063P;

    /* renamed from: Q */
    private boolean f17064Q;

    /* renamed from: R */
    private byte f17065R;

    /* renamed from: S */
    private int f17066S;

    /* renamed from: T */
    private int f17067T;

    /* renamed from: U */
    private int f17068U;

    /* renamed from: V */
    private boolean f17069V;

    /* renamed from: W */
    private boolean f17070W;

    /* renamed from: X */
    private C5484qg f17071X;

    /* renamed from: Y */
    private final C4892ah f17072Y;

    /* renamed from: a */
    private final C5189ih f17073a;

    /* renamed from: b */
    private final SparseArray<C5078fh> f17074b;

    /* renamed from: c */
    private final boolean f17075c;

    /* renamed from: d */
    private final C5600tl f17076d;

    /* renamed from: e */
    private final C5600tl f17077e;

    /* renamed from: f */
    private final C5600tl f17078f;

    /* renamed from: g */
    private final C5600tl f17079g;

    /* renamed from: h */
    private final C5600tl f17080h;

    /* renamed from: i */
    private final C5600tl f17081i;

    /* renamed from: j */
    private final C5600tl f17082j;

    /* renamed from: k */
    private final C5600tl f17083k;

    /* renamed from: l */
    private final C5600tl f17084l;

    /* renamed from: m */
    private ByteBuffer f17085m;

    /* renamed from: n */
    private long f17086n;

    /* renamed from: o */
    private long f17087o = -1;

    /* renamed from: p */
    private long f17088p = -9223372036854775807L;

    /* renamed from: q */
    private long f17089q = -9223372036854775807L;

    /* renamed from: r */
    private long f17090r = -9223372036854775807L;

    /* renamed from: s */
    private C5078fh f17091s;

    /* renamed from: t */
    private boolean f17092t;

    /* renamed from: u */
    private int f17093u;

    /* renamed from: v */
    private long f17094v;

    /* renamed from: w */
    private boolean f17095w;

    /* renamed from: x */
    private long f17096x = -1;

    /* renamed from: y */
    private long f17097y = -1;

    /* renamed from: z */
    private long f17098z = -9223372036854775807L;

    public C5115gh(int i) {
        C4892ah ahVar = new C4892ah();
        this.f17072Y = ahVar;
        ahVar.mo15783b(new C4966ch(this, (C4929bh) null));
        this.f17075c = true;
        this.f17073a = new C5189ih();
        this.f17074b = new SparseArray<>();
        this.f17078f = new C5600tl(4);
        this.f17079g = new C5600tl(ByteBuffer.allocate(4).putInt(-1).array());
        this.f17080h = new C5600tl(4);
        this.f17076d = new C5600tl(C5526rl.f22891a);
        this.f17077e = new C5600tl(4);
        this.f17081i = new C5600tl();
        this.f17082j = new C5600tl();
        this.f17083k = new C5600tl(8);
        this.f17084l = new C5600tl();
    }

    /* renamed from: l */
    static final int m24328l(int i) {
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
            case 241:
            case 251:
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
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
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
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    static final boolean m24329m(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: n */
    private final long m24330n(long j) throws C5445pe {
        long j2 = this.f17088p;
        if (j2 != -9223372036854775807L) {
            return C4934bm.m21440j(j, j2, 1000);
        }
        throw new C5445pe("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: o */
    private final void m24331o(C5078fh fhVar, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(fhVar.f16602a)) {
            byte[] bArr2 = this.f17082j.f23918a;
            long j2 = this.f17053F;
            if (j2 == -9223372036854775807L) {
                bArr = f17046a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = C4934bm.m21447q(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (i3 * 1000000))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            C5743xg xgVar = fhVar.f16600O;
            C5600tl tlVar = this.f17082j;
            xgVar.mo21513b(tlVar, tlVar.mo21085d());
            this.f17068U += this.f17082j.mo21085d();
        }
        fhVar.f16600O.mo21514c(j, this.f17059L, this.f17068U, 0, fhVar.f16608g);
        this.f17069V = true;
        m24332p();
    }

    /* renamed from: p */
    private final void m24332p() {
        this.f17060M = 0;
        this.f17068U = 0;
        this.f17067T = 0;
        this.f17061N = false;
        this.f17062O = false;
        this.f17064Q = false;
        this.f17066S = 0;
        this.f17065R = 0;
        this.f17063P = false;
        this.f17081i.mo21099r();
    }

    /* renamed from: q */
    private static int[] m24333q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: r */
    private final int m24334r(C5410og ogVar, C5743xg xgVar, int i) throws IOException, InterruptedException {
        int i2;
        int a = this.f17081i.mo21082a();
        if (a > 0) {
            i2 = Math.min(i, a);
            xgVar.mo21513b(this.f17081i, i2);
        } else {
            i2 = xgVar.mo21515d(ogVar, i, false);
        }
        this.f17060M += i2;
        this.f17068U += i2;
        return i2;
    }

    /* renamed from: s */
    private final void m24335s(C5410og ogVar, int i) throws IOException, InterruptedException {
        if (this.f17078f.mo21085d() < i) {
            if (this.f17078f.mo21083b() < i) {
                C5600tl tlVar = this.f17078f;
                byte[] bArr = tlVar.f23918a;
                int length = bArr.length;
                tlVar.mo21101t(Arrays.copyOf(bArr, Math.max(length + length, i)), this.f17078f.mo21085d());
            }
            C5600tl tlVar2 = this.f17078f;
            ogVar.mo19988h(tlVar2.f23918a, tlVar2.mo21085d(), i - this.f17078f.mo21085d(), false);
            this.f17078f.mo21102u(i);
        }
    }

    /* renamed from: t */
    private final void m24336t(C5410og ogVar, C5078fh fhVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(fhVar.f16602a)) {
            int i3 = i + 32;
            if (this.f17082j.mo21083b() < i3) {
                this.f17082j.f23918a = Arrays.copyOf(f17045Z, i3 + i);
            }
            ogVar.mo19988h(this.f17082j.f23918a, 32, i, false);
            this.f17082j.mo21103v(0);
            this.f17082j.mo21102u(i3);
            return;
        }
        C5743xg xgVar = fhVar.f16600O;
        if (!this.f17061N) {
            if (fhVar.f16606e) {
                this.f17059L &= -1073741825;
                int i4 = 128;
                if (!this.f17062O) {
                    ogVar.mo19988h(this.f17078f.f23918a, 0, 1, false);
                    this.f17060M++;
                    byte b = this.f17078f.f23918a[0];
                    if ((b & 128) != 128) {
                        this.f17065R = b;
                        this.f17062O = true;
                    } else {
                        throw new C5445pe("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.f17065R;
                if ((b2 & 1) == 1) {
                    byte b3 = b2 & 2;
                    this.f17059L |= 1073741824;
                    if (!this.f17063P) {
                        ogVar.mo19988h(this.f17083k.f23918a, 0, 8, false);
                        this.f17060M += 8;
                        this.f17063P = true;
                        C5600tl tlVar = this.f17078f;
                        byte[] bArr = tlVar.f23918a;
                        if (b3 != 2) {
                            i4 = 0;
                        }
                        bArr[0] = (byte) (i4 | 8);
                        tlVar.mo21103v(0);
                        xgVar.mo21513b(this.f17078f, 1);
                        this.f17068U++;
                        this.f17083k.mo21103v(0);
                        xgVar.mo21513b(this.f17083k, 8);
                        this.f17068U += 8;
                    }
                    if (b3 == 2) {
                        if (!this.f17064Q) {
                            ogVar.mo19988h(this.f17078f.f23918a, 0, 1, false);
                            this.f17060M++;
                            this.f17078f.mo21103v(0);
                            this.f17066S = this.f17078f.mo21088g();
                            this.f17064Q = true;
                        }
                        int i5 = this.f17066S * 4;
                        this.f17078f.mo21100s(i5);
                        ogVar.mo19988h(this.f17078f.f23918a, 0, i5, false);
                        this.f17060M += i5;
                        int i6 = (this.f17066S >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.f17085m;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f17085m = ByteBuffer.allocate(i7);
                        }
                        this.f17085m.position(0);
                        this.f17085m.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f17066S;
                            if (i8 >= i2) {
                                break;
                            }
                            int i10 = this.f17078f.mo21090i();
                            if (i8 % 2 == 0) {
                                this.f17085m.putShort((short) (i10 - i9));
                            } else {
                                this.f17085m.putInt(i10 - i9);
                            }
                            i8++;
                            i9 = i10;
                        }
                        int i11 = (i - this.f17060M) - i9;
                        if ((i2 & 1) == 1) {
                            this.f17085m.putInt(i11);
                        } else {
                            this.f17085m.putShort((short) i11);
                            this.f17085m.putInt(0);
                        }
                        this.f17084l.mo21101t(this.f17085m.array(), i7);
                        xgVar.mo21513b(this.f17084l, i7);
                        this.f17068U += i7;
                    }
                }
            } else {
                byte[] bArr2 = fhVar.f16607f;
                if (bArr2 != null) {
                    this.f17081i.mo21101t(bArr2, bArr2.length);
                }
            }
            this.f17061N = true;
        }
        int d = i + this.f17081i.mo21085d();
        if (!"V_MPEG4/ISO/AVC".equals(fhVar.f16602a) && !"V_MPEGH/ISO/HEVC".equals(fhVar.f16602a)) {
            while (true) {
                int i12 = this.f17060M;
                if (i12 >= d) {
                    break;
                }
                m24334r(ogVar, xgVar, d - i12);
            }
        } else {
            byte[] bArr3 = this.f17077e.f23918a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = fhVar.f16601P;
            int i14 = 4 - i13;
            while (this.f17060M < d) {
                int i15 = this.f17067T;
                if (i15 == 0) {
                    int min = Math.min(i13, this.f17081i.mo21082a());
                    ogVar.mo19988h(bArr3, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.f17081i.mo21098q(bArr3, i14, min);
                    }
                    this.f17060M += i13;
                    this.f17077e.mo21103v(0);
                    this.f17067T = this.f17077e.mo21090i();
                    this.f17076d.mo21103v(0);
                    xgVar.mo21513b(this.f17076d, 4);
                    this.f17068U += 4;
                } else {
                    this.f17067T = i15 - m24334r(ogVar, xgVar, i15);
                }
            }
        }
        if ("A_VORBIS".equals(fhVar.f16602a)) {
            this.f17079g.mo21103v(0);
            xgVar.mo21513b(this.f17079g, 4);
            this.f17068U += 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17911b(int i) throws C5445pe {
        C5669vg vgVar;
        C5415ol olVar;
        C5415ol olVar2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.f17091s.f16602a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    C5078fh fhVar = this.f17091s;
                    fhVar.mo17532b(this.f17071X, fhVar.f16603b);
                    SparseArray<C5078fh> sparseArray = this.f17074b;
                    C5078fh fhVar2 = this.f17091s;
                    sparseArray.put(fhVar2.f16603b, fhVar2);
                }
                this.f17091s = null;
            } else if (i == 19899) {
                int i4 = this.f17093u;
                if (i4 != -1) {
                    long j = this.f17094v;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.f17096x = j;
                            return;
                        }
                        return;
                    }
                }
                throw new C5445pe("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                C5078fh fhVar3 = this.f17091s;
                if (!fhVar3.f16606e) {
                    return;
                }
                if (fhVar3.f16608g != null) {
                    fhVar3.f16610i = new zzarf(new zzare(C5740xd.f25755b, "video/webm", this.f17091s.f16608g.f25384b, false));
                    return;
                }
                throw new C5445pe("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                C5078fh fhVar4 = this.f17091s;
                if (fhVar4.f16606e && fhVar4.f16607f != null) {
                    throw new C5445pe("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f17088p == -9223372036854775807L) {
                    this.f17088p = 1000000;
                }
                long j2 = this.f17089q;
                if (j2 != -9223372036854775807L) {
                    this.f17090r = m24330n(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.f17092t) {
                    C5484qg qgVar = this.f17071X;
                    if (this.f17087o == -1 || this.f17090r == -9223372036854775807L || (olVar = this.f17048A) == null || olVar.mo20016a() == 0 || (olVar2 = this.f17049B) == null || olVar2.mo20016a() != this.f17048A.mo20016a()) {
                        this.f17048A = null;
                        this.f17049B = null;
                        vgVar = new C5632ug(this.f17090r);
                    } else {
                        int a = this.f17048A.mo20016a();
                        int[] iArr = new int[a];
                        long[] jArr = new long[a];
                        long[] jArr2 = new long[a];
                        long[] jArr3 = new long[a];
                        for (int i5 = 0; i5 < a; i5++) {
                            jArr3[i5] = this.f17048A.mo20017b(i5);
                            jArr[i5] = this.f17087o + this.f17049B.mo20017b(i5);
                        }
                        while (true) {
                            i2 = a - 1;
                            if (i3 >= i2) {
                                break;
                            }
                            int i6 = i3 + 1;
                            iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                            jArr2[i3] = jArr3[i6] - jArr3[i3];
                            i3 = i6;
                        }
                        iArr[i2] = (int) ((this.f17087o + this.f17086n) - jArr[i2]);
                        jArr2[i2] = this.f17090r - jArr3[i2];
                        this.f17048A = null;
                        this.f17049B = null;
                        vgVar = new C5373ng(iArr, jArr, jArr2, jArr3);
                    }
                    qgVar.mo17941j(vgVar);
                    this.f17092t = true;
                }
            } else if (this.f17074b.size() != 0) {
                this.f17071X.mo17935a();
            } else {
                throw new C5445pe("No valid tracks were found");
            }
        } else if (this.f17051D == 2) {
            if (!this.f17070W) {
                this.f17059L |= 1;
            }
            m24331o(this.f17074b.get(this.f17057J), this.f17052E);
            this.f17051D = 0;
        }
    }

    /* renamed from: c */
    public final boolean mo17912c(C5410og ogVar) throws IOException, InterruptedException {
        return new C5152hh().mo18142a(ogVar);
    }

    /* renamed from: d */
    public final void mo17913d(C5484qg qgVar) {
        this.f17071X = qgVar;
    }

    /* renamed from: e */
    public final void mo17914e(long j, long j2) {
        this.f17098z = -9223372036854775807L;
        this.f17051D = 0;
        this.f17072Y.mo15782a();
        this.f17073a.mo18332d();
        m24332p();
    }

    /* renamed from: f */
    public final int mo17915f(C5410og ogVar, C5595tg tgVar) throws IOException, InterruptedException {
        this.f17069V = false;
        while (!this.f17069V) {
            if (!this.f17072Y.mo15784c(ogVar)) {
                return -1;
            }
            long d = ogVar.mo19984d();
            if (this.f17095w) {
                this.f17097y = d;
                tgVar.f23851a = this.f17096x;
                this.f17095w = false;
                return 1;
            } else if (this.f17092t) {
                long j = this.f17097y;
                if (j != -1) {
                    tgVar.f23851a = j;
                    this.f17097y = -1;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo17916g(int i, double d) {
        if (i == 181) {
            this.f17091s.f16594I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f17091s.f16624w = (float) d;
                    return;
                case 21970:
                    this.f17091s.f16625x = (float) d;
                    return;
                case 21971:
                    this.f17091s.f16626y = (float) d;
                    return;
                case 21972:
                    this.f17091s.f16627z = (float) d;
                    return;
                case 21973:
                    this.f17091s.f16586A = (float) d;
                    return;
                case 21974:
                    this.f17091s.f16587B = (float) d;
                    return;
                case 21975:
                    this.f17091s.f16588C = (float) d;
                    return;
                case 21976:
                    this.f17091s.f16589D = (float) d;
                    return;
                case 21977:
                    this.f17091s.f16590E = (float) d;
                    return;
                case 21978:
                    this.f17091s.f16591F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f17089q = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo17917h(int i, long j) throws C5445pe {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f17091s.f16604c = (int) j;
                        return;
                    case 136:
                        C5078fh fhVar = this.f17091s;
                        if (j == 1) {
                            z = true;
                        }
                        fhVar.f16597L = z;
                        return;
                    case 155:
                        this.f17053F = m24330n(j);
                        return;
                    case 159:
                        this.f17091s.f16592G = (int) j;
                        return;
                    case 176:
                        this.f17091s.f16611j = (int) j;
                        return;
                    case 179:
                        this.f17048A.mo20018c(m24330n(j));
                        return;
                    case 186:
                        this.f17091s.f16612k = (int) j;
                        return;
                    case 215:
                        this.f17091s.f16603b = (int) j;
                        return;
                    case 231:
                        this.f17098z = m24330n(j);
                        return;
                    case 241:
                        if (!this.f17050C) {
                            this.f17049B.mo20018c(j);
                            this.f17050C = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f17070W = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new C5445pe(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new C5445pe(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new C5445pe(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new C5445pe(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new C5445pe(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.f17094v = j + this.f17087o;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f17091s.f16617p = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f17091s.f16617p = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f17091s.f16617p = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f17091s.f16617p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f17091s.f16613l = (int) j;
                        return;
                    case 21682:
                        this.f17091s.f16615n = (int) j;
                        return;
                    case 21690:
                        this.f17091s.f16614m = (int) j;
                        return;
                    case 21930:
                        C5078fh fhVar2 = this.f17091s;
                        if (j == 1) {
                            z = true;
                        }
                        fhVar2.f16598M = z;
                        return;
                    case 22186:
                        this.f17091s.f16595J = j;
                        return;
                    case 22203:
                        this.f17091s.f16596K = j;
                        return;
                    case 25188:
                        this.f17091s.f16593H = (int) j;
                        return;
                    case 2352003:
                        this.f17091s.f16605d = (int) j;
                        return;
                    case 2807729:
                        this.f17088p = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.f17091s.f16621t = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.f17091s.f16621t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.f17091s.f16620s = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.f17091s.f16620s = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.f17091s.f16620s = 3;
                                return;
                            case 21947:
                                C5078fh fhVar3 = this.f17091s;
                                fhVar3.f16618q = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    fhVar3.f16619r = 1;
                                    return;
                                } else if (i5 == 9) {
                                    fhVar3.f16619r = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    fhVar3.f16619r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f17091s.f16622u = (int) j;
                                return;
                            case 21949:
                                this.f17091s.f16623v = (int) j;
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
                throw new C5445pe(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new C5445pe(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo17918i(int i, long j, long j2) throws C5445pe {
        if (i == 160) {
            this.f17070W = false;
        } else if (i == 174) {
            this.f17091s = new C5078fh((C5003dh) null);
        } else if (i == 187) {
            this.f17050C = false;
        } else if (i == 19899) {
            this.f17093u = -1;
            this.f17094v = -1;
        } else if (i == 20533) {
            this.f17091s.f16606e = true;
        } else if (i == 21968) {
            this.f17091s.f16618q = true;
        } else if (i == 408125543) {
            long j3 = this.f17087o;
            if (j3 == -1 || j3 == j) {
                this.f17087o = j;
                this.f17086n = j2;
                return;
            }
            throw new C5445pe("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f17048A = new C5415ol(32);
            this.f17049B = new C5415ol(32);
        } else if (i != 524531317 || this.f17092t) {
        } else {
            if (!this.f17075c || this.f17096x == -1) {
                this.f17071X.mo17941j(new C5632ug(this.f17090r));
                this.f17092t = true;
                return;
            }
            this.f17095w = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo17919j(int i, String str) throws C5445pe {
        if (i == 134) {
            this.f17091s.f16602a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.f17091s.f16599N = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new C5445pe(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ed, code lost:
        throw new com.google.android.gms.internal.ads.C5445pe("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023e  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17920k(int r19, int r20, com.google.android.gms.internal.ads.C5410og r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r7 = 0
            if (r1 == r4) goto L_0x008b
            if (r1 == r5) goto L_0x008b
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0081
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0072
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0053
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0049
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0030
            com.google.android.gms.internal.ads.fh r1 = r0.f17091s
            byte[] r4 = new byte[r2]
            r1.f16616o = r4
            r3.mo19988h(r4, r7, r2, r7)
            return
        L_0x0030:
            com.google.android.gms.internal.ads.pe r2 = new com.google.android.gms.internal.ads.pe
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 26
            r3.<init>(r4)
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0049:
            com.google.android.gms.internal.ads.fh r1 = r0.f17091s
            byte[] r4 = new byte[r2]
            r1.f16609h = r4
            r3.mo19988h(r4, r7, r2, r7)
            return
        L_0x0053:
            com.google.android.gms.internal.ads.tl r1 = r0.f17080h
            byte[] r1 = r1.f23918a
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.tl r1 = r0.f17080h
            byte[] r1 = r1.f23918a
            int r4 = 4 - r2
            r3.mo19988h(r1, r4, r2, r7)
            com.google.android.gms.internal.ads.tl r1 = r0.f17080h
            r1.mo21103v(r7)
            com.google.android.gms.internal.ads.tl r1 = r0.f17080h
            long r1 = r1.mo21094m()
            int r2 = (int) r1
            r0.f17093u = r2
            return
        L_0x0072:
            byte[] r1 = new byte[r2]
            r3.mo19988h(r1, r7, r2, r7)
            com.google.android.gms.internal.ads.fh r2 = r0.f17091s
            com.google.android.gms.internal.ads.wg r3 = new com.google.android.gms.internal.ads.wg
            r3.<init>(r6, r1)
            r2.f16608g = r3
            return
        L_0x0081:
            com.google.android.gms.internal.ads.fh r1 = r0.f17091s
            byte[] r4 = new byte[r2]
            r1.f16607f = r4
            r3.mo19988h(r4, r7, r2, r7)
            return
        L_0x008b:
            int r4 = r0.f17051D
            r8 = 8
            if (r4 != 0) goto L_0x00b0
            com.google.android.gms.internal.ads.ih r4 = r0.f17073a
            long r9 = r4.mo18333e(r3, r7, r6, r8)
            int r4 = (int) r9
            r0.f17057J = r4
            com.google.android.gms.internal.ads.ih r4 = r0.f17073a
            int r4 = r4.mo18331a()
            r0.f17058K = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f17053F = r9
            r0.f17051D = r6
            com.google.android.gms.internal.ads.tl r4 = r0.f17078f
            r4.mo21099r()
        L_0x00b0:
            android.util.SparseArray<com.google.android.gms.internal.ads.fh> r4 = r0.f17074b
            int r9 = r0.f17057J
            java.lang.Object r4 = r4.get(r9)
            com.google.android.gms.internal.ads.fh r4 = (com.google.android.gms.internal.ads.C5078fh) r4
            if (r4 != 0) goto L_0x00c6
            int r1 = r0.f17058K
            int r1 = r2 - r1
            r3.mo19989i(r1, r7)
            r0.f17051D = r7
            return
        L_0x00c6:
            int r9 = r0.f17051D
            if (r9 != r6) goto L_0x0258
            r9 = 3
            r0.m24335s(r3, r9)
            com.google.android.gms.internal.ads.tl r10 = r0.f17078f
            byte[] r10 = r10.f23918a
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r6
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00ef
            r0.f17055H = r6
            int[] r9 = r0.f17056I
            int[] r9 = m24333q(r9, r6)
            r0.f17056I = r9
            int r10 = r0.f17058K
            int r2 = r2 - r10
            int r2 = r2 + -3
            r9[r7] = r2
            goto L_0x01ff
        L_0x00ef:
            if (r1 != r5) goto L_0x0250
            r13 = 4
            r0.m24335s(r3, r13)
            com.google.android.gms.internal.ads.tl r14 = r0.f17078f
            byte[] r14 = r14.f23918a
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r6
            r0.f17055H = r14
            int[] r15 = r0.f17056I
            int[] r14 = m24333q(r15, r14)
            r0.f17056I = r14
            if (r10 != r11) goto L_0x0116
            int r9 = r0.f17058K
            int r10 = r0.f17055H
            int r2 = r2 - r9
            int r2 = r2 + -4
            int r2 = r2 / r10
            java.util.Arrays.fill(r14, r7, r10, r2)
            goto L_0x01ff
        L_0x0116:
            if (r10 != r6) goto L_0x014b
            r9 = 0
            r10 = 0
        L_0x011a:
            int r14 = r0.f17055H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x0140
            int[] r14 = r0.f17056I
            r14[r9] = r7
        L_0x0124:
            int r13 = r13 + r6
            r0.m24335s(r3, r13)
            com.google.android.gms.internal.ads.tl r14 = r0.f17078f
            byte[] r14 = r14.f23918a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.f17056I
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0124
            int r10 = r10 + r16
            int r9 = r9 + 1
            goto L_0x011a
        L_0x0140:
            int[] r9 = r0.f17056I
            int r15 = r0.f17058K
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x01ff
        L_0x014b:
            if (r10 != r9) goto L_0x0248
            r9 = 0
            r10 = 0
        L_0x014f:
            int r14 = r0.f17055H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x01f6
            int[] r14 = r0.f17056I
            r14[r9] = r7
            int r13 = r13 + 1
            r0.m24335s(r3, r13)
            int r14 = r13 + -1
            com.google.android.gms.internal.ads.tl r15 = r0.f17078f
            byte[] r15 = r15.f23918a
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x01ee
            r15 = 0
        L_0x0169:
            if (r15 >= r8) goto L_0x01bd
            int r16 = 7 - r15
            int r5 = r6 << r16
            com.google.android.gms.internal.ads.tl r11 = r0.f17078f
            byte[] r11 = r11.f23918a
            byte r11 = r11[r14]
            r11 = r11 & r5
            if (r11 == 0) goto L_0x01b2
            int r13 = r13 + r15
            r0.m24335s(r3, r13)
            int r11 = r14 + 1
            com.google.android.gms.internal.ads.tl r6 = r0.f17078f
            byte[] r6 = r6.f23918a
            byte r6 = r6[r14]
            r6 = r6 & r12
            int r5 = ~r5
            r5 = r5 & r6
            long r5 = (long) r5
        L_0x0188:
            if (r11 >= r13) goto L_0x01a0
            int r14 = r11 + 1
            long r5 = r5 << r8
            com.google.android.gms.internal.ads.tl r8 = r0.f17078f
            byte[] r8 = r8.f23918a
            byte r8 = r8[r11]
            r8 = r8 & r12
            r17 = r13
            long r12 = (long) r8
            long r5 = r5 | r12
            r11 = r14
            r13 = r17
            r8 = 8
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0188
        L_0x01a0:
            r17 = r13
            if (r9 <= 0) goto L_0x01af
            r12 = 1
            int r15 = r15 * 7
            int r15 = r15 + 6
            long r12 = r12 << r15
            r14 = -1
            long r12 = r12 + r14
            long r5 = r5 - r12
        L_0x01af:
            r13 = r17
            goto L_0x01bf
        L_0x01b2:
            int r15 = r15 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0169
        L_0x01bd:
            r5 = 0
        L_0x01bf:
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x01e6
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x01e6
            int r6 = (int) r5
            int[] r5 = r0.f17056I
            if (r9 == 0) goto L_0x01d7
            int r8 = r9 + -1
            r8 = r5[r8]
            int r6 = r6 + r8
        L_0x01d7:
            r5[r9] = r6
            int r10 = r10 + r6
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x014f
        L_0x01e6:
            com.google.android.gms.internal.ads.pe r1 = new com.google.android.gms.internal.ads.pe
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01ee:
            com.google.android.gms.internal.ads.pe r1 = new com.google.android.gms.internal.ads.pe
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x01f6:
            int[] r5 = r0.f17056I
            int r6 = r0.f17058K
            int r2 = r2 - r6
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x01ff:
            com.google.android.gms.internal.ads.tl r2 = r0.f17078f
            byte[] r2 = r2.f23918a
            byte r5 = r2[r7]
            r6 = 1
            byte r2 = r2[r6]
            long r8 = r0.f17098z
            r6 = 8
            int r5 = r5 << r6
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = (long) r2
            long r5 = r0.m24330n(r5)
            long r8 = r8 + r5
            r0.f17052E = r8
            com.google.android.gms.internal.ads.tl r2 = r0.f17078f
            byte[] r2 = r2.f23918a
            r5 = 2
            byte r2 = r2[r5]
            r6 = r2 & 8
            int r8 = r4.f16604c
            if (r8 == r5) goto L_0x0236
            r5 = 163(0xa3, float:2.28E-43)
            if (r1 != r5) goto L_0x0234
            r1 = 128(0x80, float:1.794E-43)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x0232
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x0236
        L_0x0232:
            r1 = 163(0xa3, float:2.28E-43)
        L_0x0234:
            r2 = 0
            goto L_0x0237
        L_0x0236:
            r2 = 1
        L_0x0237:
            r5 = 8
            if (r6 != r5) goto L_0x023e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x023f
        L_0x023e:
            r5 = 0
        L_0x023f:
            r2 = r2 | r5
            r0.f17059L = r2
            r2 = 2
            r0.f17051D = r2
            r0.f17054G = r7
            goto L_0x0258
        L_0x0248:
            com.google.android.gms.internal.ads.pe r1 = new com.google.android.gms.internal.ads.pe
            java.lang.String r2 = "Unexpected lacing value: 2"
            r1.<init>(r2)
            throw r1
        L_0x0250:
            com.google.android.gms.internal.ads.pe r1 = new com.google.android.gms.internal.ads.pe
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x0258:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x0282
        L_0x025c:
            int r1 = r0.f17054G
            int r2 = r0.f17055H
            if (r1 >= r2) goto L_0x027f
            int[] r2 = r0.f17056I
            r1 = r2[r1]
            r0.m24336t(r3, r4, r1)
            long r1 = r0.f17052E
            int r5 = r0.f17054G
            int r6 = r4.f16605d
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.m24331o(r4, r1)
            int r1 = r0.f17054G
            r2 = 1
            int r1 = r1 + r2
            r0.f17054G = r1
            goto L_0x025c
        L_0x027f:
            r0.f17051D = r7
            return
        L_0x0282:
            int[] r1 = r0.f17056I
            r1 = r1[r7]
            r0.m24336t(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5115gh.mo17920k(int, int, com.google.android.gms.internal.ads.og):void");
    }
}
