package com.bumptech.glide.load.p036p.p039f;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p030n.C1897r;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p036p.p041h.C2070c;
import com.bumptech.glide.p051s.C2193j;

/* renamed from: com.bumptech.glide.load.p.f.b */
/* compiled from: DrawableResource */
public abstract class C2060b<T extends Drawable> implements C1902v<T>, C1897r {

    /* renamed from: g */
    protected final T f7102g;

    public C2060b(T t) {
        C2193j.m10269d(t);
        this.f7102g = (Drawable) t;
    }

    /* renamed from: b */
    public void mo7989b() {
        T t = this.f7102g;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C2070c) {
            ((C2070c) t).mo8188e().prepareToDraw();
        }
    }

    /* renamed from: e */
    public final T get() {
        Drawable.ConstantState constantState = this.f7102g.getConstantState();
        if (constantState == null) {
            return this.f7102g;
        }
        return constantState.newDrawable();
    }
}
