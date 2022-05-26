package p402l.p406b.p426c.p429r;

import java.util.Collections;
import java.util.Map;

/* renamed from: l.b.c.r.b */
/* compiled from: AbstractIntStringValuePair */
public class C9147b extends C9150e<Integer, String> {
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo31783d() {
        for (Map.Entry next : this.f35776a.entrySet()) {
            this.f35777b.put(next.getValue(), next.getKey());
        }
        this.f35778c.addAll(this.f35776a.values());
        Collections.sort(this.f35778c);
    }

    /* renamed from: e */
    public Integer mo31784e(String str) {
        return (Integer) this.f35777b.get(str);
    }

    /* renamed from: f */
    public String mo31785f(int i) {
        return (String) this.f35776a.get(Integer.valueOf(i));
    }
}
