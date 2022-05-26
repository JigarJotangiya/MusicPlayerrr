package p453me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import p082e.p109h.p110h.C3621a;
import p453me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable;
import p453me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;
import p453me.zhanghai.android.materialprogressbar.TintableDrawable;
import p453me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

/* renamed from: me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable */
class BaseProgressLayerDrawable<ProgressDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable, BackgroundDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable> extends LayerDrawable implements IntrinsicPaddingDrawable, MaterialProgressDrawable, ShowBackgroundDrawable, TintableDrawable {
    private float mBackgroundAlpha;
    private BackgroundDrawableType mBackgroundDrawable = ((IntrinsicPaddingDrawable) getDrawable(0));
    private ProgressDrawableType mProgressDrawable;
    private ProgressDrawableType mSecondaryProgressDrawable;

    public BaseProgressLayerDrawable(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes(16842803, 0.0f, context);
        setId(0, 16908288);
        setId(1, 16908303);
        this.mSecondaryProgressDrawable = (IntrinsicPaddingDrawable) getDrawable(1);
        setId(2, 16908301);
        this.mProgressDrawable = (IntrinsicPaddingDrawable) getDrawable(2);
        setTint(ThemeUtils.getColorFromAttrRes(C9352R.attr.colorControlActivated, -16777216, context));
    }

    public boolean getShowBackground() {
        return ((ShowBackgroundDrawable) this.mBackgroundDrawable).getShowBackground();
    }

    public boolean getUseIntrinsicPadding() {
        return this.mBackgroundDrawable.getUseIntrinsicPadding();
    }

    public void setShowBackground(boolean z) {
        if (((ShowBackgroundDrawable) this.mBackgroundDrawable).getShowBackground() != z) {
            ((ShowBackgroundDrawable) this.mBackgroundDrawable).setShowBackground(z);
            ((ShowBackgroundDrawable) this.mSecondaryProgressDrawable).setShowBackground(!z);
        }
    }

    @SuppressLint({"NewApi"})
    public void setTint(int i) {
        int m = C3621a.m15595m(i, Math.round(((float) Color.alpha(i)) * this.mBackgroundAlpha));
        ((TintableDrawable) this.mBackgroundDrawable).setTint(m);
        ((TintableDrawable) this.mSecondaryProgressDrawable).setTint(m);
        ((TintableDrawable) this.mProgressDrawable).setTint(i);
    }

    @SuppressLint({"NewApi"})
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateList2 = colorStateList.withAlpha(Math.round(this.mBackgroundAlpha * 255.0f));
        } else {
            colorStateList2 = null;
        }
        ((TintableDrawable) this.mBackgroundDrawable).setTintList(colorStateList2);
        ((TintableDrawable) this.mSecondaryProgressDrawable).setTintList(colorStateList2);
        ((TintableDrawable) this.mProgressDrawable).setTintList(colorStateList);
    }

    @SuppressLint({"NewApi"})
    public void setTintMode(PorterDuff.Mode mode) {
        ((TintableDrawable) this.mBackgroundDrawable).setTintMode(mode);
        ((TintableDrawable) this.mSecondaryProgressDrawable).setTintMode(mode);
        ((TintableDrawable) this.mProgressDrawable).setTintMode(mode);
    }

    public void setUseIntrinsicPadding(boolean z) {
        this.mBackgroundDrawable.setUseIntrinsicPadding(z);
        this.mSecondaryProgressDrawable.setUseIntrinsicPadding(z);
        this.mProgressDrawable.setUseIntrinsicPadding(z);
    }
}
