package p402l.p406b.p407a.p418k.p419j;

import java.nio.ByteBuffer;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.k.j.m */
/* compiled from: Mp4StcoBox */
public class C9090m extends C9075a {

    /* renamed from: c */
    private int f35669c = 0;

    /* renamed from: d */
    private int f35670d;

    public C9090m(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        ByteBuffer slice = byteBuffer.slice();
        this.f35629b = slice;
        slice.position(slice.position() + 1 + 3);
        ByteBuffer byteBuffer2 = this.f35629b;
        this.f35669c = C9057i.m48302e(byteBuffer2, byteBuffer2.position(), (this.f35629b.position() + 4) - 1);
        ByteBuffer byteBuffer3 = this.f35629b;
        byteBuffer3.position(byteBuffer3.position() + 4);
        ByteBuffer byteBuffer4 = this.f35629b;
        this.f35670d = C9057i.m48302e(byteBuffer4, byteBuffer4.position(), (this.f35629b.position() + 4) - 1);
    }

    /* renamed from: c */
    public void mo31668c(int i) {
        this.f35629b.rewind();
        ByteBuffer byteBuffer = this.f35629b;
        byteBuffer.position(byteBuffer.position() + 1 + 3 + 4);
        for (int i2 = 0; i2 < this.f35669c; i2++) {
            ByteBuffer byteBuffer2 = this.f35629b;
            this.f35629b.put(C9057i.m48311n(C9057i.m48302e(byteBuffer2, byteBuffer2.position(), (this.f35629b.position() + 4) - 1) + i));
        }
    }

    /* renamed from: d */
    public int mo31669d() {
        return this.f35670d;
    }
}
