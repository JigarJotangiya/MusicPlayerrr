package com.coocent.musiccutter.ringtone;

import android.app.Application;
import android.text.TextUtils;
import com.coocent.musiccutter.ringtone.C2438d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p159f.p166c.p199f.p200h.C4495b;

/* renamed from: com.coocent.musiccutter.ringtone.c */
/* compiled from: CheapMP3 */
public class C2435c extends C2438d {

    /* renamed from: r */
    private static int[] f8542r = {0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 0};

    /* renamed from: s */
    private static int[] f8543s = {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160, 0};

    /* renamed from: t */
    private static int[] f8544t = {44100, 48000, 32000, 0};

    /* renamed from: u */
    private static int[] f8545u = {22050, 24000, 16000, 0};

    /* renamed from: g */
    private int f8546g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int[] f8547h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int[] f8548i;

    /* renamed from: j */
    private int[] f8549j;

    /* renamed from: k */
    private int f8550k;

    /* renamed from: l */
    private int f8551l;

    /* renamed from: m */
    private int f8552m;

    /* renamed from: n */
    private int f8553n;

    /* renamed from: o */
    private int f8554o;

    /* renamed from: p */
    private int f8555p;

    /* renamed from: q */
    private int f8556q;

    /* renamed from: com.coocent.musiccutter.ringtone.c$a */
    /* compiled from: CheapMP3 */
    static class C2436a implements C2438d.C2439a {
        C2436a() {
        }

        /* renamed from: b */
        public String[] mo9483b() {
            return new String[]{"mp3"};
        }

        /* renamed from: c */
        public C2438d mo9484c(Application application) {
            return new C2435c();
        }
    }

    /* renamed from: com.coocent.musiccutter.ringtone.c$b */
    /* compiled from: CheapMP3 */
    class C2437b implements C4495b.C4496a {

        /* renamed from: a */
        final /* synthetic */ int f8557a;

        /* renamed from: b */
        final /* synthetic */ int f8558b;

        /* renamed from: c */
        final /* synthetic */ InputStream f8559c;

        /* renamed from: d */
        final /* synthetic */ C2438d.C2441c f8560d;

        C2437b(int i, int i2, InputStream inputStream, C2438d.C2441c cVar) {
            this.f8557a = i;
            this.f8558b = i2;
            this.f8559c = inputStream;
            this.f8560d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
            if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
            p159f.p166c.p199f.p200h.C4495b.m19707f(com.coocent.musiccutter.ringtone.C2438d.f8563d, android.net.Uri.parse(r12));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
            r10.f8560d.mo9412b(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r10.f8560d.mo9411a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
            r12 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            r11.close();
            r10.f8559c.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
            throw r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0071 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9485a(java.io.OutputStream r11, java.lang.String r12) {
            /*
                r10 = this;
                int r0 = r10.f8557a
                if (r0 != 0) goto L_0x0006
                r0 = 20
            L_0x0006:
                r1 = 0
                r2 = 0
                r3 = 0
            L_0x0009:
                int r4 = r10.f8558b
                if (r2 >= r4) goto L_0x0024
                com.coocent.musiccutter.ringtone.c r4 = com.coocent.musiccutter.ringtone.C2435c.this
                int[] r4 = r4.f8548i
                int r5 = r0 + r2
                r4 = r4[r5]
                if (r4 <= r3) goto L_0x0021
                com.coocent.musiccutter.ringtone.c r3 = com.coocent.musiccutter.ringtone.C2435c.this
                int[] r3 = r3.f8548i
                r3 = r3[r5]
            L_0x0021:
                int r2 = r2 + 1
                goto L_0x0009
            L_0x0024:
                byte[] r2 = new byte[r3]
                r3 = 0
                r4 = 0
            L_0x0028:
                int r5 = r10.f8558b     // Catch:{ all -> 0x0071 }
                if (r3 >= r5) goto L_0x0054
                com.coocent.musiccutter.ringtone.c r5 = com.coocent.musiccutter.ringtone.C2435c.this     // Catch:{ all -> 0x0071 }
                int[] r5 = r5.f8547h     // Catch:{ all -> 0x0071 }
                int r6 = r0 + r3
                r5 = r5[r6]     // Catch:{ all -> 0x0071 }
                int r5 = r5 - r4
                com.coocent.musiccutter.ringtone.c r7 = com.coocent.musiccutter.ringtone.C2435c.this     // Catch:{ all -> 0x0071 }
                int[] r7 = r7.f8548i     // Catch:{ all -> 0x0071 }
                r6 = r7[r6]     // Catch:{ all -> 0x0071 }
                if (r5 <= 0) goto L_0x0048
                java.io.InputStream r7 = r10.f8559c     // Catch:{ all -> 0x0071 }
                long r8 = (long) r5     // Catch:{ all -> 0x0071 }
                r7.skip(r8)     // Catch:{ all -> 0x0071 }
                int r4 = r4 + r5
            L_0x0048:
                java.io.InputStream r5 = r10.f8559c     // Catch:{ all -> 0x0071 }
                r5.read(r2, r1, r6)     // Catch:{ all -> 0x0071 }
                r11.write(r2, r1, r6)     // Catch:{ all -> 0x0071 }
                int r4 = r4 + r6
                int r3 = r3 + 1
                goto L_0x0028
            L_0x0054:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0071 }
                r1 = 29
                if (r0 < r1) goto L_0x0063
                android.app.Application r0 = com.coocent.musiccutter.ringtone.C2438d.f8563d     // Catch:{ all -> 0x0071 }
                android.net.Uri r1 = android.net.Uri.parse(r12)     // Catch:{ all -> 0x0071 }
                p159f.p166c.p199f.p200h.C4495b.m19707f(r0, r1)     // Catch:{ all -> 0x0071 }
            L_0x0063:
                com.coocent.musiccutter.ringtone.d$c r0 = r10.f8560d     // Catch:{ all -> 0x0071 }
                r0.mo9412b(r12)     // Catch:{ all -> 0x0071 }
                r11.close()     // Catch:{ IOException -> 0x007a }
            L_0x006b:
                java.io.InputStream r11 = r10.f8559c     // Catch:{ IOException -> 0x007a }
                r11.close()     // Catch:{ IOException -> 0x007a }
                goto L_0x007a
            L_0x0071:
                com.coocent.musiccutter.ringtone.d$c r12 = r10.f8560d     // Catch:{ all -> 0x007b }
                r12.mo9411a()     // Catch:{ all -> 0x007b }
                r11.close()     // Catch:{ IOException -> 0x007a }
                goto L_0x006b
            L_0x007a:
                return
            L_0x007b:
                r12 = move-exception
                r11.close()     // Catch:{ IOException -> 0x0084 }
                java.io.InputStream r11 = r10.f8559c     // Catch:{ IOException -> 0x0084 }
                r11.close()     // Catch:{ IOException -> 0x0084 }
            L_0x0084:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.coocent.musiccutter.ringtone.C2435c.C2437b.mo9485a(java.io.OutputStream, java.lang.String):void");
        }

        /* renamed from: b */
        public void mo9486b() {
            this.f8560d.mo9411a();
            try {
                this.f8559c.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: v */
    public static C2438d.C2439a m11401v() {
        return new C2436a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0179 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9467a(java.io.File r18) throws java.io.FileNotFoundException, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            super.mo9467a(r18)
            r1 = 0
            r0.f8546g = r1
            r2 = 64
            r0.f8553n = r2
            int[] r3 = new int[r2]
            r0.f8547h = r3
            int[] r3 = new int[r2]
            r0.f8548i = r3
            int[] r2 = new int[r2]
            r0.f8549j = r2
            r0.f8554o = r1
            r2 = 255(0xff, float:3.57E-43)
            r0.f8555p = r2
            r0.f8556q = r1
            java.io.File r2 = r0.f8567b
            long r2 = r2.length()
            int r3 = (int) r2
            r0.f8550k = r3
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r0.f8567b
            r2.<init>(r3)
            r3 = 12
            byte[] r4 = new byte[r3]
            r5 = 11
            r6 = 10
            r7 = 0
        L_0x0039:
            r8 = 0
        L_0x003a:
            int r9 = r0.f8550k
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
            com.coocent.musiccutter.ringtone.d$b r9 = r0.f8566a
            if (r9 == 0) goto L_0x0069
            double r10 = (double) r7
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 * r12
            int r12 = r0.f8550k
            double r12 = (double) r12
            double r10 = r10 / r12
            boolean r9 = r9.mo9404a(r10)
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
            int[] r10 = f8542r
            byte r12 = r4[r11]
            r12 = r12 & 240(0xf0, float:3.36E-43)
            int r12 = r12 >> 4
            r10 = r10[r12]
            int[] r12 = f8544t
            byte r13 = r4[r11]
            r13 = r13 & r3
            int r13 = r13 >> r11
            r12 = r12[r13]
            goto L_0x00d0
        L_0x00be:
            int[] r10 = f8543s
            byte r12 = r4[r11]
            r12 = r12 & 240(0xf0, float:3.36E-43)
            int r12 = r12 >> 4
            r10 = r10[r12]
            int[] r12 = f8545u
            byte r13 = r4[r11]
            r13 = r13 & r3
            int r13 = r13 >> r11
            r12 = r12[r13]
        L_0x00d0:
            if (r10 == 0) goto L_0x0184
            if (r12 != 0) goto L_0x00d6
            goto L_0x0184
        L_0x00d6:
            r0.f8552m = r12
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
            int r8 = r0.f8554o
            int r8 = r8 + r10
            r0.f8554o = r8
            int[] r9 = r0.f8547h
            int r10 = r0.f8546g
            r9[r10] = r7
            int[] r9 = r0.f8548i
            r9[r10] = r14
            int[] r9 = r0.f8549j
            r9[r10] = r3
            int r9 = r0.f8555p
            if (r3 >= r9) goto L_0x012e
            r0.f8555p = r3
        L_0x012e:
            int r9 = r0.f8556q
            if (r3 <= r9) goto L_0x0134
            r0.f8556q = r3
        L_0x0134:
            int r10 = r10 + 1
            r0.f8546g = r10
            int r3 = r0.f8553n
            if (r10 != r3) goto L_0x0179
            int r8 = r8 / r10
            r0.f8551l = r8
            int r9 = r0.f8550k
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
            int r12 = r0.f8546g
            if (r11 >= r12) goto L_0x0171
            int[] r12 = r0.f8547h
            r12 = r12[r11]
            r3[r11] = r12
            int[] r12 = r0.f8548i
            r12 = r12[r11]
            r8[r11] = r12
            int[] r12 = r0.f8549j
            r12 = r12[r11]
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x0158
        L_0x0171:
            r0.f8547h = r3
            r0.f8548i = r8
            r0.f8549j = r10
            r0.f8553n = r9
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
            int r3 = r0.f8546g
            if (r3 <= 0) goto L_0x01a2
            int r1 = r0.f8554o
            int r1 = r1 / r3
            r0.f8551l = r1
            goto L_0x01a4
        L_0x01a2:
            r0.f8551l = r1
        L_0x01a4:
            r2.close()     // Catch:{ IOException -> 0x01a7 }
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.musiccutter.ringtone.C2435c.mo9467a(java.io.File):void");
    }

    /* renamed from: b */
    public void mo9468b(File file, int i, int i2) throws IOException {
        if (i == 0) {
            i = 20;
        }
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(this.f8567b);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int[] iArr = this.f8548i;
            int i5 = i + i4;
            if (iArr[i5] > i3) {
                i3 = iArr[i5];
            }
        }
        byte[] bArr = new byte[i3];
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i + i7;
            int i9 = this.f8547h[i8] - i6;
            int i10 = this.f8548i[i8];
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

    /* renamed from: c */
    public void mo9469c(CharSequence charSequence, String str, long j, int i, int i2, int i3, C2438d.C2441c cVar) throws IOException {
        if (TextUtils.isEmpty(charSequence)) {
            cVar.mo9411a();
            return;
        }
        C4495b.m19705d(C2438d.f8563d, i, charSequence.toString(), str, new C2437b(i2, i3, C4495b.m19704c(C2438d.f8563d, j), cVar));
    }

    /* renamed from: g */
    public int mo9470g() {
        return this.f8551l;
    }

    /* renamed from: h */
    public String mo9471h() {
        return "MP3";
    }

    /* renamed from: i */
    public int[] mo9472i() {
        return this.f8549j;
    }

    /* renamed from: j */
    public int[] mo9473j() {
        return this.f8548i;
    }

    /* renamed from: k */
    public int[] mo9474k() {
        return this.f8547h;
    }

    /* renamed from: l */
    public int mo9475l() {
        return this.f8546g;
    }

    /* renamed from: m */
    public int mo9476m() {
        return this.f8552m;
    }

    /* renamed from: n */
    public int mo9477n() {
        return 1152;
    }

    /* renamed from: o */
    public int mo9491o(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i >= this.f8546g) {
            return this.f8550k;
        }
        return this.f8547h[i];
    }
}
