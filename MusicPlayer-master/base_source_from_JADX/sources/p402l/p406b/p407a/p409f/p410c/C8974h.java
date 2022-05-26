package p402l.p406b.p407a.p409f.p410c;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.c.h */
/* compiled from: ContentDescription */
public final class C8974h extends C8981o {

    /* renamed from: g */
    public static final Set<String> f35382g = new HashSet(Arrays.asList(new String[]{"AUTHOR", "COPYRIGHT", "DESCRIPTION", "RATING", "TITLE"}));

    public C8974h(long j, BigInteger bigInteger) {
        super(C8972f.CONTENT_DESCRIPTION, j, bigInteger);
    }

    /* renamed from: A */
    public void mo31356A(String str) throws IllegalArgumentException {
        mo31395t("DESCRIPTION", str);
    }

    /* renamed from: B */
    public void mo31357B(String str) throws IllegalArgumentException {
        mo31395t("COPYRIGHT", str);
    }

    /* renamed from: C */
    public void mo31358C(String str) throws IllegalArgumentException {
        mo31395t("RATING", str);
    }

    /* renamed from: D */
    public void mo31359D(String str) throws IllegalArgumentException {
        mo31395t("TITLE", str);
    }

    /* renamed from: a */
    public long mo31347a(OutputStream outputStream) throws IOException {
        long l = mo31348l();
        outputStream.write(mo31326b().mo31375b());
        C9014c.m48184r(mo31348l(), outputStream);
        C9014c.m48182p((mo31364y().length() * 2) + 2, outputStream);
        C9014c.m48182p((mo31360u().length() * 2) + 2, outputStream);
        C9014c.m48182p((mo31362w().length() * 2) + 2, outputStream);
        C9014c.m48182p((mo31361v().length() * 2) + 2, outputStream);
        C9014c.m48182p((mo31363x().length() * 2) + 2, outputStream);
        String y = mo31364y();
        Charset charset = C8968b.f35366g;
        outputStream.write(C9014c.m48170d(y, charset));
        byte[] bArr = C8968b.f35367h;
        outputStream.write(bArr);
        outputStream.write(C9014c.m48170d(mo31360u(), charset));
        outputStream.write(bArr);
        outputStream.write(C9014c.m48170d(mo31362w(), charset));
        outputStream.write(bArr);
        outputStream.write(C9014c.m48170d(mo31361v(), charset));
        outputStream.write(bArr);
        outputStream.write(C9014c.m48170d(mo31363x(), charset));
        outputStream.write(bArr);
        return l;
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        sb.append(str);
        sb.append("  |->Title      : ");
        sb.append(mo31364y());
        String str2 = C9014c.f35470a;
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Author     : ");
        sb.append(mo31360u());
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Copyright  : ");
        sb.append(mo31362w());
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Description: ");
        sb.append(mo31361v());
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Rating     :");
        sb.append(mo31363x());
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: l */
    public long mo31348l() {
        return ((long) (mo31360u().length() * 2)) + 44 + ((long) (mo31361v().length() * 2)) + ((long) (mo31363x().length() * 2)) + ((long) (mo31364y().length() * 2)) + ((long) (mo31362w().length() * 2));
    }

    /* renamed from: r */
    public boolean mo31349r(C8984q qVar) {
        return f35382g.contains(qVar.mo31423r()) && super.mo31349r(qVar);
    }

    /* renamed from: u */
    public String mo31360u() {
        return mo31392p("AUTHOR");
    }

    /* renamed from: v */
    public String mo31361v() {
        return mo31392p("DESCRIPTION");
    }

    /* renamed from: w */
    public String mo31362w() {
        return mo31392p("COPYRIGHT");
    }

    /* renamed from: x */
    public String mo31363x() {
        return mo31392p("RATING");
    }

    /* renamed from: y */
    public String mo31364y() {
        return mo31392p("TITLE");
    }

    /* renamed from: z */
    public void mo31365z(String str) throws IllegalArgumentException {
        mo31395t("AUTHOR", str);
    }
}
