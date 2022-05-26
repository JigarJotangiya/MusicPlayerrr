package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class q73<InputT, OutputT> extends w73<OutputT> {

    /* renamed from: u */
    private static final Logger f21856u = Logger.getLogger(q73.class.getName());

    /* renamed from: r */
    private b43<? extends d93<? extends InputT>> f21857r;

    /* renamed from: s */
    private final boolean f21858s;

    /* renamed from: t */
    private final boolean f21859t;

    q73(b43<? extends d93<? extends InputT>> b43, boolean z, boolean z2) {
        super(b43.size());
        Objects.requireNonNull(b43);
        this.f21857r = b43;
        this.f21858s = z;
        this.f21859t = z2;
    }

    /* renamed from: N */
    private final void m29387N(int i, Future<? extends InputT> future) {
        try {
            mo16548S(i, s83.m30614p(future));
        } catch (ExecutionException e) {
            m29389P(e.getCause());
        } catch (Throwable th) {
            m29389P(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void mo20409W(b43<? extends Future<? extends InputT>> b43) {
        int F = mo21743F();
        int i = 0;
        s13.m30504g(F >= 0, "Less than 0 remaining futures");
        if (F == 0) {
            if (b43 != null) {
                j63<? extends Future<? extends InputT>> zze = b43.iterator();
                while (zze.hasNext()) {
                    Future future = (Future) zze.next();
                    if (!future.isCancelled()) {
                        m29387N(i, future);
                    }
                    i++;
                }
            }
            mo21745K();
            mo16549T();
            mo16547M(2);
        }
    }

    /* renamed from: P */
    private final void m29389P(Throwable th) {
        Objects.requireNonNull(th);
        if (this.f21858s && !mo18106x(th) && m29391R(mo21744H(), th)) {
            m29390Q(th);
        } else if (th instanceof Error) {
            m29390Q(th);
        }
    }

    /* renamed from: Q */
    private static void m29390Q(Throwable th) {
        f21856u.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* renamed from: R */
    private static boolean m29391R(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo20406L(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (!isCancelled()) {
            Throwable a = mo18095a();
            a.getClass();
            m29391R(set, a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo16547M(int i) {
        this.f21857r = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public abstract void mo16548S(int i, InputT inputt);

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public abstract void mo16549T();

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo20407U() {
        b43<? extends d93<? extends InputT>> b43 = this.f21857r;
        b43.getClass();
        if (b43.isEmpty()) {
            mo16549T();
        } else if (this.f21858s) {
            j63<? extends d93<? extends InputT>> zze = this.f21857r.iterator();
            int i = 0;
            while (zze.hasNext()) {
                d93 d93 = (d93) zze.next();
                d93.mo15945h(new p73(this, d93, i), g83.INSTANCE);
                i++;
            }
        } else {
            o73 o73 = new o73(this, this.f21859t ? this.f21857r : null);
            j63<? extends d93<? extends InputT>> zze2 = this.f21857r.iterator();
            while (zze2.hasNext()) {
                ((d93) zze2.next()).mo15945h(o73, g83.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final /* synthetic */ void mo20408V(d93 d93, int i) {
        try {
            if (d93.isCancelled()) {
                this.f21857r = null;
                cancel(false);
            } else {
                m29387N(i, d93);
            }
        } finally {
            mo20409W((b43) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo18099i() {
        b43<? extends d93<? extends InputT>> b43 = this.f21857r;
        if (b43 != null) {
            return "futures=".concat(b43.toString());
        }
        return super.mo18099i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18102j() {
        b43<? extends d93<? extends InputT>> b43 = this.f21857r;
        boolean z = true;
        mo16547M(1);
        boolean isCancelled = isCancelled();
        if (b43 == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean z2 = mo18108z();
            j63<? extends d93<? extends InputT>> zze = b43.iterator();
            while (zze.hasNext()) {
                ((Future) zze.next()).cancel(z2);
            }
        }
    }
}
