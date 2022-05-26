package kotlinx.coroutines.p397f3;

import kotlinx.coroutines.p397f3.p398q.C8751a;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p387z.p389d.C8602t;

/* renamed from: kotlinx.coroutines.f3.i */
/* compiled from: Reduce.kt */
final /* synthetic */ class C8739i {

    /* renamed from: kotlinx.coroutines.f3.i$a */
    /* compiled from: Limit.kt */
    public static final class C8740a implements C8730c<T> {

        /* renamed from: g */
        final /* synthetic */ C8602t f35098g;

        public C8740a(C8602t tVar) {
            this.f35098g = tVar;
        }

        public Object emit(T t, C8508d<? super C8457t> dVar) {
            this.f35098g.element = t;
            throw new C8751a(this);
        }
    }

    @C8533f(mo30599c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo30600f = "Reduce.kt", mo30601l = {183}, mo30602m = "first")
    /* renamed from: kotlinx.coroutines.f3.i$b */
    /* compiled from: Reduce.kt */
    static final class C8741b<T> extends C8531d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C8741b(C8508d<? super C8741b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C8731d.m47259d((C8729b) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m47265a(kotlinx.coroutines.p397f3.C8729b<? extends T> r4, p369i.p379w.C8508d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.p397f3.C8739i.C8741b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.f3.i$b r0 = (kotlinx.coroutines.p397f3.C8739i.C8741b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.f3.i$b r0 = new kotlinx.coroutines.f3.i$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.f3.i$a r4 = (kotlinx.coroutines.p397f3.C8739i.C8740a) r4
            java.lang.Object r0 = r0.L$0
            i.z.d.t r0 = (p369i.p387z.p389d.C8602t) r0
            p369i.C8450m.m46575b(r5)     // Catch:{ a -> 0x0031 }
            goto L_0x0062
        L_0x0031:
            r5 = move-exception
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            p369i.C8450m.m46575b(r5)
            i.z.d.t r5 = new i.z.d.t
            r5.<init>()
            kotlinx.coroutines.internal.z r2 = kotlinx.coroutines.p397f3.p398q.C8759h.f35117a
            r5.element = r2
            kotlinx.coroutines.f3.i$a r2 = new kotlinx.coroutines.f3.i$a
            r2.<init>(r5)
            r0.L$0 = r5     // Catch:{ a -> 0x005b }
            r0.L$1 = r2     // Catch:{ a -> 0x005b }
            r0.label = r3     // Catch:{ a -> 0x005b }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ a -> 0x005b }
            if (r4 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
            goto L_0x0062
        L_0x005b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005f:
            kotlinx.coroutines.p397f3.p398q.C8757f.m47294a(r5, r4)
        L_0x0062:
            T r4 = r0.element
            kotlinx.coroutines.internal.z r5 = kotlinx.coroutines.p397f3.p398q.C8759h.f35117a
            if (r4 == r5) goto L_0x0069
            return r4
        L_0x0069:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p397f3.C8739i.m47265a(kotlinx.coroutines.f3.b, i.w.d):java.lang.Object");
    }
}
