package p402l.p406b.p407a.p408e;

import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p407a.p408e.C8946a;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9051d;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.p427p.C9136a;

/* renamed from: l.b.a.e.b */
/* compiled from: AiffFileReader */
public class C8949b extends C9051d {

    /* renamed from: d */
    private static final int[] f35344d = {70, 79, 82, 77};

    /* renamed from: b */
    private C8946a f35345b = new C8946a();

    /* renamed from: c */
    private C9136a f35346c = new C9136a();

    /* renamed from: e */
    private boolean m47903e(RandomAccessFile randomAccessFile) throws IOException {
        String c = C8951d.m47909c(randomAccessFile);
        if ("AIFF".equals(c)) {
            this.f35345b.mo31288y(C8946a.C8948b.AIFFTYPE);
            return true;
        } else if (!"AIFC".equals(c)) {
            return false;
        } else {
            this.f35345b.mo31288y(C8946a.C8948b.AIFCTYPE);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037 A[LOOP:1: B:10:0x0037->B:13:0x0041, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p402l.p406b.p407a.p416i.C9053f mo31290a(java.io.RandomAccessFile r6) throws p402l.p406b.p407a.p413g.C9015a, java.io.IOException {
        /*
            r5 = this;
            java.util.logging.Logger r0 = p402l.p406b.p407a.p416i.C9051d.f35529a
            java.lang.String r1 = "Reading AIFF file "
            r0.finest(r1)
            r0 = 4
            byte[] r1 = new byte[r0]
            r6.read(r1)
            r2 = 0
        L_0x000e:
            if (r2 >= r0) goto L_0x002a
            byte r3 = r1[r2]
            int[] r4 = f35344d
            r4 = r4[r2]
            if (r3 != r4) goto L_0x001b
            int r2 = r2 + 1
            goto L_0x000e
        L_0x001b:
            java.util.logging.Logger r6 = p402l.p406b.p407a.p416i.C9051d.f35529a
            java.lang.String r0 = "AIFF file has incorrect signature"
            r6.finest(r0)
            l.b.a.g.a r6 = new l.b.a.g.a
            java.lang.String r0 = "Not an AIFF file: incorrect signature"
            r6.<init>((java.lang.String) r0)
            throw r6
        L_0x002a:
            long r0 = p402l.p406b.p407a.p408e.C8951d.m47912f(r6)
            boolean r2 = r5.m47903e(r6)
            if (r2 == 0) goto L_0x0046
            r2 = 4
            long r0 = r0 - r2
        L_0x0037:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0043
            boolean r2 = r5.mo31292d(r6, r0)
            if (r2 != 0) goto L_0x0037
        L_0x0043:
            l.b.a.e.a r6 = r5.f35345b
            return r6
        L_0x0046:
            l.b.a.g.a r6 = new l.b.a.g.a
            java.lang.String r0 = "Invalid AIFF file: Incorrect file type info"
            r6.<init>((java.lang.String) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p408e.C8949b.mo31290a(java.io.RandomAccessFile):l.b.a.i.f");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9130j mo31291b(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        C9051d.f35529a.info("getTag called");
        return this.f35346c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo31292d(RandomAccessFile randomAccessFile, long j) throws IOException {
        C8955h hVar;
        C8956i iVar = new C8956i();
        if (!iVar.mo31296c(randomAccessFile)) {
            return false;
        }
        int b = (int) iVar.mo31295b();
        String a = iVar.mo31294a();
        if ("FVER".equals(a)) {
            hVar = new C8961n(iVar, randomAccessFile, this.f35345b);
        } else if ("APPL".equals(a)) {
            hVar = new C8953f(iVar, randomAccessFile, this.f35345b);
        } else if ("COMM".equals(a)) {
            hVar = new C8958k(iVar, randomAccessFile, this.f35345b);
        } else if ("COMT".equals(a)) {
            hVar = new C8957j(iVar, randomAccessFile, this.f35345b);
        } else if ("NAME".equals(a)) {
            hVar = new C8963p(iVar, randomAccessFile, this.f35345b);
        } else if ("AUTH".equals(a)) {
            hVar = new C8954g(iVar, randomAccessFile, this.f35345b);
        } else if ("(c) ".equals(a)) {
            hVar = new C8959l(iVar, randomAccessFile, this.f35345b);
        } else if ("ANNO".equals(a)) {
            hVar = new C8952e(iVar, randomAccessFile, this.f35345b);
        } else {
            hVar = "ID3 ".equals(a) ? new C8962o(iVar, randomAccessFile, this.f35346c) : null;
        }
        if (hVar == null) {
            randomAccessFile.skipBytes(b);
        } else if (!hVar.mo31293a()) {
            return false;
        }
        if ((b & 1) != 0) {
            randomAccessFile.skipBytes(1);
        }
        return true;
    }
}
