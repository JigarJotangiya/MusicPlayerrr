package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class co0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, ao0 {

    /* renamed from: H */
    private static final float[] f15059H = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private final Object f15060A;

    /* renamed from: B */
    private EGL10 f15061B;

    /* renamed from: C */
    private EGLDisplay f15062C;

    /* renamed from: D */
    private EGLContext f15063D;

    /* renamed from: E */
    private EGLSurface f15064E;

    /* renamed from: F */
    private volatile boolean f15065F;

    /* renamed from: G */
    private volatile boolean f15066G;

    /* renamed from: g */
    private final bo0 f15067g;

    /* renamed from: h */
    private final float[] f15068h = new float[9];

    /* renamed from: i */
    private final float[] f15069i = new float[9];

    /* renamed from: j */
    private final float[] f15070j = new float[9];

    /* renamed from: k */
    private final float[] f15071k = new float[9];

    /* renamed from: l */
    private final float[] f15072l = new float[9];

    /* renamed from: m */
    private final float[] f15073m = new float[9];

    /* renamed from: n */
    private final float[] f15074n = new float[9];

    /* renamed from: o */
    private float f15075o = Float.NaN;

    /* renamed from: p */
    private float f15076p;

    /* renamed from: q */
    private float f15077q;

    /* renamed from: r */
    private int f15078r;

    /* renamed from: s */
    private int f15079s;

    /* renamed from: t */
    private SurfaceTexture f15080t;

    /* renamed from: u */
    private SurfaceTexture f15081u;

    /* renamed from: v */
    private int f15082v;

    /* renamed from: w */
    private int f15083w;

    /* renamed from: x */
    private int f15084x;

    /* renamed from: y */
    private final FloatBuffer f15085y;

    /* renamed from: z */
    private final CountDownLatch f15086z;

    public co0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f15059H;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15085y = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        bo0 bo0 = new bo0(context);
        this.f15067g = bo0;
        bo0.mo16330a(this);
        this.f15086z = new CountDownLatch(1);
        this.f15060A = new Object();
    }

    /* renamed from: g */
    private static final void m22000g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    /* renamed from: h */
    private static final void m22001h(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: i */
    private static final void m22002i(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: j */
    private static final void m22003j(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: k */
    private static final int m22004k(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m22000g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            m22000g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            m22000g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            m22000g("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                m22000g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    /* renamed from: a */
    public final SurfaceTexture mo16692a() {
        if (this.f15081u == null) {
            return null;
        }
        try {
            this.f15086z.await();
        } catch (InterruptedException unused) {
        }
        return this.f15080t;
    }

    /* renamed from: b */
    public final void mo16693b(int i, int i2) {
        synchronized (this.f15060A) {
            this.f15079s = i;
            this.f15078r = i2;
            this.f15065F = true;
            this.f15060A.notifyAll();
        }
    }

    /* renamed from: c */
    public final void mo16694c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f15079s = i;
        this.f15078r = i2;
        this.f15081u = surfaceTexture;
    }

    /* renamed from: d */
    public final void mo16695d() {
        synchronized (this.f15060A) {
            this.f15066G = true;
            this.f15081u = null;
            this.f15060A.notifyAll();
        }
    }

    /* renamed from: e */
    public final void mo16696e(float f, float f2) {
        int i = this.f15079s;
        int i2 = this.f15078r;
        float f3 = i > i2 ? (float) i : (float) i2;
        this.f15076p -= (f * 1.7453293f) / f3;
        float f4 = this.f15077q - ((f2 * 1.7453293f) / f3);
        this.f15077q = f4;
        if (f4 < -1.5707964f) {
            this.f15077q = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f15077q = 1.5707964f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo16697f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f15064E;
        boolean z = false;
        if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
            z = this.f15061B.eglDestroySurface(this.f15062C, this.f15064E) | this.f15061B.eglMakeCurrent(this.f15062C, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f15064E = null;
        }
        EGLContext eGLContext = this.f15063D;
        if (eGLContext != null) {
            z |= this.f15061B.eglDestroyContext(this.f15062C, eGLContext);
            this.f15063D = null;
        }
        EGLDisplay eGLDisplay = this.f15062C;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = this.f15061B.eglTerminate(eGLDisplay);
        this.f15062C = null;
        return eglTerminate | z;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f15084x++;
        synchronized (this.f15060A) {
            this.f15060A.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01bf A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.graphics.SurfaceTexture r0 = r15.f15081u
            if (r0 == 0) goto L_0x03a7
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r15.f15061B = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r15.f15062C = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x0020
        L_0x001d:
            r0 = 0
            goto L_0x0087
        L_0x0020:
            int[] r1 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r7 = r15.f15061B
            boolean r0 = r7.eglInitialize(r0, r1)
            if (r0 != 0) goto L_0x002b
            goto L_0x001d
        L_0x002b:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.f15061B
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f15062C
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 != 0) goto L_0x0045
        L_0x0043:
            r0 = r4
            goto L_0x004b
        L_0x0045:
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x0043
            r0 = r1[r6]
        L_0x004b:
            if (r0 != 0) goto L_0x004e
            goto L_0x001d
        L_0x004e:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.f15061B
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f15062C
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r15.f15063D = r1
            if (r1 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x0066
            goto L_0x001d
        L_0x0066:
            javax.microedition.khronos.egl.EGL10 r1 = r15.f15061B
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.f15062C
            android.graphics.SurfaceTexture r8 = r15.f15081u
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r15.f15064E = r0
            if (r0 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0079
            goto L_0x001d
        L_0x0079:
            javax.microedition.khronos.egl.EGL10 r1 = r15.f15061B
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.f15062C
            javax.microedition.khronos.egl.EGLContext r8 = r15.f15063D
            boolean r0 = r1.eglMakeCurrent(r7, r0, r0, r8)
            if (r0 != 0) goto L_0x0086
            goto L_0x001d
        L_0x0086:
            r0 = 1
        L_0x0087:
            com.google.android.gms.internal.ads.iz<java.lang.String> r1 = com.google.android.gms.internal.ads.C5503qz.f22382N0
            com.google.android.gms.internal.ads.oz r7 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r7 = r7.mo20153b(r1)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.mo18523l()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00a8
            com.google.android.gms.internal.ads.oz r7 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r1 = r7.mo20153b(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00aa:
            r7 = 35633(0x8b31, float:4.9932E-41)
            int r1 = m22004k(r7, r1)
            if (r1 != 0) goto L_0x00b6
        L_0x00b3:
            r8 = 0
            goto L_0x0138
        L_0x00b6:
            com.google.android.gms.internal.ads.iz<java.lang.String> r7 = com.google.android.gms.internal.ads.C5503qz.f22389O0
            com.google.android.gms.internal.ads.oz r8 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r8 = r8.mo20153b(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.mo18523l()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00d7
            com.google.android.gms.internal.ads.oz r8 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r7 = r8.mo20153b(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00d9
        L_0x00d7:
            java.lang.String r7 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00d9:
            r8 = 35632(0x8b30, float:4.9931E-41)
            int r7 = m22004k(r8, r7)
            if (r7 != 0) goto L_0x00e3
            goto L_0x00b3
        L_0x00e3:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            m22000g(r9)
            if (r8 == 0) goto L_0x0138
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            m22000g(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            m22000g(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            m22000g(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            m22000g(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x0130
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            android.util.Log.e(r1, r7)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            m22000g(r1)
            goto L_0x00b3
        L_0x0130:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            m22000g(r1)
        L_0x0138:
            r15.f15082v = r8
            android.opengl.GLES20.glUseProgram(r8)
            java.lang.String r1 = "useProgram"
            m22000g(r1)
            int r1 = r15.f15082v
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r15.f15085y
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            m22000g(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m22000g(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            m22000g(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            m22000g(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m22000g(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m22000g(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m22000g(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            m22000g(r7)
            int r7 = r15.f15082v
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r15.f15083w = r7
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r7, r5, r6, r8, r6)
            int r7 = r15.f15082v
            if (r0 == 0) goto L_0x036d
            if (r7 != 0) goto L_0x01c3
            goto L_0x036d
        L_0x01c3:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r15.f15080t = r0
            r0.setOnFrameAvailableListener(r15)
            java.util.concurrent.CountDownLatch r0 = r15.f15086z
            r0.countDown()
            com.google.android.gms.internal.ads.bo0 r0 = r15.f15067g
            r0.mo16331b()
            r15.f15065F = r5     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x01d9:
            boolean r0 = r15.f15066G     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 != 0) goto L_0x0318
        L_0x01dd:
            int r0 = r15.f15084x     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 <= 0) goto L_0x01ed
            android.graphics.SurfaceTexture r0 = r15.f15080t     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f15084x     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r0 + -1
            r15.f15084x = r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            goto L_0x01dd
        L_0x01ed:
            com.google.android.gms.internal.ads.bo0 r0 = r15.f15067g     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r1 = r15.f15068h     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            boolean r0 = r0.mo16333d(r1)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r1 = 5
            r7 = 4
            r8 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            if (r0 == 0) goto L_0x0267
            float r0 = r15.f15075o     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 == 0) goto L_0x025c
            float[] r0 = r15.f15068h     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r10 = 0
            r9[r6] = r10     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r5] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r9[r3] = r10     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r11 = r11 * r12
            r13 = r0[r5]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r14 = r9[r5]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r3]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r11 = r11 * r12
            r13 = r0[r7]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r1]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r12 = r12 * r14
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 + r8
            float r0 = -r0
            r15.f15075o = r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x025c:
            float[] r0 = r15.f15073m     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r15.f15075o     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r9 = r15.f15076p     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r8 + r9
            m22003j(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            goto L_0x0273
        L_0x0267:
            float[] r0 = r15.f15068h     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m22002i(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f15073m     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r15.f15076p     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m22003j(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x0273:
            float[] r0 = r15.f15069i     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            m22002i(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f15070j     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f15073m     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = r15.f15069i     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m22001h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f15071k     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f15068h     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = r15.f15070j     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m22001h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f15072l     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r15.f15077q     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m22002i(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f15074n     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f15072l     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = r15.f15071k     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m22001h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f15083w     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f15074n     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r0 = "drawArrays"
            m22000g(r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            javax.microedition.khronos.egl.EGL10 r0 = r15.f15061B     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.f15062C     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            javax.microedition.khronos.egl.EGLSurface r7 = r15.f15064E     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            boolean r0 = r15.f15065F     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 == 0) goto L_0x02fe
            int r0 = r15.f15079s     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r1 = r15.f15078r     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r0 = "viewport"
            m22000g(r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f15082v     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r1 = r15.f15082v     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r7 = r15.f15079s     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r8 = r15.f15078r     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x02f1
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f15078r     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 * r9
            int r7 = r15.f15079s     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            goto L_0x02fc
        L_0x02f1:
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r7 = r7 * r9
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x02fc:
            r15.f15065F = r6     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x02fe:
            java.lang.Object r0 = r15.f15060A     // Catch:{ InterruptedException -> 0x01d9 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x01d9 }
            boolean r1 = r15.f15066G     // Catch:{ all -> 0x0315 }
            if (r1 != 0) goto L_0x0312
            boolean r1 = r15.f15065F     // Catch:{ all -> 0x0315 }
            if (r1 != 0) goto L_0x0312
            int r1 = r15.f15084x     // Catch:{ all -> 0x0315 }
            if (r1 != 0) goto L_0x0312
            java.lang.Object r1 = r15.f15060A     // Catch:{ all -> 0x0315 }
            r1.wait()     // Catch:{ all -> 0x0315 }
        L_0x0312:
            monitor-exit(r0)     // Catch:{ all -> 0x0315 }
            goto L_0x01d9
        L_0x0315:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0315 }
            throw r1     // Catch:{ InterruptedException -> 0x01d9 }
        L_0x0318:
            com.google.android.gms.internal.ads.bo0 r0 = r15.f15067g
            r0.mo16332c()
            android.graphics.SurfaceTexture r0 = r15.f15080t
            r0.setOnFrameAvailableListener(r4)
            r15.f15080t = r4
            r15.mo16697f()
            return
        L_0x0328:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.ul0.m31860e(r1, r0)     // Catch:{ all -> 0x035c }
            com.google.android.gms.internal.ads.fl0 r1 = com.google.android.gms.ads.internal.C2971s.m13213p()     // Catch:{ all -> 0x035c }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo17571s(r0, r2)     // Catch:{ all -> 0x035c }
            com.google.android.gms.internal.ads.bo0 r0 = r15.f15067g
            r0.mo16332c()
            android.graphics.SurfaceTexture r0 = r15.f15080t
            r0.setOnFrameAvailableListener(r4)
            r15.f15080t = r4
            r15.mo16697f()
            return
        L_0x0347:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.ul0.m31862g(r0)     // Catch:{ all -> 0x035c }
            com.google.android.gms.internal.ads.bo0 r0 = r15.f15067g
            r0.mo16332c()
            android.graphics.SurfaceTexture r0 = r15.f15080t
            r0.setOnFrameAvailableListener(r4)
            r15.f15080t = r4
            r15.mo16697f()
            return
        L_0x035c:
            r0 = move-exception
            com.google.android.gms.internal.ads.bo0 r1 = r15.f15067g
            r1.mo16332c()
            android.graphics.SurfaceTexture r1 = r15.f15080t
            r1.setOnFrameAvailableListener(r4)
            r15.f15080t = r4
            r15.mo16697f()
            throw r0
        L_0x036d:
            javax.microedition.khronos.egl.EGL10 r0 = r15.f15061B
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "EGL initialization failed: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0388
            java.lang.String r0 = r1.concat(r0)
            goto L_0x038d
        L_0x0388:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x038d:
            com.google.android.gms.internal.ads.ul0.m31859d(r0)
            com.google.android.gms.internal.ads.fl0 r1 = com.google.android.gms.ads.internal.C2971s.m13213p()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo17571s(r2, r0)
            r15.mo16697f()
            java.util.concurrent.CountDownLatch r0 = r15.f15086z
            r0.countDown()
            return
        L_0x03a7:
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.ul0.m31859d(r0)
            java.util.concurrent.CountDownLatch r0 = r15.f15086z
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co0.run():void");
    }

    public final void zza() {
        synchronized (this.f15060A) {
            this.f15060A.notifyAll();
        }
    }
}
