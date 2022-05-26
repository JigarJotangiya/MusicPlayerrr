package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.C6457d;
import java.util.List;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;
import p159f.p243f.p245b.p318c.p319a.p322c.C7626a;
import p159f.p243f.p245b.p318c.p319a.p323d.C7632e;

/* renamed from: com.google.android.play.core.assetpacks.r3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6413r3 {

    /* renamed from: f */
    private static final C7577a f29619f = new C7577a("AssetPackManager");

    /* renamed from: a */
    private final C6355g0 f29620a;

    /* renamed from: b */
    private final C7620y<C6347e4> f29621b;

    /* renamed from: c */
    private final C6318a0 f29622c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6420t0 f29623d;

    /* renamed from: e */
    private final C7620y<Executor> f29624e;

    C6413r3(C6355g0 g0Var, C7620y<C6347e4> yVar, C6318a0 a0Var, C7626a aVar, C6320a2 a2Var, C6381l1 l1Var, C6420t0 t0Var, C7620y<Executor> yVar2, C6457d dVar, C6432v2 v2Var) {
        new Handler(Looper.getMainLooper());
        this.f29620a = g0Var;
        this.f29621b = yVar;
        this.f29622c = a0Var;
        this.f29623d = t0Var;
        this.f29624e = yVar2;
    }

    /* renamed from: e */
    private final void m37772e() {
        this.f29624e.zza().execute(new C6408q3(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo25355c() {
        C7632e<List<String>> e = this.f29621b.zza().mo25232e(this.f29620a.mo25246G());
        C6355g0 g0Var = this.f29620a;
        g0Var.getClass();
        e.mo28621c(this.f29624e.zza(), new C6403p3(g0Var));
        e.mo28620b(this.f29624e.zza(), C6398o3.f29601a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo25356d(boolean z) {
        boolean g = this.f29622c.mo28618g();
        this.f29622c.mo28615d(z);
        if (z && !g) {
            m37772e();
        }
    }
}
