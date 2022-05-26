package com.coocent.roundprogressview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RoundProgressView extends View {

    /* renamed from: g */
    private Paint f8877g;

    /* renamed from: h */
    private float f8878h;

    /* renamed from: i */
    private int f8879i;

    /* renamed from: j */
    private float f8880j;

    /* renamed from: k */
    private float f8881k;

    /* renamed from: l */
    private RectF f8882l;

    /* renamed from: m */
    private int f8883m;

    /* renamed from: n */
    private int f8884n;

    /* renamed from: o */
    private ValueAnimator f8885o;

    /* renamed from: com.coocent.roundprogressview.RoundProgressView$a */
    class C2512a implements ValueAnimator.AnimatorUpdateListener {
        C2512a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RoundProgressView.this.setPercentageInternal(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public RoundProgressView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private void m11736b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2514b.RoundProgressView);
            this.f8883m = obtainStyledAttributes.getColor(C2514b.RoundProgressView_RoundProgressBgColor, getResources().getColor(C2513a.progress_bg));
            this.f8884n = obtainStyledAttributes.getColor(C2514b.RoundProgressView_RoundProgressColor, getResources().getColor(C2513a.progress_color));
            this.f8881k = obtainStyledAttributes.getDimension(C2514b.RoundProgressView_RoundProgressRadius, 3.0f);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.f8877g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f8877g.setStrokeCap(Paint.Cap.ROUND);
        this.f8877g.setAntiAlias(true);
    }

    /* access modifiers changed from: private */
    public void setPercentageInternal(float f) {
        this.f8878h = f;
        invalidate();
    }

    /* renamed from: c */
    public void mo9709c(float f, boolean z) {
        if (z) {
            ValueAnimator valueAnimator = this.f8885o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f8878h, f});
            this.f8885o = ofFloat;
            ofFloat.addUpdateListener(new C2512a());
            this.f8885o.setDuration(1000).start();
            return;
        }
        setPercentageInternal(f);
    }

    /* renamed from: d */
    public void mo9710d(int i, int i2) {
        mo9711e(i, i2, false);
    }

    /* renamed from: e */
    public void mo9711e(int i, int i2, boolean z) {
        if (i > i2) {
            i = i2;
        }
        mo9709c((i <= 0 || i2 <= 0) ? 0.0f : (((float) i) * 1.0f) / ((float) i2), z);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f8885o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8885o.end();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f8877g.setStrokeWidth(this.f8881k);
        this.f8877g.setColor(this.f8883m);
        if (this.f8882l == null) {
            float f = this.f8881k;
            int i = this.f8879i;
            float f2 = this.f8880j;
            this.f8882l = new RectF(f / 2.0f, ((((float) i) * 0.5f) - f2) + (f / 2.0f), (f2 * 2.0f) - (f / 2.0f), ((((float) i) * 0.5f) + f2) - (f / 2.0f));
        }
        canvas.drawArc(this.f8882l, 0.0f, 360.0f, false, this.f8877g);
        this.f8877g.setColor(this.f8884n);
        canvas.drawArc(this.f8882l, -90.0f, this.f8878h * 360.0f, false, this.f8877g);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8879i = i2;
        this.f8880j = ((float) Math.min(i, i2)) * 0.5f;
    }

    public void setBgColor(int i) {
        this.f8883m = i;
    }

    public void setPercentage(float f) {
        mo9709c(f, false);
    }

    public void setProgressColor(int i) {
        this.f8884n = i;
    }

    public void setRadius(int i) {
        this.f8880j = (float) i;
    }

    public RoundProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8878h = 0.0f;
        m11736b(context, attributeSet);
    }
}
