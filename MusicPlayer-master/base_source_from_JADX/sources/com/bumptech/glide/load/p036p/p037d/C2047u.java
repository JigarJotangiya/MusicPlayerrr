package com.bumptech.glide.load.p036p.p037d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.p030n.C1897r;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.p051s.C2193j;

/* renamed from: com.bumptech.glide.load.p.d.u */
/* compiled from: LazyBitmapDrawableResource */
public final class C2047u implements C1902v<BitmapDrawable>, C1897r {

    /* renamed from: g */
    private final Resources f7080g;

    /* renamed from: h */
    private final C1902v<Bitmap> f7081h;

    private C2047u(Resources resources, C1902v<Bitmap> vVar) {
        C2193j.m10269d(resources);
        this.f7080g = resources;
        C2193j.m10269d(vVar);
        this.f7081h = vVar;
    }

    /* renamed from: f */
    public static C1902v<BitmapDrawable> m9613f(Resources resources, C1902v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new C2047u(resources, vVar);
    }

    /* renamed from: a */
    public void mo7965a() {
        this.f7081h.mo7965a();
    }

    /* renamed from: b */
    public void mo7989b() {
        C1902v<Bitmap> vVar = this.f7081h;
        if (vVar instanceof C1897r) {
            ((C1897r) vVar).mo7989b();
        }
    }

    /* renamed from: c */
    public int mo7967c() {
        return this.f7081h.mo7967c();
    }

    /* renamed from: d */
    public Class<BitmapDrawable> mo7968d() {
        return BitmapDrawable.class;
    }

    /* renamed from: e */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f7080g, this.f7081h.get());
    }
}
