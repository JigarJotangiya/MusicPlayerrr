package p082e.p126k.p127b;

import java.util.List;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: e.k.b.e */
/* compiled from: DataMigrationInitializer.kt */
public final class C3817e<T> {

    /* renamed from: a */
    public static final C3818a f11923a = new C3818a((C8589g) null);

    /* renamed from: e.k.b.e$a */
    /* compiled from: DataMigrationInitializer.kt */
    public static final class C3818a {

        @C8533f(mo30599c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", mo30600f = "DataMigrationInitializer.kt", mo30601l = {33}, mo30602m = "invokeSuspend")
        /* renamed from: e.k.b.e$a$a */
        /* compiled from: DataMigrationInitializer.kt */
        static final class C3819a extends C8539k implements C8574p<C3826i<T>, C8508d<? super C8457t>, Object> {
            final /* synthetic */ List<C3816d<T>> $migrations;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3819a(List<? extends C3816d<T>> list, C8508d<? super C3819a> dVar) {
                super(2, dVar);
                this.$migrations = list;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C3819a aVar = new C3819a(this.$migrations, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            public final Object invoke(C3826i<T> iVar, C8508d<? super C8457t> dVar) {
                return ((C3819a) create(iVar, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d = C8527d.m46722d();
                int i = this.label;
                if (i == 0) {
                    C8450m.m46575b(obj);
                    C3818a aVar = C3817e.f11923a;
                    List<C3816d<T>> list = this.$migrations;
                    this.label = 1;
                    if (aVar.m16465c(list, (C3826i) this.L$0, this) == d) {
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

        @C8533f(mo30599c = "androidx.datastore.core.DataMigrationInitializer$Companion", mo30600f = "DataMigrationInitializer.kt", mo30601l = {42, 57}, mo30602m = "runMigrations")
        /* renamed from: e.k.b.e$a$b */
        /* compiled from: DataMigrationInitializer.kt */
        static final class C3820b<T> extends C8531d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C3818a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3820b(C3818a aVar, C8508d<? super C3820b> dVar) {
                super(dVar);
                this.this$0 = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.m16465c((List) null, (C3826i) null, this);
            }
        }

        @C8533f(mo30599c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", mo30600f = "DataMigrationInitializer.kt", mo30601l = {44, 46}, mo30602m = "invokeSuspend")
        /* renamed from: e.k.b.e$a$c */
        /* compiled from: DataMigrationInitializer.kt */
        static final class C3821c extends C8539k implements C8574p<T, C8508d<? super T>, Object> {
            final /* synthetic */ List<C8570l<C8508d<? super C8457t>, Object>> $cleanUps;
            final /* synthetic */ List<C3816d<T>> $migrations;
            /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            @C8533f(mo30599c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", mo30600f = "DataMigrationInitializer.kt", mo30601l = {45}, mo30602m = "invokeSuspend")
            /* renamed from: e.k.b.e$a$c$a */
            /* compiled from: DataMigrationInitializer.kt */
            static final class C3822a extends C8539k implements C8570l<C8508d<? super C8457t>, Object> {
                final /* synthetic */ C3816d<T> $migration;
                int label;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3822a(C3816d<T> dVar, C8508d<? super C3822a> dVar2) {
                    super(1, dVar2);
                    this.$migration = dVar;
                }

                public final C8508d<C8457t> create(C8508d<?> dVar) {
                    return new C3822a(this.$migration, dVar);
                }

                public final Object invoke(C8508d<? super C8457t> dVar) {
                    return ((C3822a) create(dVar)).invokeSuspend(C8457t.f34900a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object d = C8527d.m46722d();
                    int i = this.label;
                    if (i == 0) {
                        C8450m.m46575b(obj);
                        C3816d<T> dVar = this.$migration;
                        this.label = 1;
                        if (dVar.mo13312a(this) == d) {
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
            C3821c(List<? extends C3816d<T>> list, List<C8570l<C8508d<? super C8457t>, Object>> list2, C8508d<? super C3821c> dVar) {
                super(2, dVar);
                this.$migrations = list;
                this.$cleanUps = list2;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C3821c cVar = new C3821c(this.$migrations, this.$cleanUps, dVar);
                cVar.L$0 = obj;
                return cVar;
            }

            public final Object invoke(T t, C8508d<? super T> dVar) {
                return ((C3821c) create(t, dVar)).invokeSuspend(C8457t.f34900a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = p369i.p379w.p380i.C8527d.m46722d()
                    int r1 = r10.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x003a
                    if (r1 == r3) goto L_0x0024
                    if (r1 != r2) goto L_0x001c
                    java.lang.Object r1 = r10.L$1
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.L$0
                    java.util.List r4 = (java.util.List) r4
                    p369i.C8450m.m46575b(r11)
                    r7 = r10
                    goto L_0x008c
                L_0x001c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x0024:
                    java.lang.Object r1 = r10.L$3
                    java.lang.Object r4 = r10.L$2
                    e.k.b.d r4 = (p082e.p126k.p127b.C3816d) r4
                    java.lang.Object r5 = r10.L$1
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.L$0
                    java.util.List r6 = (java.util.List) r6
                    p369i.C8450m.m46575b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L_0x006a
                L_0x003a:
                    p369i.C8450m.m46575b(r11)
                    java.lang.Object r11 = r10.L$0
                    java.util.List<e.k.b.d<T>> r1 = r10.$migrations
                    java.util.List<i.z.c.l<i.w.d<? super i.t>, java.lang.Object>> r4 = r10.$cleanUps
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L_0x0048:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L_0x0091
                    java.lang.Object r6 = r1.next()
                    e.k.b.d r6 = (p082e.p126k.p127b.C3816d) r6
                    r5.L$0 = r4
                    r5.L$1 = r1
                    r5.L$2 = r6
                    r5.L$3 = r11
                    r5.label = r3
                    java.lang.Object r7 = r6.mo13313b(r11, r5)
                    if (r7 != r0) goto L_0x0065
                    return r0
                L_0x0065:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L_0x006a:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L_0x008e
                    e.k.b.e$a$c$a r11 = new e.k.b.e$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.L$0 = r4
                    r7.L$1 = r5
                    r7.L$2 = r8
                    r7.L$3 = r8
                    r7.label = r2
                    java.lang.Object r11 = r6.mo13314c(r1, r7)
                    if (r11 != r0) goto L_0x008f
                    return r0
                L_0x008c:
                    r5 = r7
                    goto L_0x0048
                L_0x008e:
                    r11 = r1
                L_0x008f:
                    r1 = r5
                    goto L_0x008c
                L_0x0091:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3817e.C3818a.C3821c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private C3818a() {
        }

        public /* synthetic */ C3818a(C8589g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object m16465c(java.util.List<? extends p082e.p126k.p127b.C3816d<T>> r7, p082e.p126k.p127b.C3826i<T> r8, p369i.p379w.C8508d<? super p369i.C8457t> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof p082e.p126k.p127b.C3817e.C3818a.C3820b
                if (r0 == 0) goto L_0x0013
                r0 = r9
                e.k.b.e$a$b r0 = (p082e.p126k.p127b.C3817e.C3818a.C3820b) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                e.k.b.e$a$b r0 = new e.k.b.e$a$b
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.L$1
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.L$0
                i.z.d.t r8 = (p369i.p387z.p389d.C8602t) r8
                p369i.C8450m.m46575b(r9)     // Catch:{ all -> 0x0034 }
                goto L_0x0069
            L_0x0034:
                r9 = move-exception
                goto L_0x0082
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                java.lang.Object r7 = r0.L$0
                java.util.List r7 = (java.util.List) r7
                p369i.C8450m.m46575b(r9)
                goto L_0x0060
            L_0x0046:
                p369i.C8450m.m46575b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                e.k.b.e$a$c r2 = new e.k.b.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.L$0 = r9
                r0.label = r4
                java.lang.Object r7 = r8.mo13324a(r2, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r7 = r9
            L_0x0060:
                i.z.d.t r8 = new i.z.d.t
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0069:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0094
                java.lang.Object r9 = r7.next()
                i.z.c.l r9 = (p369i.p387z.p388c.C8570l) r9
                r0.L$0 = r8     // Catch:{ all -> 0x0034 }
                r0.L$1 = r7     // Catch:{ all -> 0x0034 }
                r0.label = r3     // Catch:{ all -> 0x0034 }
                java.lang.Object r9 = r9.invoke(r0)     // Catch:{ all -> 0x0034 }
                if (r9 != r1) goto L_0x0069
                return r1
            L_0x0082:
                T r2 = r8.element
                if (r2 != 0) goto L_0x0089
                r8.element = r9
                goto L_0x0069
            L_0x0089:
                p369i.p387z.p389d.C8594l.m46769c(r2)
                T r2 = r8.element
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                p369i.C8375b.m46425a(r2, r9)
                goto L_0x0069
            L_0x0094:
                T r7 = r8.element
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L_0x009d
                i.t r7 = p369i.C8457t.f34900a
                return r7
            L_0x009d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p127b.C3817e.C3818a.m16465c(java.util.List, e.k.b.i, i.w.d):java.lang.Object");
        }

        /* renamed from: b */
        public final <T> C8574p<C3826i<T>, C8508d<? super C8457t>, Object> mo13315b(List<? extends C3816d<T>> list) {
            C8594l.m46771e(list, "migrations");
            return new C3819a(list, (C8508d<? super C3819a>) null);
        }
    }
}
