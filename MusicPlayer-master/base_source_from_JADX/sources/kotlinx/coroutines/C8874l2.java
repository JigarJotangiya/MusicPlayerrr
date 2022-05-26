package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.l2 */
/* compiled from: MainCoroutineDispatcher.kt */
public abstract class C8874l2 extends C8876m0 {
    /* renamed from: P0 */
    public abstract C8874l2 mo30872P0();

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public final String mo31199Q0() {
        C8874l2 l2Var;
        C8874l2 c = C8768g1.m47303c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            l2Var = c.mo30872P0();
        } catch (UnsupportedOperationException unused) {
            l2Var = null;
        }
        if (this == l2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String Q0 = mo31199Q0();
        if (Q0 != null) {
            return Q0;
        }
        return C8923w0.m47833a(this) + '@' + C8923w0.m47834b(this);
    }
}
