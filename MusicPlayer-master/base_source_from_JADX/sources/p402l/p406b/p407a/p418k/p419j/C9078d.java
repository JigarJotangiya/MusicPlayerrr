package p402l.p406b.p407a.p418k.p419j;

import java.nio.ByteBuffer;
import p402l.p406b.p407a.p413g.C9015a;

/* renamed from: l.b.a.k.j.d */
/* compiled from: Mp4DrmsBox */
public class C9078d extends C9075a {
    public C9078d(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        this.f35629b = byteBuffer;
    }

    /* renamed from: c */
    public void mo31649c() throws C9015a {
        while (this.f35629b.hasRemaining()) {
            if (this.f35629b.get() == 101) {
                ByteBuffer slice = this.f35629b.slice();
                boolean z = false;
                boolean z2 = (slice.get() == 115) & (slice.get() == 100);
                if (slice.get() == 115) {
                    z = true;
                }
                if (z2 && z) {
                    ByteBuffer byteBuffer = this.f35629b;
                    byteBuffer.position((byteBuffer.position() - 1) - 4);
                    return;
                }
            }
        }
    }
}
