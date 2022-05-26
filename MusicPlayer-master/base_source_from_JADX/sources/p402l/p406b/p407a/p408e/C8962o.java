package p402l.p406b.p407a.p408e;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p426c.C9131k;
import p402l.p406b.p426c.p427p.C9136a;
import p402l.p406b.p426c.p431t.C9179c0;
import p402l.p406b.p426c.p431t.C9180d;
import p402l.p406b.p426c.p431t.C9193h0;
import p402l.p406b.p426c.p431t.C9251x;

/* renamed from: l.b.a.e.o */
/* compiled from: ID3Chunk */
public class C8962o extends C8955h {

    /* renamed from: c */
    private C9136a f35361c;

    public C8962o(C8956i iVar, RandomAccessFile randomAccessFile, C9136a aVar) {
        super(randomAccessFile, iVar);
        this.f35361c = aVar;
    }

    /* renamed from: b */
    private boolean m47926b() throws IOException {
        byte[] bArr = new byte[3];
        this.f35353b.read(bArr);
        return "ID3".equals(new String(bArr, "ASCII"));
    }

    /* renamed from: a */
    public boolean mo31293a() throws IOException {
        C9180d dVar;
        if (!m47926b()) {
            return false;
        }
        int read = this.f35353b.read();
        if (read == 2) {
            dVar = new C9251x();
            C8942a.f35327d.finest("Reading ID3V2.2 tag");
        } else if (read == 3) {
            dVar = new C9179c0();
            C8942a.f35327d.finest("Reading ID3V2.3 tag");
        } else if (read != 4) {
            return false;
        } else {
            dVar = new C9193h0();
            C8942a.f35327d.finest("Reading ID3V2.4 tag");
        }
        this.f35361c.mo31758g(dVar);
        RandomAccessFile randomAccessFile = this.f35353b;
        randomAccessFile.seek(randomAccessFile.getFilePointer() - 4);
        byte[] bArr = new byte[((int) this.f35352a)];
        this.f35353b.read(bArr);
        ByteBuffer allocate = ByteBuffer.allocate((int) this.f35352a);
        allocate.put(bArr);
        try {
            dVar.mo31887i(allocate);
            return true;
        } catch (C9131k e) {
            Logger logger = C8942a.f35327d;
            logger.info("Exception reading ID3 tag: " + e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
    }
}
