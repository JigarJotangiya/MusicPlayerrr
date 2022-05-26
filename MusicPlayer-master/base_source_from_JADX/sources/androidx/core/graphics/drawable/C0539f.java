package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: androidx.core.graphics.drawable.f */
/* compiled from: WrappedDrawableState */
final class C0539f extends Drawable.ConstantState {

    /* renamed from: a */
    int f2748a;

    /* renamed from: b */
    Drawable.ConstantState f2749b;

    /* renamed from: c */
    ColorStateList f2750c = null;

    /* renamed from: d */
    PorterDuff.Mode f2751d = C0537d.f2740m;

    C0539f(C0539f fVar) {
        if (fVar != null) {
            this.f2748a = fVar.f2748a;
            this.f2749b = fVar.f2749b;
            this.f2750c = fVar.f2750c;
            this.f2751d = fVar.f2751d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3347a() {
        return this.f2749b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f2748a;
        Drawable.ConstantState constantState = this.f2749b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0538e(this, resources);
        }
        return new C0537d(this, resources);
    }
}
