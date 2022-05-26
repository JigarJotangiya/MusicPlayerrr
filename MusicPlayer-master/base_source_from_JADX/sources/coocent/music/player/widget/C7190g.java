package coocent.music.player.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p036p.p037d.C2017f;
import java.security.MessageDigest;

/* renamed from: coocent.music.player.widget.g */
/* compiled from: GlideRoundTransform */
public class C7190g extends C2017f {

    /* renamed from: b */
    private static float f31825b;

    public C7190g(Context context, int i) {
        f31825b = Resources.getSystem().getDisplayMetrics().density * ((float) i);
    }

    /* renamed from: d */
    private static Bitmap m40868d(C1807e eVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap d = eVar.mo7792d(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (d == null) {
            d = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(d);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        float f = f31825b;
        canvas.drawRoundRect(rectF, f, f, paint);
        return d;
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8109c(C1807e eVar, Bitmap bitmap, int i, int i2) {
        return m40868d(eVar, bitmap);
    }
}
