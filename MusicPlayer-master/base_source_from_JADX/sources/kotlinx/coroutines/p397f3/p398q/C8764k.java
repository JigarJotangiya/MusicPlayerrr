package kotlinx.coroutines.p397f3.p398q;

import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.internal.C8857x;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8595m;

/* renamed from: kotlinx.coroutines.f3.q.k */
/* compiled from: SafeCollector.common.kt */
public final class C8764k {

    /* renamed from: kotlinx.coroutines.f3.q.k$a */
    /* compiled from: SafeCollector.common.kt */
    static final class C8765a extends C8595m implements C8574p<Integer, C8513g.C8516b, Integer> {
        final /* synthetic */ C8760i<?> $this_checkContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8765a(C8760i<?> iVar) {
            super(2);
            this.$this_checkContext = iVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (C8513g.C8516b) obj2);
        }

        public final Integer invoke(int i, C8513g.C8516b bVar) {
            C8513g.C8518c key = bVar.getKey();
            C8513g.C8516b bVar2 = this.$this_checkContext.collectContext.get(key);
            if (key != C8665a2.f35030f) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i + 1);
            }
            C8665a2 a2Var = (C8665a2) bVar2;
            C8665a2 b = C8764k.m47300b((C8665a2) bVar, a2Var);
            if (b == a2Var) {
                if (a2Var != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + a2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }

    /* renamed from: a */
    public static final void m47299a(C8760i<?> iVar, C8513g gVar) {
        if (((Number) gVar.fold(0, new C8765a(iVar))).intValue() != iVar.collectContextSize) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iVar.collectContext + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    /* renamed from: b */
    public static final C8665a2 m47300b(C8665a2 a2Var, C8665a2 a2Var2) {
        while (a2Var != null) {
            if (a2Var == a2Var2 || !(a2Var instanceof C8857x)) {
                return a2Var;
            }
            a2Var = ((C8857x) a2Var).mo31175B0();
        }
        return null;
    }
}
