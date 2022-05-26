package kotlinx.coroutines.internal;

import p369i.C8447l;
import p369i.C8450m;

/* renamed from: kotlinx.coroutines.internal.k */
/* compiled from: FastServiceLoader.kt */
public final class C8838k {

    /* renamed from: a */
    private static final boolean f35229a;

    static {
        Object obj;
        try {
            C8447l.C8448a aVar = C8447l.Companion;
            obj = C8447l.m50326constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C8447l.C8448a aVar2 = C8447l.Companion;
            obj = C8447l.m50326constructorimpl(C8450m.m46574a(th));
        }
        f35229a = C8447l.m50332isSuccessimpl(obj);
    }

    /* renamed from: a */
    public static final boolean m47573a() {
        return f35229a;
    }
}
