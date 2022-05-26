package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: androidx.transition.h0 */
/* compiled from: ViewOverlayApi18 */
class C1124h0 implements C1127i0 {

    /* renamed from: a */
    private final ViewOverlay f4689a;

    C1124h0(View view) {
        this.f4689a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo6034a(Drawable drawable) {
        this.f4689a.add(drawable);
    }

    /* renamed from: b */
    public void mo6035b(Drawable drawable) {
        this.f4689a.remove(drawable);
    }
}
