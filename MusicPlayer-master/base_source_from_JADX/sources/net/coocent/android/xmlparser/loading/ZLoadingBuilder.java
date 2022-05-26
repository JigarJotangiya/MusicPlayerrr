package net.coocent.android.xmlparser.loading;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

public abstract class ZLoadingBuilder implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    protected static final long ANIMATION_DURATION = 1333;
    protected static final long ANIMATION_START_DELAY = 333;
    protected static final float DEFAULT_SIZE = 56.0f;
    private float mAllSize;
    private Drawable.Callback mCallback;
    private long mDuration;
    private ValueAnimator mFloatValueAnimator;
    private float mViewHeight;
    private float mViewWidth;

    protected static float dip2px(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    private void initAnimators() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.mFloatValueAnimator = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.mFloatValueAnimator.setDuration(this.mDuration);
        this.mFloatValueAnimator.setStartDelay(ANIMATION_START_DELAY);
        this.mFloatValueAnimator.setInterpolator(new LinearInterpolator());
    }

    private void invalidateSelf() {
        Drawable.Callback callback = this.mCallback;
        if (callback != null) {
            callback.invalidateDrawable((Drawable) null);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void computeUpdateValue(ValueAnimator valueAnimator, float f);

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas) {
        onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final float getAllSize() {
        return this.mAllSize;
    }

    /* access modifiers changed from: protected */
    public float getIntrinsicHeight() {
        return this.mViewHeight;
    }

    /* access modifiers changed from: protected */
    public float getIntrinsicWidth() {
        return this.mViewWidth;
    }

    /* access modifiers changed from: protected */
    public final float getViewCenterX() {
        return getIntrinsicWidth() * 0.5f;
    }

    /* access modifiers changed from: protected */
    public final float getViewCenterY() {
        return getIntrinsicHeight() * 0.5f;
    }

    public void init(Context context) {
        this.mAllSize = dip2px(context, 18.0f);
        this.mViewWidth = dip2px(context, DEFAULT_SIZE);
        this.mViewHeight = dip2px(context, DEFAULT_SIZE);
        this.mDuration = ANIMATION_DURATION;
        initAnimators();
    }

    /* access modifiers changed from: protected */
    public abstract void initParams(Context context);

    /* access modifiers changed from: package-private */
    public boolean isRunning() {
        return this.mFloatValueAnimator.isRunning();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        computeUpdateValue(valueAnimator, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public abstract void onDraw(Canvas canvas);

    /* access modifiers changed from: protected */
    public abstract void prepareEnd();

    /* access modifiers changed from: protected */
    public abstract void prepareStart(ValueAnimator valueAnimator);

    /* access modifiers changed from: protected */
    public abstract void setAlpha(int i);

    /* access modifiers changed from: package-private */
    public void setCallback(Drawable.Callback callback) {
        this.mCallback = callback;
    }

    /* access modifiers changed from: protected */
    public abstract void setColorFilter(ColorFilter colorFilter);

    /* access modifiers changed from: package-private */
    public void start() {
        if (!this.mFloatValueAnimator.isStarted()) {
            this.mFloatValueAnimator.addUpdateListener(this);
            this.mFloatValueAnimator.addListener(this);
            this.mFloatValueAnimator.setRepeatCount(-1);
            this.mFloatValueAnimator.setDuration(this.mDuration);
            prepareStart(this.mFloatValueAnimator);
            this.mFloatValueAnimator.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void stop() {
        this.mFloatValueAnimator.removeAllUpdateListeners();
        this.mFloatValueAnimator.removeAllListeners();
        this.mFloatValueAnimator.setRepeatCount(0);
        this.mFloatValueAnimator.setDuration(0);
        prepareEnd();
        this.mFloatValueAnimator.end();
    }
}
