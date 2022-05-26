package p402l.p406b.p407a.p408e;

import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.e.f */
/* compiled from: ApplicationChunk */
public class C8953f extends C8955h {

    /* renamed from: c */
    private C8946a f35350c;

    public C8953f(C8956i iVar, RandomAccessFile randomAccessFile, C8946a aVar) {
        super(randomAccessFile, iVar);
        this.f35350c = aVar;
    }

    /* renamed from: a */
    public boolean mo31293a() throws IOException {
        String str;
        String u = C9057i.m48318u(this.f35353b, 4);
        byte[] bArr = new byte[((int) (this.f35352a - 4))];
        this.f35353b.readFully(bArr);
        if ("stoc".equals(u) || "pdos".equals(u)) {
            str = C8951d.m47907a(bArr);
        } else {
            str = null;
        }
        C8946a aVar = this.f35350c;
        aVar.mo31281r(u + ": " + str);
        return true;
    }
}
