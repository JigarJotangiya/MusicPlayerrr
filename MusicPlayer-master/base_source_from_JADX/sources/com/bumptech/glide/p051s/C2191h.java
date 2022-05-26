package com.bumptech.glide.p051s;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.s.h */
/* compiled from: MarkEnforcingInputStream */
public class C2191h extends FilterInputStream {

    /* renamed from: g */
    private int f7435g = Integer.MIN_VALUE;

    public C2191h(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: c */
    private long m10263c(long j) {
        int i = this.f7435g;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    /* renamed from: d */
    private void m10264d(long j) {
        int i = this.f7435g;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f7435g = (int) (((long) i) - j);
        }
    }

    public int available() throws IOException {
        int i = this.f7435g;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f7435g = i;
    }

    public int read() throws IOException {
        if (m10263c(1) == -1) {
            return -1;
        }
        int read = super.read();
        m10264d(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f7435g = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long c = m10263c(j);
        if (c == -1) {
            return 0;
        }
        long skip = super.skip(c);
        m10264d(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int c = (int) m10263c((long) i2);
        if (c == -1) {
            return -1;
        }
        int read = super.read(bArr, i, c);
        m10264d((long) read);
        return read;
    }
}
