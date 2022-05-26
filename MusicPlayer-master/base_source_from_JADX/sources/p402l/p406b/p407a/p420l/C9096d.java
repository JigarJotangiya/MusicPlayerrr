package p402l.p406b.p407a.p420l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p420l.p421g.C9102c;
import p402l.p406b.p407a.p420l.p421g.C9107f;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.p440y.C9297c;
import p402l.p406b.p426c.p440y.C9298d;

/* renamed from: l.b.a.l.d */
/* compiled from: OggVorbisTagReader */
public class C9096d {

    /* renamed from: b */
    public static Logger f35675b = Logger.getLogger("org.jaudiotagger.audio.ogg");

    /* renamed from: a */
    private C9297c f35676a = new C9297c();

    /* renamed from: l.b.a.l.d$a */
    /* compiled from: OggVorbisTagReader */
    public static class C9097a {

        /* renamed from: a */
        private long f35677a;

        /* renamed from: b */
        private int f35678b;

        /* renamed from: c */
        private int f35679c;

        /* renamed from: d */
        private List<C9102c.C9104b> f35680d;

        C9097a(long j, long j2, int i, int i2, List<C9102c.C9104b> list) {
            this.f35680d = list;
            this.f35677a = j2;
            this.f35678b = i;
            this.f35679c = i2;
        }

        /* renamed from: a */
        public int mo31678a() {
            return this.f35678b;
        }

        /* renamed from: b */
        public int mo31679b() {
            int i = 0;
            for (C9102c.C9104b a : this.f35680d) {
                i += a.mo31700a();
            }
            return i;
        }

        /* renamed from: c */
        public List<C9102c.C9104b> mo31680c() {
            return this.f35680d;
        }

        /* renamed from: d */
        public int mo31681d() {
            return this.f35679c;
        }

        /* renamed from: e */
        public long mo31682e() {
            return this.f35677a;
        }
    }

    /* renamed from: a */
    private byte[] m48481a(C9102c cVar, RandomAccessFile randomAccessFile) throws IOException, C9015a {
        C9102c j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[(cVar.mo31689b().get(0).mo31700a() - 7)];
        randomAccessFile.read(bArr);
        byteArrayOutputStream.write(bArr);
        if (cVar.mo31689b().size() > 1) {
            f35675b.config("Comments finish on 2nd Page because there is another packet on this page");
            return byteArrayOutputStream.toByteArray();
        } else if (!cVar.mo31696i()) {
            f35675b.config("Comments finish on 2nd Page because this packet is complete");
            return byteArrayOutputStream.toByteArray();
        } else {
            do {
                f35675b.config("Reading next page");
                j = C9102c.m48510j(randomAccessFile);
                byte[] bArr2 = new byte[j.mo31689b().get(0).mo31700a()];
                randomAccessFile.read(bArr2);
                byteArrayOutputStream.write(bArr2);
                if (j.mo31689b().size() > 1) {
                    f35675b.config("Comments finish on Page because there is another packet on this page");
                    return byteArrayOutputStream.toByteArray();
                }
            } while (j.mo31696i());
            f35675b.config("Comments finish on Page because this packet is complete");
            return byteArrayOutputStream.toByteArray();
        }
    }

    /* renamed from: b */
    public byte[] mo31672b(long j, RandomAccessFile randomAccessFile) throws IOException, C9015a {
        C9102c j2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        randomAccessFile.seek(j);
        C9102c j3 = C9102c.m48510j(randomAccessFile);
        if (j3.mo31689b().size() > 1) {
            randomAccessFile.skipBytes(j3.mo31689b().get(0).mo31700a());
        }
        byte[] bArr = new byte[7];
        randomAccessFile.read(bArr);
        if (mo31674d(bArr)) {
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 7);
            if (j3.mo31689b().size() > 1) {
                byte[] bArr2 = new byte[j3.mo31689b().get(1).mo31700a()];
                randomAccessFile.read(bArr2);
                byteArrayOutputStream.write(bArr2);
            } else {
                byte[] bArr3 = new byte[j3.mo31689b().get(0).mo31700a()];
                randomAccessFile.read(bArr3);
                byteArrayOutputStream.write(bArr3);
            }
            if (!j3.mo31696i() || j3.mo31689b().size() > 2) {
                f35675b.config("Setupheader finishes on this page");
                if (j3.mo31689b().size() > 2) {
                    for (int i = 2; i < j3.mo31689b().size(); i++) {
                        byte[] bArr4 = new byte[j3.mo31689b().get(i).mo31700a()];
                        randomAccessFile.read(bArr4);
                        byteArrayOutputStream.write(bArr4);
                    }
                }
                return byteArrayOutputStream.toByteArray();
            }
            do {
                f35675b.config("Reading another page");
                j2 = C9102c.m48510j(randomAccessFile);
                byte[] bArr5 = new byte[j2.mo31689b().get(0).mo31700a()];
                randomAccessFile.read(bArr5);
                byteArrayOutputStream.write(bArr5);
                if (j2.mo31689b().size() > 1) {
                    f35675b.config("Setupheader finishes on this page");
                    return byteArrayOutputStream.toByteArray();
                }
            } while (j2.mo31696i());
            f35675b.config("Setupheader finish on Page because this packet is complete");
            return byteArrayOutputStream.toByteArray();
        }
        throw new C9015a("Unable to find setup header(2), unable to write ogg file");
    }

    /* renamed from: c */
    public boolean mo31673c(byte[] bArr) {
        String q = C9057i.m48314q(bArr, 1, 6, "ISO-8859-1");
        if (bArr[0] != C9107f.COMMENT_HEADER.getType() || !q.equals("vorbis")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo31674d(byte[] bArr) {
        String q = C9057i.m48314q(bArr, 1, 6, "ISO-8859-1");
        if (bArr[0] != C9107f.SETUP_HEADER.getType() || !q.equals("vorbis")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public C9130j mo31675e(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        f35675b.config("Starting to read ogg vorbis tag from file:");
        C9298d a = this.f35676a.mo32142a(mo31677g(randomAccessFile), true);
        f35675b.fine("CompletedReadCommentTag");
        return a;
    }

    /* renamed from: f */
    public C9097a mo31676f(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        long j;
        long j2;
        List<C9102c.C9104b> list;
        int i;
        long j3;
        List<C9102c.C9104b> list2;
        int i2;
        List<C9102c.C9104b> list3;
        List<C9102c.C9104b> list4;
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        f35675b.fine("Started to read comment and setup header sizes:");
        long filePointer = randomAccessFile.getFilePointer();
        List<C9102c.C9104b> arrayList = new ArrayList<>();
        randomAccessFile2.seek(randomAccessFile.getFilePointer() + ((long) C9102c.m48510j(randomAccessFile).mo31690c()));
        C9102c j4 = C9102c.m48510j(randomAccessFile);
        long filePointer2 = randomAccessFile.getFilePointer() - ((long) (j4.mo31693f().length + 27));
        byte[] bArr = new byte[7];
        randomAccessFile2.read(bArr);
        if (mo31673c(bArr)) {
            randomAccessFile2.seek(randomAccessFile.getFilePointer() - 7);
            Logger logger = f35675b;
            logger.config("Found start of comment header at:" + randomAccessFile.getFilePointer());
            int i3 = 0;
            while (true) {
                List<C9102c.C9104b> b = j4.mo31689b();
                i3 += b.get(0).mo31700a();
                randomAccessFile2.skipBytes(b.get(0).mo31700a());
                if (b.size() > 1 || !j4.mo31696i()) {
                    Logger logger2 = f35675b;
                    logger2.config("Found end of comment:size:" + i3 + "finishes at file position:" + randomAccessFile.getFilePointer());
                } else {
                    j4 = C9102c.m48510j(randomAccessFile);
                }
            }
            Logger logger22 = f35675b;
            logger22.config("Found end of comment:size:" + i3 + "finishes at file position:" + randomAccessFile.getFilePointer());
            if (j4.mo31689b().size() == 1) {
                C9102c j5 = C9102c.m48510j(randomAccessFile);
                List<C9102c.C9104b> b2 = j5.mo31689b();
                List<C9102c.C9104b> list5 = arrayList;
                C9102c.C9104b bVar = j5.mo31689b().get(0);
                byte[] bArr2 = new byte[7];
                randomAccessFile2.read(bArr2);
                if (mo31674d(bArr2)) {
                    j = filePointer2;
                    randomAccessFile2.seek(randomAccessFile.getFilePointer() - 7);
                    Logger logger3 = f35675b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Found start of vorbis setup header at file position:");
                    j2 = filePointer;
                    sb.append(randomAccessFile.getFilePointer());
                    logger3.config(sb.toString());
                    long filePointer3 = randomAccessFile.getFilePointer() - ((long) (j5.mo31693f().length + 27));
                    int a = bVar.mo31700a();
                    Logger logger4 = f35675b;
                    logger4.fine("Adding:" + bVar.mo31700a() + " to setup header size");
                    randomAccessFile2.skipBytes(bVar.mo31700a());
                    if (b2.size() > 1 || !j5.mo31696i()) {
                        Logger logger5 = f35675b;
                        logger5.config("Found end of setupheader:size:" + a + "finishes at:" + randomAccessFile.getFilePointer());
                        if (b2.size() > 1) {
                            list4 = b2.subList(1, b2.size());
                        }
                        i2 = a;
                        list3 = list5;
                        j3 = filePointer3;
                        list = list3;
                        i = i2;
                    } else {
                        C9102c j6 = C9102c.m48510j(randomAccessFile);
                        List<C9102c.C9104b> b3 = j6.mo31689b();
                        while (true) {
                            a += b3.get(0).mo31700a();
                            Logger logger6 = f35675b;
                            logger6.fine("Adding:" + b3.get(0).mo31700a() + " to setup header size");
                            randomAccessFile2.skipBytes(b3.get(0).mo31700a());
                            if (b3.size() > 1 || !j6.mo31696i()) {
                                Logger logger7 = f35675b;
                                logger7.fine("Found end of setupheader:size:" + a + "finishes at:" + randomAccessFile.getFilePointer());
                            } else {
                                j6 = C9102c.m48510j(randomAccessFile);
                            }
                        }
                        Logger logger72 = f35675b;
                        logger72.fine("Found end of setupheader:size:" + a + "finishes at:" + randomAccessFile.getFilePointer());
                        if (b3.size() > 1) {
                            list4 = b3.subList(1, b3.size());
                        }
                        i2 = a;
                        list3 = list5;
                        j3 = filePointer3;
                        list = list3;
                        i = i2;
                    }
                    List<C9102c.C9104b> list6 = list4;
                    i2 = a;
                    list3 = list6;
                    j3 = filePointer3;
                    list = list3;
                    i = i2;
                } else {
                    throw new C9015a(C9118b.OGG_VORBIS_NO_VORBIS_HEADER_FOUND.getMsg());
                }
            } else {
                j2 = filePointer;
                List<C9102c.C9104b> list7 = arrayList;
                j = filePointer2;
                C9102c.C9104b bVar2 = j4.mo31689b().get(1);
                List b4 = j4.mo31689b();
                byte[] bArr3 = new byte[7];
                randomAccessFile2.read(bArr3);
                if (mo31674d(bArr3)) {
                    randomAccessFile2.seek(randomAccessFile.getFilePointer() - 7);
                    Logger logger8 = f35675b;
                    logger8.config("Found start of vorbis setup header at file position:" + randomAccessFile.getFilePointer());
                    long filePointer4 = (randomAccessFile.getFilePointer() - ((long) (j4.mo31693f().length + 27))) - ((long) j4.mo31689b().get(0).mo31700a());
                    int a2 = bVar2.mo31700a();
                    Logger logger9 = f35675b;
                    logger9.fine("Adding:" + bVar2.mo31700a() + " to setup header size");
                    randomAccessFile2.skipBytes(bVar2.mo31700a());
                    if (b4.size() > 2 || !j4.mo31696i()) {
                        Logger logger10 = f35675b;
                        logger10.fine("Found end of setupheader:size:" + a2 + "finishes at:" + randomAccessFile.getFilePointer());
                        if (b4.size() > 2) {
                            list2 = b4.subList(2, b4.size());
                        }
                        i = a2;
                        j3 = filePointer4;
                        list = list7;
                    } else {
                        C9102c j7 = C9102c.m48510j(randomAccessFile);
                        List<C9102c.C9104b> b5 = j7.mo31689b();
                        while (true) {
                            a2 += b5.get(0).mo31700a();
                            Logger logger11 = f35675b;
                            logger11.fine("Adding:" + b5.get(0).mo31700a() + " to setup header size");
                            randomAccessFile2.skipBytes(b5.get(0).mo31700a());
                            if (b5.size() > 1 || !j7.mo31696i()) {
                                Logger logger12 = f35675b;
                                logger12.fine("Found end of setupheader:size:" + a2 + "finishes at:" + randomAccessFile.getFilePointer());
                            } else {
                                j7 = C9102c.m48510j(randomAccessFile);
                            }
                        }
                        Logger logger122 = f35675b;
                        logger122.fine("Found end of setupheader:size:" + a2 + "finishes at:" + randomAccessFile.getFilePointer());
                        if (b5.size() > 1) {
                            list2 = b5.subList(1, b5.size());
                        }
                        i = a2;
                        j3 = filePointer4;
                        list = list7;
                    }
                    list = list2;
                    i = a2;
                    j3 = filePointer4;
                } else {
                    Logger logger13 = f35675b;
                    logger13.warning("Expecting but got:" + new String(bArr3) + "at " + (randomAccessFile.getFilePointer() - ((long) 7)));
                    throw new C9015a(C9118b.OGG_VORBIS_NO_VORBIS_HEADER_FOUND.getMsg());
                }
            }
            randomAccessFile2.seek(j2);
            return new C9097a(j, j3, i3, i, list);
        }
        throw new C9015a("Cannot find comment block (no vorbiscomment header)");
    }

    /* renamed from: g */
    public byte[] mo31677g(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        f35675b.fine("Read 1st page");
        randomAccessFile.seek(randomAccessFile.getFilePointer() + ((long) C9102c.m48510j(randomAccessFile).mo31690c()));
        f35675b.fine("Read 2nd page");
        C9102c j = C9102c.m48510j(randomAccessFile);
        byte[] bArr = new byte[7];
        randomAccessFile.read(bArr);
        if (mo31673c(bArr)) {
            return m48481a(j, randomAccessFile);
        }
        throw new C9015a("Cannot find comment block (no vorbiscomment header)");
    }
}
