package kotlinx.coroutines.p397f3;

import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;

/* renamed from: kotlinx.coroutines.f3.a */
/* compiled from: Flow.kt */
public abstract class C8727a<T> implements C8729b<T> {

    @C8533f(mo30599c = "kotlinx.coroutines.flow.AbstractFlow", mo30600f = "Flow.kt", mo30601l = {212}, mo30602m = "collect")
    /* renamed from: kotlinx.coroutines.f3.a$a */
    /* compiled from: Flow.kt */
    static final class C8728a extends C8531d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C8727a<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8728a(C8727a<T> aVar, C8508d<? super C8728a> dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect((C8730c) null, this);
        }
    }

    /* renamed from: b */
    public abstract Object mo30976b(C8730c<? super T> cVar, C8508d<? super C8457t> dVar);

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(kotlinx.coroutines.p397f3.C8730c<? super T> r6, p369i.p379w.C8508d<? super p369i.C8457t> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.p397f3.C8727a.C8728a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.f3.a$a r0 = (kotlinx.coroutines.p397f3.C8727a.C8728a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.f3.a$a r0 = new kotlinx.coroutines.f3.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.f3.q.i r6 = (kotlinx.coroutines.p397f3.p398q.C8760i) r6
            p369i.C8450m.m46575b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            p369i.C8450m.m46575b(r7)
            kotlinx.coroutines.f3.q.i r7 = new kotlinx.coroutines.f3.q.i
            i.w.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.L$0 = r7     // Catch:{ all -> 0x0055 }
            r0.label = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.mo30976b(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            i.t r6 = p369i.C8457t.f34900a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p397f3.C8727a.collect(kotlinx.coroutines.f3.c, i.w.d):java.lang.Object");
    }
}
