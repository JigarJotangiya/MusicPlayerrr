package p402l.p406b.p426c.p431t.p432k0;

import p402l.p406b.p426c.p429r.C9156k;
import p402l.p406b.p426c.p429r.C9158m;
import p402l.p406b.p426c.p429r.C9166s;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.h */
/* compiled from: FrameBodyPOPM */
public class C9210h extends C9203c implements C9206d0, C9204c0 {
    public C9210h() {
        mo31946r("Email", BuildConfig.FLAVOR);
        mo31946r("Rating", 0L);
        mo31946r("Counter", 0L);
    }

    /* renamed from: A */
    public void mo31982A(String str) {
        try {
            mo31984C((long) Integer.parseInt(str));
            mo31983B("no@email");
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: B */
    public void mo31983B(String str) {
        mo31946r("Email", str);
    }

    /* renamed from: C */
    public void mo31984C(long j) {
        mo31946r("Rating", Long.valueOf(j));
    }

    /* renamed from: g */
    public String mo31857g() {
        return "POPM";
    }

    /* renamed from: o */
    public String mo31943o() {
        return mo31986y() + ":" + mo31987z() + ":" + mo31985x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9166s("Email", this));
        this.f35860i.add(new C9156k("Rating", this, 1));
        this.f35860i.add(new C9158m("Counter", this, 0));
    }

    /* renamed from: x */
    public long mo31985x() {
        return ((Number) mo31941m("Counter")).longValue();
    }

    /* renamed from: y */
    public String mo31986y() {
        return (String) mo31941m("Email");
    }

    /* renamed from: z */
    public long mo31987z() {
        return ((Number) mo31941m("Rating")).longValue();
    }
}
