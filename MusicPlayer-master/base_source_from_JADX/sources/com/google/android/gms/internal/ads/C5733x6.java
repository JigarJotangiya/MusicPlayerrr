package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.x6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5733x6 extends ByteArrayOutputStream {

    /* renamed from: g */
    private final C5252k6 f25690g;

    public C5733x6(C5252k6 k6Var, int i) {
        this.f25690g = k6Var;
        this.buf = k6Var.mo18853b(Math.max(i, 256));
    }

    /* renamed from: c */
    private final void m33578c(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            int i3 = i2 + i;
            byte[] b = this.f25690g.mo18853b(i3 + i3);
            System.arraycopy(this.buf, 0, b, 0, this.count);
            this.f25690g.mo18852a(this.buf);
            this.buf = b;
        }
    }

    public final void close() throws IOException {
        this.f25690g.mo18852a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f25690g.mo18852a(this.buf);
    }

    public final synchronized void write(int i) {
        m33578c(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m33578c(i2);
        super.write(bArr, i, i2);
    }
}
