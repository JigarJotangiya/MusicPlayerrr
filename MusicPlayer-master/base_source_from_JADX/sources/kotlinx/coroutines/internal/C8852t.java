package kotlinx.coroutines.internal;

import kotlinx.coroutines.C8664a1;
import kotlinx.coroutines.C8874l2;
import kotlinx.coroutines.C8894q;
import p369i.C8457t;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: kotlinx.coroutines.internal.t */
/* compiled from: MainDispatchers.kt */
final class C8852t extends C8874l2 implements C8664a1 {

    /* renamed from: h */
    private final Throwable f35251h;

    /* renamed from: i */
    private final String f35252i;

    public C8852t(Throwable th, String str) {
        this.f35251h = th;
        this.f35252i = str;
    }

    /* renamed from: S0 */
    private final Void m47627S0() {
        String k;
        if (this.f35251h != null) {
            String str = this.f35252i;
            String str2 = BuildConfig.FLAVOR;
            if (!(str == null || (k = C8594l.m46777k(". ", str)) == null)) {
                str2 = k;
            }
            throw new IllegalStateException(C8594l.m46777k("Module with the Main dispatcher had failed to initialize", str2), this.f35251h);
        }
        C8851s.m47625c();
        throw null;
    }

    /* renamed from: N0 */
    public /* bridge */ /* synthetic */ void mo30866N0(C8513g gVar, Runnable runnable) {
        mo31169R0(gVar, runnable);
        throw null;
    }

    /* renamed from: O0 */
    public boolean mo30867O0(C8513g gVar) {
        m47627S0();
        throw null;
    }

    /* renamed from: P0 */
    public C8874l2 mo30872P0() {
        return this;
    }

    /* renamed from: R0 */
    public Void mo31169R0(C8513g gVar, Runnable runnable) {
        m47627S0();
        throw null;
    }

    /* renamed from: T0 */
    public Void mo31170T0(long j, C8894q<? super C8457t> qVar) {
        m47627S0();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f35251h;
        sb.append(th != null ? C8594l.m46777k(", cause=", th) : BuildConfig.FLAVOR);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: x */
    public /* bridge */ /* synthetic */ void mo30858x(long j, C8894q qVar) {
        mo31170T0(j, qVar);
        throw null;
    }
}
