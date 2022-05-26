package com.bumptech.glide.load.p036p.p039f;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p030n.C1902v;

/* renamed from: com.bumptech.glide.load.p.f.c */
/* compiled from: NonOwnedDrawableResource */
final class C2061c extends C2060b<Drawable> {
    private C2061c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: f */
    static C1902v<Drawable> m9666f(Drawable drawable) {
        if (drawable != null) {
            return new C2061c(drawable);
        }
        return null;
    }

    /* renamed from: a */
    public void mo7965a() {
    }

    /* renamed from: c */
    public int mo7967c() {
        return Math.max(1, this.f7102g.getIntrinsicWidth() * this.f7102g.getIntrinsicHeight() * 4);
    }

    /* renamed from: d */
    public Class<Drawable> mo7968d() {
        return this.f7102g.getClass();
    }
}
