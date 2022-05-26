package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.un4seen.bass.BASS;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.core.widget.c */
/* compiled from: AutoScrollHelper */
public abstract class C0545c implements View.OnTouchListener {

    /* renamed from: x */
    private static final int f2786x = ViewConfiguration.getTapTimeout();

    /* renamed from: g */
    final C0546a f2787g = new C0546a();

    /* renamed from: h */
    private final Interpolator f2788h = new AccelerateInterpolator();

    /* renamed from: i */
    final View f2789i;

    /* renamed from: j */
    private Runnable f2790j;

    /* renamed from: k */
    private float[] f2791k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f2792l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m */
    private int f2793m;

    /* renamed from: n */
    private int f2794n;

    /* renamed from: o */
    private float[] f2795o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f2796p = {0.0f, 0.0f};

    /* renamed from: q */
    private float[] f2797q = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: r */
    private boolean f2798r;

    /* renamed from: s */
    boolean f2799s;

    /* renamed from: t */
    boolean f2800t;

    /* renamed from: u */
    boolean f2801u;

    /* renamed from: v */
    private boolean f2802v;

    /* renamed from: w */
    private boolean f2803w;

    /* renamed from: androidx.core.widget.c$a */
    /* compiled from: AutoScrollHelper */
    private static class C0546a {

        /* renamed from: a */
        private int f2804a;

        /* renamed from: b */
        private int f2805b;

        /* renamed from: c */
        private float f2806c;

        /* renamed from: d */
        private float f2807d;

        /* renamed from: e */
        private long f2808e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2809f = 0;

        /* renamed from: g */
        private int f2810g = 0;

        /* renamed from: h */
        private int f2811h = 0;

        /* renamed from: i */
        private long f2812i = -1;

        /* renamed from: j */
        private float f2813j;

        /* renamed from: k */
        private int f2814k;

        C0546a() {
        }

        /* renamed from: e */
        private float m3380e(long j) {
            long j2 = this.f2808e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f2812i;
            if (j3 < 0 || j < j3) {
                return C0545c.m3360n(((float) (j - j2)) / ((float) this.f2804a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f2813j;
            return (1.0f - f) + (f * C0545c.m3360n(((float) (j - j3)) / ((float) this.f2814k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m3381g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo3447a() {
            if (this.f2809f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m3381g(m3380e(currentAnimationTimeMillis));
                this.f2809f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f2809f)) * g;
                this.f2810g = (int) (this.f2806c * f);
                this.f2811h = (int) (f * this.f2807d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo3448b() {
            return this.f2810g;
        }

        /* renamed from: c */
        public int mo3449c() {
            return this.f2811h;
        }

        /* renamed from: d */
        public int mo3450d() {
            float f = this.f2806c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo3451f() {
            float f = this.f2807d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo3452h() {
            return this.f2812i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2812i + ((long) this.f2814k);
        }

        /* renamed from: i */
        public void mo3453i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2814k = C0545c.m3361o((int) (currentAnimationTimeMillis - this.f2808e), 0, this.f2805b);
            this.f2813j = m3380e(currentAnimationTimeMillis);
            this.f2812i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo3454j(int i) {
            this.f2805b = i;
        }

        /* renamed from: k */
        public void mo3455k(int i) {
            this.f2804a = i;
        }

        /* renamed from: l */
        public void mo3456l(float f, float f2) {
            this.f2806c = f;
            this.f2807d = f2;
        }

        /* renamed from: m */
        public void mo3457m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2808e = currentAnimationTimeMillis;
            this.f2812i = -1;
            this.f2809f = currentAnimationTimeMillis;
            this.f2813j = 0.5f;
            this.f2810g = 0;
            this.f2811h = 0;
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    /* compiled from: AutoScrollHelper */
    private class C0547b implements Runnable {
        C0547b() {
        }

        public void run() {
            C0545c cVar = C0545c.this;
            if (cVar.f2801u) {
                if (cVar.f2799s) {
                    cVar.f2799s = false;
                    cVar.f2787g.mo3457m();
                }
                C0546a aVar = C0545c.this.f2787g;
                if (aVar.mo3452h() || !C0545c.this.mo3434D()) {
                    C0545c.this.f2801u = false;
                    return;
                }
                C0545c cVar2 = C0545c.this;
                if (cVar2.f2800t) {
                    cVar2.f2800t = false;
                    cVar2.mo3437d();
                }
                aVar.mo3447a();
                C0545c.this.mo3439s(aVar.mo3448b(), aVar.mo3449c());
                C3774v.m16201g0(C0545c.this.f2789i, this);
            }
        }
    }

    public C0545c(View view) {
        this.f2789i = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo3444x(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo3445y(f3, f3);
        mo3441u(1);
        mo3443w(Float.MAX_VALUE, Float.MAX_VALUE);
        mo3432B(0.2f, 0.2f);
        mo3433C(1.0f, 1.0f);
        mo3440t(f2786x);
        mo3431A(BASS.BASS_ERROR_JAVA_CLASS);
        mo3446z(BASS.BASS_ERROR_JAVA_CLASS);
    }

    /* renamed from: E */
    private void m3358E() {
        int i;
        if (this.f2790j == null) {
            this.f2790j = new C0547b();
        }
        this.f2801u = true;
        this.f2799s = true;
        if (this.f2798r || (i = this.f2794n) <= 0) {
            this.f2790j.run();
        } else {
            C3774v.m16203h0(this.f2789i, this.f2790j, (long) i);
        }
        this.f2798r = true;
    }

    /* renamed from: f */
    private float m3359f(int i, float f, float f2, float f3) {
        float q = m3363q(this.f2791k[i], f2, this.f2792l[i], f);
        int i2 = (q > 0.0f ? 1 : (q == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f2795o[i];
        float f5 = this.f2796p[i];
        float f6 = this.f2797q[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m3360n(q * f7, f5, f6);
        }
        return -m3360n((-q) * f7, f5, f6);
    }

    /* renamed from: n */
    static float m3360n(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: o */
    static int m3361o(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: p */
    private float m3362p(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2793m;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f2801u || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: q */
    private float m3363q(float f, float f2, float f3, float f4) {
        float f5;
        float n = m3360n(f * f2, 0.0f, f3);
        float p = m3362p(f2 - f4, n) - m3362p(f4, n);
        if (p < 0.0f) {
            f5 = -this.f2788h.getInterpolation(-p);
        } else if (p <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2788h.getInterpolation(p);
        }
        return m3360n(f5, -1.0f, 1.0f);
    }

    /* renamed from: r */
    private void m3364r() {
        if (this.f2799s) {
            this.f2801u = false;
        } else {
            this.f2787g.mo3453i();
        }
    }

    /* renamed from: A */
    public C0545c mo3431A(int i) {
        this.f2787g.mo3455k(i);
        return this;
    }

    /* renamed from: B */
    public C0545c mo3432B(float f, float f2) {
        float[] fArr = this.f2791k;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: C */
    public C0545c mo3433C(float f, float f2) {
        float[] fArr = this.f2795o;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo3434D() {
        C0546a aVar = this.f2787g;
        int f = aVar.mo3451f();
        int d = aVar.mo3450d();
        return (f != 0 && mo3436b(f)) || (d != 0 && mo3435a(d));
    }

    /* renamed from: a */
    public abstract boolean mo3435a(int i);

    /* renamed from: b */
    public abstract boolean mo3436b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3437d() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2789i.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2802v
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m3364r()
            goto L_0x0058
        L_0x001a:
            r5.f2800t = r2
            r5.f2798r = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2789i
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m3359f(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2789i
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m3359f(r2, r7, r6, r3)
            androidx.core.widget.c$a r7 = r5.f2787g
            r7.mo3456l(r0, r6)
            boolean r6 = r5.f2801u
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo3434D()
            if (r6 == 0) goto L_0x0058
            r5.m3358E()
        L_0x0058:
            boolean r6 = r5.f2803w
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2801u
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0545c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: s */
    public abstract void mo3439s(int i, int i2);

    /* renamed from: t */
    public C0545c mo3440t(int i) {
        this.f2794n = i;
        return this;
    }

    /* renamed from: u */
    public C0545c mo3441u(int i) {
        this.f2793m = i;
        return this;
    }

    /* renamed from: v */
    public C0545c mo3442v(boolean z) {
        if (this.f2802v && !z) {
            m3364r();
        }
        this.f2802v = z;
        return this;
    }

    /* renamed from: w */
    public C0545c mo3443w(float f, float f2) {
        float[] fArr = this.f2792l;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: x */
    public C0545c mo3444x(float f, float f2) {
        float[] fArr = this.f2797q;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: y */
    public C0545c mo3445y(float f, float f2) {
        float[] fArr = this.f2796p;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: z */
    public C0545c mo3446z(int i) {
        this.f2787g.mo3454j(i);
        return this;
    }
}
