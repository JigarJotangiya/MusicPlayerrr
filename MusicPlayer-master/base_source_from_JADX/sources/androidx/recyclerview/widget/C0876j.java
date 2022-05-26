package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.un4seen.bass.BASS;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.recyclerview.widget.j */
/* compiled from: FastScroller */
class C0876j extends RecyclerView.C0808o implements RecyclerView.C0816s {

    /* renamed from: J */
    private static final int[] f3922J = {16842919};

    /* renamed from: K */
    private static final int[] f3923K = new int[0];

    /* renamed from: A */
    private boolean f3924A = false;

    /* renamed from: B */
    private int f3925B = 0;

    /* renamed from: C */
    private int f3926C = 0;

    /* renamed from: D */
    private final int[] f3927D = new int[2];

    /* renamed from: E */
    private final int[] f3928E = new int[2];

    /* renamed from: F */
    final ValueAnimator f3929F;

    /* renamed from: G */
    int f3930G;

    /* renamed from: H */
    private final Runnable f3931H;

    /* renamed from: I */
    private final RecyclerView.C0817t f3932I;

    /* renamed from: g */
    private final int f3933g;

    /* renamed from: h */
    private final int f3934h;

    /* renamed from: i */
    final StateListDrawable f3935i;

    /* renamed from: j */
    final Drawable f3936j;

    /* renamed from: k */
    private final int f3937k;

    /* renamed from: l */
    private final int f3938l;

    /* renamed from: m */
    private final StateListDrawable f3939m;

    /* renamed from: n */
    private final Drawable f3940n;

    /* renamed from: o */
    private final int f3941o;

    /* renamed from: p */
    private final int f3942p;

    /* renamed from: q */
    int f3943q;

    /* renamed from: r */
    int f3944r;

    /* renamed from: s */
    float f3945s;

    /* renamed from: t */
    int f3946t;

    /* renamed from: u */
    int f3947u;

    /* renamed from: v */
    float f3948v;

    /* renamed from: w */
    private int f3949w = 0;

    /* renamed from: x */
    private int f3950x = 0;

    /* renamed from: y */
    private RecyclerView f3951y;

    /* renamed from: z */
    private boolean f3952z = false;

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* compiled from: FastScroller */
    class C0877a implements Runnable {
        C0877a() {
        }

        public void run() {
            C0876j.this.mo5283p(BASS.BASS_ERROR_JAVA_CLASS);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    /* compiled from: FastScroller */
    class C0878b extends RecyclerView.C0817t {
        C0878b() {
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            C0876j.this.mo5281A(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    /* compiled from: FastScroller */
    private class C0879c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3955a = false;

        C0879c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3955a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3955a) {
                this.f3955a = false;
            } else if (((Float) C0876j.this.f3929F.getAnimatedValue()).floatValue() == 0.0f) {
                C0876j jVar = C0876j.this;
                jVar.f3930G = 0;
                jVar.mo5287x(0);
            } else {
                C0876j jVar2 = C0876j.this;
                jVar2.f3930G = 2;
                jVar2.mo5286u();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    /* compiled from: FastScroller */
    private class C0880d implements ValueAnimator.AnimatorUpdateListener {
        C0880d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0876j.this.f3935i.setAlpha(floatValue);
            C0876j.this.f3936j.setAlpha(floatValue);
            C0876j.this.mo5286u();
        }
    }

    C0876j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3929F = ofFloat;
        this.f3930G = 0;
        this.f3931H = new C0877a();
        this.f3932I = new C0878b();
        this.f3935i = stateListDrawable;
        this.f3936j = drawable;
        this.f3939m = stateListDrawable2;
        this.f3940n = drawable2;
        this.f3937k = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3938l = Math.max(i, drawable.getIntrinsicWidth());
        this.f3941o = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3942p = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3933g = i2;
        this.f3934h = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0879c());
        ofFloat.addUpdateListener(new C0880d());
        mo5282i(recyclerView);
    }

    /* renamed from: B */
    private void m5426B(float f) {
        int[] o = m5432o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f3944r) - max) >= 2.0f) {
            int w = m5436w(this.f3945s, max, o, this.f3951y.computeVerticalScrollRange(), this.f3951y.computeVerticalScrollOffset(), this.f3950x);
            if (w != 0) {
                this.f3951y.scrollBy(0, w);
            }
            this.f3945s = max;
        }
    }

    /* renamed from: j */
    private void m5427j() {
        this.f3951y.removeCallbacks(this.f3931H);
    }

    /* renamed from: k */
    private void m5428k() {
        this.f3951y.mo4585d1(this);
        this.f3951y.mo4601g1(this);
        this.f3951y.mo4624h1(this.f3932I);
        m5427j();
    }

    /* renamed from: l */
    private void m5429l(Canvas canvas) {
        int i = this.f3950x;
        int i2 = this.f3941o;
        int i3 = i - i2;
        int i4 = this.f3947u;
        int i5 = this.f3946t;
        int i6 = i4 - (i5 / 2);
        this.f3939m.setBounds(0, 0, i5, i2);
        this.f3940n.setBounds(0, 0, this.f3949w, this.f3942p);
        canvas.translate(0.0f, (float) i3);
        this.f3940n.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f3939m.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: m */
    private void m5430m(Canvas canvas) {
        int i = this.f3949w;
        int i2 = this.f3937k;
        int i3 = i - i2;
        int i4 = this.f3944r;
        int i5 = this.f3943q;
        int i6 = i4 - (i5 / 2);
        this.f3935i.setBounds(0, 0, i2, i5);
        this.f3936j.setBounds(0, 0, this.f3938l, this.f3950x);
        if (m5434r()) {
            this.f3936j.draw(canvas);
            canvas.translate((float) this.f3937k, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3935i.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float) (-this.f3937k), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f3936j.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f3935i.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: n */
    private int[] m5431n() {
        int[] iArr = this.f3928E;
        int i = this.f3934h;
        iArr[0] = i;
        iArr[1] = this.f3949w - i;
        return iArr;
    }

    /* renamed from: o */
    private int[] m5432o() {
        int[] iArr = this.f3927D;
        int i = this.f3934h;
        iArr[0] = i;
        iArr[1] = this.f3950x - i;
        return iArr;
    }

    /* renamed from: q */
    private void m5433q(float f) {
        int[] n = m5431n();
        float max = Math.max((float) n[0], Math.min((float) n[1], f));
        if (Math.abs(((float) this.f3947u) - max) >= 2.0f) {
            int w = m5436w(this.f3948v, max, n, this.f3951y.computeHorizontalScrollRange(), this.f3951y.computeHorizontalScrollOffset(), this.f3949w);
            if (w != 0) {
                this.f3951y.scrollBy(w, 0);
            }
            this.f3948v = max;
        }
    }

    /* renamed from: r */
    private boolean m5434r() {
        return C3774v.m16151B(this.f3951y) == 1;
    }

    /* renamed from: v */
    private void m5435v(int i) {
        m5427j();
        this.f3951y.postDelayed(this.f3931H, (long) i);
    }

    /* renamed from: w */
    private int m5436w(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: y */
    private void m5437y() {
        this.f3951y.mo4622h(this);
        this.f3951y.mo4633k(this);
        this.f3951y.mo4634l(this.f3932I);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo5281A(int i, int i2) {
        int computeVerticalScrollRange = this.f3951y.computeVerticalScrollRange();
        int i3 = this.f3950x;
        this.f3952z = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3933g;
        int computeHorizontalScrollRange = this.f3951y.computeHorizontalScrollRange();
        int i4 = this.f3949w;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3933g;
        this.f3924A = z;
        boolean z2 = this.f3952z;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                this.f3944r = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3943q = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3924A) {
                float f2 = (float) i4;
                this.f3947u = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3946t = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3925B;
            if (i5 == 0 || i5 == 1) {
                mo5287x(1);
            }
        } else if (this.f3925B != 0) {
            mo5287x(0);
        }
    }

    /* renamed from: h */
    public void mo4878h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        if (this.f3949w != this.f3951y.getWidth() || this.f3950x != this.f3951y.getHeight()) {
            this.f3949w = this.f3951y.getWidth();
            this.f3950x = this.f3951y.getHeight();
            mo5287x(0);
        } else if (this.f3930G != 0) {
            if (this.f3952z) {
                m5430m(canvas);
            }
            if (this.f3924A) {
                m5429l(canvas);
            }
        }
    }

    /* renamed from: i */
    public void mo5282i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3951y;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5428k();
            }
            this.f3951y = recyclerView;
            if (recyclerView != null) {
                m5437y();
            }
        }
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3925B;
        if (i == 1) {
            boolean t = mo5285t(motionEvent.getX(), motionEvent.getY());
            boolean s = mo5284s(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!t && !s) {
                return false;
            }
            if (s) {
                this.f3926C = 1;
                this.f3948v = (float) ((int) motionEvent.getX());
            } else if (t) {
                this.f3926C = 2;
                this.f3945s = (float) ((int) motionEvent.getY());
            }
            mo5287x(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3925B != 0) {
            if (motionEvent.getAction() == 0) {
                boolean t = mo5285t(motionEvent.getX(), motionEvent.getY());
                boolean s = mo5284s(motionEvent.getX(), motionEvent.getY());
                if (t || s) {
                    if (s) {
                        this.f3926C = 1;
                        this.f3948v = (float) ((int) motionEvent.getX());
                    } else if (t) {
                        this.f3926C = 2;
                        this.f3945s = (float) ((int) motionEvent.getY());
                    }
                    mo5287x(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3925B == 2) {
                this.f3945s = 0.0f;
                this.f3948v = 0.0f;
                mo5287x(1);
                this.f3926C = 0;
            } else if (motionEvent.getAction() == 2 && this.f3925B == 2) {
                mo5288z();
                if (this.f3926C == 1) {
                    m5433q(motionEvent.getX());
                }
                if (this.f3926C == 2) {
                    m5426B(motionEvent.getY());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5283p(int i) {
        int i2 = this.f3930G;
        if (i2 == 1) {
            this.f3929F.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3930G = 3;
        ValueAnimator valueAnimator = this.f3929F;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3929F.setDuration((long) i);
        this.f3929F.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo5284s(float f, float f2) {
        if (f2 >= ((float) (this.f3950x - this.f3941o))) {
            int i = this.f3947u;
            int i2 = this.f3946t;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5285t(float f, float f2) {
        if (!m5434r() ? f >= ((float) (this.f3949w - this.f3937k)) : f <= ((float) this.f3937k)) {
            int i = this.f3944r;
            int i2 = this.f3943q;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo5286u() {
        this.f3951y.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5287x(int i) {
        if (i == 2 && this.f3925B != 2) {
            this.f3935i.setState(f3922J);
            m5427j();
        }
        if (i == 0) {
            mo5286u();
        } else {
            mo5288z();
        }
        if (this.f3925B == 2 && i != 2) {
            this.f3935i.setState(f3923K);
            m5435v(1200);
        } else if (i == 1) {
            m5435v(1500);
        }
        this.f3925B = i;
    }

    /* renamed from: z */
    public void mo5288z() {
        int i = this.f3930G;
        if (i != 0) {
            if (i == 3) {
                this.f3929F.cancel();
            } else {
                return;
            }
        }
        this.f3930G = 1;
        ValueAnimator valueAnimator = this.f3929F;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3929F.setDuration(500);
        this.f3929F.setStartDelay(0);
        this.f3929F.start();
    }
}
