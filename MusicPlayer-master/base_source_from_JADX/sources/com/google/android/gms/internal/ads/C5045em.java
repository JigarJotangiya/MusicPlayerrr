package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.em */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5045em extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: g */
    private final int[] f15998g = new int[1];

    /* renamed from: h */
    private Handler f15999h;

    /* renamed from: i */
    private SurfaceTexture f16000i;

    /* renamed from: j */
    private Error f16001j;

    /* renamed from: k */
    private RuntimeException f16002k;

    /* renamed from: l */
    private zzaxh f16003l;

    public C5045em() {
        super("dummySurface");
    }

    /* renamed from: a */
    public final zzaxh mo17213a(boolean z) {
        boolean z2;
        start();
        this.f15999h = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f15999h.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f16003l == null && this.f16002k == null && this.f16001j == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f16002k;
        if (runtimeException == null) {
            Error error = this.f16001j;
            if (error == null) {
                return this.f16003l;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo17214b() {
        this.f15999h.sendEmptyMessage(3);
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            try {
                boolean z = message2.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                C5304ll.m26777f(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                C5304ll.m26777f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                C5304ll.m26777f(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr2[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr2[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                C5304ll.m26777f(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                C5304ll.m26777f(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                C5304ll.m26777f(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f15998g, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f15998g[0]);
                this.f16000i = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f16003l = new zzaxh(this, this.f16000i, z, (C5083fm) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.f16002k = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f16001j = e2;
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
        } else if (i == 2) {
            this.f16000i.updateTexImage();
            return true;
        } else if (i != 3) {
            return true;
        } else {
            try {
                this.f16000i.release();
                this.f16003l = null;
                this.f16000i = null;
                GLES20.glDeleteTextures(1, this.f15998g, 0);
            } catch (Throwable th2) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th2);
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
            }
            quit();
            return true;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f15999h.sendEmptyMessage(2);
    }
}
