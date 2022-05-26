package coocent.music.player.widget.ringtone;

import coocent.music.player.widget.ringtone.C7284d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.music.player.widget.ringtone.a */
/* compiled from: CheapAAC */
public class C7277a extends C7284d {

    /* renamed from: s */
    public static final int[] f32155s = {1684631142, 1751411826, 1835296868, 1835297121, 1835626086, 1836019574, 1836476516, 1936549988, 1937007212, 1937011556, 1937011578, 1937011827, 1953196132, 1953653099};

    /* renamed from: t */
    public static final int[] f32156t = {1684631142, 1751411826, 1835296868, 1836476516, 1936549988, 1953196132, 1937011556};

    /* renamed from: f */
    private int f32157f;

    /* renamed from: g */
    private int[] f32158g;

    /* renamed from: h */
    private int[] f32159h;

    /* renamed from: i */
    private int[] f32160i;

    /* renamed from: j */
    private int f32161j;

    /* renamed from: k */
    private HashMap<Integer, C7279b> f32162k;

    /* renamed from: l */
    private int f32163l;

    /* renamed from: m */
    private int f32164m;

    /* renamed from: n */
    private int f32165n;

    /* renamed from: o */
    private int f32166o;

    /* renamed from: p */
    private int f32167p;

    /* renamed from: q */
    private int f32168q;

    /* renamed from: r */
    private int f32169r;

    /* renamed from: coocent.music.player.widget.ringtone.a$a */
    /* compiled from: CheapAAC */
    class C7278a implements C7284d.C7285a {
        C7278a() {
        }

        /* renamed from: a */
        public C7284d mo27963a() {
            return new C7277a();
        }

        /* renamed from: b */
        public String[] mo27964b() {
            return new String[]{"aac", "m4a"};
        }
    }

    /* renamed from: coocent.music.player.widget.ringtone.a$b */
    /* compiled from: CheapAAC */
    class C7279b {

        /* renamed from: a */
        public int f32170a;

        /* renamed from: b */
        public byte[] f32171b;

        C7279b(C7277a aVar) {
        }
    }

    /* renamed from: p */
    public static C7284d.C7285a m41278p() {
        return new C7278a();
    }

    /* renamed from: r */
    private void m41279r(InputStream inputStream, int i) throws IOException {
        while (i > 8) {
            int i2 = this.f32165n;
            byte[] bArr = new byte[8];
            inputStream.read(bArr, 0, 8);
            byte b = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            if (b > i) {
                b = i;
            }
            byte b2 = (bArr[7] & 255) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
            C7279b bVar = new C7279b(this);
            bVar.f32170a = b;
            this.f32162k.put(Integer.valueOf(b2), bVar);
            int i3 = this.f32165n + 8;
            this.f32165n = i3;
            if (b2 == 1836019574 || b2 == 1953653099 || b2 == 1835297121 || b2 == 1835626086 || b2 == 1937007212) {
                m41279r(inputStream, b);
            } else if (b2 == 1937011578) {
                mo27960t(inputStream, b - 8);
            } else if (b2 == 1937011827) {
                mo27961u(inputStream, b - 8);
            } else if (b2 == 1835295092) {
                this.f32168q = i3;
                this.f32169r = b - 8;
            } else {
                for (int i4 : f32156t) {
                    if (i4 == b2) {
                        int i5 = b - 8;
                        byte[] bArr2 = new byte[i5];
                        inputStream.read(bArr2, 0, i5);
                        this.f32165n += i5;
                        this.f32162k.get(Integer.valueOf(b2)).f32171b = bArr2;
                    }
                }
            }
            if (b2 == 1937011556) {
                mo27959s();
            }
            i -= b;
            int i6 = b - (this.f32165n - i2);
            if (i6 >= 0) {
                inputStream.skip((long) i6);
                this.f32165n += i6;
            } else {
                throw new IOException("Went over by " + (-i6) + " bytes");
            }
        }
    }

    /* renamed from: a */
    public void mo27946a(File file) throws FileNotFoundException, IOException {
        super.mo27946a(file);
        this.f32163l = 0;
        this.f32164m = 0;
        this.f32157f = 0;
        this.f32166o = 255;
        this.f32167p = 0;
        this.f32165n = 0;
        this.f32168q = -1;
        this.f32169r = -1;
        this.f32162k = new HashMap<>();
        int length = (int) this.f32207b.length();
        this.f32161j = length;
        if (length >= 128) {
            byte[] bArr = new byte[8];
            new FileInputStream(this.f32207b).read(bArr, 0, 8);
            if (bArr[0] == 0 && bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                m41279r(new FileInputStream(this.f32207b), this.f32161j);
                if (this.f32168q <= 0 || this.f32169r <= 0) {
                    throw new IOException("Didn't find mdat");
                }
                FileInputStream fileInputStream = new FileInputStream(this.f32207b);
                fileInputStream.skip((long) this.f32168q);
                this.f32165n = this.f32168q;
                mo27958q(fileInputStream, this.f32169r);
                boolean z = false;
                for (int i : f32155s) {
                    if (!this.f32162k.containsKey(Integer.valueOf(i))) {
                        System.out.println("Missing atom: " + mo27957o(i));
                        z = true;
                    }
                }
                if (z) {
                    throw new IOException("Could not parse MP4 file");
                }
                return;
            }
            throw new IOException("Unknown file format");
        }
        throw new IOException("File too small to parse");
    }

    /* renamed from: b */
    public void mo27947b(File file, int i, int i2) throws IOException {
        int i3 = i2;
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(this.f32207b);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        mo27954l(1718909296, new byte[]{77, 52, 65, 32, 0, 0, 0, 0, 77, 52, 65, 32, 109, 112, 52, 50, 105, 115, 111, 109, 0, 0, 0, 0});
        byte b = (byte) ((i3 >> 24) & 255);
        byte b2 = (byte) ((i3 >> 16) & 255);
        byte b3 = (byte) ((i3 >> 8) & 255);
        byte b4 = (byte) (i3 & 255);
        int i4 = this.f32164m;
        mo27954l(1937011827, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, b, b2, b3, b4, (byte) ((i4 >> 24) & 255), (byte) ((i4 >> 16) & 255), (byte) ((i4 >> 8) & 255), (byte) (i4 & 255)});
        mo27954l(1937011555, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, b, b2, b3, b4, 0, 0, 0, 1});
        int i5 = i3 * 4;
        byte[] bArr = new byte[(i5 + 12)];
        bArr[8] = b;
        bArr[9] = b2;
        bArr[10] = b3;
        bArr[11] = b4;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i6 * 4;
            int[] iArr = this.f32159h;
            int i8 = i + i6;
            bArr[i7 + 12] = (byte) ((iArr[i8] >> 24) & 255);
            bArr[i7 + 13] = (byte) ((iArr[i8] >> 16) & 255);
            bArr[i7 + 14] = (byte) ((iArr[i8] >> 8) & 255);
            bArr[i7 + 15] = (byte) (iArr[i8] & 255);
        }
        mo27954l(1937011578, bArr);
        int i9 = i5 + 144 + this.f32162k.get(1937011556).f32170a + this.f32162k.get(1937011555).f32170a + this.f32162k.get(1836476516).f32170a + this.f32162k.get(1953196132).f32170a + this.f32162k.get(1835296868).f32170a + this.f32162k.get(1751411826).f32170a + this.f32162k.get(1936549988).f32170a + this.f32162k.get(1684631142).f32170a;
        mo27954l(1937007471, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, (byte) ((i9 >> 24) & 255), (byte) ((i9 >> 16) & 255), (byte) ((i9 >> 8) & 255), (byte) (i9 & 255)});
        this.f32162k.get(1937007212).f32170a = this.f32162k.get(1937011556).f32170a + 8 + this.f32162k.get(1937011827).f32170a + this.f32162k.get(1937011555).f32170a + this.f32162k.get(1937011578).f32170a + this.f32162k.get(1937007471).f32170a;
        this.f32162k.get(1835626086).f32170a = this.f32162k.get(1684631142).f32170a + 8 + this.f32162k.get(1936549988).f32170a + this.f32162k.get(1937007212).f32170a;
        this.f32162k.get(1835297121).f32170a = this.f32162k.get(1835296868).f32170a + 8 + this.f32162k.get(1751411826).f32170a + this.f32162k.get(1835626086).f32170a;
        this.f32162k.get(1953653099).f32170a = this.f32162k.get(1953196132).f32170a + 8 + this.f32162k.get(1835297121).f32170a;
        this.f32162k.get(1836019574).f32170a = this.f32162k.get(1836476516).f32170a + 8 + this.f32162k.get(1953653099).f32170a;
        int i10 = 8;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += this.f32159h[i + i11];
        }
        this.f32162k.get(1835295092).f32170a = i10;
        mo27956n(fileOutputStream, 1718909296);
        mo27955m(fileOutputStream, 1836019574);
        mo27956n(fileOutputStream, 1836476516);
        mo27955m(fileOutputStream, 1953653099);
        mo27956n(fileOutputStream, 1953196132);
        mo27955m(fileOutputStream, 1835297121);
        mo27956n(fileOutputStream, 1835296868);
        mo27956n(fileOutputStream, 1751411826);
        mo27955m(fileOutputStream, 1835626086);
        mo27956n(fileOutputStream, 1684631142);
        mo27956n(fileOutputStream, 1936549988);
        mo27955m(fileOutputStream, 1937007212);
        mo27956n(fileOutputStream, 1937011556);
        mo27956n(fileOutputStream, 1937011827);
        mo27956n(fileOutputStream, 1937011555);
        mo27956n(fileOutputStream, 1937011578);
        mo27956n(fileOutputStream, 1937007471);
        mo27955m(fileOutputStream, 1835295092);
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            int[] iArr2 = this.f32159h;
            int i14 = i + i13;
            if (iArr2[i14] > i12) {
                i12 = iArr2[i14];
            }
        }
        byte[] bArr2 = new byte[i12];
        int i15 = 0;
        for (int i16 = 0; i16 < i3; i16++) {
            int i17 = i + i16;
            int i18 = this.f32158g[i17] - i15;
            int i19 = this.f32159h[i17];
            if (i18 >= 0) {
                if (i18 > 0) {
                    fileInputStream.skip((long) i18);
                    i15 += i18;
                }
                fileInputStream.read(bArr2, 0, i19);
                fileOutputStream.write(bArr2, 0, i19);
                i15 += i19;
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /* renamed from: d */
    public int mo27948d() {
        try {
            return this.f32161j / (this.f32157f * this.f32164m);
        } catch (ArithmeticException unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public String mo27949e() {
        return "AAC";
    }

    /* renamed from: f */
    public int[] mo27950f() {
        return this.f32160i;
    }

    /* renamed from: g */
    public int mo27951g() {
        return this.f32157f;
    }

    /* renamed from: h */
    public int mo27952h() {
        return this.f32163l;
    }

    /* renamed from: i */
    public int mo27953i() {
        return this.f32164m;
    }

    /* renamed from: l */
    public void mo27954l(int i, byte[] bArr) {
        C7279b bVar = this.f32162k.get(Integer.valueOf(i));
        if (bVar == null) {
            bVar = new C7279b(this);
            this.f32162k.put(Integer.valueOf(i), bVar);
        }
        bVar.f32170a = bArr.length + 8;
        bVar.f32171b = bArr;
    }

    /* renamed from: m */
    public void mo27955m(FileOutputStream fileOutputStream, int i) throws IOException {
        int i2 = this.f32162k.get(Integer.valueOf(i)).f32170a;
        fileOutputStream.write(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255), (byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)}, 0, 8);
    }

    /* renamed from: n */
    public void mo27956n(FileOutputStream fileOutputStream, int i) throws IOException {
        C7279b bVar = this.f32162k.get(Integer.valueOf(i));
        mo27955m(fileOutputStream, i);
        fileOutputStream.write(bVar.f32171b, 0, bVar.f32170a - 8);
    }

    /* renamed from: o */
    public String mo27957o(int i) {
        return (((BuildConfig.FLAVOR + ((char) ((i >> 24) & 255))) + ((char) ((i >> 16) & 255))) + ((char) ((i >> 8) & 255))) + ((char) (i & 255));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo27958q(InputStream inputStream, int i) throws IOException {
        int i2 = this.f32165n;
        int i3 = 0;
        while (i3 < this.f32157f) {
            int[] iArr = this.f32158g;
            int i4 = this.f32165n;
            iArr[i3] = i4;
            if ((i4 - i2) + this.f32159h[i3] > i - 8) {
                this.f32160i[i3] = 0;
            } else {
                mo27962v(inputStream, i3);
            }
            int[] iArr2 = this.f32160i;
            if (iArr2[i3] < this.f32166o) {
                this.f32166o = iArr2[i3];
            }
            if (iArr2[i3] > this.f32167p) {
                this.f32167p = iArr2[i3];
            }
            C7284d.C7286b bVar = this.f32206a;
            if (bVar == null || bVar.mo26574a((((double) this.f32165n) * 1.0d) / ((double) this.f32161j))) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo27959s() {
        byte[] bArr = this.f32162k.get(1937011556).f32171b;
        byte b = bArr[32];
        byte b2 = bArr[33];
        this.f32163l = (bArr[41] & 255) | ((bArr[40] & 255) << 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo27960t(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[12];
        inputStream.read(bArr, 0, 12);
        this.f32165n += 12;
        int i2 = (bArr[11] & 255) | ((bArr[8] & 255) << 24) | ((bArr[9] & 255) << 16) | ((bArr[10] & 255) << 8);
        this.f32157f = i2;
        this.f32158g = new int[i2];
        this.f32159h = new int[i2];
        this.f32160i = new int[i2];
        byte[] bArr2 = new byte[(i2 * 4)];
        inputStream.read(bArr2, 0, i2 * 4);
        this.f32165n += this.f32157f * 4;
        for (int i3 = 0; i3 < this.f32157f; i3++) {
            int i4 = i3 * 4;
            this.f32159h[i3] = (bArr2[i4 + 3] & 255) | ((bArr2[i4 + 0] & 255) << 24) | ((bArr2[i4 + 1] & 255) << 16) | ((bArr2[i4 + 2] & 255) << 8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo27961u(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[16];
        inputStream.read(bArr, 0, 16);
        this.f32165n += 16;
        this.f32164m = ((bArr[12] & 255) << 24) | ((bArr[13] & 255) << 16) | ((bArr[14] & 255) << 8) | (bArr[15] & 255);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo27962v(InputStream inputStream, int i) throws IOException {
        int i2;
        int i3;
        int i4;
        byte b;
        InputStream inputStream2 = inputStream;
        int[] iArr = this.f32159h;
        if (iArr[i] < 4) {
            this.f32160i[i] = 0;
            inputStream2.skip((long) iArr[i]);
            return;
        }
        int i5 = this.f32165n;
        byte[] bArr = new byte[4];
        inputStream2.read(bArr, 0, 4);
        this.f32165n += 4;
        int i6 = (bArr[0] & 224) >> 5;
        if (i6 == 0) {
            this.f32160i[i] = ((bArr[1] & 254) >> 1) | ((bArr[0] & 1) << 7);
        } else if (i6 != 1) {
            this.f32160i[i] = 0;
        } else {
            int i7 = (bArr[1] & 96) >> 5;
            byte b2 = bArr[1];
            if (i7 == 2) {
                b = bArr[1] & 15;
                i4 = (bArr[2] & 254) >> 1;
                i3 = ((bArr[2] & 1) << 1) | ((bArr[3] & 128) >> 7);
                i2 = 25;
            } else {
                b = ((bArr[1] & 15) << 2) | ((bArr[2] & 192) >> 6);
                i4 = -1;
                i3 = (bArr[2] & 24) >> 3;
                i2 = 21;
            }
            if (i3 == 1) {
                int i8 = 0;
                for (int i9 = 0; i9 < 7; i9++) {
                    if (((1 << i9) & i4) == 0) {
                        i8++;
                    }
                }
                i2 += b * (i8 + 1);
            }
            int i10 = ((i2 + 7) / 8) + 1;
            byte[] bArr2 = new byte[i10];
            bArr2[0] = bArr[0];
            bArr2[1] = bArr[1];
            bArr2[2] = bArr[2];
            bArr2[3] = bArr[3];
            int i11 = i10 - 4;
            inputStream2.read(bArr2, 4, i11);
            this.f32165n += i11;
            int i12 = 0;
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = i13 + i2;
                int i15 = i14 / 8;
                int i16 = 7 - (i14 % 8);
                i12 += ((bArr2[i15] & (1 << i16)) >> i16) << (7 - i13);
            }
            this.f32160i[i] = i12;
        }
        int i17 = this.f32159h[i] - (this.f32165n - i5);
        inputStream2.skip((long) i17);
        this.f32165n += i17;
    }
}
