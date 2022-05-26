package p402l.p406b.p426c.p431t.p432k0;

import p402l.p406b.p426c.p429r.C9152g;
import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9165r;
import p402l.p406b.p426c.p429r.C9166s;

/* renamed from: l.b.c.t.k0.i */
/* compiled from: FrameBodySYLT */
public class C9211i extends C9203c implements C9206d0, C9204c0 {
    public C9211i() {
    }

    /* renamed from: g */
    public String mo31857g() {
        return "SYLT";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9157l("TextEncoding", this, 1));
        this.f35860i.add(new C9165r("Language", this, 3));
        this.f35860i.add(new C9157l("TimeStampFormat", this, 1));
        this.f35860i.add(new C9157l("contentType", this, 1));
        this.f35860i.add(new C9166s("Description", this));
        this.f35860i.add(new C9152g("Data", this));
    }

    /* renamed from: x */
    public int mo31988x() {
        return ((Number) mo31941m("TimeStampFormat")).intValue();
    }

    public C9211i(int i, String str, int i2, int i3, String str2, byte[] bArr) {
        mo31946r("TextEncoding", Integer.valueOf(i));
        mo31946r("Language", str);
        mo31946r("TimeStampFormat", Integer.valueOf(i2));
        mo31946r("contentType", Integer.valueOf(i3));
        mo31946r("Description", str2);
        mo31946r("Data", bArr);
    }
}
