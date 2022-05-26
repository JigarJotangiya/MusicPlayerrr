package p159f.p243f.p245b.p318c.p319a.p320a;

/* renamed from: f.f.b.c.a.a.z */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7621z<T> implements C7582c0<T> {

    /* renamed from: a */
    private C7582c0<T> f32980a;

    /* renamed from: a */
    public static <T> void m42430a(C7582c0<T> c0Var, C7582c0<T> c0Var2) {
        C7621z zVar = (C7621z) c0Var;
        if (zVar.f32980a == null) {
            zVar.f32980a = c0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    public final T zza() {
        C7582c0<T> c0Var = this.f32980a;
        if (c0Var != null) {
            return c0Var.zza();
        }
        throw new IllegalStateException();
    }
}
