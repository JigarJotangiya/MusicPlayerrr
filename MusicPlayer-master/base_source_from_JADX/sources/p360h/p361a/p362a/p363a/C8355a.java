package p360h.p361a.p362a.p363a;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p036p.p037d.C2016e;
import com.bumptech.glide.p051s.C2194k;

/* renamed from: h.a.a.a.a */
/* compiled from: BitmapTransformation */
public abstract class C8355a implements C1794m<Bitmap> {
    /* renamed from: b */
    public final C1902v<Bitmap> mo7751b(Context context, C1902v<Bitmap> vVar, int i, int i2) {
        if (C2194k.m10290t(i, i2)) {
            C1807e f = C1719b.m8591c(context).mo7584f();
            Bitmap bitmap = vVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            int i3 = i;
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap d = mo30293d(context.getApplicationContext(), f, bitmap, i3, i2);
            return bitmap.equals(d) ? vVar : C2016e.m9488f(d, f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo30292c(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Bitmap mo30293d(Context context, C1807e eVar, Bitmap bitmap, int i, int i2);
}
