package com.bumptech.glide.load.p030n.p031a0;

import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.n.a0.f */
/* compiled from: BitmapPoolAdapter */
public class C1808f implements C1807e {
    /* renamed from: a */
    public void mo7789a(int i) {
    }

    /* renamed from: b */
    public void mo7790b() {
    }

    /* renamed from: c */
    public void mo7791c(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: d */
    public Bitmap mo7792d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: e */
    public Bitmap mo7793e(int i, int i2, Bitmap.Config config) {
        return mo7792d(i, i2, config);
    }
}
