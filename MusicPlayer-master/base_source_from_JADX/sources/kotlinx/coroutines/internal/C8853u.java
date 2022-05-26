package kotlinx.coroutines.internal;

import kotlinx.coroutines.C8886o0;
import p369i.C8457t;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: kotlinx.coroutines.internal.u */
/* compiled from: OnUndeliveredElement.kt */
public final class C8853u {

    /* renamed from: kotlinx.coroutines.internal.u$a */
    /* compiled from: OnUndeliveredElement.kt */
    static final class C8854a extends C8595m implements C8570l<Throwable, C8457t> {
        final /* synthetic */ C8513g $context;
        final /* synthetic */ E $element;
        final /* synthetic */ C8570l<E, C8457t> $this_bindCancellationFun;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8854a(C8570l<? super E, C8457t> lVar, E e, C8513g gVar) {
            super(1);
            this.$this_bindCancellationFun = lVar;
            this.$element = e;
            this.$context = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C8457t.f34900a;
        }

        public final void invoke(Throwable th) {
            C8853u.m47635b(this.$this_bindCancellationFun, this.$element, this.$context);
        }
    }

    /* renamed from: a */
    public static final <E> C8570l<Throwable, C8457t> m47634a(C8570l<? super E, C8457t> lVar, E e, C8513g gVar) {
        return new C8854a(lVar, e, gVar);
    }

    /* renamed from: b */
    public static final <E> void m47635b(C8570l<? super E, C8457t> lVar, E e, C8513g gVar) {
        C8828h0 c = m47636c(lVar, e, (C8828h0) null);
        if (c != null) {
            C8886o0.m47742a(gVar, c);
        }
    }

    /* renamed from: c */
    public static final <E> C8828h0 m47636c(C8570l<? super E, C8457t> lVar, E e, C8828h0 h0Var) {
        try {
            lVar.invoke(e);
        } catch (Throwable th) {
            if (h0Var == null || h0Var.getCause() == th) {
                return new C8828h0(C8594l.m46777k("Exception in undelivered element handler for ", e), th);
            }
            C8375b.m46425a(h0Var, th);
        }
        return h0Var;
    }

    /* renamed from: d */
    public static /* synthetic */ C8828h0 m47637d(C8570l lVar, Object obj, C8828h0 h0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            h0Var = null;
        }
        return m47636c(lVar, obj, h0Var);
    }
}
