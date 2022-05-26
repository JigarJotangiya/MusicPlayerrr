package coocent.music.player.widget.ringtone;

import coocent.music.player.widget.ringtone.C7284d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: coocent.music.player.widget.ringtone.c */
/* compiled from: CheapMP3 */
public class C7282c extends C7284d {

    /* renamed from: q */
    private static int[] f32188q = {0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 0};

    /* renamed from: r */
    private static int[] f32189r = {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160, 0};

    /* renamed from: s */
    private static int[] f32190s = {44100, 48000, 32000, 0};

    /* renamed from: t */
    private static int[] f32191t = {22050, 24000, 16000, 0};

    /* renamed from: f */
    private int f32192f;

    /* renamed from: g */
    private int[] f32193g;

    /* renamed from: h */
    private int[] f32194h;

    /* renamed from: i */
    private int[] f32195i;

    /* renamed from: j */
    private int f32196j;

    /* renamed from: k */
    private int f32197k;

    /* renamed from: l */
    private int f32198l;

    /* renamed from: m */
    private int f32199m;

    /* renamed from: n */
    private int f32200n;

    /* renamed from: o */
    private int f32201o;

    /* renamed from: p */
    private int f32202p;

    /* renamed from: coocent.music.player.widget.ringtone.c$a */
    /* compiled from: CheapMP3 */
    class C7283a implements C7284d.C7285a {
        C7283a() {
        }

        /* renamed from: a */
        public C7284d mo27963a() {
            return new C7282c();
        }

        /* renamed from: b */
        public String[] mo27964b() {
            return new String[]{"mp3"};
        }
    }

    /* renamed from: l */
    public static C7284d.C7285a m41315l() {
        return new C7283a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0179 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27946a(java.io.File r18) throws java.io.FileNotFoundException, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            super.mo27946a(r18)
            r1 = 0
            r0.f32192f = r1
            r2 = 64
            r0.f32199m = r2
            int[] r3 = new int[r2]
            r0.f32193g = r3
            int[] r3 = new int[r2]
            r0.f32194h = r3
            int[] r2 = new int[r2]
            r0.f32195i = r2
            r0.f32200n = r1
            r2 = 255(0xff, float:3.57E-43)
            r0.f32201o = r2
            r0.f32202p = r1
            java.io.File r2 = r0.f32207b
            long r2 = r2.length()
            int r3 = (int) r2
            r0.f32196j = r3
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r0.f32207b
            r2.<init>(r3)
            r3 = 12
            byte[] r4 = new byte[r3]
            r5 = 11
            r6 = 10
            r7 = 0
        L_0x0039:
            r8 = 0
        L_0x003a:
            int r9 = r0.f32196j
            int r9 = r9 - r3
            if (r7 >= r9) goto L_0x0198
        L_0x003f:
            if (r8 >= r3) goto L_0x0049
            int r9 = 12 - r8
            int r9 = r2.read(r4, r8, r9)
            int r8 = r8 + r9
            goto L_0x003f
        L_0x0049:
            r8 = 0
        L_0x004a:
            if (r8 >= r3) goto L_0x0054
            byte r9 = r4[r8]
            r10 = -1
            if (r9 == r10) goto L_0x0054
            int r8 = r8 + 1
            goto L_0x004a
        L_0x0054:
            coocent.music.player.widget.ringtone.d$b r9 = r0.f32206a
            if (r9 == 0) goto L_0x0069
            double r10 = (double) r7
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 * r12
            int r12 = r0.f32196j
            double r12 = (double) r12
            double r10 = r10 / r12
            boolean r9 = r9.mo26574a(r10)
            if (r9 != 0) goto L_0x0069
            goto L_0x0198
        L_0x0069:
            if (r8 <= 0) goto L_0x007c
            r9 = 0
        L_0x006c:
            int r10 = 12 - r8
            if (r9 >= r10) goto L_0x0079
            int r10 = r8 + r9
            byte r10 = r4[r10]
            r4[r9] = r10
            int r9 = r9 + 1
            goto L_0x006c
        L_0x0079:
            int r7 = r7 + r8
            r8 = r10
            goto L_0x003a
        L_0x007c:
            r8 = 1
            byte r9 = r4[r8]
            r10 = -6
            r11 = 2
            if (r9 == r10) goto L_0x00a8
            byte r9 = r4[r8]
            r10 = -5
            if (r9 != r10) goto L_0x0089
            goto L_0x00a8
        L_0x0089:
            byte r9 = r4[r8]
            r10 = -14
            if (r9 == r10) goto L_0x00a6
            byte r9 = r4[r8]
            r10 = -13
            if (r9 != r10) goto L_0x0096
            goto L_0x00a6
        L_0x0096:
            r9 = 0
        L_0x0097:
            if (r9 >= r5) goto L_0x00a1
            int r10 = r8 + r9
            byte r11 = r4[r10]
            r4[r9] = r11
            r9 = r10
            goto L_0x0097
        L_0x00a1:
            int r7 = r7 + 1
            r8 = 11
            goto L_0x003a
        L_0x00a6:
            r9 = 2
            goto L_0x00a9
        L_0x00a8:
            r9 = 1
        L_0x00a9:
            if (r9 != r8) goto L_0x00be
            int[] r10 = f32188q
            byte r12 = r4[r11]
            r12 = r12 & 240(0xf0, float:3.36E-43)
            int r12 = r12 >> 4
            r10 = r10[r12]
            int[] r12 = f32190s
            byte r13 = r4[r11]
            r13 = r13 & r3
            int r13 = r13 >> r11
            r12 = r12[r13]
            goto L_0x00d0
        L_0x00be:
            int[] r10 = f32189r
            byte r12 = r4[r11]
            r12 = r12 & 240(0xf0, float:3.36E-43)
            int r12 = r12 >> 4
            r10 = r10[r12]
            int[] r12 = f32191t
            byte r13 = r4[r11]
            r13 = r13 & r3
            int r13 = r13 >> r11
            r12 = r12[r13]
        L_0x00d0:
            if (r10 == 0) goto L_0x0184
            if (r12 != 0) goto L_0x00d6
            goto L_0x0184
        L_0x00d6:
            r0.f32198l = r12
            byte r13 = r4[r11]
            r13 = r13 & r11
            int r13 = r13 >> r8
            int r14 = r10 * 144
            int r14 = r14 * 1000
            int r14 = r14 / r12
            int r14 = r14 + r13
            r13 = 3
            byte r15 = r4[r13]
            r3 = 192(0xc0, float:2.69E-43)
            r15 = r15 & r3
            r16 = 9
            if (r15 != r3) goto L_0x0105
            if (r9 != r8) goto L_0x00fa
            byte r3 = r4[r6]
            r3 = r3 & r8
            int r3 = r3 << 7
            byte r9 = r4[r5]
            r9 = r9 & 254(0xfe, float:3.56E-43)
            int r8 = r9 >> 1
            goto L_0x0112
        L_0x00fa:
            byte r3 = r4[r16]
            r3 = r3 & r13
            int r3 = r3 << 6
            byte r8 = r4[r6]
            r8 = r8 & 252(0xfc, float:3.53E-43)
            int r8 = r8 >> r11
            goto L_0x0112
        L_0x0105:
            if (r9 != r8) goto L_0x0114
            byte r3 = r4[r16]
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << r8
            byte r8 = r4[r6]
            r8 = r8 & 128(0x80, float:1.794E-43)
            int r8 = r8 >> 7
        L_0x0112:
            int r3 = r3 + r8
            goto L_0x0115
        L_0x0114:
            r3 = 0
        L_0x0115:
            int r8 = r0.f32200n
            int r8 = r8 + r10
            r0.f32200n = r8
            int[] r9 = r0.f32193g
            int r10 = r0.f32192f
            r9[r10] = r7
            int[] r9 = r0.f32194h
            r9[r10] = r14
            int[] r9 = r0.f32195i
            r9[r10] = r3
            int r9 = r0.f32201o
            if (r3 >= r9) goto L_0x012e
            r0.f32201o = r3
        L_0x012e:
            int r9 = r0.f32202p
            if (r3 <= r9) goto L_0x0134
            r0.f32202p = r3
        L_0x0134:
            int r10 = r10 + 1
            r0.f32192f = r10
            int r3 = r0.f32199m
            if (r10 != r3) goto L_0x0179
            int r8 = r8 / r10
            r0.f32197k = r8
            int r9 = r0.f32196j
            int r9 = r9 / r8
            int r9 = r9 * r12
            r8 = 144000(0x23280, float:2.01787E-40)
            int r9 = r9 / r8
            int r9 = r9 * 11
            int r9 = r9 / r6
            int r8 = r3 * 2
            if (r9 >= r8) goto L_0x0151
            int r9 = r3 * 2
        L_0x0151:
            int[] r3 = new int[r9]
            int[] r8 = new int[r9]
            int[] r10 = new int[r9]
            r11 = 0
        L_0x0158:
            int r12 = r0.f32192f
            if (r11 >= r12) goto L_0x0171
            int[] r12 = r0.f32193g
            r12 = r12[r11]
            r3[r11] = r12
            int[] r12 = r0.f32194h
            r12 = r12[r11]
            r8[r11] = r12
            int[] r12 = r0.f32195i
            r12 = r12[r11]
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x0158
        L_0x0171:
            r0.f32193g = r3
            r0.f32194h = r8
            r0.f32195i = r10
            r0.f32199m = r9
        L_0x0179:
            int r3 = r14 + -12
            long r8 = (long) r3
            r2.skip(r8)
            int r7 = r7 + r14
            r3 = 12
            goto L_0x0039
        L_0x0184:
            r3 = 0
        L_0x0185:
            if (r3 >= r6) goto L_0x0190
            int r8 = r11 + r3
            byte r8 = r4[r8]
            r4[r3] = r8
            int r3 = r3 + 1
            goto L_0x0185
        L_0x0190:
            int r7 = r7 + 2
            r3 = 12
            r8 = 10
            goto L_0x003a
        L_0x0198:
            int r2 = r0.f32192f
            if (r2 <= 0) goto L_0x01a2
            int r1 = r0.f32200n
            int r1 = r1 / r2
            r0.f32197k = r1
            goto L_0x01a4
        L_0x01a2:
            r0.f32197k = r1
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.widget.ringtone.C7282c.mo27946a(java.io.File):void");
    }

    /* renamed from: b */
    public void mo27947b(File file, int i, int i2) throws IOException {
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(this.f32207b);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int[] iArr = this.f32194h;
            int i5 = i + i4;
            if (iArr[i5] > i3) {
                i3 = iArr[i5];
            }
        }
        byte[] bArr = new byte[i3];
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i + i7;
            int i9 = this.f32193g[i8] - i6;
            int i10 = this.f32194h[i8];
            if (i9 > 0) {
                fileInputStream.skip((long) i9);
                i6 += i9;
            }
            fileInputStream.read(bArr, 0, i10);
            fileOutputStream.write(bArr, 0, i10);
            i6 += i10;
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /* renamed from: d */
    public int mo27948d() {
        return this.f32197k;
    }

    /* renamed from: e */
    public String mo27949e() {
        return "MP3";
    }

    /* renamed from: f */
    public int[] mo27950f() {
        return this.f32195i;
    }

    /* renamed from: g */
    public int mo27951g() {
        return this.f32192f;
    }

    /* renamed from: h */
    public int mo27952h() {
        return this.f32198l;
    }

    /* renamed from: i */
    public int mo27953i() {
        return 1152;
    }

    /* renamed from: j */
    public int mo27969j(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i >= this.f32192f) {
            return this.f32196j;
        }
        return this.f32193g[i];
    }
}
