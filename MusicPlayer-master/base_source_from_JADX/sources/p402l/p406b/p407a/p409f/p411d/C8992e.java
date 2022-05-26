package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8971e;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.e */
/* compiled from: ChunkContainerReader */
abstract class C8992e<ChunkType extends C8971e> implements C8995h {

    /* renamed from: d */
    protected static final Logger f35447d = Logger.getLogger("org.jaudiotabgger.audio");

    /* renamed from: a */
    protected final boolean f35448a;

    /* renamed from: b */
    protected boolean f35449b = false;

    /* renamed from: c */
    protected final Map<C8978l, C8995h> f35450c = new HashMap();

    protected C8992e(List<Class<? extends C8995h>> list, boolean z) {
        this.f35448a = z;
        for (Class<? extends C8995h> i : list) {
            m48111i(i);
        }
    }

    /* renamed from: i */
    private <T extends C8995h> void m48111i(Class<T> cls) {
        try {
            C8995h hVar = (C8995h) cls.newInstance();
            for (C8978l put : hVar.mo31452b()) {
                this.f35450c.put(put, hVar);
            }
        } catch (InstantiationException e) {
            f35447d.severe(e.getMessage());
        } catch (IllegalAccessException e2) {
            f35447d.severe(e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo31460d(InputStream inputStream) throws IllegalArgumentException {
        if (this.f35449b && !inputStream.markSupported()) {
            throw new IllegalArgumentException("Stream has to support mark/reset.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract ChunkType mo31454e(long j, BigInteger bigInteger, InputStream inputStream) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C8995h mo31461f(C8978l lVar) {
        return this.f35450c.get(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo31462g(C8978l lVar) {
        return this.f35450c.containsKey(lVar);
    }

    /* renamed from: h */
    public ChunkType mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException, IllegalArgumentException {
        C8970d dVar;
        mo31460d(inputStream);
        C8998k kVar = new C8998k(inputStream);
        if (Arrays.asList(mo31452b()).contains(lVar)) {
            ChunkType e = mo31454e(j, C9014c.m48174h(kVar), kVar);
            long d = j + kVar.mo31464d() + 16;
            HashSet hashSet = new HashSet();
            while (d < e.mo31327c()) {
                C8978l l = C9014c.m48178l(kVar);
                boolean z = this.f35448a && (!mo31462g(l) || !hashSet.add(l));
                if (z || !mo31462g(l)) {
                    dVar = C8993f.m48118d().mo31459a(l, kVar, d);
                } else {
                    if (mo31461f(l).mo31453c()) {
                        kVar.mark(8192);
                    }
                    dVar = mo31461f(l).mo31459a(l, kVar, d);
                }
                if (dVar == null) {
                    kVar.reset();
                } else {
                    if (!z) {
                        e.mo31331g(dVar);
                    }
                    d = dVar.mo31327c();
                }
            }
            return e;
        }
        throw new IllegalArgumentException("provided GUID is not supported by this reader.");
    }
}
