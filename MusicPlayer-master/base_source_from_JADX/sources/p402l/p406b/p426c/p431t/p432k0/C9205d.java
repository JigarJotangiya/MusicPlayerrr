package p402l.p406b.p426c.p431t.p432k0;

import java.io.ByteArrayOutputStream;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.p429r.C9148c;
import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9165r;
import p402l.p406b.p426c.p429r.C9169v;
import p402l.p406b.p426c.p429r.C9170w;
import p402l.p406b.p426c.p431t.C9239n;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.d */
/* compiled from: FrameBodyCOMM */
public class C9205d extends C9203c implements C9206d0, C9204c0 {
    public C9205d() {
        mo31946r("TextEncoding", (byte) 0);
        mo31946r("Language", "eng");
        mo31946r("Description", BuildConfig.FLAVOR);
        mo31946r("Text", BuildConfig.FLAVOR);
    }

    /* renamed from: A */
    public void mo31971A(String str) {
        if (str != null) {
            mo31946r("Description", str);
            return;
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    /* renamed from: B */
    public void mo31972B(String str) {
        mo31946r("Language", str);
    }

    /* renamed from: C */
    public void mo31973C(String str) {
        if (str != null) {
            mo31946r("Text", str);
            return;
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    /* renamed from: g */
    public String mo31857g() {
        return "COMM";
    }

    /* renamed from: o */
    public String mo31943o() {
        return mo31975y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9157l("TextEncoding", this, 1));
        this.f35860i.add(new C9165r("Language", this, 3));
        this.f35860i.add(new C9169v("Description", this));
        this.f35860i.add(new C9170w("Text", this));
    }

    /* renamed from: w */
    public void mo31961w(ByteArrayOutputStream byteArrayOutputStream) {
        mo31947s(C9239n.m49078b(mo31939k(), mo31942n()));
        if (!((C9148c) mo31940l("Text")).mo31786i()) {
            mo31947s(C9239n.m49079c(mo31939k()));
        }
        if (!((C9148c) mo31940l("Description")).mo31786i()) {
            mo31947s(C9239n.m49079c(mo31939k()));
        }
        super.mo31961w(byteArrayOutputStream);
    }

    /* renamed from: x */
    public String mo31974x() {
        return (String) mo31941m("Description");
    }

    /* renamed from: y */
    public String mo31975y() {
        return ((C9170w) mo31940l("Text")).mo31838m(0);
    }

    /* renamed from: z */
    public boolean mo31976z() {
        String x = mo31974x();
        return (x == null || x.length() == 0 || !x.startsWith("Songs-DB")) ? false : true;
    }

    public C9205d(byte b, String str, String str2, String str3) {
        mo31946r("TextEncoding", Byte.valueOf(b));
        mo31946r("Language", str);
        mo31946r("Description", str2);
        mo31946r("Text", str3);
    }
}
