package p402l.p406b.p426c.p431t.p432k0;

import java.io.ByteArrayOutputStream;
import java.util.StringTokenizer;
import p402l.p406b.p426c.p429r.C9157l;
import p402l.p406b.p426c.p429r.C9159n;
import p402l.p406b.p426c.p429r.C9160o;

/* renamed from: l.b.c.t.k0.g */
/* compiled from: FrameBodyIPLS */
public class C9209g extends C9203c implements C9204c0 {
    public C9209g() {
        mo31946r("TextEncoding", (byte) 0);
    }

    /* renamed from: A */
    public String mo31978A() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (C9159n next : ((C9160o) mo31940l("Text")).mo31777d().mo31820c()) {
            sb.append(next.mo31813a() + 0 + next.mo31814b());
            if (i != mo31980y()) {
                sb.append(0);
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: g */
    public String mo31857g() {
        return "IPLS";
    }

    /* renamed from: o */
    public String mo31943o() {
        return mo31978A();
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
    public void mo31979x(String str) {
        C9160o.C9161a j = ((C9160o) mo31940l("Text")).mo31777d();
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\u0000");
        if (stringTokenizer.hasMoreTokens()) {
            j.mo31819b(stringTokenizer.nextToken(), stringTokenizer.nextToken());
        }
    }

    /* renamed from: y */
    public int mo31980y() {
        return ((C9160o) mo31940l("Text")).mo31777d().mo31821d();
    }

    /* renamed from: z */
    public C9160o.C9161a mo31981z() {
        return (C9160o.C9161a) mo31940l("Text").mo31777d();
    }
}
