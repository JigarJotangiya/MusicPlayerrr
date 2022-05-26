package p402l.p406b.p426c.p435v;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p402l.p406b.p407a.p416i.C9049b;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.C9067b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.p435v.p437h.C9283f;

/* renamed from: l.b.c.v.d */
/* compiled from: Mp4TagCreator */
public class C9272d extends C9049b {
    /* renamed from: b */
    public ByteBuffer mo31488b(C9130j jVar, int i) throws UnsupportedEncodingException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator<C9132l> d = jVar.mo31520d();
            boolean z = false;
            while (d.hasNext()) {
                C9132l next = d.next();
                if (!(next instanceof C9283f)) {
                    byteArrayOutputStream.write(next.mo31499c());
                } else if (!z) {
                    z = true;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Iterator<C9132l> it = jVar.mo31559a(C9123c.COVER_ART).iterator();
                    while (it.hasNext()) {
                        byteArrayOutputStream2.write(((C9273e) it.next()).mo32121e());
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream.write(C9057i.m48311n(byteArray.length + 8));
                    byteArrayOutputStream.write(C9057i.m48300c(C9269a.ARTWORK.getFieldName(), "ISO-8859-1"));
                    byteArrayOutputStream.write(byteArray);
                }
            }
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            byteArrayOutputStream3.write(C9057i.m48311n(byteArrayOutputStream.size() + 8));
            byteArrayOutputStream3.write(C9057i.m48300c(C9067b.ILST.getFieldName(), "ISO-8859-1"));
            byteArrayOutputStream3.write(byteArrayOutputStream.toByteArray());
            ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream3.toByteArray());
            wrap.rewind();
            return wrap;
        } catch (C9128h unused) {
            throw new RuntimeException("Unable to find COVERART Key");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
