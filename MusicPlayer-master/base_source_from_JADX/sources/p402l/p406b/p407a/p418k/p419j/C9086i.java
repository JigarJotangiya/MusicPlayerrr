package p402l.p406b.p407a.p418k.p419j;

import java.nio.ByteBuffer;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.k.j.i */
/* compiled from: Mp4MdhdBox */
public class C9086i extends C9075a {

    /* renamed from: c */
    private int f35666c;

    public C9086i(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        if (byteBuffer.get(0) == 1) {
            this.f35666c = C9057i.m48302e(byteBuffer, 20, 23);
            C9057i.m48306i(byteBuffer, 24, 31);
            return;
        }
        this.f35666c = C9057i.m48302e(byteBuffer, 12, 15);
        C9057i.m48302e(byteBuffer, 16, 19);
    }

    /* renamed from: c */
    public int mo31664c() {
        return this.f35666c;
    }
}
