package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3261d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class my2 implements C3261d.C3262a, C3261d.C3263b {

    /* renamed from: a */
    protected final kz2 f20410a;

    /* renamed from: b */
    private final String f20411b;

    /* renamed from: c */
    private final String f20412c;

    /* renamed from: d */
    private final LinkedBlockingQueue<zzfoa> f20413d;

    /* renamed from: e */
    private final HandlerThread f20414e;

    /* renamed from: f */
    private final dy2 f20415f;

    /* renamed from: g */
    private final long f20416g = System.currentTimeMillis();

    /* renamed from: h */
    private final int f20417h;

    public my2(Context context, int i, int i2, String str, String str2, String str3, dy2 dy2) {
        this.f20411b = str;
        this.f20417h = i2;
        this.f20412c = str2;
        this.f20415f = dy2;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f20414e = handlerThread;
        handlerThread.start();
        kz2 kz2 = new kz2(context, handlerThread.getLooper(), this, this, 19621000);
        this.f20410a = kz2;
        this.f20413d = new LinkedBlockingQueue<>();
        kz2.mo11803q();
    }

    /* renamed from: a */
    static zzfoa m27617a() {
        return new zzfoa((byte[]) null, 1);
    }

    /* renamed from: e */
    private final void m27618e(int i, long j, Exception exc) {
        this.f20415f.mo17048c(i, System.currentTimeMillis() - j, exc);
    }

    /* renamed from: C0 */
    public final void mo11815C0(ConnectionResult connectionResult) {
        try {
            m27618e(4012, this.f20416g, (Exception) null);
            this.f20413d.put(m27617a());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: K0 */
    public final void mo11813K0(Bundle bundle) {
        nz2 d = mo19575d();
        if (d != null) {
            try {
                zzfoa y3 = d.mo19872y3(new zzfny(1, this.f20417h, this.f20411b, this.f20412c));
                m27618e(5011, this.f20416g, (Exception) null);
                this.f20413d.put(y3);
            } catch (Throwable th) {
                mo19574c();
                this.f20414e.quit();
                throw th;
            }
            mo19574c();
            this.f20414e.quit();
        }
    }

    /* renamed from: b */
    public final zzfoa mo19573b(int i) {
        zzfoa zzfoa;
        try {
            zzfoa = this.f20413d.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            m27618e(2009, this.f20416g, e);
            zzfoa = null;
        }
        m27618e(3004, this.f20416g, (Exception) null);
        if (zzfoa != null) {
            if (zzfoa.f27410i == 7) {
                dy2.m22748g(3);
            } else {
                dy2.m22748g(2);
            }
        }
        return zzfoa == null ? m27617a() : zzfoa;
    }

    /* renamed from: c */
    public final void mo19574c() {
        kz2 kz2 = this.f20410a;
        if (kz2 == null) {
            return;
        }
        if (kz2.mo11797i() || this.f20410a.mo11793e()) {
            this.f20410a.mo11791c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final nz2 mo19575d() {
        try {
            return this.f20410a.mo19042i0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: z */
    public final void mo11814z(int i) {
        try {
            m27618e(4011, this.f20416g, (Exception) null);
            this.f20413d.put(m27617a());
        } catch (InterruptedException unused) {
        }
    }
}
