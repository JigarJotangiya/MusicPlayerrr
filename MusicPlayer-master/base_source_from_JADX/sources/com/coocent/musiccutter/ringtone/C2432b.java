package com.coocent.musiccutter.ringtone;

import android.app.Application;
import android.text.TextUtils;
import com.coocent.musiccutter.ringtone.C2438d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p159f.p166c.p199f.p200h.C4495b;

/* renamed from: com.coocent.musiccutter.ringtone.b */
/* compiled from: CheapAMR */
public class C2432b extends C2438d {

    /* renamed from: q */
    private static int[] f8521q = {12, 13, 15, 17, 19, 20, 26, 31, 5, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: r */
    private static int[] f8522r = {28753, 2785, 6594, 7413, 10444, 1269, 4423, 1556, 12820, 2498, 4833, 2498, 7864, 1884, 3153, 1802, 20193, 3031, 5857, 4014, 8970, 1392, 4096, 655, 13926, 3112, 4669, 2703, 6553, 901, 2662, 655, 23511, 2457, 5079, 4096, 8560, 737, 4259, 2088, 12288, 1474, 4628, 1433, 7004, 737, 2252, 1228, 17326, 2334, 5816, 3686, 8601, 778, 3809, 614, 9256, 1761, 3522, 1966, 5529, 737, 3194, 778};

    /* renamed from: s */
    private static int[] f8523s = {17333, -3431, 4235, 5276, 8325, -10422, 683, -8609, 10148, -4398, 1472, -4398, 5802, -6907, -2327, -7303, 14189, -2678, 3181, -180, 6972, -9599, 0, -16305, 10884, -2444, 1165, -3697, 4180, -13468, -3833, -16305, 15543, -4546, 1913, 0, 6556, -15255, 347, -5993, 9771, -9090, 1086, -9341, 4772, -15255, -5321, -10714, 12827, -5002, 3118, -938, 6598, -14774, -646, -16879, 7251, -7508, -1343, -6529, 2668, -15255, -2212, -2454, -14774};

    /* renamed from: t */
    private static int[] f8524t = {159, -3776, -22731, 206, -3394, -20428, 268, -3005, -18088, 349, -2615, -15739, 419, -2345, -14113, 482, -2138, -12867, 554, -1932, -11629, 637, -1726, -10387, 733, -1518, -9139, 842, -1314, -7906, 969, -1106, -6656, 1114, -900, -5416, 1281, -694, -4173, 1473, -487, -2931, 1694, -281, -1688, 1948, -75, -445, 2241, 133, 801, 2577, 339, 2044, 2963, 545, 3285, 3408, 752, 4530, 3919, 958, 5772, 4507, 1165, 7016, 5183, 1371, 8259, 5960, 1577, 9501, 6855, 1784, 10745, 7883, 1991, 11988, 9065, 2197, 13231, 10425, 2404, 14474, 12510, 2673, 16096, 16263, 3060, 18429, 21142, 3448, 20763, 27485, 3836, 23097};

    /* renamed from: u */
    private static int[] f8525u = {0, 1, 3, 2, 5, 6, 4, 7};

    /* renamed from: v */
    private static int[] f8526v = {0, 3277, 6556, 8192, 9830, 11469, 12288, 13107, 13926, 14746, 15565, 16384, 17203, 18022, 18842, 19661};

    /* renamed from: g */
    private int f8527g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int[] f8528h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int[] f8529i;

    /* renamed from: j */
    private int[] f8530j;

    /* renamed from: k */
    private int f8531k;

    /* renamed from: l */
    private int f8532l;

    /* renamed from: m */
    private int f8533m;

    /* renamed from: n */
    private int f8534n;

    /* renamed from: o */
    private int f8535o;

    /* renamed from: p */
    private int f8536p;

    /* renamed from: com.coocent.musiccutter.ringtone.b$a */
    /* compiled from: CheapAMR */
    static class C2433a implements C2438d.C2439a {
        C2433a() {
        }

        /* renamed from: b */
        public String[] mo9483b() {
            return new String[]{"3gpp", "3gp", "amr"};
        }

        /* renamed from: c */
        public C2438d mo9484c(Application application) {
            return new C2432b();
        }
    }

    /* renamed from: com.coocent.musiccutter.ringtone.b$b */
    /* compiled from: CheapAMR */
    class C2434b implements C4495b.C4496a {

        /* renamed from: a */
        final /* synthetic */ int f8537a;

        /* renamed from: b */
        final /* synthetic */ int f8538b;

        /* renamed from: c */
        final /* synthetic */ InputStream f8539c;

        /* renamed from: d */
        final /* synthetic */ C2438d.C2441c f8540d;

        C2434b(int i, int i2, InputStream inputStream, C2438d.C2441c cVar) {
            this.f8537a = i;
            this.f8538b = i2;
            this.f8539c = inputStream;
            this.f8540d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r10.f8540d.mo9411a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
            r12 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r11.close();
            r10.f8539c.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
            throw r12;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0081 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9485a(java.io.OutputStream r11, java.lang.String r12) {
            /*
                r10 = this;
                int r0 = r10.f8537a
                if (r0 != 0) goto L_0x0006
                r0 = 20
            L_0x0006:
                r1 = 6
                byte[] r2 = new byte[r1]
                r2 = {35, 33, 65, 77, 82, 10} // fill-array
                r3 = 0
                r11.write(r2, r3, r1)     // Catch:{ all -> 0x0081 }
                r1 = 0
                r2 = 0
            L_0x0012:
                int r4 = r10.f8538b     // Catch:{ all -> 0x0081 }
                if (r1 >= r4) goto L_0x0031
                com.coocent.musiccutter.ringtone.b r4 = com.coocent.musiccutter.ringtone.C2432b.this     // Catch:{ all -> 0x0081 }
                int[] r4 = r4.f8529i     // Catch:{ all -> 0x0081 }
                int r5 = r10.f8537a     // Catch:{ all -> 0x0081 }
                int r5 = r5 + r1
                r4 = r4[r5]     // Catch:{ all -> 0x0081 }
                if (r4 <= r2) goto L_0x002e
                com.coocent.musiccutter.ringtone.b r2 = com.coocent.musiccutter.ringtone.C2432b.this     // Catch:{ all -> 0x0081 }
                int[] r2 = r2.f8529i     // Catch:{ all -> 0x0081 }
                int r4 = r10.f8537a     // Catch:{ all -> 0x0081 }
                int r4 = r4 + r1
                r2 = r2[r4]     // Catch:{ all -> 0x0081 }
            L_0x002e:
                int r1 = r1 + 1
                goto L_0x0012
            L_0x0031:
                byte[] r1 = new byte[r2]     // Catch:{ all -> 0x0081 }
                r2 = 0
                r4 = 0
            L_0x0035:
                int r5 = r10.f8538b     // Catch:{ all -> 0x0081 }
                if (r2 >= r5) goto L_0x0064
                com.coocent.musiccutter.ringtone.b r5 = com.coocent.musiccutter.ringtone.C2432b.this     // Catch:{ all -> 0x0081 }
                int[] r5 = r5.f8528h     // Catch:{ all -> 0x0081 }
                int r6 = r0 + r2
                r5 = r5[r6]     // Catch:{ all -> 0x0081 }
                int r5 = r5 - r4
                com.coocent.musiccutter.ringtone.b r7 = com.coocent.musiccutter.ringtone.C2432b.this     // Catch:{ all -> 0x0081 }
                int[] r7 = r7.f8529i     // Catch:{ all -> 0x0081 }
                r6 = r7[r6]     // Catch:{ all -> 0x0081 }
                if (r5 >= 0) goto L_0x004f
                goto L_0x0061
            L_0x004f:
                if (r5 <= 0) goto L_0x0058
                java.io.InputStream r7 = r10.f8539c     // Catch:{ all -> 0x0081 }
                long r8 = (long) r5     // Catch:{ all -> 0x0081 }
                r7.skip(r8)     // Catch:{ all -> 0x0081 }
                int r4 = r4 + r5
            L_0x0058:
                java.io.InputStream r5 = r10.f8539c     // Catch:{ all -> 0x0081 }
                r5.read(r1, r3, r6)     // Catch:{ all -> 0x0081 }
                r11.write(r1, r3, r6)     // Catch:{ all -> 0x0081 }
                int r4 = r4 + r6
            L_0x0061:
                int r2 = r2 + 1
                goto L_0x0035
            L_0x0064:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0081 }
                r1 = 29
                if (r0 < r1) goto L_0x0073
                android.app.Application r0 = com.coocent.musiccutter.ringtone.C2438d.f8563d     // Catch:{ all -> 0x0081 }
                android.net.Uri r1 = android.net.Uri.parse(r12)     // Catch:{ all -> 0x0081 }
                p159f.p166c.p199f.p200h.C4495b.m19707f(r0, r1)     // Catch:{ all -> 0x0081 }
            L_0x0073:
                com.coocent.musiccutter.ringtone.d$c r0 = r10.f8540d     // Catch:{ all -> 0x0081 }
                r0.mo9412b(r12)     // Catch:{ all -> 0x0081 }
                r11.close()     // Catch:{ IOException -> 0x008a }
            L_0x007b:
                java.io.InputStream r11 = r10.f8539c     // Catch:{ IOException -> 0x008a }
                r11.close()     // Catch:{ IOException -> 0x008a }
                goto L_0x008a
            L_0x0081:
                com.coocent.musiccutter.ringtone.d$c r12 = r10.f8540d     // Catch:{ all -> 0x008b }
                r12.mo9411a()     // Catch:{ all -> 0x008b }
                r11.close()     // Catch:{ IOException -> 0x008a }
                goto L_0x007b
            L_0x008a:
                return
            L_0x008b:
                r12 = move-exception
                r11.close()     // Catch:{ IOException -> 0x0094 }
                java.io.InputStream r11 = r10.f8539c     // Catch:{ IOException -> 0x0094 }
                r11.close()     // Catch:{ IOException -> 0x0094 }
            L_0x0094:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.coocent.musiccutter.ringtone.C2432b.C2434b.mo9485a(java.io.OutputStream, java.lang.String):void");
        }

        /* renamed from: b */
        public void mo9486b() {
            this.f8540d.mo9411a();
            try {
                this.f8539c.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: w */
    public static C2438d.C2439a m11378w() {
        return new C2433a();
    }

    /* renamed from: y */
    private void m11379y(InputStream inputStream, int i) throws IOException {
        if (i >= 8) {
            byte[] bArr = new byte[8];
            inputStream.read(bArr, 0, 8);
            this.f8533m += 8;
            byte b = ((bArr[2] & 255) << 8) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | (bArr[3] & 255);
            if (b <= i) {
                if (bArr[4] == 109 && bArr[5] == 100 && bArr[6] == 97 && bArr[7] == 116) {
                    mo9490z(inputStream, b);
                } else {
                    m11379y(inputStream, i - b);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0055, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo9487A(java.io.InputStream r25, int r26, int[] r27) throws java.io.IOException {
        /*
            r24 = this;
            r6 = r24
            r0 = r25
            r1 = r26
            int r7 = r6.f8533m
            r8 = 1
            byte[] r2 = new byte[r8]
            r9 = 0
            r0.read(r2, r9, r8)
            int r3 = r6.f8533m
            int r3 = r3 + r8
            r6.f8533m = r3
            byte r3 = r2[r9]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r10 = 3
            int r3 = r3 >> r10
            int r3 = r3 % 15
            byte r2 = r2[r9]
            int[] r2 = f8521q
            r2 = r2[r3]
            int r11 = r2 + 1
            if (r11 <= r1) goto L_0x0027
            return r1
        L_0x0027:
            if (r2 != 0) goto L_0x002a
            return r8
        L_0x002a:
            byte[] r1 = new byte[r2]
            r0.read(r1, r9, r2)
            int r0 = r6.f8533m
            int r0 = r0 + r2
            r6.f8533m = r0
            int r2 = r2 * 8
            int[] r4 = new int[r2]
            byte r0 = r1[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5 = 0
            r12 = 0
        L_0x003e:
            r13 = 7
            if (r5 >= r2) goto L_0x0058
            r14 = r0 & 128(0x80, float:1.794E-43)
            int r14 = r14 >> r13
            r4[r5] = r14
            int r0 = r0 << r8
            r14 = r5 & 7
            if (r14 != r13) goto L_0x0055
            int r13 = r2 + -1
            if (r5 >= r13) goto L_0x0055
            int r12 = r12 + 1
            byte r0 = r1[r12]
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x0055:
            int r5 = r5 + 1
            goto L_0x003e
        L_0x0058:
            r15 = 5
            r5 = 4
            if (r3 == r8) goto L_0x0204
            if (r3 == r13) goto L_0x007a
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported frame type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r6.mo9488v(r7, r11, r8)
        L_0x0077:
            r2 = r6
            goto L_0x0302
        L_0x007a:
            r3 = 12
            r6.f8532l = r3
            int[] r1 = new int[r5]
            int[] r0 = new int[r5]
            int[] r14 = new int[r5]
            int[][] r12 = new int[r5][]
            r2 = 0
        L_0x0087:
            if (r2 >= r5) goto L_0x0094
            r3 = 10
            int[] r3 = new int[r3]
            r12[r2] = r3
            int r2 = r2 + 1
            r3 = 12
            goto L_0x0087
        L_0x0094:
            r18 = r0
            r0 = r24
            r19 = r1
            r1 = r4
            r4 = 2
            r2 = r19
            r16 = 12
            r3 = r18
            r4 = r14
            r13 = 4
            r5 = r12
            r0.mo9489x(r1, r2, r3, r4, r5)
            r0 = 0
            r1 = 0
        L_0x00aa:
            if (r0 >= r13) goto L_0x0077
            r2 = 40
            int[] r3 = new int[r2]
            r4 = 0
        L_0x00b1:
            if (r4 >= r2) goto L_0x00b8
            r3[r4] = r9
            int r4 = r4 + 1
            goto L_0x00b1
        L_0x00b8:
            r4 = 0
        L_0x00b9:
            if (r4 >= r15) goto L_0x00f5
            r5 = r12[r0]
            r5 = r5[r4]
            int r5 = r5 >> r10
            r5 = r5 & r8
            if (r5 != 0) goto L_0x00c6
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x00c8
        L_0x00c6:
            r5 = -4096(0xfffffffffffff000, float:NaN)
        L_0x00c8:
            int[] r21 = f8525u
            r22 = r12[r0]
            r22 = r22[r4]
            r17 = 7
            r22 = r22 & 7
            r22 = r21[r22]
            int r22 = r22 * 5
            int r13 = r4 + r22
            r22 = r12[r0]
            int r23 = r4 + 5
            r22 = r22[r23]
            r22 = r22 & 7
            r21 = r21[r22]
            int r21 = r21 * 5
            int r10 = r4 + r21
            r3[r13] = r5
            if (r10 >= r13) goto L_0x00eb
            int r5 = -r5
        L_0x00eb:
            r13 = r3[r10]
            int r13 = r13 + r5
            r3[r10] = r13
            int r4 = r4 + 1
            r10 = 3
            r13 = 4
            goto L_0x00b9
        L_0x00f5:
            r17 = 7
            r4 = r19[r0]
            r5 = 2
            if (r0 == 0) goto L_0x0116
            if (r0 != r5) goto L_0x00ff
            goto L_0x0116
        L_0x00ff:
            r10 = 18
            r13 = 143(0x8f, float:2.0E-43)
            int r1 = r1 - r15
            if (r1 >= r10) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r10 = r1
        L_0x0108:
            int r1 = r10 + 9
            if (r1 <= r13) goto L_0x010e
            r10 = 134(0x86, float:1.88E-43)
        L_0x010e:
            int r4 = r4 + 5
            int r4 = r4 / 6
            int r10 = r10 + r4
            int r10 = r10 - r8
            r1 = r10
            goto L_0x0124
        L_0x0116:
            r1 = 463(0x1cf, float:6.49E-43)
            if (r4 >= r1) goto L_0x0121
            int r4 = r4 + 5
            int r4 = r4 / 6
            int r4 = r4 + 17
            goto L_0x0123
        L_0x0121:
            int r4 = r4 + -368
        L_0x0123:
            r1 = r4
        L_0x0124:
            int[] r4 = f8526v
            r10 = r18[r0]
            r4 = r4[r10]
            int r4 = r4 >> r5
            int r4 = r4 << r5
            r10 = 16383(0x3fff, float:2.2957E-41)
            if (r4 <= r10) goto L_0x0133
            r4 = 32767(0x7fff, float:4.5916E-41)
            goto L_0x0135
        L_0x0133:
            int r4 = r4 * 2
        L_0x0135:
            r10 = r1
        L_0x0136:
            if (r10 >= r2) goto L_0x0149
            r20 = r3[r10]
            int r21 = r10 - r1
            r21 = r3[r21]
            int r21 = r21 * r4
            int r21 = r21 >> 15
            int r20 = r20 + r21
            r3[r10] = r20
            int r10 = r10 + 1
            goto L_0x0136
        L_0x0149:
            r4 = 0
            r10 = 0
        L_0x014b:
            if (r4 >= r2) goto L_0x0158
            r20 = r3[r4]
            r21 = r3[r4]
            int r20 = r20 * r21
            int r10 = r10 + r20
            int r4 = r4 + 1
            goto L_0x014b
        L_0x0158:
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 <= r10) goto L_0x0163
            if (r10 >= 0) goto L_0x0160
            goto L_0x0163
        L_0x0160:
            int r10 = r10 * 2
            goto L_0x0166
        L_0x0163:
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x0166:
            r2 = 32768(0x8000, float:4.5918E-41)
            int r10 = r10 + r2
            int r2 = r10 >> 16
            r3 = 52428(0xcccc, float:7.3467E-41)
            int r2 = r2 * r3
            double r2 = (double) r2
            double r2 = java.lang.Math.log(r2)
            r10 = r14
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r20 = java.lang.Math.log(r13)
            double r2 = r2 / r20
            int r4 = (int) r2
            double r13 = (double) r4
            double r2 = r2 - r13
            r13 = 4674736413210574848(0x40e0000000000000, double:32768.0)
            double r2 = r2 * r13
            int r2 = (int) r2
            r3 = 30
            int r4 = r4 - r3
            int r3 = r4 << 16
            int r2 = r2 * 2
            int r3 = r3 + r2
            r2 = r27[r9]
            int r2 = r2 * 44
            r4 = r27[r8]
            r21 = 37
            int r4 = r4 * 37
            int r2 = r2 + r4
            r4 = r27[r5]
            int r4 = r4 * 22
            int r2 = r2 + r4
            r4 = 3
            r21 = r27[r4]
            int r21 = r21 * 12
            int r2 = r2 + r21
            int r2 = r2 * 2
            r4 = 783741(0xbf57d, float:1.098255E-39)
            int r2 = r2 + r4
            int r2 = r2 - r3
            int r2 = r2 / r5
            int r3 = r2 >> 16
            int r2 = r2 >> r8
            int r4 = r3 << 15
            int r2 = r2 - r4
            double r3 = (double) r3
            double r5 = (double) r2
            double r5 = r5 / r13
            double r3 = r3 + r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r5, r3)
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r4
            int r2 = (int) r2
            r3 = 2047(0x7ff, float:2.868E-42)
            if (r2 > r3) goto L_0x01c9
            int r2 = r2 << 4
            goto L_0x01cb
        L_0x01c9:
            r2 = 32767(0x7fff, float:4.5916E-41)
        L_0x01cb:
            r3 = r10[r0]
            int[] r4 = f8524t
            r5 = 3
            int r3 = r3 * 3
            r4 = r4[r3]
            int r2 = r2 * r4
            int r2 = r2 >> 15
            int r2 = r2 << r8
            r4 = r2 & -32768(0xffffffffffff8000, float:NaN)
            if (r4 == 0) goto L_0x01e0
            r13 = 32767(0x7fff, float:4.5916E-41)
            goto L_0x01e1
        L_0x01e0:
            r13 = r2
        L_0x01e1:
            r2 = r24
            r2.mo9488v(r7, r11, r13)
            int[] r4 = f8524t
            int r3 = r3 + 1
            r3 = r4[r3]
            r4 = 2
            r5 = r27[r4]
            r6 = 3
            r27[r6] = r5
            r5 = r27[r8]
            r27[r4] = r5
            r4 = r27[r9]
            r27[r8] = r4
            r27[r9] = r3
            int r0 = r0 + 1
            r6 = r2
            r14 = r10
            r10 = 3
            r13 = 4
            goto L_0x00aa
        L_0x0204:
            r2 = r6
            r2.f8532l = r15
            r0 = 4
            int[] r1 = new int[r0]
            r3 = 24
            r5 = r4[r3]
            int r5 = r5 * 1
            r6 = 25
            r6 = r4[r6]
            r10 = 2
            int r6 = r6 * 2
            int r5 = r5 + r6
            r6 = 26
            r6 = r4[r6]
            int r6 = r6 * 4
            int r5 = r5 + r6
            r0 = 36
            r0 = r4[r0]
            int r0 = r0 * 8
            int r5 = r5 + r0
            r0 = 45
            r0 = r4[r0]
            int r0 = r0 * 16
            int r5 = r5 + r0
            r0 = 55
            r0 = r4[r0]
            r6 = 32
            int r0 = r0 * 32
            int r5 = r5 + r0
            r1[r9] = r5
            r0 = 27
            r0 = r4[r0]
            int r0 = r0 * 1
            r5 = 28
            r5 = r4[r5]
            r10 = 2
            int r5 = r5 * 2
            int r0 = r0 + r5
            r5 = 29
            r5 = r4[r5]
            r10 = 4
            int r5 = r5 * 4
            int r0 = r0 + r5
            r5 = 37
            r5 = r4[r5]
            int r5 = r5 * 8
            int r0 = r0 + r5
            r5 = 46
            r5 = r4[r5]
            int r5 = r5 * 16
            int r0 = r0 + r5
            r5 = 56
            r5 = r4[r5]
            int r5 = r5 * 32
            int r0 = r0 + r5
            r1[r8] = r0
            r0 = 30
            r0 = r4[r0]
            int r0 = r0 * 1
            r5 = 31
            r5 = r4[r5]
            r10 = 2
            int r5 = r5 * 2
            int r0 = r0 + r5
            r5 = r4[r6]
            r10 = 4
            int r5 = r5 * 4
            int r0 = r0 + r5
            r5 = 38
            r5 = r4[r5]
            int r5 = r5 * 8
            int r0 = r0 + r5
            r5 = 47
            r5 = r4[r5]
            int r5 = r5 * 16
            int r0 = r0 + r5
            r5 = 57
            r5 = r4[r5]
            int r5 = r5 * 32
            int r0 = r0 + r5
            r5 = 2
            r1[r5] = r0
            r0 = 33
            r0 = r4[r0]
            int r0 = r0 * 1
            r10 = 34
            r10 = r4[r10]
            int r10 = r10 * 2
            int r0 = r0 + r10
            r5 = 35
            r5 = r4[r5]
            r10 = 4
            int r5 = r5 * 4
            int r0 = r0 + r5
            r5 = 39
            r5 = r4[r5]
            int r5 = r5 * 8
            int r0 = r0 + r5
            r5 = 48
            r5 = r4[r5]
            int r5 = r5 * 16
            int r0 = r0 + r5
            r5 = 58
            r4 = r4[r5]
            int r4 = r4 * 32
            int r0 = r0 + r4
            r4 = 3
            r1[r4] = r0
            r0 = 0
            r4 = 4
        L_0x02c0:
            if (r0 >= r4) goto L_0x0302
            r5 = 385963008(0x17015400, float:4.178817E-25)
            r6 = r27[r9]
            int r6 = r6 * 5571
            int r6 = r6 + r5
            r5 = r27[r8]
            int r5 = r5 * 4751
            int r6 = r6 + r5
            r5 = 2
            r10 = r27[r5]
            int r10 = r10 * 2785
            int r6 = r6 + r10
            r5 = 3
            r10 = r27[r5]
            int r10 = r10 * 1556
            int r6 = r6 + r10
            int r5 = r6 >> 15
            int[] r6 = f8523s
            r10 = r1[r0]
            r6 = r6[r10]
            int[] r10 = f8522r
            r12 = r1[r0]
            r10 = r10[r12]
            r12 = 2
            r13 = r27[r12]
            r14 = 3
            r27[r14] = r13
            r13 = r27[r8]
            r27[r12] = r13
            r13 = r27[r9]
            r27[r8] = r13
            r27[r9] = r6
            int r5 = r5 * r10
            int r5 = r5 >> r3
            r2.mo9488v(r7, r11, r5)
            int r0 = r0 + 1
            goto L_0x02c0
        L_0x0302:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.musiccutter.ringtone.C2432b.mo9487A(java.io.InputStream, int, int[]):int");
    }

    /* renamed from: a */
    public void mo9467a(File file) throws FileNotFoundException, IOException {
        super.mo9467a(file);
        this.f8527g = 0;
        this.f8534n = 64;
        this.f8528h = new int[64];
        this.f8529i = new int[64];
        this.f8530j = new int[64];
        this.f8535o = 1000000000;
        this.f8536p = 0;
        this.f8532l = 10;
        this.f8533m = 0;
        int length = (int) this.f8567b.length();
        this.f8531k = length;
        if (length >= 128) {
            FileInputStream fileInputStream = new FileInputStream(this.f8567b);
            byte[] bArr = new byte[12];
            fileInputStream.read(bArr, 0, 6);
            this.f8533m += 6;
            if (bArr[0] == 35 && bArr[1] == 33 && bArr[2] == 65 && bArr[3] == 77 && bArr[4] == 82 && bArr[5] == 10) {
                mo9490z(fileInputStream, this.f8531k - 6);
            }
            fileInputStream.read(bArr, 6, 6);
            this.f8533m += 6;
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112 && bArr[8] == 51 && bArr[9] == 103 && bArr[10] == 112 && bArr[11] == 52) {
                byte b = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                if (b >= 4 && b <= this.f8531k - 8) {
                    int i = b - 12;
                    fileInputStream.skip((long) i);
                    this.f8533m += i;
                }
                m11379y(fileInputStream, this.f8531k - b);
            }
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        } else {
            throw new IOException("File too small to parse");
        }
    }

    /* renamed from: b */
    public void mo9468b(File file, int i, int i2) throws IOException {
        if (i == 0) {
            i = 20;
        }
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(this.f8567b);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(new byte[]{35, 33, 65, 77, 82, 10}, 0, 6);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int[] iArr = this.f8529i;
            int i5 = i + i4;
            if (iArr[i5] > i3) {
                i3 = iArr[i5];
            }
        }
        byte[] bArr = new byte[i3];
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i + i7;
            int i9 = this.f8528h[i8] - i6;
            int i10 = this.f8529i[i8];
            if (i9 >= 0) {
                if (i9 > 0) {
                    fileInputStream.skip((long) i9);
                    i6 += i9;
                }
                fileInputStream.read(bArr, 0, i10);
                fileOutputStream.write(bArr, 0, i10);
                i6 += i10;
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /* renamed from: c */
    public void mo9469c(CharSequence charSequence, String str, long j, int i, int i2, int i3, C2438d.C2441c cVar) throws IOException {
        if (!TextUtils.isEmpty(charSequence)) {
            C4495b.m19705d(C2438d.f8563d, i, charSequence.toString(), str, new C2434b(i2, i3, C4495b.m19704c(C2438d.f8563d, j), cVar));
        }
    }

    /* renamed from: g */
    public int mo9470g() {
        return this.f8532l;
    }

    /* renamed from: h */
    public String mo9471h() {
        return "AMR";
    }

    /* renamed from: i */
    public int[] mo9472i() {
        return this.f8530j;
    }

    /* renamed from: j */
    public int[] mo9473j() {
        return this.f8529i;
    }

    /* renamed from: k */
    public int[] mo9474k() {
        return this.f8528h;
    }

    /* renamed from: l */
    public int mo9475l() {
        return this.f8527g;
    }

    /* renamed from: m */
    public int mo9476m() {
        return 8000;
    }

    /* renamed from: n */
    public int mo9477n() {
        return 40;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo9488v(int i, int i2, int i3) {
        int[] iArr = this.f8528h;
        int i4 = this.f8527g;
        iArr[i4] = i;
        this.f8529i[i4] = i2;
        this.f8530j[i4] = i3;
        if (i3 < this.f8535o) {
            this.f8535o = i3;
        }
        if (i3 > this.f8536p) {
            this.f8536p = i3;
        }
        int i5 = i4 + 1;
        this.f8527g = i5;
        int i6 = this.f8534n;
        if (i5 == i6) {
            int i7 = i6 * 2;
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            int[] iArr4 = new int[i7];
            for (int i8 = 0; i8 < this.f8527g; i8++) {
                iArr2[i8] = this.f8528h[i8];
                iArr3[i8] = this.f8529i[i8];
                iArr4[i8] = this.f8530j[i8];
            }
            this.f8528h = iArr2;
            this.f8529i = iArr3;
            this.f8530j = iArr4;
            this.f8534n = i7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo9489x(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[][] iArr5) {
        iArr2[0] = (iArr[45] * 1) + (iArr[43] * 2) + (iArr[41] * 4) + (iArr[39] * 8) + (iArr[37] * 16) + (iArr[35] * 32) + (iArr[33] * 64) + (iArr[31] * 128) + (iArr[29] * 256);
        iArr2[1] = (iArr[242] * 1) + (iArr[79] * 2) + (iArr[77] * 4) + (iArr[75] * 8) + (iArr[73] * 16) + (iArr[71] * 32);
        iArr2[2] = (iArr[46] * 1) + (iArr[44] * 2) + (iArr[42] * 4) + (iArr[40] * 8) + (iArr[38] * 16) + (iArr[36] * 32) + (iArr[34] * 64) + (iArr[32] * 128) + (iArr[30] * 256);
        iArr2[3] = (iArr[243] * 1) + (iArr[80] * 2) + (iArr[78] * 4) + (iArr[76] * 8) + (iArr[74] * 16) + (iArr[72] * 32);
        iArr3[0] = (iArr[88] * 1) + (iArr[55] * 2) + (iArr[51] * 4) + (iArr[47] * 8);
        iArr3[1] = (iArr[89] * 1) + (iArr[56] * 2) + (iArr[52] * 4) + (iArr[48] * 8);
        iArr3[2] = (iArr[90] * 1) + (iArr[57] * 2) + (iArr[53] * 4) + (iArr[49] * 8);
        iArr3[3] = (iArr[91] * 1) + (iArr[58] * 2) + (iArr[54] * 4) + (iArr[50] * 8);
        iArr4[0] = (iArr[104] * 1) + (iArr[92] * 2) + (iArr[67] * 4) + (iArr[63] * 8) + (iArr[59] * 16);
        iArr4[1] = (iArr[105] * 1) + (iArr[93] * 2) + (iArr[68] * 4) + (iArr[64] * 8) + (iArr[60] * 16);
        iArr4[2] = (iArr[106] * 1) + (iArr[94] * 2) + (iArr[69] * 4) + (iArr[65] * 8) + (iArr[61] * 16);
        iArr4[3] = (iArr[107] * 1) + (iArr[95] * 2) + (iArr[70] * 4) + (iArr[66] * 8) + (iArr[62] * 16);
        iArr5[0][0] = (iArr[122] * 1) + (iArr[123] * 2) + (iArr[124] * 4) + (iArr[96] * 8);
        iArr5[0][1] = (iArr[125] * 1) + (iArr[126] * 2) + (iArr[127] * 4) + (iArr[100] * 8);
        iArr5[0][2] = (iArr[128] * 1) + (iArr[129] * 2) + (iArr[130] * 4) + (iArr[108] * 8);
        iArr5[0][3] = (iArr[131] * 1) + (iArr[132] * 2) + (iArr[133] * 4) + (iArr[112] * 8);
        iArr5[0][4] = (iArr[134] * 1) + (iArr[135] * 2) + (iArr[136] * 4) + (iArr[116] * 8);
        iArr5[0][5] = (iArr[182] * 1) + (iArr[183] * 2) + (iArr[184] * 4);
        iArr5[0][6] = (iArr[185] * 1) + (iArr[186] * 2) + (iArr[187] * 4);
        iArr5[0][7] = (iArr[188] * 1) + (iArr[189] * 2) + (iArr[190] * 4);
        iArr5[0][8] = (iArr[191] * 1) + (iArr[192] * 2) + (iArr[193] * 4);
        iArr5[0][9] = (iArr[194] * 1) + (iArr[195] * 2) + (iArr[196] * 4);
        iArr5[1][0] = (iArr[137] * 1) + (iArr[138] * 2) + (iArr[139] * 4) + (iArr[97] * 8);
        iArr5[1][1] = (iArr[140] * 1) + (iArr[141] * 2) + (iArr[142] * 4) + (iArr[101] * 8);
        iArr5[1][2] = (iArr[143] * 1) + (iArr[144] * 2) + (iArr[145] * 4) + (iArr[109] * 8);
        iArr5[1][3] = (iArr[146] * 1) + (iArr[147] * 2) + (iArr[148] * 4) + (iArr[113] * 8);
        iArr5[1][4] = (iArr[149] * 1) + (iArr[150] * 2) + (iArr[151] * 4) + (iArr[117] * 8);
        iArr5[1][5] = (iArr[197] * 1) + (iArr[198] * 2) + (iArr[199] * 4);
        iArr5[1][6] = (iArr[200] * 1) + (iArr[201] * 2) + (iArr[202] * 4);
        iArr5[1][7] = (iArr[203] * 1) + (iArr[204] * 2) + (iArr[205] * 4);
        iArr5[1][8] = (iArr[206] * 1) + (iArr[207] * 2) + (iArr[208] * 4);
        iArr5[1][9] = (iArr[209] * 1) + (iArr[210] * 2) + (iArr[211] * 4);
        iArr5[2][0] = (iArr[152] * 1) + (iArr[153] * 2) + (iArr[154] * 4) + (iArr[98] * 8);
        iArr5[2][1] = (iArr[155] * 1) + (iArr[156] * 2) + (iArr[157] * 4) + (iArr[102] * 8);
        iArr5[2][2] = (iArr[158] * 1) + (iArr[159] * 2) + (iArr[160] * 4) + (iArr[110] * 8);
        iArr5[2][3] = (iArr[161] * 1) + (iArr[162] * 2) + (iArr[163] * 4) + (iArr[114] * 8);
        iArr5[2][4] = (iArr[164] * 1) + (iArr[165] * 2) + (iArr[166] * 4) + (iArr[118] * 8);
        iArr5[2][5] = (iArr[212] * 1) + (iArr[213] * 2) + (iArr[214] * 4);
        iArr5[2][6] = (iArr[215] * 1) + (iArr[216] * 2) + (iArr[217] * 4);
        iArr5[2][7] = (iArr[218] * 1) + (iArr[219] * 2) + (iArr[220] * 4);
        iArr5[2][8] = (iArr[221] * 1) + (iArr[222] * 2) + (iArr[223] * 4);
        iArr5[2][9] = (iArr[224] * 1) + (iArr[225] * 2) + (iArr[226] * 4);
        iArr5[3][0] = (iArr[167] * 1) + (iArr[168] * 2) + (iArr[169] * 4) + (iArr[99] * 8);
        iArr5[3][1] = (iArr[170] * 1) + (iArr[171] * 2) + (iArr[172] * 4) + (iArr[103] * 8);
        iArr5[3][2] = (iArr[173] * 1) + (iArr[174] * 2) + (iArr[175] * 4) + (iArr[111] * 8);
        iArr5[3][3] = (iArr[176] * 1) + (iArr[177] * 2) + (iArr[178] * 4) + (iArr[115] * 8);
        iArr5[3][4] = (iArr[179] * 1) + (iArr[180] * 2) + (iArr[181] * 4) + (iArr[119] * 8);
        iArr5[3][5] = (iArr[227] * 1) + (iArr[228] * 2) + (iArr[229] * 4);
        iArr5[3][6] = (iArr[230] * 1) + (iArr[231] * 2) + (iArr[232] * 4);
        iArr5[3][7] = (iArr[233] * 1) + (iArr[234] * 2) + (iArr[235] * 4);
        iArr5[3][8] = (iArr[236] * 1) + (iArr[237] * 2) + (iArr[238] * 4);
        iArr5[3][9] = (iArr[239] * 1) + (iArr[240] * 2) + (iArr[241] * 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo9490z(InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[4];
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            iArr[i3] = 0;
        }
        int[] iArr2 = new int[4];
        for (int i4 = 0; i4 < 4; i4++) {
            iArr2[i4] = -2381;
        }
        int i5 = i;
        while (i5 > 0) {
            int A = mo9487A(inputStream, i5, iArr);
            i2 += A;
            i5 -= A;
            C2438d.C2440b bVar = this.f8566a;
            if (bVar != null && !bVar.mo9404a((((double) i2) * 1.0d) / ((double) i))) {
                return;
            }
        }
    }
}
