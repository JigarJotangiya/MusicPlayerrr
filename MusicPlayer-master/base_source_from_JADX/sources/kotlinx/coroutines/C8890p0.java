package kotlinx.coroutines;

import java.util.Objects;
import p369i.C8457t;
import p369i.p379w.C8501a;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.p0 */
/* compiled from: CoroutineContext.kt */
public final class C8890p0 extends C8501a implements C8925w2<String> {

    /* renamed from: h */
    public static final C8891a f35285h = new C8891a((C8589g) null);

    /* renamed from: g */
    private final long f35286g;

    /* renamed from: kotlinx.coroutines.p0$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C8891a implements C8513g.C8518c<C8890p0> {
        private C8891a() {
        }

        public /* synthetic */ C8891a(C8589g gVar) {
            this();
        }
    }

    public C8890p0(long j) {
        super(f35285h);
        this.f35286g = j;
    }

    /* renamed from: N0 */
    public final long mo31209N0() {
        return this.f35286g;
    }

    /* renamed from: O0 */
    public void mo31214m0(C8513g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: P0 */
    public String mo31208H0(C8513g gVar) {
        String N0;
        C8895q0 q0Var = (C8895q0) gVar.get(C8895q0.f35287h);
        String str = "coroutine";
        if (!(q0Var == null || (N0 = q0Var.mo31221N0()) == null)) {
            str = N0;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int J = C8437p.m46535J(name, " @", 0, false, 6, (Object) null);
        if (J < 0) {
            J = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + J + 10);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String substring = name.substring(0, J);
        C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(mo31209N0());
        C8457t tVar = C8457t.f34900a;
        String sb2 = sb.toString();
        C8594l.m46770d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8890p0) && this.f35286g == ((C8890p0) obj).f35286g;
    }

    public int hashCode() {
        return C1428c.m7501a(this.f35286g);
    }

    public String toString() {
        return "CoroutineId(" + this.f35286g + ')';
    }
}
