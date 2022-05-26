package p402l.p406b.p426c.p435v.p437h;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.p435v.C9269a;
import p402l.p406b.p426c.p435v.C9273e;

/* renamed from: l.b.c.v.h.f */
/* compiled from: Mp4TagCoverField */
public class C9283f extends C9281d {

    /* renamed from: l */
    private C9279b f35989l;

    /* renamed from: m */
    private int f35990m;

    public C9283f(ByteBuffer byteBuffer, C9279b bVar) throws UnsupportedEncodingException {
        super(C9269a.ARTWORK.getFieldName(), byteBuffer);
        this.f35989l = bVar;
        if (!C9279b.isCoverArtType(bVar)) {
            C9273e.f35970i.warning(C9118b.MP4_IMAGE_FORMAT_IS_NOT_TO_EXPECTED_TYPE.getMsg(bVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32118a(ByteBuffer byteBuffer) {
        C9077c cVar = new C9077c(byteBuffer);
        this.f35983j = cVar.mo31639a();
        this.f35990m = cVar.mo31644f();
        byteBuffer.position(byteBuffer.position() + 8);
        byte[] bArr = new byte[(this.f35983j - 8)];
        this.f35984k = bArr;
        byteBuffer.get(bArr, 0, bArr.length);
        int position = byteBuffer.position();
        if (byteBuffer.position() + 8 <= byteBuffer.limit()) {
            C9077c cVar2 = new C9077c(byteBuffer);
            if (cVar2.mo31643e().equals("name")) {
                this.f35983j += cVar2.mo31639a();
                this.f35990m += cVar2.mo31644f();
                return;
            }
            byteBuffer.position(position);
        }
    }

    /* renamed from: d */
    public C9279b mo32120d() {
        return this.f35989l;
    }

    /* renamed from: g */
    public int mo32130g() {
        return this.f35990m;
    }

    public String toString() {
        return this.f35989l + ":" + this.f35984k.length + "bytes";
    }
}
