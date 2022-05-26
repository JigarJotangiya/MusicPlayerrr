package p402l.p406b.p407a.p418k.p419j;

import java.nio.ByteBuffer;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.k.j.l */
/* compiled from: Mp4MvhdBox */
public class C9089l extends C9075a {

    /* renamed from: c */
    private int f35667c;

    /* renamed from: d */
    private long f35668d;

    public C9089l(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        if (byteBuffer.get(0) == 1) {
            this.f35667c = C9057i.m48302e(byteBuffer, 20, 23);
            this.f35668d = C9057i.m48306i(byteBuffer, 24, 31);
            return;
        }
        this.f35667c = C9057i.m48302e(byteBuffer, 12, 15);
        this.f35668d = (long) C9057i.m48302e(byteBuffer, 16, 19);
    }

    /* renamed from: c */
    public int mo31667c() {
        return (int) (this.f35668d / ((long) this.f35667c));
    }
}
