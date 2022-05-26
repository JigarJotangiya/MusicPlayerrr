package p082e.p126k.p127b;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.p396e3.C8704e;
import kotlinx.coroutines.p396e3.C8705f;
import kotlinx.coroutines.p396e3.C8707g;
import kotlinx.coroutines.p396e3.C8708h;
import kotlinx.coroutines.p396e3.C8714k;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: e.k.b.l */
/* compiled from: SimpleActor.kt */
public final class C3829l<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8902r0 f11927a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8574p<T, C8508d<? super C8457t>, Object> f11928b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8705f<T> f11929c = C8707g.m47200b(Integer.MAX_VALUE, (C8704e) null, (C8570l) null, 6, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicInteger f11930d = new AtomicInteger(0);

    /* renamed from: e.k.b.l$a */
    /* compiled from: SimpleActor.kt */
    static final class C3830a extends C8595m implements C8570l<Throwable, C8457t> {
        final /* synthetic */ C8570l<Throwable, C8457t> $onComplete;
        final /* synthetic */ C8574p<T, Throwable, C8457t> $onUndeliveredElement;
        final /* synthetic */ C3829l<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3830a(C8570l<? super Throwable, C8457t> lVar, C3829l<T> lVar2, C8574p<? super T, ? super Throwable, C8457t> pVar) {
            super(1);
            this.$onComplete = lVar;
            this.this$0 = lVar2;
            this.$onUndeliveredElement = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C8457t.f34900a;
        }

        public final void invoke(Throwable th) {
            C8457t tVar;
            this.$onComplete.invoke(th);
            this.this$0.f11929c.mo30940c(th);
            do {
                Object f = C8708h.m47206f(this.this$0.f11929c.mo30921a());
                if (f == null) {
                    tVar = null;
                    continue;
                } else {
                    this.$onUndeliveredElement.invoke(f, th);
                    tVar = C8457t.f34900a;
                    continue;
                }
            } while (tVar != null);
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SimpleActor$offer$2", mo30600f = "SimpleActor.kt", mo30601l = {122, 122}, mo30602m = "invokeSuspend")
    /* renamed from: e.k.b.l$b */
    /* compiled from: SimpleActor.kt */
    static final class C3831b extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ C3829l<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3831b(C3829l<T> lVar, C8508d<? super C3831b> dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C3831b(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C3831b) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p369i.p379w.p380i.C8527d.m46722d()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                p369i.C8450m.m46575b(r8)
                r8 = r7
                goto L_0x006e
            L_0x0013:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001b:
                java.lang.Object r1 = r7.L$0
                i.z.c.p r1 = (p369i.p387z.p388c.C8574p) r1
                p369i.C8450m.m46575b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L_0x0060
            L_0x0026:
                p369i.C8450m.m46575b(r8)
                e.k.b.l<T> r8 = r7.this$0
                java.util.concurrent.atomic.AtomicInteger r8 = r8.f11930d
                int r8 = r8.get()
                if (r8 <= 0) goto L_0x0037
                r8 = 1
                goto L_0x0038
            L_0x0037:
                r8 = 0
            L_0x0038:
                if (r8 == 0) goto L_0x007d
                r8 = r7
            L_0x003b:
                e.k.b.l<T> r1 = r8.this$0
                kotlinx.coroutines.r0 r1 = r1.f11927a
                kotlinx.coroutines.C8906s0.m47810c(r1)
                e.k.b.l<T> r1 = r8.this$0
                i.z.c.p r1 = r1.f11928b
                e.k.b.l<T> r4 = r8.this$0
                kotlinx.coroutines.e3.f r4 = r4.f11929c
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r4 = r4.mo30922b(r8)
                if (r4 != r0) goto L_0x005b
                return r0
            L_0x005b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L_0x0060:
                r5 = 0
                r0.L$0 = r5
                r0.label = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L_0x006c
                return r1
            L_0x006c:
                r8 = r0
                r0 = r1
            L_0x006e:
                e.k.b.l<T> r1 = r8.this$0
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f11930d
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L_0x003b
                i.t r8 = p369i.C8457t.f34900a
                return r8
            L_0x007d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3829l.C3831b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3829l(C8902r0 r0Var, C8570l<? super Throwable, C8457t> lVar, C8574p<? super T, ? super Throwable, C8457t> pVar, C8574p<? super T, ? super C8508d<? super C8457t>, ? extends Object> pVar2) {
        C8594l.m46771e(r0Var, "scope");
        C8594l.m46771e(lVar, "onComplete");
        C8594l.m46771e(pVar, "onUndeliveredElement");
        C8594l.m46771e(pVar2, "consumeMessage");
        this.f11927a = r0Var;
        this.f11928b = pVar2;
        C8665a2 a2Var = (C8665a2) r0Var.mo4135x().get(C8665a2.f35030f);
        if (a2Var != null) {
            a2Var.mo30863i0(new C3830a(lVar, this, pVar));
        }
    }

    /* renamed from: e */
    public final void mo13329e(T t) {
        Object d = this.f11929c.mo30941d(t);
        if (d instanceof C8708h.C8709a) {
            Throwable e = C8708h.m47205e(d);
            if (e == null) {
                e = new C8714k("Channel was closed normally");
            }
            throw e;
        } else if (!C8708h.m47208h(d)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f11930d.getAndIncrement() == 0) {
            C8665a2 unused = C8875m.m47725b(this.f11927a, (C8513g) null, (C8910t0) null, new C3831b(this, (C8508d<? super C3831b>) null), 3, (Object) null);
        }
    }
}
