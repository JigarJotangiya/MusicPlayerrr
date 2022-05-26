package p082e.p124j.p125a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p082e.p109h.p119p.C3774v;

/* renamed from: e.j.a.c */
/* compiled from: ViewDragHelper */
public class C3808c {

    /* renamed from: w */
    private static final Interpolator f11897w = new C3809a();

    /* renamed from: a */
    private int f11898a;

    /* renamed from: b */
    private int f11899b;

    /* renamed from: c */
    private int f11900c = -1;

    /* renamed from: d */
    private float[] f11901d;

    /* renamed from: e */
    private float[] f11902e;

    /* renamed from: f */
    private float[] f11903f;

    /* renamed from: g */
    private float[] f11904g;

    /* renamed from: h */
    private int[] f11905h;

    /* renamed from: i */
    private int[] f11906i;

    /* renamed from: j */
    private int[] f11907j;

    /* renamed from: k */
    private int f11908k;

    /* renamed from: l */
    private VelocityTracker f11909l;

    /* renamed from: m */
    private float f11910m;

    /* renamed from: n */
    private float f11911n;

    /* renamed from: o */
    private int f11912o;

    /* renamed from: p */
    private int f11913p;

    /* renamed from: q */
    private OverScroller f11914q;

    /* renamed from: r */
    private final C3811c f11915r;

    /* renamed from: s */
    private View f11916s;

    /* renamed from: t */
    private boolean f11917t;

    /* renamed from: u */
    private final ViewGroup f11918u;

    /* renamed from: v */
    private final Runnable f11919v = new C3810b();

    /* renamed from: e.j.a.c$a */
    /* compiled from: ViewDragHelper */
    static class C3809a implements Interpolator {
        C3809a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: e.j.a.c$b */
    /* compiled from: ViewDragHelper */
    class C3810b implements Runnable {
        C3810b() {
        }

        public void run() {
            C3808c.this.mo13288K(0);
        }
    }

    /* renamed from: e.j.a.c$c */
    /* compiled from: ViewDragHelper */
    public static abstract class C3811c {
        /* renamed from: a */
        public abstract int mo3555a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo3556b(View view, int i, int i2);

        /* renamed from: c */
        public int mo13307c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo3557d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo13308e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo3558f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo3559g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo3560h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo3561i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo3562j(int i);

        /* renamed from: k */
        public abstract void mo3563k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo3564l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo3565m(View view, int i);
    }

    private C3808c(Context context, ViewGroup viewGroup, C3811c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f11918u = viewGroup;
            this.f11915r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f11912o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f11899b = viewConfiguration.getScaledTouchSlop();
            this.f11910m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f11911n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f11914q = new OverScroller(context, f11897w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: D */
    private boolean m16401D(int i) {
        if (mo13285C(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: G */
    private void m16402G() {
        this.f11909l.computeCurrentVelocity(1000, this.f11910m);
        m16416q(m16408h(this.f11909l.getXVelocity(this.f11900c), this.f11911n, this.f11910m), m16408h(this.f11909l.getYVelocity(this.f11900c), this.f11911n, this.f11910m));
    }

    /* renamed from: H */
    private void m16403H(float f, float f2, int i) {
        int i2 = 1;
        if (!m16406d(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m16406d(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m16406d(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m16406d(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f11906i;
            iArr[i] = iArr[i] | i2;
            this.f11915r.mo3558f(i2, i);
        }
    }

    /* renamed from: I */
    private void m16404I(float f, float f2, int i) {
        m16419t(i);
        float[] fArr = this.f11901d;
        this.f11903f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f11902e;
        this.f11904g[i] = f2;
        fArr2[i] = f2;
        this.f11905h[i] = m16421y((int) f, (int) f2);
        this.f11908k |= 1 << i;
    }

    /* renamed from: J */
    private void m16405J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m16401D(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f11903f[pointerId] = x;
                this.f11904g[pointerId] = y;
            }
        }
    }

    /* renamed from: d */
    private boolean m16406d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f11905h[i] & i2) != i2 || (this.f11913p & i2) == 0 || (this.f11907j[i] & i2) == i2 || (this.f11906i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f11899b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f11915r.mo3559g(i2)) {
            int[] iArr = this.f11907j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f11906i[i] & i2) != 0 || abs <= ((float) this.f11899b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    private boolean m16407g(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f11915r.mo3557d(view) > 0;
        boolean z2 = this.f11915r.mo13308e(view) > 0;
        if (z && z2) {
            int i = this.f11899b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f11899b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f11899b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    private float m16408h(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* renamed from: i */
    private int m16409i(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* renamed from: j */
    private void m16410j() {
        float[] fArr = this.f11901d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f11902e, 0.0f);
            Arrays.fill(this.f11903f, 0.0f);
            Arrays.fill(this.f11904g, 0.0f);
            Arrays.fill(this.f11905h, 0);
            Arrays.fill(this.f11906i, 0);
            Arrays.fill(this.f11907j, 0);
            this.f11908k = 0;
        }
    }

    /* renamed from: k */
    private void m16411k(int i) {
        if (this.f11901d != null && mo13285C(i)) {
            this.f11901d[i] = 0.0f;
            this.f11902e[i] = 0.0f;
            this.f11903f[i] = 0.0f;
            this.f11904g[i] = 0.0f;
            this.f11905h[i] = 0;
            this.f11906i[i] = 0;
            this.f11907j[i] = 0;
            this.f11908k = (~(1 << i)) & this.f11908k;
        }
    }

    /* renamed from: l */
    private int m16412l(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f11918u.getWidth();
        float f = (float) (width / 2);
        float r = f + (m16417r(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(r / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: m */
    private int m16413m(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = m16409i(i3, (int) this.f11911n, (int) this.f11910m);
        int i6 = m16409i(i4, (int) this.f11911n, (int) this.f11910m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (i5 != 0) {
            f2 = (float) abs3;
            f = (float) i7;
        } else {
            f2 = (float) abs;
            f = (float) i8;
        }
        float f5 = f2 / f;
        if (i6 != 0) {
            f4 = (float) abs4;
            f3 = (float) i7;
        } else {
            f4 = (float) abs2;
            f3 = (float) i8;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m16412l(i, i5, this.f11915r.mo3557d(view))) * f5) + (((float) m16412l(i2, i6, this.f11915r.mo13308e(view))) * f6));
    }

    /* renamed from: o */
    public static C3808c m16414o(ViewGroup viewGroup, float f, C3811c cVar) {
        C3808c p = m16415p(viewGroup, cVar);
        p.f11899b = (int) (((float) p.f11899b) * (1.0f / f));
        return p;
    }

    /* renamed from: p */
    public static C3808c m16415p(ViewGroup viewGroup, C3811c cVar) {
        return new C3808c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: q */
    private void m16416q(float f, float f2) {
        this.f11917t = true;
        this.f11915r.mo3564l(this.f11916s, f, f2);
        this.f11917t = false;
        if (this.f11898a == 1) {
            mo13288K(0);
        }
    }

    /* renamed from: r */
    private float m16417r(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: s */
    private void m16418s(int i, int i2, int i3, int i4) {
        int left = this.f11916s.getLeft();
        int top = this.f11916s.getTop();
        if (i3 != 0) {
            i = this.f11915r.mo3555a(this.f11916s, i, i3);
            C3774v.m16186Y(this.f11916s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f11915r.mo3556b(this.f11916s, i2, i4);
            C3774v.m16187Z(this.f11916s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f11915r.mo3563k(this.f11916s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: t */
    private void m16419t(int i) {
        float[] fArr = this.f11901d;
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
                float[] fArr6 = this.f11902e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f11903f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f11904g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f11905h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f11906i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f11907j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f11901d = fArr2;
            this.f11902e = fArr3;
            this.f11903f = fArr4;
            this.f11904g = fArr5;
            this.f11905h = iArr;
            this.f11906i = iArr2;
            this.f11907j = iArr3;
        }
    }

    /* renamed from: v */
    private boolean m16420v(int i, int i2, int i3, int i4) {
        int left = this.f11916s.getLeft();
        int top = this.f11916s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f11914q.abortAnimation();
            mo13288K(0);
            return false;
        }
        this.f11914q.startScroll(left, top, i5, i6, m16413m(this.f11916s, i5, i6, i3, i4));
        mo13288K(2);
        return true;
    }

    /* renamed from: y */
    private int m16421y(int i, int i2) {
        int i3 = i < this.f11918u.getLeft() + this.f11912o ? 1 : 0;
        if (i2 < this.f11918u.getTop() + this.f11912o) {
            i3 |= 4;
        }
        if (i > this.f11918u.getRight() - this.f11912o) {
            i3 |= 2;
        }
        return i2 > this.f11918u.getBottom() - this.f11912o ? i3 | 8 : i3;
    }

    /* renamed from: A */
    public int mo13283A() {
        return this.f11898a;
    }

    /* renamed from: B */
    public boolean mo13284B(int i, int i2) {
        return mo13286E(this.f11916s, i, i2);
    }

    /* renamed from: C */
    public boolean mo13285C(int i) {
        return ((1 << i) & this.f11908k) != 0;
    }

    /* renamed from: E */
    public boolean mo13286E(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public void mo13287F(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo13296b();
        }
        if (this.f11909l == null) {
            this.f11909l = VelocityTracker.obtain();
        }
        this.f11909l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View u = mo13301u((int) x, (int) y);
            m16404I(x, y, pointerId);
            mo13294Q(u, pointerId);
            int i3 = this.f11905h[pointerId];
            int i4 = this.f11913p;
            if ((i3 & i4) != 0) {
                this.f11915r.mo3560h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f11898a == 1) {
                m16402G();
            }
            mo13296b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f11898a == 1) {
                    m16416q(0.0f, 0.0f);
                }
                mo13296b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m16404I(x2, y2, pointerId2);
                if (this.f11898a == 0) {
                    mo13294Q(mo13301u((int) x2, (int) y2), pointerId2);
                    int i5 = this.f11905h[pointerId2];
                    int i6 = this.f11913p;
                    if ((i5 & i6) != 0) {
                        this.f11915r.mo3560h(i5 & i6, pointerId2);
                    }
                } else if (mo13284B((int) x2, (int) y2)) {
                    mo13294Q(this.f11916s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f11898a == 1 && pointerId3 == this.f11900c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f11900c) {
                            View u2 = mo13301u((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f11916s;
                            if (u2 == view && mo13294Q(view, pointerId4)) {
                                i = this.f11900c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m16402G();
                    }
                }
                m16411k(pointerId3);
            }
        } else if (this.f11898a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m16401D(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f11901d[pointerId5];
                    float f2 = y3 - this.f11902e[pointerId5];
                    m16403H(f, f2, pointerId5);
                    if (this.f11898a != 1) {
                        View u3 = mo13301u((int) x3, (int) y3);
                        if (m16407g(u3, f, f2) && mo13294Q(u3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m16405J(motionEvent);
        } else if (m16401D(this.f11900c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f11900c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f11903f;
            int i7 = this.f11900c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f11904g[i7]);
            m16418s(this.f11916s.getLeft() + i8, this.f11916s.getTop() + i9, i8, i9);
            m16405J(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo13288K(int i) {
        this.f11918u.removeCallbacks(this.f11919v);
        if (this.f11898a != i) {
            this.f11898a = i;
            this.f11915r.mo3562j(i);
            if (this.f11898a == 0) {
                this.f11916s = null;
            }
        }
    }

    /* renamed from: L */
    public void mo13289L(int i) {
        this.f11913p = i;
    }

    /* renamed from: M */
    public void mo13290M(float f) {
        this.f11911n = f;
    }

    /* renamed from: N */
    public boolean mo13291N(int i, int i2) {
        if (this.f11917t) {
            return m16420v(i, i2, (int) this.f11909l.getXVelocity(this.f11900c), (int) this.f11909l.getYVelocity(this.f11900c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13292O(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo13296b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f11909l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f11909l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f11909l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m16411k(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m16404I(r7, r1, r2)
            int r3 = r0.f11898a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f11905h
            r1 = r1[r2]
            int r3 = r0.f11913p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            e.j.a.c$c r4 = r0.f11915r
            r1 = r1 & r3
            r4.mo3560h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo13301u(r3, r1)
            android.view.View r3 = r0.f11916s
            if (r1 != r3) goto L_0x0031
            r0.mo13294Q(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f11901d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f11902e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m16401D(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f11901d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f11902e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo13301u(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m16407g(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            e.j.a.c$c r14 = r0.f11915r
            int r12 = r14.mo3555a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            e.j.a.c$c r5 = r0.f11915r
            int r5 = r5.mo3556b(r7, r15, r14)
            e.j.a.c$c r14 = r0.f11915r
            int r14 = r14.mo3557d(r7)
            e.j.a.c$c r15 = r0.f11915r
            int r15 = r15.mo13308e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m16403H(r9, r10, r4)
            int r5 = r0.f11898a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo13294Q(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m16405J(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo13296b()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m16404I(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo13301u(r2, r3)
            android.view.View r3 = r0.f11916s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f11898a
            if (r3 != r4) goto L_0x0125
            r0.mo13294Q(r2, r1)
        L_0x0125:
            int[] r2 = r0.f11905h
            r2 = r2[r1]
            int r3 = r0.f11913p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            e.j.a.c$c r4 = r0.f11915r
            r2 = r2 & r3
            r4.mo3560h(r2, r1)
        L_0x0135:
            int r1 = r0.f11898a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p124j.p125a.C3808c.mo13292O(android.view.MotionEvent):boolean");
    }

    /* renamed from: P */
    public boolean mo13293P(View view, int i, int i2) {
        this.f11916s = view;
        this.f11900c = -1;
        boolean v = m16420v(i, i2, 0, 0);
        if (!v && this.f11898a == 0 && this.f11916s != null) {
            this.f11916s = null;
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo13294Q(View view, int i) {
        if (view == this.f11916s && this.f11900c == i) {
            return true;
        }
        if (view == null || !this.f11915r.mo3565m(view, i)) {
            return false;
        }
        this.f11900c = i;
        mo13297c(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo13295a() {
        mo13296b();
        if (this.f11898a == 2) {
            int currX = this.f11914q.getCurrX();
            int currY = this.f11914q.getCurrY();
            this.f11914q.abortAnimation();
            int currX2 = this.f11914q.getCurrX();
            int currY2 = this.f11914q.getCurrY();
            this.f11915r.mo3563k(this.f11916s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo13288K(0);
    }

    /* renamed from: b */
    public void mo13296b() {
        this.f11900c = -1;
        m16410j();
        VelocityTracker velocityTracker = this.f11909l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11909l = null;
        }
    }

    /* renamed from: c */
    public void mo13297c(View view, int i) {
        if (view.getParent() == this.f11918u) {
            this.f11916s = view;
            this.f11900c = i;
            this.f11915r.mo3561i(view, i);
            mo13288K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f11918u + ")");
    }

    /* renamed from: e */
    public boolean mo13298e(int i) {
        int length = this.f11901d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo13299f(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo13299f(int i, int i2) {
        if (!mo13285C(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f11903f[i2] - this.f11901d[i2];
        float f2 = this.f11904g[i2] - this.f11902e[i2];
        if (z && z2) {
            int i3 = this.f11899b;
            if ((f * f) + (f2 * f2) > ((float) (i3 * i3))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f11899b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f11899b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: n */
    public boolean mo13300n(boolean z) {
        if (this.f11898a == 2) {
            boolean computeScrollOffset = this.f11914q.computeScrollOffset();
            int currX = this.f11914q.getCurrX();
            int currY = this.f11914q.getCurrY();
            int left = currX - this.f11916s.getLeft();
            int top = currY - this.f11916s.getTop();
            if (left != 0) {
                C3774v.m16186Y(this.f11916s, left);
            }
            if (top != 0) {
                C3774v.m16187Z(this.f11916s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f11915r.mo3563k(this.f11916s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f11914q.getFinalX() && currY == this.f11914q.getFinalY()) {
                this.f11914q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f11918u.post(this.f11919v);
                } else {
                    mo13288K(0);
                }
            }
        }
        if (this.f11898a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public View mo13301u(int i, int i2) {
        for (int childCount = this.f11918u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f11918u;
            this.f11915r.mo13307c(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: w */
    public View mo13302w() {
        return this.f11916s;
    }

    /* renamed from: x */
    public int mo13303x() {
        return this.f11912o;
    }

    /* renamed from: z */
    public int mo13304z() {
        return this.f11899b;
    }
}
