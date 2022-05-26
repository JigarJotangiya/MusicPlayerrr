package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.g */
/* compiled from: ExifOrientationStream */
public final class C1759g extends FilterInputStream {

    /* renamed from: i */
    private static final byte[] f6531i;

    /* renamed from: j */
    private static final int f6532j;

    /* renamed from: k */
    private static final int f6533k;

    /* renamed from: g */
    private final byte f6534g;

    /* renamed from: h */
    private int f6535h;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f6531i = bArr;
        int length = bArr.length;
        f6532j = length;
        f6533k = length + 2;
    }

    public C1759g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f6534g = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f6535h;
        if (i3 < 2 || i3 > (i2 = f6533k)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f6534g;
        } else {
            i = f6531i[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f6535h++;
        }
        return i;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f6535h = (int) (((long) this.f6535h) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f6535h;
        int i5 = f6533k;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f6534g;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f6531i, this.f6535h - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f6535h += i3;
        }
        return i3;
    }
}
