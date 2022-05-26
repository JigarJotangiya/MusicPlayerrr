package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.g64;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f64<T extends g64> extends Handler implements Runnable {

    /* renamed from: g */
    private final T f16453g;

    /* renamed from: h */
    private final long f16454h;

    /* renamed from: i */
    private c64<T> f16455i;

    /* renamed from: j */
    private IOException f16456j;

    /* renamed from: k */
    private int f16457k;

    /* renamed from: l */
    private Thread f16458l;

    /* renamed from: m */
    private boolean f16459m;

    /* renamed from: n */
    private volatile boolean f16460n;

    /* renamed from: o */
    final /* synthetic */ l64 f16461o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f64(l64 l64, Looper looper, T t, c64<T> c64, int i, long j) {
        super(looper);
        this.f16461o = l64;
        this.f16453g = t;
        this.f16455i = c64;
        this.f16454h = j;
    }

    /* renamed from: d */
    private final void m23505d() {
        this.f16456j = null;
        ExecutorService d = this.f16461o.f19224a;
        f64 c = this.f16461o.f19225b;
        Objects.requireNonNull(c);
        d.execute(c);
    }

    /* renamed from: a */
    public final void mo17489a(boolean z) {
        this.f16460n = z;
        this.f16456j = null;
        if (hasMessages(0)) {
            this.f16459m = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f16459m = true;
                this.f16453g.mo16041e();
                Thread thread = this.f16458l;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f16461o.f19225b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c64<T> c64 = this.f16455i;
            Objects.requireNonNull(c64);
            c64.mo16510k(this.f16453g, elapsedRealtime, elapsedRealtime - this.f16454h, true);
            this.f16455i = null;
        }
    }

    /* renamed from: b */
    public final void mo17490b(int i) throws IOException {
        IOException iOException = this.f16456j;
        if (iOException != null && this.f16457k > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo17491c(long j) {
        gs1.m24488f(this.f16461o.f19225b == null);
        this.f16461o.f19225b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m23505d();
        }
    }

    public final void handleMessage(Message message) {
        long j;
        if (!this.f16460n) {
            int i = message.what;
            if (i == 0) {
                m23505d();
            } else if (i != 3) {
                this.f16461o.f19225b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.f16454h;
                c64<T> c64 = this.f16455i;
                Objects.requireNonNull(c64);
                if (this.f16459m) {
                    c64.mo16510k(this.f16453g, elapsedRealtime, j2, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        c64.mo16509i(this.f16453g, elapsedRealtime, j2);
                    } catch (RuntimeException e) {
                        y92.m34067a("LoadTask", "Unexpected exception handling load completed", e);
                        this.f16461o.f19226c = new k64(e);
                    }
                } else if (i2 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f16456j = iOException;
                    int i3 = this.f16457k + 1;
                    this.f16457k = i3;
                    e64 p = c64.mo16511p(this.f16453g, elapsedRealtime, j2, iOException, i3);
                    if (p.f15879a == 3) {
                        this.f16461o.f19226c = this.f16456j;
                    } else if (p.f15879a != 2) {
                        if (p.f15879a == 1) {
                            this.f16457k = 1;
                        }
                        if (p.f15880b != -9223372036854775807L) {
                            j = p.f15880b;
                        } else {
                            j = (long) Math.min((this.f16457k - 1) * 1000, 5000);
                        }
                        mo17491c(j);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z;
        String str;
        try {
            synchronized (this) {
                z = !this.f16459m;
                this.f16458l = Thread.currentThread();
            }
            if (z) {
                String valueOf = String.valueOf(this.f16453g.getClass().getSimpleName());
                if (valueOf.length() != 0) {
                    str = "load:".concat(valueOf);
                } else {
                    str = new String("load:");
                }
                uw2.m32078a(str);
                this.f16453g.mo16042g();
                uw2.m32079b();
            }
            synchronized (this) {
                this.f16458l = null;
                Thread.interrupted();
            }
            if (!this.f16460n) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.f16460n) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.f16460n) {
                y92.m34067a("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new k64(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.f16460n) {
                y92.m34067a("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new k64(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.f16460n) {
                y92.m34067a("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            uw2.m32079b();
            throw th;
        }
    }
}
