package p082e.p126k.p129c;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.C8902r0;
import p082e.p126k.p127b.C3816d;
import p082e.p126k.p127b.C3823f;
import p082e.p126k.p127b.p128p.C3861b;
import p082e.p126k.p129c.p130i.C3882c;
import p082e.p126k.p129c.p130i.C3884d;
import p369i.p370a0.C8374a;
import p369i.p374d0.C8399f;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: e.k.c.c */
/* compiled from: PreferenceDataStoreDelegate.kt */
public final class C3865c implements C8374a<Context, C3823f<C3884d>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f11957a;

    /* renamed from: b */
    private final C3861b<C3884d> f11958b;

    /* renamed from: c */
    private final C8570l<Context, List<C3816d<C3884d>>> f11959c;

    /* renamed from: d */
    private final C8902r0 f11960d;

    /* renamed from: e */
    private final Object f11961e = new Object();

    /* renamed from: f */
    private volatile C3823f<C3884d> f11962f;

    /* renamed from: e.k.c.c$a */
    /* compiled from: PreferenceDataStoreDelegate.kt */
    static final class C3866a extends C8595m implements C8559a<File> {
        final /* synthetic */ Context $applicationContext;
        final /* synthetic */ C3865c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3866a(Context context, C3865c cVar) {
            super(0);
            this.$applicationContext = context;
            this.this$0 = cVar;
        }

        public final File invoke() {
            Context context = this.$applicationContext;
            C8594l.m46770d(context, "applicationContext");
            return C3864b.m16519a(context, this.this$0.f11957a);
        }
    }

    public C3865c(String str, C3861b<C3884d> bVar, C8570l<? super Context, ? extends List<? extends C3816d<C3884d>>> lVar, C8902r0 r0Var) {
        C8594l.m46771e(str, "name");
        C8594l.m46771e(lVar, "produceMigrations");
        C8594l.m46771e(r0Var, "scope");
        this.f11957a = str;
        this.f11959c = lVar;
        this.f11960d = r0Var;
    }

    /* renamed from: c */
    public C3823f<C3884d> mo13352a(Context context, C8399f<?> fVar) {
        C3823f<C3884d> fVar2;
        C8594l.m46771e(context, "thisRef");
        C8594l.m46771e(fVar, "property");
        C3823f<C3884d> fVar3 = this.f11962f;
        if (fVar3 != null) {
            return fVar3;
        }
        synchronized (this.f11961e) {
            if (this.f11962f == null) {
                Context applicationContext = context.getApplicationContext();
                C3882c cVar = C3882c.f11970a;
                C3861b<C3884d> bVar = this.f11958b;
                C8570l<Context, List<C3816d<C3884d>>> lVar = this.f11959c;
                C8594l.m46770d(applicationContext, "applicationContext");
                this.f11962f = cVar.mo13389a(bVar, lVar.invoke(applicationContext), this.f11960d, new C3866a(applicationContext, this));
            }
            fVar2 = this.f11962f;
            C8594l.m46769c(fVar2);
        }
        return fVar2;
    }
}
