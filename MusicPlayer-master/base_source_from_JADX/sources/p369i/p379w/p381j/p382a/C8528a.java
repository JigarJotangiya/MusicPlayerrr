package p369i.p379w.p381j.p382a;

import java.io.Serializable;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.w.j.a.a */
/* compiled from: ContinuationImpl.kt */
public abstract class C8528a implements C8508d<Object>, C8532e, Serializable {
    private final C8508d<Object> completion;

    public C8528a(C8508d<Object> dVar) {
        this.completion = dVar;
    }

    public C8508d<C8457t> create(C8508d<?> dVar) {
        C8594l.m46771e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C8532e getCallerFrame() {
        C8508d<Object> dVar = this.completion;
        if (!(dVar instanceof C8532e)) {
            dVar = null;
        }
        return (C8532e) dVar;
    }

    public final C8508d<Object> getCompletion() {
        return this.completion;
    }

    public abstract /* synthetic */ C8513g getContext();

    public StackTraceElement getStackTraceElement() {
        return C8534g.m46734d(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [i.w.d<java.lang.Object>, i.w.d, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resumeWith(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            p369i.p379w.p381j.p382a.C8535h.m46736b(r0)
            i.w.d<java.lang.Object> r1 = r0.completion
            p369i.p387z.p389d.C8594l.m46769c(r1)
            java.lang.Object r4 = r0.invokeSuspend(r4)     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = p369i.p379w.p380i.C8527d.m46722d()     // Catch:{ all -> 0x001b }
            if (r4 != r2) goto L_0x0014
            return
        L_0x0014:
            i.l$a r2 = p369i.C8447l.Companion     // Catch:{ all -> 0x001b }
            java.lang.Object r4 = p369i.C8447l.m50326constructorimpl(r4)     // Catch:{ all -> 0x001b }
            goto L_0x0026
        L_0x001b:
            r4 = move-exception
            i.l$a r2 = p369i.C8447l.Companion
            java.lang.Object r4 = p369i.C8450m.m46574a(r4)
            java.lang.Object r4 = p369i.C8447l.m50326constructorimpl(r4)
        L_0x0026:
            r0.releaseIntercepted()
            boolean r0 = r1 instanceof p369i.p379w.p381j.p382a.C8528a
            if (r0 == 0) goto L_0x0031
            r0 = r1
            i.w.j.a.a r0 = (p369i.p379w.p381j.p382a.C8528a) r0
            goto L_0x0001
        L_0x0031:
            r1.resumeWith(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p369i.p379w.p381j.p382a.C8528a.resumeWith(java.lang.Object):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
        C8594l.m46771e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
