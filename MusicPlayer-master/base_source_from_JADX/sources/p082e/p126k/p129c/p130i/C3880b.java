package p082e.p126k.p129c.p130i;

import kotlinx.coroutines.p397f3.C8729b;
import p082e.p126k.p127b.C3823f;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: e.k.c.i.b */
/* compiled from: PreferenceDataStoreFactory.kt */
public final class C3880b implements C3823f<C3884d> {

    /* renamed from: a */
    private final C3823f<C3884d> f11969a;

    @C8533f(mo30599c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", mo30600f = "PreferenceDataStoreFactory.kt", mo30601l = {85}, mo30602m = "invokeSuspend")
    /* renamed from: e.k.c.i.b$a */
    /* compiled from: PreferenceDataStoreFactory.kt */
    static final class C3881a extends C8539k implements C8574p<C3884d, C8508d<? super C3884d>, Object> {
        final /* synthetic */ C8574p<C3884d, C8508d<? super C3884d>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3881a(C8574p<? super C3884d, ? super C8508d<? super C3884d>, ? extends Object> pVar, C8508d<? super C3881a> dVar) {
            super(2, dVar);
            this.$transform = pVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C3881a aVar = new C3881a(this.$transform, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(C3884d dVar, C8508d<? super C3884d> dVar2) {
            return ((C3881a) create(dVar, dVar2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C8574p<C3884d, C8508d<? super C3884d>, Object> pVar = this.$transform;
                this.label = 1;
                obj = pVar.invoke((C3884d) this.L$0, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C3884d dVar = (C3884d) obj;
            ((C3878a) dVar).mo13380f();
            return dVar;
        }
    }

    public C3880b(C3823f<C3884d> fVar) {
        C8594l.m46771e(fVar, "delegate");
        this.f11969a = fVar;
    }

    /* renamed from: a */
    public Object mo13320a(C8574p<? super C3884d, ? super C8508d<? super C3884d>, ? extends Object> pVar, C8508d<? super C3884d> dVar) {
        return this.f11969a.mo13320a(new C3881a(pVar, (C8508d<? super C3881a>) null), dVar);
    }

    /* renamed from: b */
    public C8729b<C3884d> mo13321b() {
        return this.f11969a.mo13321b();
    }
}
