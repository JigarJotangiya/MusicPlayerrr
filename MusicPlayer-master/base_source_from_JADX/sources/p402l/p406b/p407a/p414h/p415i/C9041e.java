package p402l.p406b.p407a.p414h.p415i;

import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: l.b.a.h.i.e */
/* compiled from: MetadataBlockDataCueSheet */
public class C9041e implements C9039c {

    /* renamed from: g */
    private byte[] f35495g;

    public C9041e(C9046j jVar, RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = new byte[jVar.mo31515d()];
        this.f35495g = bArr;
        randomAccessFile.readFully(bArr);
    }

    /* renamed from: a */
    public byte[] mo31496a() {
        return this.f35495g;
    }
}
