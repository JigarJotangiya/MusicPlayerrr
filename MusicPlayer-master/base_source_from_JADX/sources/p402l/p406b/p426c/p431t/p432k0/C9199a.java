package p402l.p406b.p426c.p431t.p432k0;

import java.io.ByteArrayOutputStream;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9170w;
import p402l.p406b.p426c.p431t.C9239n;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.a */
/* compiled from: AbstractFrameBodyTextInfo */
public abstract class C9199a extends C9203c {
    protected C9199a() {
        mo31946r("TextEncoding", (byte) 0);
        mo31946r("Text", BuildConfig.FLAVOR);
    }

    /* renamed from: o */
    public String mo31943o() {
        return mo31963y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9157l("TextEncoding", this, 1));
        this.f35860i.add(new C9170w("Text", this));
    }

    /* renamed from: w */
    public void mo31961w(ByteArrayOutputStream byteArrayOutputStream) {
        mo31947s(C9239n.m49078b(mo31939k(), mo31942n()));
        if (!((C9170w) mo31940l("Text")).mo31786i()) {
            mo31947s(C9239n.m49079c(mo31939k()));
        }
        super.mo31961w(byteArrayOutputStream);
    }

    /* renamed from: x */
    public String mo31962x() {
        return (String) mo31941m("Text");
    }

    /* renamed from: y */
    public String mo31963y() {
        return ((C9170w) mo31940l("Text")).mo31839n();
    }

    /* renamed from: z */
    public void mo31964z(String str) {
        if (str != null) {
            mo31946r("Text", str);
            return;
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    protected C9199a(byte b, String str) {
        mo31946r("TextEncoding", Byte.valueOf(b));
        mo31946r("Text", str);
    }
}
