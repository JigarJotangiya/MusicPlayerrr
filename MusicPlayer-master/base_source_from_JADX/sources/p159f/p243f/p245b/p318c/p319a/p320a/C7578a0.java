package p159f.p243f.p245b.p318c.p319a.p320a;

import java.util.Objects;

/* renamed from: f.f.b.c.a.a.a0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7578a0<T> implements C7582c0, C7620y {

    /* renamed from: c */
    private static final Object f32945c = new Object();

    /* renamed from: a */
    private volatile C7582c0<T> f32946a;

    /* renamed from: b */
    private volatile Object f32947b = f32945c;

    private C7578a0(C7582c0<T> c0Var) {
        this.f32946a = c0Var;
    }

    /* renamed from: a */
    public static <P extends C7582c0<T>, T> C7620y<T> m42330a(P p) {
        if (p instanceof C7620y) {
            return (C7620y) p;
        }
        Objects.requireNonNull(p);
        return new C7578a0(p);
    }

    /* renamed from: b */
    public static <P extends C7582c0<T>, T> C7582c0<T> m42331b(P p) {
        Objects.requireNonNull(p);
        if (p instanceof C7578a0) {
            return p;
        }
        return new C7578a0(p);
    }

    public final T zza() {
        T t = this.f32947b;
        T t2 = f32945c;
        if (t == t2) {
            synchronized (this) {
                t = this.f32947b;
                if (t == t2) {
                    t = this.f32946a.zza();
                    T t3 = this.f32947b;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f32947b = t;
                    this.f32946a = null;
                }
            }
        }
        return t;
    }
}
