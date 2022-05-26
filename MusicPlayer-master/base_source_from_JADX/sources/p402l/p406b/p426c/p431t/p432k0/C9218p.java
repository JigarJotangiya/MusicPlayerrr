package p402l.p406b.p426c.p431t.p432k0;

import java.io.ByteArrayOutputStream;
import java.util.StringTokenizer;
import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9159n;
import p402l.p406b.p426c.p429r.C9160o;

/* renamed from: l.b.c.t.k0.p */
/* compiled from: FrameBodyTIPL */
public class C9218p extends C9203c implements C9206d0 {
    public C9218p() {
        mo31946r("TextEncoding", (byte) 0);
    }

    /* renamed from: A */
    public C9160o.C9161a mo32005A() {
        return (C9160o.C9161a) mo31940l("Text").mo31777d();
    }

    /* renamed from: B */
    public String mo32006B() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (C9159n next : ((C9160o) mo31940l("Text")).mo31777d().mo31820c()) {
            sb.append(next.mo31813a() + 0 + next.mo31814b());
            if (i != mo32009z()) {
                sb.append(0);
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: g */
    public String mo31857g() {
        return "TIPL";
    }

    /* renamed from: o */
    public String mo31943o() {
        return mo32006B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9157l("TextEncoding", this, 1));
        this.f35860i.add(new C9160o("Text", this));
    }

    /* renamed from: w */
    public void mo31961w(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((C9160o) mo31940l("Text")).mo31817i()) {
            mo31947s((byte) 1);
        }
        super.mo31961w(byteArrayOutputStream);
    }

    /* renamed from: x */
    public void mo32007x(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\u0000");
        if (stringTokenizer.countTokens() == 2) {
            mo32008y(stringTokenizer.nextToken(), stringTokenizer.nextToken());
        }
    }

    /* renamed from: y */
    public void mo32008y(String str, String str2) {
        ((C9160o) mo31940l("Text")).mo31777d().mo31819b(str, str2);
    }

    /* renamed from: z */
    public int mo32009z() {
        return ((C9160o) mo31940l("Text")).mo31777d().mo31821d();
    }
}
