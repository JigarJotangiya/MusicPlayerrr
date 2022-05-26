package kotlinx.coroutines.p400h3;

import kotlinx.coroutines.C8876m0;
import kotlinx.coroutines.internal.C8811a0;
import p369i.p387z.p389d.C8589g;

/* renamed from: kotlinx.coroutines.h3.b */
/* compiled from: Dispatcher.kt */
public final class C8780b extends C8781c {

    /* renamed from: m */
    public static final C8780b f35147m;

    /* renamed from: n */
    private static final C8876m0 f35148n;

    static {
        C8780b bVar = new C8780b();
        f35147m = bVar;
        f35148n = new C8783e(bVar, C8815c0.m47517d("kotlinx.coroutines.io.parallelism", C8392f.m46450a(64, C8811a0.m47505a()), 0, 0, 12, (Object) null), "Dispatchers.IO", 1);
    }

    private C8780b() {
        super(0, 0, (String) null, 7, (C8589g) null);
    }

    /* renamed from: R0 */
    public final C8876m0 mo31032R0() {
        return f35148n;
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
