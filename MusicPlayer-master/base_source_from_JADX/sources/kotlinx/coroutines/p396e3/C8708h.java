package kotlinx.coroutines.p396e3;

import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.e3.h */
/* compiled from: Channel.kt */
public final class C8708h<T> {

    /* renamed from: b */
    public static final C8710b f35082b = new C8710b((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C8711c f35083c = new C8711c();

    /* renamed from: a */
    private final Object f35084a;

    /* renamed from: kotlinx.coroutines.e3.h$a */
    /* compiled from: Channel.kt */
    public static final class C8709a extends C8711c {

        /* renamed from: a */
        public final Throwable f35085a;

        public C8709a(Throwable th) {
            this.f35085a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C8709a) && C8594l.m46767a(this.f35085a, ((C8709a) obj).f35085a);
        }

        public int hashCode() {
            Throwable th = this.f35085a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f35085a + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.e3.h$b */
    /* compiled from: Channel.kt */
    public static final class C8710b {
        private C8710b() {
        }

        public /* synthetic */ C8710b(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final <E> Object mo30961a(Throwable th) {
            C8709a aVar = new C8709a(th);
            C8708h.m47203c(aVar);
            return aVar;
        }

        /* renamed from: b */
        public final <E> Object mo30962b() {
            C8711c a = C8708h.f35083c;
            C8708h.m47203c(a);
            return a;
        }

        /* renamed from: c */
        public final <E> Object mo30963c(E e) {
            C8708h.m47203c(e);
            return e;
        }
    }

    /* renamed from: kotlinx.coroutines.e3.h$c */
    /* compiled from: Channel.kt */
    public static class C8711c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C8708h(Object obj) {
        this.f35084a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C8708h m47202b(Object obj) {
        return new C8708h(obj);
    }

    /* renamed from: c */
    public static <T> Object m47203c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m47204d(Object obj, Object obj2) {
        return (obj2 instanceof C8708h) && C8594l.m46767a(obj, ((C8708h) obj2).mo30956j());
    }

    /* renamed from: e */
    public static final Throwable m47205e(Object obj) {
        C8709a aVar = obj instanceof C8709a ? (C8709a) obj : null;
        if (aVar == null) {
            return null;
        }
        return aVar.f35085a;
    }

    /* renamed from: f */
    public static final T m47206f(Object obj) {
        if (!(obj instanceof C8711c)) {
            return obj;
        }
        return null;
    }

    /* renamed from: g */
    public static int m47207g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m47208h(Object obj) {
        return !(obj instanceof C8711c);
    }

    /* renamed from: i */
    public static String m47209i(Object obj) {
        if (obj instanceof C8709a) {
            return obj.toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m47204d(this.f35084a, obj);
    }

    public int hashCode() {
        return m47207g(this.f35084a);
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo30956j() {
        return this.f35084a;
    }

    public String toString() {
        return m47209i(this.f35084a);
    }
}
