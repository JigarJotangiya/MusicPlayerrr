package androidx.lifecycle;

import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8864k;
import kotlinx.coroutines.C8902r0;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.lifecycle.b0 */
/* compiled from: CoroutineLiveData.kt */
public final class C0658b0<T> implements C0654a0<T> {

    /* renamed from: a */
    private final C8513g f3273a;

    /* renamed from: b */
    private C0667e<T> f3274b;

    @C8533f(mo30599c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", mo30600f = "CoroutineLiveData.kt", mo30601l = {98}, mo30602m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.b0$a */
    /* compiled from: CoroutineLiveData.kt */
    static final class C0659a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Object $value;
        int label;
        final /* synthetic */ C0658b0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0659a(C0658b0 b0Var, Object obj, C8508d dVar) {
            super(2, dVar);
            this.this$0 = b0Var;
            this.$value = obj;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            return new C0659a(this.this$0, this.$value, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0659a) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C0667e a = this.this$0.mo4198a();
                this.label = 1;
                if (a.mo4211s(this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.mo4198a().mo4156o(this.$value);
            return C8457t.f34900a;
        }
    }

    public C0658b0(C0667e<T> eVar, C8513g gVar) {
        C8594l.m46771e(eVar, "target");
        C8594l.m46771e(gVar, "context");
        this.f3274b = eVar;
        this.f3273a = gVar.plus(C8768g1.m47303c().mo30872P0());
    }

    /* renamed from: a */
    public final C0667e<T> mo4198a() {
        return this.f3274b;
    }

    public Object emit(T t, C8508d<? super C8457t> dVar) {
        Object e = C8864k.m47676e(this.f3273a, new C0659a(this, t, (C8508d) null), dVar);
        return e == C8527d.m46722d() ? e : C8457t.f34900a;
    }
}
