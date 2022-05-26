package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p02 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: m */
    private static final int[] f21267m = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: g */
    private final Handler f21268g;

    /* renamed from: h */
    private final int[] f21269h = new int[1];

    /* renamed from: i */
    private EGLDisplay f21270i;

    /* renamed from: j */
    private EGLContext f21271j;

    /* renamed from: k */
    private EGLSurface f21272k;

    /* renamed from: l */
    private SurfaceTexture f21273l;

    public p02(Handler handler, oz1 oz1) {
        this.f21268g = handler;
    }

    /* renamed from: a */
    public final SurfaceTexture mo20168a() {
        SurfaceTexture surfaceTexture = this.f21273l;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    /* renamed from: b */
    public final void mo20169b(int i) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        String str;
        String str2;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                this.f21270i = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f21267m, 0, eGLConfigArr, 0, 1, iArr3, 0);
                if (!eglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    throw new ny1(wy2.m33438d("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]), (mx1) null);
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f21270i, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                if (eglCreateContext != null) {
                    this.f21271j = eglCreateContext;
                    EGLDisplay eGLDisplay = this.f21270i;
                    if (i == 1) {
                        eGLSurface = EGL14.EGL_NO_SURFACE;
                    } else {
                        if (i == 2) {
                            iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                        } else {
                            iArr = new int[]{12375, 1, 12374, 1, 12344};
                        }
                        eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
                        if (eGLSurface == null) {
                            throw new ny1("eglCreatePbufferSurface failed", (mx1) null);
                        }
                    }
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                        this.f21272k = eGLSurface;
                        GLES20.glGenTextures(1, this.f21269h, 0);
                        int i2 = 0;
                        while (true) {
                            int glGetError = GLES20.glGetError();
                            if (glGetError == 0) {
                                break;
                            }
                            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                            if (valueOf.length() != 0) {
                                str2 = "glError ".concat(valueOf);
                            } else {
                                str2 = new String("glError ");
                            }
                            Log.e("GlUtil", str2);
                            i2 = glGetError;
                        }
                        if (i2 != 0) {
                            String valueOf2 = String.valueOf(GLU.gluErrorString(i2));
                            if (valueOf2.length() != 0) {
                                str = "glError ".concat(valueOf2);
                            } else {
                                str = new String("glError ");
                            }
                            Log.e("GlUtil", str);
                        }
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f21269h[0]);
                        this.f21273l = surfaceTexture;
                        surfaceTexture.setOnFrameAvailableListener(this);
                        return;
                    }
                    throw new ny1("eglMakeCurrent failed", (mx1) null);
                }
                throw new ny1("eglCreateContext failed", (mx1) null);
            }
            throw new ny1("eglInitialize failed", (mx1) null);
        }
        throw new ny1("eglGetDisplay failed", (mx1) null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo20170c() {
        this.f21268g.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f21273l;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f21269h, 0);
            }
            EGLDisplay eGLDisplay = this.f21270i;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f21270i;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f21272k;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f21270i, this.f21272k);
            }
            EGLContext eGLContext = this.f21271j;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f21270i, eGLContext);
            }
            if (wy2.f25579a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f21270i;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f21270i);
            }
            this.f21270i = null;
            this.f21271j = null;
            this.f21272k = null;
            this.f21273l = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f21270i;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f21270i;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f21272k;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f21270i, this.f21272k);
            }
            EGLContext eGLContext2 = this.f21271j;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f21270i, eGLContext2);
            }
            if (wy2.f25579a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f21270i;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f21270i);
            }
            this.f21270i = null;
            this.f21271j = null;
            this.f21272k = null;
            this.f21273l = null;
            throw th;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f21268g.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f21273l;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
