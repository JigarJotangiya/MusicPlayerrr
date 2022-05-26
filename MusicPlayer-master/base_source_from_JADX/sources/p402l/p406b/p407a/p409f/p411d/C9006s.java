package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: l.b.a.f.d.s */
/* compiled from: RandomAccessFileInputstream */
public final class C9006s extends InputStream {

    /* renamed from: g */
    private final RandomAccessFile f35465g;

    public C9006s(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            this.f35465g = randomAccessFile;
            return;
        }
        throw new IllegalArgumentException("null");
    }

    public int read() throws IOException {
        return this.f35465g.read();
    }

    public long skip(long j) throws IOException {
        if (j >= 0) {
            while (j > 2147483647L) {
                this.f35465g.skipBytes(Integer.MAX_VALUE);
                j -= 2147483647L;
            }
            return (long) this.f35465g.skipBytes((int) j);
        }
        throw new IllegalArgumentException("invalid negative value");
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f35465g.read(bArr, i, i2);
    }
}
