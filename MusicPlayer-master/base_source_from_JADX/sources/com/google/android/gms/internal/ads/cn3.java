package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cn3 extends InputStream {

    /* renamed from: g */
    private Iterator<ByteBuffer> f15050g;

    /* renamed from: h */
    private ByteBuffer f15051h;

    /* renamed from: i */
    private int f15052i = 0;

    /* renamed from: j */
    private int f15053j;

    /* renamed from: k */
    private int f15054k;

    /* renamed from: l */
    private boolean f15055l;

    /* renamed from: m */
    private byte[] f15056m;

    /* renamed from: n */
    private int f15057n;

    /* renamed from: o */
    private long f15058o;

    cn3(Iterable<ByteBuffer> iterable) {
        this.f15050g = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f15052i++;
        }
        this.f15053j = -1;
        if (!m21999d()) {
            this.f15051h = zm3.f26837c;
            this.f15053j = 0;
            this.f15054k = 0;
            this.f15058o = 0;
        }
    }

    /* renamed from: c */
    private final void m21998c(int i) {
        int i2 = this.f15054k + i;
        this.f15054k = i2;
        if (i2 == this.f15051h.limit()) {
            m21999d();
        }
    }

    /* renamed from: d */
    private final boolean m21999d() {
        this.f15053j++;
        if (!this.f15050g.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f15050g.next();
        this.f15051h = next;
        this.f15054k = next.position();
        if (this.f15051h.hasArray()) {
            this.f15055l = true;
            this.f15056m = this.f15051h.array();
            this.f15057n = this.f15051h.arrayOffset();
        } else {
            this.f15055l = false;
            this.f15058o = vp3.m32645m(this.f15051h);
            this.f15056m = null;
        }
        return true;
    }

    public final int read() throws IOException {
        byte i;
        if (this.f15053j == this.f15052i) {
            return -1;
        }
        if (this.f15055l) {
            i = this.f15056m[this.f15054k + this.f15057n];
            m21998c(1);
        } else {
            i = vp3.m32641i(((long) this.f15054k) + this.f15058o);
            m21998c(1);
        }
        return i & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f15053j == this.f15052i) {
            return -1;
        }
        int limit = this.f15051h.limit();
        int i3 = this.f15054k;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f15055l) {
            System.arraycopy(this.f15056m, i3 + this.f15057n, bArr, i, i2);
            m21998c(i2);
        } else {
            int position = this.f15051h.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f15051h.position(this.f15054k);
            this.f15051h.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f15051h.position(position);
            m21998c(i2);
        }
        return i2;
    }
}
