package p402l.p406b.p407a.p420l.p421g;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9053f;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.p431t.C9180d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.l.g.b */
/* compiled from: OggInfoReader */
public class C9101b {

    /* renamed from: a */
    public static Logger f35687a = Logger.getLogger("org.jaudiotagger.audio.ogg.atom");

    /* renamed from: a */
    private int m48508a(int i, long j) {
        if (i == 0) {
            i = 1;
        }
        return (int) (((j / 1000) * 8) / ((long) i));
    }

    /* renamed from: b */
    public C9053f mo31687b(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        double d;
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        long filePointer = randomAccessFile.getFilePointer();
        C9053f fVar = new C9053f();
        f35687a.fine("Started");
        byte[] bArr = C9102c.f35689m;
        byte[] bArr2 = new byte[bArr.length];
        randomAccessFile2.read(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            randomAccessFile2.seek(0);
            if (C9180d.m48789H(randomAccessFile)) {
                randomAccessFile2.read(bArr2);
                if (Arrays.equals(bArr2, bArr)) {
                    filePointer = randomAccessFile.getFilePointer();
                }
            } else {
                throw new C9015a(C9118b.OGG_HEADER_CANNOT_BE_FOUND.getMsg(new String(bArr2)));
            }
        }
        randomAccessFile2.seek(filePointer);
        randomAccessFile2.seek(randomAccessFile.length() - 2);
        while (true) {
            if (randomAccessFile.getFilePointer() < 4) {
                d = -1.0d;
                break;
            }
            int read = randomAccessFile.read();
            byte[] bArr3 = C9102c.f35689m;
            if (read == bArr3[3]) {
                randomAccessFile2.seek(randomAccessFile.getFilePointer() - 4);
                byte[] bArr4 = new byte[3];
                randomAccessFile2.readFully(bArr4);
                if (bArr4[0] == bArr3[0] && bArr4[1] == bArr3[1] && bArr4[2] == bArr3[2]) {
                    randomAccessFile2.seek(randomAccessFile.getFilePointer() - 3);
                    long filePointer2 = randomAccessFile.getFilePointer();
                    randomAccessFile2.seek(randomAccessFile.getFilePointer() + 26);
                    randomAccessFile2.seek(filePointer2);
                    byte[] bArr5 = new byte[((randomAccessFile.readByte() & 255) + 27)];
                    randomAccessFile2.readFully(bArr5);
                    C9102c cVar = new C9102c(bArr5);
                    randomAccessFile2.seek(0);
                    d = cVar.mo31688a();
                    break;
                }
            }
            randomAccessFile2.seek(randomAccessFile.getFilePointer() - 2);
        }
        if (d != -1.0d) {
            byte[] bArr6 = new byte[C9102c.m48510j(randomAccessFile).mo31690c()];
            randomAccessFile2.read(bArr6);
            C9106e eVar = new C9106e(bArr6);
            fVar.mo31555n((float) (d / ((double) eVar.mo31708g())));
            fVar.mo31550i(eVar.mo31703b());
            fVar.mo31556o(eVar.mo31708g());
            fVar.mo31551j(eVar.mo31704c());
            fVar.mo31552k(BuildConfig.FLAVOR);
            fVar.mo31549h(16);
            if (eVar.mo31707f() != 0 && eVar.mo31705d() == eVar.mo31707f() && eVar.mo31706e() == eVar.mo31707f()) {
                fVar.mo31548g(eVar.mo31707f() / 1000);
                fVar.mo31557p(false);
            } else if (eVar.mo31707f() != 0 && eVar.mo31705d() == 0 && eVar.mo31706e() == 0) {
                fVar.mo31548g(eVar.mo31707f() / 1000);
                fVar.mo31557p(true);
            } else {
                fVar.mo31548g(m48508a(fVar.mo31547f(), randomAccessFile.length()));
                fVar.mo31557p(true);
                f35687a.fine("Finished");
                return fVar;
            }
            f35687a.fine("Finished");
            return fVar;
        }
        throw new C9015a(C9118b.OGG_VORBIS_NO_SETUP_BLOCK.getMsg());
    }
}
