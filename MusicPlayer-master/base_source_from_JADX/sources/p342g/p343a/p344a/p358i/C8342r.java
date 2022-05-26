package p342g.p343a.p344a.p358i;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import coocent.music.player.base.BaseApplication;
import p342g.p343a.p344a.p346c.C7965r;

/* renamed from: g.a.a.i.r */
/* compiled from: SensorManagerUtils */
public class C8342r implements SensorEventListener {

    /* renamed from: g */
    private static C8342r f34779g;

    /* renamed from: a */
    private SensorManager f34780a;

    /* renamed from: b */
    private double f34781b;

    /* renamed from: c */
    private double f34782c;

    /* renamed from: d */
    private double f34783d;

    /* renamed from: e */
    private long f34784e;

    /* renamed from: f */
    private C7965r f34785f;

    private C8342r() {
    }

    /* renamed from: b */
    public static synchronized C8342r m46289b() {
        C8342r rVar;
        synchronized (C8342r.class) {
            if (f34779g == null) {
                f34779g = new C8342r();
            }
            rVar = f34779g;
        }
        return rVar;
    }

    /* renamed from: a */
    public void mo30287a() {
        try {
            SensorManager sensorManager = this.f34780a;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
                this.f34780a = null;
                f34779g = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo30288c(Context context, C7965r rVar) {
        if (this.f34780a == null) {
            this.f34780a = (SensorManager) context.getSystemService("sensor");
        }
        this.f34785f = rVar;
        this.f34781b = 9.806650161743164d;
        this.f34782c = 0.0d;
        this.f34783d = (double) BaseApplication.f31155s;
        SensorManager sensorManager = this.f34780a;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 2);
    }

    /* renamed from: d */
    public void mo30289d(float f) {
        this.f34783d = (double) f;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        C7965r rVar;
        float[] fArr = sensorEvent.values;
        double d = (double) fArr[0];
        double d2 = (double) fArr[1];
        double d3 = (double) fArr[2];
        double sqrt = Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
        double d4 = sqrt - this.f34781b;
        this.f34781b = sqrt;
        double d5 = (this.f34782c * 0.8999999761581421d) + d4;
        this.f34782c = d5;
        if (d5 > this.f34783d) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f34784e > 1000) {
                this.f34784e = elapsedRealtime;
                if (C8345u.m46327h() != null && (rVar = this.f34785f) != null) {
                    rVar.mo27110g();
                }
            }
        }
    }
}
