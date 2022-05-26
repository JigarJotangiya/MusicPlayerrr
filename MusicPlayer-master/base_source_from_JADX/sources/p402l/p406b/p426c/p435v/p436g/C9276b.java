package p402l.p406b.p426c.p435v.p436g;

import java.nio.ByteBuffer;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.p419j.C9075a;
import p402l.p406b.p407a.p418k.p419j.C9077c;

/* renamed from: l.b.c.v.g.b */
/* compiled from: Mp4MeanBox */
public class C9276b extends C9075a {

    /* renamed from: c */
    private String f35978c;

    public C9276b(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        if (cVar.mo31643e().equals("mean")) {
            ByteBuffer slice = byteBuffer.slice();
            this.f35629b = slice;
            this.f35978c = C9057i.m48313p(slice, 4, cVar.mo31639a() - 4, cVar.mo31640b());
            return;
        }
        throw new RuntimeException("Unable to process data box because identifier is:" + cVar.mo31643e());
    }

    /* renamed from: c */
    public String mo32125c() {
        return this.f35978c;
    }
}
