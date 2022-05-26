package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C8874l2;

/* renamed from: kotlinx.coroutines.internal.s */
/* compiled from: MainDispatchers.kt */
public final class C8851s {

    /* renamed from: a */
    private static final boolean f35250a = true;

    /* renamed from: a */
    private static final C8852t m47623a(Throwable th, String str) {
        if (f35250a) {
            return new C8852t(th, str);
        }
        if (th == null) {
            m47625c();
            throw null;
        }
        throw th;
    }

    /* renamed from: b */
    static /* synthetic */ C8852t m47624b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m47623a(th, str);
    }

    /* renamed from: c */
    public static final Void m47625c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: d */
    public static final C8874l2 m47626d(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return m47623a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
