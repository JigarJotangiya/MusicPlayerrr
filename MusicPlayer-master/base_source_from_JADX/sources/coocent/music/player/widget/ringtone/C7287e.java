package coocent.music.player.widget.ringtone;

import coocent.music.player.widget.ringtone.C7284d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: coocent.music.player.widget.ringtone.e */
/* compiled from: CheapWAV */
public class C7287e extends C7284d {

    /* renamed from: f */
    private int f32208f;

    /* renamed from: g */
    private int[] f32209g;

    /* renamed from: h */
    private int[] f32210h;

    /* renamed from: i */
    private int[] f32211i;

    /* renamed from: j */
    private int f32212j;

    /* renamed from: k */
    private int f32213k;

    /* renamed from: l */
    private int f32214l;

    /* renamed from: m */
    private int f32215m;

    /* renamed from: n */
    private int f32216n;

    /* renamed from: coocent.music.player.widget.ringtone.e$a */
    /* compiled from: CheapWAV */
    class C7288a implements C7284d.C7285a {
        C7288a() {
        }

        /* renamed from: a */
        public C7284d mo27963a() {
            return new C7287e();
        }

        /* renamed from: b */
        public String[] mo27964b() {
            return new String[]{"wav"};
        }
    }

    /* renamed from: l */
    public static C7284d.C7285a m41341l() {
        return new C7288a();
    }

    /* renamed from: a */
    public void mo27946a(File file) throws FileNotFoundException, IOException {
        int i;
        byte[] bArr;
        super.mo27946a(file);
        int length = (int) this.f32207b.length();
        this.f32213k = length;
        if (length >= 128) {
            FileInputStream fileInputStream = new FileInputStream(this.f32207b);
            byte[] bArr2 = new byte[12];
            fileInputStream.read(bArr2, 0, 12);
            this.f32216n += 12;
            if (bArr2[0] == 82) {
                byte b = 1;
                if (bArr2[1] == 73 && bArr2[2] == 70 && bArr2[3] == 70 && bArr2[8] == 87 && bArr2[9] == 65 && bArr2[10] == 86 && bArr2[11] == 69) {
                    this.f32215m = 0;
                    this.f32214l = 0;
                    while (this.f32216n + 8 <= this.f32213k) {
                        byte[] bArr3 = new byte[8];
                        fileInputStream.read(bArr3, 0, 8);
                        this.f32216n += 8;
                        int i2 = ((bArr3[7] & 255) << 24) | ((bArr3[6] & 255) << 16) | ((bArr3[5] & 255) << 8) | (bArr3[4] & 255);
                        if (bArr3[0] == 102 && bArr3[b] == 109 && bArr3[2] == 116 && bArr3[3] == 32) {
                            if (i2 < 16 || i2 > 1024) {
                                throw new IOException("WAV file has bad fmt chunk");
                            }
                            byte[] bArr4 = new byte[i2];
                            fileInputStream.read(bArr4, 0, i2);
                            this.f32216n += i2;
                            byte b2 = ((bArr4[b] & 255) << 8) | (bArr4[0] & 255);
                            this.f32215m = ((bArr4[3] & 255) << 8) | (bArr4[2] & 255);
                            this.f32214l = (bArr4[4] & 255) | ((bArr4[7] & 255) << 24) | ((bArr4[6] & 255) << 16) | ((bArr4[5] & 255) << 8);
                            if (b2 != b) {
                                throw new IOException("Unsupported WAV file encoding");
                            }
                        } else if (bArr3[0] == 100 && bArr3[b] == 97 && bArr3[2] == 116 && bArr3[3] == 97) {
                            int i3 = this.f32215m;
                            if (i3 == 0 || (i = this.f32214l) == 0) {
                                throw new IOException("Bad WAV file: data chunk before fmt chunk");
                            }
                            int i4 = ((i * i3) / 50) * 2;
                            this.f32212j = i4;
                            int i5 = ((i4 - 1) + i2) / i4;
                            this.f32208f = i5;
                            this.f32209g = new int[i5];
                            this.f32210h = new int[i5];
                            this.f32211i = new int[i5];
                            byte[] bArr5 = new byte[i4];
                            int i6 = 0;
                            int i7 = 0;
                            while (i6 < i2) {
                                int i8 = this.f32212j;
                                if (i6 + i8 > i2) {
                                    i6 = i2 - i8;
                                }
                                fileInputStream.read(bArr5, 0, i8);
                                int i9 = 0;
                                for (int i10 = 1; i10 < i8; i10 += this.f32215m * 4) {
                                    int abs = Math.abs(bArr5[i10]);
                                    if (abs > i9) {
                                        i9 = abs;
                                    }
                                }
                                int[] iArr = this.f32209g;
                                int i11 = this.f32216n;
                                iArr[i7] = i11;
                                this.f32210h[i7] = i8;
                                this.f32211i[i7] = i9;
                                i7 += b;
                                this.f32216n = i11 + i8;
                                i6 += i8;
                                C7284d.C7286b bVar = this.f32206a;
                                if (bVar != null) {
                                    bArr = bArr5;
                                    if (!bVar.mo26574a((((double) i6) * 1.0d) / ((double) i2))) {
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
                            this.f32216n += i2;
                        }
                        b = 1;
                    }
                    return;
                }
            }
            throw new IOException("Not a WAV file");
        }
        throw new IOException("File too small to parse");
    }

    /* renamed from: b */
    public void mo27947b(File file, int i, int i2) throws IOException {
        int i3 = i2;
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(this.f32207b);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        long j = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j += (long) this.f32210h[i + i4];
        }
        long j2 = 36 + j;
        int i5 = this.f32214l;
        int i6 = this.f32215m;
        long j3 = (long) (i5 * 2 * i6);
        long j4 = (long) i5;
        long j5 = j;
        fileOutputStream.write(new byte[]{82, 73, 70, 70, (byte) ((int) (j2 & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 24) & 255)), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) i6, 0, (byte) ((int) (j4 & 255)), (byte) ((int) ((j4 >> 8) & 255)), (byte) ((int) ((j4 >> 16) & 255)), (byte) ((int) ((j4 >> 24) & 255)), (byte) ((int) (j3 & 255)), (byte) ((int) ((j3 >> 8) & 255)), (byte) ((int) ((j3 >> 16) & 255)), (byte) ((int) ((j3 >> 24) & 255)), (byte) (i6 * 2), 0, 16, 0, 100, 97, 116, 97, (byte) ((int) (j5 & 255)), (byte) ((int) ((j5 >> 8) & 255)), (byte) ((int) ((j5 >> 16) & 255)), (byte) ((int) ((j5 >> 24) & 255))}, 0, 44);
        byte[] bArr = new byte[this.f32212j];
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = i + i8;
            int i10 = this.f32209g[i9] - i7;
            int i11 = this.f32210h[i9];
            if (i10 >= 0) {
                if (i10 > 0) {
                    fileInputStream.skip((long) i10);
                    i7 += i10;
                }
                fileInputStream.read(bArr, 0, i11);
                fileOutputStream.write(bArr, 0, i11);
                i7 += i11;
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /* renamed from: d */
    public int mo27948d() {
        return ((this.f32214l * this.f32215m) * 2) / 1024;
    }

    /* renamed from: e */
    public String mo27949e() {
        return "WAV";
    }

    /* renamed from: f */
    public int[] mo27950f() {
        return this.f32211i;
    }

    /* renamed from: g */
    public int mo27951g() {
        return this.f32208f;
    }

    /* renamed from: h */
    public int mo27952h() {
        return this.f32214l;
    }

    /* renamed from: i */
    public int mo27953i() {
        return this.f32214l / 50;
    }
}
