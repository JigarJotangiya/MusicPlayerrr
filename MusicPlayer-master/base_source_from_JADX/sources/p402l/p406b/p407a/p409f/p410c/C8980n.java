package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import p402l.p406b.p407a.p409f.p412e.C9014c;
import p402l.p406b.p425b.C9118b;

/* renamed from: l.b.a.f.c.n */
/* compiled from: LanguageList */
public class C8980n extends C8970d {

    /* renamed from: d */
    private final List<String> f35416d = new ArrayList();

    public C8980n(long j, BigInteger bigInteger) {
        super(C8978l.f35402n, j, bigInteger);
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        StringBuilder sb = new StringBuilder(super.mo31303e(str));
        for (int i = 0; i < mo31383i(); i++) {
            sb.append(str);
            sb.append("  |-> ");
            sb.append(i);
            sb.append(" : ");
            sb.append(mo31382h(i));
            sb.append(C9014c.f35470a);
        }
        return sb.toString();
    }

    /* renamed from: g */
    public void mo31381g(String str) {
        if (str.length() >= 127) {
            throw new IllegalArgumentException(C9118b.WMA_LENGTH_OF_LANGUAGE_IS_TOO_LARGE.getMsg(Integer.valueOf((str.length() * 2) + 2)));
        } else if (!this.f35416d.contains(str)) {
            this.f35416d.add(str);
        }
    }

    /* renamed from: h */
    public String mo31382h(int i) {
        return this.f35416d.get(i);
    }

    /* renamed from: i */
    public int mo31383i() {
        return this.f35416d.size();
    }
}
