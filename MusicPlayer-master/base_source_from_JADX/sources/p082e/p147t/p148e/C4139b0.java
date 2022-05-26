package p082e.p147t.p148e;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e.t.e.b0 */
/* compiled from: OperationMonitor */
public final class C4139b0 {

    /* renamed from: a */
    private final List<C4141b> f12454a = new ArrayList();

    /* renamed from: b */
    private final C4159g0 f12455b = new C4140a();

    /* renamed from: c */
    private int f12456c = 0;

    /* renamed from: e.t.e.b0$a */
    /* compiled from: OperationMonitor */
    class C4140a implements C4159g0 {
        C4140a() {
        }

        /* renamed from: a */
        public void mo14260a() {
            C4139b0.this.mo14257e();
        }

        /* renamed from: b */
        public boolean mo14261b() {
            return C4139b0.this.mo14255b();
        }
    }

    /* renamed from: e.t.e.b0$b */
    /* compiled from: OperationMonitor */
    public interface C4141b {
        /* renamed from: a */
        void mo14262a();
    }

    /* renamed from: d */
    private void m18279d() {
        for (C4141b a : this.f12454a) {
            a.mo14262a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4159g0 mo14254a() {
        return this.f12455b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean mo14255b() {
        return mo14256c();
    }

    /* renamed from: c */
    public synchronized boolean mo14256c() {
        return this.f12456c > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo14257e() {
        if (this.f12456c > 0) {
            Log.w("OperationMonitor", "Resetting OperationMonitor with " + this.f12456c + " active operations.");
        }
        this.f12456c = 0;
        m18279d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo14258f() {
        int i = this.f12456c + 1;
        this.f12456c = i;
        if (i == 1) {
            m18279d();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo14259g() {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f12456c     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            int r0 = r0 + -1
            r1.f12456c = r0     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0010
            r1.m18279d()     // Catch:{ all -> 0x0012 }
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p147t.p148e.C4139b0.mo14259g():void");
    }
}
