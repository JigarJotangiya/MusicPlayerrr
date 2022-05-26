package net.coocent.android.xmlparser.loading;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;

public class TextBuilder extends ZLoadingBuilder {
    private static final int BASE_ALPHA = 100;
    private static final String DEFAULT_TEXT = "Zyao89";
    private static final long DURATION_TIME = 333;
    private int mDrawTextCount = 0;
    private String mTextChars;
    private Paint mTextPaint;

    public TextBuilder(Context context) {
        init(context);
        initParams(context);
    }

    private boolean isNotEmpty() {
        String str = this.mTextChars;
        return str != null && !str.isEmpty();
    }

    /* access modifiers changed from: protected */
    public void computeUpdateValue(ValueAnimator valueAnimator, float f) {
        this.mTextPaint.setAlpha(((int) (f * 155.0f)) + 100);
    }

    /* access modifiers changed from: protected */
    public void initParams(Context context) {
        Paint paint = new Paint(1);
        this.mTextPaint = paint;
        paint.setColor(-16777216);
        this.mTextPaint.setDither(true);
        this.mTextPaint.setFilterBitmap(true);
        this.mTextPaint.setTextSize(56.0f);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setTextAlign(Paint.Align.LEFT);
        this.mTextChars = DEFAULT_TEXT;
    }

    public void onAnimationRepeat(Animator animator) {
        if (isNotEmpty()) {
            int i = this.mDrawTextCount + 1;
            this.mDrawTextCount = i;
            if (i > this.mTextChars.toCharArray().length) {
                this.mDrawTextCount = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (isNotEmpty()) {
            int length = this.mTextChars.toCharArray().length;
            float measureText = this.mTextPaint.measureText(this.mTextChars, 0, length);
            Paint paint = new Paint(this.mTextPaint);
            paint.setAlpha(100);
            float f = measureText / 2.0f;
            canvas.drawText(this.mTextChars, 0, length, getViewCenterX() - f, getViewCenterY(), paint);
            canvas.drawText(this.mTextChars, 0, this.mDrawTextCount, getViewCenterX() - f, getViewCenterY(), this.mTextPaint);
        }
    }

    /* access modifiers changed from: protected */
    public void prepareEnd() {
    }

    /* access modifiers changed from: protected */
    public void prepareStart(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(DURATION_TIME);
        valueAnimator.setInterpolator(new AccelerateInterpolator());
    }

    /* access modifiers changed from: protected */
    public void setAlpha(int i) {
        this.mTextPaint.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public void setColorFilter(ColorFilter colorFilter) {
        this.mTextPaint.setColorFilter(colorFilter);
    }

    public void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            float measureText = this.mTextPaint.measureText(str);
            if (measureText >= getIntrinsicWidth()) {
                this.mTextPaint.setTextSize(getIntrinsicWidth() / (measureText / 56.0f));
            }
            this.mTextChars = str;
        }
    }
}
