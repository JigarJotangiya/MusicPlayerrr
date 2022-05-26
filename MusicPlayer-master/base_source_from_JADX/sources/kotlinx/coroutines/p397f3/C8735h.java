package kotlinx.coroutines.p397f3;

import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8600r;

/* renamed from: kotlinx.coroutines.f3.h */
/* compiled from: Limit.kt */
final /* synthetic */ class C8735h {

    /* renamed from: kotlinx.coroutines.f3.h$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C8736a implements C8729b<T> {

        /* renamed from: g */
        final /* synthetic */ C8729b f35093g;

        /* renamed from: h */
        final /* synthetic */ C8574p f35094h;

        public C8736a(C8729b bVar, C8574p pVar) {
            this.f35093g = bVar;
            this.f35094h = pVar;
        }

        public Object collect(C8730c<? super T> cVar, C8508d<? super C8457t> dVar) {
            Object collect = this.f35093g.collect(new C8737b(new C8600r(), cVar, this.f35094h), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: kotlinx.coroutines.f3.h$b */
    /* compiled from: Collect.kt */
    public static final class C8737b implements C8730c<T> {

        /* renamed from: g */
        final /* synthetic */ C8600r f35095g;

        /* renamed from: h */
        final /* synthetic */ C8730c f35096h;

        /* renamed from: i */
        final /* synthetic */ C8574p f35097i;

        @C8533f(mo30599c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$lambda-4$$inlined$collect$1", mo30600f = "Limit.kt", mo30601l = {136, 137, 139}, mo30602m = "emit")
        /* renamed from: kotlinx.coroutines.f3.h$b$a */
        public static final class C8738a extends C8531d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C8737b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8738a(C8737b bVar, C8508d dVar) {
                super(dVar);
                this.this$0 = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public C8737b(C8600r rVar, C8730c cVar, C8574p pVar) {
            this.f35095g = rVar;
            this.f35096h = cVar;
            this.f35097i = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(T r7, p369i.p379w.C8508d<? super p369i.C8457t> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.p397f3.C8735h.C8737b.C8738a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                kotlinx.coroutines.f3.h$b$a r0 = (kotlinx.coroutines.p397f3.C8735h.C8737b.C8738a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.f3.h$b$a r0 = new kotlinx.coroutines.f3.h$b$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x0041
                if (r2 == r4) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                p369i.C8450m.m46575b(r8)
                goto L_0x008d
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                java.lang.Object r7 = r0.L$1
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.f3.h$b r2 = (kotlinx.coroutines.p397f3.C8735h.C8737b) r2
                p369i.C8450m.m46575b(r8)
                goto L_0x0071
            L_0x0041:
                p369i.C8450m.m46575b(r8)
                goto L_0x008d
            L_0x0045:
                p369i.C8450m.m46575b(r8)
                i.z.d.r r8 = r6.f35095g
                boolean r8 = r8.element
                if (r8 == 0) goto L_0x0059
                kotlinx.coroutines.f3.c r8 = r6.f35096h
                r0.label = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x008d
                return r1
            L_0x0059:
                i.z.c.p r8 = r6.f35097i
                r0.L$0 = r6
                r0.L$1 = r7
                r0.label = r4
                r2 = 6
                p369i.p387z.p389d.C8593k.m46766a(r2)
                java.lang.Object r8 = r8.invoke(r7, r0)
                r2 = 7
                p369i.p387z.p389d.C8593k.m46766a(r2)
                if (r8 != r1) goto L_0x0070
                return r1
            L_0x0070:
                r2 = r6
            L_0x0071:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008d
                i.z.d.r r8 = r2.f35095g
                r8.element = r5
                kotlinx.coroutines.f3.c r8 = r2.f35096h
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x008d
                return r1
            L_0x008d:
                i.t r7 = p369i.C8457t.f34900a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p397f3.C8735h.C8737b.emit(java.lang.Object, i.w.d):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> C8729b<T> m47264a(C8729b<? extends T> bVar, C8574p<? super T, ? super C8508d<? super Boolean>, ? extends Object> pVar) {
        return new C8736a(bVar, pVar);
    }
}
