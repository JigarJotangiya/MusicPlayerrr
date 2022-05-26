package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.c.i */
/* compiled from: EncodingChunk */
public class C8975i extends C8970d {

    /* renamed from: d */
    private final List<String> f35383d = new ArrayList();

    public C8975i(BigInteger bigInteger) {
        super(C8978l.f35397i, bigInteger);
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        this.f35383d.iterator();
        for (String append : this.f35383d) {
            sb.append(str);
            sb.append("  | : ");
            sb.append(append);
            sb.append(C9014c.f35470a);
        }
        return sb.toString();
    }

    /* renamed from: g */
    public void mo31366g(String str) {
        this.f35383d.add(str);
    }
}
