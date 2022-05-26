package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qv1 implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f22251a;

    /* renamed from: b */
    private final Sensor f22252b;

    /* renamed from: c */
    private float f22253c = 0.0f;

    /* renamed from: d */
    private Float f22254d = Float.valueOf(0.0f);

    /* renamed from: e */
    private long f22255e = C2971s.m13198a().mo11988a();

    /* renamed from: f */
    private int f22256f = 0;

    /* renamed from: g */
    private boolean f22257g = false;

    /* renamed from: h */
    private boolean f22258h = false;

    /* renamed from: i */
    private pv1 f22259i = null;

    /* renamed from: j */
    private boolean f22260j = false;

    qv1(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f22251a = sensorManager;
        if (sensorManager != null) {
            this.f22252b = sensorManager.getDefaultSensor(4);
        } else {
            this.f22252b = null;
        }
    }

    /* renamed from: a */
    public final void mo20511a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!(!this.f22260j || (sensorManager = this.f22251a) == null || (sensor = this.f22252b) == null)) {
                sensorManager.unregisterListener(this, sensor);
                this.f22260j = false;
                C3018m1.m13388k("Stopped listening for flick gestures.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3.f22251a == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r3.f22252b != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        com.google.android.gms.internal.ads.ul0.m31862g("Flick detection failed to initialize. Failed to obtain gyroscope.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20512b() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22487b6     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x003e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return
        L_0x0015:
            boolean r0 = r3.f22260j     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002d
            android.hardware.SensorManager r0 = r3.f22251a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002d
            android.hardware.Sensor r1 = r3.f22252b     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x002d
            r2 = 2
            r0.registerListener(r3, r1, r2)     // Catch:{ all -> 0x003e }
            r0 = 1
            r3.f22260j = r0     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "Listening for flick gestures."
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r0)     // Catch:{ all -> 0x003e }
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            android.hardware.SensorManager r0 = r3.f22251a
            if (r0 == 0) goto L_0x0038
            android.hardware.Sensor r0 = r3.f22252b
            if (r0 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            java.lang.String r0 = "Flick detection failed to initialize. Failed to obtain gyroscope."
            com.google.android.gms.internal.ads.ul0.m31862g(r0)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qv1.mo20512b():void");
    }

    /* renamed from: c */
    public final void mo20513c(pv1 pv1) {
        this.f22259i = pv1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22487b6)).booleanValue()) {
            long a = C2971s.m13198a().mo11988a();
            if (this.f22255e + ((long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22503d6)).intValue()) < a) {
                this.f22256f = 0;
                this.f22255e = a;
                this.f22257g = false;
                this.f22258h = false;
                this.f22253c = this.f22254d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f22254d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f22254d = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.f22253c;
            C5207iz izVar = C5503qz.f22495c6;
            if (floatValue > f + ((Float) C5054ev.m23225c().mo20153b(izVar)).floatValue()) {
                this.f22253c = this.f22254d.floatValue();
                this.f22258h = true;
            } else if (this.f22254d.floatValue() < this.f22253c - ((Float) C5054ev.m23225c().mo20153b(izVar)).floatValue()) {
                this.f22253c = this.f22254d.floatValue();
                this.f22257g = true;
            }
            if (this.f22254d.isInfinite()) {
                this.f22254d = Float.valueOf(0.0f);
                this.f22253c = 0.0f;
            }
            if (this.f22257g && this.f22258h) {
                C3018m1.m13388k("Flick detected.");
                this.f22255e = a;
                int i = this.f22256f + 1;
                this.f22256f = i;
                this.f22257g = false;
                this.f22258h = false;
                pv1 pv1 = this.f22259i;
                if (pv1 != null) {
                    if (i == ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22511e6)).intValue()) {
                        ew1 ew1 = (ew1) pv1;
                        ew1.mo17368g(new cw1(ew1), dw1.GESTURE);
                    }
                }
            }
        }
    }
}
