package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;

/* renamed from: com.google.android.play.core.assetpacks.e3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6346e3 {

    /* renamed from: a */
    private final C6355g0 f29435a;

    /* renamed from: b */
    private final C7620y<C6347e4> f29436b;

    /* renamed from: c */
    private final C6320a2 f29437c;

    /* renamed from: d */
    private final C7620y<Executor> f29438d;

    /* renamed from: e */
    private final C6381l1 f29439e;

    C6346e3(C6355g0 g0Var, C7620y<C6347e4> yVar, C6320a2 a2Var, C7620y<Executor> yVar2, C6381l1 l1Var) {
        this.f29435a = g0Var;
        this.f29436b = yVar;
        this.f29437c = a2Var;
        this.f29438d = yVar2;
        this.f29439e = l1Var;
    }

    /* renamed from: a */
    public final void mo25225a(C6333c3 c3Var) {
        File u = this.f29435a.mo25261u(c3Var.f29410b, c3Var.f29411c, c3Var.f29413e);
        if (u.exists()) {
            File u2 = this.f29435a.mo25261u(c3Var.f29410b, c3Var.f29412d, c3Var.f29413e);
            u2.mkdirs();
            if (u.renameTo(u2)) {
                this.f29438d.zza().execute(new C6340d3(this, c3Var));
                this.f29437c.mo25207i(c3Var.f29410b, c3Var.f29412d, c3Var.f29413e);
                this.f29439e.mo25308c(c3Var.f29410b);
                this.f29436b.zza().mo25228a(c3Var.f29409a, c3Var.f29410b);
                return;
            }
            throw new C6361h1(String.format("Cannot promote pack %s from %s to %s", new Object[]{c3Var.f29410b, u.getAbsolutePath(), u2.getAbsolutePath()}), c3Var.f29409a);
        }
        throw new C6361h1(String.format("Cannot find pack files to promote for pack %s at %s", new Object[]{c3Var.f29410b, u.getAbsolutePath()}), c3Var.f29409a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo25226b(C6333c3 c3Var) {
        this.f29435a.mo25251b(c3Var.f29410b, c3Var.f29412d, c3Var.f29413e);
    }
}
