package p402l.p406b.p426c.p435v.p436g;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.p419j.C9075a;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p426c.p435v.p437h.C9279b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.v.g.a */
/* compiled from: Mp4DataBox */
public class C9275a extends C9075a {

    /* renamed from: c */
    private int f35974c;

    /* renamed from: d */
    private String f35975d;

    /* renamed from: e */
    private List<Short> f35976e;

    /* renamed from: f */
    private byte[] f35977f;

    public C9275a(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        if (cVar.mo31643e().equals("data")) {
            ByteBuffer slice = byteBuffer.slice();
            this.f35629b = slice;
            int e = C9057i.m48302e(slice, 1, 3);
            this.f35974c = e;
            if (e == C9279b.TEXT.getFileClassId()) {
                this.f35975d = C9057i.m48313p(this.f35629b, 8, cVar.mo31639a() - 8, cVar.mo31640b());
                return;
            }
            int i = 0;
            if (this.f35974c == C9279b.IMPLICIT.getFileClassId()) {
                this.f35976e = new ArrayList();
                while (i < (cVar.mo31639a() - 8) / 2) {
                    int i2 = (i * 2) + 8;
                    this.f35976e.add(Short.valueOf(C9057i.m48309l(this.f35629b, i2, i2 + 1)));
                    i++;
                }
                StringBuffer stringBuffer = new StringBuffer();
                ListIterator<Short> listIterator = this.f35976e.listIterator();
                while (listIterator.hasNext()) {
                    stringBuffer.append(listIterator.next());
                    if (listIterator.hasNext()) {
                        stringBuffer.append("/");
                    }
                }
                this.f35975d = stringBuffer.toString();
            } else if (this.f35974c == C9279b.INTEGER.getFileClassId()) {
                this.f35975d = C9057i.m48302e(this.f35629b, 8, cVar.mo31639a() - 1) + BuildConfig.FLAVOR;
                this.f35977f = new byte[(cVar.mo31639a() - 8)];
                int position = byteBuffer.position();
                byteBuffer.position(position + 8);
                byteBuffer.get(this.f35977f);
                byteBuffer.position(position);
                this.f35976e = new ArrayList();
                while (i < (cVar.mo31639a() - 8) / 2) {
                    int i3 = (i * 2) + 8;
                    this.f35976e.add(Short.valueOf(C9057i.m48309l(this.f35629b, i3, i3 + 1)));
                    i++;
                }
            } else if (this.f35974c == C9279b.COVERART_JPEG.getFileClassId()) {
                this.f35975d = C9057i.m48313p(this.f35629b, 8, cVar.mo31639a() - 8, cVar.mo31640b());
            }
        } else {
            throw new RuntimeException("Unable to process data box because identifier is:" + cVar.mo31643e());
        }
    }

    /* renamed from: c */
    public byte[] mo32122c() {
        return this.f35977f;
    }

    /* renamed from: d */
    public String mo32123d() {
        return this.f35975d;
    }

    /* renamed from: e */
    public List<Short> mo32124e() {
        return this.f35976e;
    }
}
