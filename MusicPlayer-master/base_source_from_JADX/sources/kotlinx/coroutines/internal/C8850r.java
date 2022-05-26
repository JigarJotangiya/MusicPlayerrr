package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C8874l2;

/* renamed from: kotlinx.coroutines.internal.r */
/* compiled from: MainDispatchers.kt */
public final class C8850r {

    /* renamed from: a */
    public static final C8850r f35247a;

    /* renamed from: b */
    private static final boolean f35248b = C8811a0.m47509e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final C8874l2 f35249c;

    static {
        C8850r rVar = new C8850r();
        f35247a = rVar;
        f35249c = rVar.m47622a();
    }

    private C8850r() {
    }

    /* renamed from: a */
    private final C8874l2 m47622a() {
        List<MainDispatcherFactory> list;
        T t;
        try {
            if (f35248b) {
                list = C8837j.f35228a.mo31137c();
            } else {
                list = C8414h.m46466f(C8411f.m46461a(C0000a.m1b()));
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) t).getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) t;
            if (mainDispatcherFactory == null) {
                return C8851s.m47624b((Throwable) null, (String) null, 3, (Object) null);
            }
            return C8851s.m47626d(mainDispatcherFactory, list);
        } catch (Throwable th) {
            return C8851s.m47624b(th, (String) null, 2, (Object) null);
        }
    }
}
