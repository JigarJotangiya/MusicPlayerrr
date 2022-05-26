package com.bumptech.glide.p051s;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.s.c */
/* compiled from: ContentLengthInputStream */
public final class C2183c extends FilterInputStream {

    /* renamed from: g */
    private final long f7422g;

    /* renamed from: h */
    private int f7423h;

    private C2183c(InputStream inputStream, long j) {
        super(inputStream);
        this.f7422g = j;
    }

    /* renamed from: c */
    private int m10244c(int i) throws IOException {
        if (i >= 0) {
            this.f7423h += i;
        } else if (this.f7422g - ((long) this.f7423h) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f7422g + ", but read: " + this.f7423h);
        }
        return i;
    }

    /* renamed from: d */
    public static InputStream m10245d(InputStream inputStream, long j) {
        return new C2183c(inputStream, j);
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f7422g - ((long) this.f7423h), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m10244c(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        m10244c(read);
        return read;
    }
}
