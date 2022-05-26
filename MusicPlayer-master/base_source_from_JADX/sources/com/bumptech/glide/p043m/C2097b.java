package com.bumptech.glide.p043m;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.m.b */
/* compiled from: StrictLineReader */
class C2097b implements Closeable {

    /* renamed from: g */
    private final InputStream f7196g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Charset f7197h;

    /* renamed from: i */
    private byte[] f7198i;

    /* renamed from: j */
    private int f7199j;

    /* renamed from: k */
    private int f7200k;

    /* renamed from: com.bumptech.glide.m.b$a */
    /* compiled from: StrictLineReader */
    class C2098a extends ByteArrayOutputStream {
        C2098a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C2097b.this.f7197h.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C2097b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: d */
    private void m9820d() throws IOException {
        InputStream inputStream = this.f7196g;
        byte[] bArr = this.f7198i;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f7199j = 0;
            this.f7200k = read;
            return;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        synchronized (this.f7196g) {
            if (this.f7198i != null) {
                this.f7198i = null;
                this.f7196g.close();
            }
        }
    }

    /* renamed from: p */
    public boolean mo8254p() {
        return this.f7200k == -1;
    }

    /* renamed from: x */
    public String mo8255x() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f7196g) {
            if (this.f7198i != null) {
                if (this.f7199j >= this.f7200k) {
                    m9820d();
                }
                for (int i3 = this.f7199j; i3 != this.f7200k; i3++) {
                    byte[] bArr2 = this.f7198i;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.f7199j) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.f7198i;
                                int i4 = this.f7199j;
                                String str = new String(bArr3, i4, i2 - i4, this.f7197h.name());
                                this.f7199j = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.f7198i;
                        int i42 = this.f7199j;
                        String str2 = new String(bArr32, i42, i2 - i42, this.f7197h.name());
                        this.f7199j = i3 + 1;
                        return str2;
                    }
                }
                C2098a aVar = new C2098a((this.f7200k - this.f7199j) + 80);
                loop1:
                while (true) {
                    byte[] bArr4 = this.f7198i;
                    int i5 = this.f7199j;
                    aVar.write(bArr4, i5, this.f7200k - i5);
                    this.f7200k = -1;
                    m9820d();
                    i = this.f7199j;
                    while (true) {
                        if (i != this.f7200k) {
                            bArr = this.f7198i;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f7199j;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f7199j = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C2097b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C2099c.f7202a)) {
            this.f7196g = inputStream;
            this.f7197h = charset;
            this.f7198i = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
