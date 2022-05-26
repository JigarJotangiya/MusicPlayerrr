package p402l.p406b.p407a.p422m;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9051d;
import p402l.p406b.p407a.p416i.C9053f;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9130j;

/* renamed from: l.b.a.m.b */
/* compiled from: RealFileReader */
public class C9109b extends C9051d {
    /* renamed from: d */
    private C9108a m48536d(RandomAccessFile randomAccessFile) throws IOException, C9015a {
        C9108a.m48532d(randomAccessFile);
        C9108a.m48532d(randomAccessFile);
        C9108a d = C9108a.m48532d(randomAccessFile);
        while (!d.mo31712c()) {
            d = C9108a.m48532d(randomAccessFile);
        }
        return d;
    }

    /* renamed from: e */
    private C9108a m48537e(RandomAccessFile randomAccessFile) throws IOException, C9015a {
        C9108a.m48532d(randomAccessFile);
        return C9108a.m48532d(randomAccessFile);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9053f mo31290a(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        C9053f fVar = new C9053f();
        DataInputStream b = m48537e(randomAccessFile).mo31711b();
        if (C9057i.m48322y(b) == 0) {
            long z = C9057i.m48323z(b) / 1000;
            C9057i.m48323z(b);
            C9057i.m48323z(b);
            C9057i.m48323z(b);
            C9057i.m48323z(b);
            C9057i.m48323z(b);
            C9057i.m48323z(b);
            C9057i.m48322y(b);
            C9057i.m48322y(b);
            fVar.mo31548g((int) z);
            fVar.mo31553l(C9057i.m48296A(b) / 1000);
            fVar.mo31557p(C9057i.m48323z(b) / 1000 != z);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9130j mo31291b(RandomAccessFile randomAccessFile) throws C9015a, IOException {
        DataInputStream b = m48536d(randomAccessFile).mo31711b();
        String u = C9057i.m48318u(b, C9057i.m48322y(b));
        String u2 = C9057i.m48318u(b, C9057i.m48322y(b));
        String u3 = C9057i.m48318u(b, C9057i.m48322y(b));
        String u4 = C9057i.m48318u(b, C9057i.m48322y(b));
        C9110c cVar = new C9110c();
        try {
            cVar.mo31519c(C9123c.TITLE, u.length() == 0 ? u2 : u);
            C9123c cVar2 = C9123c.ARTIST;
            if (u.length() == 0) {
                u2 = u3;
            }
            cVar.mo31519c(cVar2, u2);
            cVar.mo31519c(C9123c.COMMENT, u4);
            return cVar;
        } catch (C9122b e) {
            throw new RuntimeException(e);
        }
    }
}
