package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3261d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ky2 implements C3261d.C3262a, C3261d.C3263b {

    /* renamed from: a */
    protected final kz2 f19107a;

    /* renamed from: b */
    private final String f19108b;

    /* renamed from: c */
    private final String f19109c;

    /* renamed from: d */
    private final LinkedBlockingQueue<C5513r8> f19110d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    private final HandlerThread f19111e;

    public ky2(Context context, String str, String str2) {
        this.f19108b = str;
        this.f19109c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f19111e = handlerThread;
        handlerThread.start();
        kz2 kz2 = new kz2(context, handlerThread.getLooper(), this, this, 9200000);
        this.f19107a = kz2;
        kz2.mo11803q();
    }

    /* renamed from: a */
    static C5513r8 m26477a() {
        C4920b8 f0 = C5513r8.m29957f0();
        f0.mo16140u0(32768);
        return (C5513r8) f0.mo19761n();
    }

    /* renamed from: C0 */
    public final void mo11815C0(ConnectionResult connectionResult) {
        try {
            this.f19110d.put(m26477a());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        mo19039c();
        r3.f19111e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f19110d.put(m26477a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11813K0(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.nz2 r4 = r3.mo19040d()
            if (r4 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzfnp r0 = new com.google.android.gms.internal.ads.zzfnp     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f19108b     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f19109c     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzfnr r4 = r4.mo19870l3(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.r8 r4 = r4.mo22593Y()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.r8> r0 = r3.f19110d     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.mo19039c()
            android.os.HandlerThread r4 = r3.f19111e
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.r8> r4 = r3.f19110d     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            com.google.android.gms.internal.ads.r8 r0 = m26477a()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.mo19039c()
            android.os.HandlerThread r0 = r3.f19111e
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ky2.mo11813K0(android.os.Bundle):void");
    }

    /* renamed from: b */
    public final C5513r8 mo19038b(int i) {
        C5513r8 r8Var;
        try {
            r8Var = this.f19110d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            r8Var = null;
        }
        return r8Var == null ? m26477a() : r8Var;
    }

    /* renamed from: c */
    public final void mo19039c() {
        kz2 kz2 = this.f19107a;
        if (kz2 == null) {
            return;
        }
        if (kz2.mo11797i() || this.f19107a.mo11793e()) {
            this.f19107a.mo11791c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final nz2 mo19040d() {
        try {
            return this.f19107a.mo19042i0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: z */
    public final void mo11814z(int i) {
        try {
            this.f19110d.put(m26477a());
        } catch (InterruptedException unused) {
        }
    }
}
