package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.c.r */
/* compiled from: StreamBitratePropertiesChunk */
public class C8985r extends C8970d {

    /* renamed from: d */
    private final List<Long> f35431d = new ArrayList();

    /* renamed from: e */
    private final List<Integer> f35432e = new ArrayList();

    public C8985r(BigInteger bigInteger) {
        super(C8978l.f35407s, bigInteger);
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        for (int i = 0; i < this.f35431d.size(); i++) {
            sb.append(str);
            sb.append("  |-> Stream no. \"");
            sb.append(this.f35432e.get(i));
            sb.append("\" has an average bitrate of \"");
            sb.append(this.f35431d.get(i));
            sb.append('\"');
            sb.append(C9014c.f35470a);
        }
        return sb.toString();
    }

    /* renamed from: g */
    public void mo31432g(int i, long j) {
        this.f35432e.add(Integer.valueOf(i));
        this.f35431d.add(Long.valueOf(j));
    }
}
