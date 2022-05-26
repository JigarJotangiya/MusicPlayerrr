package net.coocent.android.xmlparser.loading;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class StarBuilder extends ZLoadingBuilder {
    private final ValueAnimator.AnimatorUpdateListener mAnimatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            StarBuilder starBuilder = StarBuilder.this;
            float unused = starBuilder.mOffsetTranslateY = starBuilder.getViewCenterY() * 0.4f * floatValue;
            StarBuilder starBuilder2 = StarBuilder.this;
            float unused2 = starBuilder2.mShadowWidth = (starBuilder2.mOffsetTranslateY + 10.0f) * 0.9f;
        }
    };
    private Paint mFullPaint;
    /* access modifiers changed from: private */
    public float mOffsetTranslateY;
    private RectF mOvalRectF;
    private ValueAnimator mShadowAnimator;
    /* access modifiers changed from: private */
    public float mShadowWidth;
    private float mStarInMidR;
    private float mStarInR;
    private float mStarOutMidR;
    private float mStarOutR;
    private Path mStarPath;
    private int mStartAngle;

    public StarBuilder(Context context) {
        init(context);
        initParams(context);
    }

    private Path createStarPath(int i, int i2) {
        Path path = new Path();
        int i3 = 360 / i;
        int i4 = i3 / 2;
        int i5 = i2 - 5;
        path.moveTo(getViewCenterX() + (this.mStarOutMidR * cos(i5)), getViewCenterY() + (this.mStarOutMidR * sin(i5)));
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = (i3 * i6) + i2;
            int i8 = i7 - 5;
            path.lineTo(getViewCenterX() + (this.mStarOutMidR * cos(i8)), getViewCenterY() + (this.mStarOutMidR * sin(i8)));
            int i9 = i7 + 5;
            path.quadTo(getViewCenterX() + (this.mStarOutR * cos(i7)), getViewCenterY() + (this.mStarOutR * sin(i7)), getViewCenterX() + (this.mStarOutMidR * cos(i9)), getViewCenterY() + (this.mStarOutMidR * sin(i9)));
            int i10 = i7 + i4;
            int i11 = i10 - 5;
            path.lineTo(getViewCenterX() + (this.mStarInR * cos(i11)), getViewCenterY() + (this.mStarInR * sin(i11)));
            int i12 = i10 + 5;
            path.quadTo(getViewCenterX() + (this.mStarInMidR * cos(i10)), getViewCenterY() + (this.mStarInMidR * sin(i10)), getViewCenterX() + (this.mStarInR * cos(i12)), getViewCenterY() + (this.mStarInR * sin(i12)));
        }
        path.close();
        return path;
    }

    private void initAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f, 0.0f});
        this.mShadowAnimator = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.mShadowAnimator.setDuration(1333);
        this.mShadowAnimator.setStartDelay(333);
        this.mShadowAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    private void initValue(Context context) {
        float allSize = getAllSize() - ZLoadingBuilder.dip2px(context, 5.0f);
        this.mStarOutR = allSize;
        float f = allSize * 0.9f;
        this.mStarOutMidR = f;
        float f2 = f * 0.6f;
        this.mStarInR = f2;
        this.mStarInMidR = f2 * 0.9f;
        this.mStartAngle = 0;
        this.mOffsetTranslateY = 0.0f;
        this.mStarPath = createStarPath(5, -18);
        this.mShadowWidth = this.mStarOutR;
        this.mOvalRectF = new RectF();
    }

    /* access modifiers changed from: protected */
    public void computeUpdateValue(ValueAnimator valueAnimator, float f) {
        this.mStartAngle = (int) (f * 360.0f);
    }

    /* access modifiers changed from: protected */
    public final float cos(int i) {
        return (float) Math.cos((((double) i) * 3.141592653589793d) / 180.0d);
    }

    /* access modifiers changed from: protected */
    public void initParams(Context context) {
        Paint paint = new Paint(1);
        this.mFullPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mFullPaint.setStrokeWidth(2.0f);
        this.mFullPaint.setColor(-16777216);
        this.mFullPaint.setDither(true);
        this.mFullPaint.setFilterBitmap(true);
        initValue(context);
        initAnimator();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.mOffsetTranslateY);
        canvas.rotate((float) this.mStartAngle, getViewCenterX(), getViewCenterY());
        canvas.drawPath(this.mStarPath, this.mFullPaint);
        canvas.restore();
        this.mOvalRectF.set(getViewCenterX() - this.mShadowWidth, getIntrinsicHeight() - 20.0f, getViewCenterX() + this.mShadowWidth, getIntrinsicHeight() - 10.0f);
        canvas.drawOval(this.mOvalRectF, this.mFullPaint);
    }

    /* access modifiers changed from: protected */
    public void prepareEnd() {
        this.mShadowAnimator.removeAllUpdateListeners();
        this.mShadowAnimator.removeAllListeners();
        this.mShadowAnimator.setRepeatCount(0);
        this.mShadowAnimator.setDuration(0);
        this.mShadowAnimator.end();
    }

    /* access modifiers changed from: protected */
    public void prepareStart(ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        this.mShadowAnimator.setRepeatCount(-1);
        this.mShadowAnimator.setDuration(1333);
        this.mShadowAnimator.setStartDelay(333);
        this.mShadowAnimator.addUpdateListener(this.mAnimatorUpdateListener);
        this.mShadowAnimator.start();
    }

    /* access modifiers changed from: protected */
    public void setAlpha(int i) {
        this.mFullPaint.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public void setColorFilter(ColorFilter colorFilter) {
        this.mFullPaint.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: protected */
    public final float sin(int i) {
        return (float) Math.sin((((double) i) * 3.141592653589793d) / 180.0d);
    }
}
