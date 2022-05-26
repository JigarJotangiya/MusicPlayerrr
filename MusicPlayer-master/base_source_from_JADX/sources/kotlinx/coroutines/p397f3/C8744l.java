package kotlinx.coroutines.p397f3;

import kotlinx.coroutines.p397f3.p398q.C8752b;
import kotlinx.coroutines.p397f3.p398q.C8759h;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;

/* renamed from: kotlinx.coroutines.f3.l */
/* compiled from: StateFlow.kt */
final class C8744l<T> extends C8752b<C8747n> implements C8742j<T>, Object<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: k */
    private int f35100k;

    @C8533f(mo30599c = "kotlinx.coroutines.flow.StateFlowImpl", mo30600f = "StateFlow.kt", mo30601l = {386, 398, 403}, mo30602m = "collect")
    /* renamed from: kotlinx.coroutines.f3.l$a */
    /* compiled from: StateFlow.kt */
    static final class C8745a extends C8531d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C8744l<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8745a(C8744l<T> lVar, C8508d<? super C8745a> dVar) {
            super(dVar);
            this.this$0 = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect((C8730c) null, this);
        }
    }

    public C8744l(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r8 = (kotlinx.coroutines.p397f3.C8747n[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        if (r8 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        r2 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (r3 >= r2) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r4 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        r4.mo30991f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.f35100k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0043, code lost:
        if (r8 != r7) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0045, code lost:
        r6.f35100k = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0049, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r7 = mo30999g();
        r2 = p369i.C8457t.f34900a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0050, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0051, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m47268j(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r6.mo30999g()
            monitor-enter(r6)
            java.lang.Object r0 = r6._state     // Catch:{ all -> 0x005e }
            r1 = 0
            if (r7 == 0) goto L_0x0011
            boolean r7 = p369i.p387z.p389d.C8594l.m46767a(r0, r7)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x0011
            monitor-exit(r6)
            return r1
        L_0x0011:
            boolean r7 = p369i.p387z.p389d.C8594l.m46767a(r0, r8)     // Catch:{ all -> 0x005e }
            r0 = 1
            if (r7 == 0) goto L_0x001a
            monitor-exit(r6)
            return r0
        L_0x001a:
            r6._state = r8     // Catch:{ all -> 0x005e }
            int r7 = r6.f35100k     // Catch:{ all -> 0x005e }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0058
            int r7 = r7 + r0
            r6.f35100k = r7     // Catch:{ all -> 0x005e }
            kotlinx.coroutines.f3.q.d[] r8 = r6.mo30999g()     // Catch:{ all -> 0x005e }
            i.t r2 = p369i.C8457t.f34900a     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
        L_0x002c:
            kotlinx.coroutines.f3.n[] r8 = (kotlinx.coroutines.p397f3.C8747n[]) r8
            if (r8 != 0) goto L_0x0031
            goto L_0x0040
        L_0x0031:
            int r2 = r8.length
            r3 = 0
        L_0x0033:
            if (r3 >= r2) goto L_0x0040
            r4 = r8[r3]
            if (r4 != 0) goto L_0x003a
            goto L_0x003d
        L_0x003a:
            r4.mo30991f()
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0040:
            monitor-enter(r6)
            int r8 = r6.f35100k     // Catch:{ all -> 0x0055 }
            if (r8 != r7) goto L_0x004a
            int r7 = r7 + r0
            r6.f35100k = r7     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            return r0
        L_0x004a:
            kotlinx.coroutines.f3.q.d[] r7 = r6.mo30999g()     // Catch:{ all -> 0x0055 }
            i.t r2 = p369i.C8457t.f34900a     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002c
        L_0x0055:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0058:
            int r7 = r7 + 2
            r6.f35100k = r7     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
            return r0
        L_0x005e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p397f3.C8744l.m47268j(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public boolean mo30977a(T t, T t2) {
        if (t == null) {
            t = C8759h.f35117a;
        }
        if (t2 == null) {
            t2 = C8759h.f35117a;
        }
        return m47268j(t, t2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlinx.coroutines.f3.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.f3.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf A[Catch:{ all -> 0x0073 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d0 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(kotlinx.coroutines.p397f3.C8730c<? super T> r11, p369i.p379w.C8508d<? super p369i.C8457t> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.p397f3.C8744l.C8745a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.f3.l$a r0 = (kotlinx.coroutines.p397f3.C8744l.C8745a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.f3.l$a r0 = new kotlinx.coroutines.f3.l$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0061
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.a2 r2 = (kotlinx.coroutines.C8665a2) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.f3.n r6 = (kotlinx.coroutines.p397f3.C8747n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.f3.c r7 = (kotlinx.coroutines.p397f3.C8730c) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.f3.l r8 = (kotlinx.coroutines.p397f3.C8744l) r8
            p369i.C8450m.m46575b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.a2 r2 = (kotlinx.coroutines.C8665a2) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.f3.n r6 = (kotlinx.coroutines.p397f3.C8747n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.f3.c r7 = (kotlinx.coroutines.p397f3.C8730c) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.f3.l r8 = (kotlinx.coroutines.p397f3.C8744l) r8
            p369i.C8450m.m46575b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00d1
        L_0x0061:
            java.lang.Object r11 = r0.L$2
            r6 = r11
            kotlinx.coroutines.f3.n r6 = (kotlinx.coroutines.p397f3.C8747n) r6
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.f3.c r11 = (kotlinx.coroutines.p397f3.C8730c) r11
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.f3.l r8 = (kotlinx.coroutines.p397f3.C8744l) r8
            p369i.C8450m.m46575b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r11 = move-exception
            goto L_0x00ed
        L_0x0076:
            p369i.C8450m.m46575b(r12)
            kotlinx.coroutines.f3.q.d r12 = r10.mo30996b()
            kotlinx.coroutines.f3.n r12 = (kotlinx.coroutines.p397f3.C8747n) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.p397f3.C8748o     // Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x0095
            r2 = r11
            kotlinx.coroutines.f3.o r2 = (kotlinx.coroutines.p397f3.C8748o) r2     // Catch:{ all -> 0x00ea }
            r0.L$0 = r10     // Catch:{ all -> 0x00ea }
            r0.L$1 = r11     // Catch:{ all -> 0x00ea }
            r0.L$2 = r12     // Catch:{ all -> 0x00ea }
            r0.label = r6     // Catch:{ all -> 0x00ea }
            java.lang.Object r2 = r2.mo30993b(r0)     // Catch:{ all -> 0x00ea }
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r8 = r10
            r6 = r12
        L_0x0097:
            i.w.g r12 = r0.getContext()     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.a2$b r2 = kotlinx.coroutines.C8665a2.f35030f     // Catch:{ all -> 0x0073 }
            i.w.g$b r12 = r12.get(r2)     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.a2 r12 = (kotlinx.coroutines.C8665a2) r12     // Catch:{ all -> 0x0073 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00a6:
            java.lang.Object r12 = r8._state     // Catch:{ all -> 0x0073 }
            if (r2 != 0) goto L_0x00ab
            goto L_0x00ae
        L_0x00ab:
            kotlinx.coroutines.C8693e2.m47147g(r2)     // Catch:{ all -> 0x0073 }
        L_0x00ae:
            if (r11 == 0) goto L_0x00b6
            boolean r9 = p369i.p387z.p389d.C8594l.m46767a(r11, r12)     // Catch:{ all -> 0x0073 }
            if (r9 != 0) goto L_0x00d1
        L_0x00b6:
            kotlinx.coroutines.internal.z r11 = kotlinx.coroutines.p397f3.p398q.C8759h.f35117a     // Catch:{ all -> 0x0073 }
            if (r12 != r11) goto L_0x00bc
            r11 = r3
            goto L_0x00bd
        L_0x00bc:
            r11 = r12
        L_0x00bd:
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r12     // Catch:{ all -> 0x0073 }
            r0.label = r5     // Catch:{ all -> 0x0073 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0073 }
            if (r11 != r1) goto L_0x00d0
            return r1
        L_0x00d0:
            r11 = r12
        L_0x00d1:
            boolean r12 = r6.mo30992g()     // Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x00a6
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r11     // Catch:{ all -> 0x0073 }
            r0.label = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r6.mo30989d(r0)     // Catch:{ all -> 0x0073 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00ea:
            r11 = move-exception
            r8 = r10
            r6 = r12
        L_0x00ed:
            r8.mo30997e(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p397f3.C8744l.collect(kotlinx.coroutines.f3.c, i.w.d):java.lang.Object");
    }

    public Object emit(T t, C8508d<? super C8457t> dVar) {
        setValue(t);
        return C8457t.f34900a;
    }

    public T getValue() {
        T t = C8759h.f35117a;
        T t2 = this._state;
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C8747n mo30980c() {
        return new C8747n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C8747n[] mo30982d(int i) {
        return new C8747n[i];
    }

    public void setValue(T t) {
        if (t == null) {
            t = C8759h.f35117a;
        }
        m47268j((Object) null, t);
    }
}
