package kotlinx.coroutines;

import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.h2 */
/* compiled from: JobSupport.kt */
public abstract class C8775h2 extends C8773h0 implements C8774h1, C8920v1 {

    /* renamed from: j */
    public C8795i2 f35125j;

    /* renamed from: A */
    public final C8795i2 mo31009A() {
        C8795i2 i2Var = this.f35125j;
        if (i2Var != null) {
            return i2Var;
        }
        C8594l.m46783q("job");
        throw null;
    }

    /* renamed from: B */
    public final void mo31010B(C8795i2 i2Var) {
        this.f35125j = i2Var;
    }

    /* renamed from: b */
    public C8880m2 mo31011b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo31012c() {
        return true;
    }

    /* renamed from: k */
    public void mo31008k() {
        mo31009A().mo31062f0(this);
    }

    public String toString() {
        return C8923w0.m47833a(this) + '@' + C8923w0.m47834b(this) + "[job@" + C8923w0.m47834b(mo31009A()) + ']';
    }
}
