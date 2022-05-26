package androidx.work.impl.p009m.p011f;

import android.content.Context;
import androidx.work.C1405l;
import androidx.work.impl.p009m.C1293a;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.work.impl.m.f.d */
/* compiled from: ConstraintTracker */
public abstract class C1310d<T> {

    /* renamed from: f */
    private static final String f5270f = C1405l.m7462f("ConstraintTracker");

    /* renamed from: a */
    protected final C1397a f5271a;

    /* renamed from: b */
    protected final Context f5272b;

    /* renamed from: c */
    private final Object f5273c = new Object();

    /* renamed from: d */
    private final Set<C1293a<T>> f5274d = new LinkedHashSet();

    /* renamed from: e */
    T f5275e;

    /* renamed from: androidx.work.impl.m.f.d$a */
    /* compiled from: ConstraintTracker */
    class C1311a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ List f5276g;

        C1311a(List list) {
            this.f5276g = list;
        }

        public void run() {
            for (C1293a a : this.f5276g) {
                a.mo6633a(C1310d.this.f5275e);
            }
        }
    }

    C1310d(Context context, C1397a aVar) {
        this.f5272b = context.getApplicationContext();
        this.f5271a = aVar;
    }

    /* renamed from: a */
    public void mo6667a(C1293a<T> aVar) {
        synchronized (this.f5273c) {
            if (this.f5274d.add(aVar)) {
                if (this.f5274d.size() == 1) {
                    this.f5275e = mo6659b();
                    C1405l.m7460c().mo6816a(f5270f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f5275e}), new Throwable[0]);
                    mo6664e();
                }
                aVar.mo6633a(this.f5275e);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo6659b();

    /* renamed from: c */
    public void mo6668c(C1293a<T> aVar) {
        synchronized (this.f5273c) {
            if (this.f5274d.remove(aVar) && this.f5274d.isEmpty()) {
                mo6665f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6669d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5273c
            monitor-enter(r0)
            T r1 = r3.f5275e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f5275e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<androidx.work.impl.m.a<T>> r1 = r3.f5274d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            androidx.work.impl.utils.p.a r1 = r3.f5271a     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.mo6803a()     // Catch:{ all -> 0x002b }
            androidx.work.impl.m.f.d$a r2 = new androidx.work.impl.m.f.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p009m.p011f.C1310d.mo6669d(java.lang.Object):void");
    }

    /* renamed from: e */
    public abstract void mo6664e();

    /* renamed from: f */
    public abstract void mo6665f();
}
