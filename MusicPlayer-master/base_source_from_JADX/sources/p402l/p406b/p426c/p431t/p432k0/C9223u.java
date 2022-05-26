package p402l.p406b.p426c.p431t.p432k0;

import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9162p;

/* renamed from: l.b.c.t.k0.u */
/* compiled from: FrameBodyTRCK */
public class C9223u extends C9203c implements C9204c0, C9206d0 {
    public C9223u() {
        mo31946r("TextEncoding", (byte) 0);
        mo31946r("Text", new C9162p.C9163a());
    }

    /* renamed from: A */
    public String mo32016A() {
        return ((C9162p.C9163a) mo31941m("Text")).mo31830d();
    }

    /* renamed from: B */
    public void mo32017B(String str) {
        ((C9162p.C9163a) mo31941m("Text")).mo31832h(str);
    }

    /* renamed from: C */
    public void mo32018C(String str) {
        ((C9162p.C9163a) mo31941m("Text")).mo31833i(str);
    }

    /* renamed from: g */
    public String mo31857g() {
        return "TRCK";
    }

    /* renamed from: o */
    public String mo31943o() {
        return String.valueOf(mo32019x());
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9157l("TextEncoding", this, 1));
        this.f35860i.add(new C9162p("Text", this));
    }

    /* renamed from: x */
    public Integer mo32019x() {
        return ((C9162p.C9163a) mo31941m("Text")).mo31827a();
    }

    /* renamed from: y */
    public String mo32020y() {
        return ((C9162p.C9163a) mo31941m("Text")).mo31828b();
    }

    /* renamed from: z */
    public Integer mo32021z() {
        return ((C9162p.C9163a) mo31941m("Text")).mo31829c();
    }

    public C9223u(byte b, String str) {
        mo31946r("TextEncoding", Byte.valueOf(b));
        mo31946r("Text", new C9162p.C9163a(str));
    }
}
