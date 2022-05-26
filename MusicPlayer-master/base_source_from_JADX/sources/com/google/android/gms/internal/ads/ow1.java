package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ow1 implements SensorEventListener {

    /* renamed from: a */
    private final Context f21213a;

    /* renamed from: b */
    private SensorManager f21214b;

    /* renamed from: c */
    private Sensor f21215c;

    /* renamed from: d */
    private long f21216d;

    /* renamed from: e */
    private int f21217e;

    /* renamed from: f */
    private nw1 f21218f;

    /* renamed from: g */
    private boolean f21219g;

    ow1(Context context) {
        this.f21213a = context;
    }

    /* renamed from: a */
    public final void mo20140a() {
        synchronized (this) {
            if (this.f21219g) {
                SensorManager sensorManager = this.f21214b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f21215c);
                    C3018m1.m13388k("Stopped listening for shake gestures.");
                }
                this.f21219g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20141b() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22450W5     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x006a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x0015:
            android.hardware.SensorManager r0 = r6.f21214b     // Catch:{ all -> 0x006a }
            r1 = 1
            if (r0 != 0) goto L_0x0035
            android.content.Context r0 = r6.f21213a     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x006a }
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch:{ all -> 0x006a }
            r6.f21214b = r0     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "Shake detection failed to initialize. Failed to obtain accelerometer."
            com.google.android.gms.internal.ads.ul0.m31862g(r0)     // Catch:{ all -> 0x006a }
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x002f:
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch:{ all -> 0x006a }
            r6.f21215c = r0     // Catch:{ all -> 0x006a }
        L_0x0035:
            boolean r0 = r6.f21219g     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0068
            android.hardware.SensorManager r0 = r6.f21214b     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0068
            android.hardware.Sensor r2 = r6.f21215c     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0068
            r3 = 2
            r0.registerListener(r6, r2, r3)     // Catch:{ all -> 0x006a }
            com.google.android.gms.common.util.d r0 = com.google.android.gms.ads.internal.C2971s.m13198a()     // Catch:{ all -> 0x006a }
            long r2 = r0.mo11988a()     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.iz<java.lang.Integer> r0 = com.google.android.gms.internal.ads.C5503qz.f22464Y5     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.oz r4 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r4.mo20153b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x006a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x006a }
            long r4 = (long) r0     // Catch:{ all -> 0x006a }
            long r2 = r2 - r4
            r6.f21216d = r2     // Catch:{ all -> 0x006a }
            r6.f21219g = r1     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "Listening for shake gestures."
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r0)     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ow1.mo20141b():void");
    }

    /* renamed from: c */
    public final void mo20142c(nw1 nw1) {
        this.f21218f = nw1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22450W5)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)))) >= ((Float) C5054ev.m23225c().mo20153b(C5503qz.f22457X5)).floatValue()) {
                long a = C2971s.m13198a().mo11988a();
                if (this.f21216d + ((long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22464Y5)).intValue()) <= a) {
                    if (this.f21216d + ((long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22471Z5)).intValue()) < a) {
                        this.f21217e = 0;
                    }
                    C3018m1.m13388k("Shake detected.");
                    this.f21216d = a;
                    int i = this.f21217e + 1;
                    this.f21217e = i;
                    nw1 nw1 = this.f21218f;
                    if (nw1 != null) {
                        if (i == ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22479a6)).intValue()) {
                            ew1 ew1 = (ew1) nw1;
                            ew1.mo17368g(new bw1(ew1), dw1.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
