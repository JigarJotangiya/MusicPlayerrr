package p402l.p406b.p426c.p429r;

import java.util.Map;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.p433l0.C9230a;
import p402l.p406b.p426c.p431t.p433l0.C9231b;
import p402l.p406b.p426c.p431t.p433l0.C9232c;
import p402l.p406b.p426c.p431t.p433l0.C9234e;
import p402l.p406b.p426c.p431t.p433l0.C9235f;
import p402l.p406b.p426c.p431t.p433l0.C9236g;
import p402l.p406b.p426c.p431t.p433l0.C9237h;
import p402l.p406b.p426c.p439x.C9290a;
import p402l.p406b.p426c.p439x.C9293d;
import p402l.p406b.p441d.C9300a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.l */
/* compiled from: NumberHashMap */
public class C9157l extends C9156k {

    /* renamed from: f */
    private Map<Integer, String> f35787f = null;

    /* renamed from: g */
    private Map<String, Integer> f35788g = null;

    /* renamed from: h */
    private boolean f35789h = false;

    public C9157l(String str, C9190g gVar, int i) {
        super(str, gVar, i);
        if (str.equals("Genre")) {
            this.f35788g = C9290a.m49277h().mo31792c();
            this.f35787f = C9290a.m49277h().mo31790a();
            this.f35789h = true;
        } else if (str.equals("TextEncoding")) {
            this.f35788g = C9237h.m49061g().mo31792c();
            this.f35787f = C9237h.m49061g().mo31790a();
        } else if (str.equals("InterpolationMethod")) {
            this.f35788g = C9234e.m49058g().mo31792c();
            this.f35787f = C9234e.m49058g().mo31790a();
        } else if (str.equals("PictureType")) {
            this.f35788g = C9293d.m49282g().mo31792c();
            this.f35787f = C9293d.m49282g().mo31790a();
            this.f35789h = true;
        } else if (str.equals("TypeOfEvent")) {
            this.f35788g = C9232c.m49057g().mo31792c();
            this.f35787f = C9232c.m49057g().mo31790a();
        } else if (str.equals("TimeStampFormat")) {
            this.f35788g = C9231b.m49056g().mo31792c();
            this.f35787f = C9231b.m49056g().mo31790a();
        } else if (str.equals("TypeOfChannel")) {
            this.f35788g = C9230a.m49055g().mo31792c();
            this.f35787f = C9230a.m49055g().mo31790a();
        } else if (str.equals("RecievedAs")) {
            this.f35788g = C9235f.m49059g().mo31792c();
            this.f35787f = C9235f.m49059g().mo31790a();
        } else if (str.equals("contentType")) {
            this.f35788g = C9236g.m49060g().mo31792c();
            this.f35787f = C9236g.m49060g().mo31790a();
        } else {
            throw new IllegalArgumentException("Hashmap identifier not defined in this class: " + str);
        }
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        super.mo31778e(bArr, i);
        Integer valueOf = Integer.valueOf(((Long) this.f35771a).intValue());
        if (this.f35787f.containsKey(valueOf)) {
            return;
        }
        if (!this.f35789h) {
            throw new C9124d(C9118b.MP3_REFERENCE_KEY_INVALID.getMsg(this.f35772b, valueOf));
        } else if (this.f35772b.equals("PictureType")) {
            C9146a.f35770e.warning(C9118b.MP3_PICTURE_TYPE_INVALID.getMsg(this.f35771a));
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9157l)) {
            return false;
        }
        C9157l lVar = (C9157l) obj;
        if (!C9300a.m49300c(this.f35789h, lVar.f35789h) || !C9300a.m49299b(this.f35787f, lVar.f35787f) || !C9300a.m49299b(this.f35788g, lVar.f35788g) || !super.equals(lVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo31781g(Object obj) {
        if (obj instanceof Byte) {
            this.f35771a = Long.valueOf((long) ((Byte) obj).byteValue());
        } else if (obj instanceof Short) {
            this.f35771a = Long.valueOf((long) ((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            this.f35771a = Long.valueOf((long) ((Integer) obj).intValue());
        } else {
            this.f35771a = obj;
        }
    }

    public String toString() {
        Object obj = this.f35771a;
        if (obj == null || this.f35787f.get(obj) == null) {
            return BuildConfig.FLAVOR;
        }
        return this.f35787f.get(this.f35771a);
    }
}
