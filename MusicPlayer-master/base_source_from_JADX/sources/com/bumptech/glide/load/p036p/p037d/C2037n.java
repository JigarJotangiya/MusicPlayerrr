package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p030n.p031a0.C1808f;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.p.d.n */
/* compiled from: DrawableToBitmapConverter */
final class C2037n {

    /* renamed from: a */
    private static final C1807e f7058a = new C2038a();

    /* renamed from: com.bumptech.glide.load.p.d.n$a */
    /* compiled from: DrawableToBitmapConverter */
    class C2038a extends C1808f {
        C2038a() {
        }

        /* renamed from: c */
        public void mo7791c(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static C1902v<Bitmap> m9576a(C1807e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m9577b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f7058a;
        }
        return C2016e.m9488f(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m9577b(C1807e eVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock f = C2054z.m9642f();
            f.lock();
            Bitmap d = eVar.mo7792d(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return d;
            } finally {
                f.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
