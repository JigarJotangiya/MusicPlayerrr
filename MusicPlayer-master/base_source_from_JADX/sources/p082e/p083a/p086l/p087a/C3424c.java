package p082e.p083a.p086l.p087a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0534a;

/* renamed from: e.a.l.a.c */
/* compiled from: DrawableWrapper */
public class C3424c extends Drawable implements Drawable.Callback {

    /* renamed from: g */
    private Drawable f10880g;

    public C3424c(Drawable drawable) {
        mo12113b(drawable);
    }

    /* renamed from: a */
    public Drawable mo12112a() {
        return this.f10880g;
    }

    /* renamed from: b */
    public void mo12113b(Drawable drawable) {
        Drawable drawable2 = this.f10880g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f10880g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f10880g.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f10880g.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f10880g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f10880g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f10880g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f10880g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f10880g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f10880g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f10880g.getPadding(rect);
    }

    public int[] getState() {
        return this.f10880g.getState();
    }

    public Region getTransparentRegion() {
        return this.f10880g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0534a.m3282h(this.f10880g);
    }

    public boolean isStateful() {
        return this.f10880g.isStateful();
    }

    public void jumpToCurrentState() {
        this.f10880g.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f10880g.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f10880g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f10880g.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0534a.m3284j(this.f10880g, z);
    }

    public void setChangingConfigurations(int i) {
        this.f10880g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10880g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f10880g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f10880g.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0534a.m3285k(this.f10880g, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0534a.m3286l(this.f10880g, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f10880g.setState(iArr);
    }

    public void setTint(int i) {
        C0534a.m3288n(this.f10880g, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0534a.m3289o(this.f10880g, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0534a.m3290p(this.f10880g, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f10880g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
