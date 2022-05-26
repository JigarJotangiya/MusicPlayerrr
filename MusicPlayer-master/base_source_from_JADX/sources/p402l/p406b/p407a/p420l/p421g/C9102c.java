package p402l.p406b.p407a.p420l.p421g;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.p431t.C9180d;

/* renamed from: l.b.a.l.g.c */
/* compiled from: OggPageHeader */
public class C9102c {

    /* renamed from: l */
    public static Logger f35688l = Logger.getLogger("org.jaudiotagger.audio.ogg.atom");

    /* renamed from: m */
    public static final byte[] f35689m = {79, 103, 103, 83};

    /* renamed from: a */
    private byte[] f35690a;

    /* renamed from: b */
    private double f35691b;

    /* renamed from: c */
    private byte f35692c;

    /* renamed from: d */
    private boolean f35693d = false;

    /* renamed from: e */
    private int f35694e = 0;

    /* renamed from: f */
    private int f35695f;

    /* renamed from: g */
    private int f35696g;

    /* renamed from: h */
    private byte[] f35697h;

    /* renamed from: i */
    private List<C9104b> f35698i = new ArrayList();

    /* renamed from: j */
    private boolean f35699j = false;

    /* renamed from: k */
    private long f35700k = 0;

    /* renamed from: l.b.a.l.g.c$a */
    /* compiled from: OggPageHeader */
    public enum C9103a {
        FRESH_PACKET((byte) 0),
        CONTINUED_PACKET((byte) 1),
        START_OF_BITSTREAM((byte) 2),
        END_OF_BITSTREAM((byte) 4);
        
        byte fileValue;

        private C9103a(byte b) {
            this.fileValue = b;
        }

        public byte getFileValue() {
            return this.fileValue;
        }
    }

    /* renamed from: l.b.a.l.g.c$b */
    /* compiled from: OggPageHeader */
    public static class C9104b {

        /* renamed from: a */
        private Integer f35702a = 0;

        /* renamed from: b */
        private Integer f35703b = 0;

        public C9104b(int i, int i2) {
            this.f35702a = Integer.valueOf(i);
            this.f35703b = Integer.valueOf(i2);
        }

        /* renamed from: a */
        public int mo31700a() {
            return this.f35703b.intValue();
        }

        public String toString() {
            return "NextPkt(start:" + this.f35702a + ":length:" + this.f35703b + "),";
        }
    }

    public C9102c(byte[] bArr) {
        this.f35690a = bArr;
        byte b = bArr[4];
        this.f35692c = bArr[5];
        if (b == 0) {
            this.f35691b = 0.0d;
            for (int i = 0; i < 8; i++) {
                this.f35691b += ((double) m48512m(bArr[i + 6])) * Math.pow(2.0d, (double) (i * 8));
            }
            this.f35696g = C9057i.m48305h(bArr, 14, 17);
            this.f35695f = C9057i.m48305h(bArr, 18, 21);
            C9057i.m48305h(bArr, 22, 25);
            m48512m(bArr[26]);
            this.f35697h = new byte[(bArr.length - 27)];
            Integer num = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr2 = this.f35697h;
                if (i2 >= bArr2.length) {
                    break;
                }
                bArr2[i2] = bArr[i2 + 27];
                num = Integer.valueOf(m48512m(bArr2[i2]));
                this.f35694e += num.intValue();
                i3 += num.intValue();
                if (num.intValue() < 255) {
                    this.f35698i.add(new C9104b(this.f35694e - i3, i3));
                    i3 = 0;
                }
                i2++;
            }
            if (num != null && num.intValue() == 255) {
                this.f35698i.add(new C9104b(this.f35694e - i3, i3));
                this.f35699j = true;
            }
            this.f35693d = true;
        }
        if (f35688l.isLoggable(Level.CONFIG)) {
            f35688l.config("Constructed OggPage:" + toString());
        }
    }

    /* renamed from: j */
    public static C9102c m48510j(RandomAccessFile randomAccessFile) throws IOException, C9015a {
        long filePointer = randomAccessFile.getFilePointer();
        Logger logger = f35688l;
        logger.fine("Trying to read OggPage at:" + filePointer);
        byte[] bArr = f35689m;
        byte[] bArr2 = new byte[bArr.length];
        randomAccessFile.read(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            randomAccessFile.seek(filePointer);
            if (C9180d.m48789H(randomAccessFile)) {
                f35688l.warning(C9118b.OGG_CONTAINS_ID3TAG.getMsg(Long.valueOf(randomAccessFile.getFilePointer() - filePointer)));
                randomAccessFile.read(bArr2);
                if (Arrays.equals(bArr2, bArr)) {
                    filePointer = randomAccessFile.getFilePointer() - ((long) bArr.length);
                }
            } else {
                throw new C9015a(C9118b.OGG_HEADER_CANNOT_BE_FOUND.getMsg(new String(bArr2)));
            }
        }
        randomAccessFile.seek(26 + filePointer);
        randomAccessFile.seek(filePointer);
        byte[] bArr3 = new byte[((randomAccessFile.readByte() & 255) + 27)];
        randomAccessFile.read(bArr3);
        C9102c cVar = new C9102c(bArr3);
        cVar.mo31697l(filePointer);
        return cVar;
    }

    /* renamed from: k */
    public static C9102c m48511k(ByteBuffer byteBuffer) throws IOException, C9015a {
        int position = byteBuffer.position();
        Logger logger = f35688l;
        logger.fine("Trying to read OggPage at:" + position);
        byte[] bArr = f35689m;
        byte[] bArr2 = new byte[bArr.length];
        byteBuffer.get(bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            byteBuffer.position(position + 26);
            byteBuffer.position(position);
            byte[] bArr3 = new byte[((byteBuffer.get() & 255) + 27)];
            byteBuffer.get(bArr3);
            return new C9102c(bArr3);
        }
        throw new C9015a(C9118b.OGG_HEADER_CANNOT_BE_FOUND.getMsg(new String(bArr2)));
    }

    /* renamed from: m */
    private int m48512m(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public double mo31688a() {
        Logger logger = f35688l;
        logger.fine("Number Of Samples: " + this.f35691b);
        return this.f35691b;
    }

    /* renamed from: b */
    public List<C9104b> mo31689b() {
        return this.f35698i;
    }

    /* renamed from: c */
    public int mo31690c() {
        Logger logger = f35688l;
        logger.fine("This page length: " + this.f35694e);
        return this.f35694e;
    }

    /* renamed from: d */
    public int mo31691d() {
        return this.f35695f;
    }

    /* renamed from: e */
    public byte[] mo31692e() {
        return this.f35690a;
    }

    /* renamed from: f */
    public byte[] mo31693f() {
        return this.f35697h;
    }

    /* renamed from: g */
    public int mo31694g() {
        return this.f35696g;
    }

    /* renamed from: h */
    public long mo31695h() {
        return this.f35700k;
    }

    /* renamed from: i */
    public boolean mo31696i() {
        return this.f35699j;
    }

    /* renamed from: l */
    public void mo31697l(long j) {
        this.f35700k = j;
    }

    public String toString() {
        String str = "Ogg Page Header:isValid:" + this.f35693d + ":type:" + this.f35692c + ":oggPageHeaderLength:" + this.f35690a.length + ":length:" + this.f35694e + ":seqNo:" + mo31691d() + ":packetIncomplete:" + mo31696i() + ":serNum:" + mo31694g();
        for (C9104b bVar : mo31689b()) {
            str = str + bVar.toString();
        }
        return str;
    }
}
