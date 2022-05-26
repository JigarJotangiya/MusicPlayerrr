package p402l.p406b.p426c.p435v.p437h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p426c.p435v.C9273e;

/* renamed from: l.b.c.v.h.g */
/* compiled from: Mp4TagRawBinaryField */
public class C9284g extends C9273e {

    /* renamed from: j */
    protected int f35991j;

    /* renamed from: k */
    protected byte[] f35992k;

    public C9284g(C9077c cVar, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        super(cVar.mo31643e());
        this.f35991j = cVar.mo31639a();
        mo32118a(byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32118a(ByteBuffer byteBuffer) {
        this.f35992k = new byte[this.f35991j];
        int i = 0;
        while (true) {
            byte[] bArr = this.f35992k;
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
        return this.f35992k;
    }

    /* renamed from: c */
    public byte[] mo31499c() throws UnsupportedEncodingException {
        Logger logger = C9273e.f35970i;
        logger.fine("Getting Raw data for:" + mo31497D());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(C9057i.m48311n(this.f35991j + 8));
            byteArrayOutputStream.write(C9057i.m48300c(mo31497D(), "ISO-8859-1"));
            byteArrayOutputStream.write(this.f35992k);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public C9279b mo32120d() {
        return C9279b.IMPLICIT;
    }

    public boolean isEmpty() {
        return this.f35992k.length == 0;
    }
}
