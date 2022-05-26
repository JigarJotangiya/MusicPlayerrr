package p402l.p406b.p407a.p418k;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p407a.p418k.p419j.C9090m;
import p402l.p406b.p441d.p442b.C9301a;
import p402l.p406b.p441d.p442b.C9309b;

/* renamed from: l.b.a.k.c */
/* compiled from: Mp4AtomTree */
public class C9068c {

    /* renamed from: p */
    public static Logger f35605p = Logger.getLogger("org.jaudiotagger.audio.mp4");

    /* renamed from: a */
    private C9301a f35606a;

    /* renamed from: b */
    private C9309b f35607b;

    /* renamed from: c */
    private C9301a f35608c;

    /* renamed from: d */
    private C9301a f35609d;

    /* renamed from: e */
    private C9301a f35610e;

    /* renamed from: f */
    private C9301a f35611f;

    /* renamed from: g */
    private C9301a f35612g;

    /* renamed from: h */
    private C9301a f35613h;

    /* renamed from: i */
    private C9301a f35614i;

    /* renamed from: j */
    private List<C9301a> f35615j = new ArrayList();

    /* renamed from: k */
    private List<C9301a> f35616k = new ArrayList();

    /* renamed from: l */
    private List<C9301a> f35617l = new ArrayList();

    /* renamed from: m */
    private C9090m f35618m;

    /* renamed from: n */
    private ByteBuffer f35619n;

    /* renamed from: o */
    private C9077c f35620o;

    public C9068c(RandomAccessFile randomAccessFile, boolean z) throws IOException, C9015a {
        mo31612b(randomAccessFile, z);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r11.position(r11.position() - 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r11.position(r11.position() - 8);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0033 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31611a(java.nio.ByteBuffer r11, p402l.p406b.p441d.p442b.C9301a r12) throws java.io.IOException, p402l.p406b.p407a.p413g.C9015a {
        /*
            r10 = this;
            java.lang.Object r0 = r12.getUserObject()
            l.b.a.k.j.c r0 = (p402l.p406b.p407a.p418k.p419j.C9077c) r0
            int r1 = r11.position()
            java.lang.String r2 = r0.mo31643e()
            l.b.a.k.b r3 = p402l.p406b.p407a.p418k.C9067b.META
            java.lang.String r3 = r3.getFieldName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0047
            l.b.a.k.j.j r2 = new l.b.a.k.j.j
            r2.<init>(r0, r11)
            r2.mo31665d()
            l.b.a.k.j.c r2 = new l.b.a.k.j.c     // Catch:{ g -> 0x0033 }
            r2.<init>((java.nio.ByteBuffer) r11)     // Catch:{ g -> 0x0033 }
        L_0x0027:
            int r2 = r11.position()
            int r2 = r2 + -8
            r11.position(r2)
            goto L_0x0047
        L_0x0031:
            r12 = move-exception
            goto L_0x003d
        L_0x0033:
            int r2 = r11.position()     // Catch:{ all -> 0x0031 }
            int r2 = r2 + -4
            r11.position(r2)     // Catch:{ all -> 0x0031 }
            goto L_0x0027
        L_0x003d:
            int r0 = r11.position()
            int r0 = r0 + -8
            r11.position(r0)
            throw r12
        L_0x0047:
            int r2 = r11.position()
        L_0x004b:
            int r3 = r11.position()
            int r4 = r0.mo31639a()
            int r4 = r4 + r2
            int r4 = r4 + -8
            if (r3 >= r4) goto L_0x0239
            l.b.a.k.j.c r3 = new l.b.a.k.j.c
            r3.<init>((java.nio.ByteBuffer) r11)
            l.b.a.k.j.c r4 = r10.f35620o
            long r4 = r4.mo31641c()
            int r6 = r11.position()
            long r6 = (long) r6
            long r4 = r4 + r6
            r3.mo31645i(r4)
            java.util.logging.Logger r4 = f35605p
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Atom "
            r5.append(r6)
            java.lang.String r6 = r3.mo31643e()
            r5.append(r6)
            java.lang.String r6 = " @ "
            r5.append(r6)
            long r6 = r3.mo31641c()
            r5.append(r6)
            java.lang.String r6 = " of size:"
            r5.append(r6)
            int r6 = r3.mo31644f()
            r5.append(r6)
            java.lang.String r6 = " ,ends @ "
            r5.append(r6)
            long r6 = r3.mo31641c()
            int r8 = r3.mo31644f()
            long r8 = (long) r8
            long r6 = r6 + r8
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.finest(r5)
            l.b.d.b.a r4 = new l.b.d.b.a
            r4.<init>(r3)
            r12.add(r4)
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r6 = p402l.p406b.p407a.p418k.C9067b.UDTA
            java.lang.String r7 = r6.getFieldName()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00cc
            r10.f35613h = r4
            goto L_0x01ba
        L_0x00cc:
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r7 = p402l.p406b.p407a.p418k.C9067b.META
            java.lang.String r8 = r7.getFieldName()
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x00ee
            java.lang.String r5 = r0.mo31643e()
            java.lang.String r8 = r6.getFieldName()
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x00ee
            r10.f35611f = r4
            goto L_0x01ba
        L_0x00ee:
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r8 = p402l.p406b.p407a.p418k.C9067b.HDLR
            java.lang.String r9 = r8.getFieldName()
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0110
            java.lang.String r5 = r0.mo31643e()
            java.lang.String r9 = r7.getFieldName()
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0110
            r10.f35614i = r4
            goto L_0x01ba
        L_0x0110:
            java.lang.String r5 = r3.mo31643e()
            java.lang.String r8 = r8.getFieldName()
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0120
            goto L_0x01ba
        L_0x0120:
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r8 = p402l.p406b.p407a.p418k.C9067b.TAGS
            java.lang.String r8 = r8.getFieldName()
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0134
            r10.f35612g = r4
            goto L_0x01ba
        L_0x0134:
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r8 = p402l.p406b.p407a.p418k.C9067b.STCO
            java.lang.String r8 = r8.getFieldName()
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0150
            l.b.a.k.j.m r5 = r10.f35618m
            if (r5 != 0) goto L_0x01ba
            l.b.a.k.j.m r5 = new l.b.a.k.j.m
            r5.<init>(r3, r11)
            r10.f35618m = r5
            goto L_0x01ba
        L_0x0150:
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r8 = p402l.p406b.p407a.p418k.C9067b.ILST
            java.lang.String r8 = r8.getFieldName()
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x018f
            l.b.d.b.g r5 = r12.getParent()
            l.b.d.b.a r5 = (p402l.p406b.p441d.p442b.C9301a) r5
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = r5.getUserObject()
            l.b.a.k.j.c r5 = (p402l.p406b.p407a.p418k.p419j.C9077c) r5
            if (r5 == 0) goto L_0x01ba
            java.lang.String r8 = r0.mo31643e()
            java.lang.String r7 = r7.getFieldName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x01ba
            java.lang.String r5 = r5.mo31643e()
            java.lang.String r7 = r6.getFieldName()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x01ba
            r10.f35610e = r4
            goto L_0x01ba
        L_0x018f:
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r7 = p402l.p406b.p407a.p418k.C9067b.FREE
            java.lang.String r7 = r7.getFieldName()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x01a5
            java.util.List<l.b.d.b.a> r5 = r10.f35615j
            r5.add(r4)
            goto L_0x01ba
        L_0x01a5:
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r7 = p402l.p406b.p407a.p418k.C9067b.TRAK
            java.lang.String r7 = r7.getFieldName()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x01ba
            java.util.List<l.b.d.b.a> r5 = r10.f35617l
            r5.add(r4)
        L_0x01ba:
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r7 = p402l.p406b.p407a.p418k.C9067b.TRAK
            java.lang.String r7 = r7.getFieldName()
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0228
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r7 = p402l.p406b.p407a.p418k.C9067b.MDIA
            java.lang.String r7 = r7.getFieldName()
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0228
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r7 = p402l.p406b.p407a.p418k.C9067b.MINF
            java.lang.String r7 = r7.getFieldName()
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0228
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r7 = p402l.p406b.p407a.p418k.C9067b.STBL
            java.lang.String r7 = r7.getFieldName()
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0228
            java.lang.String r5 = r3.mo31643e()
            java.lang.String r6 = r6.getFieldName()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0228
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r6 = p402l.p406b.p407a.p418k.C9067b.META
            java.lang.String r6 = r6.getFieldName()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0228
            java.lang.String r5 = r3.mo31643e()
            l.b.a.k.b r6 = p402l.p406b.p407a.p418k.C9067b.ILST
            java.lang.String r6 = r6.getFieldName()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x022b
        L_0x0228:
            r10.mo31611a(r11, r4)
        L_0x022b:
            int r4 = r11.position()
            int r3 = r3.mo31639a()
            int r4 = r4 + r3
            r11.position(r4)
            goto L_0x004b
        L_0x0239:
            r11.position(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p418k.C9068c.mo31611a(java.nio.ByteBuffer, l.b.d.b.a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0180  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p402l.p406b.p441d.p442b.C9309b mo31612b(java.io.RandomAccessFile r10, boolean r11) throws java.io.IOException, p402l.p406b.p407a.p413g.C9015a {
        /*
            r9 = this;
            java.nio.channels.FileChannel r10 = r10.getChannel()     // Catch:{ all -> 0x0174 }
            r0 = 0
            r10.position(r0)     // Catch:{ all -> 0x0172 }
            l.b.d.b.a r0 = new l.b.d.b.a     // Catch:{ all -> 0x0172 }
            r0.<init>()     // Catch:{ all -> 0x0172 }
            r9.f35606a = r0     // Catch:{ all -> 0x0172 }
            l.b.d.b.b r1 = new l.b.d.b.b     // Catch:{ all -> 0x0172 }
            r1.<init>(r0)     // Catch:{ all -> 0x0172 }
            r9.f35607b = r1     // Catch:{ all -> 0x0172 }
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0172 }
        L_0x001d:
            long r1 = r10.position()     // Catch:{ all -> 0x0172 }
            long r3 = r10.size()     // Catch:{ all -> 0x0172 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x015a
            l.b.a.k.j.c r1 = new l.b.a.k.j.c     // Catch:{ all -> 0x0172 }
            r1.<init>()     // Catch:{ all -> 0x0172 }
            r0.clear()     // Catch:{ all -> 0x0172 }
            r10.read(r0)     // Catch:{ all -> 0x0172 }
            r0.rewind()     // Catch:{ all -> 0x0172 }
            r2 = 8
            r4 = 1
            r5 = 0
            r1.mo31647k(r0)     // Catch:{ g -> 0x0117 }
            long r6 = r10.position()     // Catch:{ all -> 0x0172 }
            long r6 = r6 - r2
            r1.mo31645i(r6)     // Catch:{ all -> 0x0172 }
            l.b.d.b.a r6 = new l.b.d.b.a     // Catch:{ all -> 0x0172 }
            r6.<init>(r1)     // Catch:{ all -> 0x0172 }
            java.lang.String r7 = r1.mo31643e()     // Catch:{ all -> 0x0172 }
            l.b.a.k.b r8 = p402l.p406b.p407a.p418k.C9067b.MOOV     // Catch:{ all -> 0x0172 }
            java.lang.String r8 = r8.getFieldName()     // Catch:{ all -> 0x0172 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0172 }
            if (r7 == 0) goto L_0x00d6
            l.b.d.b.a r7 = r9.f35608c     // Catch:{ all -> 0x0172 }
            if (r7 == 0) goto L_0x0061
            r7 = 1
            goto L_0x0062
        L_0x0061:
            r7 = 0
        L_0x0062:
            l.b.d.b.a r8 = r9.f35609d     // Catch:{ all -> 0x0172 }
            if (r8 == 0) goto L_0x0068
            r8 = 1
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0086
            java.util.logging.Logger r0 = f35605p     // Catch:{ all -> 0x0172 }
            l.b.b.b r1 = p402l.p406b.p425b.C9118b.ADDITIONAL_MOOV_ATOM_AT_END_OF_MP4     // Catch:{ all -> 0x0172 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0172 }
            long r6 = r10.position()     // Catch:{ all -> 0x0172 }
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0172 }
            r4[r5] = r2     // Catch:{ all -> 0x0172 }
            java.lang.String r1 = r1.getMsg(r4)     // Catch:{ all -> 0x0172 }
            r0.warning(r1)     // Catch:{ all -> 0x0172 }
            goto L_0x015a
        L_0x0086:
            r9.f35608c = r6     // Catch:{ all -> 0x0172 }
            r9.f35620o = r1     // Catch:{ all -> 0x0172 }
            long r2 = r10.position()     // Catch:{ all -> 0x0172 }
            int r7 = r1.mo31639a()     // Catch:{ all -> 0x0172 }
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)     // Catch:{ all -> 0x0172 }
            r9.f35619n = r7     // Catch:{ all -> 0x0172 }
            int r7 = r10.read(r7)     // Catch:{ all -> 0x0172 }
            int r8 = r1.mo31639a()     // Catch:{ all -> 0x0172 }
            if (r7 < r8) goto L_0x00b0
            java.nio.ByteBuffer r4 = r9.f35619n     // Catch:{ all -> 0x0172 }
            r4.rewind()     // Catch:{ all -> 0x0172 }
            java.nio.ByteBuffer r4 = r9.f35619n     // Catch:{ all -> 0x0172 }
            r9.mo31611a(r4, r6)     // Catch:{ all -> 0x0172 }
            r10.position(r2)     // Catch:{ all -> 0x0172 }
            goto L_0x0103
        L_0x00b0:
            l.b.b.b r0 = p402l.p406b.p425b.C9118b.ATOM_LENGTH_LARGER_THAN_DATA     // Catch:{ all -> 0x0172 }
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0172 }
            java.lang.String r3 = r1.mo31643e()     // Catch:{ all -> 0x0172 }
            r2[r5] = r3     // Catch:{ all -> 0x0172 }
            int r1 = r1.mo31639a()     // Catch:{ all -> 0x0172 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0172 }
            r2[r4] = r1     // Catch:{ all -> 0x0172 }
            r1 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0172 }
            r2[r1] = r3     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = r0.getMsg(r2)     // Catch:{ all -> 0x0172 }
            l.b.a.g.a r1 = new l.b.a.g.a     // Catch:{ all -> 0x0172 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            throw r1     // Catch:{ all -> 0x0172 }
        L_0x00d6:
            java.lang.String r2 = r1.mo31643e()     // Catch:{ all -> 0x0172 }
            l.b.a.k.b r3 = p402l.p406b.p407a.p418k.C9067b.FREE     // Catch:{ all -> 0x0172 }
            java.lang.String r3 = r3.getFieldName()     // Catch:{ all -> 0x0172 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0172 }
            if (r2 == 0) goto L_0x00ec
            java.util.List<l.b.d.b.a> r2 = r9.f35615j     // Catch:{ all -> 0x0172 }
            r2.add(r6)     // Catch:{ all -> 0x0172 }
            goto L_0x0103
        L_0x00ec:
            java.lang.String r2 = r1.mo31643e()     // Catch:{ all -> 0x0172 }
            l.b.a.k.b r3 = p402l.p406b.p407a.p418k.C9067b.MDAT     // Catch:{ all -> 0x0172 }
            java.lang.String r3 = r3.getFieldName()     // Catch:{ all -> 0x0172 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0172 }
            if (r2 == 0) goto L_0x0103
            r9.f35609d = r6     // Catch:{ all -> 0x0172 }
            java.util.List<l.b.d.b.a> r2 = r9.f35616k     // Catch:{ all -> 0x0172 }
            r2.add(r6)     // Catch:{ all -> 0x0172 }
        L_0x0103:
            l.b.d.b.a r2 = r9.f35606a     // Catch:{ all -> 0x0172 }
            r2.add(r6)     // Catch:{ all -> 0x0172 }
            long r2 = r10.position()     // Catch:{ all -> 0x0172 }
            int r1 = r1.mo31639a()     // Catch:{ all -> 0x0172 }
            long r4 = (long) r1     // Catch:{ all -> 0x0172 }
            long r2 = r2 + r4
            r10.position(r2)     // Catch:{ all -> 0x0172 }
            goto L_0x001d
        L_0x0117:
            r0 = move-exception
            l.b.d.b.a r1 = r9.f35608c     // Catch:{ all -> 0x0172 }
            if (r1 == 0) goto L_0x011e
            r1 = 1
            goto L_0x011f
        L_0x011e:
            r1 = 0
        L_0x011f:
            l.b.d.b.a r6 = r9.f35609d     // Catch:{ all -> 0x0172 }
            if (r6 == 0) goto L_0x0125
            r6 = 1
            goto L_0x0126
        L_0x0125:
            r6 = 0
        L_0x0126:
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0159
            l.b.a.k.j.o r0 = new l.b.a.k.j.o     // Catch:{ all -> 0x0172 }
            long r6 = r10.position()     // Catch:{ all -> 0x0172 }
            long r6 = r6 - r2
            long r1 = r10.size()     // Catch:{ all -> 0x0172 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0172 }
            l.b.d.b.a r1 = new l.b.d.b.a     // Catch:{ all -> 0x0172 }
            r1.<init>(r0)     // Catch:{ all -> 0x0172 }
            l.b.d.b.a r2 = r9.f35606a     // Catch:{ all -> 0x0172 }
            r2.add(r1)     // Catch:{ all -> 0x0172 }
            java.util.logging.Logger r1 = f35605p     // Catch:{ all -> 0x0172 }
            l.b.b.b r2 = p402l.p406b.p425b.C9118b.NULL_PADDING_FOUND_AT_END_OF_MP4     // Catch:{ all -> 0x0172 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0172 }
            long r6 = r0.mo31641c()     // Catch:{ all -> 0x0172 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0172 }
            r3[r5] = r0     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = r2.getMsg(r3)     // Catch:{ all -> 0x0172 }
            r1.warning(r0)     // Catch:{ all -> 0x0172 }
            goto L_0x015a
        L_0x0159:
            throw r0     // Catch:{ all -> 0x0172 }
        L_0x015a:
            l.b.d.b.b r0 = r9.f35607b     // Catch:{ all -> 0x0172 }
            l.b.d.b.a r1 = r9.f35609d
            if (r1 == 0) goto L_0x0166
            if (r11 == 0) goto L_0x0165
            r10.close()
        L_0x0165:
            return r0
        L_0x0166:
            l.b.a.g.a r10 = new l.b.a.g.a
            l.b.b.b r11 = p402l.p406b.p425b.C9118b.MP4_CANNOT_FIND_AUDIO
            java.lang.String r11 = r11.getMsg()
            r10.<init>((java.lang.String) r11)
            throw r10
        L_0x0172:
            r0 = move-exception
            goto L_0x0176
        L_0x0174:
            r0 = move-exception
            r10 = 0
        L_0x0176:
            l.b.d.b.a r1 = r9.f35609d
            if (r1 == 0) goto L_0x0180
            if (r11 == 0) goto L_0x017f
            r10.close()
        L_0x017f:
            throw r0
        L_0x0180:
            l.b.a.g.a r10 = new l.b.a.g.a
            l.b.b.b r11 = p402l.p406b.p425b.C9118b.MP4_CANNOT_FIND_AUDIO
            java.lang.String r11 = r11.getMsg()
            r10.<init>((java.lang.String) r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p418k.C9068c.mo31612b(java.io.RandomAccessFile, boolean):l.b.d.b.b");
    }

    /* renamed from: c */
    public C9077c mo31613c(C9301a aVar) {
        if (aVar == null) {
            return null;
        }
        return (C9077c) aVar.getUserObject();
    }

    /* renamed from: d */
    public List<C9301a> mo31614d() {
        return this.f35615j;
    }

    /* renamed from: e */
    public C9301a mo31615e() {
        return this.f35614i;
    }

    /* renamed from: f */
    public C9301a mo31616f() {
        return this.f35610e;
    }

    /* renamed from: g */
    public C9301a mo31617g() {
        return this.f35609d;
    }

    /* renamed from: h */
    public C9301a mo31618h() {
        return this.f35611f;
    }

    /* renamed from: i */
    public ByteBuffer mo31619i() {
        return this.f35619n;
    }

    /* renamed from: j */
    public C9301a mo31620j() {
        return this.f35608c;
    }

    /* renamed from: k */
    public C9090m mo31621k() {
        return this.f35618m;
    }

    /* renamed from: l */
    public C9301a mo31622l() {
        return this.f35612g;
    }

    /* renamed from: m */
    public List<C9301a> mo31623m() {
        return this.f35617l;
    }

    /* renamed from: n */
    public C9301a mo31624n() {
        return this.f35613h;
    }
}
