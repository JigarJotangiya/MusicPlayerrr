package p402l.p406b.p426c.p431t.p432k0;

import java.io.ByteArrayOutputStream;
import p402l.p406b.p426c.p429r.C9148c;
import p402l.p406b.p426c.p429r.C9154i;
import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9165r;
import p402l.p406b.p426c.p429r.C9169v;
import p402l.p406b.p426c.p429r.C9170w;
import p402l.p406b.p426c.p431t.C9239n;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.y */
/* compiled from: FrameBodyUSLT */
public class C9227y extends C9203c implements C9204c0, C9206d0 {
    public C9227y() {
        mo31946r("TextEncoding", (byte) 0);
        mo31946r("Language", BuildConfig.FLAVOR);
        mo31946r("Description", BuildConfig.FLAVOR);
        mo31946r("Lyrics", BuildConfig.FLAVOR);
    }

    /* renamed from: A */
    public String mo32027A() {
        return (String) mo31941m("Lyrics");
    }

    /* renamed from: B */
    public void mo32028B(String str) {
        mo31946r("Description", str);
    }

    /* renamed from: C */
    public void mo32029C(String str) {
        mo31946r("Lyrics", str);
    }

    /* renamed from: g */
    public String mo31857g() {
        return "USLT";
    }

    /* renamed from: o */
    public String mo31943o() {
        return mo32032z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9157l("TextEncoding", this, 1));
        this.f35860i.add(new C9165r("Language", this, 3));
        this.f35860i.add(new C9169v("Description", this));
        this.f35860i.add(new C9170w("Lyrics", this));
    }

    /* renamed from: w */
    public void mo31961w(ByteArrayOutputStream byteArrayOutputStream) {
        mo31947s(C9239n.m49078b(mo31939k(), mo31942n()));
        if (!((C9148c) mo31940l("Description")).mo31786i()) {
            mo31947s(C9239n.m49079c(mo31939k()));
        }
        if (!((C9148c) mo31940l("Lyrics")).mo31786i()) {
            mo31947s(C9239n.m49079c(mo31939k()));
        }
        super.mo31961w(byteArrayOutputStream);
    }

    /* renamed from: x */
    public void mo32030x(C9154i iVar) {
        mo32029C(mo32027A() + iVar.mo31804o());
    }

    /* renamed from: y */
    public String mo32031y() {
        return (String) mo31941m("Description");
    }

    /* renamed from: z */
    public String mo32032z() {
        return ((C9170w) mo31940l("Lyrics")).mo31838m(0);
    }

    public C9227y(byte b, String str, String str2, String str3) {
        mo31946r("TextEncoding", Byte.valueOf(b));
        mo31946r("Language", str);
        mo31946r("Description", str2);
        mo31946r("Lyrics", str3);
    }
}
