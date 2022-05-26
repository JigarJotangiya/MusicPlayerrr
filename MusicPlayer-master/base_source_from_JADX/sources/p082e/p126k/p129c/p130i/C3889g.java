package p082e.p126k.p129c.p130i;

import p082e.p126k.p127b.C3823f;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;

/* renamed from: e.k.c.i.g */
/* compiled from: Preferences.kt */
public final class C3889g {

    @C8533f(mo30599c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", mo30600f = "Preferences.kt", mo30601l = {329}, mo30602m = "invokeSuspend")
    /* renamed from: e.k.c.i.g$a */
    /* compiled from: Preferences.kt */
    static final class C3890a extends C8539k implements C8574p<C3884d, C8508d<? super C3884d>, Object> {
        final /* synthetic */ C8574p<C3878a, C8508d<? super C8457t>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3890a(C8574p<? super C3878a, ? super C8508d<? super C8457t>, ? extends Object> pVar, C8508d<? super C3890a> dVar) {
            super(2, dVar);
            this.$transform = pVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C3890a aVar = new C3890a(this.$transform, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(C3884d dVar, C8508d<? super C3884d> dVar2) {
            return ((C3890a) create(dVar, dVar2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C3878a c = ((C3884d) this.L$0).mo13390c();
                C8574p<C3878a, C8508d<? super C8457t>, Object> pVar = this.$transform;
                this.L$0 = c;
                this.label = 1;
                return pVar.invoke(c, this) == d ? d : c;
            } else if (i == 1) {
                C3878a aVar = (C3878a) this.L$0;
                C8450m.m46575b(obj);
                return aVar;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: a */
    public static final Object m16603a(C3823f<C3884d> fVar, C8574p<? super C3878a, ? super C8508d<? super C8457t>, ? extends Object> pVar, C8508d<? super C3884d> dVar) {
        return fVar.mo13320a(new C3890a(pVar, (C8508d<? super C3890a>) null), dVar);
    }
}
