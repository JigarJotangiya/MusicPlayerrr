package com.bumptech.glide.p044n;

import android.graphics.Bitmap;
import com.bumptech.glide.p044n.C2125a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.n.e */
/* compiled from: StandardGifDecoder */
public class C2130e implements C2125a {

    /* renamed from: u */
    private static final String f7268u = "e";

    /* renamed from: a */
    private int[] f7269a;

    /* renamed from: b */
    private final int[] f7270b;

    /* renamed from: c */
    private final C2125a.C2126a f7271c;

    /* renamed from: d */
    private ByteBuffer f7272d;

    /* renamed from: e */
    private byte[] f7273e;

    /* renamed from: f */
    private short[] f7274f;

    /* renamed from: g */
    private byte[] f7275g;

    /* renamed from: h */
    private byte[] f7276h;

    /* renamed from: i */
    private byte[] f7277i;

    /* renamed from: j */
    private int[] f7278j;

    /* renamed from: k */
    private int f7279k;

    /* renamed from: l */
    private C2128c f7280l;

    /* renamed from: m */
    private Bitmap f7281m;

    /* renamed from: n */
    private boolean f7282n;

    /* renamed from: o */
    private int f7283o;

    /* renamed from: p */
    private int f7284p;

    /* renamed from: q */
    private int f7285q;

    /* renamed from: r */
    private int f7286r;

    /* renamed from: s */
    private Boolean f7287s;

    /* renamed from: t */
    private Bitmap.Config f7288t;

    public C2130e(C2125a.C2126a aVar, C2128c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo8330r(cVar, byteBuffer, i);
    }

    /* renamed from: j */
    private int m9958j(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f7284p + i; i9++) {
            byte[] bArr = this.f7277i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f7269a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f7284p + i11; i12++) {
            byte[] bArr2 = this.f7277i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f7269a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: k */
    private void m9959k(C2127b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C2127b bVar2 = bVar;
        int[] iArr = this.f7278j;
        int i6 = bVar2.f7243d;
        int i7 = this.f7284p;
        int i8 = i6 / i7;
        int i9 = bVar2.f7241b / i7;
        int i10 = bVar2.f7242c / i7;
        int i11 = bVar2.f7240a / i7;
        boolean z2 = this.f7279k == 0;
        int i12 = this.f7286r;
        int i13 = this.f7285q;
        byte[] bArr = this.f7277i;
        int[] iArr2 = this.f7269a;
        Boolean bool = this.f7287s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i15 < i8) {
            Boolean bool2 = bool;
            if (bVar2.f7244e) {
                if (i16 >= i8) {
                    i = i8;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 == 3) {
                        i17 = i18;
                        i16 = 2;
                        i14 = 4;
                    } else if (i18 != 4) {
                        i17 = i18;
                    } else {
                        i17 = i18;
                        i16 = 1;
                        i14 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i16 + i14;
            } else {
                i = i8;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            boolean z3 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i7 * bVar2.f7242c;
                if (z3) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i22) {
                            break;
                        }
                        int j = m9958j(i24, i28, bVar2.f7242c);
                        if (j != 0) {
                            iArr[i29] = j;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i15++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i16 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i15++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i16 = i3;
        }
        Boolean bool3 = bool;
        if (this.f7287s == null) {
            if (bool3 == null) {
                z = false;
            } else {
                z = bool3.booleanValue();
            }
            this.f7287s = Boolean.valueOf(z);
        }
    }

    /* renamed from: l */
    private void m9960l(C2127b bVar) {
        C2127b bVar2 = bVar;
        int[] iArr = this.f7278j;
        int i = bVar2.f7243d;
        int i2 = bVar2.f7241b;
        int i3 = bVar2.f7242c;
        int i4 = bVar2.f7240a;
        boolean z = this.f7279k == 0;
        int i5 = this.f7286r;
        byte[] bArr = this.f7277i;
        int[] iArr2 = this.f7269a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f7242c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C2127b bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.f7287s;
        this.f7287s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f7287s == null && z && b != -1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9961m(com.bumptech.glide.p044n.C2127b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f7272d
            int r3 = r1.f7249j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            com.bumptech.glide.n.c r1 = r0.f7280l
            int r2 = r1.f7256f
            int r1 = r1.f7257g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f7242c
            int r1 = r1.f7243d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f7277i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            com.bumptech.glide.n.a$a r1 = r0.f7271c
            byte[] r1 = r1.mo8183e(r2)
            r0.f7277i = r1
        L_0x002b:
            byte[] r1 = r0.f7277i
            short[] r3 = r0.f7274f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f7274f = r3
        L_0x0037:
            short[] r3 = r0.f7274f
            byte[] r5 = r0.f7275g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f7275g = r5
        L_0x0041:
            byte[] r5 = r0.f7275g
            byte[] r6 = r0.f7276h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f7276h = r6
        L_0x004d:
            byte[] r6 = r0.f7276h
            int r7 = r28.m9964q()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f7273e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014c
            if (r16 != 0) goto L_0x0094
            int r16 = r28.m9963p()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f7283o = r3
            goto L_0x014c
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ae:
            if (r4 < r15) goto L_0x0136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00d9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ed
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ae
        L_0x00ed:
            if (r11 < r8) goto L_0x00f6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f7
        L_0x00f6:
            r7 = r11
        L_0x00f7:
            if (r7 < r9) goto L_0x0102
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f7
        L_0x0102:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0116
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0109
        L_0x0116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012d
            if (r8 >= r6) goto L_0x012d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ae
        L_0x0136:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014c:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p044n.C2130e.m9961m(com.bumptech.glide.n.b):void");
    }

    /* renamed from: o */
    private Bitmap m9962o() {
        Boolean bool = this.f7287s;
        Bitmap a = this.f7271c.mo8179a(this.f7286r, this.f7285q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f7288t);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: p */
    private int m9963p() {
        int q = m9964q();
        if (q <= 0) {
            return q;
        }
        ByteBuffer byteBuffer = this.f7272d;
        byteBuffer.get(this.f7273e, 0, Math.min(q, byteBuffer.remaining()));
        return q;
    }

    /* renamed from: q */
    private int m9964q() {
        return this.f7272d.get() & 255;
    }

    /* renamed from: s */
    private Bitmap m9965s(C2127b bVar, C2127b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f7278j;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f7281m;
            if (bitmap2 != null) {
                this.f7271c.mo8181c(bitmap2);
            }
            this.f7281m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f7246g == 3 && this.f7281m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f7246g) > 0) {
            if (i2 == 2) {
                if (!bVar.f7245f) {
                    C2128c cVar = this.f7280l;
                    int i4 = cVar.f7262l;
                    if (bVar.f7250k == null || cVar.f7260j != bVar.f7247h) {
                        i3 = i4;
                    }
                }
                int i5 = bVar2.f7243d;
                int i6 = this.f7284p;
                int i7 = i5 / i6;
                int i8 = bVar2.f7241b / i6;
                int i9 = bVar2.f7242c / i6;
                int i10 = bVar2.f7240a / i6;
                int i11 = this.f7286r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f7286r;
                }
            } else if (i2 == 3 && (bitmap = this.f7281m) != null) {
                int i16 = this.f7286r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f7285q);
            }
        }
        m9961m(bVar);
        if (bVar.f7244e || this.f7284p != 1) {
            m9959k(bVar);
        } else {
            m9960l(bVar);
        }
        if (this.f7282n && ((i = bVar.f7246g) == 0 || i == 1)) {
            if (this.f7281m == null) {
                this.f7281m = m9962o();
            }
            Bitmap bitmap3 = this.f7281m;
            int i17 = this.f7286r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f7285q);
        }
        Bitmap o = m9962o();
        int i18 = this.f7286r;
        o.setPixels(iArr, 0, i18, 0, 0, i18, this.f7285q);
        return o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo8312a() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.bumptech.glide.n.c r0 = r8.f7280l     // Catch:{ all -> 0x00e4 }
            int r0 = r0.f7253c     // Catch:{ all -> 0x00e4 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f7279k     // Catch:{ all -> 0x00e4 }
            if (r0 >= 0) goto L_0x0039
        L_0x000d:
            java.lang.String r0 = f7268u     // Catch:{ all -> 0x00e4 }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r3.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            com.bumptech.glide.n.c r4 = r8.f7280l     // Catch:{ all -> 0x00e4 }
            int r4 = r4.f7253c     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f7279k     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e4 }
        L_0x0037:
            r8.f7283o = r2     // Catch:{ all -> 0x00e4 }
        L_0x0039:
            int r0 = r8.f7283o     // Catch:{ all -> 0x00e4 }
            r3 = 0
            if (r0 == r2) goto L_0x00c4
            r4 = 2
            if (r0 != r4) goto L_0x0043
            goto L_0x00c4
        L_0x0043:
            r0 = 0
            r8.f7283o = r0     // Catch:{ all -> 0x00e4 }
            byte[] r5 = r8.f7273e     // Catch:{ all -> 0x00e4 }
            if (r5 != 0) goto L_0x0054
            com.bumptech.glide.n.a$a r5 = r8.f7271c     // Catch:{ all -> 0x00e4 }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo8183e(r6)     // Catch:{ all -> 0x00e4 }
            r8.f7273e = r5     // Catch:{ all -> 0x00e4 }
        L_0x0054:
            com.bumptech.glide.n.c r5 = r8.f7280l     // Catch:{ all -> 0x00e4 }
            java.util.List<com.bumptech.glide.n.b> r5 = r5.f7255e     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f7279k     // Catch:{ all -> 0x00e4 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00e4 }
            com.bumptech.glide.n.b r5 = (com.bumptech.glide.p044n.C2127b) r5     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f7279k     // Catch:{ all -> 0x00e4 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0070
            com.bumptech.glide.n.c r7 = r8.f7280l     // Catch:{ all -> 0x00e4 }
            java.util.List<com.bumptech.glide.n.b> r7 = r7.f7255e     // Catch:{ all -> 0x00e4 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00e4 }
            com.bumptech.glide.n.b r6 = (com.bumptech.glide.p044n.C2127b) r6     // Catch:{ all -> 0x00e4 }
            goto L_0x0071
        L_0x0070:
            r6 = r3
        L_0x0071:
            int[] r7 = r5.f7250k     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            com.bumptech.glide.n.c r7 = r8.f7280l     // Catch:{ all -> 0x00e4 }
            int[] r7 = r7.f7251a     // Catch:{ all -> 0x00e4 }
        L_0x007a:
            r8.f7269a = r7     // Catch:{ all -> 0x00e4 }
            if (r7 != 0) goto L_0x00a0
            java.lang.String r0 = f7268u     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f7279k     // Catch:{ all -> 0x00e4 }
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x009c:
            r8.f7283o = r2     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r3
        L_0x00a0:
            boolean r1 = r5.f7245f     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00be
            int[] r1 = r8.f7270b     // Catch:{ all -> 0x00e4 }
            int r2 = r7.length     // Catch:{ all -> 0x00e4 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00e4 }
            int[] r1 = r8.f7270b     // Catch:{ all -> 0x00e4 }
            r8.f7269a = r1     // Catch:{ all -> 0x00e4 }
            int r2 = r5.f7247h     // Catch:{ all -> 0x00e4 }
            r1[r2] = r0     // Catch:{ all -> 0x00e4 }
            int r0 = r5.f7246g     // Catch:{ all -> 0x00e4 }
            if (r0 != r4) goto L_0x00be
            int r0 = r8.f7279k     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00be
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e4 }
            r8.f7287s = r0     // Catch:{ all -> 0x00e4 }
        L_0x00be:
            android.graphics.Bitmap r0 = r8.m9965s(r5, r6)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r0
        L_0x00c4:
            java.lang.String r0 = f7268u     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            int r2 = r8.f7283o     // Catch:{ all -> 0x00e4 }
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x00e2:
            monitor-exit(r8)
            return r3
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p044n.C2130e.mo8312a():android.graphics.Bitmap");
    }

    /* renamed from: b */
    public ByteBuffer mo8313b() {
        return this.f7272d;
    }

    /* renamed from: c */
    public void mo8314c() {
        this.f7279k = (this.f7279k + 1) % this.f7280l.f7253c;
    }

    public void clear() {
        this.f7280l = null;
        byte[] bArr = this.f7277i;
        if (bArr != null) {
            this.f7271c.mo8182d(bArr);
        }
        int[] iArr = this.f7278j;
        if (iArr != null) {
            this.f7271c.mo8184f(iArr);
        }
        Bitmap bitmap = this.f7281m;
        if (bitmap != null) {
            this.f7271c.mo8181c(bitmap);
        }
        this.f7281m = null;
        this.f7272d = null;
        this.f7287s = null;
        byte[] bArr2 = this.f7273e;
        if (bArr2 != null) {
            this.f7271c.mo8182d(bArr2);
        }
    }

    /* renamed from: d */
    public int mo8316d() {
        return this.f7280l.f7253c;
    }

    /* renamed from: e */
    public int mo8317e() {
        int i;
        if (this.f7280l.f7253c <= 0 || (i = this.f7279k) < 0) {
            return 0;
        }
        return mo8329n(i);
    }

    /* renamed from: f */
    public void mo8318f(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f7288t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: g */
    public void mo8319g() {
        this.f7279k = -1;
    }

    /* renamed from: h */
    public int mo8320h() {
        return this.f7279k;
    }

    /* renamed from: i */
    public int mo8321i() {
        return this.f7272d.limit() + this.f7277i.length + (this.f7278j.length * 4);
    }

    /* renamed from: n */
    public int mo8329n(int i) {
        if (i >= 0) {
            C2128c cVar = this.f7280l;
            if (i < cVar.f7253c) {
                return cVar.f7255e.get(i).f7248i;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public synchronized void mo8330r(C2128c cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f7283o = 0;
            this.f7280l = cVar;
            this.f7279k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f7272d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f7272d.order(ByteOrder.LITTLE_ENDIAN);
            this.f7282n = false;
            Iterator<C2127b> it = cVar.f7255e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f7246g == 3) {
                        this.f7282n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f7284p = highestOneBit;
            int i2 = cVar.f7256f;
            this.f7286r = i2 / highestOneBit;
            int i3 = cVar.f7257g;
            this.f7285q = i3 / highestOneBit;
            this.f7277i = this.f7271c.mo8183e(i2 * i3);
            this.f7278j = this.f7271c.mo8180b(this.f7286r * this.f7285q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public C2130e(C2125a.C2126a aVar) {
        this.f7270b = new int[256];
        this.f7288t = Bitmap.Config.ARGB_8888;
        this.f7271c = aVar;
        this.f7280l = new C2128c();
    }
}
