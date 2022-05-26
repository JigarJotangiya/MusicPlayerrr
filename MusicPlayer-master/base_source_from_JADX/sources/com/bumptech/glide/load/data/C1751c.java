package com.bumptech.glide.load.data;

import com.bumptech.glide.load.p030n.p031a0.C1802b;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.data.c */
/* compiled from: BufferedOutputStream */
public final class C1751c extends OutputStream {

    /* renamed from: g */
    private final OutputStream f6524g;

    /* renamed from: h */
    private byte[] f6525h;

    /* renamed from: i */
    private C1802b f6526i;

    /* renamed from: j */
    private int f6527j;

    public C1751c(OutputStream outputStream, C1802b bVar) {
        this(outputStream, bVar, 65536);
    }

    /* renamed from: c */
    private void m8715c() throws IOException {
        int i = this.f6527j;
        if (i > 0) {
            this.f6524g.write(this.f6525h, 0, i);
            this.f6527j = 0;
        }
    }

    /* renamed from: d */
    private void m8716d() throws IOException {
        if (this.f6527j == this.f6525h.length) {
            m8715c();
        }
    }

    /* renamed from: p */
    private void m8717p() {
        byte[] bArr = this.f6525h;
        if (bArr != null) {
            this.f6526i.mo7770d(bArr);
            this.f6525h = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f6524g.close();
            m8717p();
        } catch (Throwable th) {
            this.f6524g.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        m8715c();
        this.f6524g.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f6525h;
        int i2 = this.f6527j;
        this.f6527j = i2 + 1;
        bArr[i2] = (byte) i;
        m8716d();
    }

    C1751c(OutputStream outputStream, C1802b bVar, int i) {
        this.f6524g = outputStream;
        this.f6526i = bVar;
        this.f6525h = (byte[]) bVar.mo7771e(i, byte[].class);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f6527j;
            if (i6 != 0 || i4 < this.f6525h.length) {
                int min = Math.min(i4, this.f6525h.length - i6);
                System.arraycopy(bArr, i5, this.f6525h, this.f6527j, min);
                this.f6527j += min;
                i3 += min;
                m8716d();
            } else {
                this.f6524g.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
