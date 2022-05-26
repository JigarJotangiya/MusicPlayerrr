package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bo0 implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f14576a;

    /* renamed from: b */
    private final Object f14577b = new Object();

    /* renamed from: c */
    private final Display f14578c;

    /* renamed from: d */
    private final float[] f14579d = new float[9];

    /* renamed from: e */
    private final float[] f14580e = new float[9];

    /* renamed from: f */
    private float[] f14581f;

    /* renamed from: g */
    private Handler f14582g;

    /* renamed from: h */
    private ao0 f14583h;

    bo0(Context context) {
        this.f14576a = (SensorManager) context.getSystemService("sensor");
        this.f14578c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16330a(ao0 ao0) {
        this.f14583h = ao0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo16331b() {
        if (this.f14582g == null) {
            Sensor defaultSensor = this.f14576a.getDefaultSensor(11);
            if (defaultSensor == null) {
                ul0.m31859d("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            w03 w03 = new w03(handlerThread.getLooper());
            this.f14582g = w03;
            if (!this.f14576a.registerListener(this, defaultSensor, 0, w03)) {
                ul0.m31859d("SensorManager.registerListener failed.");
                mo16332c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo16332c() {
        if (this.f14582g != null) {
            this.f14576a.unregisterListener(this);
            this.f14582g.post(new zn0(this));
            this.f14582g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo16333d(float[] fArr) {
        synchronized (this.f14577b) {
            float[] fArr2 = this.f14581f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f14577b) {
                if (this.f14581f == null) {
                    this.f14581f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f14579d, fArr);
            int rotation = this.f14578c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f14579d, 2, 129, this.f14580e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f14579d, 129, 130, this.f14580e);
            } else if (rotation != 3) {
                System.arraycopy(this.f14579d, 0, this.f14580e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f14579d, 130, 1, this.f14580e);
            }
            float[] fArr2 = this.f14580e;
            float f = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f;
            float f2 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f2;
            float f3 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f3;
            synchronized (this.f14577b) {
                System.arraycopy(this.f14580e, 0, this.f14581f, 0, 9);
            }
            ao0 ao0 = this.f14583h;
            if (ao0 != null) {
                ao0.zza();
            }
        }
    }
}
