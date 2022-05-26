package p402l.p406b.p426c.p440y;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p402l.p406b.p407a.p416i.C9049b;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9132l;

/* renamed from: l.b.c.y.a */
/* compiled from: VorbisCommentCreator */
public class C9295a extends C9049b {
    /* renamed from: b */
    public ByteBuffer mo31488b(C9130j jVar, int i) throws UnsupportedEncodingException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String n = ((C9298d) jVar).mo32144n();
            byteArrayOutputStream.write(C9057i.m48312o(C9057i.m48315r(n).length));
            byteArrayOutputStream.write(C9057i.m48315r(n));
            byteArrayOutputStream.write(C9057i.m48312o(jVar.mo31518b() - 1));
            Iterator<C9132l> d = jVar.mo31520d();
            while (d.hasNext()) {
                C9132l next = d.next();
                if (!next.mo31497D().equals(C9296b.VENDOR.getFieldName())) {
                    byteArrayOutputStream.write(next.mo31499c());
                }
            }
            ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            wrap.rewind();
            return wrap;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
