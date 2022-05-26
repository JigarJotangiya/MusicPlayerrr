package p402l.p406b.p407a.p408e;

import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: l.b.a.e.i */
/* compiled from: ChunkHeader */
public class C8956i {

    /* renamed from: a */
    private long f35354a;

    /* renamed from: b */
    private String f35355b;

    /* renamed from: a */
    public String mo31294a() {
        return this.f35355b;
    }

    /* renamed from: b */
    public long mo31295b() {
        return this.f35354a;
    }

    /* renamed from: c */
    public boolean mo31296c(RandomAccessFile randomAccessFile) throws IOException {
        StringBuffer stringBuffer = new StringBuffer(4);
        for (int i = 0; i < 4; i++) {
            int read = randomAccessFile.read();
            if (read < 32) {
                String hexString = Integer.toHexString(read);
                if (hexString.length() < 2) {
                    "0" + hexString;
                }
                return false;
            }
            stringBuffer.append((char) read);
        }
        this.f35355b = stringBuffer.toString();
        this.f35354a = C8951d.m47912f(randomAccessFile);
        return true;
    }
}
