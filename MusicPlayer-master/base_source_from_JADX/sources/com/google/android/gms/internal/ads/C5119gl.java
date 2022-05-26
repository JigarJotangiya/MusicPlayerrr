package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.C5156hl;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.internal.ads.gl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5119gl<T extends C5156hl> extends Handler implements Runnable {

    /* renamed from: g */
    private final T f17165g;

    /* renamed from: h */
    private final C5082fl<T> f17166h;

    /* renamed from: i */
    public final int f17167i;

    /* renamed from: j */
    private final long f17168j;

    /* renamed from: k */
    private IOException f17169k;

    /* renamed from: l */
    private int f17170l;

    /* renamed from: m */
    private volatile Thread f17171m;

    /* renamed from: n */
    private volatile boolean f17172n;

    /* renamed from: o */
    final /* synthetic */ C5230jl f17173o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5119gl(C5230jl jlVar, Looper looper, T t, C5082fl<T> flVar, int i, long j) {
        super(looper);
        this.f17173o = jlVar;
        this.f17165g = t;
        this.f17166h = flVar;
        this.f17167i = i;
        this.f17168j = j;
    }

    /* renamed from: d */
    private final void m24417d() {
        this.f17169k = null;
        this.f17173o.f18509a.execute(this.f17173o.f18510b);
    }

    /* renamed from: a */
    public final void mo17961a(boolean z) {
        this.f17172n = z;
        this.f17169k = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f17165g.mo16935a();
            if (this.f17171m != null) {
                this.f17171m.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.f17173o.f18510b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f17166h.mo17555g(this.f17165g, elapsedRealtime, elapsedRealtime - this.f17168j, true);
    }

    /* renamed from: b */
    public final void mo17962b(int i) throws IOException {
        IOException iOException = this.f17169k;
        if (iOException != null && this.f17170l > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo17963c(long j) {
        C5304ll.m26776e(this.f17173o.f18510b == null);
        this.f17173o.f18510b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m24417d();
        }
    }

    public final void handleMessage(Message message) {
        if (!this.f17172n) {
            int i = message.what;
            if (i == 0) {
                m24417d();
            } else if (i != 4) {
                this.f17173o.f18510b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f17168j;
                if (this.f17165g.zze()) {
                    this.f17166h.mo17555g(this.f17165g, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                int i3 = 1;
                if (i2 == 1) {
                    this.f17166h.mo17555g(this.f17165g, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    this.f17166h.mo17554c(this.f17165g, elapsedRealtime, j);
                } else if (i2 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f17169k = iOException;
                    int h = this.f17166h.mo17556h(this.f17165g, elapsedRealtime, j, iOException);
                    if (h == 3) {
                        this.f17173o.f18511c = this.f17169k;
                    } else if (h != 2) {
                        if (h != 1) {
                            i3 = 1 + this.f17170l;
                        }
                        this.f17170l = i3;
                        mo17963c((long) Math.min((i3 - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        String str;
        try {
            this.f17171m = Thread.currentThread();
            if (!this.f17165g.zze()) {
                String valueOf = String.valueOf(this.f17165g.getClass().getSimpleName());
                if (valueOf.length() != 0) {
                    str = "load:".concat(valueOf);
                } else {
                    str = new String("load:");
                }
                C5786yl.m34154a(str);
                this.f17165g.mo16936b();
                C5786yl.m34155b();
            }
            if (!this.f17172n) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f17172n) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            C5304ll.m26776e(this.f17165g.zze());
            if (!this.f17172n) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.f17172n) {
                obtainMessage(3, new C5193il(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.f17172n) {
                obtainMessage(3, new C5193il(e3)).sendToTarget();
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.f17172n) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            C5786yl.m34155b();
            throw th;
        }
    }
}
