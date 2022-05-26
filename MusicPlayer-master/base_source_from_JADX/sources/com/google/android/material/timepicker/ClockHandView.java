package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;

class ClockHandView extends View {

    /* renamed from: g */
    private ValueAnimator f29205g;

    /* renamed from: h */
    private boolean f29206h;

    /* renamed from: i */
    private float f29207i;

    /* renamed from: j */
    private float f29208j;

    /* renamed from: k */
    private boolean f29209k;

    /* renamed from: l */
    private int f29210l;

    /* renamed from: m */
    private final List<C6268d> f29211m;

    /* renamed from: n */
    private final int f29212n;

    /* renamed from: o */
    private final float f29213o;

    /* renamed from: p */
    private final Paint f29214p;

    /* renamed from: q */
    private final RectF f29215q;

    /* renamed from: r */
    private final int f29216r;

    /* renamed from: s */
    private float f29217s;

    /* renamed from: t */
    private boolean f29218t;

    /* renamed from: u */
    private C6267c f29219u;

    /* renamed from: v */
    private double f29220v;

    /* renamed from: w */
    private int f29221w;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    class C6265a implements ValueAnimator.AnimatorUpdateListener {
        C6265a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m37407m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    class C6266b extends AnimatorListenerAdapter {
        C6266b(ClockHandView clockHandView) {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface C6267c {
        /* renamed from: a */
        void mo25106a(float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    public interface C6268d {
        /* renamed from: a */
        void mo25091a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.materialClockStyle);
    }

    /* renamed from: c */
    private void m37403c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f29214p.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f29221w) * ((float) Math.cos(this.f29220v))) + f, (((float) this.f29221w) * ((float) Math.sin(this.f29220v))) + f2, (float) this.f29212n, this.f29214p);
        double sin = Math.sin(this.f29220v);
        double cos = Math.cos(this.f29220v);
        double d = (double) ((float) (this.f29221w - this.f29212n));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.f29214p.setStrokeWidth((float) this.f29216r);
        canvas.drawLine(f, f2, f3, f4, this.f29214p);
        canvas.drawCircle(f, f2, this.f29213o, this.f29214p);
    }

    /* renamed from: e */
    private int m37404e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: h */
    private Pair<Float, Float> m37405h(float f) {
        float f2 = mo25096f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: i */
    private boolean m37406i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float e = (float) m37404e(f, f2);
        boolean z4 = false;
        boolean z5 = mo25096f() != e;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f29206h) {
            z4 = true;
        }
        mo25100l(e, z4);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m37407m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f29217s = f2;
        this.f29220v = Math.toRadians((double) (f2 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f29221w) * ((float) Math.cos(this.f29220v)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f29221w) * ((float) Math.sin(this.f29220v)));
        RectF rectF = this.f29215q;
        int i = this.f29212n;
        rectF.set(width - ((float) i), height - ((float) i), width + ((float) i), height + ((float) i));
        for (C6268d a : this.f29211m) {
            a.mo25091a(f2, z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void mo25094b(C6268d dVar) {
        this.f29211m.add(dVar);
    }

    /* renamed from: d */
    public RectF mo25095d() {
        return this.f29215q;
    }

    /* renamed from: f */
    public float mo25096f() {
        return this.f29217s;
    }

    /* renamed from: g */
    public int mo25097g() {
        return this.f29212n;
    }

    /* renamed from: j */
    public void mo25098j(int i) {
        this.f29221w = i;
        invalidate();
    }

    /* renamed from: k */
    public void mo25099k(float f) {
        mo25100l(f, false);
    }

    /* renamed from: l */
    public void mo25100l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f29205g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m37407m(f, false);
            return;
        }
        Pair<Float, Float> h = m37405h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h.first).floatValue(), ((Float) h.second).floatValue()});
        this.f29205g = ofFloat;
        ofFloat.setDuration(200);
        this.f29205g.addUpdateListener(new C6265a());
        this.f29205g.addListener(new C6266b(this));
        this.f29205g.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m37403c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo25099k(mo25096f());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        C6267c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f29207i);
                int i2 = (int) (y - this.f29208j);
                this.f29209k = (i * i) + (i2 * i2) > this.f29210l;
                boolean z4 = this.f29218t;
                z3 = actionMasked == 1;
                z2 = z4;
            } else {
                z3 = false;
                z2 = false;
            }
            z = false;
        } else {
            this.f29207i = x;
            this.f29208j = y;
            this.f29209k = true;
            this.f29218t = false;
            z3 = false;
            z2 = false;
            z = true;
        }
        boolean i3 = m37406i(x, y, z2, z, z3) | this.f29218t;
        this.f29218t = i3;
        if (i3 && z3 && (cVar = this.f29219u) != null) {
            cVar.mo25106a((float) m37404e(x, y), this.f29209k);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29211m = new ArrayList();
        Paint paint = new Paint();
        this.f29214p = paint;
        this.f29215q = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.ClockHandView, i, C7499k.Widget_MaterialComponents_TimePicker_Clock);
        this.f29221w = obtainStyledAttributes.getDimensionPixelSize(C7500l.ClockHandView_materialCircleRadius, 0);
        this.f29212n = obtainStyledAttributes.getDimensionPixelSize(C7500l.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f29216r = resources.getDimensionPixelSize(C7492d.material_clock_hand_stroke_width);
        this.f29213o = (float) resources.getDimensionPixelSize(C7492d.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C7500l.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo25099k(0.0f);
        this.f29210l = ViewConfiguration.get(context).getScaledTouchSlop();
        C3774v.m16237y0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
