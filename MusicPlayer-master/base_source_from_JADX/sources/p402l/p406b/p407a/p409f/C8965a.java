package p402l.p406b.p407a.p409f;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p402l.p406b.p407a.p409f.p410c.C8968b;
import p402l.p406b.p407a.p409f.p410c.C8981o;
import p402l.p406b.p407a.p409f.p410c.C8984q;
import p402l.p406b.p407a.p409f.p411d.C8989b;
import p402l.p406b.p407a.p409f.p411d.C8990c;
import p402l.p406b.p407a.p409f.p411d.C8996i;
import p402l.p406b.p407a.p409f.p411d.C8997j;
import p402l.p406b.p407a.p409f.p411d.C9001n;
import p402l.p406b.p407a.p409f.p411d.C9003p;
import p402l.p406b.p407a.p409f.p411d.C9004q;
import p402l.p406b.p407a.p409f.p411d.C9009v;
import p402l.p406b.p407a.p409f.p412e.C9013b;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9051d;
import p402l.p406b.p407a.p416i.C9053f;
import p402l.p406b.p426c.p428q.C9139c;

/* renamed from: l.b.a.f.a */
/* compiled from: AsfFileReader */
public class C8965a extends C9051d {

    /* renamed from: b */
    private static final Logger f35364b = Logger.getLogger("org.jaudiotagger.audio.asf");

    /* renamed from: c */
    private static final C8990c f35365c;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8997j.class);
        arrayList.add(C8996i.class);
        arrayList.add(C9004q.class);
        arrayList.add(C9003p.class);
        C8989b bVar = new C8989b(arrayList, true);
        arrayList.add(C9001n.class);
        arrayList.add(C9009v.class);
        C8990c cVar = new C8990c(arrayList, true);
        f35365c = cVar;
        cVar.mo31457n(bVar);
    }

    /* renamed from: d */
    private boolean m47930d(C8968b bVar) {
        List<C8984q> o;
        C8981o m = bVar.mo31304m();
        if (m == null || (o = m.mo31391o("IsVBR")) == null || o.isEmpty()) {
            return false;
        }
        return Boolean.TRUE.toString().equals(o.get(0).mo31429w());
    }

    /* renamed from: e */
    private C9053f m47931e(C8968b bVar) throws C9015a {
        C9053f fVar = new C9053f();
        if (bVar.mo31310s() == null) {
            throw new C9015a("Invalid ASF/WMA file. File header object not available.");
        } else if (bVar.mo31306o() != null) {
            fVar.mo31548g(bVar.mo31306o().mo31321v());
            fVar.mo31550i((int) bVar.mo31306o().mo31318s());
            fVar.mo31551j("ASF (audio): " + bVar.mo31306o().mo31319t());
            fVar.mo31554m(bVar.mo31306o().mo31320u() == 355);
            fVar.mo31555n(bVar.mo31310s().mo31374j());
            fVar.mo31556o((int) bVar.mo31306o().mo31322w());
            fVar.mo31557p(m47930d(bVar));
            fVar.mo31549h(bVar.mo31306o().mo31317r());
            return fVar;
        } else {
            throw new C9015a("Invalid ASF/WMA file. No audio stream contained.");
        }
    }

    /* renamed from: g */
    private C9139c m47932g(C8968b bVar) {
        return C9013b.m48165a(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9053f mo31290a(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        randomAccessFile.seek(0);
        try {
            C8968b l = C8990c.m48101l(randomAccessFile);
            if (l != null) {
                return m47931e(l);
            }
            throw new C9015a("Some values must have been incorrect for interpretation as asf with wma content.");
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            } else if (e instanceof C9015a) {
                throw ((C9015a) e);
            } else {
                throw new C9015a("Failed to read. Cause: " + e.getMessage(), e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f9 A[SYNTHETIC, Splitter:B:38:0x00f9] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p402l.p406b.p407a.C8942a mo31298c(java.io.File r12) throws p402l.p406b.p407a.p413g.C9015a, java.io.IOException, p402l.p406b.p426c.C9131k, p402l.p406b.p407a.p413g.C9022h, p402l.p406b.p407a.p413g.C9018d {
        /*
            r11 = this;
            java.lang.String r0 = "\" :"
            java.lang.String r1 = "\""
            boolean r2 = r12.canRead()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0119
            r2 = 0
            l.b.a.f.d.o r5 = new l.b.a.f.d.o     // Catch:{ a -> 0x00f2, Exception -> 0x00d4, all -> 0x00d0 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ a -> 0x00f2, Exception -> 0x00d4, all -> 0x00d0 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ a -> 0x00f2, Exception -> 0x00d4, all -> 0x00d0 }
            r7.<init>(r12)     // Catch:{ a -> 0x00f2, Exception -> 0x00d4, all -> 0x00d0 }
            r6.<init>(r7)     // Catch:{ a -> 0x00f2, Exception -> 0x00d4, all -> 0x00d0 }
            r5.<init>(r6)     // Catch:{ a -> 0x00f2, Exception -> 0x00d4, all -> 0x00d0 }
            l.b.a.f.d.c r2 = f35365c     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            l.b.a.f.c.l r6 = p402l.p406b.p407a.p409f.p412e.C9014c.m48178l(r5)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r7 = 0
            l.b.a.f.c.e r2 = r2.mo31463h(r6, r5, r7)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            l.b.a.f.c.b r2 = (p402l.p406b.p407a.p409f.p410c.C8968b) r2     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            if (r2 == 0) goto L_0x00b8
            l.b.a.f.c.k r6 = r2.mo31310s()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            if (r6 == 0) goto L_0x00a4
            l.b.a.f.c.k r6 = r2.mo31310s()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.math.BigInteger r6 = r6.mo31373i()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            long r6 = r6.longValue()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            long r8 = r12.length()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0077
            java.util.logging.Logger r6 = p402l.p406b.p407a.p416i.C9051d.f35529a     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            l.b.b.b r7 = p402l.p406b.p425b.C9118b.ASF_FILE_HEADER_SIZE_DOES_NOT_MATCH_FILE_SIZE     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.String r9 = r12.getAbsolutePath()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r8[r3] = r9     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            l.b.a.f.c.k r3 = r2.mo31310s()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.math.BigInteger r3 = r3.mo31373i()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            long r9 = r3.longValue()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r8[r4] = r3     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r3 = 2
            long r9 = r12.length()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r8[r3] = r4     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.String r3 = r7.getMsg(r8)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r6.warning(r3)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
        L_0x0077:
            l.b.a.a r3 = new l.b.a.a     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            l.b.a.i.f r4 = r11.m47931e(r2)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            l.b.c.q.c r2 = r11.m47932g(r2)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r3.<init>(r12, r4, r2)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r5.close()     // Catch:{ Exception -> 0x0088 }
            goto L_0x00a3
        L_0x0088:
            r2 = move-exception
            java.util.logging.Logger r4 = f35364b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r12)
            r5.append(r0)
            r5.append(r2)
            java.lang.String r12 = r5.toString()
            r4.severe(r12)
        L_0x00a3:
            return r3
        L_0x00a4:
            l.b.a.g.a r2 = new l.b.a.g.a     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            l.b.b.b r6 = p402l.p406b.p425b.C9118b.ASF_FILE_HEADER_MISSING     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.String r7 = r12.getAbsolutePath()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r4[r3] = r7     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.String r3 = r6.getMsg(r4)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r2.<init>((java.lang.String) r3)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            throw r2     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
        L_0x00b8:
            l.b.a.g.a r2 = new l.b.a.g.a     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            l.b.b.b r6 = p402l.p406b.p425b.C9118b.ASF_HEADER_MISSING     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.String r7 = r12.getAbsolutePath()     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r4[r3] = r7     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            java.lang.String r3 = r6.getMsg(r4)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            r2.<init>((java.lang.String) r3)     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
            throw r2     // Catch:{ a -> 0x00ce, Exception -> 0x00cc }
        L_0x00cc:
            r2 = move-exception
            goto L_0x00d7
        L_0x00ce:
            r2 = move-exception
            goto L_0x00f5
        L_0x00d0:
            r3 = move-exception
            r5 = r2
            r2 = r3
            goto L_0x00f7
        L_0x00d4:
            r3 = move-exception
            r5 = r2
            r2 = r3
        L_0x00d7:
            l.b.a.g.a r3 = new l.b.a.g.a     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r4.<init>()     // Catch:{ all -> 0x00f6 }
            r4.append(r1)     // Catch:{ all -> 0x00f6 }
            r4.append(r12)     // Catch:{ all -> 0x00f6 }
            r4.append(r0)     // Catch:{ all -> 0x00f6 }
            r4.append(r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00f6 }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x00f6 }
            throw r3     // Catch:{ all -> 0x00f6 }
        L_0x00f2:
            r3 = move-exception
            r5 = r2
            r2 = r3
        L_0x00f5:
            throw r2     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r2 = move-exception
        L_0x00f7:
            if (r5 == 0) goto L_0x0118
            r5.close()     // Catch:{ Exception -> 0x00fd }
            goto L_0x0118
        L_0x00fd:
            r3 = move-exception
            java.util.logging.Logger r4 = f35364b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r12)
            r5.append(r0)
            r5.append(r3)
            java.lang.String r12 = r5.toString()
            r4.severe(r12)
        L_0x0118:
            throw r2
        L_0x0119:
            l.b.a.g.a r0 = new l.b.a.g.a
            l.b.b.b r1 = p402l.p406b.p425b.C9118b.GENERAL_READ_FAILED_DO_NOT_HAVE_PERMISSION_TO_READ_FILE
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r12 = r12.getAbsolutePath()
            r2[r3] = r12
            java.lang.String r12 = r1.getMsg(r2)
            r0.<init>((java.lang.String) r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p409f.C8965a.mo31298c(java.io.File):l.b.a.a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C9139c mo31291b(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        randomAccessFile.seek(0);
        try {
            C8968b m = C8990c.m48102m(randomAccessFile);
            if (m != null) {
                return C9013b.m48165a(m);
            }
            throw new C9015a("Some values must have been incorrect for interpretation as asf with wma content.");
        } catch (Exception e) {
            C9051d.f35529a.severe(e.getMessage());
            if (e instanceof IOException) {
                throw ((IOException) e);
            } else if (e instanceof C9015a) {
                throw ((C9015a) e);
            } else {
                throw new C9015a("Failed to read. Cause: " + e.getMessage());
            }
        }
    }
}
