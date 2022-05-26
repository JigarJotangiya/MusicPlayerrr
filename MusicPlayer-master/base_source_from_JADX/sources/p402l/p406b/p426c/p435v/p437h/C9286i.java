package p402l.p406b.p426c.p435v.p437h;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p426c.C9135o;
import p402l.p406b.p426c.p435v.C9273e;
import p402l.p406b.p426c.p435v.p436g.C9275a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.v.h.i */
/* compiled from: Mp4TagTextField */
public class C9286i extends C9273e implements C9135o {

    /* renamed from: j */
    protected int f35996j;

    /* renamed from: k */
    protected String f35997k;

    public C9286i(String str, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        super(str, byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32118a(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        C9077c cVar = new C9077c(byteBuffer);
        C9275a aVar = new C9275a(cVar, byteBuffer);
        this.f35996j = cVar.mo31639a();
        this.f35997k = aVar.mo32123d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo32119b() throws UnsupportedEncodingException {
        return this.f35997k.getBytes(mo32135g());
    }

    /* renamed from: d */
    public C9279b mo32120d() {
        return C9279b.TEXT;
    }

    /* renamed from: g */
    public String mo32135g() {
        return "UTF-8";
    }

    public String getContent() {
        return this.f35997k;
    }

    public boolean isEmpty() {
        return this.f35997k.trim().equals(BuildConfig.FLAVOR);
    }

    public String toString() {
        return this.f35997k;
    }

    public C9286i(String str, String str2) {
        super(str);
        this.f35997k = str2;
    }
}
