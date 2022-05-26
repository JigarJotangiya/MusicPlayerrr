package p402l.p406b.p426c.p431t.p432k0;

import java.io.ByteArrayOutputStream;
import p402l.p406b.p426c.p429r.C9148c;
import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9167t;
import p402l.p406b.p426c.p429r.C9169v;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.b0 */
/* compiled from: FrameBodyWXXX */
public class C9202b0 extends C9201b implements C9206d0, C9204c0 {
    public C9202b0() {
        mo31946r("TextEncoding", (byte) 0);
        mo31946r("Description", BuildConfig.FLAVOR);
        mo31946r("URLLink", BuildConfig.FLAVOR);
    }

    /* renamed from: A */
    public String mo31967A() {
        return (String) mo31941m("Description");
    }

    /* renamed from: B */
    public void mo31968B(String str) {
        mo31946r("Description", str);
    }

    /* renamed from: g */
    public String mo31857g() {
        return "WXXX";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9157l("TextEncoding", this, 1));
        this.f35860i.add(new C9169v("Description", this));
        this.f35860i.add(new C9167t("URLLink", this));
    }

    /* renamed from: w */
    public void mo31961w(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((C9148c) mo31940l("Description")).mo31786i()) {
            mo31947s((byte) 1);
        }
        super.mo31961w(byteArrayOutputStream);
    }
}
