package p360h.p361a.p362a.p363a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import java.security.MessageDigest;
import p360h.p361a.p362a.p363a.p364c.C8357a;

/* renamed from: h.a.a.a.b */
/* compiled from: BlurTransformation */
public class C8356b extends C8355a {

    /* renamed from: d */
    private static int f34818d = 25;

    /* renamed from: e */
    private static int f34819e = 1;

    /* renamed from: b */
    private int f34820b;

    /* renamed from: c */
    private int f34821c;

    public C8356b() {
        this(f34818d, f34819e);
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.BlurTransformation.1" + this.f34820b + this.f34821c).getBytes(C1786g.f6570a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Bitmap mo30293d(Context context, C1807e eVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.f34821c;
        Bitmap d = eVar.mo7792d(width / i3, height / i3, Bitmap.Config.ARGB_8888);
        mo30292c(bitmap, d);
        Canvas canvas = new Canvas(d);
        int i4 = this.f34821c;
        canvas.scale(1.0f / ((float) i4), 1.0f / ((float) i4));
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return C8357a.m46364a(d, this.f34820b, true);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8356b) {
            C8356b bVar = (C8356b) obj;
            return bVar.f34820b == this.f34820b && bVar.f34821c == this.f34821c;
        }
    }

    public int hashCode() {
        return 737513610 + (this.f34820b * 1000) + (this.f34821c * 10);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.f34820b + ", sampling=" + this.f34821c + ")";
    }

    public C8356b(int i, int i2) {
        this.f34820b = i;
        this.f34821c = i2;
    }
}
