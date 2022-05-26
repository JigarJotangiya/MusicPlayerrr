package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* renamed from: com.google.android.play.core.assetpacks.l2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6382l2 extends InputStream {

    /* renamed from: g */
    private final Enumeration<File> f29564g;

    /* renamed from: h */
    private InputStream f29565h;

    public C6382l2(Enumeration<File> enumeration) throws IOException {
        this.f29564g = enumeration;
        mo25309c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo25309c() throws IOException {
        InputStream inputStream = this.f29565h;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f29565h = this.f29564g.hasMoreElements() ? new FileInputStream(this.f29564g.nextElement()) : null;
    }

    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f29565h;
        if (inputStream != null) {
            inputStream.close();
            this.f29565h = null;
        }
    }

    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f29565h;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            mo25309c();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f29565h == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f29565h.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo25309c();
            } while (this.f29565h != null);
            return -1;
        }
    }
}
