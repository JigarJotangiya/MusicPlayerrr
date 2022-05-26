package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: l.b.a.f.d.t */
/* compiled from: RandomAccessFileOutputStream */
public final class C9007t extends OutputStream {

    /* renamed from: g */
    private final RandomAccessFile f35466g;

    public C9007t(RandomAccessFile randomAccessFile) {
        this.f35466g = randomAccessFile;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f35466g.write(bArr, i, i2);
    }

    public void write(int i) throws IOException {
        this.f35466g.write(i);
    }
}
