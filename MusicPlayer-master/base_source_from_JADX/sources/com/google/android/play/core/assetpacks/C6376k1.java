package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.play.core.assetpacks.k1 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6376k1 extends OutputStream {

    /* renamed from: g */
    private final C6387m2 f29541g = new C6387m2();

    /* renamed from: h */
    private final File f29542h;

    /* renamed from: i */
    private final C6363h3 f29543i;

    /* renamed from: j */
    private long f29544j;

    /* renamed from: k */
    private long f29545k;

    /* renamed from: l */
    private FileOutputStream f29546l;

    /* renamed from: m */
    private C6393n3 f29547m;

    C6376k1(File file, C6363h3 h3Var) {
        this.f29542h = file;
        this.f29543i = h3Var;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            if (this.f29544j == 0 && this.f29545k == 0) {
                int b = this.f29541g.mo25331b(bArr, i, i2);
                if (b != -1) {
                    i += b;
                    i2 -= b;
                    C6393n3 c = this.f29541g.mo25332c();
                    this.f29547m = c;
                    if (c.mo25340d()) {
                        this.f29544j = 0;
                        this.f29543i.mo25285l(this.f29547m.mo25342f(), 0, this.f29547m.mo25342f().length);
                        this.f29545k = (long) this.f29547m.mo25342f().length;
                    } else if (!this.f29547m.mo25344h() || this.f29547m.mo25343g()) {
                        byte[] f = this.f29547m.mo25342f();
                        this.f29543i.mo25285l(f, 0, f.length);
                        this.f29544j = this.f29547m.mo25338b();
                    } else {
                        this.f29543i.mo25283j(this.f29547m.mo25342f());
                        File file = new File(this.f29542h, this.f29547m.mo25339c());
                        file.getParentFile().mkdirs();
                        this.f29544j = this.f29547m.mo25338b();
                        this.f29546l = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f29547m.mo25343g()) {
                if (this.f29547m.mo25340d()) {
                    this.f29543i.mo25278e(this.f29545k, bArr, i, i2);
                    this.f29545k += (long) i2;
                    i3 = i2;
                } else if (this.f29547m.mo25344h()) {
                    i3 = (int) Math.min((long) i2, this.f29544j);
                    this.f29546l.write(bArr, i, i3);
                    long j = this.f29544j - ((long) i3);
                    this.f29544j = j;
                    if (j == 0) {
                        this.f29546l.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f29544j);
                    int length = this.f29547m.mo25342f().length;
                    this.f29543i.mo25278e((((long) length) + this.f29547m.mo25338b()) - this.f29544j, bArr, i, i3);
                    this.f29544j -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
