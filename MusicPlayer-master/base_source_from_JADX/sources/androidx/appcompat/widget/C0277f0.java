package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.f0 */
/* compiled from: TintResources */
class C0277f0 extends C0327x {

    /* renamed from: b */
    private final WeakReference<Context> f1292b;

    public C0277f0(Context context, Resources resources) {
        super(resources);
        this.f1292b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1292b.get();
        if (!(drawable == null || context == null)) {
            C0320w.m1882h().mo2154x(context, i, drawable);
        }
        return drawable;
    }
}
