package p402l.p406b.p426c.p431t.p432k0;

import p402l.p406b.p426c.p429r.C9152g;
import p402l.p406b.p426c.p429r.C9166s;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.x */
/* compiled from: FrameBodyUFID */
public class C9226x extends C9203c implements C9206d0, C9204c0 {
    public C9226x() {
        mo32025y(BuildConfig.FLAVOR);
        mo32026z(new byte[0]);
    }

    /* renamed from: g */
    public String mo31857g() {
        return "UFID";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9166s("Owner", this));
        this.f35860i.add(new C9152g("Data", this));
    }

    /* renamed from: x */
    public String mo32024x() {
        return (String) mo31941m("Owner");
    }

    /* renamed from: y */
    public void mo32025y(String str) {
        mo31946r("Owner", str);
    }

    /* renamed from: z */
    public void mo32026z(byte[] bArr) {
        mo31946r("Data", bArr);
    }
}
