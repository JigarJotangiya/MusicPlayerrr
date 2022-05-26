package kotlinx.coroutines.p397f3.p398q;

import java.util.Arrays;
import kotlinx.coroutines.p397f3.C8742j;
import kotlinx.coroutines.p397f3.C8746m;
import kotlinx.coroutines.p397f3.p398q.C8754d;
import p369i.C8447l;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.f3.q.b */
/* compiled from: AbstractSharedFlow.kt */
public abstract class C8752b<S extends C8754d<?>> {

    /* renamed from: g */
    private S[] f35107g;

    /* renamed from: h */
    private int f35108h;

    /* renamed from: i */
    private int f35109i;

    /* renamed from: j */
    private C8742j<Integer> f35110j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final S mo30996b() {
        S s;
        C8742j<Integer> jVar;
        synchronized (this) {
            S[] g = mo30999g();
            if (g == null) {
                g = mo30982d(2);
                this.f35107g = g;
            } else if (mo30998f() >= g.length) {
                S[] copyOf = Arrays.copyOf(g, g.length * 2);
                C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                this.f35107g = (C8754d[]) copyOf;
                g = (C8754d[]) copyOf;
            }
            int i = this.f35109i;
            do {
                s = g[i];
                if (s == null) {
                    s = mo30980c();
                    g[i] = s;
                }
                i++;
                if (i >= g.length) {
                    i = 0;
                }
            } while (!s.mo30986a(this));
            this.f35109i = i;
            this.f35108h = mo30998f() + 1;
            jVar = this.f35110j;
        }
        if (jVar != null) {
            C8746m.m47277d(jVar, 1);
        }
        return s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract S mo30980c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract S[] mo30982d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo30997e(S s) {
        C8742j<Integer> jVar;
        int i;
        C8508d[] b;
        synchronized (this) {
            this.f35108h = mo30998f() - 1;
            jVar = this.f35110j;
            i = 0;
            if (mo30998f() == 0) {
                this.f35109i = 0;
            }
            b = s.mo30987b(this);
        }
        int length = b.length;
        while (i < length) {
            C8508d dVar = b[i];
            i++;
            if (dVar != null) {
                C8457t tVar = C8457t.f34900a;
                C8447l.C8448a aVar = C8447l.Companion;
                dVar.resumeWith(C8447l.m50326constructorimpl(tVar));
            }
        }
        if (jVar != null) {
            C8746m.m47277d(jVar, -1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo30998f() {
        return this.f35108h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final S[] mo30999g() {
        return this.f35107g;
    }
}
