package p402l.p406b.p407a.p414h.p415i;

import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: l.b.a.h.i.h */
/* compiled from: MetadataBlockDataSeekTable */
public class C9044h implements C9039c {

    /* renamed from: g */
    private byte[] f35506g;

    public C9044h(C9046j jVar, RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = new byte[jVar.mo31515d()];
        this.f35506g = bArr;
        randomAccessFile.readFully(bArr);
    }

    /* renamed from: a */
    public byte[] mo31496a() {
        return this.f35506g;
    }
}
