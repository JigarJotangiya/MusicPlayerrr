package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.i0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6365i0 extends InputStream {

    /* renamed from: g */
    private final InputStream f29488g;

    /* renamed from: h */
    private long f29489h;

    C6365i0(InputStream inputStream, long j) {
        this.f29488g = inputStream;
        this.f29489h = j;
    }

    public final void close() throws IOException {
        super.close();
        this.f29488g.close();
        this.f29489h = 0;
    }

    public final int read() throws IOException {
        long j = this.f29489h;
        if (j <= 0) {
            return -1;
        }
        this.f29489h = j - 1;
        return this.f29488g.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f29489h;
        if (j <= 0) {
            return -1;
        }
        int read = this.f29488g.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f29489h -= (long) read;
        }
        return read;
    }
}
