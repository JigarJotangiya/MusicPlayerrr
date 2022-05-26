package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.p051s.C2194k;

/* renamed from: com.bumptech.glide.load.p.d.a0 */
/* compiled from: UnitBitmapDecoder */
public final class C2001a0 implements C1792k<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.p.d.a0$a */
    /* compiled from: UnitBitmapDecoder */
    private static final class C2002a implements C1902v<Bitmap> {

        /* renamed from: g */
        private final Bitmap f7010g;

        C2002a(Bitmap bitmap) {
            this.f7010g = bitmap;
        }

        /* renamed from: a */
        public void mo7965a() {
        }

        /* renamed from: b */
        public Bitmap get() {
            return this.f7010g;
        }

        /* renamed from: c */
        public int mo7967c() {
            return C2194k.m10278h(this.f7010g);
        }

        /* renamed from: d */
        public Class<Bitmap> mo7968d() {
            return Bitmap.class;
        }
    }

    /* renamed from: c */
    public C1902v<Bitmap> mo7749b(Bitmap bitmap, int i, int i2, C1790i iVar) {
        return new C2002a(bitmap);
    }

    /* renamed from: d */
    public boolean mo7748a(Bitmap bitmap, C1790i iVar) {
        return true;
    }
}
