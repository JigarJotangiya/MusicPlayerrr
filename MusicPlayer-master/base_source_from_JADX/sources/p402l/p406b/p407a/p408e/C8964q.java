package p402l.p406b.p407a.p408e;

import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: l.b.a.e.q */
/* compiled from: TextChunk */
public abstract class C8964q extends C8955h {

    /* renamed from: c */
    protected String f35363c;

    public C8964q(C8956i iVar, RandomAccessFile randomAccessFile) {
        super(randomAccessFile, iVar);
    }

    /* renamed from: a */
    public boolean mo31293a() throws IOException {
        byte[] bArr = new byte[((int) this.f35352a)];
        this.f35353b.read(bArr);
        this.f35363c = new String(bArr, "ISO-8859-1");
        return true;
    }
}
