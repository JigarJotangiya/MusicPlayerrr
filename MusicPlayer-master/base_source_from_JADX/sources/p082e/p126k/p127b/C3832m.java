package p082e.p126k.p127b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C8663a0;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8680c0;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.p397f3.C8729b;
import kotlinx.coroutines.p397f3.C8730c;
import kotlinx.coroutines.p397f3.C8731d;
import kotlinx.coroutines.p397f3.C8742j;
import kotlinx.coroutines.p397f3.C8746m;
import kotlinx.coroutines.p401i3.C8801b;
import p369i.C8418f;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8529b;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;
import p369i.p387z.p389d.C8600r;
import p369i.p387z.p389d.C8602t;

/* renamed from: e.k.b.m */
/* compiled from: SingleProcessDataStore.kt */
public final class C3832m<T> implements C3823f<T> {

    /* renamed from: k */
    public static final C3833a f11931k = new C3833a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Set<String> f11932l = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Object f11933m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8559a<File> f11934a;

    /* renamed from: b */
    private final C3828k<T> f11935b;

    /* renamed from: c */
    private final C3814b<T> f11936c;

    /* renamed from: d */
    private final C8902r0 f11937d;

    /* renamed from: e */
    private final C8729b<T> f11938e = C8731d.m47260e(new C3841g(this, (C8508d<? super C3841g>) null));

    /* renamed from: f */
    private final String f11939f = ".tmp";

    /* renamed from: g */
    private final C8418f f11940g = C8443h.m46573a(new C3846h(this));
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C8742j<C3858n<T>> f11941h = C8746m.m47274a(C3859o.f11956a);

    /* renamed from: i */
    private List<? extends C8574p<? super C3826i<T>, ? super C8508d<? super C8457t>, ? extends Object>> f11942i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C3829l<C3834b<T>> f11943j;

    /* renamed from: e.k.b.m$a */
    /* compiled from: SingleProcessDataStore.kt */
    public static final class C3833a {
        private C3833a() {
        }

        public /* synthetic */ C3833a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final Set<String> mo13333a() {
            return C3832m.f11932l;
        }

        /* renamed from: b */
        public final Object mo13334b() {
            return C3832m.f11933m;
        }
    }

    /* renamed from: e.k.b.m$b */
    /* compiled from: SingleProcessDataStore.kt */
    private static abstract class C3834b<T> {

        /* renamed from: e.k.b.m$b$a */
        /* compiled from: SingleProcessDataStore.kt */
        public static final class C3835a<T> extends C3834b<T> {

            /* renamed from: a */
            private final C3858n<T> f11944a;

            public C3835a(C3858n<T> nVar) {
                super((C8589g) null);
                this.f11944a = nVar;
            }

            /* renamed from: a */
            public C3858n<T> mo13335a() {
                return this.f11944a;
            }
        }

        /* renamed from: e.k.b.m$b$b */
        /* compiled from: SingleProcessDataStore.kt */
        public static final class C3836b<T> extends C3834b<T> {

            /* renamed from: a */
            private final C8574p<T, C8508d<? super T>, Object> f11945a;

            /* renamed from: b */
            private final C8663a0<T> f11946b;

            /* renamed from: c */
            private final C3858n<T> f11947c;

            /* renamed from: d */
            private final C8513g f11948d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3836b(C8574p<? super T, ? super C8508d<? super T>, ? extends Object> pVar, C8663a0<T> a0Var, C3858n<T> nVar, C8513g gVar) {
                super((C8589g) null);
                C8594l.m46771e(pVar, "transform");
                C8594l.m46771e(a0Var, "ack");
                C8594l.m46771e(gVar, "callerContext");
                this.f11945a = pVar;
                this.f11946b = a0Var;
                this.f11947c = nVar;
                this.f11948d = gVar;
            }

            /* renamed from: a */
            public final C8663a0<T> mo13336a() {
                return this.f11946b;
            }

            /* renamed from: b */
            public final C8513g mo13337b() {
                return this.f11948d;
            }

            /* renamed from: c */
            public C3858n<T> mo13338c() {
                return this.f11947c;
            }

            /* renamed from: d */
            public final C8574p<T, C8508d<? super T>, Object> mo13339d() {
                return this.f11945a;
            }
        }

        private C3834b() {
        }

        public /* synthetic */ C3834b(C8589g gVar) {
            this();
        }
    }

    /* renamed from: e.k.b.m$c */
    /* compiled from: SingleProcessDataStore.kt */
    private static final class C3837c extends OutputStream {

        /* renamed from: g */
        private final FileOutputStream f11949g;

        public C3837c(FileOutputStream fileOutputStream) {
            C8594l.m46771e(fileOutputStream, "fileOutputStream");
            this.f11949g = fileOutputStream;
        }

        public void close() {
        }

        public void flush() {
            this.f11949g.flush();
        }

        public void write(int i) {
            this.f11949g.write(i);
        }

        public void write(byte[] bArr) {
            C8594l.m46771e(bArr, "b");
            this.f11949g.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            C8594l.m46771e(bArr, "bytes");
            this.f11949g.write(bArr, i, i2);
        }
    }

    /* renamed from: e.k.b.m$d */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3838d extends C8595m implements C8570l<Throwable, C8457t> {
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3838d(C3832m<T> mVar) {
            super(1);
            this.this$0 = mVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C8457t.f34900a;
        }

        public final void invoke(Throwable th) {
            if (th != null) {
                this.this$0.f11941h.setValue(new C3825h(th));
            }
            C3833a aVar = C3832m.f11931k;
            Object b = aVar.mo13334b();
            C3832m<T> mVar = this.this$0;
            synchronized (b) {
                aVar.mo13333a().remove(mVar.m16496r().getAbsolutePath());
                C8457t tVar = C8457t.f34900a;
            }
        }
    }

    /* renamed from: e.k.b.m$e */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3839e extends C8595m implements C8574p<C3834b<T>, Throwable, C8457t> {
        public static final C3839e INSTANCE = new C3839e();

        C3839e() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C3834b) obj, (Throwable) obj2);
            return C8457t.f34900a;
        }

        public final void invoke(C3834b<T> bVar, Throwable th) {
            C8594l.m46771e(bVar, "msg");
            if (bVar instanceof C3834b.C3836b) {
                C8663a0 a = ((C3834b.C3836b) bVar).mo13336a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a.mo30856n0(th);
            }
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore$actor$3", mo30600f = "SingleProcessDataStore.kt", mo30601l = {239, 242}, mo30602m = "invokeSuspend")
    /* renamed from: e.k.b.m$f */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3840f extends C8539k implements C8574p<C3834b<T>, C8508d<? super C8457t>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3840f(C3832m<T> mVar, C8508d<? super C3840f> dVar) {
            super(2, dVar);
            this.this$0 = mVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C3840f fVar = new C3840f(this.this$0, dVar);
            fVar.L$0 = obj;
            return fVar;
        }

        public final Object invoke(C3834b<T> bVar, C8508d<? super C8457t> dVar) {
            return ((C3840f) create(bVar, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C3834b bVar = (C3834b) this.L$0;
                if (bVar instanceof C3834b.C3835a) {
                    this.label = 1;
                    if (this.this$0.m16497s((C3834b.C3835a) bVar, this) == d) {
                        return d;
                    }
                } else if (bVar instanceof C3834b.C3836b) {
                    this.label = 2;
                    if (this.this$0.m16498t((C3834b.C3836b) bVar, this) == d) {
                        return d;
                    }
                }
            } else if (i == 1 || i == 2) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore$data$1", mo30600f = "SingleProcessDataStore.kt", mo30601l = {117}, mo30602m = "invokeSuspend")
    /* renamed from: e.k.b.m$g */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3841g extends C8539k implements C8574p<C8730c<? super T>, C8508d<? super C8457t>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C3832m<T> this$0;

        @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", mo30600f = "SingleProcessDataStore.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: e.k.b.m$g$a */
        /* compiled from: SingleProcessDataStore.kt */
        static final class C3842a extends C8539k implements C8574p<C3858n<T>, C8508d<? super Boolean>, Object> {
            final /* synthetic */ C3858n<T> $currentDownStreamFlowState;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3842a(C3858n<T> nVar, C8508d<? super C3842a> dVar) {
                super(2, dVar);
                this.$currentDownStreamFlowState = nVar;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C3842a aVar = new C3842a(this.$currentDownStreamFlowState, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            public final Object invoke(C3858n<T> nVar, C8508d<? super Boolean> dVar) {
                return ((C3842a) create(nVar, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    C3858n<T> nVar = (C3858n) this.L$0;
                    C3858n<T> nVar2 = this.$currentDownStreamFlowState;
                    boolean z = false;
                    if (!(nVar2 instanceof C3815c) && !(nVar2 instanceof C3825h) && nVar == nVar2) {
                        z = true;
                    }
                    return C8529b.m46723a(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: e.k.b.m$g$b */
        /* compiled from: SafeCollector.common.kt */
        public static final class C3843b implements C8729b<T> {

            /* renamed from: g */
            final /* synthetic */ C8729b f11950g;

            /* renamed from: e.k.b.m$g$b$a */
            /* compiled from: Collect.kt */
            public static final class C3844a implements C8730c<C3858n<T>> {

                /* renamed from: g */
                final /* synthetic */ C8730c f11951g;

                @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", mo30600f = "SingleProcessDataStore.kt", mo30601l = {137}, mo30602m = "emit")
                /* renamed from: e.k.b.m$g$b$a$a */
                public static final class C3845a extends C8531d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C3844a this$0;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C3845a(C3844a aVar, C8508d dVar) {
                        super(dVar);
                        this.this$0 = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit((Object) null, this);
                    }
                }

                public C3844a(C8730c cVar) {
                    this.f11951g = cVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, p369i.p379w.C8508d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p082e.p126k.p127b.C3832m.C3841g.C3843b.C3844a.C3845a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        e.k.b.m$g$b$a$a r0 = (p082e.p126k.p127b.C3832m.C3841g.C3843b.C3844a.C3845a) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        e.k.b.m$g$b$a$a r0 = new e.k.b.m$g$b$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        p369i.C8450m.m46575b(r6)
                        goto L_0x0053
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        p369i.C8450m.m46575b(r6)
                        kotlinx.coroutines.f3.c r6 = r4.f11951g
                        e.k.b.n r5 = (p082e.p126k.p127b.C3858n) r5
                        boolean r2 = r5 instanceof p082e.p126k.p127b.C3827j
                        if (r2 != 0) goto L_0x0073
                        boolean r2 = r5 instanceof p082e.p126k.p127b.C3825h
                        if (r2 != 0) goto L_0x006c
                        boolean r2 = r5 instanceof p082e.p126k.p127b.C3815c
                        if (r2 == 0) goto L_0x0056
                        e.k.b.c r5 = (p082e.p126k.p127b.C3815c) r5
                        java.lang.Object r5 = r5.mo13311b()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0053
                        return r1
                    L_0x0053:
                        i.t r5 = p369i.C8457t.f34900a
                        return r5
                    L_0x0056:
                        boolean r5 = r5 instanceof p082e.p126k.p127b.C3859o
                        if (r5 == 0) goto L_0x0066
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L_0x0066:
                        i.j r5 = new i.j
                        r5.<init>()
                        throw r5
                    L_0x006c:
                        e.k.b.h r5 = (p082e.p126k.p127b.C3825h) r5
                        java.lang.Throwable r5 = r5.mo13323a()
                        throw r5
                    L_0x0073:
                        e.k.b.j r5 = (p082e.p126k.p127b.C3827j) r5
                        java.lang.Throwable r5 = r5.mo13325a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.C3841g.C3843b.C3844a.emit(java.lang.Object, i.w.d):java.lang.Object");
                }
            }

            public C3843b(C8729b bVar) {
                this.f11950g = bVar;
            }

            public Object collect(C8730c cVar, C8508d dVar) {
                Object collect = this.f11950g.collect(new C3844a(cVar), dVar);
                if (collect == C8527d.m46722d()) {
                    return collect;
                }
                return C8457t.f34900a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3841g(C3832m<T> mVar, C8508d<? super C3841g> dVar) {
            super(2, dVar);
            this.this$0 = mVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C3841g gVar = new C3841g(this.this$0, dVar);
            gVar.L$0 = obj;
            return gVar;
        }

        public final Object invoke(C8730c<? super T> cVar, C8508d<? super C8457t> dVar) {
            return ((C3841g) create(cVar, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX WARNING: type inference failed for: r3v2, types: [kotlinx.coroutines.f3.j, kotlinx.coroutines.f3.b] */
        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C8730c cVar = (C8730c) this.L$0;
                C3858n nVar = (C3858n) this.this$0.f11941h.getValue();
                if (!(nVar instanceof C3815c)) {
                    this.this$0.f11943j.mo13329e(new C3834b.C3835a(nVar));
                }
                C3843b bVar = new C3843b(C8731d.m47256a(this.this$0.f11941h, new C3842a(nVar, (C8508d<? super C3842a>) null)));
                this.label = 1;
                if (C8731d.m47257b(cVar, bVar, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: e.k.b.m$h */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3846h extends C8595m implements C8559a<File> {
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3846h(C3832m<T> mVar) {
            super(0);
            this.this$0 = mVar;
        }

        public final File invoke() {
            File file = (File) this.this$0.f11934a.invoke();
            String absolutePath = file.getAbsolutePath();
            C3833a aVar = C3832m.f11931k;
            synchronized (aVar.mo13334b()) {
                if (!aVar.mo13333a().contains(absolutePath)) {
                    Set<String> a = aVar.mo13333a();
                    C8594l.m46770d(absolutePath, "it");
                    a.add(absolutePath);
                } else {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
            }
            return file;
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore", mo30600f = "SingleProcessDataStore.kt", mo30601l = {276, 281, 284}, mo30602m = "handleUpdate")
    /* renamed from: e.k.b.m$i */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3847i extends C8531d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3847i(C3832m<T> mVar, C8508d<? super C3847i> dVar) {
            super(dVar);
            this.this$0 = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m16498t((C3834b.C3836b) null, this);
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore", mo30600f = "SingleProcessDataStore.kt", mo30601l = {322, 348, 505}, mo30602m = "readAndInit")
    /* renamed from: e.k.b.m$j */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3848j extends C8531d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3848j(C3832m<T> mVar, C8508d<? super C3848j> dVar) {
            super(dVar);
            this.this$0 = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m16499u(this);
        }
    }

    /* renamed from: e.k.b.m$k */
    /* compiled from: SingleProcessDataStore.kt */
    public static final class C3849k implements C3826i<T> {

        /* renamed from: a */
        final /* synthetic */ C8801b f11952a;

        /* renamed from: b */
        final /* synthetic */ C8600r f11953b;

        /* renamed from: c */
        final /* synthetic */ C8602t<T> f11954c;

        /* renamed from: d */
        final /* synthetic */ C3832m<T> f11955d;

        @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", mo30600f = "SingleProcessDataStore.kt", mo30601l = {503, 337, 339}, mo30602m = "updateData")
        /* renamed from: e.k.b.m$k$a */
        /* compiled from: SingleProcessDataStore.kt */
        static final class C3850a extends C8531d {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C3849k this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3850a(C3849k kVar, C8508d<? super C3850a> dVar) {
                super(dVar);
                this.this$0 = kVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.mo13324a((C8574p) null, this);
            }
        }

        C3849k(C8801b bVar, C8600r rVar, C8602t<T> tVar, C3832m<T> mVar) {
            this.f11952a = bVar;
            this.f11953b = rVar;
            this.f11954c = tVar;
            this.f11955d = mVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba A[Catch:{ all -> 0x0056 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x003b }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A[SYNTHETIC, Splitter:B:47:0x00d7] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo13324a(p369i.p387z.p388c.C8574p<? super T, ? super p369i.p379w.C8508d<? super T>, ? extends java.lang.Object> r11, p369i.p379w.C8508d<? super T> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof p082e.p126k.p127b.C3832m.C3849k.C3850a
                if (r0 == 0) goto L_0x0013
                r0 = r12
                e.k.b.m$k$a r0 = (p082e.p126k.p127b.C3832m.C3849k.C3850a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                e.k.b.m$k$a r0 = new e.k.b.m$k$a
                r0.<init>(r10, r12)
            L_0x0018:
                java.lang.Object r12 = r0.result
                java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0076
                if (r2 == r5) goto L_0x005a
                if (r2 == r4) goto L_0x0046
                if (r2 != r3) goto L_0x003e
                java.lang.Object r11 = r0.L$2
                java.lang.Object r1 = r0.L$1
                i.z.d.t r1 = (p369i.p387z.p389d.C8602t) r1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.i3.b r0 = (kotlinx.coroutines.p401i3.C8801b) r0
                p369i.C8450m.m46575b(r12)     // Catch:{ all -> 0x003b }
                goto L_0x00cc
            L_0x003b:
                r11 = move-exception
                goto L_0x00e1
            L_0x003e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0046:
                java.lang.Object r11 = r0.L$2
                e.k.b.m r11 = (p082e.p126k.p127b.C3832m) r11
                java.lang.Object r2 = r0.L$1
                i.z.d.t r2 = (p369i.p387z.p389d.C8602t) r2
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.i3.b r4 = (kotlinx.coroutines.p401i3.C8801b) r4
                p369i.C8450m.m46575b(r12)     // Catch:{ all -> 0x0056 }
                goto L_0x00b2
            L_0x0056:
                r11 = move-exception
                r0 = r4
                goto L_0x00e1
            L_0x005a:
                java.lang.Object r11 = r0.L$4
                e.k.b.m r11 = (p082e.p126k.p127b.C3832m) r11
                java.lang.Object r2 = r0.L$3
                i.z.d.t r2 = (p369i.p387z.p389d.C8602t) r2
                java.lang.Object r5 = r0.L$2
                i.z.d.r r5 = (p369i.p387z.p389d.C8600r) r5
                java.lang.Object r7 = r0.L$1
                kotlinx.coroutines.i3.b r7 = (kotlinx.coroutines.p401i3.C8801b) r7
                java.lang.Object r8 = r0.L$0
                i.z.c.p r8 = (p369i.p387z.p388c.C8574p) r8
                p369i.C8450m.m46575b(r12)
                r12 = r7
                r9 = r8
                r8 = r11
                r11 = r9
                goto L_0x0096
            L_0x0076:
                p369i.C8450m.m46575b(r12)
                kotlinx.coroutines.i3.b r12 = r10.f11952a
                i.z.d.r r2 = r10.f11953b
                i.z.d.t<T> r7 = r10.f11954c
                e.k.b.m<T> r8 = r10.f11955d
                r0.L$0 = r11
                r0.L$1 = r12
                r0.L$2 = r2
                r0.L$3 = r7
                r0.L$4 = r8
                r0.label = r5
                java.lang.Object r5 = r12.mo31086a(r6, r0)
                if (r5 != r1) goto L_0x0094
                return r1
            L_0x0094:
                r5 = r2
                r2 = r7
            L_0x0096:
                boolean r5 = r5.element     // Catch:{ all -> 0x00df }
                if (r5 != 0) goto L_0x00d7
                T r5 = r2.element     // Catch:{ all -> 0x00df }
                r0.L$0 = r12     // Catch:{ all -> 0x00df }
                r0.L$1 = r2     // Catch:{ all -> 0x00df }
                r0.L$2 = r8     // Catch:{ all -> 0x00df }
                r0.L$3 = r6     // Catch:{ all -> 0x00df }
                r0.L$4 = r6     // Catch:{ all -> 0x00df }
                r0.label = r4     // Catch:{ all -> 0x00df }
                java.lang.Object r11 = r11.invoke(r5, r0)     // Catch:{ all -> 0x00df }
                if (r11 != r1) goto L_0x00af
                return r1
            L_0x00af:
                r4 = r12
                r12 = r11
                r11 = r8
            L_0x00b2:
                T r5 = r2.element     // Catch:{ all -> 0x0056 }
                boolean r5 = p369i.p387z.p389d.C8594l.m46767a(r12, r5)     // Catch:{ all -> 0x0056 }
                if (r5 != 0) goto L_0x00d0
                r0.L$0 = r4     // Catch:{ all -> 0x0056 }
                r0.L$1 = r2     // Catch:{ all -> 0x0056 }
                r0.L$2 = r12     // Catch:{ all -> 0x0056 }
                r0.label = r3     // Catch:{ all -> 0x0056 }
                java.lang.Object r11 = r11.mo13332A(r12, r0)     // Catch:{ all -> 0x0056 }
                if (r11 != r1) goto L_0x00c9
                return r1
            L_0x00c9:
                r11 = r12
                r1 = r2
                r0 = r4
            L_0x00cc:
                r1.element = r11     // Catch:{ all -> 0x003b }
                r2 = r1
                goto L_0x00d1
            L_0x00d0:
                r0 = r4
            L_0x00d1:
                T r11 = r2.element     // Catch:{ all -> 0x003b }
                r0.mo31087b(r6)
                return r11
            L_0x00d7:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00df }
                java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
                r11.<init>(r0)     // Catch:{ all -> 0x00df }
                throw r11     // Catch:{ all -> 0x00df }
            L_0x00df:
                r11 = move-exception
                r0 = r12
            L_0x00e1:
                r0.mo31087b(r6)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.C3849k.mo13324a(i.z.c.p, i.w.d):java.lang.Object");
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore", mo30600f = "SingleProcessDataStore.kt", mo30601l = {302}, mo30602m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: e.k.b.m$l */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3851l extends C8531d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3851l(C3832m<T> mVar, C8508d<? super C3851l> dVar) {
            super(dVar);
            this.this$0 = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m16500v(this);
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore", mo30600f = "SingleProcessDataStore.kt", mo30601l = {311}, mo30602m = "readAndInitOrPropagateFailure")
    /* renamed from: e.k.b.m$m */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3852m extends C8531d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3852m(C3832m<T> mVar, C8508d<? super C3852m> dVar) {
            super(dVar);
            this.this$0 = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m16501w(this);
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore", mo30600f = "SingleProcessDataStore.kt", mo30601l = {381}, mo30602m = "readData")
    /* renamed from: e.k.b.m$n */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3853n extends C8531d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3853n(C3832m<T> mVar, C8508d<? super C3853n> dVar) {
            super(dVar);
            this.this$0 = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m16502x(this);
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore", mo30600f = "SingleProcessDataStore.kt", mo30601l = {359, 362, 365}, mo30602m = "readDataOrHandleCorruption")
    /* renamed from: e.k.b.m$o */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3854o extends C8531d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3854o(C3832m<T> mVar, C8508d<? super C3854o> dVar) {
            super(dVar);
            this.this$0 = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m16503y(this);
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore", mo30600f = "SingleProcessDataStore.kt", mo30601l = {402, 410}, mo30602m = "transformAndWrite")
    /* renamed from: e.k.b.m$p */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3855p extends C8531d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3855p(C3832m<T> mVar, C8508d<? super C3855p> dVar) {
            super(dVar);
            this.this$0 = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m16504z((C8574p) null, (C8513g) null, this);
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", mo30600f = "SingleProcessDataStore.kt", mo30601l = {402}, mo30602m = "invokeSuspend")
    /* renamed from: e.k.b.m$q */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3856q extends C8539k implements C8574p<C8902r0, C8508d<? super T>, Object> {
        final /* synthetic */ T $curData;
        final /* synthetic */ C8574p<T, C8508d<? super T>, Object> $transform;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3856q(C8574p<? super T, ? super C8508d<? super T>, ? extends Object> pVar, T t, C8508d<? super C3856q> dVar) {
            super(2, dVar);
            this.$transform = pVar;
            this.$curData = t;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C3856q(this.$transform, this.$curData, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super T> dVar) {
            return ((C3856q) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C8574p<T, C8508d<? super T>, Object> pVar = this.$transform;
                T t = this.$curData;
                this.label = 1;
                obj = pVar.invoke(t, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @C8533f(mo30599c = "androidx.datastore.core.SingleProcessDataStore", mo30600f = "SingleProcessDataStore.kt", mo30601l = {426}, mo30602m = "writeData$datastore_core")
    /* renamed from: e.k.b.m$r */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C3857r extends C8531d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C3832m<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3857r(C3832m<T> mVar, C8508d<? super C3857r> dVar) {
            super(dVar);
            this.this$0 = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo13332A(null, this);
        }
    }

    public C3832m(C8559a<? extends File> aVar, C3828k<T> kVar, List<? extends C8574p<? super C3826i<T>, ? super C8508d<? super C8457t>, ? extends Object>> list, C3814b<T> bVar, C8902r0 r0Var) {
        C8594l.m46771e(aVar, "produceFile");
        C8594l.m46771e(kVar, "serializer");
        C8594l.m46771e(list, "initTasksList");
        C8594l.m46771e(bVar, "corruptionHandler");
        C8594l.m46771e(r0Var, "scope");
        this.f11934a = aVar;
        this.f11935b = kVar;
        this.f11936c = bVar;
        this.f11937d = r0Var;
        this.f11942i = C8490t.m46689z(list);
        this.f11943j = new C3829l<>(r0Var, new C3838d(this), C3839e.INSTANCE, new C3840f(this, (C8508d<? super C3840f>) null));
    }

    /* renamed from: q */
    private final void m16495q(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(C8594l.m46777k("Unable to create parent directories of ", file));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final File m16496r() {
        return (File) this.f11940g.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final Object m16497s(C3834b.C3835a<T> aVar, C8508d<? super C8457t> dVar) {
        C3858n<T> value = this.f11941h.getValue();
        if (!(value instanceof C3815c)) {
            if (value instanceof C3827j) {
                if (value == aVar.mo13335a()) {
                    Object w = m16501w(dVar);
                    return w == C8527d.m46722d() ? w : C8457t.f34900a;
                }
            } else if (C8594l.m46767a(value, C3859o.f11956a)) {
                Object w2 = m16501w(dVar);
                return w2 == C8527d.m46722d() ? w2 : C8457t.f34900a;
            } else if (value instanceof C3825h) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return C8457t.f34900a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m16498t(p082e.p126k.p127b.C3832m.C3834b.C3836b<T> r9, p369i.p379w.C8508d<? super p369i.C8457t> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p082e.p126k.p127b.C3832m.C3847i
            if (r0 == 0) goto L_0x0013
            r0 = r10
            e.k.b.m$i r0 = (p082e.p126k.p127b.C3832m.C3847i) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            e.k.b.m$i r0 = new e.k.b.m$i
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.a0 r9 = (kotlinx.coroutines.C8663a0) r9
            goto L_0x004e
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.a0 r9 = (kotlinx.coroutines.C8663a0) r9
            java.lang.Object r2 = r0.L$1
            e.k.b.m r2 = (p082e.p126k.p127b.C3832m) r2
            java.lang.Object r4 = r0.L$0
            e.k.b.m$b$b r4 = (p082e.p126k.p127b.C3832m.C3834b.C3836b) r4
            p369i.C8450m.m46575b(r10)     // Catch:{ all -> 0x0052 }
            r10 = r9
            r9 = r4
            goto L_0x00a0
        L_0x004a:
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.a0 r9 = (kotlinx.coroutines.C8663a0) r9
        L_0x004e:
            p369i.C8450m.m46575b(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00b8
        L_0x0052:
            r10 = move-exception
            goto L_0x00d9
        L_0x0055:
            p369i.C8450m.m46575b(r10)
            kotlinx.coroutines.a0 r10 = r9.mo13336a()
            i.l$a r2 = p369i.C8447l.Companion     // Catch:{ all -> 0x00d5 }
            kotlinx.coroutines.f3.j<e.k.b.n<T>> r2 = r8.f11941h     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00d5 }
            e.k.b.n r2 = (p082e.p126k.p127b.C3858n) r2     // Catch:{ all -> 0x00d5 }
            boolean r6 = r2 instanceof p082e.p126k.p127b.C3815c     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0081
            i.z.c.p r2 = r9.mo13339d()     // Catch:{ all -> 0x00d5 }
            i.w.g r9 = r9.mo13337b()     // Catch:{ all -> 0x00d5 }
            r0.L$0 = r10     // Catch:{ all -> 0x00d5 }
            r0.label = r5     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r8.m16504z(r2, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00b8
        L_0x0081:
            boolean r6 = r2 instanceof p082e.p126k.p127b.C3827j     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            boolean r5 = r2 instanceof p082e.p126k.p127b.C3859o     // Catch:{ all -> 0x00d5 }
        L_0x0088:
            if (r5 == 0) goto L_0x00c4
            e.k.b.n r5 = r9.mo13338c()     // Catch:{ all -> 0x00d5 }
            if (r2 != r5) goto L_0x00bd
            r0.L$0 = r9     // Catch:{ all -> 0x00d5 }
            r0.L$1 = r8     // Catch:{ all -> 0x00d5 }
            r0.L$2 = r10     // Catch:{ all -> 0x00d5 }
            r0.label = r4     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r8.m16500v(r0)     // Catch:{ all -> 0x00d5 }
            if (r2 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r2 = r8
        L_0x00a0:
            i.z.c.p r4 = r9.mo13339d()     // Catch:{ all -> 0x00d5 }
            i.w.g r9 = r9.mo13337b()     // Catch:{ all -> 0x00d5 }
            r0.L$0 = r10     // Catch:{ all -> 0x00d5 }
            r5 = 0
            r0.L$1 = r5     // Catch:{ all -> 0x00d5 }
            r0.L$2 = r5     // Catch:{ all -> 0x00d5 }
            r0.label = r3     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r2.m16504z(r4, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x00b8:
            java.lang.Object r10 = p369i.C8447l.m50326constructorimpl(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00e3
        L_0x00bd:
            e.k.b.j r2 = (p082e.p126k.p127b.C3827j) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.mo13325a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00c4:
            boolean r9 = r2 instanceof p082e.p126k.p127b.C3825h     // Catch:{ all -> 0x00d5 }
            if (r9 == 0) goto L_0x00cf
            e.k.b.h r2 = (p082e.p126k.p127b.C3825h) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.mo13323a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00cf:
            i.j r9 = new i.j     // Catch:{ all -> 0x00d5 }
            r9.<init>()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00d9:
            i.l$a r0 = p369i.C8447l.Companion
            java.lang.Object r10 = p369i.C8450m.m46574a(r10)
            java.lang.Object r10 = p369i.C8447l.m50326constructorimpl(r10)
        L_0x00e3:
            kotlinx.coroutines.C8680c0.m47099c(r9, r10)
            i.t r9 = p369i.C8457t.f34900a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.m16498t(e.k.b.m$b$b, i.w.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m16499u(p369i.p379w.C8508d<? super p369i.C8457t> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof p082e.p126k.p127b.C3832m.C3848j
            if (r0 == 0) goto L_0x0013
            r0 = r14
            e.k.b.m$j r0 = (p082e.p126k.p127b.C3832m.C3848j) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            e.k.b.m$j r0 = new e.k.b.m$j
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x007b
            if (r2 == r6) goto L_0x0067
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r1 = r0.L$3
            kotlinx.coroutines.i3.b r1 = (kotlinx.coroutines.p401i3.C8801b) r1
            java.lang.Object r2 = r0.L$2
            i.z.d.r r2 = (p369i.p387z.p389d.C8600r) r2
            java.lang.Object r3 = r0.L$1
            i.z.d.t r3 = (p369i.p387z.p389d.C8602t) r3
            java.lang.Object r0 = r0.L$0
            e.k.b.m r0 = (p082e.p126k.p127b.C3832m) r0
            p369i.C8450m.m46575b(r14)
            goto L_0x0117
        L_0x0042:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x004a:
            java.lang.Object r2 = r0.L$5
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r8 = r0.L$4
            e.k.b.m$k r8 = (p082e.p126k.p127b.C3832m.C3849k) r8
            java.lang.Object r9 = r0.L$3
            i.z.d.r r9 = (p369i.p387z.p389d.C8600r) r9
            java.lang.Object r10 = r0.L$2
            i.z.d.t r10 = (p369i.p387z.p389d.C8602t) r10
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.i3.b r11 = (kotlinx.coroutines.p401i3.C8801b) r11
            java.lang.Object r12 = r0.L$0
            e.k.b.m r12 = (p082e.p126k.p127b.C3832m) r12
            p369i.C8450m.m46575b(r14)
            goto L_0x00d8
        L_0x0067:
            java.lang.Object r2 = r0.L$3
            i.z.d.t r2 = (p369i.p387z.p389d.C8602t) r2
            java.lang.Object r8 = r0.L$2
            i.z.d.t r8 = (p369i.p387z.p389d.C8602t) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.i3.b r9 = (kotlinx.coroutines.p401i3.C8801b) r9
            java.lang.Object r10 = r0.L$0
            e.k.b.m r10 = (p082e.p126k.p127b.C3832m) r10
            p369i.C8450m.m46575b(r14)
            goto L_0x00b8
        L_0x007b:
            p369i.C8450m.m46575b(r14)
            kotlinx.coroutines.f3.j<e.k.b.n<T>> r14 = r13.f11941h
            java.lang.Object r14 = r14.getValue()
            e.k.b.o r2 = p082e.p126k.p127b.C3859o.f11956a
            boolean r14 = p369i.p387z.p389d.C8594l.m46767a(r14, r2)
            if (r14 != 0) goto L_0x0099
            kotlinx.coroutines.f3.j<e.k.b.n<T>> r14 = r13.f11941h
            java.lang.Object r14 = r14.getValue()
            boolean r14 = r14 instanceof p082e.p126k.p127b.C3827j
            if (r14 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r14 = 0
            goto L_0x009a
        L_0x0099:
            r14 = 1
        L_0x009a:
            if (r14 == 0) goto L_0x0136
            kotlinx.coroutines.i3.b r9 = kotlinx.coroutines.p401i3.C8809d.m47495b(r5, r6, r7)
            i.z.d.t r2 = new i.z.d.t
            r2.<init>()
            r0.L$0 = r13
            r0.L$1 = r9
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r6
            java.lang.Object r14 = r13.m16503y(r0)
            if (r14 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r10 = r13
            r8 = r2
        L_0x00b8:
            r2.element = r14
            i.z.d.r r14 = new i.z.d.r
            r14.<init>()
            e.k.b.m$k r2 = new e.k.b.m$k
            r2.<init>(r9, r14, r8, r10)
            java.util.List<? extends i.z.c.p<? super e.k.b.i<T>, ? super i.w.d<? super i.t>, ? extends java.lang.Object>> r11 = r10.f11942i
            if (r11 != 0) goto L_0x00ce
            r2 = r1
            r1 = r9
            r9 = r14
            r14 = r0
            r0 = r10
            goto L_0x00fe
        L_0x00ce:
            java.util.Iterator r11 = r11.iterator()
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r11
            r11 = r9
            r9 = r14
        L_0x00d8:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00f9
            java.lang.Object r14 = r2.next()
            i.z.c.p r14 = (p369i.p387z.p388c.C8574p) r14
            r0.L$0 = r12
            r0.L$1 = r11
            r0.L$2 = r10
            r0.L$3 = r9
            r0.L$4 = r8
            r0.L$5 = r2
            r0.label = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto L_0x00d8
            return r1
        L_0x00f9:
            r14 = r0
            r2 = r1
            r8 = r10
            r1 = r11
            r0 = r12
        L_0x00fe:
            r0.f11942i = r7
            r14.L$0 = r0
            r14.L$1 = r8
            r14.L$2 = r9
            r14.L$3 = r1
            r14.L$4 = r7
            r14.L$5 = r7
            r14.label = r3
            java.lang.Object r14 = r1.mo31086a(r7, r14)
            if (r14 != r2) goto L_0x0115
            return r2
        L_0x0115:
            r3 = r8
            r2 = r9
        L_0x0117:
            r2.element = r6     // Catch:{ all -> 0x0131 }
            i.t r14 = p369i.C8457t.f34900a     // Catch:{ all -> 0x0131 }
            r1.mo31087b(r7)
            kotlinx.coroutines.f3.j<e.k.b.n<T>> r0 = r0.f11941h
            e.k.b.c r1 = new e.k.b.c
            T r2 = r3.element
            if (r2 == 0) goto L_0x012a
            int r5 = r2.hashCode()
        L_0x012a:
            r1.<init>(r2, r5)
            r0.setValue(r1)
            return r14
        L_0x0131:
            r14 = move-exception
            r1.mo31087b(r7)
            throw r14
        L_0x0136:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.m16499u(i.w.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m16500v(p369i.p379w.C8508d<? super p369i.C8457t> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p082e.p126k.p127b.C3832m.C3851l
            if (r0 == 0) goto L_0x0013
            r0 = r5
            e.k.b.m$l r0 = (p082e.p126k.p127b.C3832m.C3851l) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            e.k.b.m$l r0 = new e.k.b.m$l
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.L$0
            e.k.b.m r0 = (p082e.p126k.p127b.C3832m) r0
            p369i.C8450m.m46575b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            p369i.C8450m.m46575b(r5)
            r0.L$0 = r4     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r4.m16499u(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            i.t r5 = p369i.C8457t.f34900a
            return r5
        L_0x0048:
            r5 = move-exception
            r0 = r4
        L_0x004a:
            kotlinx.coroutines.f3.j<e.k.b.n<T>> r0 = r0.f11941h
            e.k.b.j r1 = new e.k.b.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.m16500v(i.w.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m16501w(p369i.p379w.C8508d<? super p369i.C8457t> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p082e.p126k.p127b.C3832m.C3852m
            if (r0 == 0) goto L_0x0013
            r0 = r5
            e.k.b.m$m r0 = (p082e.p126k.p127b.C3832m.C3852m) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            e.k.b.m$m r0 = new e.k.b.m$m
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.L$0
            e.k.b.m r0 = (p082e.p126k.p127b.C3832m) r0
            p369i.C8450m.m46575b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0051
        L_0x002d:
            r5 = move-exception
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            p369i.C8450m.m46575b(r5)
            r0.L$0 = r4     // Catch:{ all -> 0x0045 }
            r0.label = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r4.m16499u(r0)     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0045:
            r5 = move-exception
            r0 = r4
        L_0x0047:
            kotlinx.coroutines.f3.j<e.k.b.n<T>> r0 = r0.f11941h
            e.k.b.j r1 = new e.k.b.j
            r1.<init>(r5)
            r0.setValue(r1)
        L_0x0051:
            i.t r5 = p369i.C8457t.f34900a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.m16501w(i.w.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        p369i.p386y.C8547b.m46749a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0060, B:30:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m16502x(p369i.p379w.C8508d<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p082e.p126k.p127b.C3832m.C3853n
            if (r0 == 0) goto L_0x0013
            r0 = r6
            e.k.b.m$n r0 = (p082e.p126k.p127b.C3832m.C3853n) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            e.k.b.m$n r0 = new e.k.b.m$n
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.L$2
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$1
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.L$0
            e.k.b.m r0 = (p082e.p126k.p127b.C3832m) r0
            p369i.C8450m.m46575b(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x0060
        L_0x0035:
            r6 = move-exception
            goto L_0x0068
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            p369i.C8450m.m46575b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006e }
            java.io.File r6 = r5.m16496r()     // Catch:{ FileNotFoundException -> 0x006e }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x006e }
            r6 = 0
            e.k.b.k<T> r4 = r5.f11935b     // Catch:{ all -> 0x0066 }
            r0.L$0 = r5     // Catch:{ all -> 0x0066 }
            r0.L$1 = r2     // Catch:{ all -> 0x0066 }
            r0.L$2 = r6     // Catch:{ all -> 0x0066 }
            r0.label = r3     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r4.mo13328c(r2, r0)     // Catch:{ all -> 0x0066 }
            if (r0 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r1 = r6
            r6 = r0
            r0 = r5
        L_0x0060:
            p369i.p386y.C8547b.m46749a(r2, r1)     // Catch:{ FileNotFoundException -> 0x0064 }
            return r6
        L_0x0064:
            r6 = move-exception
            goto L_0x0070
        L_0x0066:
            r6 = move-exception
            r0 = r5
        L_0x0068:
            throw r6     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            p369i.p386y.C8547b.m46749a(r2, r6)     // Catch:{ FileNotFoundException -> 0x0064 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0064 }
        L_0x006e:
            r6 = move-exception
            r0 = r5
        L_0x0070:
            java.io.File r1 = r0.m16496r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0081
            e.k.b.k<T> r6 = r0.f11935b
            java.lang.Object r6 = r6.mo13326a()
            return r6
        L_0x0081:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.m16502x(i.w.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m16503y(p369i.p379w.C8508d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p082e.p126k.p127b.C3832m.C3854o
            if (r0 == 0) goto L_0x0013
            r0 = r8
            e.k.b.m$o r0 = (p082e.p126k.p127b.C3832m.C3854o) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            e.k.b.m$o r0 = new e.k.b.m$o
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            e.k.b.a r0 = (p082e.p126k.p127b.C3813a) r0
            p369i.C8450m.m46575b(r8)     // Catch:{ IOException -> 0x0035 }
            goto L_0x0087
        L_0x0035:
            r8 = move-exception
            goto L_0x008a
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.L$1
            e.k.b.a r2 = (p082e.p126k.p127b.C3813a) r2
            java.lang.Object r4 = r0.L$0
            e.k.b.m r4 = (p082e.p126k.p127b.C3832m) r4
            p369i.C8450m.m46575b(r8)
            goto L_0x0079
        L_0x004b:
            java.lang.Object r2 = r0.L$0
            e.k.b.m r2 = (p082e.p126k.p127b.C3832m) r2
            p369i.C8450m.m46575b(r8)     // Catch:{ a -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r8 = move-exception
            goto L_0x0066
        L_0x0055:
            p369i.C8450m.m46575b(r8)
            r0.L$0 = r7     // Catch:{ a -> 0x0064 }
            r0.label = r5     // Catch:{ a -> 0x0064 }
            java.lang.Object r8 = r7.m16502x(r0)     // Catch:{ a -> 0x0064 }
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r8
        L_0x0064:
            r8 = move-exception
            r2 = r7
        L_0x0066:
            e.k.b.b<T> r5 = r2.f11936c
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r4 = r5.mo13309a(r8, r0)
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L_0x0079:
            r0.L$0 = r2     // Catch:{ IOException -> 0x0088 }
            r0.L$1 = r8     // Catch:{ IOException -> 0x0088 }
            r0.label = r3     // Catch:{ IOException -> 0x0088 }
            java.lang.Object r0 = r4.mo13332A(r8, r0)     // Catch:{ IOException -> 0x0088 }
            if (r0 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r1 = r8
        L_0x0087:
            return r1
        L_0x0088:
            r8 = move-exception
            r0 = r2
        L_0x008a:
            p369i.C8375b.m46425a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.m16503y(i.w.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m16504z(p369i.p387z.p388c.C8574p<? super T, ? super p369i.p379w.C8508d<? super T>, ? extends java.lang.Object> r8, p369i.p379w.C8513g r9, p369i.p379w.C8508d<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p082e.p126k.p127b.C3832m.C3855p
            if (r0 == 0) goto L_0x0013
            r0 = r10
            e.k.b.m$p r0 = (p082e.p126k.p127b.C3832m.C3855p) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            e.k.b.m$p r0 = new e.k.b.m$p
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r8 = r0.L$1
            java.lang.Object r9 = r0.L$0
            e.k.b.m r9 = (p082e.p126k.p127b.C3832m) r9
            p369i.C8450m.m46575b(r10)
            goto L_0x008e
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.L$2
            java.lang.Object r9 = r0.L$1
            e.k.b.c r9 = (p082e.p126k.p127b.C3815c) r9
            java.lang.Object r2 = r0.L$0
            e.k.b.m r2 = (p082e.p126k.p127b.C3832m) r2
            p369i.C8450m.m46575b(r10)
            goto L_0x0073
        L_0x0049:
            p369i.C8450m.m46575b(r10)
            kotlinx.coroutines.f3.j<e.k.b.n<T>> r10 = r7.f11941h
            java.lang.Object r10 = r10.getValue()
            e.k.b.c r10 = (p082e.p126k.p127b.C3815c) r10
            r10.mo13310a()
            java.lang.Object r2 = r10.mo13311b()
            e.k.b.m$q r6 = new e.k.b.m$q
            r6.<init>(r8, r2, r3)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.L$2 = r2
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.C8864k.m47676e(r9, r6, r0)
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L_0x0073:
            r9.mo13310a()
            boolean r9 = p369i.p387z.p389d.C8594l.m46767a(r8, r10)
            if (r9 == 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r3
            r0.label = r4
            java.lang.Object r8 = r2.mo13332A(r10, r0)
            if (r8 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r8 = r10
            r9 = r2
        L_0x008e:
            kotlinx.coroutines.f3.j<e.k.b.n<T>> r9 = r9.f11941h
            e.k.b.c r10 = new e.k.b.c
            if (r8 == 0) goto L_0x0099
            int r0 = r8.hashCode()
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        L_0x00a0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.m16504z(i.z.c.p, i.w.g, i.w.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        p369i.p386y.C8547b.m46749a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x0092, B:34:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0 A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo13332A(T r8, p369i.p379w.C8508d<? super p369i.C8457t> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p082e.p126k.p127b.C3832m.C3857r
            if (r0 == 0) goto L_0x0013
            r0 = r9
            e.k.b.m$r r0 = (p082e.p126k.p127b.C3832m.C3857r) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            e.k.b.m$r r0 = new e.k.b.m$r
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r8 = r0.L$4
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.L$3
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$2
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.L$1
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.L$0
            e.k.b.m r0 = (p082e.p126k.p127b.C3832m) r0
            p369i.C8450m.m46575b(r9)     // Catch:{ all -> 0x003d }
            goto L_0x0089
        L_0x003d:
            r8 = move-exception
            goto L_0x00be
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0048:
            p369i.C8450m.m46575b(r9)
            java.io.File r9 = r7.m16496r()
            r7.m16495q(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.m16496r()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f11939f
            java.lang.String r2 = p369i.p387z.p389d.C8594l.m46777k(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c7 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x00c7 }
            r4 = 0
            e.k.b.k<T> r5 = r7.f11935b     // Catch:{ all -> 0x00bc }
            e.k.b.m$c r6 = new e.k.b.m$c     // Catch:{ all -> 0x00bc }
            r6.<init>(r2)     // Catch:{ all -> 0x00bc }
            r0.L$0 = r7     // Catch:{ all -> 0x00bc }
            r0.L$1 = r9     // Catch:{ all -> 0x00bc }
            r0.L$2 = r2     // Catch:{ all -> 0x00bc }
            r0.L$3 = r4     // Catch:{ all -> 0x00bc }
            r0.L$4 = r2     // Catch:{ all -> 0x00bc }
            r0.label = r3     // Catch:{ all -> 0x00bc }
            java.lang.Object r8 = r5.mo13327b(r8, r6, r0)     // Catch:{ all -> 0x00bc }
            if (r8 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L_0x0089:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch:{ all -> 0x003d }
            r8.sync()     // Catch:{ all -> 0x003d }
            i.t r8 = p369i.C8457t.f34900a     // Catch:{ all -> 0x003d }
            p369i.p386y.C8547b.m46749a(r2, r1)     // Catch:{ IOException -> 0x00c4 }
            java.io.File r9 = r0.m16496r()     // Catch:{ IOException -> 0x00c4 }
            boolean r9 = r3.renameTo(r9)     // Catch:{ IOException -> 0x00c4 }
            if (r9 == 0) goto L_0x00a0
            return r8
        L_0x00a0:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x00c4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c4 }
            r9.<init>()     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            r9.append(r3)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x00c4 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00c4 }
            throw r8     // Catch:{ IOException -> 0x00c4 }
        L_0x00bc:
            r8 = move-exception
            r3 = r9
        L_0x00be:
            throw r8     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r9 = move-exception
            p369i.p386y.C8547b.m46749a(r2, r8)     // Catch:{ IOException -> 0x00c4 }
            throw r9     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            r8 = move-exception
            r9 = r3
            goto L_0x00c8
        L_0x00c7:
            r8 = move-exception
        L_0x00c8:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x00d1
            r9.delete()
        L_0x00d1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3832m.mo13332A(java.lang.Object, i.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo13320a(C8574p<? super T, ? super C8508d<? super T>, ? extends Object> pVar, C8508d<? super T> dVar) {
        C8663a0 b = C8680c0.m47098b((C8665a2) null, 1, (Object) null);
        this.f11943j.mo13329e(new C3834b.C3836b(pVar, b, this.f11941h.getValue(), dVar.getContext()));
        return b.mo30880Q(dVar);
    }

    /* renamed from: b */
    public C8729b<T> mo13321b() {
        return this.f11938e;
    }
}
