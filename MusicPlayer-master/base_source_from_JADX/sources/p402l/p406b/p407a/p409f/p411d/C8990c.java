package p402l.p406b.p407a.p409f.p411d;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import p402l.p406b.p407a.p409f.p410c.C8968b;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.c */
/* compiled from: AsfHeaderReader */
public class C8990c extends C8992e<C8968b> {

    /* renamed from: e */
    private static final C8978l[] f35443e = {C8978l.f35400l};

    /* renamed from: f */
    private static final C8990c f35444f;

    /* renamed from: g */
    private static final C8990c f35445g;

    /* renamed from: h */
    private static final C8990c f35446h;

    static {
        Class<C9009v> cls = C9009v.class;
        Class<C9001n> cls2 = C9001n.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cls2);
        arrayList.add(cls);
        f35445g = new C8990c(arrayList, true);
        arrayList.clear();
        arrayList.add(C8997j.class);
        arrayList.add(C8996i.class);
        arrayList.add(C9003p.class);
        arrayList.add(C9004q.class);
        C8989b bVar = new C8989b(arrayList, true);
        C8989b bVar2 = new C8989b(arrayList, true);
        C8990c cVar = new C8990c(arrayList, true);
        f35446h = cVar;
        cVar.mo31457n(bVar);
        arrayList.add(cls2);
        arrayList.add(cls);
        arrayList.add(C8999l.class);
        arrayList.add(C9000m.class);
        arrayList.add(C9008u.class);
        C8990c cVar2 = new C8990c(arrayList, false);
        f35444f = cVar2;
        cVar2.mo31457n(bVar2);
    }

    public C8990c(List<Class<? extends C8995h>> list, boolean z) {
        super(list, z);
    }

    /* renamed from: k */
    private static InputStream m48100k(RandomAccessFile randomAccessFile) {
        return new C9002o(new BufferedInputStream(new C9006s(randomAccessFile)));
    }

    /* renamed from: l */
    public static C8968b m48101l(RandomAccessFile randomAccessFile) throws IOException {
        InputStream k = m48100k(randomAccessFile);
        return (C8968b) f35445g.mo31459a(C9014c.m48178l(k), k, 0);
    }

    /* renamed from: m */
    public static C8968b m48102m(RandomAccessFile randomAccessFile) throws IOException {
        InputStream k = m48100k(randomAccessFile);
        return (C8968b) f35446h.mo31459a(C9014c.m48178l(k), k, 0);
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35443e.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8968b mo31454e(long j, BigInteger bigInteger, InputStream inputStream) throws IOException {
        long n = C9014c.m48180n(inputStream);
        if (inputStream.read() != 1) {
            throw new IOException("No ASF");
        } else if (inputStream.read() == 2) {
            return new C8968b(j, bigInteger, n);
        } else {
            throw new IOException("No ASF");
        }
    }

    /* renamed from: n */
    public void mo31457n(C8989b bVar) {
        for (C8978l put : bVar.mo31452b()) {
            this.f35450c.put(put, bVar);
        }
    }
}
