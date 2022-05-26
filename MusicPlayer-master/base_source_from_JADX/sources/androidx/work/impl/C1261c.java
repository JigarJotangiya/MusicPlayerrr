package androidx.work.impl;

import androidx.lifecycle.C0670e0;
import androidx.work.C1410o;
import androidx.work.impl.utils.p013o.C1396c;

/* renamed from: androidx.work.impl.c */
/* compiled from: OperationImpl */
public class C1261c implements C1410o {

    /* renamed from: c */
    private final C0670e0<C1410o.C1412b> f5121c = new C0670e0<>();

    /* renamed from: d */
    private final C1396c<C1410o.C1412b.C1415c> f5122d = C1396c.m7435u();

    public C1261c() {
        mo6565a(C1410o.f5469b);
    }

    /* renamed from: a */
    public void mo6565a(C1410o.C1412b bVar) {
        this.f5121c.mo4153l(bVar);
        if (bVar instanceof C1410o.C1412b.C1415c) {
            this.f5122d.mo6788q((C1410o.C1412b.C1415c) bVar);
        } else if (bVar instanceof C1410o.C1412b.C1413a) {
            this.f5122d.mo6789r(((C1410o.C1412b.C1413a) bVar).mo6825a());
        }
    }
}
