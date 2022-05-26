package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.d2 */
/* compiled from: JobSupport.kt */
public class C8687d2 extends C8795i2 implements C8685d0 {

    /* renamed from: h */
    private final boolean f35049h = m47121w0();

    public C8687d2(C8665a2 a2Var) {
        super(true);
        mo31055N(a2Var);
    }

    /* renamed from: w0 */
    private final boolean m47121w0() {
        C8922w I = mo31052I();
        C8926x xVar = I instanceof C8926x ? (C8926x) I : null;
        if (xVar == null) {
            return false;
        }
        C8795i2 A = xVar.mo31009A();
        while (!A.mo30906E()) {
            C8922w I2 = A.mo31052I();
            C8926x xVar2 = I2 instanceof C8926x ? (C8926x) I2 : null;
            if (xVar2 == null) {
                return false;
            }
            A = xVar2.mo31009A();
        }
        return true;
    }

    /* renamed from: E */
    public boolean mo30906E() {
        return this.f35049h;
    }

    /* renamed from: F */
    public boolean mo30879F() {
        return true;
    }
}
