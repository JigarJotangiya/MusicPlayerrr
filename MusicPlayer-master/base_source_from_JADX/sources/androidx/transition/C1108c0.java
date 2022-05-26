package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: androidx.transition.c0 */
/* compiled from: ViewGroupOverlayApi18 */
class C1108c0 implements C1110d0 {

    /* renamed from: a */
    private final ViewGroupOverlay f4653a;

    C1108c0(ViewGroup viewGroup) {
        this.f4653a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo6034a(Drawable drawable) {
        this.f4653a.add(drawable);
    }

    /* renamed from: b */
    public void mo6035b(Drawable drawable) {
        this.f4653a.remove(drawable);
    }

    /* renamed from: c */
    public void mo6031c(View view) {
        this.f4653a.add(view);
    }

    /* renamed from: d */
    public void mo6032d(View view) {
        this.f4653a.remove(view);
    }
}
