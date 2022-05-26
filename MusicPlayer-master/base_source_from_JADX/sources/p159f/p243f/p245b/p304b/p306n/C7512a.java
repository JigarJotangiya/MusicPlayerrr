package p159f.p243f.p245b.p304b.p306n;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: f.f.b.b.n.a */
/* compiled from: CanvasCompat */
public class C7512a {
    /* renamed from: a */
    public static int m41976a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
