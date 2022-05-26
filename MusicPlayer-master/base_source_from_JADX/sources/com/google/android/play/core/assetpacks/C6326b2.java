package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import p159f.p243f.p245b.p318c.p319a.p320a.C7578a0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7582c0;

/* renamed from: com.google.android.play.core.assetpacks.b2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6326b2 implements C7582c0<C6320a2> {

    /* renamed from: a */
    private final C7582c0<C6355g0> f29394a;

    /* renamed from: b */
    private final C7582c0<C6347e4> f29395b;

    /* renamed from: c */
    private final C7582c0<C6381l1> f29396c;

    /* renamed from: d */
    private final C7582c0<Executor> f29397d;

    public C6326b2(C7582c0<C6355g0> c0Var, C7582c0<C6347e4> c0Var2, C7582c0<C6381l1> c0Var3, C7582c0<Executor> c0Var4) {
        this.f29394a = c0Var;
        this.f29395b = c0Var2;
        this.f29396c = c0Var3;
        this.f29397d = c0Var4;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        C6355g0 zza = this.f29394a.zza();
        return new C6320a2(zza, C7578a0.m42330a(this.f29395b), this.f29396c.zza(), C7578a0.m42330a(this.f29397d));
    }
}
