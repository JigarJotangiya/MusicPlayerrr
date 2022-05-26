package p402l.p406b.p407a.p417j;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import p402l.p406b.p407a.C8944c;
import p402l.p406b.p407a.p413g.C9018d;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p425b.C9120d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.j.b */
/* compiled from: MP3AudioHeader */
public class C9059b implements C8944c {

    /* renamed from: l */
    private static final SimpleDateFormat f35539l = new SimpleDateFormat("ss", Locale.UK);

    /* renamed from: m */
    private static final SimpleDateFormat f35540m = new SimpleDateFormat("mm:ss", Locale.UK);

    /* renamed from: n */
    private static final SimpleDateFormat f35541n = new SimpleDateFormat("kk:mm:ss", Locale.UK);

    /* renamed from: o */
    public static Logger f35542o = Logger.getLogger("org.jaudiotagger.audio.mp3");

    /* renamed from: a */
    protected C9063f f35543a;

    /* renamed from: b */
    protected C9065h f35544b;

    /* renamed from: c */
    protected C9064g f35545c;

    /* renamed from: d */
    private long f35546d;

    /* renamed from: e */
    private long f35547e;

    /* renamed from: f */
    private double f35548f;

    /* renamed from: g */
    private double f35549g;

    /* renamed from: h */
    private long f35550h;

    /* renamed from: i */
    private long f35551i;

    /* renamed from: j */
    private long f35552j;

    /* renamed from: k */
    private String f35553k = BuildConfig.FLAVOR;

    public C9059b() {
    }

    /* renamed from: d */
    private double m48326d() {
        return this.f35548f;
    }

    /* renamed from: g */
    private boolean m48327g(File file, long j, ByteBuffer byteBuffer, FileChannel fileChannel) throws IOException {
        if (f35542o.isLoggable(Level.FINEST)) {
            Logger logger = f35542o;
            logger.finer("Checking next frame" + file.getName() + ":fpc:" + j + "skipping to:" + (((long) this.f35543a.mo31586d()) + j));
        }
        int position = byteBuffer.position();
        boolean z = false;
        if (this.f35543a.mo31586d() > 4804) {
            Logger logger2 = f35542o;
            logger2.finer("Frame size is too large to be a frame:" + this.f35543a.mo31586d());
            return false;
        }
        if (byteBuffer.remaining() <= this.f35543a.mo31586d() + 196) {
            Logger logger3 = f35542o;
            logger3.finer("Buffer too small, need to reload, buffer size:" + byteBuffer.remaining());
            byteBuffer.clear();
            fileChannel.position(j);
            fileChannel.read(byteBuffer, fileChannel.position());
            byteBuffer.flip();
            if (byteBuffer.limit() <= 196) {
                f35542o.finer("Nearly at end of file, no header found:");
                return false;
            } else if (byteBuffer.limit() <= this.f35543a.mo31586d() + 196) {
                f35542o.finer("Nearly at end of file, no room for next frame, no header found:");
                return false;
            } else {
                position = 0;
            }
        }
        byteBuffer.position(byteBuffer.position() + this.f35543a.mo31586d());
        if (C9063f.m48362l(byteBuffer)) {
            try {
                C9063f.m48363o(byteBuffer);
                f35542o.finer("Check next frame confirms is an audio header ");
                z = true;
            } catch (C9018d unused) {
                f35542o.finer("Check next frame has identified this is not an audio header");
            }
        } else {
            f35542o.finer("isMPEGFrame has identified this is not an audio header");
        }
        byteBuffer.position(position);
        return z;
    }

    /* renamed from: a */
    public long mo31563a() {
        return this.f35547e;
    }

    /* renamed from: b */
    public long mo31564b() {
        return this.f35550h;
    }

    /* renamed from: c */
    public double mo31565c() {
        return this.f35549g;
    }

    /* renamed from: e */
    public int mo31566e() {
        return (int) mo31565c();
    }

    /* renamed from: f */
    public String mo31567f() {
        Date parse;
        String format;
        String format2;
        try {
            long e = (long) mo31566e();
            SimpleDateFormat simpleDateFormat = f35539l;
            synchronized (simpleDateFormat) {
                parse = simpleDateFormat.parse(String.valueOf(e));
            }
            if (e < 3600) {
                SimpleDateFormat simpleDateFormat2 = f35540m;
                synchronized (simpleDateFormat2) {
                    format2 = simpleDateFormat2.format(parse);
                }
                return format2;
            }
            SimpleDateFormat simpleDateFormat3 = f35541n;
            synchronized (simpleDateFormat3) {
                format = simpleDateFormat3.format(parse);
            }
            return format;
        } catch (ParseException e2) {
            Logger logger = f35542o;
            logger.warning("Unable to parse:" + mo31565c() + " failed with ParseException:" + e2.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        if (r7 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e4, code lost:
        if (r7 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ef, code lost:
        if (f35542o.isLoggable(java.util.logging.Level.FINEST) == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f1, code lost:
        r0 = f35542o;
        r0.finer("Return found matching mp3 header starting at" + r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0107, code lost:
        mo31571k(r12.length());
        mo31572l(r13);
        mo31574n();
        mo31573m();
        mo31575o();
        mo31569i();
        mo31570j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0120, code lost:
        return r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b6 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x00a1=Splitter:B:33:0x00a1, B:25:0x0083=Splitter:B:25:0x0083} */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31568h(java.io.File r12, long r13) throws java.io.IOException {
        /*
            r11 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r12)
            java.nio.channels.FileChannel r7 = r0.getChannel()
            r1 = 5000(0x1388, float:7.006E-42)
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r1)
            r7.position(r13)
            r7.read(r8, r13)
            r8.flip()
            r9 = 0
            r1 = 0
        L_0x001a:
            int r2 = r8.remaining()     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            r3 = 196(0xc4, float:2.75E-43)
            if (r2 > r3) goto L_0x0041
            r8.clear()     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            r7.position(r13)     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            long r4 = r7.position()     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            r7.read(r8, r4)     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            r8.flip()     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            int r2 = r8.limit()     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            if (r2 > r3) goto L_0x0041
            if (r7 == 0) goto L_0x003d
            r7.close()
        L_0x003d:
            r0.close()
            return r9
        L_0x0041:
            boolean r2 = p402l.p406b.p407a.p417j.C9063f.m48362l(r8)     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            r10 = 1
            if (r2 == 0) goto L_0x00b6
            java.util.logging.Logger r2 = f35542o     // Catch:{ d -> 0x00b6 }
            java.util.logging.Level r3 = java.util.logging.Level.FINEST     // Catch:{ d -> 0x00b6 }
            boolean r2 = r2.isLoggable(r3)     // Catch:{ d -> 0x00b6 }
            if (r2 == 0) goto L_0x0068
            java.util.logging.Logger r2 = f35542o     // Catch:{ d -> 0x00b6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ d -> 0x00b6 }
            r4.<init>()     // Catch:{ d -> 0x00b6 }
            java.lang.String r5 = "Found Possible header at:"
            r4.append(r5)     // Catch:{ d -> 0x00b6 }
            r4.append(r13)     // Catch:{ d -> 0x00b6 }
            java.lang.String r4 = r4.toString()     // Catch:{ d -> 0x00b6 }
            r2.finest(r4)     // Catch:{ d -> 0x00b6 }
        L_0x0068:
            l.b.a.j.f r2 = p402l.p406b.p407a.p417j.C9063f.m48363o(r8)     // Catch:{ d -> 0x00b6 }
            r11.f35543a = r2     // Catch:{ d -> 0x00b6 }
            java.nio.ByteBuffer r1 = p402l.p406b.p407a.p417j.C9065h.m48395g(r8, r2)     // Catch:{ d -> 0x00b5 }
            if (r1 == 0) goto L_0x008a
            java.util.logging.Logger r2 = f35542o     // Catch:{ d -> 0x00b5 }
            boolean r2 = r2.isLoggable(r3)     // Catch:{ d -> 0x00b5 }
            if (r2 == 0) goto L_0x0083
            java.util.logging.Logger r2 = f35542o     // Catch:{ d -> 0x00b5 }
            java.lang.String r3 = "Found Possible XingHeader"
            r2.finest(r3)     // Catch:{ d -> 0x00b5 }
        L_0x0083:
            l.b.a.j.h r1 = p402l.p406b.p407a.p417j.C9065h.m48396h(r1)     // Catch:{ d -> 0x00a7 }
            r11.f35544b = r1     // Catch:{ d -> 0x00a7 }
            goto L_0x00a7
        L_0x008a:
            l.b.a.j.f r1 = r11.f35543a     // Catch:{ d -> 0x00b5 }
            java.nio.ByteBuffer r1 = p402l.p406b.p407a.p417j.C9064g.m48388d(r8, r1)     // Catch:{ d -> 0x00b5 }
            if (r1 == 0) goto L_0x00a9
            java.util.logging.Logger r2 = f35542o     // Catch:{ d -> 0x00b5 }
            boolean r2 = r2.isLoggable(r3)     // Catch:{ d -> 0x00b5 }
            if (r2 == 0) goto L_0x00a1
            java.util.logging.Logger r2 = f35542o     // Catch:{ d -> 0x00b5 }
            java.lang.String r3 = "Found Possible VbriHeader"
            r2.finest(r3)     // Catch:{ d -> 0x00b5 }
        L_0x00a1:
            l.b.a.j.g r1 = p402l.p406b.p407a.p417j.C9064g.m48389e(r1)     // Catch:{ d -> 0x00a7 }
            r11.f35545c = r1     // Catch:{ d -> 0x00a7 }
        L_0x00a7:
            r9 = 1
            goto L_0x00c4
        L_0x00a9:
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r8
            r6 = r7
            boolean r1 = r1.m48327g(r2, r3, r5, r6)     // Catch:{ d -> 0x00b5 }
            if (r1 == 0) goto L_0x00b6
            goto L_0x00c3
        L_0x00b5:
            r1 = 1
        L_0x00b6:
            int r2 = r8.position()     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            int r2 = r2 + r10
            r8.position(r2)     // Catch:{ EOFException -> 0x00da, IOException -> 0x00cf }
            r2 = 1
            long r13 = r13 + r2
            if (r1 == 0) goto L_0x001a
        L_0x00c3:
            r9 = r1
        L_0x00c4:
            if (r7 == 0) goto L_0x00c9
        L_0x00c6:
            r7.close()
        L_0x00c9:
            r0.close()
            goto L_0x00e7
        L_0x00cd:
            r12 = move-exception
            goto L_0x0121
        L_0x00cf:
            r12 = move-exception
            java.util.logging.Logger r13 = f35542o     // Catch:{ all -> 0x00cd }
            java.util.logging.Level r14 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "IOException occurred whilst trying to find sync"
            r13.log(r14, r1, r12)     // Catch:{ all -> 0x00cd }
            throw r12     // Catch:{ all -> 0x00cd }
        L_0x00da:
            r1 = move-exception
            java.util.logging.Logger r2 = f35542o     // Catch:{ all -> 0x00cd }
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x00cd }
            java.lang.String r4 = "Reached end of file without finding sync match"
            r2.log(r3, r4, r1)     // Catch:{ all -> 0x00cd }
            if (r7 == 0) goto L_0x00c9
            goto L_0x00c6
        L_0x00e7:
            java.util.logging.Logger r0 = f35542o
            java.util.logging.Level r1 = java.util.logging.Level.FINEST
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L_0x0107
            java.util.logging.Logger r0 = f35542o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Return found matching mp3 header starting at"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.finer(r1)
        L_0x0107:
            long r0 = r12.length()
            r11.mo31571k(r0)
            r11.mo31572l(r13)
            r11.mo31574n()
            r11.mo31573m()
            r11.mo31575o()
            r11.mo31569i()
            r11.mo31570j()
            return r9
        L_0x0121:
            if (r7 == 0) goto L_0x0126
            r7.close()
        L_0x0126:
            r0.close()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p417j.C9059b.mo31568h(java.io.File, long):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo31569i() {
        C9065h hVar = this.f35544b;
        if (hVar == null || !hVar.mo31606f()) {
            C9064g gVar = this.f35545c;
            if (gVar == null) {
                this.f35552j = (long) this.f35543a.mo31583a().intValue();
            } else if (gVar.mo31597a() > 0) {
                this.f35552j = (long) (((double) (this.f35545c.mo31597a() * 8)) / ((this.f35548f * ((double) mo31564b())) * 1000.0d));
            } else {
                this.f35552j = (long) (((double) ((this.f35546d - this.f35547e) * 8)) / ((this.f35548f * ((double) mo31564b())) * 1000.0d));
            }
        } else if (!this.f35544b.mo31604d() || this.f35544b.mo31601a() <= 0) {
            this.f35552j = (long) (((double) ((this.f35546d - this.f35547e) * 8)) / ((this.f35548f * ((double) mo31564b())) * 1000.0d));
        } else {
            this.f35552j = (long) (((double) (this.f35544b.mo31601a() * 8)) / ((this.f35548f * ((double) mo31564b())) * 1000.0d));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo31570j() {
        C9065h hVar = this.f35544b;
        if (hVar == null) {
            C9064g gVar = this.f35545c;
            if (gVar != null) {
                this.f35553k = gVar.mo31598b();
            }
        } else if (hVar.mo31603c() != null) {
            this.f35553k = this.f35544b.mo31603c().mo31562a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo31571k(long j) {
        this.f35546d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo31572l(long j) {
        this.f35547e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo31573m() {
        this.f35551i = (this.f35546d - this.f35547e) / ((long) this.f35543a.mo31586d());
        C9065h hVar = this.f35544b;
        if (hVar == null || !hVar.mo31605e()) {
            C9064g gVar = this.f35545c;
            if (gVar != null) {
                this.f35550h = (long) gVar.mo31599c();
            } else {
                this.f35550h = this.f35551i;
            }
        } else {
            this.f35550h = (long) this.f35544b.mo31602b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo31574n() {
        this.f35548f = ((double) this.f35543a.mo31589g()) / this.f35543a.mo31592j().doubleValue();
        if (this.f35543a.mo31593k() != 2 && this.f35543a.mo31593k() != 0) {
            return;
        }
        if ((this.f35543a.mo31587e() == 2 || this.f35543a.mo31587e() == 1) && this.f35543a.mo31590h() == 1) {
            this.f35548f /= 2.0d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo31575o() {
        this.f35549g = ((double) this.f35550h) * m48326d();
    }

    public String toString() {
        String str;
        String str2;
        String str3 = "fileSize:" + this.f35546d + " encoder:" + this.f35553k + " startByte:" + C9120d.m48554b(this.f35547e) + " numberOfFrames:" + this.f35550h + " numberOfFramesEst:" + this.f35551i + " timePerFrame:" + this.f35548f + " bitrate:" + this.f35552j + " trackLength:" + mo31567f();
        if (this.f35543a != null) {
            str = str3 + this.f35543a.toString();
        } else {
            str = str3 + " mpegframeheader:false";
        }
        if (this.f35544b != null) {
            str2 = str + this.f35544b.toString();
        } else {
            str2 = str + " mp3XingFrame:false";
        }
        if (this.f35545c != null) {
            return str2 + this.f35545c.toString();
        }
        return str2 + " mp3VbriFrame:false";
    }

    public C9059b(File file, long j) throws IOException, C9018d {
        if (!mo31568h(file, j)) {
            throw new C9018d(C9118b.NO_AUDIO_HEADER_FOUND.getMsg(file.getName()));
        }
    }
}
