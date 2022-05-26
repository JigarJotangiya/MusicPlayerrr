package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.coroutines.C8865k0;
import p369i.C8446k;
import p369i.C8447l;
import p369i.C8450m;
import p369i.C8453p;
import p369i.p379w.p381j.p382a.C8532e;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.internal.y */
/* compiled from: StackTraceRecovery.kt */
public final class C8858y {

    /* renamed from: a */
    private static final String f35255a;

    static {
        Object obj;
        Object obj2;
        try {
            C8447l.C8448a aVar = C8447l.Companion;
            obj = C8447l.m50326constructorimpl(Class.forName("i.w.j.a.a").getCanonicalName());
        } catch (Throwable th) {
            C8447l.C8448a aVar2 = C8447l.Companion;
            obj = C8447l.m50326constructorimpl(C8450m.m46574a(th));
        }
        if (C8447l.m50329exceptionOrNullimpl(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f35255a = (String) obj;
        try {
            C8447l.C8448a aVar3 = C8447l.Companion;
            obj2 = C8447l.m50326constructorimpl(Class.forName("kotlinx.coroutines.internal.y").getCanonicalName());
        } catch (Throwable th2) {
            C8447l.C8448a aVar4 = C8447l.Companion;
            obj2 = C8447l.m50326constructorimpl(C8450m.m46574a(th2));
        }
        if (C8447l.m50329exceptionOrNullimpl(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str = (String) obj2;
    }

    /* renamed from: b */
    public static final StackTraceElement m47646b(String str) {
        return new StackTraceElement(C8594l.m46777k("\b\b\b(", str), "\b", "\b", -1);
    }

    /* renamed from: c */
    private static final <E extends Throwable> C8446k<E, StackTraceElement[]> m47647c(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C8594l.m46767a(cause.getClass(), e.getClass())) {
            return C8453p.m46576a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (m47652h(stackTrace[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return C8453p.m46576a(cause, stackTrace);
        }
        return C8453p.m46576a(e, new StackTraceElement[0]);
    }

    /* renamed from: d */
    private static final <E extends Throwable> E m47648d(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m47646b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int g = m47651g(stackTrace, f35255a);
        int i = 0;
        if (g == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            e2.setStackTrace((StackTraceElement[]) array);
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + g)];
        if (g > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                stackTraceElementArr[i2] = stackTrace[i2];
                if (i3 >= g) {
                    break;
                }
                i2 = i3;
            }
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i4 = i + 1;
            stackTraceElementArr[i + g] = it.next();
            i = i4;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* renamed from: e */
    private static final ArrayDeque<StackTraceElement> m47649e(C8532e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(eVar instanceof C8532e)) {
                eVar = null;
            }
            eVar = eVar == null ? null : eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    /* renamed from: f */
    private static final boolean m47650f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C8594l.m46767a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C8594l.m46767a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C8594l.m46767a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: g */
    private static final int m47651g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C8594l.m46767a(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static final boolean m47652h(StackTraceElement stackTraceElement) {
        return C8436o.m46525s(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    /* renamed from: i */
    private static final void m47653i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m47652h(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 <= length2) {
            while (true) {
                int i3 = length2 - 1;
                if (m47650f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2 = i3;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final <E extends Throwable> E m47654j(E e, C8532e eVar) {
        C8446k c = m47647c(e);
        E e2 = (Throwable) c.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c.component2();
        E k = m47655k(e2);
        if (k == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> e3 = m47649e(eVar);
        if (e3.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m47653i(stackTraceElementArr, e3);
        }
        m47648d(e2, k, e3);
        return k;
    }

    /* renamed from: k */
    private static final <E extends Throwable> E m47655k(E e) {
        E e2 = C8829i.m47566e(e);
        if (e2 == null) {
            return null;
        }
        if ((e instanceof C8865k0) || C8594l.m46767a(e2.getMessage(), e.getMessage())) {
            return e2;
        }
        return null;
    }

    /* renamed from: l */
    public static final <E extends Throwable> E m47656l(E e) {
        E cause = e.getCause();
        if (cause != null && C8594l.m46767a(cause.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (m47652h(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return cause;
            }
        }
        return e;
    }
}
