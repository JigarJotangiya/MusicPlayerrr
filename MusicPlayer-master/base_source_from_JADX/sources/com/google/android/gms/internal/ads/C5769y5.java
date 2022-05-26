package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5769y5<T> {

    /* renamed from: a */
    public final T f26264a;

    /* renamed from: b */
    public final C4917b5 f26265b;

    /* renamed from: c */
    public final C4955c6 f26266c;

    /* renamed from: d */
    public boolean f26267d;

    private C5769y5(C4955c6 c6Var) {
        this.f26267d = false;
        this.f26264a = null;
        this.f26265b = null;
        this.f26266c = c6Var;
    }

    private C5769y5(T t, C4917b5 b5Var) {
        this.f26267d = false;
        this.f26264a = t;
        this.f26265b = b5Var;
        this.f26266c = null;
    }

    /* renamed from: a */
    public static <T> C5769y5<T> m34033a(C4955c6 c6Var) {
        return new C5769y5<>(c6Var);
    }

    /* renamed from: b */
    public static <T> C5769y5<T> m34034b(T t, C4917b5 b5Var) {
        return new C5769y5<>(t, b5Var);
    }

    /* renamed from: c */
    public final boolean mo22170c() {
        return this.f26266c == null;
    }
}
