package p082e.p126k.p129c;

import android.content.Context;
import java.util.List;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8906s0;
import kotlinx.coroutines.C8921v2;
import p082e.p126k.p127b.C3816d;
import p082e.p126k.p127b.C3823f;
import p082e.p126k.p127b.p128p.C3861b;
import p082e.p126k.p129c.p130i.C3884d;
import p369i.p370a0.C8374a;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: e.k.c.a */
/* compiled from: PreferenceDataStoreDelegate.kt */
public final class C3862a {

    /* renamed from: e.k.c.a$a */
    /* compiled from: PreferenceDataStoreDelegate.kt */
    static final class C3863a extends C8595m implements C8570l<Context, List<? extends C3816d<C3884d>>> {
        public static final C3863a INSTANCE = new C3863a();

        C3863a() {
            super(1);
        }

        public final List<C3816d<C3884d>> invoke(Context context) {
            C8594l.m46771e(context, "it");
            return C8482l.m46665f();
        }
    }

    /* renamed from: a */
    public static final C8374a<Context, C3823f<C3884d>> m16517a(String str, C3861b<C3884d> bVar, C8570l<? super Context, ? extends List<? extends C3816d<C3884d>>> lVar, C8902r0 r0Var) {
        C8594l.m46771e(str, "name");
        C8594l.m46771e(lVar, "produceMigrations");
        C8594l.m46771e(r0Var, "scope");
        return new C3865c(str, bVar, lVar, r0Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C8374a m16518b(String str, C3861b bVar, C8570l lVar, C8902r0 r0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            lVar = C3863a.INSTANCE;
        }
        if ((i & 8) != 0) {
            C8768g1 g1Var = C8768g1.f35122a;
            r0Var = C8906s0.m47808a(C8768g1.m47302b().plus(C8921v2.m47831b((C8665a2) null, 1, (Object) null)));
        }
        return m16517a(str, bVar, lVar, r0Var);
    }
}
