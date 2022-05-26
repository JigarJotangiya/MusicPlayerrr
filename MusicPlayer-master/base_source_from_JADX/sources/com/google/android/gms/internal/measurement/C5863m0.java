package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
public final class C5863m0 extends C5871q0 {

    /* renamed from: g */
    private final AtomicReference<Bundle> f27534g = new AtomicReference<>();

    /* renamed from: h */
    private boolean f27535h;

    /* renamed from: f2 */
    public static final <T> T m35047f2(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* renamed from: C0 */
    public final String mo22689C0(long j) {
        return (String) m35047f2(mo22690K0(j), String.class);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo22690K0(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.f27534g
            monitor-enter(r0)
            boolean r1 = r2.f27535h     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f27534g     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.f27534g     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5863m0.mo22690K0(long):android.os.Bundle");
    }

    /* renamed from: z0 */
    public final void mo22691z0(Bundle bundle) {
        synchronized (this.f27534g) {
            try {
                this.f27534g.set(bundle);
                this.f27535h = true;
                this.f27534g.notify();
            } catch (Throwable th) {
                this.f27534g.notify();
                throw th;
            }
        }
    }
}
