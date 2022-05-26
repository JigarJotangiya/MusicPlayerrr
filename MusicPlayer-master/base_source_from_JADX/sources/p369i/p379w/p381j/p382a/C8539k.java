package p369i.p379w.p381j.p382a;

import p369i.p379w.C8508d;
import p369i.p387z.p389d.C8590h;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8603u;

/* renamed from: i.w.j.a.k */
/* compiled from: ContinuationImpl.kt */
public abstract class C8539k extends C8531d implements C8590h<Object> {
    private final int arity;

    public C8539k(int i, C8508d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String e = C8603u.m46789e(this);
        C8594l.m46770d(e, "Reflection.renderLambdaToString(this)");
        return e;
    }

    public C8539k(int i) {
        this(i, (C8508d<Object>) null);
    }
}
