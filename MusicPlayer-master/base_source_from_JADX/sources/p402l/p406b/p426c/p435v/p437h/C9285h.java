package p402l.p406b.p426c.p435v.p437h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9135o;
import p402l.p406b.p426c.p435v.C9269a;
import p402l.p406b.p426c.p435v.C9273e;
import p402l.p406b.p426c.p435v.p436g.C9275a;
import p402l.p406b.p426c.p435v.p436g.C9276b;
import p402l.p406b.p426c.p435v.p436g.C9277c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.v.h.h */
/* compiled from: Mp4TagReverseDnsField */
public class C9285h extends C9273e implements C9135o {

    /* renamed from: j */
    private String f35993j;

    /* renamed from: k */
    private String f35994k;

    /* renamed from: l */
    protected String f35995l;

    public C9285h(C9077c cVar, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        super(cVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32118a(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        C9077c cVar = new C9077c(byteBuffer);
        mo32134j(new C9276b(cVar, byteBuffer).mo32125c());
        byteBuffer.position(byteBuffer.position() + cVar.mo31639a());
        C9077c cVar2 = new C9077c(byteBuffer);
        mo32133i(new C9277c(cVar2, byteBuffer).mo32126c());
        byteBuffer.position(byteBuffer.position() + cVar2.mo31639a());
        if (this.f35972h.mo31639a() == cVar.mo31644f() + cVar2.mo31644f()) {
            this.f35971g = "----:" + this.f35993j + ":" + this.f35994k;
            mo32132h(BuildConfig.FLAVOR);
            C9273e.f35970i.warning(C9118b.MP4_REVERSE_DNS_FIELD_HAS_NO_DATA.getMsg(this.f35971g));
            return;
        }
        C9077c cVar3 = new C9077c(byteBuffer);
        mo32132h(new C9275a(cVar3, byteBuffer).mo32123d());
        byteBuffer.position(byteBuffer.position() + cVar3.mo31639a());
        this.f35971g = "----:" + this.f35993j + ":" + this.f35994k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo32119b() throws UnsupportedEncodingException {
        return this.f35995l.getBytes(mo32131g());
    }

    /* renamed from: c */
    public byte[] mo31499c() throws UnsupportedEncodingException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = this.f35993j.getBytes(mo32131g());
            byteArrayOutputStream.write(C9057i.m48311n(bytes.length + 12));
            byteArrayOutputStream.write(C9057i.m48300c("mean", "ISO-8859-1"));
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bytes);
            byte[] bytes2 = this.f35994k.getBytes(mo32131g());
            byteArrayOutputStream.write(C9057i.m48311n(bytes2.length + 12));
            byteArrayOutputStream.write(C9057i.m48300c("name", "ISO-8859-1"));
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bytes2);
            if (this.f35995l.length() > 0) {
                byteArrayOutputStream.write(mo32121e());
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(C9057i.m48311n(byteArrayOutputStream.size() + 8));
            byteArrayOutputStream2.write(C9057i.m48300c("----", "ISO-8859-1"));
            byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            return byteArrayOutputStream2.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public C9279b mo32120d() {
        return C9279b.TEXT;
    }

    /* renamed from: e */
    public byte[] mo32121e() throws UnsupportedEncodingException {
        Logger logger = C9273e.f35970i;
        logger.fine("Getting Raw data for:" + mo31497D());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = this.f35995l.getBytes(mo32131g());
            byteArrayOutputStream.write(C9057i.m48311n(bytes.length + 16));
            byteArrayOutputStream.write(C9057i.m48300c("data", "ISO-8859-1"));
            byteArrayOutputStream.write(new byte[]{0});
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) mo32120d().getFileClassId()});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bytes);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public String mo32131g() {
        return "UTF-8";
    }

    public String getContent() {
        return this.f35995l;
    }

    /* renamed from: h */
    public void mo32132h(String str) {
        this.f35995l = str;
    }

    /* renamed from: i */
    public void mo32133i(String str) {
        this.f35994k = str;
    }

    public boolean isEmpty() {
        return this.f35995l.trim().equals(BuildConfig.FLAVOR);
    }

    /* renamed from: j */
    public void mo32134j(String str) {
        this.f35993j = str;
    }

    public String toString() {
        return this.f35995l;
    }

    public C9285h(C9269a aVar, String str) {
        super(aVar.getFieldName());
        this.f35993j = aVar.getIssuer();
        this.f35994k = aVar.getIdentifier();
        this.f35995l = str;
    }
}
