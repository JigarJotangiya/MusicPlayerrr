package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class w73<OutputT> extends e73<OutputT> {

    /* renamed from: p */
    private static final s73 f25262p;

    /* renamed from: q */
    private static final Logger f25263q = Logger.getLogger(w73.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile Set<Throwable> f25264n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public volatile int f25265o;

    static {
        Throwable th;
        s73 s73;
        try {
            s73 = new t73(AtomicReferenceFieldUpdater.newUpdater(w73.class, Set.class, "n"), AtomicIntegerFieldUpdater.newUpdater(w73.class, "o"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            s73 = new v73((u73) null);
        }
        f25262p = s73;
        if (th != null) {
            f25263q.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    w73(int i) {
        this.f25265o = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final int mo21743F() {
        return f25262p.mo20802a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final Set<Throwable> mo21744H() {
        Set<Throwable> set = this.f25264n;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        mo20406L(newSetFromMap);
        f25262p.mo20803b(this, (Set<Throwable>) null, newSetFromMap);
        Set<Throwable> set2 = this.f25264n;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo21745K() {
        this.f25264n = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public abstract void mo20406L(Set<Throwable> set);
}
