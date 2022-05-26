package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.ii */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C5190ii extends C5703wd {

    /* renamed from: P */
    private static final byte[] f18005P = C4934bm.m21446p("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private ByteBuffer[] f18006A;

    /* renamed from: B */
    private ByteBuffer[] f18007B;

    /* renamed from: C */
    private long f18008C;

    /* renamed from: D */
    private int f18009D;

    /* renamed from: E */
    private int f18010E;

    /* renamed from: F */
    private boolean f18011F;

    /* renamed from: G */
    private boolean f18012G;

    /* renamed from: H */
    private int f18013H;

    /* renamed from: I */
    private int f18014I;

    /* renamed from: J */
    private boolean f18015J;

    /* renamed from: K */
    private boolean f18016K;

    /* renamed from: L */
    private boolean f18017L;

    /* renamed from: M */
    private boolean f18018M;

    /* renamed from: N */
    private boolean f18019N;

    /* renamed from: O */
    protected C5188ig f18020O;

    /* renamed from: i */
    private final C5264ki f18021i;

    /* renamed from: j */
    private final C5225jg f18022j;

    /* renamed from: k */
    private final C5225jg f18023k;

    /* renamed from: l */
    private final C5371ne f18024l;

    /* renamed from: m */
    private final List<Long> f18025m;

    /* renamed from: n */
    private final MediaCodec.BufferInfo f18026n;

    /* renamed from: o */
    private zzapg f18027o;

    /* renamed from: p */
    private MediaCodec f18028p;

    /* renamed from: q */
    private C5116gi f18029q;

    /* renamed from: r */
    private boolean f18030r;

    /* renamed from: s */
    private boolean f18031s;

    /* renamed from: t */
    private boolean f18032t;

    /* renamed from: u */
    private boolean f18033u;

    /* renamed from: v */
    private boolean f18034v;

    /* renamed from: w */
    private boolean f18035w;

    /* renamed from: x */
    private boolean f18036x;

    /* renamed from: y */
    private boolean f18037y;

    /* renamed from: z */
    private boolean f18038z;

    public C5190ii(int i, C5264ki kiVar, C5336mg mgVar, boolean z) {
        super(i);
        C5304ll.m26776e(C4934bm.f14552a >= 16);
        this.f18021i = kiVar;
        this.f18022j = new C5225jg(0);
        this.f18023k = new C5225jg(0);
        this.f18024l = new C5371ne();
        this.f18025m = new ArrayList();
        this.f18026n = new MediaCodec.BufferInfo();
        this.f18013H = 0;
        this.f18014I = 0;
    }

    /* renamed from: A */
    private final void mo18403A() throws C5778yd {
        if (this.f18014I == 2) {
            mo18368X();
            mo18366V();
            return;
        }
        this.f18018M = true;
        mo18361L();
    }

    /* renamed from: C */
    private final boolean m25211C() throws C5778yd {
        MediaCodec mediaCodec = this.f18028p;
        if (mediaCodec == null || this.f18014I == 2 || this.f18017L) {
            return false;
        }
        if (this.f18009D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.f18009D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            C5225jg jgVar = this.f18022j;
            jgVar.f18474c = this.f18006A[dequeueInputBuffer];
            jgVar.mo16919b();
        }
        if (this.f18014I == 1) {
            if (!this.f18033u) {
                this.f18016K = true;
                this.f18028p.queueInputBuffer(this.f18009D, 0, 0, 0, 4);
                this.f18009D = -1;
            }
            this.f18014I = 2;
            return false;
        } else if (this.f18037y) {
            this.f18037y = false;
            ByteBuffer byteBuffer = this.f18022j.f18474c;
            byte[] bArr = f18005P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.f18028p;
            int i = this.f18009D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0, 0);
            this.f18009D = -1;
            this.f18015J = true;
            return true;
        } else {
            if (this.f18013H == 1) {
                for (int i2 = 0; i2 < this.f18027o.f27128n.size(); i2++) {
                    this.f18022j.f18474c.put(this.f18027o.f27128n.get(i2));
                }
                this.f18013H = 2;
            }
            int position = this.f18022j.f18474c.position();
            int l = mo21801l(this.f18024l, this.f18022j, false);
            if (l == -3) {
                return false;
            }
            if (l == -5) {
                if (this.f18013H == 2) {
                    this.f18022j.mo16919b();
                    this.f18013H = 1;
                }
                mo18359H(this.f18024l.f20601a);
                return true;
            } else if (this.f18022j.mo16923f()) {
                if (this.f18013H == 2) {
                    this.f18022j.mo16919b();
                    this.f18013H = 1;
                }
                this.f18017L = true;
                if (!this.f18015J) {
                    mo18403A();
                    return false;
                }
                try {
                    if (!this.f18033u) {
                        this.f18016K = true;
                        this.f18028p.queueInputBuffer(this.f18009D, 0, 0, 0, 4);
                        this.f18009D = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw C5778yd.zza(e, mo21800k());
                }
            } else if (!this.f18019N || this.f18022j.mo16924g()) {
                this.f18019N = false;
                boolean i3 = this.f18022j.mo18616i();
                if (this.f18030r && !i3) {
                    ByteBuffer byteBuffer2 = this.f18022j.f18474c;
                    byte[] bArr2 = C5526rl.f22891a;
                    int position2 = byteBuffer2.position();
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = i4 + 1;
                        if (i6 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        byte b = byteBuffer2.get(i4) & 255;
                        if (i5 == 3) {
                            if (b == 1) {
                                if ((byteBuffer2.get(i6) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i4 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                                b = 1;
                            }
                        } else if (b == 0) {
                            i5++;
                        }
                        if (b != 0) {
                            i5 = 0;
                        }
                        i4 = i6;
                    }
                    if (this.f18022j.f18474c.position() == 0) {
                        return true;
                    }
                    this.f18030r = false;
                }
                try {
                    C5225jg jgVar2 = this.f18022j;
                    long j = jgVar2.f18475d;
                    if (jgVar2.mo16922e()) {
                        this.f18025m.add(Long.valueOf(j));
                    }
                    this.f18022j.f18474c.flip();
                    mo18367W(this.f18022j);
                    if (i3) {
                        MediaCodec.CryptoInfo a = this.f18022j.f18473b.mo17904a();
                        if (position != 0) {
                            if (a.numBytesOfClearData == null) {
                                a.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = a.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.f18028p.queueSecureInputBuffer(this.f18009D, 0, a, j, 0);
                    } else {
                        this.f18028p.queueInputBuffer(this.f18009D, 0, this.f18022j.f18474c.limit(), j, 0);
                    }
                    this.f18009D = -1;
                    this.f18015J = true;
                    this.f18013H = 0;
                    this.f18020O.f17980c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw C5778yd.zza(e2, mo21800k());
                }
            } else {
                this.f18022j.mo16919b();
                if (this.f18013H == 2) {
                    this.f18013H = 1;
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C5116gi mo18355D(C5264ki kiVar, zzapg zzapg, boolean z) throws C5375ni {
        return C5560si.m30725c(zzapg.f27126l, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo18356E(C5116gi giVar, MediaCodec mediaCodec, zzapg zzapg, MediaCrypto mediaCrypto) throws C5375ni;

    /* renamed from: F */
    public boolean mo18357F() {
        return this.f18018M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo18358G(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r6.f27131q == r0.f27131q) goto L_0x0053;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18359H(com.google.android.gms.internal.ads.zzapg r6) throws com.google.android.gms.internal.ads.C5778yd {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzapg r0 = r5.f18027o
            r5.f18027o = r6
            com.google.android.gms.internal.ads.zzarf r6 = r6.f27129o
            if (r0 != 0) goto L_0x000a
            r1 = 0
            goto L_0x000c
        L_0x000a:
            com.google.android.gms.internal.ads.zzarf r1 = r0.f27129o
        L_0x000c:
            boolean r6 = com.google.android.gms.internal.ads.C4934bm.m21445o(r6, r1)
            if (r6 != 0) goto L_0x0029
            com.google.android.gms.internal.ads.zzapg r6 = r5.f18027o
            com.google.android.gms.internal.ads.zzarf r6 = r6.f27129o
            if (r6 != 0) goto L_0x0019
            goto L_0x0029
        L_0x0019:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.mo21800k()
            com.google.android.gms.internal.ads.yd r6 = com.google.android.gms.internal.ads.C5778yd.zza(r6, r0)
            throw r6
        L_0x0029:
            android.media.MediaCodec r6 = r5.f18028p
            r1 = 1
            if (r6 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.gi r2 = r5.f18029q
            boolean r2 = r2.f17103b
            com.google.android.gms.internal.ads.zzapg r3 = r5.f18027o
            boolean r6 = r5.mo18369Y(r6, r2, r0, r3)
            if (r6 == 0) goto L_0x0056
            r5.f18012G = r1
            r5.f18013H = r1
            boolean r6 = r5.f18032t
            r2 = 0
            if (r6 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.zzapg r6 = r5.f18027o
            int r3 = r6.f27130p
            int r4 = r0.f27130p
            if (r3 != r4) goto L_0x0052
            int r6 = r6.f27131q
            int r0 = r0.f27131q
            if (r6 != r0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            r5.f18037y = r1
            return
        L_0x0056:
            boolean r6 = r5.f18015J
            if (r6 == 0) goto L_0x005d
            r5.f18014I = r1
            return
        L_0x005d:
            r5.mo18368X()
            r5.mo18366V()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5190ii.mo18359H(com.google.android.gms.internal.ads.zzapg):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract void mo18360J(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C5778yd;

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo18361L() throws C5778yd {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract boolean mo18362M(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C5778yd;

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final MediaCodec mo18363N() {
        return this.f18028p;
    }

    /* renamed from: S */
    public final void mo18364S(long j, long j2) throws C5778yd {
        boolean z;
        int i;
        boolean z2;
        if (this.f18018M) {
            mo18361L();
            return;
        }
        if (this.f18027o == null) {
            this.f18023k.mo16919b();
            int l = mo21801l(this.f18024l, this.f18023k, true);
            if (l == -5) {
                mo18359H(this.f18024l.f20601a);
            } else if (l == -4) {
                C5304ll.m26776e(this.f18023k.mo16923f());
                this.f18017L = true;
                mo18403A();
                return;
            } else {
                return;
            }
        }
        mo18366V();
        if (this.f18028p != null) {
            C5786yl.m34154a("drainAndFeed");
            while (true) {
                if (this.f18010E < 0) {
                    if (!this.f18035w || !this.f18016K) {
                        i = this.f18028p.dequeueOutputBuffer(this.f18026n, 0);
                        this.f18010E = i;
                    } else {
                        try {
                            i = this.f18028p.dequeueOutputBuffer(this.f18026n, 0);
                            this.f18010E = i;
                        } catch (IllegalStateException unused) {
                            mo18403A();
                            if (this.f18018M) {
                                mo18368X();
                            }
                        }
                    }
                    if (i >= 0) {
                        if (this.f18038z) {
                            this.f18038z = false;
                            this.f18028p.releaseOutputBuffer(i, false);
                            this.f18010E = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.f18026n;
                            if ((bufferInfo.flags & 4) != 0) {
                                mo18403A();
                                this.f18010E = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.f18007B[this.f18010E];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f18026n;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j3 = this.f18026n.presentationTimeUs;
                            int size = this.f18025m.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    z2 = false;
                                    break;
                                } else if (this.f18025m.get(i2).longValue() == j3) {
                                    this.f18025m.remove(i2);
                                    z2 = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            this.f18011F = z2;
                        }
                    } else if (i == -2) {
                        MediaFormat outputFormat = this.f18028p.getOutputFormat();
                        if (this.f18032t && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.f18038z = true;
                        } else {
                            if (this.f18036x) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            mo18360J(this.f18028p, outputFormat);
                        }
                    } else if (i == -3) {
                        this.f18007B = this.f18028p.getOutputBuffers();
                    } else if (this.f18033u && (this.f18017L || this.f18014I == 2)) {
                        mo18403A();
                    }
                }
                if (!this.f18035w || !this.f18016K) {
                    MediaCodec mediaCodec = this.f18028p;
                    ByteBuffer[] byteBufferArr = this.f18007B;
                    int i3 = this.f18010E;
                    ByteBuffer byteBuffer2 = byteBufferArr[i3];
                    MediaCodec.BufferInfo bufferInfo3 = this.f18026n;
                    z = mo18362M(j, j2, mediaCodec, byteBuffer2, i3, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f18011F);
                } else {
                    try {
                        MediaCodec mediaCodec2 = this.f18028p;
                        ByteBuffer[] byteBufferArr2 = this.f18007B;
                        int i4 = this.f18010E;
                        ByteBuffer byteBuffer3 = byteBufferArr2[i4];
                        MediaCodec.BufferInfo bufferInfo4 = this.f18026n;
                        z = mo18362M(j, j2, mediaCodec2, byteBuffer3, i4, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f18011F);
                    } catch (IllegalStateException unused2) {
                        mo18403A();
                        if (this.f18018M) {
                            mo18368X();
                        }
                    }
                }
                if (!z) {
                    break;
                }
                long j4 = this.f18026n.presentationTimeUs;
                this.f18010E = -1;
            }
            do {
            } while (m25211C());
            C5786yl.m34155b();
        } else {
            mo21803y(j);
            this.f18023k.mo16919b();
            int l2 = mo21801l(this.f18024l, this.f18023k, false);
            if (l2 == -5) {
                mo18359H(this.f18024l.f20601a);
            } else if (l2 == -4) {
                C5304ll.m26776e(this.f18023k.mo16923f());
                this.f18017L = true;
                mo18403A();
            }
        }
        this.f18020O.mo18329a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final C5116gi mo18365U() {
        return this.f18029q;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015c A[Catch:{ Exception -> 0x01d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0161 A[Catch:{ Exception -> 0x01d1 }] */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18366V() throws com.google.android.gms.internal.ads.C5778yd {
        /*
            r11 = this;
            android.media.MediaCodec r0 = r11.f18028p
            if (r0 != 0) goto L_0x01e2
            com.google.android.gms.internal.ads.zzapg r0 = r11.f18027o
            if (r0 != 0) goto L_0x000a
            goto L_0x01e2
        L_0x000a:
            com.google.android.gms.internal.ads.gi r1 = r11.f18029q
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.ki r1 = r11.f18021i     // Catch:{ ni -> 0x002e }
            com.google.android.gms.internal.ads.gi r1 = r11.mo18355D(r1, r0, r3)     // Catch:{ ni -> 0x002e }
            r11.f18029q = r1     // Catch:{ ni -> 0x002e }
            if (r1 == 0) goto L_0x001b
            goto L_0x0042
        L_0x001b:
            com.google.android.gms.internal.ads.hi r0 = new com.google.android.gms.internal.ads.hi
            com.google.android.gms.internal.ads.zzapg r1 = r11.f18027o
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((com.google.android.gms.internal.ads.zzapg) r1, (java.lang.Throwable) r2, (boolean) r3, (int) r4)
            int r1 = r11.mo21800k()
            com.google.android.gms.internal.ads.yd r0 = com.google.android.gms.internal.ads.C5778yd.zza(r0, r1)
            throw r0
        L_0x002e:
            r0 = move-exception
            com.google.android.gms.internal.ads.hi r1 = new com.google.android.gms.internal.ads.hi
            com.google.android.gms.internal.ads.zzapg r2 = r11.f18027o
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.zzapg) r2, (java.lang.Throwable) r0, (boolean) r3, (int) r4)
            int r0 = r11.mo21800k()
            com.google.android.gms.internal.ads.yd r0 = com.google.android.gms.internal.ads.C5778yd.zza(r1, r0)
            throw r0
        L_0x0042:
            boolean r0 = r11.mo18370Z(r1)
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            com.google.android.gms.internal.ads.gi r0 = r11.f18029q
            java.lang.String r0 = r0.f17102a
            com.google.android.gms.internal.ads.zzapg r1 = r11.f18027o
            int r4 = com.google.android.gms.internal.ads.C4934bm.f14552a
            r5 = 21
            r10 = 1
            if (r4 >= r5) goto L_0x0068
            java.util.List<byte[]> r1 = r1.f27128n
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0068
            r1 = 1
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            r11.f18030r = r1
            r1 = 19
            r6 = 18
            if (r4 < r6) goto L_0x00a2
            if (r4 != r6) goto L_0x0083
            java.lang.String r7 = "OMX.SEC.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.SEC.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
        L_0x0083:
            if (r4 != r1) goto L_0x00a0
            java.lang.String r7 = com.google.android.gms.internal.ads.C4934bm.f14555d
            java.lang.String r8 = "SM-G800"
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = "OMX.Exynos.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.Exynos.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r7 = 0
            goto L_0x00a3
        L_0x00a2:
            r7 = 1
        L_0x00a3:
            r11.f18031s = r7
            r7 = 24
            if (r4 >= r7) goto L_0x00dd
            java.lang.String r7 = "OMX.Nvidia.h264.decode"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = "OMX.Nvidia.h264.decode.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00dd
        L_0x00b9:
            java.lang.String r7 = com.google.android.gms.internal.ads.C4934bm.f14553b
            java.lang.String r8 = "flounder"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "flounder_lte"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "grouper"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "tilapia"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00dd
        L_0x00db:
            r7 = 1
            goto L_0x00de
        L_0x00dd:
            r7 = 0
        L_0x00de:
            r11.f18032t = r7
            r7 = 17
            if (r4 > r7) goto L_0x00f6
            java.lang.String r7 = "OMX.rk.video_decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00f4
            java.lang.String r7 = "OMX.allwinner.video.decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00f6
        L_0x00f4:
            r7 = 1
            goto L_0x00f7
        L_0x00f6:
            r7 = 0
        L_0x00f7:
            r11.f18033u = r7
            r7 = 23
            if (r4 > r7) goto L_0x0108
            java.lang.String r7 = "OMX.google.vorbis.decoder"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r1 = 1
            goto L_0x0126
        L_0x0108:
            if (r4 > r1) goto L_0x0125
            java.lang.String r1 = com.google.android.gms.internal.ads.C4934bm.f14553b
            java.lang.String r7 = "hb2000"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0106
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0125
            goto L_0x0106
        L_0x0125:
            r1 = 0
        L_0x0126:
            r11.f18034v = r1
            if (r4 != r5) goto L_0x0134
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0134
            r1 = 1
            goto L_0x0135
        L_0x0134:
            r1 = 0
        L_0x0135:
            r11.f18035w = r1
            com.google.android.gms.internal.ads.zzapg r1 = r11.f18027o
            if (r4 > r6) goto L_0x0149
            int r1 = r1.f27138x
            if (r1 != r10) goto L_0x0149
            java.lang.String r1 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0149
            r1 = 1
            goto L_0x014a
        L_0x0149:
            r1 = 0
        L_0x014a:
            r11.f18036x = r1
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "createCodec:"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01d1 }
            int r7 = r6.length()     // Catch:{ Exception -> 0x01d1 }
            if (r7 == 0) goto L_0x0161
            java.lang.String r1 = r1.concat(r6)     // Catch:{ Exception -> 0x01d1 }
            goto L_0x0167
        L_0x0161:
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x01d1 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x01d1 }
            r1 = r6
        L_0x0167:
            com.google.android.gms.internal.ads.C5786yl.m34154a(r1)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x01d1 }
            r11.f18028p = r1     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.C5786yl.m34155b()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "configureCodec"
            com.google.android.gms.internal.ads.C5786yl.m34154a(r1)     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.gi r1 = r11.f18029q     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r6 = r11.f18028p     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.zzapg r7 = r11.f18027o     // Catch:{ Exception -> 0x01d1 }
            r11.mo18356E(r1, r6, r7, r2)     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.C5786yl.m34155b()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "startCodec"
            com.google.android.gms.internal.ads.C5786yl.m34154a(r1)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r11.f18028p     // Catch:{ Exception -> 0x01d1 }
            r1.start()     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.C5786yl.m34155b()     // Catch:{ Exception -> 0x01d1 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01d1 }
            long r8 = r6 - r4
            r4 = r11
            r5 = r0
            r4.mo18358G(r5, r6, r8)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r11.f18028p     // Catch:{ Exception -> 0x01d1 }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x01d1 }
            r11.f18006A = r1     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r11.f18028p     // Catch:{ Exception -> 0x01d1 }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x01d1 }
            r11.f18007B = r1     // Catch:{ Exception -> 0x01d1 }
            int r0 = r11.mo20633a()
            r1 = 2
            if (r0 != r1) goto L_0x01bb
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01c0
        L_0x01bb:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01c0:
            r11.f18008C = r0
            r0 = -1
            r11.f18009D = r0
            r11.f18010E = r0
            r11.f18019N = r10
            com.google.android.gms.internal.ads.ig r0 = r11.f18020O
            int r1 = r0.f17978a
            int r1 = r1 + r10
            r0.f17978a = r1
            return
        L_0x01d1:
            r1 = move-exception
            com.google.android.gms.internal.ads.hi r2 = new com.google.android.gms.internal.ads.hi
            com.google.android.gms.internal.ads.zzapg r4 = r11.f18027o
            r2.<init>((com.google.android.gms.internal.ads.zzapg) r4, (java.lang.Throwable) r1, (boolean) r3, (java.lang.String) r0)
            int r0 = r11.mo21800k()
            com.google.android.gms.internal.ads.yd r0 = com.google.android.gms.internal.ads.C5778yd.zza(r2, r0)
            throw r0
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5190ii.mo18366V():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo18367W(C5225jg jgVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo18368X() {
        this.f18008C = -9223372036854775807L;
        this.f18009D = -1;
        this.f18010E = -1;
        this.f18011F = false;
        this.f18025m.clear();
        this.f18006A = null;
        this.f18007B = null;
        this.f18029q = null;
        this.f18012G = false;
        this.f18015J = false;
        this.f18030r = false;
        this.f18031s = false;
        this.f18032t = false;
        this.f18033u = false;
        this.f18034v = false;
        this.f18036x = false;
        this.f18037y = false;
        this.f18038z = false;
        this.f18016K = false;
        this.f18013H = 0;
        this.f18014I = 0;
        this.f18022j.f18474c = null;
        MediaCodec mediaCodec = this.f18028p;
        if (mediaCodec != null) {
            this.f18020O.f17979b++;
            try {
                mediaCodec.stop();
                try {
                    this.f18028p.release();
                } finally {
                    this.f18028p = null;
                }
            } catch (Throwable th) {
                this.f18028p.release();
                throw th;
            } finally {
                this.f18028p = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public boolean mo18369Y(MediaCodec mediaCodec, boolean z, zzapg zzapg, zzapg zzapg2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public boolean mo18370Z(C5116gi giVar) {
        return true;
    }

    /* renamed from: f */
    public final int mo18371f(zzapg zzapg) throws C5778yd {
        try {
            return mo18376z(this.f18021i, zzapg);
        } catch (C5375ni e) {
            throw C5778yd.zza(e, mo21800k());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo18372o() {
        this.f18027o = null;
        mo18368X();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo18373p(boolean z) throws C5778yd {
        this.f18020O = new C5188ig();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo18374q(long j, boolean z) throws C5778yd {
        this.f18017L = false;
        this.f18018M = false;
        if (this.f18028p != null) {
            this.f18008C = -9223372036854775807L;
            this.f18009D = -1;
            this.f18010E = -1;
            this.f18019N = true;
            this.f18011F = false;
            this.f18025m.clear();
            this.f18037y = false;
            this.f18038z = false;
            if (this.f18031s || (this.f18034v && this.f18016K)) {
                mo18368X();
                mo18366V();
            } else if (this.f18014I != 0) {
                mo18368X();
                mo18366V();
            } else {
                this.f18028p.flush();
                this.f18015J = false;
            }
            if (this.f18012G && this.f18027o != null) {
                this.f18013H = 1;
            }
        }
    }

    /* renamed from: w */
    public boolean mo18375w() {
        if (this.f18027o != null) {
            if (mo21799j() || this.f18010E >= 0) {
                return true;
            }
            if (this.f18008C == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f18008C) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract int mo18376z(C5264ki kiVar, zzapg zzapg) throws C5375ni;

    public final int zze() {
        return 4;
    }
}
