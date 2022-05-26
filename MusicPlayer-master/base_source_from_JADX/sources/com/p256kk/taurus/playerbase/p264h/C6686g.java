package com.p256kk.taurus.playerbase.p264h;

import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p264h.C6680d;

/* renamed from: com.kk.taurus.playerbase.h.g */
/* compiled from: RecordInvoker */
public class C6686g {

    /* renamed from: a */
    private C6678b f30083a;

    /* renamed from: b */
    private C6684f f30084b;

    public C6686g(C6680d.C6681a aVar) {
        this.f30083a = aVar.mo26026b();
        this.f30084b = new C6684f(aVar.mo26025a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo26034a(C6618a aVar) {
        return C6680d.m38377c(aVar);
    }

    /* renamed from: b */
    public int mo26035b(C6618a aVar) {
        C6678b bVar = this.f30083a;
        if (bVar != null) {
            return bVar.mo26021c(aVar);
        }
        return this.f30084b.mo26030a(mo26034a(aVar));
    }

    /* renamed from: c */
    public int mo26036c(C6618a aVar) {
        C6678b bVar = this.f30083a;
        if (bVar != null) {
            return bVar.mo26020b(aVar);
        }
        return this.f30084b.mo26031b(mo26034a(aVar), 0);
    }

    /* renamed from: d */
    public int mo26037d(C6618a aVar, int i) {
        C6678b bVar = this.f30083a;
        if (bVar != null) {
            return bVar.mo26019a(aVar, i);
        }
        return this.f30084b.mo26031b(mo26034a(aVar), i);
    }
}
