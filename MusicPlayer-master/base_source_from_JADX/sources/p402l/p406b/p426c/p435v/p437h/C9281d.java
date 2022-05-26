package p402l.p406b.p426c.p435v.p437h;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p426c.p435v.C9273e;

/* renamed from: l.b.c.v.h.d */
/* compiled from: Mp4TagBinaryField */
public class C9281d extends C9273e {

    /* renamed from: j */
    protected int f35983j;

    /* renamed from: k */
    protected byte[] f35984k;

    public C9281d(String str, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        super(str, byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32118a(ByteBuffer byteBuffer) {
        this.f35983j = new C9077c(byteBuffer).mo31639a();
        byteBuffer.position(byteBuffer.position() + 8);
        this.f35984k = new byte[(this.f35983j - 8)];
        int i = 0;
        while (true) {
            byte[] bArr = this.f35984k;
            if (i < bArr.length) {
                bArr[i] = byteBuffer.get();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo32119b() throws UnsupportedEncodingException {
        return this.f35984k;
    }

    /* renamed from: d */
    public C9279b mo32120d() {
        return C9279b.IMPLICIT;
    }

    public boolean isEmpty() {
        return this.f35984k.length == 0;
    }
}
