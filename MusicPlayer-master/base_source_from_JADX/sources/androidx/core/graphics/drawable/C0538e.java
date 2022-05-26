package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.e */
/* compiled from: WrappedDrawableApi21 */
class C0538e extends C0537d {

    /* renamed from: n */
    private static Method f2747n;

    C0538e(Drawable drawable) {
        super(drawable);
        m3301g();
    }

    /* renamed from: g */
    private void m3301g() {
        if (f2747n == null) {
            try {
                f2747n = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3310c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2746l;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f2746l.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f2746l.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2746l;
        if (!(drawable == null || (method = f2747n) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f2746l.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2746l.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo3310c()) {
            super.setTint(i);
        } else {
            this.f2746l.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo3310c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2746l.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo3310c()) {
            super.setTintMode(mode);
        } else {
            this.f2746l.setTintMode(mode);
        }
    }

    C0538e(C0539f fVar, Resources resources) {
        super(fVar, resources);
        m3301g();
    }
}
