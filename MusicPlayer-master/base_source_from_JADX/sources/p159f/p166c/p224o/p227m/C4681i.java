package p159f.p166c.p224o.p227m;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.C0653a;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.C0684j;
import androidx.lifecycle.C0692l0;
import androidx.lifecycle.C0701n0;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.p397f3.C8729b;
import kotlinx.coroutines.p397f3.C8730c;
import kotlinx.coroutines.p397f3.C8731d;
import p082e.p126k.p127b.C3823f;
import p082e.p126k.p129c.p130i.C3878a;
import p082e.p126k.p129c.p130i.C3884d;
import p082e.p126k.p129c.p130i.C3888f;
import p082e.p126k.p129c.p130i.C3889g;
import p159f.p166c.p224o.p226l.C4657g;
import p369i.C8446k;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8529b;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.m.i */
/* compiled from: VideoLibraryViewModel.kt */
public final class C4681i extends C0653a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Application f13465c;

    /* renamed from: d */
    private final C0670e0<Boolean> f13466d;

    /* renamed from: e */
    private final LiveData<Boolean> f13467e;

    /* renamed from: f */
    private final C0670e0<Integer> f13468f;

    /* renamed from: g */
    private final C4678g<Integer> f13469g = new C4678g<>();

    /* renamed from: h */
    private final C0670e0<Integer> f13470h;

    /* renamed from: i */
    private final C0670e0<Long> f13471i;

    /* renamed from: j */
    private final C0670e0<Boolean> f13472j;

    /* renamed from: k */
    private final LiveData<Boolean> f13473k;

    /* renamed from: l */
    private final C0670e0<String> f13474l;

    /* renamed from: m */
    private final C0670e0<Integer> f13475m;

    /* renamed from: n */
    private boolean f13476n;

    /* renamed from: o */
    private final LiveData<Integer> f13477o;

    /* renamed from: p */
    private final LiveData<Integer> f13478p;

    /* renamed from: q */
    private final LiveData<C8446k<String, Boolean>> f13479q;

    /* renamed from: r */
    private final LiveData<C8446k<String, Boolean>> f13480r;

    /* renamed from: s */
    private final LiveData<List<C8446k<String, Boolean>>> f13481s;

    @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$changeCurrentFunction$1", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {165}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.o.m.i$a */
    /* compiled from: VideoLibraryViewModel.kt */
    static final class C4682a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ int $function;
        int label;
        final /* synthetic */ C4681i this$0;

        @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$changeCurrentFunction$1$1", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.o.m.i$a$a */
        /* compiled from: VideoLibraryViewModel.kt */
        static final class C4683a extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
            final /* synthetic */ int $function;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4683a(int i, C8508d<? super C4683a> dVar) {
                super(2, dVar);
                this.$function = i;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C4683a aVar = new C4683a(this.$function, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
                return ((C4683a) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    ((C3878a) this.L$0).mo13384i(C3888f.m16599d("current_show_function"), C8529b.m46724b(this.$function));
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4682a(C4681i iVar, int i, C8508d<? super C4682a> dVar) {
            super(2, dVar);
            this.this$0 = iVar;
            this.$function = i;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4682a(this.this$0, this.$function, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4682a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C3823f<C3884d> a = C4657g.m20158a(this.this$0.f13465c);
                C4683a aVar = new C4683a(this.$function, (C8508d<? super C4683a>) null);
                this.label = 1;
                if (C3889g.m16603a(a, aVar, this) == d) {
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

    /* renamed from: f.c.o.m.i$b */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4684b implements C8729b<Boolean> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13482g;

        /* renamed from: f.c.o.m.i$b$a */
        /* compiled from: Collect.kt */
        public static final class C4685a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13483g;

            @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$isFirstRequestPermission$$inlined$map$1$2", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.o.m.i$b$a$a */
            public static final class C4686a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4685a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4686a(C4685a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4685a(C8730c cVar) {
                this.f13483g = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p369i.p379w.C8508d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p159f.p166c.p224o.p227m.C4681i.C4684b.C4685a.C4686a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    f.c.o.m.i$b$a$a r0 = (p159f.p166c.p224o.p227m.C4681i.C4684b.C4685a.C4686a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.o.m.i$b$a$a r0 = new f.c.o.m.i$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r6)
                    goto L_0x0059
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p369i.C8450m.m46575b(r6)
                    kotlinx.coroutines.f3.c r6 = r4.f13483g
                    e.k.c.i.d r5 = (p082e.p126k.p129c.p130i.C3884d) r5
                    java.lang.String r2 = "is_first_request_permission"
                    e.k.c.i.d$a r2 = p082e.p126k.p129c.p130i.C3888f.m16596a(r2)
                    java.lang.Object r5 = r5.mo13377b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 != 0) goto L_0x0048
                    r5 = 1
                    goto L_0x004c
                L_0x0048:
                    boolean r5 = r5.booleanValue()
                L_0x004c:
                    java.lang.Boolean r5 = p369i.p379w.p381j.p382a.C8529b.m46723a(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0059
                    return r1
                L_0x0059:
                    i.t r5 = p369i.C8457t.f34900a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p224o.p227m.C4681i.C4684b.C4685a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4684b(C8729b bVar) {
            this.f13482g = bVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13482g.collect(new C4685a(cVar), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$saveIsFirstRequestPermission$1", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {206}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.o.m.i$c */
    /* compiled from: VideoLibraryViewModel.kt */
    static final class C4687c extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ boolean $isFirst;
        int label;
        final /* synthetic */ C4681i this$0;

        @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$saveIsFirstRequestPermission$1$1", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.o.m.i$c$a */
        /* compiled from: VideoLibraryViewModel.kt */
        static final class C4688a extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
            final /* synthetic */ boolean $isFirst;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4688a(boolean z, C8508d<? super C4688a> dVar) {
                super(2, dVar);
                this.$isFirst = z;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C4688a aVar = new C4688a(this.$isFirst, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
                return ((C4688a) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    ((C3878a) this.L$0).mo13384i(C3888f.m16596a("is_first_request_permission"), C8529b.m46723a(this.$isFirst));
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4687c(C4681i iVar, boolean z, C8508d<? super C4687c> dVar) {
            super(2, dVar);
            this.this$0 = iVar;
            this.$isFirst = z;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4687c(this.this$0, this.$isFirst, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4687c) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C3823f<C3884d> a = C4657g.m20158a(this.this$0.f13465c);
                C4688a aVar = new C4688a(this.$isFirst, (C8508d<? super C4688a>) null);
                this.label = 1;
                if (C3889g.m16603a(a, aVar, this) == d) {
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

    @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$setSort$1", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {176}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.o.m.i$d */
    /* compiled from: VideoLibraryViewModel.kt */
    static final class C4689d extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ boolean $asc;
        final /* synthetic */ boolean $isEncrypted;
        final /* synthetic */ boolean $isFolder;
        final /* synthetic */ String $sort;
        int label;
        final /* synthetic */ C4681i this$0;

        @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$setSort$1$1", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.o.m.i$d$a */
        /* compiled from: VideoLibraryViewModel.kt */
        static final class C4690a extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
            final /* synthetic */ boolean $asc;
            final /* synthetic */ boolean $isEncrypted;
            final /* synthetic */ boolean $isFolder;
            final /* synthetic */ String $sort;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4690a(boolean z, boolean z2, String str, boolean z3, C8508d<? super C4690a> dVar) {
                super(2, dVar);
                this.$isFolder = z;
                this.$isEncrypted = z2;
                this.$sort = str;
                this.$asc = z3;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C4690a aVar = new C4690a(this.$isFolder, this.$isEncrypted, this.$sort, this.$asc, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
                return ((C4690a) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    C3878a aVar = (C3878a) this.L$0;
                    C3884d.C3885a<String> f = C3888f.m16601f(this.$isFolder ? "folder_sort_by" : this.$isEncrypted ? "encrypted_video_sort_by" : "video_sort_by");
                    aVar.mo13384i(f, this.$sort + '-' + this.$asc);
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4689d(C4681i iVar, boolean z, boolean z2, String str, boolean z3, C8508d<? super C4689d> dVar) {
            super(2, dVar);
            this.this$0 = iVar;
            this.$isFolder = z;
            this.$isEncrypted = z2;
            this.$sort = str;
            this.$asc = z3;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4689d(this.this$0, this.$isFolder, this.$isEncrypted, this.$sort, this.$asc, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4689d) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C3823f<C3884d> a = C4657g.m20158a(this.this$0.f13465c);
                C4690a aVar = new C4690a(this.$isFolder, this.$isEncrypted, this.$sort, this.$asc, (C8508d<? super C4690a>) null);
                this.label = 1;
                if (C3889g.m16603a(a, aVar, this) == d) {
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

    /* renamed from: f.c.o.m.i$e */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4691e implements C8729b<Integer> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13484g;

        /* renamed from: f.c.o.m.i$e$a */
        /* compiled from: Collect.kt */
        public static final class C4692a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13485g;

            @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$special$$inlined$map$1$2", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.o.m.i$e$a$a */
            public static final class C4693a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4692a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4693a(C4692a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4692a(C8730c cVar) {
                this.f13485g = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p369i.p379w.C8508d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p159f.p166c.p224o.p227m.C4681i.C4691e.C4692a.C4693a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    f.c.o.m.i$e$a$a r0 = (p159f.p166c.p224o.p227m.C4681i.C4691e.C4692a.C4693a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.o.m.i$e$a$a r0 = new f.c.o.m.i$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r6)
                    goto L_0x0059
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p369i.C8450m.m46575b(r6)
                    kotlinx.coroutines.f3.c r6 = r4.f13485g
                    e.k.c.i.d r5 = (p082e.p126k.p129c.p130i.C3884d) r5
                    java.lang.String r2 = "view_type"
                    e.k.c.i.d$a r2 = p082e.p126k.p129c.p130i.C3888f.m16599d(r2)
                    java.lang.Object r5 = r5.mo13377b(r2)
                    java.lang.Integer r5 = (java.lang.Integer) r5
                    if (r5 != 0) goto L_0x0048
                    r5 = 0
                    goto L_0x004c
                L_0x0048:
                    int r5 = r5.intValue()
                L_0x004c:
                    java.lang.Integer r5 = p369i.p379w.p381j.p382a.C8529b.m46724b(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0059
                    return r1
                L_0x0059:
                    i.t r5 = p369i.C8457t.f34900a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p224o.p227m.C4681i.C4691e.C4692a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4691e(C8729b bVar) {
            this.f13484g = bVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13484g.collect(new C4692a(cVar), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: f.c.o.m.i$f */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4694f implements C8729b<Integer> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13486g;

        /* renamed from: f.c.o.m.i$f$a */
        /* compiled from: Collect.kt */
        public static final class C4695a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13487g;

            @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$special$$inlined$map$2$2", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.o.m.i$f$a$a */
            public static final class C4696a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4695a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4696a(C4695a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4695a(C8730c cVar) {
                this.f13487g = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p369i.p379w.C8508d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p159f.p166c.p224o.p227m.C4681i.C4694f.C4695a.C4696a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    f.c.o.m.i$f$a$a r0 = (p159f.p166c.p224o.p227m.C4681i.C4694f.C4695a.C4696a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.o.m.i$f$a$a r0 = new f.c.o.m.i$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r6)
                    goto L_0x0059
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p369i.C8450m.m46575b(r6)
                    kotlinx.coroutines.f3.c r6 = r4.f13487g
                    e.k.c.i.d r5 = (p082e.p126k.p129c.p130i.C3884d) r5
                    java.lang.String r2 = "current_show_function"
                    e.k.c.i.d$a r2 = p082e.p126k.p129c.p130i.C3888f.m16599d(r2)
                    java.lang.Object r5 = r5.mo13377b(r2)
                    java.lang.Integer r5 = (java.lang.Integer) r5
                    if (r5 != 0) goto L_0x0048
                    r5 = 0
                    goto L_0x004c
                L_0x0048:
                    int r5 = r5.intValue()
                L_0x004c:
                    java.lang.Integer r5 = p369i.p379w.p381j.p382a.C8529b.m46724b(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0059
                    return r1
                L_0x0059:
                    i.t r5 = p369i.C8457t.f34900a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p224o.p227m.C4681i.C4694f.C4695a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4694f(C8729b bVar) {
            this.f13486g = bVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13486g.collect(new C4695a(cVar), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: f.c.o.m.i$g */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4697g implements C8729b<C8446k<? extends String, ? extends Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13488g;

        /* renamed from: h */
        final /* synthetic */ C4681i f13489h;

        /* renamed from: f.c.o.m.i$g$a */
        /* compiled from: Collect.kt */
        public static final class C4698a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13490g;

            /* renamed from: h */
            final /* synthetic */ C4681i f13491h;

            @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$special$$inlined$map$3$2", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.o.m.i$g$a$a */
            public static final class C4699a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4698a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4699a(C4698a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4698a(C8730c cVar, C4681i iVar) {
                this.f13490g = cVar;
                this.f13491h = iVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, p369i.p379w.C8508d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof p159f.p166c.p224o.p227m.C4681i.C4697g.C4698a.C4699a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    f.c.o.m.i$g$a$a r0 = (p159f.p166c.p224o.p227m.C4681i.C4697g.C4698a.C4699a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.o.m.i$g$a$a r0 = new f.c.o.m.i$g$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r7)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    p369i.C8450m.m46575b(r7)
                    kotlinx.coroutines.f3.c r7 = r5.f13490g
                    e.k.c.i.d r6 = (p082e.p126k.p129c.p130i.C3884d) r6
                    f.c.o.m.i r2 = r5.f13491h
                    java.lang.String r4 = "video_sort_by"
                    e.k.c.i.d$a r4 = p082e.p126k.p129c.p130i.C3888f.m16601f(r4)
                    java.lang.Object r6 = r6.mo13377b(r4)
                    java.lang.String r6 = (java.lang.String) r6
                    if (r6 != 0) goto L_0x004a
                    java.lang.String r6 = "date_modified-false"
                L_0x004a:
                    i.k r6 = r2.m20205K(r6)
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    i.t r6 = p369i.C8457t.f34900a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p224o.p227m.C4681i.C4697g.C4698a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4697g(C8729b bVar, C4681i iVar) {
            this.f13488g = bVar;
            this.f13489h = iVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13488g.collect(new C4698a(cVar, this.f13489h), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: f.c.o.m.i$h */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4700h implements C8729b<C8446k<? extends String, ? extends Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13492g;

        /* renamed from: h */
        final /* synthetic */ C4681i f13493h;

        /* renamed from: f.c.o.m.i$h$a */
        /* compiled from: Collect.kt */
        public static final class C4701a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13494g;

            /* renamed from: h */
            final /* synthetic */ C4681i f13495h;

            @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$special$$inlined$map$4$2", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.o.m.i$h$a$a */
            public static final class C4702a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4701a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4702a(C4701a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4701a(C8730c cVar, C4681i iVar) {
                this.f13494g = cVar;
                this.f13495h = iVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, p369i.p379w.C8508d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof p159f.p166c.p224o.p227m.C4681i.C4700h.C4701a.C4702a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    f.c.o.m.i$h$a$a r0 = (p159f.p166c.p224o.p227m.C4681i.C4700h.C4701a.C4702a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.o.m.i$h$a$a r0 = new f.c.o.m.i$h$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r7)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    p369i.C8450m.m46575b(r7)
                    kotlinx.coroutines.f3.c r7 = r5.f13494g
                    e.k.c.i.d r6 = (p082e.p126k.p129c.p130i.C3884d) r6
                    f.c.o.m.i r2 = r5.f13495h
                    java.lang.String r4 = "encrypted_video_sort_by"
                    e.k.c.i.d$a r4 = p082e.p126k.p129c.p130i.C3888f.m16601f(r4)
                    java.lang.Object r6 = r6.mo13377b(r4)
                    java.lang.String r6 = (java.lang.String) r6
                    if (r6 != 0) goto L_0x004a
                    java.lang.String r6 = "date_modified-false"
                L_0x004a:
                    i.k r6 = r2.m20205K(r6)
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    i.t r6 = p369i.C8457t.f34900a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p224o.p227m.C4681i.C4700h.C4701a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4700h(C8729b bVar, C4681i iVar) {
            this.f13492g = bVar;
            this.f13493h = iVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13492g.collect(new C4701a(cVar, this.f13493h), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: f.c.o.m.i$i */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4703i implements C8729b<C8446k<? extends String, ? extends Boolean>> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13496g;

        /* renamed from: h */
        final /* synthetic */ C4681i f13497h;

        /* renamed from: f.c.o.m.i$i$a */
        /* compiled from: Collect.kt */
        public static final class C4704a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13498g;

            /* renamed from: h */
            final /* synthetic */ C4681i f13499h;

            @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$special$$inlined$map$5$2", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.o.m.i$i$a$a */
            public static final class C4705a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4704a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4705a(C4704a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4704a(C8730c cVar, C4681i iVar) {
                this.f13498g = cVar;
                this.f13499h = iVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, p369i.p379w.C8508d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof p159f.p166c.p224o.p227m.C4681i.C4703i.C4704a.C4705a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    f.c.o.m.i$i$a$a r0 = (p159f.p166c.p224o.p227m.C4681i.C4703i.C4704a.C4705a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.o.m.i$i$a$a r0 = new f.c.o.m.i$i$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r7)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    p369i.C8450m.m46575b(r7)
                    kotlinx.coroutines.f3.c r7 = r5.f13498g
                    e.k.c.i.d r6 = (p082e.p126k.p129c.p130i.C3884d) r6
                    f.c.o.m.i r2 = r5.f13499h
                    java.lang.String r4 = "folder_sort_by"
                    e.k.c.i.d$a r4 = p082e.p126k.p129c.p130i.C3888f.m16601f(r4)
                    java.lang.Object r6 = r6.mo13377b(r4)
                    java.lang.String r6 = (java.lang.String) r6
                    if (r6 != 0) goto L_0x004a
                    java.lang.String r6 = "date_modified-false"
                L_0x004a:
                    i.k r6 = r2.m20205K(r6)
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    i.t r6 = p369i.C8457t.f34900a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p224o.p227m.C4681i.C4703i.C4704a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4703i(C8729b bVar, C4681i iVar) {
            this.f13496g = bVar;
            this.f13497h = iVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13496g.collect(new C4704a(cVar, this.f13497h), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: f.c.o.m.i$j */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4706j implements C8729b<List<? extends C8446k<? extends String, ? extends Boolean>>> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13500g;

        /* renamed from: h */
        final /* synthetic */ C4681i f13501h;

        /* renamed from: f.c.o.m.i$j$a */
        /* compiled from: Collect.kt */
        public static final class C4707a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13502g;

            /* renamed from: h */
            final /* synthetic */ C4681i f13503h;

            @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$special$$inlined$map$6$2", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {145}, mo30602m = "emit")
            /* renamed from: f.c.o.m.i$j$a$a */
            public static final class C4708a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4707a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4708a(C4707a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4707a(C8730c cVar, C4681i iVar) {
                this.f13502g = cVar;
                this.f13503h = iVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r8, p369i.p379w.C8508d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p159f.p166c.p224o.p227m.C4681i.C4706j.C4707a.C4708a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    f.c.o.m.i$j$a$a r0 = (p159f.p166c.p224o.p227m.C4681i.C4706j.C4707a.C4708a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.o.m.i$j$a$a r0 = new f.c.o.m.i$j$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r9)
                    goto L_0x007a
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    p369i.C8450m.m46575b(r9)
                    kotlinx.coroutines.f3.c r9 = r7.f13502g
                    e.k.c.i.d r8 = (p082e.p126k.p129c.p130i.C3884d) r8
                    f.c.o.m.i r2 = r7.f13503h
                    java.lang.String r4 = "folder_sort_by"
                    e.k.c.i.d$a r4 = p082e.p126k.p129c.p130i.C3888f.m16601f(r4)
                    java.lang.Object r4 = r8.mo13377b(r4)
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.String r5 = "date_modified-false"
                    if (r4 != 0) goto L_0x004b
                    r4 = r5
                L_0x004b:
                    i.k r2 = r2.m20205K(r4)
                    f.c.o.m.i r4 = r7.f13503h
                    java.lang.String r6 = "video_sort_by"
                    e.k.c.i.d$a r6 = p082e.p126k.p129c.p130i.C3888f.m16601f(r6)
                    java.lang.Object r8 = r8.mo13377b(r6)
                    java.lang.String r8 = (java.lang.String) r8
                    if (r8 != 0) goto L_0x0060
                    goto L_0x0061
                L_0x0060:
                    r5 = r8
                L_0x0061:
                    i.k r8 = r4.m20205K(r5)
                    r4 = 2
                    i.k[] r4 = new p369i.C8446k[r4]
                    r5 = 0
                    r4[r5] = r2
                    r4[r3] = r8
                    java.util.List r8 = p369i.p377u.C8482l.m46667h(r4)
                    r0.label = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x007a
                    return r1
                L_0x007a:
                    i.t r8 = p369i.C8457t.f34900a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p224o.p227m.C4681i.C4706j.C4707a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4706j(C8729b bVar, C4681i iVar) {
            this.f13500g = bVar;
            this.f13501h = iVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13500g.collect(new C4707a(cVar, this.f13501h), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$updateViewType$1", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {157}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.o.m.i$k */
    /* compiled from: VideoLibraryViewModel.kt */
    static final class C4709k extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ int $viewType;
        int label;
        final /* synthetic */ C4681i this$0;

        @C8533f(mo30599c = "com.coocent.videolibrary.viewmodel.VideoLibraryViewModel$updateViewType$1$1", mo30600f = "VideoLibraryViewModel.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.o.m.i$k$a */
        /* compiled from: VideoLibraryViewModel.kt */
        static final class C4710a extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
            final /* synthetic */ int $viewType;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4710a(int i, C8508d<? super C4710a> dVar) {
                super(2, dVar);
                this.$viewType = i;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C4710a aVar = new C4710a(this.$viewType, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
                return ((C4710a) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    ((C3878a) this.L$0).mo13384i(C3888f.m16599d("view_type"), C8529b.m46724b(this.$viewType));
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4709k(C4681i iVar, int i, C8508d<? super C4709k> dVar) {
            super(2, dVar);
            this.this$0 = iVar;
            this.$viewType = i;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4709k(this.this$0, this.$viewType, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4709k) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C3823f<C3884d> a = C4657g.m20158a(this.this$0.f13465c);
                C4710a aVar = new C4710a(this.$viewType, (C8508d<? super C4710a>) null);
                this.label = 1;
                if (C3889g.m16603a(a, aVar, this) == d) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4681i(Application application) {
        super(application);
        C8594l.m46771e(application, "mApplication");
        this.f13465c = application;
        C0670e0<Boolean> e0Var = new C0670e0<>();
        this.f13466d = e0Var;
        LiveData<Boolean> a = C0692l0.m4249a(e0Var, C4674c.f13457a);
        C8594l.m46770d(a, "switchMap(mStoragePermis…t\n            }\n        }");
        this.f13467e = a;
        new C4678g();
        C0670e0<Integer> e0Var2 = new C0670e0<>();
        this.f13468f = e0Var2;
        C8594l.m46770d(C0692l0.m4249a(e0Var2, C4673b.f13456a), "switchMap(mShowPrivateVi…t\n            }\n        }");
        C0670e0<Integer> e0Var3 = new C0670e0<>();
        this.f13470h = e0Var3;
        C8594l.m46770d(C0692l0.m4249a(e0Var3, C4672a.f13455a), "switchMap(mRequestPermis…t\n            }\n        }");
        C0670e0<Long> e0Var4 = new C0670e0<>();
        this.f13471i = e0Var4;
        C8594l.m46770d(C0692l0.m4249a(e0Var4, C4676e.f13459a), "switchMap(mRefreshVideoF…t\n            }\n        }");
        C0670e0<Boolean> e0Var5 = new C0670e0<>();
        this.f13472j = e0Var5;
        LiveData<Boolean> a2 = C0692l0.m4249a(e0Var5, C4675d.f13458a);
        C8594l.m46770d(a2, "switchMap(mShowLayoutPer…t\n            }\n        }");
        this.f13473k = a2;
        C0670e0<String> e0Var6 = new C0670e0<>();
        this.f13474l = e0Var6;
        C8594l.m46770d(C0692l0.m4249a(e0Var6, C4677f.f13460a), "switchMap(mLastVideoFold…t\n            }\n        }");
        this.f13475m = new C0670e0<>();
        this.f13477o = C0684j.m4231b(new C4691e(C4657g.m20158a(application).mo13321b()), C8768g1.m47302b(), 0, 2, (Object) null);
        this.f13478p = C0684j.m4231b(new C4694f(C4657g.m20158a(application).mo13321b()), C8768g1.m47302b(), 0, 2, (Object) null);
        this.f13479q = C0684j.m4231b(new C4697g(C4657g.m20158a(application).mo13321b(), this), C8768g1.m47302b(), 0, 2, (Object) null);
        this.f13480r = C0684j.m4231b(new C4700h(C4657g.m20158a(application).mo13321b(), this), C8768g1.m47302b(), 0, 2, (Object) null);
        C0684j.m4231b(new C4703i(C4657g.m20158a(application).mo13321b(), this), C8768g1.m47302b(), 0, 2, (Object) null);
        this.f13481s = C0684j.m4231b(new C4706j(C4657g.m20158a(application).mo13321b(), this), C8768g1.m47302b(), 0, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final LiveData m20200A(Integer num) {
        C0670e0 e0Var = new C0670e0(num);
        e0Var.mo4156o(num);
        return e0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final LiveData m20201B(Long l) {
        C0670e0 e0Var = new C0670e0(l);
        e0Var.mo4156o(l);
        return e0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final LiveData m20202C(Integer num) {
        C0670e0 e0Var = new C0670e0(num);
        e0Var.mo4156o(num);
        return e0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final LiveData m20203I(Boolean bool) {
        C0670e0 e0Var = new C0670e0(bool);
        e0Var.mo4156o(bool);
        return e0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final LiveData m20204J(Boolean bool) {
        C0670e0 e0Var = new C0670e0(bool);
        e0Var.mo4156o(bool);
        return e0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final C8446k<String, Boolean> m20205K(String str) {
        String[] split = TextUtils.split(str, "-");
        if (split.length == 2) {
            return new C8446k<>(split[0], Boolean.valueOf(Boolean.parseBoolean(split[1])));
        }
        return new C8446k<>("date_modified", Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final LiveData m20214z(String str) {
        C0670e0 e0Var = new C0670e0(str);
        e0Var.mo4156o(str);
        return e0Var;
    }

    /* renamed from: D */
    public final void mo15406D(boolean z) {
        C8665a2 unused = C8875m.m47725b(C0701n0.m4259a(this), C8768g1.m47302b(), (C8910t0) null, new C4687c(this, z, (C8508d<? super C4687c>) null), 2, (Object) null);
    }

    /* renamed from: E */
    public final void mo15407E(boolean z) {
        this.f13476n = z;
    }

    /* renamed from: F */
    public final void mo15408F(String str, boolean z, boolean z2, boolean z3) {
        C8594l.m46771e(str, "sort");
        C8665a2 unused = C8875m.m47725b(C0701n0.m4259a(this), C8768g1.m47302b(), (C8910t0) null, new C4689d(this, z2, z3, str, z, (C8508d<? super C4689d>) null), 2, (Object) null);
    }

    /* renamed from: G */
    public final void mo15409G(boolean z) {
        this.f13466d.mo4156o(Boolean.valueOf(z));
    }

    /* renamed from: H */
    public final void mo15410H(boolean z) {
        this.f13472j.mo4156o(Boolean.valueOf(z));
    }

    /* renamed from: L */
    public final void mo15411L(int i) {
        C8665a2 unused = C8875m.m47725b(C0701n0.m4259a(this), C8768g1.m47302b(), (C8910t0) null, new C4709k(this, i, (C8508d<? super C4709k>) null), 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo15412h(int i) {
        C8665a2 unused = C8875m.m47725b(C0701n0.m4259a(this), C8768g1.m47302b(), (C8910t0) null, new C4682a(this, i, (C8508d<? super C4682a>) null), 2, (Object) null);
    }

    /* renamed from: i */
    public final C0670e0<Integer> mo15413i() {
        return this.f13475m;
    }

    /* renamed from: j */
    public final LiveData<C8446k<String, Boolean>> mo15414j() {
        return this.f13480r;
    }

    /* renamed from: k */
    public final LiveData<List<C8446k<String, Boolean>>> mo15415k() {
        return this.f13481s;
    }

    /* renamed from: l */
    public final LiveData<Integer> mo15416l() {
        return this.f13478p;
    }

    /* renamed from: m */
    public final LiveData<Integer> mo15417m() {
        return this.f13469g;
    }

    /* renamed from: n */
    public final LiveData<Boolean> mo15418n() {
        return this.f13473k;
    }

    /* renamed from: o */
    public final LiveData<Boolean> mo15419o() {
        return this.f13467e;
    }

    /* renamed from: p */
    public final LiveData<C8446k<String, Boolean>> mo15420p() {
        return this.f13479q;
    }

    /* renamed from: q */
    public final LiveData<Integer> mo15421q() {
        return this.f13477o;
    }

    /* renamed from: r */
    public final Object mo15422r(C8508d<? super Boolean> dVar) {
        return C8731d.m47259d(new C4684b(C4657g.m20158a(this.f13465c).mo13321b()), dVar);
    }

    /* renamed from: s */
    public final boolean mo15423s() {
        return this.f13476n;
    }
}
