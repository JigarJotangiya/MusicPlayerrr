package p402l.p406b.p407a.p420l;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p407a.p420l.p421g.C9105d;
import p402l.p406b.p407a.p420l.p421g.C9107f;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.p440y.C9295a;

/* renamed from: l.b.a.l.c */
/* compiled from: OggVorbisCommentTagCreator */
public class C9095c {

    /* renamed from: a */
    private C9295a f35674a = new C9295a();

    static {
        Logger.getLogger("org.jaudiotagger.audio.ogg");
    }

    /* renamed from: a */
    public ByteBuffer mo31671a(C9130j jVar) throws UnsupportedEncodingException {
        ByteBuffer a = this.f35674a.mo31534a(jVar);
        ByteBuffer allocate = ByteBuffer.allocate(a.capacity() + 1 + 6 + 1);
        allocate.put((byte) C9107f.COMMENT_HEADER.getType());
        allocate.put(C9105d.f35704a);
        allocate.put(a);
        allocate.put((byte) 1);
        allocate.rewind();
        return allocate;
    }
}
