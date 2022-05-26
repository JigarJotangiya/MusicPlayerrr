package p402l.p406b.p426c.p431t.p432k0;

import java.io.ByteArrayOutputStream;
import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9169v;
import p402l.p406b.p426c.p429r.C9170w;
import p402l.p406b.p426c.p431t.C9239n;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.v */
/* compiled from: FrameBodyTXXX */
public class C9224v extends C9199a implements C9206d0, C9204c0 {
    public C9224v() {
        mo31946r("TextEncoding", (byte) 0);
        mo31946r("Description", BuildConfig.FLAVOR);
        mo31946r("Text", BuildConfig.FLAVOR);
    }

    /* renamed from: A */
    public String mo32022A() {
        return (String) mo31941m("Description");
    }

    /* renamed from: B */
    public void mo32023B(String str) {
        mo31946r("Description", str);
    }

    /* renamed from: g */
    public String mo31857g() {
        return "TXXX";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9157l("TextEncoding", this, 1));
        this.f35860i.add(new C9169v("Description", this));
        this.f35860i.add(new C9170w("Text", this));
    }

    /* renamed from: w */
    public void mo31961w(ByteArrayOutputStream byteArrayOutputStream) {
        mo31947s(C9239n.m49078b(mo31939k(), mo31942n()));
        if (!((C9169v) mo31940l("Description")).mo31786i()) {
            mo31947s(C9239n.m49079c(mo31939k()));
        }
        super.mo31961w(byteArrayOutputStream);
    }
}
