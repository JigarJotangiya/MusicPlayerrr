package kotlinx.coroutines.p400h3;

import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.C8897q1;
import kotlinx.coroutines.C8927x0;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8589g;

/* renamed from: kotlinx.coroutines.h3.c */
/* compiled from: Dispatcher.kt */
public class C8781c extends C8897q1 {

    /* renamed from: h */
    private final int f35149h;

    /* renamed from: i */
    private final int f35150i;

    /* renamed from: j */
    private final long f35151j;

    /* renamed from: k */
    private final String f35152k;

    /* renamed from: l */
    private C8776a f35153l;

    public C8781c(int i, int i2, long j, String str) {
        this.f35149h = i;
        this.f35150i = i2;
        this.f35151j = j;
        this.f35152k = str;
        this.f35153l = m47366P0();
    }

    /* renamed from: P0 */
    private final C8776a m47366P0() {
        return new C8776a(this.f35149h, this.f35150i, this.f35151j, this.f35152k);
    }

    /* renamed from: N0 */
    public void mo30866N0(C8513g gVar, Runnable runnable) {
        try {
            C8776a.m47326H(this.f35153l, runnable, (C8788j) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            C8927x0.f35312m.mo30866N0(gVar, runnable);
        }
    }

    /* renamed from: Q0 */
    public final void mo31034Q0(Runnable runnable, C8788j jVar, boolean z) {
        try {
            this.f35153l.mo31013E(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            C8927x0.f35312m.mo31189h1(this.f35153l.mo31022p(runnable, jVar));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8781c(int i, int i2, String str, int i3, C8589g gVar) {
        this((i3 & 1) != 0 ? C8790l.f35167b : i, (i3 & 2) != 0 ? C8790l.f35168c : i2, (i3 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    public C8781c(int i, int i2, String str) {
        this(i, i2, C8790l.f35169d, str);
    }
}
