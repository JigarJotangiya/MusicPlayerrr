package p402l.p406b.p426c.p435v.p437h;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.p435v.C9269a;
import p402l.p406b.p426c.p435v.C9273e;
import p402l.p406b.p426c.p435v.p436g.C9275a;
import p402l.p406b.p426c.p439x.C9290a;

/* renamed from: l.b.c.v.h.c */
/* compiled from: Mp4GenreField */
public class C9280c extends C9287j {
    public C9280c(String str, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        super(str, byteBuffer);
    }

    /* renamed from: h */
    public static boolean m49243h(String str) {
        try {
            if (Short.parseShort(str) - 1 <= C9290a.m49279j()) {
                return true;
            }
        } catch (NumberFormatException unused) {
        }
        Integer e = C9290a.m49277h().mo31784e(str);
        if (e == null || e.intValue() > C9290a.m49279j()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32118a(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        C9077c cVar = new C9077c(byteBuffer);
        C9275a aVar = new C9275a(cVar, byteBuffer);
        this.f35996j = cVar.mo31639a();
        List<Short> e = aVar.mo32124e();
        this.f35998l = e;
        if (e.size() > 0) {
            short shortValue = this.f35998l.get(0).shortValue();
            String f = C9290a.m49277h().mo31785f(shortValue - 1);
            this.f35997k = f;
            if (f == null) {
                C9273e.f35970i.warning(C9118b.MP4_GENRE_OUT_OF_RANGE.getMsg(Integer.valueOf(shortValue)));
                return;
            }
            return;
        }
        C9273e.f35970i.warning(C9118b.MP4_NO_GENREID_FOR_GENRE.getMsg(Integer.valueOf(cVar.mo31639a())));
    }

    public C9280c(String str) {
        super(C9269a.GENRE.getFieldName(), str);
        try {
            short parseShort = Short.parseShort(str);
            if (parseShort <= C9290a.m49279j()) {
                ArrayList arrayList = new ArrayList();
                this.f35998l = arrayList;
                arrayList.add(Short.valueOf((short) (parseShort + 1)));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            this.f35998l = arrayList2;
            arrayList2.add((short) 1);
        } catch (NumberFormatException unused) {
            Integer e = C9290a.m49277h().mo31784e(str);
            if (e == null || e.intValue() > C9290a.m49279j()) {
                ArrayList arrayList3 = new ArrayList();
                this.f35998l = arrayList3;
                arrayList3.add((short) 1);
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            this.f35998l = arrayList4;
            arrayList4.add(Short.valueOf((short) (e.intValue() + 1)));
        }
    }
}
