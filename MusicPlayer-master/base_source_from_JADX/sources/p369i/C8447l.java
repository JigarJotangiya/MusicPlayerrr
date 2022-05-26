package p369i;

import java.io.Serializable;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.l */
/* compiled from: Result.kt */
public final class C8447l<T> implements Serializable {
    public static final C8448a Companion = new C8448a((C8589g) null);
    private final Object value;

    /* renamed from: i.l$a */
    /* compiled from: Result.kt */
    public static final class C8448a {
        private C8448a() {
        }

        public /* synthetic */ C8448a(C8589g gVar) {
            this();
        }
    }

    /* renamed from: i.l$b */
    /* compiled from: Result.kt */
    public static final class C8449b implements Serializable {
        public final Throwable exception;

        public C8449b(Throwable th) {
            C8594l.m46771e(th, "exception");
            this.exception = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C8449b) && C8594l.m46767a(this.exception, ((C8449b) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    private /* synthetic */ C8447l(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ C8447l m50325boximpl(Object obj) {
        return new C8447l(obj);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static Object m50326constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m50327equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof C8447l) && C8594l.m46767a(obj, ((C8447l) obj2).m50334unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m50328equalsimpl0(Object obj, Object obj2) {
        return C8594l.m46767a(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m50329exceptionOrNullimpl(Object obj) {
        if (obj instanceof C8449b) {
            return ((C8449b) obj).exception;
        }
        return null;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m50330hashCodeimpl(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m50331isFailureimpl(Object obj) {
        return obj instanceof C8449b;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m50332isSuccessimpl(Object obj) {
        return !(obj instanceof C8449b);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m50333toStringimpl(Object obj) {
        if (obj instanceof C8449b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m50327equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m50330hashCodeimpl(this.value);
    }

    public String toString() {
        return m50333toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m50334unboximpl() {
        return this.value;
    }
}
