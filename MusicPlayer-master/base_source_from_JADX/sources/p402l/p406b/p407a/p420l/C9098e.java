package p402l.p406b.p407a.p420l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p407a.p420l.C9096d;
import p402l.p406b.p407a.p420l.p421g.C9100a;
import p402l.p406b.p407a.p420l.p421g.C9102c;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.p440y.C9298d;

/* renamed from: l.b.a.l.e */
/* compiled from: OggVorbisTagWriter */
public class C9098e {

    /* renamed from: c */
    public static Logger f35681c = Logger.getLogger("org.jaudiotagger.audio.ogg");

    /* renamed from: a */
    private C9095c f35682a = new C9095c();

    /* renamed from: b */
    private C9096d f35683b = new C9096d();

    /* renamed from: a */
    private void m48493a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(22, 0);
        byte[] a = C9100a.m48505a(byteBuffer.array());
        for (int i = 0; i < a.length; i++) {
            byteBuffer.put(i + 22, a[i]);
        }
        byteBuffer.rewind();
    }

    /* renamed from: b */
    private byte[] m48494b(int i, int i2, List<C9102c.C9104b> list) {
        byte[] bArr;
        Logger logger = f35681c;
        logger.finest("Create SegmentTable CommentLength:" + i + ":SetupHeaderLength:" + i2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i2 == 0) {
            return m48496d(i, false);
        }
        byte[] d = m48496d(i, true);
        if (list.size() > 0) {
            bArr = m48496d(i2, true);
        } else {
            bArr = m48496d(i2, false);
        }
        Logger logger2 = f35681c;
        logger2.finest("Created " + d.length + " segments for header");
        Logger logger3 = f35681c;
        logger3.finest("Created " + bArr.length + " segments for setup");
        try {
            byteArrayOutputStream.write(d);
            byteArrayOutputStream.write(bArr);
            if (list.size() > 0) {
                Logger logger4 = f35681c;
                logger4.finer("Creating segments for " + list.size() + " packets");
                for (C9102c.C9104b a : list) {
                    byteArrayOutputStream.write(m48496d(a.mo31700a(), false));
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Unable to create segment table:" + e.getMessage());
        }
    }

    /* renamed from: c */
    private byte[] m48495c(int i, List<C9102c.C9104b> list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(m48496d(i, true));
            if (list.size() > 0) {
                for (C9102c.C9104b a : list) {
                    byteArrayOutputStream.write(m48496d(a.mo31700a(), false));
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Unable to create segment table:" + e.getMessage());
        }
    }

    /* renamed from: d */
    private byte[] m48496d(int i, boolean z) {
        f35681c.finest("Create Segments for length:" + i + ":QuitStream:" + z);
        int i2 = 0;
        if (i == 0) {
            return new byte[]{0};
        }
        int i3 = (i / 255) + ((i % 255 != 0 || z) ? 1 : 0);
        byte[] bArr = new byte[i3];
        while (true) {
            int i4 = i3 - 1;
            if (i2 < i4) {
                bArr[i2] = -1;
                i2++;
            } else {
                bArr[i4] = (byte) (i - (i2 * 255));
                return bArr;
            }
        }
    }

    /* renamed from: f */
    private boolean m48497f(int i, int i2, List<C9102c.C9104b> list) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 1;
        } else {
            i3 = (i / 255) + 1;
            if (i % 255 == 0) {
                i3++;
            }
        }
        Logger logger = f35681c;
        logger.finest("Require:" + i3 + " segments for comment");
        if (i2 == 0) {
            i4 = i3 + 1;
        } else {
            i4 = i3 + (i2 / 255) + 1;
            if (i2 % 255 == 0) {
                i4++;
            }
        }
        Logger logger2 = f35681c;
        logger2.finest("Require:" + i4 + " segments for comment plus setup");
        for (C9102c.C9104b next : list) {
            if (next.mo31700a() != 0) {
                i4 += (next.mo31700a() / 255) + 1;
                if (next.mo31700a() % 255 != 0) {
                }
            }
            i4++;
        }
        Logger logger3 = f35681c;
        logger3.finest("Total No Of Segment If New Comment And Header Put On One Page:" + i4);
        if (i4 <= 255) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m48498g(C9096d.C9097a aVar, int i, C9102c cVar, ByteBuffer byteBuffer, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException, C9015a, C9017c {
        int i2;
        int i3;
        ByteBuffer byteBuffer2 = byteBuffer;
        RandomAccessFile randomAccessFile3 = randomAccessFile;
        int d = cVar.mo31691d();
        int i4 = i / 65025;
        f35681c.config("Comment requires:" + i4 + " complete pages");
        int i5 = 26;
        if (i4 > 0) {
            int i6 = 0;
            i2 = 0;
            while (i6 < i4) {
                byte[] d2 = m48496d(65025, false);
                ByteBuffer allocate = ByteBuffer.allocate(d2.length + 27 + 65025);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.put(cVar.mo31692e(), 0, i5);
                allocate.put((byte) d2.length);
                for (byte put : d2) {
                    allocate.put(put);
                }
                ByteBuffer slice = byteBuffer.slice();
                slice.limit(65025);
                allocate.put(slice);
                allocate.putInt(18, d);
                d++;
                if (i6 != 0) {
                    allocate.put(5, C9102c.C9103a.CONTINUED_PACKET.getFileValue());
                }
                m48493a(allocate);
                randomAccessFile2.getChannel().write(allocate);
                i2 += 65025;
                byteBuffer2.position(i2);
                i6++;
                i5 = 26;
            }
            i3 = d;
        } else {
            i3 = d;
            i2 = 0;
        }
        int i7 = i % 65025;
        f35681c.fine("Last comment packet size:" + i7);
        if (!m48497f(i7, aVar.mo31681d(), aVar.mo31680c())) {
            f35681c.fine("WriteOgg Type 3");
            byte[] d3 = m48496d(i7, true);
            ByteBuffer allocate2 = ByteBuffer.allocate(i7 + d3.length + 27);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.put(cVar.mo31692e(), 0, 26);
            allocate2.put((byte) d3.length);
            for (byte put2 : d3) {
                allocate2.put(put2);
            }
            byteBuffer2.position(i2);
            allocate2.put(byteBuffer.slice());
            allocate2.putInt(18, i3);
            if (i4 > 0) {
                allocate2.put(5, C9102c.C9103a.CONTINUED_PACKET.getFileValue());
            }
            f35681c.fine("Writing Last Comment Page " + i3 + " to file");
            i3++;
            m48493a(allocate2);
            randomAccessFile2.getChannel().write(allocate2);
            byte[] c = m48495c(aVar.mo31681d(), aVar.mo31680c());
            byte[] b = this.f35683b.mo31672b(aVar.mo31682e(), randomAccessFile3);
            ByteBuffer allocate3 = ByteBuffer.allocate(b.length + c.length + 27);
            allocate3.order(ByteOrder.LITTLE_ENDIAN);
            allocate3.put(cVar.mo31692e(), 0, 26);
            allocate3.put((byte) c.length);
            for (byte put3 : c) {
                allocate3.put(put3);
            }
            allocate3.put(b);
            allocate3.putInt(18, i3);
            f35681c.fine("Writing Setup Header and packets Page " + i3 + " to file");
            m48493a(allocate3);
            randomAccessFile2.getChannel().write(allocate3);
        } else {
            f35681c.fine("WriteOgg Type 4");
            int b2 = aVar.mo31679b();
            byteBuffer2.position(i2);
            ByteBuffer j = m48501j(aVar, i7, b2 + aVar.mo31681d() + i7, cVar, byteBuffer.slice());
            randomAccessFile3.seek(aVar.mo31682e());
            j.put(this.f35683b.mo31672b(aVar.mo31682e(), randomAccessFile3));
            j.putInt(18, i3);
            j.put(5, C9102c.C9103a.CONTINUED_PACKET.getFileValue());
            m48493a(j);
            randomAccessFile2.getChannel().write(j);
        }
        mo31685l(i3, randomAccessFile3, randomAccessFile2);
    }

    /* renamed from: h */
    private void m48499h(C9096d.C9097a aVar, int i, int i2, C9102c cVar, ByteBuffer byteBuffer, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException, C9015a, C9017c {
        f35681c.fine("WriteOgg Type 2");
        ByteBuffer j = m48501j(aVar, i, i2, cVar, byteBuffer);
        int d = cVar.mo31691d();
        byte[] b = this.f35683b.mo31672b(aVar.mo31682e(), randomAccessFile);
        Logger logger = f35681c;
        logger.finest(b.length + ":" + j.position() + ":" + j.capacity());
        j.put(b);
        m48493a(j);
        randomAccessFile2.getChannel().write(j);
        mo31685l(d, randomAccessFile, randomAccessFile2);
    }

    /* renamed from: i */
    private void m48500i(C9096d.C9097a aVar, int i, int i2, C9102c cVar, ByteBuffer byteBuffer, long j, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException {
        f35681c.fine("WriteOgg Type 1");
        ByteBuffer j2 = m48501j(aVar, i, i2, cVar, byteBuffer);
        randomAccessFile.seek(j);
        randomAccessFile.skipBytes(aVar.mo31678a());
        randomAccessFile.getChannel().read(j2);
        m48493a(j2);
        randomAccessFile2.getChannel().write(j2);
        randomAccessFile2.getChannel().transferFrom(randomAccessFile.getChannel(), randomAccessFile2.getFilePointer(), randomAccessFile.length() - randomAccessFile.getFilePointer());
    }

    /* renamed from: j */
    private ByteBuffer m48501j(C9096d.C9097a aVar, int i, int i2, C9102c cVar, ByteBuffer byteBuffer) throws IOException {
        f35681c.fine("WriteOgg Type 1");
        byte[] b = m48494b(i, aVar.mo31681d(), aVar.mo31680c());
        int length = b.length + 27;
        f35681c.fine("New second page header length:" + length);
        f35681c.fine("No of segments:" + b.length);
        ByteBuffer allocate = ByteBuffer.allocate(i2 + length);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        byte[] e = cVar.mo31692e();
        allocate.put(e, 0, 26);
        allocate.put((byte) b.length);
        for (byte put : b) {
            allocate.put(put);
        }
        allocate.put(byteBuffer);
        return allocate;
    }

    /* renamed from: e */
    public void mo31683e(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException, C9015a, C9017c {
        try {
            this.f35683b.mo31675e(randomAccessFile);
            C9298d m = C9298d.m49285m();
            randomAccessFile.seek(0);
            mo31684k(m, randomAccessFile, randomAccessFile2);
        } catch (C9015a unused) {
            mo31684k(C9298d.m49285m(), randomAccessFile, randomAccessFile2);
        }
    }

    /* renamed from: k */
    public void mo31684k(C9130j jVar, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C9015a, C9017c, IOException {
        f35681c.config("Starting to write file:");
        f35681c.fine("Read 1st Page:identificationHeader:");
        C9102c j = C9102c.m48510j(randomAccessFile);
        randomAccessFile.seek(j.mo31695h());
        randomAccessFile2.getChannel().transferFrom(randomAccessFile.getChannel(), 0, (long) (j.mo31690c() + 27 + j.mo31693f().length));
        randomAccessFile2.skipBytes(j.mo31690c() + 27 + j.mo31693f().length);
        f35681c.fine("Written identificationHeader:");
        C9102c j2 = C9102c.m48510j(randomAccessFile);
        long filePointer = randomAccessFile.getFilePointer();
        Logger logger = f35681c;
        logger.fine("Read 2nd Page:comment and setup and possibly audio:Header finishes at file position:" + filePointer);
        randomAccessFile.seek(0);
        C9096d.C9097a f = this.f35683b.mo31676f(randomAccessFile);
        ByteBuffer a = this.f35682a.mo31671a(jVar);
        int capacity = a.capacity();
        int d = f.mo31681d() + capacity + f.mo31679b();
        Logger logger2 = f35681c;
        logger2.fine("Old 2nd Page no of packets: " + j2.mo31689b().size());
        Logger logger3 = f35681c;
        logger3.fine("Old 2nd Page size: " + j2.mo31690c());
        Logger logger4 = f35681c;
        logger4.fine("Old last packet incomplete: " + j2.mo31696i());
        Logger logger5 = f35681c;
        logger5.fine("Setup Header Size: " + f.mo31681d());
        Logger logger6 = f35681c;
        logger6.fine("Extra Packets: " + f.mo31680c().size());
        Logger logger7 = f35681c;
        logger7.fine("Extra Packet Data Size: " + f.mo31679b());
        Logger logger8 = f35681c;
        logger8.fine("Old comment: " + f.mo31678a());
        Logger logger9 = f35681c;
        logger9.fine("New comment: " + capacity);
        Logger logger10 = f35681c;
        logger10.fine("New Page Data Size: " + d);
        if (!m48497f(capacity, f.mo31681d(), f.mo31680c())) {
            f35681c.fine("Header and Setup with shift audio:");
            m48498g(f, capacity, j2, a, randomAccessFile, randomAccessFile2);
        } else if (j2.mo31690c() >= 65025 || ((j2.mo31689b().size() != 2 || j2.mo31696i()) && j2.mo31689b().size() <= 2)) {
            f35681c.fine("Header and Setup now on single page:");
            m48499h(f, capacity, d, j2, a, randomAccessFile, randomAccessFile2);
        } else {
            f35681c.fine("Header and Setup remain on single page:");
            m48500i(f, capacity, d, j2, a, filePointer, randomAccessFile, randomAccessFile2);
        }
    }

    /* renamed from: l */
    public void mo31685l(int i, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException, C9015a, C9017c {
        long filePointer = randomAccessFile.getFilePointer();
        long filePointer2 = randomAccessFile2.getFilePointer();
        ByteBuffer allocate = ByteBuffer.allocate((int) (randomAccessFile.length() - randomAccessFile.getFilePointer()));
        ByteBuffer allocate2 = ByteBuffer.allocate((int) (randomAccessFile.length() - randomAccessFile.getFilePointer()));
        randomAccessFile.getChannel().read(allocate);
        allocate.rewind();
        while (allocate.hasRemaining()) {
            C9102c k = C9102c.m48511k(allocate);
            ByteBuffer allocate3 = ByteBuffer.allocate(k.mo31692e().length + k.mo31690c());
            allocate3.order(ByteOrder.LITTLE_ENDIAN);
            allocate3.put(k.mo31692e());
            ByteBuffer slice = allocate.slice();
            slice.limit(k.mo31690c());
            allocate3.put(slice);
            i++;
            allocate3.putInt(18, i);
            m48493a(allocate3);
            allocate.position(allocate.position() + k.mo31690c());
            allocate3.rewind();
            allocate2.put(allocate3);
        }
        allocate2.rewind();
        randomAccessFile2.getChannel().write(allocate2);
        if (randomAccessFile.length() - filePointer != randomAccessFile2.length() - filePointer2) {
            throw new C9017c("File written counts don't match, file not written");
        }
    }
}
