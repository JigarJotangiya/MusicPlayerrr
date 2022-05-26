package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p31 extends e21 {

    /* renamed from: i */
    private final g40 f21312i;

    /* renamed from: j */
    private final Runnable f21313j;

    /* renamed from: k */
    private final Executor f21314k;

    public p31(f41 f41, g40 g40, Runnable runnable, Executor executor) {
        super(f41);
        this.f21312i = g40;
        this.f21313j = runnable;
        this.f21314k = executor;
    }

    /* renamed from: o */
    static /* synthetic */ void m28861o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo17838b() {
        this.f21314k.execute(new n31(this, new o31(new AtomicReference(this.f21313j))));
    }

    /* renamed from: h */
    public final int mo17083h() {
        return 0;
    }

    /* renamed from: i */
    public final View mo17084i() {
        return null;
    }

    /* renamed from: j */
    public final C5427ox mo17085j() {
        return null;
    }

    /* renamed from: k */
    public final cp2 mo17086k() {
        return null;
    }

    /* renamed from: l */
    public final cp2 mo17087l() {
        return null;
    }

    /* renamed from: m */
    public final void mo17088m() {
    }

    /* renamed from: n */
    public final void mo17089n(ViewGroup viewGroup, zzbfi zzbfi) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo20203p(Runnable runnable) {
        try {
            if (!this.f21312i.mo17113s0(C4865b.m20503f2(runnable))) {
                m28861o(((o31) runnable).f20887g);
            }
        } catch (RemoteException unused) {
            m28861o(((o31) runnable).f20887g);
        }
    }
}
