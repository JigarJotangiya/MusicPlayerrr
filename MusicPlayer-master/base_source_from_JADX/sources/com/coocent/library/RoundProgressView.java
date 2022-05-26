package com.coocent.library;

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
    private Paint f7513g;

    /* renamed from: h */
    private float f7514h;

    /* renamed from: i */
    private int f7515i;

    /* renamed from: j */
    private float f7516j;

    /* renamed from: k */
    private float f7517k;

    /* renamed from: l */
    private RectF f7518l;

    /* renamed from: m */
    private int f7519m;

    /* renamed from: n */
    private int f7520n;

    /* renamed from: o */
    private ValueAnimator f7521o;

    /* renamed from: com.coocent.library.RoundProgressView$a */
    class C2225a implements ValueAnimator.AnimatorUpdateListener {
        C2225a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RoundProgressView.this.setPercentageInternal(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public RoundProgressView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private void m10367b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2230e.RoundProgressView);
            this.f7519m = obtainStyledAttributes.getColor(C2230e.RoundProgressView_RoundProgressBgColor, getResources().getColor(C2226a.transWhite));
            this.f7520n = obtainStyledAttributes.getColor(C2230e.RoundProgressView_RoundProgressColor, getResources().getColor(C2226a.progressColor));
            this.f7517k = obtainStyledAttributes.getDimension(C2230e.RoundProgressView_RoundProgressRadius, 3.0f);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.f7513g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f7513g.setStrokeCap(Paint.Cap.ROUND);
        this.f7513g.setAntiAlias(true);
    }

    /* access modifiers changed from: private */
    public void setPercentageInternal(float f) {
        this.f7514h = f;
        invalidate();
    }

    /* renamed from: c */
    public void mo8828c(float f, boolean z) {
        if (z) {
            ValueAnimator valueAnimator = this.f7521o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f7514h, f});
            this.f7521o = ofFloat;
            ofFloat.addUpdateListener(new C2225a());
            this.f7521o.setDuration(1000).start();
            return;
        }
        setPercentageInternal(f);
    }

    /* renamed from: d */
    public void mo8829d(int i, int i2, boolean z) {
        if (i > i2) {
            i = i2;
        }
        mo8828c((i <= 0 || i2 <= 0) ? 0.0f : (((float) i) * 1.0f) / ((float) i2), z);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f7521o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7521o.end();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f7513g.setStrokeWidth(this.f7517k);
        this.f7513g.setColor(this.f7519m);
        if (this.f7518l == null) {
            float f = this.f7517k;
            int i = this.f7515i;
            float f2 = this.f7516j;
            this.f7518l = new RectF(f / 2.0f, ((((float) i) * 0.5f) - f2) + (f / 2.0f), (f2 * 2.0f) - (f / 2.0f), ((((float) i) * 0.5f) + f2) - (f / 2.0f));
        }
        canvas.drawArc(this.f7518l, 0.0f, 360.0f, false, this.f7513g);
        this.f7513g.setColor(this.f7520n);
        canvas.drawArc(this.f7518l, -90.0f, this.f7514h * 360.0f, false, this.f7513g);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7515i = i2;
        this.f7516j = ((float) Math.min(i, i2)) * 0.5f;
    }

    public void setBgColor(int i) {
        this.f7519m = i;
    }

    public void setPercentage(float f) {
        mo8828c(f, false);
    }

    public void setProgressColor(int i) {
        this.f7520n = i;
    }

    public void setRadius(int i) {
        this.f7516j = (float) i;
    }

    public RoundProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7514h = 0.0f;
        m10367b(context, attributeSet);
    }
}
