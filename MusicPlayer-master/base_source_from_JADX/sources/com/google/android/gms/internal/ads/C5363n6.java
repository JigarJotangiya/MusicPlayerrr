package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.n6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5363n6 extends FilterInputStream {

    /* renamed from: g */
    private final long f20516g;

    /* renamed from: h */
    private long f20517h;

    C5363n6(InputStream inputStream, long j) {
        super(inputStream);
        this.f20516g = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo19613c() {
        return this.f20516g - this.f20517h;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f20517h++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f20517h += (long) read;
        }
        return read;
    }
}
