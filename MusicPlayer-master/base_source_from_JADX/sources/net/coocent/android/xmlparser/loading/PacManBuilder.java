package net.coocent.android.xmlparser.loading;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

public class PacManBuilder extends ZLoadingBuilder {
    private static final int FINAL_STATE = 9;
    private static final int MAX_MOUTH_ANGLE = 45;
    private int HorizontalAngle;
    private int mCurrAnimatorState = 0;
    private float mDefaultStartMoveX;
    private long mDurationTime = 333;
    private Paint mFullPaint;
    private float mLastMoveDistance;
    private float mMaxMoveRange;
    private int mMouthAngle;
    private float mMoveDistance;
    private RectF mOuterCircleRectF;

    public PacManBuilder(Context context) {
        init(context);
        initParams(context);
    }

    private void initPaint() {
        Paint paint = new Paint(1);
        this.mFullPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mFullPaint.setColor(-16777216);
        this.mFullPaint.setDither(true);
        this.mFullPaint.setFilterBitmap(true);
        this.mFullPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mFullPaint.setStrokeJoin(Paint.Join.ROUND);
    }

    /* access modifiers changed from: protected */
    public void computeUpdateValue(ValueAnimator valueAnimator, float f) {
        float f2 = this.mMaxMoveRange / ((float) 5);
        int i = this.mCurrAnimatorState;
        if (i < 5) {
            this.HorizontalAngle = 0;
            this.mMoveDistance = this.mLastMoveDistance + (f2 * f);
        } else {
            this.HorizontalAngle = 180;
            this.mMoveDistance = this.mLastMoveDistance - (f2 * f);
        }
        if (i % 2 == 0) {
            this.mMouthAngle = ((int) (f * 45.0f)) + 5;
        } else {
            this.mMouthAngle = ((int) ((1.0f - f) * 45.0f)) + 5;
        }
    }

    /* access modifiers changed from: protected */
    public void initParams(Context context) {
        float allSize = getAllSize() * 0.7f;
        this.mMaxMoveRange = getIntrinsicWidth() + (2.0f * allSize);
        initPaint();
        this.mMouthAngle = 45;
        this.HorizontalAngle = 0;
        this.mDefaultStartMoveX = (-this.mMaxMoveRange) * 0.5f;
        this.mMoveDistance = 0.0f;
        this.mOuterCircleRectF = new RectF(getViewCenterX() - allSize, getViewCenterY() - allSize, getViewCenterX() + allSize, getViewCenterY() + allSize);
    }

    public void onAnimationRepeat(Animator animator) {
        int i = this.mCurrAnimatorState + 1;
        this.mCurrAnimatorState = i;
        if (i > 9) {
            this.mCurrAnimatorState = 0;
        }
        float f = this.mMaxMoveRange / ((float) 5);
        int i2 = this.mCurrAnimatorState;
        if (i2 < 5) {
            this.mLastMoveDistance = f * ((float) i2);
        } else {
            this.mLastMoveDistance = f * ((float) (5 - (i2 % 5)));
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.mDefaultStartMoveX + this.mMoveDistance, 0.0f);
        canvas.rotate((float) this.HorizontalAngle, getViewCenterX(), getViewCenterY());
        RectF rectF = this.mOuterCircleRectF;
        int i = this.mMouthAngle;
        canvas.drawArc(rectF, (float) i, (float) (360 - (i * 2)), true, this.mFullPaint);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void prepareEnd() {
    }

    /* access modifiers changed from: protected */
    public void prepareStart(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.mDurationTime);
    }

    /* access modifiers changed from: protected */
    public void setAlpha(int i) {
        this.mFullPaint.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public void setColorFilter(ColorFilter colorFilter) {
        this.mFullPaint.setColorFilter(colorFilter);
    }
}
