package p402l.p406b.p407a.p409f.p411d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: l.b.a.f.d.o */
/* compiled from: FullRequestInputStream */
public class C9002o extends FilterInputStream {
    public C9002o(InputStream inputStream) {
        super(inputStream);
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public long skip(long j) throws IOException {
        int i = 0;
        long j2 = 0;
        while (j2 < j) {
            long skip = super.skip(j - j2);
            if (skip == 0 && (i = i + 1) == 2) {
                break;
            }
            j2 += skip;
        }
        return j2;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = super.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            }
            if (read == -1) {
                throw new IOException((i2 - i3) + " more bytes expected.");
            }
        }
        return i3;
    }
}
