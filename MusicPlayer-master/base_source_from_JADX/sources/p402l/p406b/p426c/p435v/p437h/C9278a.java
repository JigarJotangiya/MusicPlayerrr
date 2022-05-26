package p402l.p406b.p426c.p435v.p437h;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.p435v.C9269a;
import p402l.p406b.p426c.p435v.p436g.C9275a;

/* renamed from: l.b.c.v.h.a */
/* compiled from: Mp4DiscNoField */
public class C9278a extends C9287j {
    public C9278a(String str) throws C9122b {
        super(C9269a.DISCNUMBER.getFieldName(), str);
        ArrayList arrayList = new ArrayList();
        this.f35998l = arrayList;
        arrayList.add(new Short("0"));
        String[] split = str.split("/");
        int length = split.length;
        if (length == 1) {
            try {
                this.f35998l.add(Short.valueOf(Short.parseShort(split[0])));
                this.f35998l.add(new Short("0"));
            } catch (NumberFormatException unused) {
                throw new C9122b("Value of:" + split[0] + " is invalid for field:" + this.f35971g);
            }
        } else if (length == 2) {
            try {
                this.f35998l.add(Short.valueOf(Short.parseShort(split[0])));
                try {
                    this.f35998l.add(Short.valueOf(Short.parseShort(split[1])));
                } catch (NumberFormatException unused2) {
                    throw new C9122b("Value of:" + split[1] + " is invalid for field:" + this.f35971g);
                }
            } catch (NumberFormatException unused3) {
                throw new C9122b("Value of:" + split[0] + " is invalid for field:" + this.f35971g);
            }
        } else {
            throw new C9122b("Value is invalid for field:" + this.f35971g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32118a(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        C9077c cVar = new C9077c(byteBuffer);
        C9275a aVar = new C9275a(cVar, byteBuffer);
        this.f35996j = cVar.mo31639a();
        this.f35998l = aVar.mo32124e();
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f35998l.size() > 1 && this.f35998l.get(1).shortValue() > 0) {
            stringBuffer.append(this.f35998l.get(1));
        }
        if (this.f35998l.size() > 2 && this.f35998l.get(2).shortValue() > 0) {
            stringBuffer.append("/");
            stringBuffer.append(this.f35998l.get(2));
        }
        this.f35997k = stringBuffer.toString();
    }

    /* renamed from: h */
    public Short mo32127h() {
        return this.f35998l.get(1);
    }

    /* renamed from: i */
    public Short mo32128i() {
        if (this.f35998l.size() <= 2) {
            return 0;
        }
        return this.f35998l.get(2);
    }

    public C9278a(int i) {
        super(C9269a.DISCNUMBER.getFieldName(), String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        this.f35998l = arrayList;
        arrayList.add(new Short("0"));
        this.f35998l.add(Short.valueOf((short) i));
        this.f35998l.add(new Short("0"));
    }

    public C9278a(int i, int i2) {
        super(C9269a.DISCNUMBER.getFieldName(), String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        this.f35998l = arrayList;
        arrayList.add(new Short("0"));
        this.f35998l.add(Short.valueOf((short) i));
        this.f35998l.add(Short.valueOf((short) i2));
    }

    public C9278a(String str, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        super(str, byteBuffer);
    }
}
