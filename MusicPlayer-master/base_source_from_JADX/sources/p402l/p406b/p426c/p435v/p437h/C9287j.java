package p402l.p406b.p426c.p435v.p437h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.List;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p426c.p435v.p436g.C9275a;

/* renamed from: l.b.c.v.h.j */
/* compiled from: Mp4TagTextNumberField */
public class C9287j extends C9286i {

    /* renamed from: l */
    protected List<Short> f35998l;

    public C9287j(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32118a(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        C9077c cVar = new C9077c(byteBuffer);
        C9275a aVar = new C9275a(cVar, byteBuffer);
        this.f35996j = cVar.mo31639a();
        this.f35997k = aVar.mo32123d();
        this.f35998l = aVar.mo32124e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo32119b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (Short shortValue : this.f35998l) {
            try {
                byteArrayOutputStream.write(C9057i.m48310m(shortValue.shortValue()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: d */
    public C9279b mo32120d() {
        return C9279b.IMPLICIT;
    }

    public C9287j(String str, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        super(str, byteBuffer);
    }
}
