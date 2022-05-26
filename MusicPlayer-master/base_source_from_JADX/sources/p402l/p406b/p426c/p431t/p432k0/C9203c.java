package p402l.p406b.p426c.p431t.p432k0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.logging.Logger;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9125e;
import p402l.p406b.p426c.C9127g;
import p402l.p406b.p426c.p429r.C9146a;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.C9192h;

/* renamed from: l.b.c.t.k0.c */
/* compiled from: AbstractID3v2FrameBody */
public abstract class C9203c extends C9190g {

    /* renamed from: j */
    private int f35901j;

    protected C9203c() {
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9203c) && super.equals(obj);
    }

    /* renamed from: h */
    public int mo31919h() {
        return this.f35901j;
    }

    /* renamed from: i */
    public void mo31887i(ByteBuffer byteBuffer) throws C9127g {
        int h = mo31919h();
        Logger logger = C9192h.f35863g;
        logger.config("Reading body for" + mo31857g() + ":" + h);
        byte[] bArr = new byte[h];
        byteBuffer.get(bArr);
        Iterator<C9146a> it = this.f35860i.iterator();
        int i = 0;
        while (it.hasNext()) {
            C9146a next = it.next();
            Logger logger2 = C9192h.f35863g;
            logger2.finest("offset:" + i);
            if (i <= h) {
                try {
                    next.mo31778e(bArr, i);
                    i += next.mo31776c();
                } catch (C9124d e) {
                    Logger logger3 = C9192h.f35863g;
                    logger3.warning("Problem reading datatype within Frame Body:" + e.getMessage());
                    throw e;
                }
            } else {
                C9192h.f35863g.warning("Invalid Size for FrameBody");
                throw new C9125e("Invalid size for Frame Body");
            }
        }
    }

    /* renamed from: u */
    public void mo31969u() {
        this.f35901j = 0;
        Iterator<C9146a> it = this.f35860i.iterator();
        while (it.hasNext()) {
            this.f35901j += it.next().mo31776c();
        }
    }

    /* renamed from: v */
    public void mo31970v(int i) {
        this.f35901j = i;
    }

    /* renamed from: w */
    public void mo31961w(ByteArrayOutputStream byteArrayOutputStream) {
        Logger logger = C9192h.f35863g;
        logger.config("Writing frame body for" + mo31857g() + ":Est Size:" + this.f35901j);
        Iterator<C9146a> it = this.f35860i.iterator();
        while (it.hasNext()) {
            byte[] h = it.next().mo31782h();
            if (h != null) {
                try {
                    byteArrayOutputStream.write(h);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        mo31969u();
        Logger logger2 = C9192h.f35863g;
        logger2.config("Written frame body for" + mo31857g() + ":Real Size:" + this.f35901j);
    }

    protected C9203c(C9203c cVar) {
        super(cVar);
    }

    protected C9203c(ByteBuffer byteBuffer, int i) throws C9127g {
        mo31970v(i);
        mo31887i(byteBuffer);
    }
}
