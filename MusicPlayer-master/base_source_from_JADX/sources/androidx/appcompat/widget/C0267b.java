package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
/* compiled from: ActionBarBackgroundDrawable */
class C0267b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1255a;

    public C0267b(ActionBarContainer actionBarContainer) {
        this.f1255a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1255a;
        if (actionBarContainer.f797n) {
            Drawable drawable = actionBarContainer.f796m;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f794k;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1255a;
        Drawable drawable3 = actionBarContainer2.f795l;
        if (drawable3 != null && actionBarContainer2.f798o) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1255a;
        if (actionBarContainer.f797n) {
            Drawable drawable = actionBarContainer.f796m;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f794k;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
