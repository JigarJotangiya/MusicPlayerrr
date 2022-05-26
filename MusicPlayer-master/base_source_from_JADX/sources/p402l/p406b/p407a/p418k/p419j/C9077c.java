package p402l.p406b.p407a.p418k.p419j;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9019e;
import p402l.p406b.p407a.p413g.C9021g;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p425b.C9118b;

/* renamed from: l.b.a.k.j.c */
/* compiled from: Mp4BoxHeader */
public class C9077c {

    /* renamed from: e */
    public static Logger f35641e = Logger.getLogger("org.jaudiotagger.audio.mp4.atom");

    /* renamed from: a */
    private String f35642a;

    /* renamed from: b */
    protected int f35643b;

    /* renamed from: c */
    private long f35644c;

    /* renamed from: d */
    protected ByteBuffer f35645d;

    public C9077c() {
    }

    /* renamed from: g */
    public static C9077c m48448g(RandomAccessFile randomAccessFile, String str) throws IOException {
        Logger logger = f35641e;
        logger.finer("Started searching for:" + str + " in file at:" + randomAccessFile.getChannel().position());
        C9077c cVar = new C9077c();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (randomAccessFile.getChannel().read(allocate) != 8) {
            return null;
        }
        allocate.rewind();
        cVar.mo31647k(allocate);
        while (!cVar.mo31643e().equals(str)) {
            Logger logger2 = f35641e;
            logger2.finer("Found:" + cVar.mo31643e() + " Still searching for:" + str + " in file at:" + randomAccessFile.getChannel().position());
            if (cVar.mo31644f() < 8) {
                return null;
            }
            int skipBytes = randomAccessFile.skipBytes(cVar.mo31639a());
            Logger logger3 = f35641e;
            logger3.finer("Skipped:" + skipBytes);
            if (skipBytes < cVar.mo31639a()) {
                return null;
            }
            allocate.rewind();
            int read = randomAccessFile.getChannel().read(allocate);
            Logger logger4 = f35641e;
            logger4.finer("Header Bytes Read:" + read);
            allocate.rewind();
            if (read != 8) {
                return null;
            }
            cVar.mo31647k(allocate);
        }
        return cVar;
    }

    /* renamed from: h */
    public static C9077c m48449h(ByteBuffer byteBuffer, String str) throws IOException {
        Logger logger = f35641e;
        logger.finer("Started searching for:" + str + " in bytebuffer at" + byteBuffer.position());
        C9077c cVar = new C9077c();
        if (byteBuffer.remaining() < 8) {
            return null;
        }
        cVar.mo31647k(byteBuffer);
        while (!cVar.mo31643e().equals(str)) {
            Logger logger2 = f35641e;
            logger2.finer("Found:" + cVar.mo31643e() + " Still searching for:" + str + " in bytebuffer at" + byteBuffer.position());
            if (cVar.mo31644f() < 8 || byteBuffer.remaining() < cVar.mo31644f() - 8) {
                return null;
            }
            byteBuffer.position(byteBuffer.position() + (cVar.mo31644f() - 8));
            if (byteBuffer.remaining() < 8) {
                return null;
            }
            cVar.mo31647k(byteBuffer);
        }
        Logger logger3 = f35641e;
        logger3.finer("Found:" + str + " in bytebuffer at" + byteBuffer.position());
        return cVar;
    }

    /* renamed from: a */
    public int mo31639a() {
        return this.f35643b - 8;
    }

    /* renamed from: b */
    public String mo31640b() {
        return "UTF-8";
    }

    /* renamed from: c */
    public long mo31641c() {
        return this.f35644c;
    }

    /* renamed from: d */
    public ByteBuffer mo31642d() {
        this.f35645d.rewind();
        return this.f35645d;
    }

    /* renamed from: e */
    public String mo31643e() {
        return this.f35642a;
    }

    /* renamed from: f */
    public int mo31644f() {
        return this.f35643b;
    }

    /* renamed from: i */
    public void mo31645i(long j) {
        this.f35644c = j;
    }

    /* renamed from: j */
    public void mo31646j(int i) {
        byte[] n = C9057i.m48311n(i);
        this.f35645d.put(0, n[0]);
        this.f35645d.put(1, n[1]);
        this.f35645d.put(2, n[2]);
        this.f35645d.put(3, n[3]);
        this.f35643b = i;
    }

    /* renamed from: k */
    public void mo31647k(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[8];
        byteBuffer.get(bArr);
        this.f35645d = ByteBuffer.wrap(bArr);
        this.f35643b = C9057i.m48303f(bArr, 0, 3);
        this.f35642a = C9057i.m48314q(bArr, 4, 4, "ISO-8859-1");
        Logger logger = f35641e;
        logger.finest("Mp4BoxHeader id:" + this.f35642a + ":length:" + this.f35643b);
        if (this.f35642a.equals("\u0000\u0000\u0000\u0000")) {
            throw new C9021g(C9118b.MP4_UNABLE_TO_FIND_NEXT_ATOM_BECAUSE_IDENTIFIER_IS_INVALID.getMsg(this.f35642a));
        } else if (this.f35643b < 8) {
            throw new C9019e(C9118b.MP4_UNABLE_TO_FIND_NEXT_ATOM_BECAUSE_IDENTIFIER_IS_INVALID.getMsg(this.f35642a, Integer.valueOf(this.f35643b)));
        }
    }

    public String toString() {
        return "Box " + this.f35642a + ":length" + this.f35643b + ":filepos:" + this.f35644c;
    }

    public C9077c(String str) {
        if (str.length() == 4) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            this.f35645d = allocate;
            try {
                this.f35642a = str;
                allocate.put(4, str.getBytes("ISO-8859-1")[0]);
                this.f35645d.put(5, str.getBytes("ISO-8859-1")[1]);
                this.f35645d.put(6, str.getBytes("ISO-8859-1")[2]);
                this.f35645d.put(7, str.getBytes("ISO-8859-1")[3]);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("Invalid length:atom idenifier should always be 4 characters long");
        }
    }

    public C9077c(ByteBuffer byteBuffer) {
        mo31647k(byteBuffer);
    }
}
