package androidx.room;

import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8864k;
import kotlinx.coroutines.C8894q;
import kotlinx.coroutines.C8901r;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.C8912t1;
import p369i.C8447l;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8509e;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8535h;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: androidx.room.b0 */
/* compiled from: CoroutinesRoom.kt */
public final class C0927b0 {

    /* renamed from: a */
    public static final C0928a f4082a = new C0928a((C8589g) null);

    /* renamed from: androidx.room.b0$a */
    /* compiled from: CoroutinesRoom.kt */
    public static final class C0928a {

        @C8533f(mo30599c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", mo30600f = "CoroutinesRoom.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: androidx.room.b0$a$a */
        /* compiled from: CoroutinesRoom.kt */
        static final class C0929a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            final /* synthetic */ Callable $callable$inlined;
            final /* synthetic */ CancellationSignal $cancellationSignal$inlined;
            final /* synthetic */ C8509e $context$inlined;
            final /* synthetic */ C8894q $continuation;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0929a(C8894q qVar, C8508d dVar, C8509e eVar, Callable callable, CancellationSignal cancellationSignal) {
                super(2, dVar);
                this.$continuation = qVar;
                this.$context$inlined = eVar;
                this.$callable$inlined = callable;
                this.$cancellationSignal$inlined = cancellationSignal;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C8594l.m46771e(dVar, "completion");
                return new C0929a(this.$continuation, dVar, this.$context$inlined, this.$callable$inlined, this.$cancellationSignal$inlined);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0929a) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    try {
                        Object call = this.$callable$inlined.call();
                        C8894q qVar = this.$continuation;
                        C8447l.C8448a aVar = C8447l.Companion;
                        qVar.resumeWith(C8447l.m50326constructorimpl(call));
                    } catch (Throwable th) {
                        C8894q qVar2 = this.$continuation;
                        C8447l.C8448a aVar2 = C8447l.Companion;
                        qVar2.resumeWith(C8447l.m50326constructorimpl(C8450m.m46574a(th)));
                    }
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: androidx.room.b0$a$b */
        /* compiled from: CoroutinesRoom.kt */
        static final class C0930b extends C8595m implements C8570l<Throwable, C8457t> {
            final /* synthetic */ Callable $callable$inlined;
            final /* synthetic */ CancellationSignal $cancellationSignal$inlined;
            final /* synthetic */ C8509e $context$inlined;
            final /* synthetic */ C8665a2 $job;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0930b(C8665a2 a2Var, C8509e eVar, Callable callable, CancellationSignal cancellationSignal) {
                super(1);
                this.$job = a2Var;
                this.$context$inlined = eVar;
                this.$callable$inlined = callable;
                this.$cancellationSignal$inlined = cancellationSignal;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8457t.f34900a;
            }

            public final void invoke(Throwable th) {
                if (Build.VERSION.SDK_INT >= 16) {
                    this.$cancellationSignal$inlined.cancel();
                }
                C8665a2.C8666a.m47072a(this.$job, (CancellationException) null, 1, (Object) null);
            }
        }

        @C8533f(mo30599c = "androidx.room.CoroutinesRoom$Companion$execute$2", mo30600f = "CoroutinesRoom.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: androidx.room.b0$a$c */
        /* compiled from: CoroutinesRoom.kt */
        static final class C0931c extends C8539k implements C8574p<C8902r0, C8508d<? super R>, Object> {
            final /* synthetic */ Callable $callable;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0931c(Callable callable, C8508d dVar) {
                super(2, dVar);
                this.$callable = callable;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C8594l.m46771e(dVar, "completion");
                return new C0931c(this.$callable, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0931c) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    return this.$callable.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private C0928a() {
        }

        /* renamed from: a */
        public final <R> Object mo5448a(C0994s0 s0Var, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, C8508d<? super R> dVar) {
            C8509e eVar;
            if (s0Var.mo5591u() && s0Var.mo5588o()) {
                return callable.call();
            }
            C0924a1 a1Var = (C0924a1) dVar.getContext().get(C0924a1.f4078h);
            if (a1Var == null || (eVar = a1Var.mo5442a()) == null) {
                eVar = z ? C0935c0.m5691b(s0Var) : C0935c0.m5690a(s0Var);
            }
            C8901r rVar = new C8901r(C8522c.m46721c(dVar), 1);
            rVar.mo31237y();
            rVar.mo31216b(new C0930b(C8875m.m47725b(C8912t1.f35302g, eVar, (C8910t0) null, new C0929a(rVar, (C8508d) null, eVar, callable, cancellationSignal), 2, (Object) null), eVar, callable, cancellationSignal));
            Object v = rVar.mo31235v();
            if (v == C8527d.m46722d()) {
                C8535h.m46737c(dVar);
            }
            return v;
        }

        /* renamed from: b */
        public final <R> Object mo5449b(C0994s0 s0Var, boolean z, Callable<R> callable, C8508d<? super R> dVar) {
            C8509e eVar;
            if (s0Var.mo5591u() && s0Var.mo5588o()) {
                return callable.call();
            }
            C0924a1 a1Var = (C0924a1) dVar.getContext().get(C0924a1.f4078h);
            if (a1Var == null || (eVar = a1Var.mo5442a()) == null) {
                eVar = z ? C0935c0.m5691b(s0Var) : C0935c0.m5690a(s0Var);
            }
            return C8864k.m47676e(eVar, new C0931c(callable, (C8508d) null), dVar);
        }

        public /* synthetic */ C0928a(C8589g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final <R> Object m5685a(C0994s0 s0Var, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, C8508d<? super R> dVar) {
        return f4082a.mo5448a(s0Var, z, cancellationSignal, callable, dVar);
    }

    /* renamed from: b */
    public static final <R> Object m5686b(C0994s0 s0Var, boolean z, Callable<R> callable, C8508d<? super R> dVar) {
        return f4082a.mo5449b(s0Var, z, callable, dVar);
    }
}
