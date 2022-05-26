package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.room.p006d1.C0943e;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p082e.p091b.p092a.p095c.C3458a;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;

/* renamed from: androidx.room.y */
/* compiled from: AutoCloser */
final class C1017y {

    /* renamed from: a */
    private C4215c f4307a = null;

    /* renamed from: b */
    private final Handler f4308b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    Runnable f4309c = null;

    /* renamed from: d */
    final Object f4310d = new Object();

    /* renamed from: e */
    final long f4311e;

    /* renamed from: f */
    final Executor f4312f;

    /* renamed from: g */
    int f4313g = 0;

    /* renamed from: h */
    long f4314h = SystemClock.uptimeMillis();

    /* renamed from: i */
    C4214b f4315i;

    /* renamed from: j */
    private boolean f4316j = false;

    /* renamed from: k */
    private final Runnable f4317k = new C1018a();

    /* renamed from: l */
    final Runnable f4318l = new C1019b();

    /* renamed from: androidx.room.y$a */
    /* compiled from: AutoCloser */
    class C1018a implements Runnable {
        C1018a() {
        }

        public void run() {
            C1017y yVar = C1017y.this;
            yVar.f4312f.execute(yVar.f4318l);
        }
    }

    /* renamed from: androidx.room.y$b */
    /* compiled from: AutoCloser */
    class C1019b implements Runnable {
        C1019b() {
        }

        public void run() {
            synchronized (C1017y.this.f4310d) {
                long uptimeMillis = SystemClock.uptimeMillis();
                C1017y yVar = C1017y.this;
                if (uptimeMillis - yVar.f4314h >= yVar.f4311e) {
                    if (yVar.f4313g == 0) {
                        Runnable runnable = yVar.f4309c;
                        if (runnable != null) {
                            runnable.run();
                            C4214b bVar = C1017y.this.f4315i;
                            if (bVar != null && bVar.isOpen()) {
                                try {
                                    C1017y.this.f4315i.close();
                                    C1017y.this.f4315i = null;
                                } catch (IOException e) {
                                    C0943e.m5707a(e);
                                    throw null;
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                    }
                }
            }
        }
    }

    C1017y(long j, TimeUnit timeUnit, Executor executor) {
        this.f4311e = timeUnit.toMillis(j);
        this.f4312f = executor;
    }

    /* renamed from: a */
    public void mo5632a() throws IOException {
        synchronized (this.f4310d) {
            this.f4316j = true;
            C4214b bVar = this.f4315i;
            if (bVar != null) {
                bVar.close();
            }
            this.f4315i = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5633b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4310d
            monitor-enter(r0)
            int r1 = r5.f4313g     // Catch:{ all -> 0x0026 }
            if (r1 <= 0) goto L_0x001e
            int r1 = r1 + -1
            r5.f4313g = r1     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x001c
            e.u.a.b r1 = r5.f4315i     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0013:
            android.os.Handler r1 = r5.f4308b     // Catch:{ all -> 0x0026 }
            java.lang.Runnable r2 = r5.f4317k     // Catch:{ all -> 0x0026 }
            long r3 = r5.f4311e     // Catch:{ all -> 0x0026 }
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0026 }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "ref count is 0 or lower but we're supposed to decrement"
            r1.<init>(r2)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1017y.mo5633b():void");
    }

    /* renamed from: c */
    public <V> V mo5634c(C3458a<C4214b, V> aVar) {
        try {
            return aVar.apply(mo5636e());
        } finally {
            mo5633b();
        }
    }

    /* renamed from: d */
    public C4214b mo5635d() {
        C4214b bVar;
        synchronized (this.f4310d) {
            bVar = this.f4315i;
        }
        return bVar;
    }

    /* renamed from: e */
    public C4214b mo5636e() {
        synchronized (this.f4310d) {
            this.f4308b.removeCallbacks(this.f4317k);
            this.f4313g++;
            if (!this.f4316j) {
                C4214b bVar = this.f4315i;
                if (bVar == null || !bVar.isOpen()) {
                    C4215c cVar = this.f4307a;
                    if (cVar != null) {
                        C4214b V = cVar.mo5551V();
                        this.f4315i = V;
                        return V;
                    }
                    throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                C4214b bVar2 = this.f4315i;
                return bVar2;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    /* renamed from: f */
    public void mo5637f(C4215c cVar) {
        if (this.f4307a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f4307a = cVar;
        }
    }

    /* renamed from: g */
    public boolean mo5638g() {
        return !this.f4316j;
    }

    /* renamed from: h */
    public void mo5639h(Runnable runnable) {
        this.f4309c = runnable;
    }
}
