package kotlinx.coroutines.p397f3;

import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p387z.p388c.C8574p;

/* renamed from: kotlinx.coroutines.f3.o */
/* compiled from: Share.kt */
public final class C8748o<T> implements C8730c<T> {

    /* renamed from: g */
    private final C8730c<T> f35104g;

    /* renamed from: h */
    private final C8574p<C8730c<? super T>, C8508d<? super C8457t>, Object> f35105h;

    @C8533f(mo30599c = "kotlinx.coroutines.flow.SubscribedFlowCollector", mo30600f = "Share.kt", mo30601l = {410, 414}, mo30602m = "onSubscription")
    /* renamed from: kotlinx.coroutines.f3.o$a */
    /* compiled from: Share.kt */
    static final class C8749a extends C8531d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C8748o<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8749a(C8748o<T> oVar, C8508d<? super C8749a> dVar) {
            super(dVar);
            this.this$0 = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo30993b(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo30993b(p369i.p379w.C8508d<? super p369i.C8457t> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.p397f3.C8748o.C8749a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.f3.o$a r0 = (kotlinx.coroutines.p397f3.C8748o.C8749a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.f3.o$a r0 = new kotlinx.coroutines.f3.o$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p369i.C8450m.m46575b(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.f3.q.i r2 = (kotlinx.coroutines.p397f3.p398q.C8760i) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.f3.o r4 = (kotlinx.coroutines.p397f3.C8748o) r4
            p369i.C8450m.m46575b(r7)     // Catch:{ all -> 0x007d }
            goto L_0x005e
        L_0x0040:
            p369i.C8450m.m46575b(r7)
            kotlinx.coroutines.f3.q.i r2 = new kotlinx.coroutines.f3.q.i
            kotlinx.coroutines.f3.c<T> r7 = r6.f35104g
            i.w.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            i.z.c.p<kotlinx.coroutines.f3.c<? super T>, i.w.d<? super i.t>, java.lang.Object> r7 = r6.f35105h     // Catch:{ all -> 0x007d }
            r0.L$0 = r6     // Catch:{ all -> 0x007d }
            r0.L$1 = r2     // Catch:{ all -> 0x007d }
            r0.label = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x007d }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.releaseIntercepted()
            kotlinx.coroutines.f3.c<T> r7 = r4.f35104g
            boolean r2 = r7 instanceof kotlinx.coroutines.p397f3.C8748o
            if (r2 == 0) goto L_0x007a
            kotlinx.coroutines.f3.o r7 = (kotlinx.coroutines.p397f3.C8748o) r7
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.mo30993b(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            i.t r7 = p369i.C8457t.f34900a
            return r7
        L_0x007a:
            i.t r7 = p369i.C8457t.f34900a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p397f3.C8748o.mo30993b(i.w.d):java.lang.Object");
    }

    public Object emit(T t, C8508d<? super C8457t> dVar) {
        return this.f35104g.emit(t, dVar);
    }
}
