package p402l.p406b.p407a.p414h.p415i;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p425b.C9118b;

/* renamed from: l.b.a.h.i.j */
/* compiled from: MetadataBlockHeader */
public class C9046j {

    /* renamed from: a */
    private boolean f35521a;

    /* renamed from: b */
    private int f35522b;

    /* renamed from: c */
    private byte[] f35523c;

    /* renamed from: d */
    private C9037a f35524d;

    public C9046j(ByteBuffer byteBuffer) throws C9015a {
        this.f35521a = ((byteBuffer.get(0) & 128) >>> 7) == 1;
        byte b = byteBuffer.get(0) & Byte.MAX_VALUE;
        if (b < C9037a.values().length) {
            this.f35524d = C9037a.values()[b];
            this.f35522b = (m48237g(byteBuffer.get(1)) << 16) + (m48237g(byteBuffer.get(2)) << 8) + m48237g(byteBuffer.get(3));
            this.f35523c = new byte[4];
            for (int i = 0; i < 4; i++) {
                this.f35523c[i] = byteBuffer.get(i);
            }
            return;
        }
        throw new C9015a(C9118b.FLAC_NO_BLOCKTYPE.getMsg(Integer.valueOf(b)));
    }

    /* renamed from: f */
    public static C9046j m48236f(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        int read = randomAccessFile.getChannel().read(allocate);
        if (read >= 4) {
            allocate.rewind();
            return new C9046j(allocate);
        }
        throw new IOException("Unable to read required number of databytes read:" + read + ":required:" + 4);
    }

    /* renamed from: g */
    private int m48237g(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public C9037a mo31512a() {
        return this.f35524d;
    }

    /* renamed from: b */
    public byte[] mo31513b() {
        return this.f35523c;
    }

    /* renamed from: c */
    public byte[] mo31514c() {
        byte[] bArr = this.f35523c;
        bArr[0] = (byte) (bArr[0] & Byte.MAX_VALUE);
        return bArr;
    }

    /* renamed from: d */
    public int mo31515d() {
        return this.f35522b;
    }

    /* renamed from: e */
    public boolean mo31516e() {
        return this.f35521a;
    }

    public String toString() {
        return "BlockType:" + this.f35524d + " DataLength:" + this.f35522b + " isLastBlock:" + this.f35521a;
    }

    public C9046j(boolean z, C9037a aVar, int i) {
        int i2;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        this.f35524d = aVar;
        this.f35521a = z;
        this.f35522b = i;
        if (z) {
            i2 = aVar.getId() | 128;
        } else {
            i2 = aVar.getId();
        }
        allocate.put((byte) i2);
        allocate.put((byte) ((16711680 & i) >>> 16));
        allocate.put((byte) ((65280 & i) >>> 8));
        allocate.put((byte) (i & 255));
        this.f35523c = new byte[4];
        for (int i3 = 0; i3 < 4; i3++) {
            this.f35523c[i3] = allocate.get(i3);
        }
    }
}
