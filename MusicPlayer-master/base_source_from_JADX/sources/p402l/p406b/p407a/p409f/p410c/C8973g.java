package p402l.p406b.p407a.p409f.p410c;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.c.g */
/* compiled from: ContentBranding */
public final class C8973g extends C8981o {

    /* renamed from: g */
    public static final Set<String> f35381g;

    static {
        HashSet hashSet = new HashSet();
        f35381g = hashSet;
        hashSet.add("BANNER_IMAGE");
        hashSet.add("BANNER_IMAGE_TYPE");
        hashSet.add("BANNER_IMAGE_URL");
        hashSet.add("COPYRIGHT_URL");
    }

    public C8973g(long j, BigInteger bigInteger) {
        super(C8972f.CONTENT_BRANDING, j, bigInteger);
    }

    /* renamed from: A */
    public void mo31346A(long j, byte[] bArr) {
        mo31386i("BANNER_IMAGE_TYPE", 3).mo31404C(j);
        mo31386i("BANNER_IMAGE", 1).mo31402A(bArr);
    }

    /* renamed from: a */
    public long mo31347a(OutputStream outputStream) throws IOException {
        long l = mo31348l();
        outputStream.write(mo31326b().mo31375b());
        C9014c.m48184r(l, outputStream);
        C9014c.m48183q(mo31353x(), outputStream);
        byte[] w = mo31352w();
        C9014c.m48183q((long) w.length, outputStream);
        outputStream.write(w);
        C9014c.m48183q((long) mo31350u().length(), outputStream);
        outputStream.write(mo31350u().getBytes("ASCII"));
        C9014c.m48183q((long) mo31351v().length(), outputStream);
        outputStream.write(mo31351v().getBytes("ASCII"));
        return l;
    }

    /* renamed from: l */
    public long mo31348l() {
        return ((long) mo31386i("BANNER_IMAGE", 1).mo31427u()) + 40 + ((long) mo31350u().length()) + ((long) mo31351v().length());
    }

    /* renamed from: r */
    public boolean mo31349r(C8984q qVar) {
        return f35381g.contains(qVar.mo31423r()) && super.mo31349r(qVar);
    }

    /* renamed from: u */
    public String mo31350u() {
        return mo31392p("BANNER_IMAGE_URL");
    }

    /* renamed from: v */
    public String mo31351v() {
        return mo31392p("COPYRIGHT_URL");
    }

    /* renamed from: w */
    public byte[] mo31352w() {
        return mo31386i("BANNER_IMAGE", 1).mo31425t();
    }

    /* renamed from: x */
    public long mo31353x() {
        if (!mo31393q("BANNER_IMAGE_TYPE")) {
            C8984q qVar = new C8984q(C8972f.CONTENT_BRANDING, "BANNER_IMAGE_TYPE", 3);
            qVar.mo31404C(0);
            mo31384g(qVar);
        }
        return mo31385h("BANNER_IMAGE_TYPE").mo31424s();
    }

    /* renamed from: y */
    public void mo31354y(String str) {
        if (C9014c.m48172f(str)) {
            mo31394s("BANNER_IMAGE_URL");
        } else {
            mo31385h("BANNER_IMAGE_URL").mo31409H(str);
        }
    }

    /* renamed from: z */
    public void mo31355z(String str) {
        if (C9014c.m48172f(str)) {
            mo31394s("COPYRIGHT_URL");
        } else {
            mo31385h("COPYRIGHT_URL").mo31409H(str);
        }
    }
}
