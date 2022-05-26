package p453me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.appcompat.widget.C0279g0;
import p453me.zhanghai.android.materialprogressbar.internal.DrawableCompat;

/* renamed from: me.zhanghai.android.materialprogressbar.MaterialProgressBar */
public class MaterialProgressBar extends ProgressBar {
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_DYNAMIC = 1;
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_NORMAL = 0;
    public static final int PROGRESS_STYLE_CIRCULAR = 0;
    public static final int PROGRESS_STYLE_HORIZONTAL = 1;
    private static final String TAG = MaterialProgressBar.class.getSimpleName();
    private int mProgressStyle;
    private TintInfo mProgressTintInfo = new TintInfo();
    private boolean mSuperInitialized = true;

    /* renamed from: me.zhanghai.android.materialprogressbar.MaterialProgressBar$TintInfo */
    private static class TintInfo {
        public boolean mHasIndeterminateTint;
        public boolean mHasIndeterminateTintMode;
        public boolean mHasProgressBackgroundTint;
        public boolean mHasProgressBackgroundTintMode;
        public boolean mHasProgressTint;
        public boolean mHasProgressTintMode;
        public boolean mHasSecondaryProgressTint;
        public boolean mHasSecondaryProgressTintMode;
        public ColorStateList mIndeterminateTint;
        public PorterDuff.Mode mIndeterminateTintMode;
        public ColorStateList mProgressBackgroundTint;
        public PorterDuff.Mode mProgressBackgroundTintMode;
        public ColorStateList mProgressTint;
        public PorterDuff.Mode mProgressTintMode;
        public ColorStateList mSecondaryProgressTint;
        public PorterDuff.Mode mSecondaryProgressTintMode;

        private TintInfo() {
        }
    }

    public MaterialProgressBar(Context context) {
        super(context);
        init((AttributeSet) null, 0, 0);
    }

    private void applyIndeterminateTint() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            TintInfo tintInfo = this.mProgressTintInfo;
            if (tintInfo.mHasIndeterminateTint || tintInfo.mHasIndeterminateTintMode) {
                indeterminateDrawable.mutate();
                TintInfo tintInfo2 = this.mProgressTintInfo;
                applyTintForDrawable(indeterminateDrawable, tintInfo2.mIndeterminateTint, tintInfo2.mHasIndeterminateTint, tintInfo2.mIndeterminateTintMode, tintInfo2.mHasIndeterminateTintMode);
            }
        }
    }

    private void applyPrimaryProgressTint() {
        Drawable tintTargetFromProgressDrawable;
        if (getProgressDrawable() != null) {
            TintInfo tintInfo = this.mProgressTintInfo;
            if ((tintInfo.mHasProgressTint || tintInfo.mHasProgressTintMode) && (tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(16908301, true)) != null) {
                TintInfo tintInfo2 = this.mProgressTintInfo;
                applyTintForDrawable(tintTargetFromProgressDrawable, tintInfo2.mProgressTint, tintInfo2.mHasProgressTint, tintInfo2.mProgressTintMode, tintInfo2.mHasProgressTintMode);
            }
        }
    }

    private void applyProgressBackgroundTint() {
        Drawable tintTargetFromProgressDrawable;
        if (getProgressDrawable() != null) {
            TintInfo tintInfo = this.mProgressTintInfo;
            if ((tintInfo.mHasProgressBackgroundTint || tintInfo.mHasProgressBackgroundTintMode) && (tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(16908288, false)) != null) {
                TintInfo tintInfo2 = this.mProgressTintInfo;
                applyTintForDrawable(tintTargetFromProgressDrawable, tintInfo2.mProgressBackgroundTint, tintInfo2.mHasProgressBackgroundTint, tintInfo2.mProgressBackgroundTintMode, tintInfo2.mHasProgressBackgroundTintMode);
            }
        }
    }

    private void applyProgressTints() {
        if (getProgressDrawable() != null) {
            applyPrimaryProgressTint();
            applyProgressBackgroundTint();
            applySecondaryProgressTint();
        }
    }

    private void applySecondaryProgressTint() {
        Drawable tintTargetFromProgressDrawable;
        if (getProgressDrawable() != null) {
            TintInfo tintInfo = this.mProgressTintInfo;
            if ((tintInfo.mHasSecondaryProgressTint || tintInfo.mHasSecondaryProgressTintMode) && (tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(16908303, false)) != null) {
                TintInfo tintInfo2 = this.mProgressTintInfo;
                applyTintForDrawable(tintTargetFromProgressDrawable, tintInfo2.mSecondaryProgressTint, tintInfo2.mHasSecondaryProgressTint, tintInfo2.mSecondaryProgressTintMode, tintInfo2.mHasSecondaryProgressTintMode);
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void applyTintForDrawable(Drawable drawable, ColorStateList colorStateList, boolean z, PorterDuff.Mode mode, boolean z2) {
        if (z || z2) {
            if (z) {
                if (drawable instanceof TintableDrawable) {
                    ((TintableDrawable) drawable).setTintList(colorStateList);
                } else {
                    Log.w(TAG, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.setTintList(colorStateList);
                    }
                }
            }
            if (z2) {
                if (drawable instanceof TintableDrawable) {
                    ((TintableDrawable) drawable).setTintMode(mode);
                } else {
                    Log.w(TAG, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.setTintMode(mode);
                    }
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    private void fixCanvasScalingAndColorFilterWhenHardwareAccelerated() {
        if (Build.VERSION.SDK_INT < 21 && isHardwareAccelerated() && getLayerType() != 1) {
            setLayerType(1, (Paint) null);
        }
    }

    private Drawable getTintTargetFromProgressDrawable(int i, boolean z) {
        Drawable progressDrawable = getProgressDrawable();
        Drawable drawable = null;
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        if (progressDrawable instanceof LayerDrawable) {
            drawable = ((LayerDrawable) progressDrawable).findDrawableByLayerId(i);
        }
        return (drawable != null || !z) ? drawable : progressDrawable;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        C0279g0 v = C0279g0.m1627v(context, attributeSet, C9352R.styleable.MaterialProgressBar, i, i2);
        this.mProgressStyle = v.mo1986k(C9352R.styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean a = v.mo1976a(C9352R.styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean a2 = v.mo1976a(C9352R.styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean a3 = v.mo1976a(C9352R.styleable.MaterialProgressBar_mpb_showProgressBackground, this.mProgressStyle == 1);
        int k = v.mo1986k(C9352R.styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        int i3 = C9352R.styleable.MaterialProgressBar_mpb_progressTint;
        if (v.mo1994s(i3)) {
            this.mProgressTintInfo.mProgressTint = v.mo1978c(i3);
            this.mProgressTintInfo.mHasProgressTint = true;
        }
        int i4 = C9352R.styleable.MaterialProgressBar_mpb_progressTintMode;
        if (v.mo1994s(i4)) {
            this.mProgressTintInfo.mProgressTintMode = DrawableCompat.parseTintMode(v.mo1986k(i4, -1), (PorterDuff.Mode) null);
            this.mProgressTintInfo.mHasProgressTintMode = true;
        }
        int i5 = C9352R.styleable.MaterialProgressBar_mpb_secondaryProgressTint;
        if (v.mo1994s(i5)) {
            this.mProgressTintInfo.mSecondaryProgressTint = v.mo1978c(i5);
            this.mProgressTintInfo.mHasSecondaryProgressTint = true;
        }
        int i6 = C9352R.styleable.MaterialProgressBar_mpb_secondaryProgressTintMode;
        if (v.mo1994s(i6)) {
            this.mProgressTintInfo.mSecondaryProgressTintMode = DrawableCompat.parseTintMode(v.mo1986k(i6, -1), (PorterDuff.Mode) null);
            this.mProgressTintInfo.mHasSecondaryProgressTintMode = true;
        }
        int i7 = C9352R.styleable.MaterialProgressBar_mpb_progressBackgroundTint;
        if (v.mo1994s(i7)) {
            this.mProgressTintInfo.mProgressBackgroundTint = v.mo1978c(i7);
            this.mProgressTintInfo.mHasProgressBackgroundTint = true;
        }
        int i8 = C9352R.styleable.MaterialProgressBar_mpb_progressBackgroundTintMode;
        if (v.mo1994s(i8)) {
            this.mProgressTintInfo.mProgressBackgroundTintMode = DrawableCompat.parseTintMode(v.mo1986k(i8, -1), (PorterDuff.Mode) null);
            this.mProgressTintInfo.mHasProgressBackgroundTintMode = true;
        }
        int i9 = C9352R.styleable.MaterialProgressBar_mpb_indeterminateTint;
        if (v.mo1994s(i9)) {
            this.mProgressTintInfo.mIndeterminateTint = v.mo1978c(i9);
            this.mProgressTintInfo.mHasIndeterminateTint = true;
        }
        int i10 = C9352R.styleable.MaterialProgressBar_mpb_indeterminateTintMode;
        if (v.mo1994s(i10)) {
            this.mProgressTintInfo.mIndeterminateTintMode = DrawableCompat.parseTintMode(v.mo1986k(i10, -1), (PorterDuff.Mode) null);
            this.mProgressTintInfo.mHasIndeterminateTintMode = true;
        }
        v.mo1995w();
        int i11 = this.mProgressStyle;
        if (i11 == 0) {
            if ((isIndeterminate() || a) && !isInEditMode()) {
                setIndeterminateDrawable(new IndeterminateCircularProgressDrawable(context));
            }
            if (!isIndeterminate() || a) {
                setProgressDrawable(new CircularProgressDrawable(k, context));
            }
        } else if (i11 == 1) {
            if ((isIndeterminate() || a) && !isInEditMode()) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!isIndeterminate() || a) {
                setProgressDrawable(new HorizontalProgressDrawable(context));
            }
        } else {
            throw new IllegalArgumentException("Unknown progress style: " + this.mProgressStyle);
        }
        setUseIntrinsicPadding(a2);
        setShowProgressBackground(a3);
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public ColorStateList getIndeterminateTintList() {
        return this.mProgressTintInfo.mIndeterminateTint;
    }

    public PorterDuff.Mode getIndeterminateTintMode() {
        return this.mProgressTintInfo.mIndeterminateTintMode;
    }

    public ColorStateList getProgressBackgroundTintList() {
        return this.mProgressTintInfo.mProgressBackgroundTint;
    }

    public PorterDuff.Mode getProgressBackgroundTintMode() {
        return this.mProgressTintInfo.mProgressBackgroundTintMode;
    }

    public int getProgressStyle() {
        return this.mProgressStyle;
    }

    public ColorStateList getProgressTintList() {
        return this.mProgressTintInfo.mProgressTint;
    }

    public PorterDuff.Mode getProgressTintMode() {
        return this.mProgressTintInfo.mProgressTintMode;
    }

    public ColorStateList getSecondaryProgressTintList() {
        return this.mProgressTintInfo.mSecondaryProgressTint;
    }

    public PorterDuff.Mode getSecondaryProgressTintMode() {
        return this.mProgressTintInfo.mSecondaryProgressTintMode;
    }

    public boolean getShowProgressBackground() {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof ShowBackgroundDrawable) {
            return ((ShowBackgroundDrawable) currentDrawable).getShowBackground();
        }
        return false;
    }

    public boolean getUseIntrinsicPadding() {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof IntrinsicPaddingDrawable) {
            return ((IntrinsicPaddingDrawable) currentDrawable).getUseIntrinsicPadding();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fixCanvasScalingAndColorFilterWhenHardwareAccelerated();
    }

    public synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        if (this.mSuperInitialized && !(getCurrentDrawable() instanceof MaterialProgressDrawable)) {
            Log.w(TAG, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.mProgressTintInfo != null) {
            applyIndeterminateTint();
        }
    }

    public void setIndeterminateTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mIndeterminateTint = colorStateList;
        tintInfo.mHasIndeterminateTint = true;
        applyIndeterminateTint();
    }

    public void setIndeterminateTintMode(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mIndeterminateTintMode = mode;
        tintInfo.mHasIndeterminateTintMode = true;
        applyIndeterminateTint();
    }

    public void setProgressBackgroundTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressBackgroundTint = colorStateList;
        tintInfo.mHasProgressBackgroundTint = true;
        applyProgressBackgroundTint();
    }

    public void setProgressBackgroundTintMode(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressBackgroundTintMode = mode;
        tintInfo.mHasProgressBackgroundTintMode = true;
        applyProgressBackgroundTint();
    }

    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.mProgressTintInfo != null) {
            applyProgressTints();
        }
    }

    public void setProgressTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressTint = colorStateList;
        tintInfo.mHasProgressTint = true;
        applyPrimaryProgressTint();
    }

    public void setProgressTintMode(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressTintMode = mode;
        tintInfo.mHasProgressTintMode = true;
        applyPrimaryProgressTint();
    }

    public void setSecondaryProgressTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mSecondaryProgressTint = colorStateList;
        tintInfo.mHasSecondaryProgressTint = true;
        applySecondaryProgressTint();
    }

    public void setSecondaryProgressTintMode(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mSecondaryProgressTintMode = mode;
        tintInfo.mHasSecondaryProgressTintMode = true;
        applySecondaryProgressTint();
    }

    public void setShowProgressBackground(boolean z) {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable) currentDrawable).setShowBackground(z);
        }
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable) indeterminateDrawable).setShowBackground(z);
        }
    }

    public void setUseIntrinsicPadding(boolean z) {
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable) currentDrawable).setUseIntrinsicPadding(z);
        }
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable) indeterminateDrawable).setUseIntrinsicPadding(z);
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0, 0);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }
}
