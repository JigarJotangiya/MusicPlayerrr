package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.d */
/* compiled from: WrappedDrawableApi14 */
class C0537d extends Drawable implements Drawable.Callback, C0536c, C0535b {

    /* renamed from: m */
    static final PorterDuff.Mode f2740m = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    private int f2741g;

    /* renamed from: h */
    private PorterDuff.Mode f2742h;

    /* renamed from: i */
    private boolean f2743i;

    /* renamed from: j */
    C0539f f2744j;

    /* renamed from: k */
    private boolean f2745k;

    /* renamed from: l */
    Drawable f2746l;

    C0537d(C0539f fVar, Resources resources) {
        this.f2744j = fVar;
        m3296e(resources);
    }

    /* renamed from: d */
    private C0539f m3295d() {
        return new C0539f(this.f2744j);
    }

    /* renamed from: e */
    private void m3296e(Resources resources) {
        Drawable.ConstantState constantState;
        C0539f fVar = this.f2744j;
        if (fVar != null && (constantState = fVar.f2749b) != null) {
            mo3308a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    private boolean m3297f(int[] iArr) {
        if (!mo3310c()) {
            return false;
        }
        C0539f fVar = this.f2744j;
        ColorStateList colorStateList = fVar.f2750c;
        PorterDuff.Mode mode = fVar.f2751d;
        if (colorStateList == null || mode == null) {
            this.f2743i = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2743i && colorForState == this.f2741g && mode == this.f2742h)) {
                setColorFilter(colorForState, mode);
                this.f2741g = colorForState;
                this.f2742h = mode;
                this.f2743i = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo3308a(Drawable drawable) {
        Drawable drawable2 = this.f2746l;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2746l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0539f fVar = this.f2744j;
            if (fVar != null) {
                fVar.f2749b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final Drawable mo3309b() {
        return this.f2746l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3310c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2746l.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0539f fVar = this.f2744j;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f2746l.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0539f fVar = this.f2744j;
        if (fVar == null || !fVar.mo3347a()) {
            return null;
        }
        this.f2744j.f2748a = getChangingConfigurations();
        return this.f2744j;
    }

    public Drawable getCurrent() {
        return this.f2746l.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2746l.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2746l.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return C0534a.m3280f(this.f2746l);
    }

    public int getMinimumHeight() {
        return this.f2746l.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2746l.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2746l.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2746l.getPadding(rect);
    }

    public int[] getState() {
        return this.f2746l.getState();
    }

    public Region getTransparentRegion() {
        return this.f2746l.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0534a.m3282h(this.f2746l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f2744j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo3310c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f2744j
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f2750c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f2746l
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.C0537d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f2746l.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f2745k && super.mutate() == this) {
            this.f2744j = m3295d();
            Drawable drawable = this.f2746l;
            if (drawable != null) {
                drawable.mutate();
            }
            C0539f fVar = this.f2744j;
            if (fVar != null) {
                Drawable drawable2 = this.f2746l;
                fVar.f2749b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2745k = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2746l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return C0534a.m3287m(this.f2746l, i);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2746l.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2746l.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0534a.m3284j(this.f2746l, z);
    }

    public void setChangingConfigurations(int i) {
        this.f2746l.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2746l.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2746l.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2746l.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m3297f(iArr) || this.f2746l.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2744j.f2750c = colorStateList;
        m3297f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2744j.f2751d = mode;
        m3297f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2746l.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    C0537d(Drawable drawable) {
        this.f2744j = m3295d();
        mo3308a(drawable);
    }
}
