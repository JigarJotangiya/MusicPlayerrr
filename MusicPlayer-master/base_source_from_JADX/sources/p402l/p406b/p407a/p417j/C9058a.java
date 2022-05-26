package p402l.p406b.p407a.p417j;

import java.nio.ByteBuffer;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.j.a */
/* compiled from: LameFrame */
public class C9058a {

    /* renamed from: a */
    private String f35538a;

    private C9058a(ByteBuffer byteBuffer) {
        this.f35538a = C9057i.m48313p(byteBuffer, 0, 9, "ISO-8859-1");
    }

    /* renamed from: b */
    public static C9058a m48324b(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        String p = C9057i.m48313p(slice, 0, 4, "ISO-8859-1");
        slice.rewind();
        if (p.equals("LAME")) {
            return new C9058a(slice);
        }
        return null;
    }

    /* renamed from: a */
    public String mo31562a() {
        return this.f35538a;
    }
}
