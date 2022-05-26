package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C6457d;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;

/* renamed from: com.google.android.play.core.assetpacks.t2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6422t2 {

    /* renamed from: a */
    private final C6355g0 f29652a;

    /* renamed from: b */
    private final C7620y<C6347e4> f29653b;

    /* renamed from: c */
    private final C6320a2 f29654c;

    /* renamed from: d */
    private final C7620y<Executor> f29655d;

    /* renamed from: e */
    private final C6381l1 f29656e;

    /* renamed from: f */
    private final C6457d f29657f;

    /* renamed from: g */
    private final C6432v2 f29658g;

    C6422t2(C6355g0 g0Var, C7620y<C6347e4> yVar, C6320a2 a2Var, C7620y<Executor> yVar2, C6381l1 l1Var, C6457d dVar, C6432v2 v2Var) {
        this.f29652a = g0Var;
        this.f29653b = yVar;
        this.f29654c = a2Var;
        this.f29655d = yVar2;
        this.f29656e = l1Var;
        this.f29657f = dVar;
        this.f29658g = v2Var;
    }

    /* renamed from: a */
    public final void mo25365a(C6407q2 q2Var) {
        File w = this.f29652a.mo25263w(q2Var.f29410b, q2Var.f29611c, q2Var.f29612d);
        File y = this.f29652a.mo25265y(q2Var.f29410b, q2Var.f29611c, q2Var.f29612d);
        if (!w.exists() || !y.exists()) {
            throw new C6361h1(String.format("Cannot find pack files to move for pack %s.", new Object[]{q2Var.f29410b}), q2Var.f29409a);
        }
        File u = this.f29652a.mo25261u(q2Var.f29410b, q2Var.f29611c, q2Var.f29612d);
        u.mkdirs();
        if (w.renameTo(u)) {
            new File(this.f29652a.mo25261u(q2Var.f29410b, q2Var.f29611c, q2Var.f29612d), "merge.tmp").delete();
            File v = this.f29652a.mo25262v(q2Var.f29410b, q2Var.f29611c, q2Var.f29612d);
            v.mkdirs();
            if (y.renameTo(v)) {
                if (this.f29657f.mo25384a("assetOnlyUpdates")) {
                    try {
                        this.f29658g.mo25370b(q2Var.f29410b, q2Var.f29611c, q2Var.f29612d, q2Var.f29613e);
                        this.f29655d.zza().execute(new C6417s2(this, q2Var));
                    } catch (IOException e) {
                        throw new C6361h1(String.format("Could not write asset pack version tag for pack %s: %s", new Object[]{q2Var.f29410b, e.getMessage()}), q2Var.f29409a);
                    }
                } else {
                    C6355g0 g0Var = this.f29652a;
                    g0Var.getClass();
                    this.f29655d.zza().execute(new C6412r2(g0Var));
                }
                this.f29654c.mo25207i(q2Var.f29410b, q2Var.f29611c, q2Var.f29612d);
                this.f29656e.mo25308c(q2Var.f29410b);
                this.f29653b.zza().mo25228a(q2Var.f29409a, q2Var.f29410b);
                return;
            }
            throw new C6361h1("Cannot move metadata files to final location.", q2Var.f29409a);
        }
        throw new C6361h1("Cannot move merged pack files to final location.", q2Var.f29409a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo25366b(C6407q2 q2Var) {
        this.f29652a.mo25251b(q2Var.f29410b, q2Var.f29611c, q2Var.f29612d);
    }
}
