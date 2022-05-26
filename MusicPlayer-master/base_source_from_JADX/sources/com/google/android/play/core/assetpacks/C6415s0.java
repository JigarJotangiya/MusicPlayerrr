package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.s0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6415s0 extends FilterInputStream {

    /* renamed from: g */
    private final C6387m2 f29629g = new C6387m2();

    /* renamed from: h */
    private byte[] f29630h = new byte[4096];

    /* renamed from: i */
    private long f29631i;

    /* renamed from: j */
    private boolean f29632j = false;

    /* renamed from: k */
    private boolean f29633k = false;

    C6415s0(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: E */
    private final int m37776E(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* renamed from: H */
    private final boolean m37777H(int i) throws IOException {
        int E = m37776E(this.f29630h, 0, i);
        if (E != i) {
            int i2 = i - E;
            if (m37776E(this.f29630h, E, i2) != i2) {
                this.f29629g.mo25331b(this.f29630h, 0, E);
                return false;
            }
        }
        this.f29629g.mo25331b(this.f29630h, 0, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo25357c() {
        return this.f29631i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C6393n3 mo25358d() throws IOException {
        byte[] bArr;
        if (this.f29631i > 0) {
            do {
                bArr = this.f29630h;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f29632j || this.f29633k) {
            return new C6395o0((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!m37777H(30)) {
            this.f29632j = true;
            return this.f29629g.mo25332c();
        }
        C6393n3 c = this.f29629g.mo25332c();
        if (c.mo25340d()) {
            this.f29633k = true;
            return c;
        } else if (c.mo25338b() != 4294967295L) {
            int a = this.f29629g.mo25330a() - 30;
            long j = (long) a;
            int length = this.f29630h.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f29630h = Arrays.copyOf(this.f29630h, length);
            }
            if (!m37777H(a)) {
                this.f29632j = true;
                return this.f29629g.mo25332c();
            }
            C6393n3 c2 = this.f29629g.mo25332c();
            this.f29631i = c2.mo25338b();
            return c2;
        } else {
            throw new C6361h1("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo25359p() {
        return this.f29633k;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo25362x() {
        return this.f29632j;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f29631i;
        if (j <= 0 || this.f29632j) {
            return -1;
        }
        int E = m37776E(bArr, i, (int) Math.min(j, (long) i2));
        this.f29631i -= (long) E;
        if (E != 0) {
            return E;
        }
        this.f29632j = true;
        return 0;
    }
}
