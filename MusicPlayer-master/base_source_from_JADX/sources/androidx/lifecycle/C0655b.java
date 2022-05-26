package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8676b1;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.lifecycle.b */
/* compiled from: CoroutineLiveData.kt */
public final class C0655b<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8665a2 f3266a;

    /* renamed from: b */
    private C8665a2 f3267b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0667e<T> f3268c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8574p<C0654a0<T>, C8508d<? super C8457t>, Object> f3269d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final long f3270e;

    /* renamed from: f */
    private final C8902r0 f3271f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C8559a<C8457t> f3272g;

    @C8533f(mo30599c = "androidx.lifecycle.BlockRunner$cancel$1", mo30600f = "CoroutineLiveData.kt", mo30601l = {187}, mo30602m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.b$a */
    /* compiled from: CoroutineLiveData.kt */
    static final class C0656a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        int label;
        final /* synthetic */ C0655b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0656a(C0655b bVar, C8508d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            return new C0656a(this.this$0, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0656a) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                long e = this.this$0.f3270e;
                this.label = 1;
                if (C8676b1.m47092a(e, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.this$0.f3268c.mo4148g()) {
                C8665a2 d2 = this.this$0.f3266a;
                if (d2 != null) {
                    C8665a2.C8666a.m47072a(d2, (CancellationException) null, 1, (Object) null);
                }
                this.this$0.f3266a = null;
            }
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "androidx.lifecycle.BlockRunner$maybeRun$1", mo30600f = "CoroutineLiveData.kt", mo30601l = {176}, mo30602m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.b$b */
    /* compiled from: CoroutineLiveData.kt */
    static final class C0657b extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C0655b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0657b(C0655b bVar, C8508d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            C0657b bVar = new C0657b(this.this$0, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0657b) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C0658b0 b0Var = new C0658b0(this.this$0.f3268c, ((C8902r0) this.L$0).mo4135x());
                C8574p a = this.this$0.f3269d;
                this.label = 1;
                if (a.invoke(b0Var, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f3272g.invoke();
            return C8457t.f34900a;
        }
    }

    public C0655b(C0667e<T> eVar, C8574p<? super C0654a0<T>, ? super C8508d<? super C8457t>, ? extends Object> pVar, long j, C8902r0 r0Var, C8559a<C8457t> aVar) {
        C8594l.m46771e(eVar, "liveData");
        C8594l.m46771e(pVar, "block");
        C8594l.m46771e(r0Var, "scope");
        C8594l.m46771e(aVar, "onDone");
        this.f3268c = eVar;
        this.f3269d = pVar;
        this.f3270e = j;
        this.f3271f = r0Var;
        this.f3272g = aVar;
    }

    /* renamed from: g */
    public final void mo4196g() {
        if (this.f3267b == null) {
            this.f3267b = C8875m.m47725b(this.f3271f, C8768g1.m47303c().mo30872P0(), (C8910t0) null, new C0656a(this, (C8508d) null), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    /* renamed from: h */
    public final void mo4197h() {
        C8665a2 a2Var = this.f3267b;
        if (a2Var != null) {
            C8665a2.C8666a.m47072a(a2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f3267b = null;
        if (this.f3266a == null) {
            this.f3266a = C8875m.m47725b(this.f3271f, (C8513g) null, (C8910t0) null, new C0657b(this, (C8508d) null), 3, (Object) null);
        }
    }
}
