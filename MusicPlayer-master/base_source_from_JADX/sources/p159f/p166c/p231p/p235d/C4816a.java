package p159f.p166c.p231p.p235d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p159f.p334h.p335a.C7755f;
import p159f.p334h.p335a.C7781s;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.p.d.a */
/* compiled from: DefaultOnDataMismatchAdapter.kt */
public final class C4816a<T> extends C7755f<T> {

    /* renamed from: c */
    public static final C4817a f13628c = new C4817a((C8589g) null);

    /* renamed from: a */
    private final C7755f<T> f13629a;

    /* renamed from: b */
    private final T f13630b;

    /* renamed from: f.c.p.d.a$a */
    /* compiled from: DefaultOnDataMismatchAdapter.kt */
    public static final class C4817a {

        /* renamed from: f.c.p.d.a$a$a */
        /* compiled from: DefaultOnDataMismatchAdapter.kt */
        public static final class C4818a implements C7755f.C7756a {

            /* renamed from: a */
            final /* synthetic */ Class<T> f13631a;

            /* renamed from: b */
            final /* synthetic */ T f13632b;

            C4818a(Class<T> cls, T t) {
                this.f13631a = cls;
                this.f13632b = t;
            }

            /* renamed from: a */
            public C7755f<?> mo15565a(Type type, Set<? extends Annotation> set, C7781s sVar) {
                C8594l.m46771e(type, "requestedType");
                C8594l.m46771e(set, "annotations");
                C8594l.m46771e(sVar, "moshi");
                if (!C8594l.m46767a(this.f13631a, type)) {
                    return null;
                }
                C7755f<T> h = sVar.mo29032h(this, this.f13631a, set);
                C8594l.m46770d(h, "moshi.nextAdapter(this, type, annotations)");
                return new C4816a(h, this.f13632b);
            }
        }

        private C4817a() {
        }

        public /* synthetic */ C4817a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T> C7755f.C7756a mo15564a(Class<T> cls, T t) {
            C8594l.m46771e(cls, "type");
            return new C4818a(cls, t);
        }
    }

    public C4816a(C7755f<T> fVar, T t) {
        C8594l.m46771e(fVar, "mDelegate");
        this.f13629a = fVar;
        this.f13630b = t;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|4|5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        throw r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo15563a(p159f.p334h.p335a.C7761k r3) {
        /*
            r2 = this;
            java.lang.String r0 = "reader"
            p369i.p387z.p389d.C8594l.m46771e(r3, r0)
            f.h.a.k r0 = r3.mo28975v0()
            f.h.a.f<T> r1 = r2.f13629a     // Catch:{ Exception -> 0x0015 }
            java.lang.Object r1 = r1.mo15563a(r0)     // Catch:{ Exception -> 0x0015 }
            r3.mo28963N0()     // Catch:{ Exception -> 0x0015 }
            goto L_0x0017
        L_0x0013:
            r3 = move-exception
            goto L_0x001b
        L_0x0015:
            T r1 = r2.f13630b     // Catch:{ all -> 0x0013 }
        L_0x0017:
            r0.close()
            return r1
        L_0x001b:
            r0.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p235d.C4816a.mo15563a(f.h.a.k):java.lang.Object");
    }
}
