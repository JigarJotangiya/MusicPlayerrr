package net.coocent.android.xmlparser.loading;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

public class DoubleCircleBuilder extends ZLoadingBuilder {
    private static final int INTER_CIRCLE_ANGLE = 90;
    private static final int OUTER_CIRCLE_ANGLE = 270;
    private RectF mInnerCircleRectF;
    private RectF mOuterCircleRectF;
    private int mRotateAngle;
    private Paint mStrokePaint;

    public DoubleCircleBuilder(Context context) {
        init(context);
        initParams(context);
    }

    private void initPaint(float f) {
        Paint paint = new Paint(1);
        this.mStrokePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mStrokePaint.setStrokeWidth(f);
        this.mStrokePaint.setColor(-1);
        this.mStrokePaint.setDither(true);
        this.mStrokePaint.setFilterBitmap(true);
        this.mStrokePaint.setStrokeCap(Paint.Cap.ROUND);
        this.mStrokePaint.setStrokeJoin(Paint.Join.ROUND);
    }

    /* access modifiers changed from: protected */
    public void computeUpdateValue(ValueAnimator valueAnimator, float f) {
        this.mRotateAngle = (int) (f * 360.0f);
    }

    /* access modifiers changed from: protected */
    public void initParams(Context context) {
        float allSize = getAllSize();
        float f = 0.6f * allSize;
        initPaint(0.4f * f);
        this.mRotateAngle = 0;
        RectF rectF = new RectF();
        this.mOuterCircleRectF = rectF;
        rectF.set(getViewCenterX() - allSize, getViewCenterY() - allSize, getViewCenterX() + allSize, getViewCenterY() + allSize);
        RectF rectF2 = new RectF();
        this.mInnerCircleRectF = rectF2;
        rectF2.set(getViewCenterX() - f, getViewCenterY() - f, getViewCenterX() + f, getViewCenterY() + f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.drawArc(this.mOuterCircleRectF, (float) (this.mRotateAngle % 360), 270.0f, false, this.mStrokePaint);
        canvas.drawArc(this.mInnerCircleRectF, (float) (270 - (this.mRotateAngle % 360)), 90.0f, false, this.mStrokePaint);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void prepareEnd() {
    }

    /* access modifiers changed from: protected */
    public void prepareStart(ValueAnimator valueAnimator) {
    }

    /* access modifiers changed from: protected */
    public void setAlpha(int i) {
        this.mStrokePaint.setAlpha(i);
    }

    public ZLoadingBuilder setColor(int i) {
        Paint paint = this.mStrokePaint;
        if (paint != null) {
            paint.setColor(i);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void setColorFilter(ColorFilter colorFilter) {
        this.mStrokePaint.setColorFilter(colorFilter);
    }
}
