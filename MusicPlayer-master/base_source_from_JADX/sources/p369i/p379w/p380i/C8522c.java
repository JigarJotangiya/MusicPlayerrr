package p369i.p379w.p380i;

import java.util.Objects;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.C8519h;
import p369i.p379w.p381j.p382a.C8528a;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8535h;
import p369i.p379w.p381j.p382a.C8538j;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8606x;

/* renamed from: i.w.i.c */
/* compiled from: IntrinsicsJvm.kt */
class C8522c {

    /* renamed from: i.w.i.c$a */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C8523a extends C8538j {
        final /* synthetic */ C8508d $completion;
        final /* synthetic */ C8570l $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8523a(C8508d dVar, C8508d dVar2, C8570l lVar) {
            super(dVar2);
            this.$completion = dVar;
            this.$this_createCoroutineUnintercepted$inlined = lVar;
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                C8450m.m46575b(obj);
                C8570l lVar = this.$this_createCoroutineUnintercepted$inlined;
                Objects.requireNonNull(lVar, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                C8606x.m46798b(lVar, 1);
                return lVar.invoke(this);
            } else if (i == 1) {
                this.label = 2;
                C8450m.m46575b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: i.w.i.c$b */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C8524b extends C8531d {
        final /* synthetic */ C8508d $completion;
        final /* synthetic */ C8513g $context;
        final /* synthetic */ C8570l $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8524b(C8508d dVar, C8513g gVar, C8508d dVar2, C8513g gVar2, C8570l lVar) {
            super(dVar2, gVar2);
            this.$completion = dVar;
            this.$context = gVar;
            this.$this_createCoroutineUnintercepted$inlined = lVar;
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                C8450m.m46575b(obj);
                C8570l lVar = this.$this_createCoroutineUnintercepted$inlined;
                Objects.requireNonNull(lVar, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                C8606x.m46798b(lVar, 1);
                return lVar.invoke(this);
            } else if (i == 1) {
                this.label = 2;
                C8450m.m46575b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: i.w.i.c$c */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C8525c extends C8538j {
        final /* synthetic */ C8508d $completion;
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ C8574p $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8525c(C8508d dVar, C8508d dVar2, C8574p pVar, Object obj) {
            super(dVar2);
            this.$completion = dVar;
            this.$this_createCoroutineUnintercepted$inlined = pVar;
            this.$receiver$inlined = obj;
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                C8450m.m46575b(obj);
                C8574p pVar = this.$this_createCoroutineUnintercepted$inlined;
                Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                C8606x.m46798b(pVar, 2);
                return pVar.invoke(this.$receiver$inlined, this);
            } else if (i == 1) {
                this.label = 2;
                C8450m.m46575b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: i.w.i.c$d */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C8526d extends C8531d {
        final /* synthetic */ C8508d $completion;
        final /* synthetic */ C8513g $context;
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ C8574p $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8526d(C8508d dVar, C8513g gVar, C8508d dVar2, C8513g gVar2, C8574p pVar, Object obj) {
            super(dVar2, gVar2);
            this.$completion = dVar;
            this.$context = gVar;
            this.$this_createCoroutineUnintercepted$inlined = pVar;
            this.$receiver$inlined = obj;
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                C8450m.m46575b(obj);
                C8574p pVar = this.$this_createCoroutineUnintercepted$inlined;
                Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                C8606x.m46798b(pVar, 2);
                return pVar.invoke(this.$receiver$inlined, this);
            } else if (i == 1) {
                this.label = 2;
                C8450m.m46575b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <T> C8508d<C8457t> m46719a(C8570l<? super C8508d<? super T>, ? extends Object> lVar, C8508d<? super T> dVar) {
        C8594l.m46771e(lVar, "$this$createCoroutineUnintercepted");
        C8594l.m46771e(dVar, "completion");
        C8535h.m46735a(dVar);
        if (lVar instanceof C8528a) {
            return ((C8528a) lVar).create(dVar);
        }
        C8513g context = dVar.getContext();
        if (context == C8519h.INSTANCE) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new C8523a(dVar, dVar, lVar);
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new C8524b(dVar, context, dVar, context, lVar);
    }

    /* renamed from: b */
    public static <R, T> C8508d<C8457t> m46720b(C8574p<? super R, ? super C8508d<? super T>, ? extends Object> pVar, R r, C8508d<? super T> dVar) {
        C8594l.m46771e(pVar, "$this$createCoroutineUnintercepted");
        C8594l.m46771e(dVar, "completion");
        C8535h.m46735a(dVar);
        if (pVar instanceof C8528a) {
            return ((C8528a) pVar).create(r, dVar);
        }
        C8513g context = dVar.getContext();
        if (context == C8519h.INSTANCE) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new C8525c(dVar, dVar, pVar, r);
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new C8526d(dVar, context, dVar, context, pVar, r);
    }

    /* renamed from: c */
    public static <T> C8508d<T> m46721c(C8508d<? super T> dVar) {
        C8508d<Object> intercepted;
        C8594l.m46771e(dVar, "$this$intercepted");
        C8531d dVar2 = (C8531d) (!(dVar instanceof C8531d) ? null : dVar);
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
