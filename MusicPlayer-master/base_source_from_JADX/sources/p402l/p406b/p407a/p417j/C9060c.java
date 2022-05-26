package p402l.p406b.p407a.p417j;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p407a.p413g.C9018d;
import p402l.p406b.p407a.p413g.C9022h;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p425b.C9120d;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9131k;
import p402l.p406b.p426c.C9133m;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p431t.C9179c0;
import p402l.p406b.p426c.p431t.C9180d;
import p402l.p406b.p426c.p431t.C9193h0;
import p402l.p406b.p426c.p431t.C9241p;
import p402l.p406b.p426c.p431t.C9244r;
import p402l.p406b.p426c.p431t.C9251x;
import p402l.p406b.p426c.p434u.C9256a;
import p402l.p406b.p426c.p439x.C9291b;

/* renamed from: l.b.a.j.c */
/* compiled from: MP3File */
public class C9060c extends C8942a {

    /* renamed from: e */
    private C9180d f35554e;

    /* renamed from: f */
    private C9256a f35555f;

    /* renamed from: g */
    private C9244r f35556g;

    public C9060c() {
        this.f35554e = null;
        this.f35555f = null;
        this.f35556g = null;
    }

    /* renamed from: l */
    private C9059b m48341l(long j, C9059b bVar) throws IOException, C9018d {
        C8942a.f35327d.warning(C9118b.MP3_ID3TAG_LENGTH_INCORRECT.getMsg(this.f35328a.getPath(), C9120d.m48554b(j), C9120d.m48554b(bVar.mo31563a())));
        C9059b bVar2 = new C9059b(this.f35328a, 0);
        Logger logger = C8942a.f35327d;
        logger.config("Checking from start:" + bVar2);
        if (bVar.mo31563a() == bVar2.mo31563a()) {
            C8942a.f35327d.config(C9118b.MP3_START_OF_AUDIO_CONFIRMED.getMsg(this.f35328a.getPath(), C9120d.m48554b(bVar2.mo31563a())));
            return bVar;
        }
        C8942a.f35327d.config(C9118b.MP3_RECALCULATED_POSSIBLE_START_OF_MP3_AUDIO.getMsg(this.f35328a.getPath(), C9120d.m48554b(bVar2.mo31563a())));
        if (bVar.mo31564b() == bVar2.mo31564b()) {
            C8942a.f35327d.warning(C9118b.MP3_RECALCULATED_START_OF_MP3_AUDIO.getMsg(this.f35328a.getPath(), C9120d.m48554b(bVar2.mo31563a())));
            return bVar2;
        } else if (m48342n((int) j, (int) bVar.mo31563a())) {
            return bVar;
        } else {
            C9059b bVar3 = new C9059b(this.f35328a, bVar2.mo31563a() + ((long) bVar2.f35543a.mo31586d()));
            if (bVar3.mo31563a() == bVar.mo31563a()) {
                C8942a.f35327d.warning(C9118b.MP3_START_OF_AUDIO_CONFIRMED.getMsg(this.f35328a.getPath(), C9120d.m48554b(bVar.mo31563a())));
                return bVar;
            } else if (bVar3.mo31564b() == bVar2.mo31564b()) {
                C8942a.f35327d.warning(C9118b.MP3_RECALCULATED_START_OF_MP3_AUDIO.getMsg(this.f35328a.getPath(), C9120d.m48554b(bVar2.mo31563a())));
                return bVar2;
            } else {
                C8942a.f35327d.warning(C9118b.MP3_RECALCULATED_START_OF_MP3_AUDIO.getMsg(this.f35328a.getPath(), C9120d.m48554b(bVar.mo31563a())));
                return bVar;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m48342n(int r7, int r8) throws java.io.IOException {
        /*
            r6 = this;
            java.util.logging.Logger r0 = p402l.p406b.p407a.C8942a.f35327d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Checking file portion:"
            r1.append(r2)
            long r2 = (long) r7
            java.lang.String r4 = p402l.p406b.p425b.C9120d.m48554b(r2)
            r1.append(r4)
            java.lang.String r4 = ":"
            r1.append(r4)
            long r4 = (long) r8
            java.lang.String r4 = p402l.p406b.p425b.C9120d.m48554b(r4)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.config(r1)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0061 }
            java.io.File r4 = r6.f35328a     // Catch:{ all -> 0x0061 }
            r1.<init>(r4)     // Catch:{ all -> 0x0061 }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x005f }
            r0.position(r2)     // Catch:{ all -> 0x005f }
            int r8 = r8 - r7
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r8)     // Catch:{ all -> 0x005f }
            r0.read(r7)     // Catch:{ all -> 0x005f }
        L_0x003f:
            boolean r8 = r7.hasRemaining()     // Catch:{ all -> 0x005f }
            if (r8 == 0) goto L_0x0055
            byte r8 = r7.get()     // Catch:{ all -> 0x005f }
            if (r8 == 0) goto L_0x003f
            r7 = 0
            if (r0 == 0) goto L_0x0051
            r0.close()
        L_0x0051:
            r1.close()
            return r7
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()
        L_0x005a:
            r1.close()
            r7 = 1
            return r7
        L_0x005f:
            r7 = move-exception
            goto L_0x0063
        L_0x0061:
            r7 = move-exception
            r1 = r0
        L_0x0063:
            if (r0 == 0) goto L_0x0068
            r0.close()
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r1.close()
        L_0x006d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p417j.C9060c.m48342n(int, int):boolean");
    }

    /* renamed from: p */
    private void m48343p(File file, RandomAccessFile randomAccessFile, int i) throws IOException {
        if ((i & 2) != 0) {
            C8942a.f35327d.finer("Attempting to read id3v1tags");
            try {
                this.f35556g = new C9241p(randomAccessFile, file.getName());
            } catch (C9133m unused) {
                C8942a.f35327d.config("No ids3v11 tag found");
            }
            try {
                if (this.f35556g == null) {
                    this.f35556g = new C9244r(randomAccessFile, file.getName());
                }
            } catch (C9133m unused2) {
                C8942a.f35327d.config("No id3v1 tag found");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        p402l.p406b.p407a.C8942a.f35327d.config("No id3v23 tag found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        p402l.p406b.p407a.C8942a.f35327d.config("No id3v22 tag found");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008a  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m48344q(java.io.File r6, int r7, int r8) throws java.io.IOException, p402l.p406b.p426c.C9131k {
        /*
            r5 = this;
            r0 = 10
            if (r8 < r0) goto L_0x008e
            java.util.logging.Logger r0 = p402l.p406b.p407a.C8942a.f35327d
            java.lang.String r1 = "Attempting to read id3v2tags"
            r0.finer(r1)
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0081 }
            r2.<init>(r6)     // Catch:{ all -> 0x0081 }
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch:{ all -> 0x007f }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ all -> 0x007f }
            r3 = 0
            r0.read(r8, r3)     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0023
            r0.close()
        L_0x0023:
            r2.close()
            r8.rewind()     // Catch:{ all -> 0x007a }
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0076
            java.util.logging.Logger r7 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ all -> 0x007a }
            r7.config(r1)     // Catch:{ all -> 0x007a }
            l.b.c.t.h0 r7 = new l.b.c.t.h0     // Catch:{ m -> 0x003f }
            java.lang.String r0 = r6.getName()     // Catch:{ m -> 0x003f }
            r7.<init>(r8, r0)     // Catch:{ m -> 0x003f }
            r5.mo31582u(r7)     // Catch:{ m -> 0x003f }
            goto L_0x0046
        L_0x003f:
            java.util.logging.Logger r7 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "No id3v24 tag found"
            r7.config(r0)     // Catch:{ all -> 0x007a }
        L_0x0046:
            l.b.c.t.d r7 = r5.f35554e     // Catch:{ m -> 0x0057 }
            if (r7 != 0) goto L_0x005e
            l.b.c.t.c0 r7 = new l.b.c.t.c0     // Catch:{ m -> 0x0057 }
            java.lang.String r0 = r6.getName()     // Catch:{ m -> 0x0057 }
            r7.<init>(r8, r0)     // Catch:{ m -> 0x0057 }
            r5.mo31582u(r7)     // Catch:{ m -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            java.util.logging.Logger r7 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "No id3v23 tag found"
            r7.config(r0)     // Catch:{ all -> 0x007a }
        L_0x005e:
            l.b.c.t.d r7 = r5.f35554e     // Catch:{ m -> 0x006f }
            if (r7 != 0) goto L_0x0076
            l.b.c.t.x r7 = new l.b.c.t.x     // Catch:{ m -> 0x006f }
            java.lang.String r6 = r6.getName()     // Catch:{ m -> 0x006f }
            r7.<init>(r8, r6)     // Catch:{ m -> 0x006f }
            r5.mo31582u(r7)     // Catch:{ m -> 0x006f }
            goto L_0x0076
        L_0x006f:
            java.util.logging.Logger r6 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ all -> 0x007a }
            java.lang.String r7 = "No id3v22 tag found"
            r6.config(r7)     // Catch:{ all -> 0x007a }
        L_0x0076:
            r8.clear()
            goto L_0x00a4
        L_0x007a:
            r6 = move-exception
            r8.clear()
            throw r6
        L_0x007f:
            r6 = move-exception
            goto L_0x0083
        L_0x0081:
            r6 = move-exception
            r2 = r0
        L_0x0083:
            if (r0 == 0) goto L_0x0088
            r0.close()
        L_0x0088:
            if (r2 == 0) goto L_0x008d
            r2.close()
        L_0x008d:
            throw r6
        L_0x008e:
            java.util.logging.Logger r6 = p402l.p406b.p407a.C8942a.f35327d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Not enough room for valid id3v2 tag:"
            r7.append(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.config(r7)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p417j.C9060c.m48344q(java.io.File, int, int):void");
    }

    /* renamed from: c */
    public void mo31266c() throws C9017c {
        try {
            mo31579r();
        } catch (IOException e) {
            throw new C9017c((Throwable) e);
        } catch (C9131k e2) {
            throw new C9017c((Throwable) e2);
        }
    }

    /* renamed from: d */
    public C9130j mo31267d() {
        if (C9134n.m48562h().mo31735d() == C9291b.ID3_V24) {
            return new C9193h0();
        }
        if (C9134n.m48562h().mo31735d() == C9291b.ID3_V23) {
            return new C9179c0();
        }
        if (C9134n.m48562h().mo31735d() == C9291b.ID3_V22) {
            return new C9251x();
        }
        return new C9193h0();
    }

    /* renamed from: j */
    public C9130j mo31272j() {
        C9180d m = mo31577m();
        return m == null ? mo31267d() : m;
    }

    /* renamed from: k */
    public void mo31273k(C9130j jVar) {
        this.f35330c = jVar;
        if (jVar instanceof C9244r) {
            mo31581t((C9244r) jVar);
        } else {
            mo31582u((C9180d) jVar);
        }
    }

    /* renamed from: m */
    public C9180d mo31577m() {
        return this.f35554e;
    }

    /* renamed from: o */
    public void mo31578o(File file) throws IOException {
        if (!file.exists()) {
            Logger logger = C8942a.f35327d;
            C9118b bVar = C9118b.GENERAL_WRITE_FAILED_BECAUSE_FILE_NOT_FOUND;
            logger.severe(bVar.getMsg(file.getName()));
            throw new IOException(bVar.getMsg(file.getName()));
        } else if (!file.canWrite()) {
            Logger logger2 = C8942a.f35327d;
            C9118b bVar2 = C9118b.GENERAL_WRITE_FAILED;
            logger2.severe(bVar2.getMsg(file.getName()));
            throw new IOException(bVar2.getMsg(file.getName()));
        } else if (file.length() <= 150) {
            Logger logger3 = C8942a.f35327d;
            C9118b bVar3 = C9118b.GENERAL_WRITE_FAILED_BECAUSE_FILE_IS_TOO_SMALL;
            logger3.severe(bVar3.getMsg(file.getName()));
            throw new IOException(bVar3.getMsg(file.getName()));
        }
    }

    /* renamed from: r */
    public void mo31579r() throws IOException, C9131k {
        mo31580s(this.f35328a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0168  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31580s(java.io.File r13) throws java.io.IOException {
        /*
            r12 = this;
            java.io.File r13 = r13.getAbsoluteFile()
            java.util.logging.Logger r0 = p402l.p406b.p407a.C8942a.f35327d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Saving  : "
            r1.append(r2)
            java.lang.String r2 = r13.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.config(r1)
            r12.mo31578o(r13)
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            l.b.c.n r4 = p402l.p406b.p426c.C9134n.m48562h()     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            boolean r4 = r4.mo31751v()     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            java.lang.String r5 = "rw"
            if (r4 == 0) goto L_0x00b8
            l.b.c.t.d r4 = r12.f35554e     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            if (r4 != 0) goto L_0x0071
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            r4.<init>(r13, r5)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            l.b.c.t.h0 r3 = new l.b.c.t.h0     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.mo31903w(r4)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            l.b.c.t.c0 r3 = new l.b.c.t.c0     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.mo31903w(r4)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            l.b.c.t.x r3 = new l.b.c.t.x     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.mo31903w(r4)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            java.util.logging.Logger r3 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            java.lang.String r7 = "Deleting ID3v2 tag:"
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            java.lang.String r7 = r13.getName()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            java.lang.String r6 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.config(r6)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3 = r4
            goto L_0x00b8
        L_0x0071:
            java.util.logging.Logger r4 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            java.lang.String r7 = "Writing ID3v2 tag:"
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            java.lang.String r7 = r13.getName()     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            java.lang.String r6 = r6.toString()     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            r4.config(r6)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            l.b.a.c r4 = r12.mo31268e()     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            l.b.a.j.b r4 = (p402l.p406b.p407a.p417j.C9059b) r4     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            long r6 = r4.mo31563a()     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            l.b.c.t.d r8 = r12.f35554e     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            long r8 = r8.mo31882P(r13, r6)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x00b8
            java.util.logging.Logger r6 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            java.lang.String r10 = "New mp3 start byte: "
            r7.append(r10)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            r6.config(r7)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            r4.mo31572l(r8)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
        L_0x00b8:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            r4.<init>(r13, r5)     // Catch:{ FileNotFoundException -> 0x014f, IOException -> 0x012c, RuntimeException -> 0x010c }
            l.b.c.n r3 = p402l.p406b.p426c.C9134n.m48562h()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            boolean r3 = r3.mo31752w()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            if (r3 == 0) goto L_0x00ce
            l.b.c.u.a r3 = r12.f35555f     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            if (r3 == 0) goto L_0x00ce
            r3.mo31917j(r4)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
        L_0x00ce:
            l.b.c.n r3 = p402l.p406b.p426c.C9134n.m48562h()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            boolean r3 = r3.mo31744o()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            if (r3 == 0) goto L_0x00ff
            java.util.logging.Logger r3 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            java.lang.String r5 = "Processing ID3v1"
            r3.config(r5)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            l.b.c.t.r r3 = r12.f35556g     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            if (r3 != 0) goto L_0x00f3
            java.util.logging.Logger r3 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            java.lang.String r5 = "Deleting ID3v1"
            r3.config(r5)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            l.b.c.t.r r3 = new l.b.c.t.r     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.mo31852o(r4)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            goto L_0x00ff
        L_0x00f3:
            java.util.logging.Logger r3 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            java.lang.String r5 = "Saving ID3v1"
            r3.config(r5)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            l.b.c.t.r r3 = r12.f35556g     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
            r3.mo31917j(r4)     // Catch:{ FileNotFoundException -> 0x0107, IOException -> 0x0105, RuntimeException -> 0x0103 }
        L_0x00ff:
            r4.close()
            return
        L_0x0103:
            r3 = move-exception
            goto L_0x0110
        L_0x0105:
            r3 = move-exception
            goto L_0x0130
        L_0x0107:
            r0 = move-exception
            r3 = r4
            goto L_0x0150
        L_0x010a:
            r13 = move-exception
            goto L_0x0166
        L_0x010c:
            r4 = move-exception
            r11 = r4
            r4 = r3
            r3 = r11
        L_0x0110:
            java.util.logging.Logger r5 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ all -> 0x014c }
            java.util.logging.Level r6 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x014c }
            l.b.b.b r7 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_BECAUSE     // Catch:{ all -> 0x014c }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x014c }
            java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x014c }
            r0[r1] = r13     // Catch:{ all -> 0x014c }
            java.lang.String r13 = r3.getMessage()     // Catch:{ all -> 0x014c }
            r0[r2] = r13     // Catch:{ all -> 0x014c }
            java.lang.String r13 = r7.getMsg(r0)     // Catch:{ all -> 0x014c }
            r5.log(r6, r13, r3)     // Catch:{ all -> 0x014c }
            throw r3     // Catch:{ all -> 0x014c }
        L_0x012c:
            r4 = move-exception
            r11 = r4
            r4 = r3
            r3 = r11
        L_0x0130:
            java.util.logging.Logger r5 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ all -> 0x014c }
            java.util.logging.Level r6 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x014c }
            l.b.b.b r7 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_BECAUSE     // Catch:{ all -> 0x014c }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x014c }
            java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x014c }
            r0[r1] = r13     // Catch:{ all -> 0x014c }
            java.lang.String r13 = r3.getMessage()     // Catch:{ all -> 0x014c }
            r0[r2] = r13     // Catch:{ all -> 0x014c }
            java.lang.String r13 = r7.getMsg(r0)     // Catch:{ all -> 0x014c }
            r5.log(r6, r13, r3)     // Catch:{ all -> 0x014c }
            throw r3     // Catch:{ all -> 0x014c }
        L_0x014c:
            r13 = move-exception
            r3 = r4
            goto L_0x0166
        L_0x014f:
            r0 = move-exception
        L_0x0150:
            java.util.logging.Logger r4 = p402l.p406b.p407a.C8942a.f35327d     // Catch:{ all -> 0x010a }
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x010a }
            l.b.b.b r6 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_BECAUSE_FILE_NOT_FOUND     // Catch:{ all -> 0x010a }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x010a }
            java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x010a }
            r2[r1] = r13     // Catch:{ all -> 0x010a }
            java.lang.String r13 = r6.getMsg(r2)     // Catch:{ all -> 0x010a }
            r4.log(r5, r13, r0)     // Catch:{ all -> 0x010a }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x0166:
            if (r3 == 0) goto L_0x016b
            r3.close()
        L_0x016b:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p417j.C9060c.mo31580s(java.io.File):void");
    }

    /* renamed from: t */
    public void mo31581t(C9244r rVar) {
        C8942a.f35327d.config("setting tagv1:v1 tag");
        this.f35556g = rVar;
    }

    /* renamed from: u */
    public void mo31582u(C9180d dVar) {
        this.f35554e = dVar;
        if (dVar instanceof C9193h0) {
            C9193h0 h0Var = (C9193h0) dVar;
        } else {
            new C9193h0(dVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [l.b.c.t.d, java.io.RandomAccessFile, l.b.c.u.a, l.b.c.t.r] */
    public C9060c(File file, int i, boolean z) throws IOException, C9131k, C9022h, C9018d {
        RandomAccessFile randomAccessFile = 0;
        this.f35554e = randomAccessFile;
        this.f35555f = randomAccessFile;
        this.f35556g = randomAccessFile;
        try {
            this.f35328a = file;
            randomAccessFile = mo31265b(file, z);
            long F = C9180d.m48787F(file);
            Logger logger = C8942a.f35327d;
            logger.config("TagHeaderSize:" + C9120d.m48554b(F));
            C9059b bVar = new C9059b(file, F);
            this.f35329b = bVar;
            if (F != bVar.mo31563a()) {
                Logger logger2 = C8942a.f35327d;
                logger2.config("First header found after tag:" + this.f35329b);
                this.f35329b = m48341l(F, (C9059b) this.f35329b);
            }
            m48343p(file, randomAccessFile, i);
            m48344q(file, i, (int) ((C9059b) this.f35329b).mo31563a());
            if (mo31577m() != null) {
                this.f35330c = mo31577m();
            } else {
                C9244r rVar = this.f35556g;
                if (rVar != null) {
                    this.f35330c = rVar;
                }
            }
        } finally {
            if (randomAccessFile != 0) {
                randomAccessFile.close();
            }
        }
    }
}
