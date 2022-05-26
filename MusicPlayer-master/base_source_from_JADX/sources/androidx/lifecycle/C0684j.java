package androidx.lifecycle;

import kotlinx.coroutines.p397f3.C8729b;
import kotlinx.coroutines.p397f3.C8730c;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.C8519h;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.lifecycle.j */
/* compiled from: FlowLiveData.kt */
public final class C0684j {

    @C8533f(mo30599c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", mo30600f = "FlowLiveData.kt", mo30601l = {149}, mo30602m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.j$a */
    /* compiled from: FlowLiveData.kt */
    static final class C0685a extends C8539k implements C8574p<C0654a0<T>, C8508d<? super C8457t>, Object> {
        final /* synthetic */ C8729b $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.lifecycle.j$a$a */
        /* compiled from: Collect.kt */
        public static final class C0686a implements C8730c<T> {

            /* renamed from: g */
            final /* synthetic */ C0654a0 f3303g;

            public C0686a(C0654a0 a0Var) {
                this.f3303g = a0Var;
            }

            public Object emit(Object obj, C8508d dVar) {
                Object emit = this.f3303g.emit(obj, dVar);
                if (emit == C8527d.m46722d()) {
                    return emit;
                }
                return C8457t.f34900a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0685a(C8729b bVar, C8508d dVar) {
            super(2, dVar);
            this.$this_asLiveData = bVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            C0685a aVar = new C0685a(this.$this_asLiveData, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0685a) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C8729b bVar = this.$this_asLiveData;
                C0686a aVar = new C0686a((C0654a0) this.L$0);
                this.label = 1;
                if (bVar.collect(aVar, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: a */
    public static final <T> LiveData<T> m4230a(C8729b<? extends T> bVar, C8513g gVar, long j) {
        C8594l.m46771e(bVar, "$this$asLiveData");
        C8594l.m46771e(gVar, "context");
        return C0671f.m4211a(gVar, j, new C0685a(bVar, (C8508d) null));
    }

    /* renamed from: b */
    public static /* synthetic */ LiveData m4231b(C8729b bVar, C8513g gVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C8519h.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return m4230a(bVar, gVar, j);
    }
}
