package p402l.p406b.p407a.p414h;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p414h.p415i.C9043g;
import p402l.p406b.p407a.p414h.p415i.C9046j;
import p402l.p406b.p426c.C9125e;
import p402l.p406b.p426c.p430s.C9171a;
import p402l.p406b.p426c.p440y.C9297c;
import p402l.p406b.p426c.p440y.C9298d;

/* renamed from: l.b.a.h.g */
/* compiled from: FlacTagReader */
public class C9032g {

    /* renamed from: b */
    public static Logger f35479b = Logger.getLogger("org.jaudiotagger.audio.flac");

    /* renamed from: a */
    private C9297c f35480a = new C9297c();

    /* renamed from: l.b.a.h.g$a */
    /* compiled from: FlacTagReader */
    static /* synthetic */ class C9033a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35481a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                l.b.a.h.i.a[] r0 = p402l.p406b.p407a.p414h.p415i.C9037a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35481a = r0
                l.b.a.h.i.a r1 = p402l.p406b.p407a.p414h.p415i.C9037a.VORBIS_COMMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35481a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.b.a.h.i.a r1 = p402l.p406b.p407a.p414h.p415i.C9037a.PICTURE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p414h.C9032g.C9033a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C9171a mo31489a(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        new C9030e(randomAccessFile).mo31486a();
        ArrayList arrayList = new ArrayList();
        C9298d dVar = null;
        boolean z = false;
        while (!z) {
            Logger logger = f35479b;
            Level level = Level.CONFIG;
            if (logger.isLoggable(level)) {
                Logger logger2 = f35479b;
                logger2.config("Looking for MetaBlockHeader at:" + randomAccessFile.getFilePointer());
            }
            C9046j f = C9046j.m48236f(randomAccessFile);
            if (f == null) {
                break;
            }
            if (f35479b.isLoggable(level)) {
                Logger logger3 = f35479b;
                logger3.config("Reading MetadataBlockHeader:" + f.toString() + " ending at " + randomAccessFile.getFilePointer());
            }
            if (f.mo31512a() != null) {
                int i = C9033a.f35481a[f.mo31512a().ordinal()];
                if (i == 1) {
                    byte[] bArr = new byte[f.mo31515d()];
                    randomAccessFile.read(bArr);
                    dVar = this.f35480a.mo32142a(bArr, false);
                } else if (i != 2) {
                    if (f35479b.isLoggable(level)) {
                        Logger logger4 = f35479b;
                        logger4.config("Ignoring MetadataBlock:" + f.mo31512a());
                    }
                    randomAccessFile.seek(randomAccessFile.getFilePointer() + ((long) f.mo31515d()));
                } else {
                    try {
                        arrayList.add(new C9043g(f, randomAccessFile));
                    } catch (IOException e) {
                        Logger logger5 = f35479b;
                        logger5.warning("Unable to read picture metablock, ignoring:" + e.getMessage());
                    } catch (C9125e e2) {
                        Logger logger6 = f35479b;
                        logger6.warning("Unable to read picture metablock, ignoring" + e2.getMessage());
                    }
                }
            }
            z = f.mo31516e();
        }
        if (dVar == null) {
            dVar = C9298d.m49285m();
        }
        return new C9171a(dVar, arrayList);
    }
}
