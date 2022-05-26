package p402l.p406b.p407a.p414h;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ListIterator;
import java.util.logging.Logger;
import p402l.p406b.p407a.p414h.p415i.C9037a;
import p402l.p406b.p407a.p414h.p415i.C9042f;
import p402l.p406b.p407a.p414h.p415i.C9043g;
import p402l.p406b.p407a.p414h.p415i.C9046j;
import p402l.p406b.p407a.p416i.C9049b;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.p430s.C9171a;
import p402l.p406b.p426c.p440y.C9295a;

/* renamed from: l.b.a.h.f */
/* compiled from: FlacTagCreator */
public class C9031f extends C9049b {

    /* renamed from: a */
    public static Logger f35477a = Logger.getLogger("org.jaudiotagger.audio.flac");

    /* renamed from: b */
    private static final C9295a f35478b = new C9295a();

    /* renamed from: b */
    public ByteBuffer mo31488b(C9130j jVar, int i) throws UnsupportedEncodingException {
        int i2;
        ByteBuffer byteBuffer;
        C9046j jVar2;
        C9046j jVar3;
        f35477a.config("Convert flac tag:padding:" + i);
        C9171a aVar = (C9171a) jVar;
        if (aVar.mo31845g() != null) {
            byteBuffer = f35478b.mo31534a(aVar.mo31845g());
            i2 = byteBuffer.capacity() + 4;
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        for (C9043g a : aVar.mo31844f()) {
            i2 += a.mo31496a().length + 4;
        }
        f35477a.config("Convert flac tag:taglength:" + i2);
        ByteBuffer allocate = ByteBuffer.allocate(i2 + i);
        if (aVar.mo31845g() != null) {
            if (i > 0 || aVar.mo31844f().size() > 0) {
                jVar3 = new C9046j(false, C9037a.VORBIS_COMMENT, byteBuffer.capacity());
            } else {
                jVar3 = new C9046j(true, C9037a.VORBIS_COMMENT, byteBuffer.capacity());
            }
            allocate.put(jVar3.mo31513b());
            allocate.put(byteBuffer);
        }
        ListIterator<C9043g> listIterator = aVar.mo31844f().listIterator();
        while (listIterator.hasNext()) {
            C9043g next = listIterator.next();
            if (i > 0 || listIterator.hasNext()) {
                jVar2 = new C9046j(false, C9037a.PICTURE, next.mo31498b());
            } else {
                jVar2 = new C9046j(true, C9037a.PICTURE, next.mo31498b());
            }
            allocate.put(jVar2.mo31513b());
            allocate.put(next.mo31496a());
        }
        f35477a.config("Convert flac tag at" + allocate.position());
        if (i > 0) {
            int i3 = i - 4;
            C9046j jVar4 = new C9046j(true, C9037a.PADDING, i3);
            C9042f fVar = new C9042f(i3);
            allocate.put(jVar4.mo31513b());
            allocate.put(fVar.mo31496a());
        }
        allocate.rewind();
        return allocate;
    }
}
