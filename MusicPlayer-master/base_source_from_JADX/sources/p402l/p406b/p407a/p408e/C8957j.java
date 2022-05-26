package p402l.p406b.p407a.p408e;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.e.j */
/* compiled from: CommentsChunk */
public class C8957j extends C8955h {

    /* renamed from: c */
    private C8946a f35356c;

    public C8957j(C8956i iVar, RandomAccessFile randomAccessFile, C8946a aVar) {
        super(randomAccessFile, iVar);
        this.f35356c = aVar;
    }

    /* renamed from: a */
    public boolean mo31293a() throws IOException {
        int y = C9057i.m48322y(this.f35353b);
        for (int i = 0; i < y; i++) {
            Date g = C8951d.m47913g(C9057i.m48323z(this.f35353b));
            C9057i.m48317t(this.f35353b);
            int y2 = C9057i.m48322y(this.f35353b);
            this.f35352a -= 8;
            byte[] bArr = new byte[y2];
            this.f35353b.read(bArr);
            this.f35352a -= (long) y2;
            this.f35356c.mo31282s(new String(bArr) + " " + C8951d.m47908b(g));
        }
        return true;
    }
}
