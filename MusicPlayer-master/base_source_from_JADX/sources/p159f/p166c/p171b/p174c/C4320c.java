package p159f.p166c.p171b.p174c;

import p159f.p166c.p171b.p172a.C4313a;
import p159f.p166c.p171b.p172a.C4314b;
import p159f.p166c.p171b.p174c.C4322e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.b.c.c */
/* compiled from: DatabaseConfig.kt */
public final class C4320c extends C4319b {

    /* renamed from: a */
    private static final C4313a f12908a = new C4313a();

    /* renamed from: b */
    private static C4322e f12909b;

    /* renamed from: c */
    public static final C4320c f12910c = new C4320c();

    private C4320c() {
    }

    /* renamed from: a */
    public C4313a mo14740a() {
        mo14741b();
        return f12908a;
    }

    /* renamed from: b */
    public void mo14741b() {
        C4313a aVar = f12908a;
        if (aVar.mo14698h() == null) {
            throw new IllegalArgumentException("tableFiveName is null!");
        } else if (aVar.mo14699i() == null) {
            throw new IllegalArgumentException("tableTenName is null!");
        } else if (aVar.mo14694d() == null) {
            throw new IllegalArgumentException("idKey is null！");
        } else if (aVar.mo14695e() == null) {
            throw new IllegalArgumentException("nameKey is null!");
        } else if (aVar.mo14691a() == null) {
            throw new IllegalArgumentException("dataFiveKey is null!");
        } else if (aVar.mo14692b() == null) {
            throw new IllegalArgumentException("dataTenKey is null!");
        } else if (aVar.mo14702l() == null) {
            throw new IllegalArgumentException("isTenBand is null!");
        }
    }

    /* renamed from: c */
    public C4320c mo14742c() {
        if (f12909b == null) {
            C4313a aVar = f12908a;
            if (!(aVar.mo14698h() == null && aVar.mo14699i() == null && aVar.mo14694d() == null && aVar.mo14695e() == null && aVar.mo14691a() == null && aVar.mo14692b() == null)) {
                throw new UnsupportedOperationException("setDefaultConfig() was called before !");
            }
        }
        C4313a aVar2 = f12908a;
        aVar2.mo14708r("equalizer");
        aVar2.mo14709s("new_equalizer");
        aVar2.mo14705o("_id");
        aVar2.mo14706p("name");
        C4322e.C4323a aVar3 = C4322e.f12913c;
        aVar2.mo14703m(aVar3.mo14745a());
        aVar2.mo14704n(aVar3.mo14746b());
        if (f12909b == null) {
            f12909b = new C4322e();
        }
        return this;
    }

    /* renamed from: d */
    public C4320c mo14743d(boolean z) {
        f12908a.mo14710t(Boolean.valueOf(z));
        return this;
    }

    /* renamed from: e */
    public C4320c mo14744e(C4314b bVar) {
        C8594l.m46771e(bVar, "order");
        if ((bVar.mo14711a() == 2 || bVar.mo14711a() == 3) && f12908a.mo14697g() == null) {
            throw new IllegalArgumentException("setSortKey() has not been called ! Please setSortKey() first!");
        }
        f12908a.mo14707q(bVar);
        return this;
    }
}
