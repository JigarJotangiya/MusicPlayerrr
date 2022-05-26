package p402l.p406b.p426c.p429r;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.logging.Logger;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.p433l0.C9237h;

/* renamed from: l.b.c.r.c */
/* compiled from: AbstractString */
public abstract class C9148c extends C9146a {
    protected C9148c(String str, C9190g gVar) {
        super(str, gVar);
    }

    /* renamed from: c */
    public int mo31776c() {
        return this.f35774d;
    }

    /* renamed from: i */
    public boolean mo31786i() {
        CharsetEncoder newEncoder = Charset.forName(C9237h.m49061g().mo31785f(mo31774a().mo31942n())).newEncoder();
        if (newEncoder.canEncode((String) this.f35771a)) {
            return true;
        }
        Logger logger = C9146a.f35770e;
        logger.finest("Failed Trying to decode" + this.f35771a + "with" + newEncoder.toString());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo31787j(int i) {
        this.f35774d = i;
    }

    public String toString() {
        return (String) this.f35771a;
    }

    public C9148c(String str, C9190g gVar, String str2) {
        super(str, gVar, str2);
    }
}
