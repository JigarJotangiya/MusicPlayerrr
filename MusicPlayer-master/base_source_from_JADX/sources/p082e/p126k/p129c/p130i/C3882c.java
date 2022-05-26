package p082e.p126k.p129c.p130i;

import java.io.File;
import java.util.List;
import kotlinx.coroutines.C8902r0;
import p082e.p126k.p127b.C3816d;
import p082e.p126k.p127b.C3823f;
import p082e.p126k.p127b.C3824g;
import p082e.p126k.p127b.p128p.C3861b;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: e.k.c.i.c */
/* compiled from: PreferenceDataStoreFactory.kt */
public final class C3882c {

    /* renamed from: a */
    public static final C3882c f11970a = new C3882c();

    /* renamed from: e.k.c.i.c$a */
    /* compiled from: PreferenceDataStoreFactory.kt */
    static final class C3883a extends C8595m implements C8559a<File> {
        final /* synthetic */ C8559a<File> $produceFile;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3883a(C8559a<? extends File> aVar) {
            super(0);
            this.$produceFile = aVar;
        }

        public final File invoke() {
            File invoke = this.$produceFile.invoke();
            String c = C8555j.m46757c(invoke);
            C3891h hVar = C3891h.f11974a;
            if (C8594l.m46767a(c, hVar.mo13400f())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + hVar.mo13400f()).toString());
        }
    }

    private C3882c() {
    }

    /* renamed from: a */
    public final C3823f<C3884d> mo13389a(C3861b<C3884d> bVar, List<? extends C3816d<C3884d>> list, C8902r0 r0Var, C8559a<? extends File> aVar) {
        C8594l.m46771e(list, "migrations");
        C8594l.m46771e(r0Var, "scope");
        C8594l.m46771e(aVar, "produceFile");
        return new C3880b(C3824g.f11924a.mo13322a(C3891h.f11974a, bVar, list, r0Var, new C3883a(aVar)));
    }
}
