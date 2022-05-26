package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w64 extends HandlerThread implements Handler.Callback {

    /* renamed from: g */
    private p02 f25252g;

    /* renamed from: h */
    private Handler f25253h;

    /* renamed from: i */
    private Error f25254i;

    /* renamed from: j */
    private RuntimeException f25255j;

    /* renamed from: k */
    private zzuq f25256k;

    public w64() {
        super("ExoPlayer:DummySurface");
    }

    /* renamed from: a */
    public final zzuq mo21732a(int i) {
        boolean z;
        start();
        this.f25253h = new Handler(getLooper(), this);
        this.f25252g = new p02(this.f25253h, (oz1) null);
        synchronized (this) {
            z = false;
            this.f25253h.obtainMessage(1, i, 0).sendToTarget();
            while (this.f25256k == null && this.f25255j == null && this.f25254i == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f25255j;
        if (runtimeException == null) {
            Error error = this.f25254i;
            if (error == null) {
                zzuq zzuq = this.f25256k;
                Objects.requireNonNull(zzuq);
                return zzuq;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo21733b() {
        Handler handler = this.f25253h;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                p02 p02 = this.f25252g;
                Objects.requireNonNull(p02);
                p02.mo20169b(i2);
                this.f25256k = new zzuq(this, this.f25252g.mo20168a(), i2 != 0, (x64) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                y92.m34067a("DummySurface", "Failed to initialize dummy surface", e);
                this.f25255j = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    y92.m34067a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f25254i = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i != 2) {
            return true;
        } else {
            try {
                p02 p022 = this.f25252g;
                Objects.requireNonNull(p022);
                p022.mo20170c();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }
}
