package p402l.p406b.p426c.p431t.p432k0;

import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9168u;
import p402l.p406b.p426c.p431t.p433l0.C9233d;
import p402l.p406b.p426c.p439x.C9290a;

/* renamed from: l.b.c.t.k0.l */
/* compiled from: FrameBodyTCON */
public class C9214l extends C9199a implements C9206d0, C9204c0 {
    public C9214l() {
    }

    /* renamed from: A */
    private static String m48967A(Object obj) {
        return "(" + obj + ')';
    }

    /* renamed from: B */
    public static String m48968B(String str) {
        return m48969C(str);
    }

    /* renamed from: C */
    public static String m48969C(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt < C9290a.m49278i() ? m48967A(String.valueOf(parseInt)) : str;
        } catch (NumberFormatException unused) {
            Integer g = C9290a.m49277h().mo32138g(str);
            if (g != null) {
                return m48967A(String.valueOf(g));
            }
            C9233d dVar = C9233d.RX;
            if (str.equalsIgnoreCase(dVar.getDescription())) {
                return m48967A(dVar.name());
            }
            C9233d dVar2 = C9233d.CR;
            if (str.equalsIgnoreCase(dVar2.getDescription())) {
                return m48967A(dVar2.name());
            }
            if (str.equalsIgnoreCase(dVar.name())) {
                return m48967A(dVar.name());
            }
            return str.equalsIgnoreCase(dVar2.name()) ? m48967A(dVar2.name()) : str;
        }
    }

    /* renamed from: E */
    public static String m48970E(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt < C9290a.m49278i() ? String.valueOf(parseInt) : str;
        } catch (NumberFormatException unused) {
            Integer g = C9290a.m49277h().mo32138g(str);
            if (g != null) {
                return String.valueOf(g);
            }
            C9233d dVar = C9233d.RX;
            if (str.equalsIgnoreCase(dVar.getDescription())) {
                return dVar.name();
            }
            C9233d dVar2 = C9233d.CR;
            if (str.equalsIgnoreCase(dVar2.getDescription())) {
                return dVar2.name();
            }
            if (str.equalsIgnoreCase(dVar.name())) {
                return dVar.name();
            }
            return str.equalsIgnoreCase(dVar2.name()) ? dVar2.name() : str;
        }
    }

    /* renamed from: F */
    public void mo31989F() {
        ((C9168u) mo31940l("Text")).mo31842v(false);
    }

    /* renamed from: g */
    public String mo31857g() {
        return "TCON";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9157l("TextEncoding", this, 1));
        this.f35860i.add(new C9168u("Text", this));
    }

    public C9214l(byte b, String str) {
        super(b, str);
    }
}
