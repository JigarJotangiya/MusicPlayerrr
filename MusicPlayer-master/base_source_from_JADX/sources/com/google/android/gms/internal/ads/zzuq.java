package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzuq extends Surface {

    /* renamed from: j */
    private static int f27419j;

    /* renamed from: k */
    private static boolean f27420k;

    /* renamed from: g */
    public final boolean f27421g;

    /* renamed from: h */
    private final w64 f27422h;

    /* renamed from: i */
    private boolean f27423i;

    /* synthetic */ zzuq(w64 w64, SurfaceTexture surfaceTexture, boolean z, x64 x64) {
        super(surfaceTexture);
        this.f27422h = w64;
        this.f27421g = z;
    }

    /* renamed from: a */
    public static zzuq m34975a(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !m34976b(context)) {
            z2 = false;
        }
        gs1.m24488f(z2);
        w64 w64 = new w64();
        if (z) {
            i = f27419j;
        }
        return w64.mo21732a(i);
    }

    /* renamed from: b */
    public static synchronized boolean m34976b(Context context) {
        int i;
        synchronized (zzuq.class) {
            if (!f27420k) {
                int i2 = wy2.f25579a;
                int i3 = 2;
                if (i2 >= 24) {
                    if (i2 < 26) {
                        if (!"samsung".equals(wy2.f25581c)) {
                            if ("XT1650".equals(wy2.f25582d)) {
                            }
                        }
                    }
                    if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            if (i2 >= 17) {
                                String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                                if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                    i3 = 1;
                                }
                            }
                            f27419j = i3;
                            f27420k = true;
                        }
                    }
                }
                i3 = 0;
                f27419j = i3;
                f27420k = true;
            }
            i = f27419j;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.f27422h) {
            if (!this.f27423i) {
                this.f27422h.mo21733b();
                this.f27423i = true;
            }
        }
    }
}
