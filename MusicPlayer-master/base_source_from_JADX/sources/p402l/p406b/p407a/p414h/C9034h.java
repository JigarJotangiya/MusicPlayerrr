package p402l.p406b.p407a.p414h;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p407a.p414h.p415i.C9038b;
import p402l.p406b.p407a.p414h.p415i.C9040d;
import p402l.p406b.p407a.p414h.p415i.C9041e;
import p402l.p406b.p407a.p414h.p415i.C9042f;
import p402l.p406b.p407a.p414h.p415i.C9044h;
import p402l.p406b.p407a.p414h.p415i.C9045i;
import p402l.p406b.p407a.p414h.p415i.C9046j;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p430s.C9171a;
import p402l.p406b.p426c.p440y.C9298d;

/* renamed from: l.b.a.h.h */
/* compiled from: FlacTagWriter */
public class C9034h {

    /* renamed from: b */
    public static Logger f35482b = Logger.getLogger("org.jaudiotagger.audio.flac");

    /* renamed from: a */
    private C9031f f35483a = new C9031f();

    /* renamed from: l.b.a.h.h$a */
    /* compiled from: FlacTagWriter */
    static /* synthetic */ class C9035a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35484a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l.b.a.h.i.a[] r0 = p402l.p406b.p407a.p414h.p415i.C9037a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35484a = r0
                l.b.a.h.i.a r1 = p402l.p406b.p407a.p414h.p415i.C9037a.STREAMINFO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35484a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.b.a.h.i.a r1 = p402l.p406b.p407a.p414h.p415i.C9037a.VORBIS_COMMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35484a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l.b.a.h.i.a r1 = p402l.p406b.p407a.p414h.p415i.C9037a.PADDING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35484a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l.b.a.h.i.a r1 = p402l.p406b.p407a.p414h.p415i.C9037a.PICTURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35484a     // Catch:{ NoSuchFieldError -> 0x003e }
                l.b.a.h.i.a r1 = p402l.p406b.p407a.p414h.p415i.C9037a.APPLICATION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35484a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l.b.a.h.i.a r1 = p402l.p406b.p407a.p414h.p415i.C9037a.SEEKTABLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35484a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l.b.a.h.i.a r1 = p402l.p406b.p407a.p414h.p415i.C9037a.CUESHEET     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p414h.C9034h.C9035a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private int m48198a(C9036b bVar) {
        int i = 0;
        for (C9038b c : bVar.f35487c) {
            i += c.mo31495c();
        }
        for (C9038b c2 : bVar.f35488d) {
            i += c2.mo31495c();
        }
        for (C9038b c3 : bVar.f35489e) {
            i += c3.mo31495c();
        }
        for (C9038b c4 : bVar.f35486b) {
            i += c4.mo31495c();
        }
        return i;
    }

    /* renamed from: b */
    private int m48199b(C9036b bVar) {
        int i = 0;
        for (C9038b c : bVar.f35487c) {
            i += c.mo31495c();
        }
        for (C9038b c2 : bVar.f35488d) {
            i += c2.mo31495c();
        }
        for (C9038b c3 : bVar.f35489e) {
            i += c3.mo31495c();
        }
        return i;
    }

    /* renamed from: c */
    public void mo31490c(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException, C9017c {
        C9171a aVar = new C9171a((C9298d) null, new ArrayList());
        randomAccessFile.seek(0);
        randomAccessFile2.seek(0);
        mo31491d(aVar, randomAccessFile, randomAccessFile2);
    }

    /* renamed from: d */
    public void mo31491d(C9130j jVar, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C9017c, IOException {
        C9130j jVar2 = jVar;
        RandomAccessFile randomAccessFile3 = randomAccessFile;
        RandomAccessFile randomAccessFile4 = randomAccessFile2;
        f35482b.config("Writing tag");
        C9036b bVar = new C9036b((C9035a) null);
        C9030e eVar = new C9030e(randomAccessFile3);
        try {
            eVar.mo31486a();
            boolean z = false;
            while (!z) {
                try {
                    C9046j f = C9046j.m48236f(randomAccessFile);
                    if (f.mo31512a() != null) {
                        switch (C9035a.f35484a[f.mo31512a().ordinal()]) {
                            case 1:
                                C9038b unused = bVar.f35485a = new C9038b(f, new C9045i(f, randomAccessFile3));
                                break;
                            case 2:
                            case 3:
                            case 4:
                                randomAccessFile3.seek(randomAccessFile.getFilePointer() + ((long) f.mo31515d()));
                                bVar.f35486b.add(new C9038b(f, new C9042f(f.mo31515d())));
                                break;
                            case 5:
                                bVar.f35487c.add(new C9038b(f, new C9040d(f, randomAccessFile3)));
                                break;
                            case 6:
                                bVar.f35488d.add(new C9038b(f, new C9044h(f, randomAccessFile3)));
                                break;
                            case 7:
                                bVar.f35489e.add(new C9038b(f, new C9041e(f, randomAccessFile3)));
                                break;
                            default:
                                randomAccessFile3.seek(randomAccessFile.getFilePointer() + ((long) f.mo31515d()));
                                break;
                        }
                    }
                    z = f.mo31516e();
                } catch (C9015a e) {
                    throw new C9017c(e.getMessage());
                }
            }
            int a = m48198a(bVar);
            int limit = this.f35483a.mo31534a(jVar2).limit() + m48199b(bVar);
            randomAccessFile3.seek((long) eVar.mo31487b());
            Logger logger = f35482b;
            logger.config("Writing tag available bytes:" + a + ":needed bytes:" + limit);
            if (a == limit || a > limit + 4) {
                randomAccessFile3.seek((long) (eVar.mo31487b() + 4));
                randomAccessFile3.write(bVar.f35485a.mo31494b().mo31514c());
                randomAccessFile3.write(bVar.f35485a.mo31493a().mo31496a());
                for (C9038b bVar2 : bVar.f35487c) {
                    randomAccessFile3.write(bVar2.mo31494b().mo31514c());
                    randomAccessFile3.write(bVar2.mo31493a().mo31496a());
                }
                for (C9038b bVar3 : bVar.f35488d) {
                    randomAccessFile3.write(bVar3.mo31494b().mo31514c());
                    randomAccessFile3.write(bVar3.mo31493a().mo31496a());
                }
                for (C9038b bVar4 : bVar.f35489e) {
                    randomAccessFile3.write(bVar4.mo31494b().mo31514c());
                    randomAccessFile3.write(bVar4.mo31493a().mo31496a());
                }
                randomAccessFile.getChannel().write(this.f35483a.mo31488b(jVar2, a - limit));
                return;
            }
            if (eVar.mo31487b() > 0) {
                randomAccessFile3.seek(0);
                randomAccessFile2.getChannel().transferFrom(randomAccessFile.getChannel(), 0, (long) eVar.mo31487b());
                randomAccessFile4.seek((long) eVar.mo31487b());
            }
            randomAccessFile4.writeBytes("fLaC");
            randomAccessFile4.writeByte(0);
            long b = (long) (eVar.mo31487b() + 4 + 1);
            randomAccessFile4.seek(b);
            randomAccessFile3.seek(b);
            randomAccessFile2.getChannel().transferFrom(randomAccessFile.getChannel(), b, 37);
            int b2 = eVar.mo31487b() + 4 + 4 + 34;
            randomAccessFile4.seek((long) b2);
            for (C9038b bVar5 : bVar.f35487c) {
                randomAccessFile4.write(bVar5.mo31494b().mo31514c());
                randomAccessFile4.write(bVar5.mo31493a().mo31496a());
            }
            for (C9038b bVar6 : bVar.f35488d) {
                randomAccessFile4.write(bVar6.mo31494b().mo31514c());
                randomAccessFile4.write(bVar6.mo31493a().mo31496a());
            }
            for (C9038b bVar7 : bVar.f35489e) {
                randomAccessFile4.write(bVar7.mo31494b().mo31514c());
                randomAccessFile4.write(bVar7.mo31493a().mo31496a());
            }
            randomAccessFile4.write(this.f35483a.mo31488b(jVar2, 4000).array());
            randomAccessFile3.seek((long) (b2 + a));
            long size = randomAccessFile.getChannel().size() - randomAccessFile.getChannel().position();
            long m = C9134n.m48562h().mo31742m();
            long j = size / m;
            long j2 = size % m;
            long j3 = 0;
            for (int i = 0; ((long) i) < j; i++) {
                j3 += randomAccessFile2.getChannel().transferFrom(randomAccessFile.getChannel(), randomAccessFile2.getChannel().position(), m);
                randomAccessFile2.getChannel().position(randomAccessFile2.getChannel().position() + m);
            }
            long transferFrom = j3 + randomAccessFile2.getChannel().transferFrom(randomAccessFile.getChannel(), randomAccessFile2.getChannel().position(), j2);
            if (transferFrom != size) {
                throw new C9017c("Was meant to write " + size + " bytes but only written " + transferFrom + " bytes");
            }
        } catch (C9015a e2) {
            throw new C9017c(e2.getMessage());
        }
    }

    /* renamed from: l.b.a.h.h$b */
    /* compiled from: FlacTagWriter */
    private static class C9036b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C9038b f35485a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<C9038b> f35486b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public List<C9038b> f35487c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public List<C9038b> f35488d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public List<C9038b> f35489e;

        private C9036b() {
            this.f35486b = new ArrayList(1);
            this.f35487c = new ArrayList(1);
            this.f35488d = new ArrayList(1);
            this.f35489e = new ArrayList(1);
        }

        /* synthetic */ C9036b(C9035a aVar) {
            this();
        }
    }
}
