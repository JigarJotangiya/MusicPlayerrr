package com.bumptech.glide.load.p036p.p037d;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.p051s.C2194k;

/* renamed from: com.bumptech.glide.load.p.d.f */
/* compiled from: BitmapTransformation */
public abstract class C2017f implements C1794m<Bitmap> {
    /* renamed from: b */
    public final C1902v<Bitmap> mo7751b(Context context, C1902v<Bitmap> vVar, int i, int i2) {
        if (C2194k.m10290t(i, i2)) {
            C1807e f = C1719b.m8591c(context).mo7584f();
            Bitmap bitmap = vVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo8109c(f, bitmap, i, i2);
            return bitmap.equals(c) ? vVar : C2016e.m9488f(c, f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Bitmap mo8109c(C1807e eVar, Bitmap bitmap, int i, int i2);
}
