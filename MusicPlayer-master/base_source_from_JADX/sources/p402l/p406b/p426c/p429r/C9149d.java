package p402l.p406b.p426c.p429r;

import java.util.Collections;

/* renamed from: l.b.c.r.d */
/* compiled from: AbstractStringStringValuePair */
public class C9149d extends C9150e<String, String> {

    /* renamed from: f */
    protected String f35775f = null;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo31789d() {
        this.f35779d = this.f35776a.keySet().iterator();
        while (this.f35779d.hasNext()) {
            String str = (String) this.f35779d.next();
            this.f35775f = str;
            String str2 = (String) this.f35776a.get(str);
            this.f35780e = str2;
            this.f35777b.put(str2, this.f35775f);
        }
        this.f35779d = this.f35776a.keySet().iterator();
        while (this.f35779d.hasNext()) {
            this.f35778c.add(this.f35776a.get(this.f35779d.next()));
        }
        Collections.sort(this.f35778c);
    }
}
