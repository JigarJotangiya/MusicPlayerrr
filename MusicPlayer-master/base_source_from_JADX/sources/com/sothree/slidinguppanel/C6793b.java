package com.sothree.slidinguppanel;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.widget.C0555k;
import java.util.Arrays;
import p082e.p109h.p119p.C3762j;
import p082e.p109h.p119p.C3773u;

/* renamed from: com.sothree.slidinguppanel.b */
/* compiled from: ViewDragHelper */
public class C6793b {

    /* renamed from: w */
    private static final Interpolator f30324w = new C6794a();

    /* renamed from: a */
    private int f30325a;

    /* renamed from: b */
    private int f30326b;

    /* renamed from: c */
    private int f30327c = -1;

    /* renamed from: d */
    private float[] f30328d;

    /* renamed from: e */
    private float[] f30329e;

    /* renamed from: f */
    private float[] f30330f;

    /* renamed from: g */
    private float[] f30331g;

    /* renamed from: h */
    private int[] f30332h;

    /* renamed from: i */
    private int[] f30333i;

    /* renamed from: j */
    private int[] f30334j;

    /* renamed from: k */
    private int f30335k;

    /* renamed from: l */
    private VelocityTracker f30336l;

    /* renamed from: m */
    private float f30337m;

    /* renamed from: n */
    private float f30338n;

    /* renamed from: o */
    private int f30339o;

    /* renamed from: p */
    private int f30340p;

    /* renamed from: q */
    private C0555k f30341q;

    /* renamed from: r */
    private final C6796c f30342r;

    /* renamed from: s */
    private View f30343s;

    /* renamed from: t */
    private boolean f30344t;

    /* renamed from: u */
    private final ViewGroup f30345u;

    /* renamed from: v */
    private final Runnable f30346v = new C6795b();

    /* renamed from: com.sothree.slidinguppanel.b$a */
    /* compiled from: ViewDragHelper */
    static class C6794a implements Interpolator {
        C6794a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: com.sothree.slidinguppanel.b$b */
    /* compiled from: ViewDragHelper */
    class C6795b implements Runnable {
        C6795b() {
        }

        public void run() {
            C6793b.this.mo26420F(0);
        }
    }

    /* renamed from: com.sothree.slidinguppanel.b$c */
    /* compiled from: ViewDragHelper */
    public static abstract class C6796c {
        /* renamed from: a */
        public int mo26438a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo26409b(View view, int i, int i2);

        /* renamed from: c */
        public int mo26439c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo26440d(View view) {
            return 0;
        }

        /* renamed from: e */
        public abstract int mo26410e(View view);

        /* renamed from: f */
        public void mo26441f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo26442g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo26443h(int i, int i2) {
        }

        /* renamed from: i */
        public abstract void mo26411i(View view, int i);

        /* renamed from: j */
        public abstract void mo26412j(int i);

        /* renamed from: k */
        public abstract void mo26413k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo26414l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo26415m(View view, int i);
    }

    private C6793b(Context context, ViewGroup viewGroup, Interpolator interpolator, C6796c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f30345u = viewGroup;
            this.f30342r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f30339o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f30326b = viewConfiguration.getScaledTouchSlop();
            this.f30337m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f30338n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f30341q = C0555k.m3410c(context, interpolator == null ? f30324w : interpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: B */
    private void m38705B() {
        this.f30336l.computeCurrentVelocity(1000, this.f30337m);
        m38719o(m38711f(C3773u.m16147a(this.f30336l, this.f30327c), this.f30338n, this.f30337m), m38711f(C3773u.m16148b(this.f30336l, this.f30327c), this.f30338n, this.f30337m));
    }

    /* renamed from: C */
    private void m38706C(float f, float f2, int i) {
        int i2 = 1;
        if (!m38709d(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m38709d(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m38709d(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m38709d(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f30333i;
            iArr[i] = iArr[i] | i2;
            this.f30342r.mo26441f(i2, i);
        }
    }

    /* renamed from: D */
    private void m38707D(float f, float f2, int i) {
        m38722r(i);
        float[] fArr = this.f30328d;
        this.f30330f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f30329e;
        this.f30331g[i] = f2;
        fArr2[i] = f2;
        this.f30332h[i] = m38724u((int) f, (int) f2);
        this.f30335k |= 1 << i;
    }

    /* renamed from: E */
    private void m38708E(MotionEvent motionEvent) {
        float[] fArr;
        int d = C3762j.m16108d(motionEvent);
        for (int i = 0; i < d; i++) {
            int e = C3762j.m16109e(motionEvent, i);
            float f = C3762j.m16110f(motionEvent, i);
            float g = C3762j.m16111g(motionEvent, i);
            float[] fArr2 = this.f30330f;
            if (fArr2 != null && (fArr = this.f30331g) != null && fArr2.length > e && fArr.length > e) {
                fArr2[e] = f;
                fArr[e] = g;
            }
        }
    }

    /* renamed from: d */
    private boolean m38709d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f30332h[i] & i2) != i2 || (this.f30340p & i2) == 0 || (this.f30334j[i] & i2) == i2 || (this.f30333i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f30326b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f30342r.mo26442g(i2)) {
            int[] iArr = this.f30334j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f30333i[i] & i2) != 0 || abs <= ((float) this.f30326b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    private boolean m38710e(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f30342r.mo26440d(view) > 0;
        boolean z2 = this.f30342r.mo26410e(view) > 0;
        if (z && z2) {
            int i = this.f30326b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f30326b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f30326b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    private float m38711f(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* renamed from: g */
    private int m38712g(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* renamed from: h */
    private void m38713h() {
        float[] fArr = this.f30328d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f30329e, 0.0f);
            Arrays.fill(this.f30330f, 0.0f);
            Arrays.fill(this.f30331g, 0.0f);
            Arrays.fill(this.f30332h, 0);
            Arrays.fill(this.f30333i, 0);
            Arrays.fill(this.f30334j, 0);
            this.f30335k = 0;
        }
    }

    /* renamed from: i */
    private void m38714i(int i) {
        float[] fArr = this.f30328d;
        if (fArr != null && fArr.length > i) {
            fArr[i] = 0.0f;
            this.f30329e[i] = 0.0f;
            this.f30330f[i] = 0.0f;
            this.f30331g[i] = 0.0f;
            this.f30332h[i] = 0;
            this.f30333i[i] = 0;
            this.f30334j[i] = 0;
            this.f30335k = (~(1 << i)) & this.f30335k;
        }
    }

    /* renamed from: j */
    private int m38715j(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f30345u.getWidth();
        float f = (float) (width / 2);
        float p = f + (m38720p(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(p / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: k */
    private int m38716k(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int g = m38712g(i3, (int) this.f30338n, (int) this.f30337m);
        int g2 = m38712g(i4, (int) this.f30338n, (int) this.f30337m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(g);
        int abs4 = Math.abs(g2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (g != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (g2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m38715j(i, g, this.f30342r.mo26440d(view))) * f5) + (((float) m38715j(i2, g2, this.f30342r.mo26410e(view))) * f6));
    }

    /* renamed from: m */
    public static C6793b m38717m(ViewGroup viewGroup, float f, Interpolator interpolator, C6796c cVar) {
        C6793b n = m38718n(viewGroup, interpolator, cVar);
        n.f30326b = (int) (((float) n.f30326b) * (1.0f / f));
        return n;
    }

    /* renamed from: n */
    public static C6793b m38718n(ViewGroup viewGroup, Interpolator interpolator, C6796c cVar) {
        return new C6793b(viewGroup.getContext(), viewGroup, interpolator, cVar);
    }

    /* renamed from: o */
    private void m38719o(float f, float f2) {
        this.f30344t = true;
        this.f30342r.mo26414l(this.f30343s, f, f2);
        this.f30344t = false;
        if (this.f30325a == 1) {
            mo26420F(0);
        }
    }

    /* renamed from: p */
    private float m38720p(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* renamed from: q */
    private void m38721q(int i, int i2, int i3, int i4) {
        int left = this.f30343s.getLeft();
        int top = this.f30343s.getTop();
        if (i3 != 0) {
            i = this.f30342r.mo26438a(this.f30343s, i, i3);
            this.f30343s.offsetLeftAndRight(i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f30342r.mo26409b(this.f30343s, i2, i4);
            this.f30343s.offsetTopAndBottom(i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f30342r.mo26413k(this.f30343s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: r */
    private void m38722r(int i) {
        float[] fArr = this.f30328d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f30329e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f30330f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f30331g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f30332h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f30333i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f30334j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f30328d = fArr2;
            this.f30329e = fArr3;
            this.f30330f = fArr4;
            this.f30331g = fArr5;
            this.f30332h = iArr;
            this.f30333i = iArr2;
            this.f30334j = iArr3;
        }
    }

    /* renamed from: t */
    private boolean m38723t(int i, int i2, int i3, int i4) {
        int left = this.f30343s.getLeft();
        int top = this.f30343s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f30341q.mo3459a();
            mo26420F(0);
            return false;
        }
        this.f30341q.mo3466i(left, top, i5, i6, m38716k(this.f30343s, i5, i6, i3, i4));
        mo26420F(2);
        return true;
    }

    /* renamed from: u */
    private int m38724u(int i, int i2) {
        int i3 = i < this.f30345u.getLeft() + this.f30339o ? 1 : 0;
        if (i2 < this.f30345u.getTop() + this.f30339o) {
            i3 |= 4;
        }
        if (i > this.f30345u.getRight() - this.f30339o) {
            i3 |= 2;
        }
        return i2 > this.f30345u.getBottom() - this.f30339o ? i3 | 8 : i3;
    }

    /* renamed from: A */
    public void mo26419A(MotionEvent motionEvent) {
        int i;
        int c = C3762j.m16107c(motionEvent);
        int b = C3762j.m16106b(motionEvent);
        if (c == 0) {
            mo26427b();
        }
        if (this.f30336l == null) {
            this.f30336l = VelocityTracker.obtain();
        }
        this.f30336l.addMovement(motionEvent);
        int i2 = 0;
        if (c == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int e = C3762j.m16109e(motionEvent, 0);
            View s = mo26430s((int) x, (int) y);
            m38707D(x, y, e);
            mo26425K(s, e);
            int i3 = this.f30332h[e];
            int i4 = this.f30340p;
            if ((i3 & i4) != 0) {
                this.f30342r.mo26443h(i3 & i4, e);
            }
        } else if (c == 1) {
            if (this.f30325a == 1) {
                m38705B();
            }
            mo26427b();
        } else if (c != 2) {
            if (c == 3) {
                if (this.f30325a == 1) {
                    m38719o(0.0f, 0.0f);
                }
                mo26427b();
            } else if (c == 5) {
                int e2 = C3762j.m16109e(motionEvent, b);
                float f = C3762j.m16110f(motionEvent, b);
                float g = C3762j.m16111g(motionEvent, b);
                m38707D(f, g, e2);
                if (this.f30325a == 0) {
                    mo26425K(mo26430s((int) f, (int) g), e2);
                    int i5 = this.f30332h[e2];
                    int i6 = this.f30340p;
                    if ((i5 & i6) != 0) {
                        this.f30342r.mo26443h(i5 & i6, e2);
                    }
                } else if (mo26433x((int) f, (int) g)) {
                    mo26425K(this.f30343s, e2);
                }
            } else if (c == 6) {
                int e3 = C3762j.m16109e(motionEvent, b);
                if (this.f30325a == 1 && e3 == this.f30327c) {
                    int d = C3762j.m16108d(motionEvent);
                    while (true) {
                        if (i2 >= d) {
                            i = -1;
                            break;
                        }
                        int e4 = C3762j.m16109e(motionEvent, i2);
                        if (e4 != this.f30327c) {
                            View s2 = mo26430s((int) C3762j.m16110f(motionEvent, i2), (int) C3762j.m16111g(motionEvent, i2));
                            View view = this.f30343s;
                            if (s2 == view && mo26425K(view, e4)) {
                                i = this.f30327c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m38705B();
                    }
                }
                m38714i(e3);
            }
        } else if (this.f30325a == 1) {
            int a = C3762j.m16105a(motionEvent, this.f30327c);
            float f2 = C3762j.m16110f(motionEvent, a);
            float g2 = C3762j.m16111g(motionEvent, a);
            float[] fArr = this.f30330f;
            int i7 = this.f30327c;
            int i8 = (int) (f2 - fArr[i7]);
            int i9 = (int) (g2 - this.f30331g[i7]);
            m38721q(this.f30343s.getLeft() + i8, this.f30343s.getTop() + i9, i8, i9);
            m38708E(motionEvent);
        } else {
            int d2 = C3762j.m16108d(motionEvent);
            while (i2 < d2) {
                int e5 = C3762j.m16109e(motionEvent, i2);
                float f3 = C3762j.m16110f(motionEvent, i2);
                float g3 = C3762j.m16111g(motionEvent, i2);
                float f4 = f3 - this.f30328d[e5];
                float f5 = g3 - this.f30329e[e5];
                m38706C(f4, f5, e5);
                if (this.f30325a != 1) {
                    View s3 = mo26430s((int) this.f30328d[e5], (int) this.f30329e[e5]);
                    if (m38710e(s3, f4, f5) && mo26425K(s3, e5)) {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            m38708E(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo26420F(int i) {
        if (this.f30325a != i) {
            this.f30325a = i;
            this.f30342r.mo26412j(i);
            if (this.f30325a == 0) {
                this.f30343s = null;
            }
        }
    }

    /* renamed from: G */
    public void mo26421G(float f) {
        this.f30338n = f;
    }

    /* renamed from: H */
    public boolean mo26422H(int i, int i2) {
        if (this.f30344t) {
            return m38723t(i, i2, (int) C3773u.m16147a(this.f30336l, this.f30327c), (int) C3773u.m16148b(this.f30336l, this.f30327c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: I */
    public boolean mo26423I(MotionEvent motionEvent) {
        View s;
        int c = C3762j.m16107c(motionEvent);
        int b = C3762j.m16106b(motionEvent);
        if (c == 0) {
            mo26427b();
        }
        if (this.f30336l == null) {
            this.f30336l = VelocityTracker.obtain();
        }
        this.f30336l.addMovement(motionEvent);
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    int d = C3762j.m16108d(motionEvent);
                    for (int i = 0; i < d && this.f30328d != null && this.f30329e != null; i++) {
                        int e = C3762j.m16109e(motionEvent, i);
                        if (e < this.f30328d.length && e < this.f30329e.length) {
                            float f = C3762j.m16110f(motionEvent, i);
                            float g = C3762j.m16111g(motionEvent, i);
                            float f2 = f - this.f30328d[e];
                            float f3 = g - this.f30329e[e];
                            m38706C(f2, f3, e);
                            if (this.f30325a == 1) {
                                break;
                            }
                            View s2 = mo26430s((int) this.f30328d[e], (int) this.f30329e[e]);
                            if (s2 != null && m38710e(s2, f2, f3) && mo26425K(s2, e)) {
                                break;
                            }
                        }
                    }
                    m38708E(motionEvent);
                } else if (c != 3) {
                    if (c == 5) {
                        int e2 = C3762j.m16109e(motionEvent, b);
                        float f4 = C3762j.m16110f(motionEvent, b);
                        float g2 = C3762j.m16111g(motionEvent, b);
                        m38707D(f4, g2, e2);
                        int i2 = this.f30325a;
                        if (i2 == 0) {
                            int i3 = this.f30332h[e2];
                            int i4 = this.f30340p;
                            if ((i3 & i4) != 0) {
                                this.f30342r.mo26443h(i3 & i4, e2);
                            }
                        } else if (i2 == 2 && (s = mo26430s((int) f4, (int) g2)) == this.f30343s) {
                            mo26425K(s, e2);
                        }
                    } else if (c == 6) {
                        m38714i(C3762j.m16109e(motionEvent, b));
                    }
                }
            }
            mo26427b();
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int e3 = C3762j.m16109e(motionEvent, 0);
            m38707D(x, y, e3);
            View s3 = mo26430s((int) x, (int) y);
            if (s3 == this.f30343s && this.f30325a == 2) {
                mo26425K(s3, e3);
            }
            int i5 = this.f30332h[e3];
            int i6 = this.f30340p;
            if ((i5 & i6) != 0) {
                this.f30342r.mo26443h(i5 & i6, e3);
            }
        }
        if (this.f30325a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public boolean mo26424J(View view, int i, int i2) {
        this.f30343s = view;
        this.f30327c = -1;
        return m38723t(i, i2, 0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo26425K(View view, int i) {
        if (view == this.f30343s && this.f30327c == i) {
            return true;
        }
        if (view == null || !this.f30342r.mo26415m(view, i)) {
            return false;
        }
        this.f30327c = i;
        mo26428c(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo26426a() {
        mo26427b();
        if (this.f30325a == 2) {
            int d = this.f30341q.mo3461d();
            int e = this.f30341q.mo3462e();
            this.f30341q.mo3459a();
            int d2 = this.f30341q.mo3461d();
            int e2 = this.f30341q.mo3462e();
            this.f30342r.mo26413k(this.f30343s, d2, e2, d2 - d, e2 - e);
        }
        mo26420F(0);
    }

    /* renamed from: b */
    public void mo26427b() {
        this.f30327c = -1;
        m38713h();
        VelocityTracker velocityTracker = this.f30336l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f30336l = null;
        }
    }

    /* renamed from: c */
    public void mo26428c(View view, int i) {
        if (view.getParent() == this.f30345u) {
            this.f30343s = view;
            this.f30327c = i;
            this.f30342r.mo26411i(view, i);
            mo26420F(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f30345u + ")");
    }

    /* renamed from: l */
    public boolean mo26429l(boolean z) {
        if (this.f30343s == null) {
            return false;
        }
        if (this.f30325a == 2) {
            boolean b = this.f30341q.mo3460b();
            int d = this.f30341q.mo3461d();
            int e = this.f30341q.mo3462e();
            int left = d - this.f30343s.getLeft();
            int top = e - this.f30343s.getTop();
            if (b || top == 0) {
                if (left != 0) {
                    this.f30343s.offsetLeftAndRight(left);
                }
                if (top != 0) {
                    this.f30343s.offsetTopAndBottom(top);
                }
                if (!(left == 0 && top == 0)) {
                    this.f30342r.mo26413k(this.f30343s, d, e, left, top);
                }
                if (b && d == this.f30341q.mo3463f() && e == this.f30341q.mo3464g()) {
                    this.f30341q.mo3459a();
                    b = this.f30341q.mo3465h();
                }
                if (!b) {
                    if (z) {
                        this.f30345u.post(this.f30346v);
                    } else {
                        mo26420F(0);
                    }
                }
            } else {
                this.f30343s.setTop(0);
                return true;
            }
        }
        if (this.f30325a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public View mo26430s(int i, int i2) {
        for (int childCount = this.f30345u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f30345u;
            this.f30342r.mo26439c(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public int mo26431v() {
        return this.f30326b;
    }

    /* renamed from: w */
    public int mo26432w() {
        return this.f30325a;
    }

    /* renamed from: x */
    public boolean mo26433x(int i, int i2) {
        return mo26435z(this.f30343s, i, i2);
    }

    /* renamed from: y */
    public boolean mo26434y() {
        return this.f30325a == 1;
    }

    /* renamed from: z */
    public boolean mo26435z(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }
}
