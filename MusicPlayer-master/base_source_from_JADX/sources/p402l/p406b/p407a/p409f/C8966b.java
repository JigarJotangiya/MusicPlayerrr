package p402l.p406b.p407a.p409f;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import p402l.p406b.p407a.p409f.p410c.C8968b;
import p402l.p406b.p407a.p409f.p410c.C8971e;
import p402l.p406b.p407a.p409f.p410c.C8981o;
import p402l.p406b.p407a.p409f.p411d.C8988a;
import p402l.p406b.p407a.p409f.p411d.C8990c;
import p402l.p406b.p407a.p409f.p411d.C8991d;
import p402l.p406b.p407a.p409f.p411d.C9006s;
import p402l.p406b.p407a.p409f.p411d.C9007t;
import p402l.p406b.p407a.p409f.p411d.C9011x;
import p402l.p406b.p407a.p409f.p412e.C9013b;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p407a.p416i.C9052e;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.p428q.C9139c;

/* renamed from: l.b.a.f.b */
/* compiled from: AsfFileWriter */
public class C8966b extends C9052e {
    /* renamed from: g */
    private boolean[] m47937g(C8971e eVar, C8981o[] oVarArr) {
        int length = oVarArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = eVar.mo31335k(oVarArr[i].mo31388k().getContainerGUID());
        }
        return zArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo31300b(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C9017c, IOException {
        mo31301f(new C9139c(true), randomAccessFile, randomAccessFile2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo31301f(C9130j jVar, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws C9017c, IOException {
        C8968b m = C8990c.m48102m(randomAccessFile);
        randomAccessFile.seek(0);
        C8981o[] b = C9013b.m48166b(new C9139c(jVar, true));
        boolean[] g = m47937g(m, b);
        boolean[] g2 = m47937g(m.mo31309r(), b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < b.length; i++) {
            C9011x xVar = new C9011x(b[i]);
            if (g[i]) {
                arrayList.add(xVar);
            } else if (g2[i]) {
                arrayList2.add(xVar);
            } else if (i == 0 || i == 2 || i == 1) {
                arrayList.add(xVar);
            } else {
                arrayList2.add(xVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C8988a(arrayList2));
        }
        new C8991d().mo31458b(new C9006s(randomAccessFile), new C9007t(randomAccessFile2), arrayList);
    }
}
