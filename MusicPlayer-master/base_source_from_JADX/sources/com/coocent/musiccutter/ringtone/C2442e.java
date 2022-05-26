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

/* renamed from: com.coocent.musiccutter.ringtone.e */
/* compiled from: CheapWAV */
public class C2442e extends C2438d {

    /* renamed from: g */
    private int f8568g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int[] f8569h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int[] f8570i;

    /* renamed from: j */
    private int[] f8571j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f8572k;

    /* renamed from: l */
    private int f8573l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f8574m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f8575n;

    /* renamed from: o */
    private int f8576o;

    /* renamed from: com.coocent.musiccutter.ringtone.e$a */
    /* compiled from: CheapWAV */
    static class C2443a implements C2438d.C2439a {
        C2443a() {
        }

        /* renamed from: b */
        public String[] mo9483b() {
            return new String[]{"wav"};
        }

        /* renamed from: c */
        public C2438d mo9484c(Application application) {
            return new C2442e();
        }
    }

    /* renamed from: com.coocent.musiccutter.ringtone.e$b */
    /* compiled from: CheapWAV */
    class C2444b implements C4495b.C4496a {

        /* renamed from: a */
        final /* synthetic */ int f8577a;

        /* renamed from: b */
        final /* synthetic */ int f8578b;

        /* renamed from: c */
        final /* synthetic */ InputStream f8579c;

        /* renamed from: d */
        final /* synthetic */ C2438d.C2441c f8580d;

        C2444b(int i, int i2, InputStream inputStream, C2438d.C2441c cVar) {
            this.f8577a = i;
            this.f8578b = i2;
            this.f8579c = inputStream;
            this.f8580d = cVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:26|27|28|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            r1.f8580d.mo9411a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r25.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x01e6, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r25.close();
            r1.f8579c.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x01ef, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x01dc */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9485a(java.io.OutputStream r25, java.lang.String r26) {
            /*
                r24 = this;
                r1 = r24
                r2 = r25
                int r0 = r1.f8577a
                if (r0 != 0) goto L_0x000a
                r0 = 20
            L_0x000a:
                r4 = 0
                r6 = 0
                r7 = 0
            L_0x000e:
                int r8 = r1.f8578b
                if (r7 >= r8) goto L_0x0022
                com.coocent.musiccutter.ringtone.e r8 = com.coocent.musiccutter.ringtone.C2442e.this
                int[] r8 = r8.f8570i
                int r9 = r1.f8577a
                int r9 = r9 + r7
                r8 = r8[r9]
                long r8 = (long) r8
                long r4 = r4 + r8
                int r7 = r7 + 1
                goto L_0x000e
            L_0x0022:
                r7 = 36
                long r7 = r7 + r4
                com.coocent.musiccutter.ringtone.e r9 = com.coocent.musiccutter.ringtone.C2442e.this
                int r9 = r9.f8574m
                long r9 = (long) r9
                com.coocent.musiccutter.ringtone.e r11 = com.coocent.musiccutter.ringtone.C2442e.this
                int r11 = r11.f8574m
                r12 = 2
                int r11 = r11 * 2
                com.coocent.musiccutter.ringtone.e r13 = com.coocent.musiccutter.ringtone.C2442e.this
                int r13 = r13.f8575n
                int r11 = r11 * r13
                long r13 = (long) r11
                r11 = 44
                byte[] r15 = new byte[r11]
                r16 = 82
                r15[r6] = r16
                r16 = 73
                r17 = 1
                r15[r17] = r16
                r16 = 70
                r15[r12] = r16
                r18 = 3
                r15[r18] = r16
                r16 = 4
                r18 = 255(0xff, double:1.26E-321)
                long r11 = r7 & r18
                int r12 = (int) r11
                byte r11 = (byte) r12
                r15[r16] = r11
                r11 = 5
                r12 = 8
                long r20 = r7 >> r12
                r22 = r4
                long r3 = r20 & r18
                int r4 = (int) r3
                byte r3 = (byte) r4
                r15[r11] = r3
                r3 = 6
                r4 = 16
                long r20 = r7 >> r4
                long r4 = r20 & r18
                int r5 = (int) r4
                byte r4 = (byte) r5
                r15[r3] = r4
                r3 = 7
                r4 = 24
                long r7 = r7 >> r4
                long r7 = r7 & r18
                int r5 = (int) r7
                byte r5 = (byte) r5
                r15[r3] = r5
                r3 = 87
                r15[r12] = r3
                r3 = 9
                r5 = 65
                r15[r3] = r5
                r3 = 10
                r5 = 86
                r15[r3] = r5
                r3 = 11
                r5 = 69
                r15[r3] = r5
                r3 = 12
                r5 = 102(0x66, float:1.43E-43)
                r15[r3] = r5
                r3 = 13
                r5 = 109(0x6d, float:1.53E-43)
                r15[r3] = r5
                r3 = 14
                r5 = 116(0x74, float:1.63E-43)
                r15[r3] = r5
                r3 = 15
                r7 = 32
                r15[r3] = r7
                r3 = 16
                r15[r3] = r3
                r3 = 17
                r15[r3] = r6
                r3 = 18
                r15[r3] = r6
                r3 = 19
                r15[r3] = r6
                r3 = 20
                r15[r3] = r17
                r3 = 21
                r15[r3] = r6
                r3 = 22
                com.coocent.musiccutter.ringtone.e r8 = com.coocent.musiccutter.ringtone.C2442e.this
                int r8 = r8.f8575n
                byte r8 = (byte) r8
                r15[r3] = r8
                r3 = 23
                r15[r3] = r6
                long r5 = r9 & r18
                int r6 = (int) r5
                byte r5 = (byte) r6
                r15[r4] = r5
                r5 = 25
                long r16 = r9 >> r12
                long r7 = r16 & r18
                int r8 = (int) r7
                byte r7 = (byte) r8
                r15[r5] = r7
                r5 = 26
                r7 = 16
                long r16 = r9 >> r7
                long r7 = r16 & r18
                int r8 = (int) r7
                byte r7 = (byte) r8
                r15[r5] = r7
                r5 = 27
                long r7 = r9 >> r4
                long r7 = r7 & r18
                int r8 = (int) r7
                byte r7 = (byte) r8
                r15[r5] = r7
                r5 = 28
                long r7 = r13 & r18
                int r8 = (int) r7
                byte r7 = (byte) r8
                r15[r5] = r7
                long r7 = r13 >> r12
                long r7 = r7 & r18
                int r5 = (int) r7
                byte r5 = (byte) r5
                r7 = 29
                r15[r7] = r5
                r5 = 30
                r8 = 16
                long r9 = r13 >> r8
                long r8 = r9 & r18
                int r9 = (int) r8
                byte r8 = (byte) r9
                r15[r5] = r8
                r5 = 31
                long r8 = r13 >> r4
                long r8 = r8 & r18
                int r9 = (int) r8
                byte r8 = (byte) r9
                r15[r5] = r8
                com.coocent.musiccutter.ringtone.e r5 = com.coocent.musiccutter.ringtone.C2442e.this
                int r5 = r5.f8575n
                r8 = 2
                int r5 = r5 * 2
                byte r5 = (byte) r5
                r6 = 32
                r15[r6] = r5
                r5 = 33
                r3 = 0
                r15[r5] = r3
                r5 = 34
                r6 = 16
                r15[r5] = r6
                r5 = 35
                r15[r5] = r3
                r5 = 36
                r6 = 100
                r15[r5] = r6
                r5 = 37
                r6 = 97
                r15[r5] = r6
                r5 = 38
                r8 = 116(0x74, float:1.63E-43)
                r15[r5] = r8
                r5 = 39
                r15[r5] = r6
                r5 = 40
                long r8 = r22 & r18
                int r6 = (int) r8
                byte r6 = (byte) r6
                r15[r5] = r6
                r5 = 41
                long r8 = r22 >> r12
                long r8 = r8 & r18
                int r6 = (int) r8
                byte r6 = (byte) r6
                r15[r5] = r6
                r5 = 42
                r6 = 16
                long r8 = r22 >> r6
                long r8 = r8 & r18
                int r6 = (int) r8
                byte r6 = (byte) r6
                r15[r5] = r6
                r5 = 43
                long r8 = r22 >> r4
                long r8 = r8 & r18
                int r4 = (int) r8
                byte r4 = (byte) r4
                r15[r5] = r4
                r3 = 44
                r4 = 0
                r2.write(r15, r4, r3)     // Catch:{ all -> 0x01dc }
                com.coocent.musiccutter.ringtone.e r4 = com.coocent.musiccutter.ringtone.C2442e.this     // Catch:{ all -> 0x01dc }
                int r4 = r4.f8572k     // Catch:{ all -> 0x01dc }
                byte[] r4 = new byte[r4]     // Catch:{ all -> 0x01dc }
                r5 = 0
                r6 = 0
            L_0x018e:
                int r8 = r1.f8578b     // Catch:{ all -> 0x01dc }
                if (r5 >= r8) goto L_0x01bf
                com.coocent.musiccutter.ringtone.e r8 = com.coocent.musiccutter.ringtone.C2442e.this     // Catch:{ all -> 0x01dc }
                int[] r8 = r8.f8569h     // Catch:{ all -> 0x01dc }
                int r9 = r0 + r5
                r8 = r8[r9]     // Catch:{ all -> 0x01dc }
                int r8 = r8 - r6
                com.coocent.musiccutter.ringtone.e r10 = com.coocent.musiccutter.ringtone.C2442e.this     // Catch:{ all -> 0x01dc }
                int[] r10 = r10.f8570i     // Catch:{ all -> 0x01dc }
                r9 = r10[r9]     // Catch:{ all -> 0x01dc }
                if (r8 >= 0) goto L_0x01a9
                r3 = 0
                goto L_0x01bc
            L_0x01a9:
                if (r8 <= 0) goto L_0x01b2
                java.io.InputStream r10 = r1.f8579c     // Catch:{ all -> 0x01dc }
                long r11 = (long) r8     // Catch:{ all -> 0x01dc }
                r10.skip(r11)     // Catch:{ all -> 0x01dc }
                int r6 = r6 + r8
            L_0x01b2:
                java.io.InputStream r8 = r1.f8579c     // Catch:{ all -> 0x01dc }
                r3 = 0
                r8.read(r4, r3, r9)     // Catch:{ all -> 0x01dc }
                r2.write(r4, r3, r9)     // Catch:{ all -> 0x01dc }
                int r6 = r6 + r9
            L_0x01bc:
                int r5 = r5 + 1
                goto L_0x018e
            L_0x01bf:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01dc }
                if (r0 < r7) goto L_0x01cc
                android.app.Application r0 = com.coocent.musiccutter.ringtone.C2438d.f8563d     // Catch:{ all -> 0x01dc }
                android.net.Uri r3 = android.net.Uri.parse(r26)     // Catch:{ all -> 0x01dc }
                p159f.p166c.p199f.p200h.C4495b.m19707f(r0, r3)     // Catch:{ all -> 0x01dc }
            L_0x01cc:
                com.coocent.musiccutter.ringtone.d$c r0 = r1.f8580d     // Catch:{ all -> 0x01dc }
                r3 = r26
                r0.mo9412b(r3)     // Catch:{ all -> 0x01dc }
                r25.close()     // Catch:{ IOException -> 0x01e5 }
            L_0x01d6:
                java.io.InputStream r0 = r1.f8579c     // Catch:{ IOException -> 0x01e5 }
                r0.close()     // Catch:{ IOException -> 0x01e5 }
                goto L_0x01e5
            L_0x01dc:
                com.coocent.musiccutter.ringtone.d$c r0 = r1.f8580d     // Catch:{ all -> 0x01e6 }
                r0.mo9411a()     // Catch:{ all -> 0x01e6 }
                r25.close()     // Catch:{ IOException -> 0x01e5 }
                goto L_0x01d6
            L_0x01e5:
                return
            L_0x01e6:
                r0 = move-exception
                r25.close()     // Catch:{ IOException -> 0x01ef }
                java.io.InputStream r2 = r1.f8579c     // Catch:{ IOException -> 0x01ef }
                r2.close()     // Catch:{ IOException -> 0x01ef }
            L_0x01ef:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.coocent.musiccutter.ringtone.C2442e.C2444b.mo9485a(java.io.OutputStream, java.lang.String):void");
        }

        /* renamed from: b */
        public void mo9486b() {
            this.f8580d.mo9411a();
            try {
                this.f8579c.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: y */
    public static C2438d.C2439a m11447y() {
        return new C2443a();
    }

    /* renamed from: a */
    public void mo9467a(File file) throws FileNotFoundException, IOException {
        int i;
        byte[] bArr;
        super.mo9467a(file);
        int length = (int) this.f8567b.length();
        this.f8573l = length;
        if (length >= 128) {
            FileInputStream fileInputStream = new FileInputStream(this.f8567b);
            byte[] bArr2 = new byte[12];
            fileInputStream.read(bArr2, 0, 12);
            this.f8576o += 12;
            if (bArr2[0] == 82) {
                byte b = 1;
                if (bArr2[1] == 73 && bArr2[2] == 70 && bArr2[3] == 70 && bArr2[8] == 87 && bArr2[9] == 65 && bArr2[10] == 86 && bArr2[11] == 69) {
                    this.f8575n = 0;
                    this.f8574m = 0;
                    while (this.f8576o + 8 <= this.f8573l) {
                        byte[] bArr3 = new byte[8];
                        fileInputStream.read(bArr3, 0, 8);
                        this.f8576o += 8;
                        int i2 = ((bArr3[7] & 255) << 24) | ((bArr3[6] & 255) << 16) | ((bArr3[5] & 255) << 8) | (bArr3[4] & 255);
                        if (bArr3[0] == 102 && bArr3[b] == 109 && bArr3[2] == 116 && bArr3[3] == 32) {
                            if (i2 < 16 || i2 > 1024) {
                                throw new IOException("WAV file has bad fmt chunk");
                            }
                            byte[] bArr4 = new byte[i2];
                            fileInputStream.read(bArr4, 0, i2);
                            this.f8576o += i2;
                            byte b2 = ((bArr4[b] & 255) << 8) | (bArr4[0] & 255);
                            this.f8575n = ((bArr4[3] & 255) << 8) | (bArr4[2] & 255);
                            this.f8574m = (bArr4[4] & 255) | ((bArr4[7] & 255) << 24) | ((bArr4[6] & 255) << 16) | ((bArr4[5] & 255) << 8);
                            if (b2 != b) {
                                throw new IOException("Unsupported WAV file encoding");
                            }
                        } else if (bArr3[0] == 100 && bArr3[b] == 97 && bArr3[2] == 116 && bArr3[3] == 97) {
                            int i3 = this.f8575n;
                            if (i3 == 0 || (i = this.f8574m) == 0) {
                                throw new IOException("Bad WAV file: data chunk before fmt chunk");
                            }
                            int i4 = ((i * i3) / 50) * 2;
                            this.f8572k = i4;
                            int i5 = ((i4 - 1) + i2) / i4;
                            this.f8568g = i5;
                            this.f8569h = new int[i5];
                            this.f8570i = new int[i5];
                            this.f8571j = new int[i5];
                            byte[] bArr5 = new byte[i4];
                            int i6 = 0;
                            int i7 = 0;
                            while (i6 < i2) {
                                int i8 = this.f8572k;
                                if (i6 + i8 > i2) {
                                    i6 = i2 - i8;
                                }
                                fileInputStream.read(bArr5, 0, i8);
                                int i9 = 0;
                                for (int i10 = 1; i10 < i8; i10 += this.f8575n * 4) {
                                    int abs = Math.abs(bArr5[i10]);
                                    if (abs > i9) {
                                        i9 = abs;
                                    }
                                }
                                int[] iArr = this.f8569h;
                                int i11 = this.f8576o;
                                iArr[i7] = i11;
                                this.f8570i[i7] = i8;
                                this.f8571j[i7] = i9;
                                i7 += b;
                                this.f8576o = i11 + i8;
                                i6 += i8;
                                C2438d.C2440b bVar = this.f8566a;
                                if (bVar != null) {
                                    bArr = bArr5;
                                    if (!bVar.mo9404a((((double) i6) * 1.0d) / ((double) i2))) {
                                        break;
                                    }
                                } else {
                                    bArr = bArr5;
                                }
                                bArr5 = bArr;
                                b = 1;
                            }
                        } else {
                            fileInputStream.skip((long) i2);
                            this.f8576o += i2;
                        }
                        b = 1;
                    }
                    try {
                        fileInputStream.close();
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
            throw new IOException("Not a WAV file");
        }
        throw new IOException("File too small to parse");
    }

    /* renamed from: b */
    public void mo9468b(File file, int i, int i2) throws IOException {
        int i3 = i2;
        int i4 = i == 0 ? 20 : i;
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(this.f8567b);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        long j = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            j += (long) this.f8570i[i4 + i5];
        }
        long j2 = 36 + j;
        int i6 = this.f8574m;
        int i7 = this.f8575n;
        int i8 = i4;
        long j3 = (long) (i6 * 2 * i7);
        long j4 = (long) i6;
        fileOutputStream.write(new byte[]{82, 73, 70, 70, (byte) ((int) (j2 & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 24) & 255)), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) i7, 0, (byte) ((int) (j4 & 255)), (byte) ((int) ((j4 >> 8) & 255)), (byte) ((int) ((j4 >> 16) & 255)), (byte) ((int) ((j4 >> 24) & 255)), (byte) ((int) (j3 & 255)), (byte) ((int) ((j3 >> 8) & 255)), (byte) ((int) ((j3 >> 16) & 255)), (byte) ((int) ((j3 >> 24) & 255)), (byte) (i7 * 2), 0, 16, 0, 100, 97, 116, 97, (byte) ((int) (j & 255)), (byte) ((int) ((j >> 8) & 255)), (byte) ((int) ((j >> 16) & 255)), (byte) ((int) ((j >> 24) & 255))}, 0, 44);
        byte[] bArr = new byte[this.f8572k];
        int i9 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = i8 + i10;
            int i12 = this.f8569h[i11] - i9;
            int i13 = this.f8570i[i11];
            if (i12 >= 0) {
                if (i12 > 0) {
                    fileInputStream.skip((long) i12);
                    i9 += i12;
                }
                fileInputStream.read(bArr, 0, i13);
                fileOutputStream.write(bArr, 0, i13);
                i9 += i13;
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /* renamed from: c */
    public void mo9469c(CharSequence charSequence, String str, long j, int i, int i2, int i3, C2438d.C2441c cVar) throws IOException {
        if (!TextUtils.isEmpty(charSequence)) {
            C4495b.m19705d(C2438d.f8563d, i, charSequence.toString(), str, new C2444b(i2, i3, C4495b.m19704c(C2438d.f8563d, j), cVar));
        }
    }

    /* renamed from: g */
    public int mo9470g() {
        return ((this.f8574m * this.f8575n) * 2) / 1024;
    }

    /* renamed from: h */
    public String mo9471h() {
        return "WAV";
    }

    /* renamed from: i */
    public int[] mo9472i() {
        return this.f8571j;
    }

    /* renamed from: j */
    public int[] mo9473j() {
        return this.f8570i;
    }

    /* renamed from: k */
    public int[] mo9474k() {
        return this.f8569h;
    }

    /* renamed from: l */
    public int mo9475l() {
        return this.f8568g;
    }

    /* renamed from: m */
    public int mo9476m() {
        return this.f8574m;
    }

    /* renamed from: n */
    public int mo9477n() {
        return this.f8574m / 50;
    }
}
