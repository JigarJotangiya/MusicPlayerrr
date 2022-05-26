package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p030n.C1897r;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.C2194k;

/* renamed from: com.bumptech.glide.load.p.d.e */
/* compiled from: BitmapResource */
public class C2016e implements C1902v<Bitmap>, C1897r {

    /* renamed from: g */
    private final Bitmap f7026g;

    /* renamed from: h */
    private final C1807e f7027h;

    public C2016e(Bitmap bitmap, C1807e eVar) {
        C2193j.m10270e(bitmap, "Bitmap must not be null");
        this.f7026g = bitmap;
        C2193j.m10270e(eVar, "BitmapPool must not be null");
        this.f7027h = eVar;
    }

    /* renamed from: f */
    public static C2016e m9488f(Bitmap bitmap, C1807e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C2016e(bitmap, eVar);
    }

    /* renamed from: a */
    public void mo7965a() {
        this.f7027h.mo7791c(this.f7026g);
    }

    /* renamed from: b */
    public void mo7989b() {
        this.f7026g.prepareToDraw();
    }

    /* renamed from: c */
    public int mo7967c() {
        return C2194k.m10278h(this.f7026g);
    }

    /* renamed from: d */
    public Class<Bitmap> mo7968d() {
        return Bitmap.class;
    }

    /* renamed from: e */
    public Bitmap get() {
        return this.f7026g;
    }
}
