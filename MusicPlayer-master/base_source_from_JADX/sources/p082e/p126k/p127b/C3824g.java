package p082e.p126k.p127b;

import java.io.File;
import java.util.List;
import kotlinx.coroutines.C8902r0;
import p082e.p126k.p127b.p128p.C3860a;
import p082e.p126k.p127b.p128p.C3861b;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p389d.C8594l;

/* renamed from: e.k.b.g */
/* compiled from: DataStoreFactory.kt */
public final class C3824g {

    /* renamed from: a */
    public static final C3824g f11924a = new C3824g();

    private C3824g() {
    }

    /* renamed from: a */
    public final <T> C3823f<T> mo13322a(C3828k<T> kVar, C3861b<T> bVar, List<? extends C3816d<T>> list, C8902r0 r0Var, C8559a<? extends File> aVar) {
        C8594l.m46771e(kVar, "serializer");
        C8594l.m46771e(list, "migrations");
        C8594l.m46771e(r0Var, "scope");
        C8594l.m46771e(aVar, "produceFile");
        C3814b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new C3860a();
        }
        return new C3832m(aVar, kVar, C8481k.m46661b(C3817e.f11923a.mo13315b(list)), bVar2, r0Var);
    }
}
