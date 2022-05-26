package p402l.p406b.p407a.p418k.p419j;

import java.nio.ByteBuffer;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p418k.C9067b;
import p402l.p406b.p425b.C9118b;

/* renamed from: l.b.a.k.j.j */
/* compiled from: Mp4MetaBox */
public class C9087j extends C9075a {
    public C9087j(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        this.f35629b = byteBuffer;
    }

    /* renamed from: c */
    public static C9087j m48469c(int i) {
        C9077c cVar = new C9077c(C9067b.META.getFieldName());
        cVar.mo31646j(i + 12);
        return new C9087j(cVar, ByteBuffer.allocate(4));
    }

    /* renamed from: d */
    public void mo31665d() throws C9015a {
        byte[] bArr = new byte[4];
        this.f35629b.get(bArr);
        if (bArr[0] != 0) {
            throw new C9015a(C9118b.MP4_FILE_META_ATOM_CHILD_DATA_NOT_NULL.getMsg());
        }
    }
}
