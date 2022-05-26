package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;

/* renamed from: com.google.android.play.core.assetpacks.i1 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6366i1 {

    /* renamed from: k */
    private static final C7577a f29490k = new C7577a("ExtractorLooper");

    /* renamed from: a */
    private final C6320a2 f29491a;

    /* renamed from: b */
    private final C6331c1 f29492b;

    /* renamed from: c */
    private final C6383l3 f29493c;

    /* renamed from: d */
    private final C6397o2 f29494d;

    /* renamed from: e */
    private final C6422t2 f29495e;

    /* renamed from: f */
    private final C6321a3 f29496f;

    /* renamed from: g */
    private final C6346e3 f29497g;

    /* renamed from: h */
    private final C7620y<C6347e4> f29498h;

    /* renamed from: i */
    private final C6339d2 f29499i;

    /* renamed from: j */
    private final AtomicBoolean f29500j = new AtomicBoolean(false);

    C6366i1(C6320a2 a2Var, C7620y<C6347e4> yVar, C6331c1 c1Var, C6383l3 l3Var, C6397o2 o2Var, C6422t2 t2Var, C6321a3 a3Var, C6346e3 e3Var, C6339d2 d2Var) {
        this.f29491a = a2Var;
        this.f29498h = yVar;
        this.f29492b = c1Var;
        this.f29493c = l3Var;
        this.f29494d = o2Var;
        this.f29495e = t2Var;
        this.f29496f = a3Var;
        this.f29497g = e3Var;
        this.f29499i = d2Var;
    }

    /* renamed from: b */
    private final void m37678b(int i, Exception exc) {
        try {
            this.f29491a.mo25209k(i, 5);
            this.f29491a.mo25210l(i);
        } catch (C6361h1 unused) {
            f29490k.mo28575b("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25290a() {
        C7577a aVar = f29490k;
        aVar.mo28574a("Run extractor loop", new Object[0]);
        if (this.f29500j.compareAndSet(false, true)) {
            while (true) {
                C6332c2 c2Var = null;
                try {
                    c2Var = this.f29499i.mo25223a();
                } catch (C6361h1 e) {
                    f29490k.mo28575b("Error while getting next extraction task: %s", e.getMessage());
                    if (e.zza >= 0) {
                        this.f29498h.zza().mo25227H(e.zza);
                        m37678b(e.zza, e);
                    }
                }
                if (c2Var != null) {
                    try {
                        if (c2Var instanceof C6325b1) {
                            this.f29492b.mo25222a((C6325b1) c2Var);
                        } else if (c2Var instanceof C6378k3) {
                            this.f29493c.mo25313a((C6378k3) c2Var);
                        } else if (c2Var instanceof C6392n2) {
                            this.f29494d.mo25349a((C6392n2) c2Var);
                        } else if (c2Var instanceof C6407q2) {
                            this.f29495e.mo25365a((C6407q2) c2Var);
                        } else if (c2Var instanceof C6452z2) {
                            this.f29496f.mo25213a((C6452z2) c2Var);
                        } else if (c2Var instanceof C6333c3) {
                            this.f29497g.mo25225a((C6333c3) c2Var);
                        } else {
                            f29490k.mo28575b("Unknown task type: %s", c2Var.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f29490k.mo28575b("Error during extraction task: %s", e2.getMessage());
                        this.f29498h.zza().mo25227H(c2Var.f29409a);
                        m37678b(c2Var.f29409a, e2);
                    }
                } else {
                    this.f29500j.set(false);
                    return;
                }
            }
        } else {
            aVar.mo28578e("runLoop already looping; return", new Object[0]);
        }
    }
}
