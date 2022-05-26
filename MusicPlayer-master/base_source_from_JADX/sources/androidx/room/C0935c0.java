package androidx.room;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C8876m0;
import kotlinx.coroutines.C8907s1;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.room.c0 */
/* compiled from: CoroutinesRoom.kt */
public final class C0935c0 {
    /* renamed from: a */
    public static final C8876m0 m5690a(C0994s0 s0Var) {
        C8594l.m46771e(s0Var, "$this$queryDispatcher");
        Map<String, Object> h = s0Var.mo5581h();
        C8594l.m46770d(h, "backingFieldMap");
        Object obj = h.get("QueryDispatcher");
        if (obj == null) {
            Executor l = s0Var.mo5585l();
            C8594l.m46770d(l, "queryExecutor");
            obj = C8907s1.m47811a(l);
            h.put("QueryDispatcher", obj);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (C8876m0) obj;
    }

    /* renamed from: b */
    public static final C8876m0 m5691b(C0994s0 s0Var) {
        C8594l.m46771e(s0Var, "$this$transactionDispatcher");
        Map<String, Object> h = s0Var.mo5581h();
        C8594l.m46770d(h, "backingFieldMap");
        Object obj = h.get("TransactionDispatcher");
        if (obj == null) {
            Executor n = s0Var.mo5587n();
            C8594l.m46770d(n, "transactionExecutor");
            obj = C8907s1.m47811a(n);
            h.put("TransactionDispatcher", obj);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (C8876m0) obj;
    }
}
