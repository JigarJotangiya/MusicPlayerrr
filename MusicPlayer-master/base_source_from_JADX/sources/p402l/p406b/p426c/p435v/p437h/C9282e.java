package p402l.p406b.p426c.p435v.p437h;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.p435v.C9269a;
import p402l.p406b.p426c.p435v.p436g.C9275a;

/* renamed from: l.b.c.v.h.e */
/* compiled from: Mp4TagByteField */
public class C9282e extends C9286i {

    /* renamed from: n */
    public static String f35985n = "1";

    /* renamed from: o */
    public static String f35986o = "0";

    /* renamed from: l */
    private int f35987l;

    /* renamed from: m */
    private byte[] f35988m;

    public C9282e(C9269a aVar, String str, int i) throws C9122b {
        super(aVar.getFieldName(), str);
        this.f35987l = i;
        try {
            Long.parseLong(str);
        } catch (NumberFormatException unused) {
            throw new C9122b("Value of:" + str + " is invalid for field:" + aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32118a(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        C9077c cVar = new C9077c(byteBuffer);
        C9275a aVar = new C9275a(cVar, byteBuffer);
        int a = cVar.mo31639a();
        this.f35996j = a;
        this.f35987l = a - 8;
        this.f35988m = aVar.mo32122c();
        this.f35997k = aVar.mo32123d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo32119b() throws UnsupportedEncodingException {
        byte[] bArr = this.f35988m;
        if (bArr != null) {
            return bArr;
        }
        int i = this.f35987l;
        if (i == 1) {
            return new byte[]{new Short(this.f35997k).byteValue()};
        } else if (i == 2) {
            return C9057i.m48310m(new Short(this.f35997k).shortValue());
        } else {
            if (i == 4) {
                return C9057i.m48311n(new Integer(this.f35997k).intValue());
            }
            throw new RuntimeException(this.f35971g + ":" + this.f35987l + ":" + "Dont know how to write byte fields of this length");
        }
    }

    /* renamed from: d */
    public C9279b mo32120d() {
        return C9279b.INTEGER;
    }

    public C9282e(String str, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        super(str, byteBuffer);
    }
}
