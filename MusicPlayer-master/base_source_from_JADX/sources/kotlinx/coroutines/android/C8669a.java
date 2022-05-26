package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C8664a1;
import kotlinx.coroutines.C8693e2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8894q;
import p369i.C8457t;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: kotlinx.coroutines.android.a */
/* compiled from: HandlerDispatcher.kt */
public final class C8669a extends C8672b implements C8664a1 {
    private volatile C8669a _immediate;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Handler f35033h;

    /* renamed from: i */
    private final String f35034i;

    /* renamed from: j */
    private final boolean f35035j;

    /* renamed from: k */
    private final C8669a f35036k;

    /* renamed from: kotlinx.coroutines.android.a$a */
    /* compiled from: Runnable.kt */
    public static final class C8670a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C8894q f35037g;

        /* renamed from: h */
        final /* synthetic */ C8669a f35038h;

        public C8670a(C8894q qVar, C8669a aVar) {
            this.f35037g = qVar;
            this.f35038h = aVar;
        }

        public final void run() {
            this.f35037g.mo31218f(this.f35038h, C8457t.f34900a);
        }
    }

    /* renamed from: kotlinx.coroutines.android.a$b */
    /* compiled from: HandlerDispatcher.kt */
    static final class C8671b extends C8595m implements C8570l<Throwable, C8457t> {
        final /* synthetic */ Runnable $block;
        final /* synthetic */ C8669a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8671b(C8669a aVar, Runnable runnable) {
            super(1);
            this.this$0 = aVar;
            this.$block = runnable;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C8457t.f34900a;
        }

        public final void invoke(Throwable th) {
            this.this$0.f35033h.removeCallbacks(this.$block);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8669a(Handler handler, String str, boolean z) {
        super((C8589g) null);
        C8669a aVar = null;
        this.f35033h = handler;
        this.f35034i = str;
        this.f35035j = z;
        this._immediate = z ? this : aVar;
        C8669a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new C8669a(handler, str, true);
            this._immediate = aVar2;
            C8457t tVar = C8457t.f34900a;
        }
        this.f35036k = aVar2;
    }

    /* renamed from: S0 */
    private final void m47081S0(C8513g gVar, Runnable runnable) {
        C8693e2.m47143c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C8768g1.m47302b().mo30866N0(gVar, runnable);
    }

    /* renamed from: N0 */
    public void mo30866N0(C8513g gVar, Runnable runnable) {
        if (!this.f35033h.post(runnable)) {
            m47081S0(gVar, runnable);
        }
    }

    /* renamed from: O0 */
    public boolean mo30867O0(C8513g gVar) {
        return !this.f35035j || !C8594l.m46767a(Looper.myLooper(), this.f35033h.getLooper());
    }

    /* renamed from: T0 */
    public C8669a mo30872P0() {
        return this.f35036k;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8669a) && ((C8669a) obj).f35033h == this.f35033h;
    }

    public int hashCode() {
        return System.identityHashCode(this.f35033h);
    }

    public String toString() {
        String Q0 = mo31199Q0();
        if (Q0 != null) {
            return Q0;
        }
        String str = this.f35034i;
        if (str == null) {
            str = this.f35033h.toString();
        }
        return this.f35035j ? C8594l.m46777k(str, ".immediate") : str;
    }

    /* renamed from: x */
    public void mo30858x(long j, C8894q<? super C8457t> qVar) {
        C8670a aVar = new C8670a(qVar, this);
        if (this.f35033h.postDelayed(aVar, C8392f.m46453d(j, 4611686018427387903L))) {
            qVar.mo31216b(new C8671b(this, aVar));
        } else {
            m47081S0(qVar.getContext(), aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8669a(Handler handler, String str, int i, C8589g gVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C8669a(Handler handler, String str) {
        this(handler, str, false);
    }
}
